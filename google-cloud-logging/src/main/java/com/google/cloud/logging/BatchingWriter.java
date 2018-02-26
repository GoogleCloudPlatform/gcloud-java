/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.logging;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.common.base.Preconditions;
import com.google.logging.v2.WriteLogEntriesRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class BatchingWriter {

  interface Rpc {
    ApiFuture<Void> call(WriteLogEntriesRequest request);
  }

  private final Rpc rpc;
  private final int batchSize;
  private final Semaphore pending;
  private final WriteLogEntriesRequest requestPrototype;
  private final ScheduledThreadPoolExecutor executor;

  // Use Boolean, since concurrent maps don't support nulls.
  private final ConcurrentHashMap<ApiFuture<Void>, Boolean> pendingWrites =
      new ConcurrentHashMap<>();

  private final ArrayList<com.google.logging.v2.LogEntry> currentBatch;

  private Future<?> flushJob = null;

  BatchingWriter(
      Rpc rpc,
      int batchSize,
      int maxPending,
      WriteLogEntriesRequest requestPrototype,
      ScheduledThreadPoolExecutor executor) {
    Preconditions.checkArgument(batchSize > 0, "batchSize must be positive");
    this.batchSize = batchSize;
    Preconditions.checkArgument(maxPending > 0, "maxPending must be positive");
    this.pending = new Semaphore(maxPending);

    this.rpc = Preconditions.checkNotNull(rpc);
    this.requestPrototype = Preconditions.checkNotNull(requestPrototype);
    this.executor = Preconditions.checkNotNull(executor);
    this.currentBatch = new ArrayList<>(batchSize);
  }

  synchronized void startJob() {
    Preconditions.checkArgument(flushJob == null, "job already started");
    flushJob =
        executor.scheduleWithFixedDelay(
            new Runnable() {
              @Override
              public void run() {
                initFlush();
              }
            },
            100,
            100,
            TimeUnit.MILLISECONDS);
  }

  synchronized void stopJob() {
    Preconditions.checkArgument(flushJob != null, "job not started");
    flushJob.cancel(false);
  }

  void add(com.google.logging.v2.LogEntry entry) throws InterruptedException {
    pending.acquire(1);
    synchronized (currentBatch) {
      currentBatch.add(entry);
      if (currentBatch.size() == batchSize) {
        final WriteLogEntriesRequest request =
            requestPrototype.toBuilder().addAllEntries(currentBatch).build();
        currentBatch.clear();

        // Whoever calls send serializes the proto; so we do it off-thread.
        // This gives better CPU utilization if there are few producer threads
        // on a many-core machine.
        executor.execute(
            new Runnable() {
              @Override
              public void run() {
                send(request);
              }
            });
      }
    }
  }

  void initFlush() {
    WriteLogEntriesRequest request;
    synchronized (currentBatch) {
      request = requestPrototype.toBuilder().addAllEntries(currentBatch).build();
      currentBatch.clear();
    }
    send(request);
  }

  private void send(WriteLogEntriesRequest request) {
    final int count = request.getEntriesCount();
    if (count == 0) {
      return;
    }

    final ApiFuture<Void> writeFuture = rpc.call(request);
    pendingWrites.put(writeFuture, Boolean.TRUE);
    ApiFutures.addCallback(
        writeFuture,
        new ApiFutureCallback<Void>() {
          private void onBoth() {
            pendingWrites.remove(writeFuture);
            pending.release(count);
          }

          @Override
          public void onSuccess(Void v) {
            onBoth();
          }

          @Override
          public void onFailure(Throwable t) {
            // Report failure.
            onBoth();
          }
        });
  }

  List<ApiFuture<Void>> pendingRpcs() {
    return new ArrayList<>(pendingWrites.keySet());
  }
}
