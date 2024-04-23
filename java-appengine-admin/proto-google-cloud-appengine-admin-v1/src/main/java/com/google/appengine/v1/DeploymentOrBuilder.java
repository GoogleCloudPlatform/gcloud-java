/*
 * Copyright 2024 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Manifest of the files stored in Google Cloud Storage that are included
   * as part of this version. All files must be readable using the
   * credentials supplied with this call.
   * </pre>
   *
   * <code>map&lt;string, .google.appengine.v1.FileInfo&gt; files = 1;</code>
   */
  int getFilesCount();
  /**
   *
   *
   * <pre>
   * Manifest of the files stored in Google Cloud Storage that are included
   * as part of this version. All files must be readable using the
   * credentials supplied with this call.
   * </pre>
   *
   * <code>map&lt;string, .google.appengine.v1.FileInfo&gt; files = 1;</code>
   */
  boolean containsFiles(java.lang.String key);
  /** Use {@link #getFilesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.appengine.v1.FileInfo> getFiles();
  /**
   *
   *
   * <pre>
   * Manifest of the files stored in Google Cloud Storage that are included
   * as part of this version. All files must be readable using the
   * credentials supplied with this call.
   * </pre>
   *
   * <code>map&lt;string, .google.appengine.v1.FileInfo&gt; files = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.appengine.v1.FileInfo> getFilesMap();
  /**
   *
   *
   * <pre>
   * Manifest of the files stored in Google Cloud Storage that are included
   * as part of this version. All files must be readable using the
   * credentials supplied with this call.
   * </pre>
   *
   * <code>map&lt;string, .google.appengine.v1.FileInfo&gt; files = 1;</code>
   */
  /* nullable */
  com.google.appengine.v1.FileInfo getFilesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.appengine.v1.FileInfo defaultValue);
  /**
   *
   *
   * <pre>
   * Manifest of the files stored in Google Cloud Storage that are included
   * as part of this version. All files must be readable using the
   * credentials supplied with this call.
   * </pre>
   *
   * <code>map&lt;string, .google.appengine.v1.FileInfo&gt; files = 1;</code>
   */
  com.google.appengine.v1.FileInfo getFilesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The Docker image for the container that runs the version.
   * Only applicable for instances running in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.appengine.v1.ContainerInfo container = 2;</code>
   *
   * @return Whether the container field is set.
   */
  boolean hasContainer();
  /**
   *
   *
   * <pre>
   * The Docker image for the container that runs the version.
   * Only applicable for instances running in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.appengine.v1.ContainerInfo container = 2;</code>
   *
   * @return The container.
   */
  com.google.appengine.v1.ContainerInfo getContainer();
  /**
   *
   *
   * <pre>
   * The Docker image for the container that runs the version.
   * Only applicable for instances running in the App Engine flexible environment.
   * </pre>
   *
   * <code>.google.appengine.v1.ContainerInfo container = 2;</code>
   */
  com.google.appengine.v1.ContainerInfoOrBuilder getContainerOrBuilder();

  /**
   *
   *
   * <pre>
   * The zip file for this deployment, if this is a zip deployment.
   * </pre>
   *
   * <code>.google.appengine.v1.ZipInfo zip = 3;</code>
   *
   * @return Whether the zip field is set.
   */
  boolean hasZip();
  /**
   *
   *
   * <pre>
   * The zip file for this deployment, if this is a zip deployment.
   * </pre>
   *
   * <code>.google.appengine.v1.ZipInfo zip = 3;</code>
   *
   * @return The zip.
   */
  com.google.appengine.v1.ZipInfo getZip();
  /**
   *
   *
   * <pre>
   * The zip file for this deployment, if this is a zip deployment.
   * </pre>
   *
   * <code>.google.appengine.v1.ZipInfo zip = 3;</code>
   */
  com.google.appengine.v1.ZipInfoOrBuilder getZipOrBuilder();

  /**
   *
   *
   * <pre>
   * Options for any Google Cloud Build builds created as a part of this
   * deployment.
   *
   * These options will only be used if a new build is created, such as when
   * deploying to the App Engine flexible environment using files or zip.
   * </pre>
   *
   * <code>.google.appengine.v1.CloudBuildOptions cloud_build_options = 6;</code>
   *
   * @return Whether the cloudBuildOptions field is set.
   */
  boolean hasCloudBuildOptions();
  /**
   *
   *
   * <pre>
   * Options for any Google Cloud Build builds created as a part of this
   * deployment.
   *
   * These options will only be used if a new build is created, such as when
   * deploying to the App Engine flexible environment using files or zip.
   * </pre>
   *
   * <code>.google.appengine.v1.CloudBuildOptions cloud_build_options = 6;</code>
   *
   * @return The cloudBuildOptions.
   */
  com.google.appengine.v1.CloudBuildOptions getCloudBuildOptions();
  /**
   *
   *
   * <pre>
   * Options for any Google Cloud Build builds created as a part of this
   * deployment.
   *
   * These options will only be used if a new build is created, such as when
   * deploying to the App Engine flexible environment using files or zip.
   * </pre>
   *
   * <code>.google.appengine.v1.CloudBuildOptions cloud_build_options = 6;</code>
   */
  com.google.appengine.v1.CloudBuildOptionsOrBuilder getCloudBuildOptionsOrBuilder();
}
