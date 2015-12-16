/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.gcloud.resourcemanager;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.gcloud.RetryHelper.runWithRetries;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.gcloud.BaseService;
import com.google.gcloud.ExceptionHandler;
import com.google.gcloud.ExceptionHandler.Interceptor;
import com.google.gcloud.Page;
import com.google.gcloud.PageImpl;
import com.google.gcloud.RetryHelper.RetryHelperException;
import com.google.gcloud.spi.ResourceManagerRpc;
import com.google.gcloud.spi.ResourceManagerRpc.Tuple;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;

public class ResourceManagerImpl
    extends BaseService<ResourceManagerOptions> implements ResourceManager {

  private static final Interceptor EXCEPTION_HANDLER_INTERCEPTOR = new Interceptor() {

    private static final long serialVersionUID = 2091576149969931704L;

    @Override
    public RetryResult afterEval(Exception exception, RetryResult retryResult) {
      return Interceptor.RetryResult.CONTINUE_EVALUATION;
    }

    @Override
    public RetryResult beforeEval(Exception exception) {
      if (exception instanceof ResourceManagerException) {
        boolean retriable = ((ResourceManagerException) exception).retryable();
        return retriable ? Interceptor.RetryResult.RETRY : Interceptor.RetryResult.NO_RETRY;
      }
      return Interceptor.RetryResult.CONTINUE_EVALUATION;
    }
  };
  static final ExceptionHandler EXCEPTION_HANDLER = ExceptionHandler.builder()
      .abortOn(RuntimeException.class)
      .interceptor(EXCEPTION_HANDLER_INTERCEPTOR)
      .build();

  private final ResourceManagerRpc resourceManagerRpc;

  ResourceManagerImpl(ResourceManagerOptions options) {
    super(options);
    resourceManagerRpc = options.rpc();
  }

  @Override
  public ProjectInfo create(final ProjectInfo project) {
    try {
      return ProjectInfo.fromPb(runWithRetries(
          new Callable<com.google.api.services.cloudresourcemanager.model.Project>() {
            @Override
            public com.google.api.services.cloudresourcemanager.model.Project call() {
              return resourceManagerRpc.create(project.toPb());
            }
          }, options().retryParams(), EXCEPTION_HANDLER));
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  @Override
  public void delete(final String projectId) {
    try {
      runWithRetries(new Callable<Void>() {
        @Override
        public Void call() {
          resourceManagerRpc.delete(projectId);
          return null;
        }
      }, options().retryParams(), EXCEPTION_HANDLER);
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  @Override
  public ProjectInfo get(final String projectId, ProjectGetOption... options) {
    final Map<ResourceManagerRpc.Option, ?> optionsMap = optionMap(options);
    try {
      com.google.api.services.cloudresourcemanager.model.Project answer = runWithRetries(
          new Callable<com.google.api.services.cloudresourcemanager.model.Project>() {
            @Override
            public com.google.api.services.cloudresourcemanager.model.Project call() {
              return resourceManagerRpc.get(projectId, optionsMap);
            }
          }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : ProjectInfo.fromPb(answer);
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  private abstract static class BasePageFetcher<T extends Serializable>
      implements PageImpl.NextPageFetcher<T> {

    private static final long serialVersionUID = -5560906434575940205L;

    protected final Map<ResourceManagerRpc.Option, ?> requestOptions;
    protected final ResourceManagerOptions serviceOptions;

    BasePageFetcher(ResourceManagerOptions serviceOptions, String cursor,
        Map<ResourceManagerRpc.Option, ?> optionMap) {
      this.serviceOptions = serviceOptions;
      ImmutableMap.Builder<ResourceManagerRpc.Option, Object> builder = ImmutableMap.builder();
      if (cursor != null) {
        builder.put(ResourceManagerRpc.Option.PAGE_TOKEN, cursor);
      }
      for (Map.Entry<ResourceManagerRpc.Option, ?> option : optionMap.entrySet()) {
        if (option.getKey() != ResourceManagerRpc.Option.PAGE_TOKEN) {
          builder.put(option.getKey(), option.getValue());
        }
      }
      this.requestOptions = builder.build();
    }
  }

  private static class ProjectPageFetcher extends BasePageFetcher<ProjectInfo> {

    private static final long serialVersionUID = -533306655445189098L;

    ProjectPageFetcher(ResourceManagerOptions serviceOptions, String cursor,
        Map<ResourceManagerRpc.Option, ?> optionMap) {
      super(serviceOptions, cursor, optionMap);
    }

    @Override
    public Page<ProjectInfo> nextPage() {
      return listProjects(serviceOptions, requestOptions);
    }
  }

  @Override
  public Page<ProjectInfo> list(ProjectListOption... options) {
    return listProjects(options(), optionMap(options));
  }

  private static Page<ProjectInfo> listProjects(final ResourceManagerOptions serviceOptions,
      final Map<ResourceManagerRpc.Option, ?> optionsMap) {
    try {
      Tuple<String, Iterable<com.google.api.services.cloudresourcemanager.model.Project>> result =
          runWithRetries(new Callable<Tuple<String,
              Iterable<com.google.api.services.cloudresourcemanager.model.Project>>>() {
                @Override
                public Tuple<String,
                    Iterable<com.google.api.services.cloudresourcemanager.model.Project>> call() {
                  return serviceOptions.rpc().list(optionsMap);
                }
              },
              serviceOptions.retryParams(), EXCEPTION_HANDLER);
      String cursor = result.x();
      Iterable<ProjectInfo> projects =
          result.y() == null
              ? ImmutableList.<ProjectInfo>of() : Iterables.transform(
                  result.y(),
                  new Function<com.google.api.services.cloudresourcemanager.model.Project,
                      ProjectInfo>() {
                    @Override
                    public ProjectInfo apply(
                        com.google.api.services.cloudresourcemanager.model.Project projectPb) {
                      return ProjectInfo.fromPb(projectPb);
                    }
                  });
      return new PageImpl<>(
          new ProjectPageFetcher(serviceOptions, cursor, optionsMap), cursor, projects);
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  @Override
  public ProjectInfo replace(final ProjectInfo newProject) {
    try {
      return ProjectInfo.fromPb(runWithRetries(
          new Callable<com.google.api.services.cloudresourcemanager.model.Project>() {
            @Override
            public com.google.api.services.cloudresourcemanager.model.Project call() {
              return resourceManagerRpc.replace(newProject.toPb());
            }
          }, options().retryParams(), EXCEPTION_HANDLER));
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  @Override
  public void undelete(final String projectId) {
    try {
      runWithRetries(new Callable<Void>() {
        @Override
        public Void call() {
          resourceManagerRpc.undelete(projectId);
          return null;
        }
      }, options().retryParams(), EXCEPTION_HANDLER);
    } catch (RetryHelperException e) {
      throw ResourceManagerException.translateAndThrow(e);
    }
  }

  private Map<ResourceManagerRpc.Option, ?> optionMap(Option... options) {
    Map<ResourceManagerRpc.Option, Object> temp = Maps.newEnumMap(ResourceManagerRpc.Option.class);
    for (Option option : options) {
      Object prev = temp.put(option.rpcOption(), option.value());
      checkArgument(prev == null, "Duplicate option %s", option);
    }
    return ImmutableMap.copyOf(temp);
  }
}
