/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsub.v1;

import static com.google.common.util.concurrent.MoreExecutors.directExecutor;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.core.SettableApiFuture;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

interface CancellableRunnable extends Runnable {
  void cancel(Throwable e);
}

/**
 * An executor service that runs the tasks with the same key sequentially. The tasks with the same
 * key will be run only when its predecessor has been completed while tasks with different keys can
 * be run in parallel.
 */
final class SequentialExecutorService {

  // This class is not directly usable.
  private SequentialExecutorService() {}

  /**
   * This Executor takes a serial stream of string keys and {@code Runnable} tasks, and runs the
   * tasks with the same key sequentially. Tasks with the same key will be run only when its
   * predecessor has been completed while tasks with different keys can be run in parallel.
   */
  private abstract static class SequentialExecutor {
    // Maps keys to tasks.
    protected final Map<String, Queue<Runnable>> tasksByKey;
    protected final Executor executor;

    private SequentialExecutor(Executor executor) {
      this.executor = executor;
      this.tasksByKey = new HashMap<>();
    }

    protected void execute(final String key, Runnable task) {
      synchronized (tasksByKey) {
        Queue<Runnable> newTasks = tasksByKey.get(key);
        // If this key is already being handled, add it to the queue and return.
        if (newTasks != null) {
          newTasks.add(task);
          return;
        }

        newTasks = new ConcurrentLinkedQueue<>();
        newTasks.add(task);
        tasksByKey.put(key, newTasks);
      }

      callNextTaskAsync(key);
    }

    protected void callNextTaskAsync(final String key) {
      executor.execute(
          new Runnable() {
            @Override
            public void run() {
              Queue<Runnable> tasks;
              synchronized (tasksByKey) {
                tasks = tasksByKey.get(key);
                if (tasks != null && tasks.isEmpty()) {
                  tasksByKey.remove(key);
                  tasks = null;
                }
              }
              if (tasks != null) {
                // TODO(kimkyung-goog): Check if there is a race when task list becomes empty.
                Runnable task = tasks.poll();
                if (task != null) {
                  task.run();
                }
              }
            }
          });
    }
  }

  @BetaApi
  static class AutoExecutor extends SequentialExecutor {
    AutoExecutor(Executor executor) {
      super(executor);
    }

    /** Runs synchronous {@code Runnable} tasks sequentially. */
    void submit(final String key, final Runnable task) {
      super.execute(key, new Runnable() {
        @Override public void run() {
          task.run();
          callNextTaskAsync(key);
        }
      });
    }
  }

  /**
   * Runs asynchronous {@code Callable} tasks sequentially for the same key. If one of the tasks
   * fails, other tasks with the same key that have not been executed will be cancelled.
   */
  @BetaApi
  static class CallbackExecutor extends SequentialExecutor {
    private static final Logger logger =
        Logger.getLogger(SequentialExecutorService.SequentialExecutor.class.getName());

    CallbackExecutor(Executor executor) {
      super(executor);
    }

    /**
     * Runs asynchronous {@code Callable} tasks sequentially. If one of the tasks fails, other tasks
     * with the same key that have not been executed will be cancelled.
     *
     * <p>This method does the following in a chain:
     *
     * <ol>
     *   <li>Creates an `ApiFuture` that can be used for tracking progress.
     *   <li>Creates a `CancellableRunnable` out of the `Callable`
     *   <li>Adds the `CancellableRunnable` to the task queue
     *   <li>Once the task is ready to be run, it will execute the `Callable`
     *   <li>When the `Callable` completes one of two things happens:
     *       <ol>
     *         <li>On success:
     *             <ol>
     *               <li>Complete the `ApiFuture` by setting the return value.
     *               <li>Call the next task.
     *             </ol>
     *         <li>On Failure:
     *             <ol>
     *               <li>Fail the `ApiFuture` by setting the exception.
     *               <li>Cancel all tasks in the queue.
     *             </ol>
     *       </ol>
     * </ol>
     *
     * @param key The key for the task queue
     * @param callable The thing to run
     * @param <T> The return type for the `Callable`'s `ApiFuture`.
     * @return an `ApiFuture` for tracking.
     */
    <T> ApiFuture<T> submit(final String key, final Callable<ApiFuture<T>> callable) {
      // Step 1: create a future for the user
      final SettableApiFuture<T> future = SettableApiFuture.create();

      // Step 2: create the CancellableRunnable
      // Step 3: add the task to queue via `execute`
      execute(
          key,
          new CancellableRunnable() {
            private boolean cancelled = false;

            @Override
            public void run() {
              // the task was cancelled
              if (cancelled) {
                return;
              }

              try {
                // Step 4: call the `Callable`
                ApiFuture<T> callResult = callable.call();
                ApiFutures.addCallback(
                    callResult,
                    new ApiFutureCallback<T>() {
                      // Step 5.1: on success
                      @Override
                      public void onSuccess(T msg) {
                        future.set(msg);
                        callNextTaskAsync(key);
                      }

                      // Step 5.2: on failure
                      @Override
                      public void onFailure(Throwable e) {
                        future.setException(e);
                        cancelQueuedTasks(
                            key,
                            new CancellationException(
                                "Execution cancelled because executing previous runnable failed."));
                      }
                    },
                    directExecutor());
              } catch (Exception e) {
                future.setException(e);
              }
            }

            @Override
            public void cancel(Throwable e) {
              this.cancelled = true;
              future.setException(e);
            }
          });
      return future;
    }

    /** Cancels every task in the queue assoicated with {@code key}. */
    private void cancelQueuedTasks(final String key, Throwable e) {
      // TODO(kimkyung-goog): Ensure execute() fails once cancelQueueTasks() has been ever invoked,
      // so that no more tasks are scheduled.
      synchronized (tasksByKey) {
        final Queue<Runnable> tasks = tasksByKey.get(key);
        if (tasks == null) {
          return;
        }
        while (!tasks.isEmpty()) {
          Runnable task = tasks.poll();
          if (task instanceof CancellableRunnable) {
            ((CancellableRunnable) task).cancel(e);
          } else {
            logger.log(
                Level.WARNING,
                "Attempted to cancel Runnable that was not CancellableRunnable; ignored.");
          }
        }
      }
    }
  }
}
