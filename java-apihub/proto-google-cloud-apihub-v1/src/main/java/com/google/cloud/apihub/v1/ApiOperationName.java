/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.apihub.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ApiOperationName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_API_VERSION_OPERATION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/apis/{api}/versions/{version}/operations/{operation}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String api;
  private final String version;
  private final String operation;

  @Deprecated
  protected ApiOperationName() {
    project = null;
    location = null;
    api = null;
    version = null;
    operation = null;
  }

  private ApiOperationName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    api = Preconditions.checkNotNull(builder.getApi());
    version = Preconditions.checkNotNull(builder.getVersion());
    operation = Preconditions.checkNotNull(builder.getOperation());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getApi() {
    return api;
  }

  public String getVersion() {
    return version;
  }

  public String getOperation() {
    return operation;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ApiOperationName of(
      String project, String location, String api, String version, String operation) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setApi(api)
        .setVersion(version)
        .setOperation(operation)
        .build();
  }

  public static String format(
      String project, String location, String api, String version, String operation) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setApi(api)
        .setVersion(version)
        .setOperation(operation)
        .build()
        .toString();
  }

  public static ApiOperationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_API_VERSION_OPERATION.validatedMatch(
            formattedString, "ApiOperationName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("api"),
        matchMap.get("version"),
        matchMap.get("operation"));
  }

  public static List<ApiOperationName> parseList(List<String> formattedStrings) {
    List<ApiOperationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ApiOperationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ApiOperationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_API_VERSION_OPERATION.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (api != null) {
            fieldMapBuilder.put("api", api);
          }
          if (version != null) {
            fieldMapBuilder.put("version", version);
          }
          if (operation != null) {
            fieldMapBuilder.put("operation", operation);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_API_VERSION_OPERATION.instantiate(
        "project",
        project,
        "location",
        location,
        "api",
        api,
        "version",
        version,
        "operation",
        operation);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ApiOperationName that = ((ApiOperationName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.api, that.api)
          && Objects.equals(this.version, that.version)
          && Objects.equals(this.operation, that.operation);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(api);
    h *= 1000003;
    h ^= Objects.hashCode(version);
    h *= 1000003;
    h ^= Objects.hashCode(operation);
    return h;
  }

  /**
   * Builder for
   * projects/{project}/locations/{location}/apis/{api}/versions/{version}/operations/{operation}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String api;
    private String version;
    private String operation;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getApi() {
      return api;
    }

    public String getVersion() {
      return version;
    }

    public String getOperation() {
      return operation;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setApi(String api) {
      this.api = api;
      return this;
    }

    public Builder setVersion(String version) {
      this.version = version;
      return this;
    }

    public Builder setOperation(String operation) {
      this.operation = operation;
      return this;
    }

    private Builder(ApiOperationName apiOperationName) {
      this.project = apiOperationName.project;
      this.location = apiOperationName.location;
      this.api = apiOperationName.api;
      this.version = apiOperationName.version;
      this.operation = apiOperationName.operation;
    }

    public ApiOperationName build() {
      return new ApiOperationName(this);
    }
  }
}
