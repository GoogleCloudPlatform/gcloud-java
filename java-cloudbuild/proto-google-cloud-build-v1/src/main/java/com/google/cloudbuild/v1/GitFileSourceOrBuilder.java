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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v1;

public interface GitFileSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.GitFileSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The path of the file, with the repo root as the root of the path.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * The path of the file, with the repo root as the root of the path.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * The URI of the repo.
   * Either uri or repository can be specified.
   * If unspecified, the repo from which the trigger invocation originated is
   * assumed to be the repo from which to read the specified path.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URI of the repo.
   * Either uri or repository can be specified.
   * If unspecified, the repo from which the trigger invocation originated is
   * assumed to be the repo from which to read the specified path.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The fully qualified resource name of the Repos API repository.
   * Either URI or repository can be specified.
   * If unspecified, the repo from which the trigger invocation originated is
   * assumed to be the repo from which to read the specified path.
   * </pre>
   *
   * <code>string repository = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   *
   *
   * <pre>
   * The fully qualified resource name of the Repos API repository.
   * Either URI or repository can be specified.
   * If unspecified, the repo from which the trigger invocation originated is
   * assumed to be the repo from which to read the specified path.
   * </pre>
   *
   * <code>string repository = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The repository.
   */
  java.lang.String getRepository();
  /**
   *
   *
   * <pre>
   * The fully qualified resource name of the Repos API repository.
   * Either URI or repository can be specified.
   * If unspecified, the repo from which the trigger invocation originated is
   * assumed to be the repo from which to read the specified path.
   * </pre>
   *
   * <code>string repository = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString getRepositoryBytes();

  /**
   *
   *
   * <pre>
   * See RepoType above.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource.RepoType repo_type = 3;</code>
   *
   * @return The enum numeric value on the wire for repoType.
   */
  int getRepoTypeValue();
  /**
   *
   *
   * <pre>
   * See RepoType above.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource.RepoType repo_type = 3;</code>
   *
   * @return The repoType.
   */
  com.google.cloudbuild.v1.GitFileSource.RepoType getRepoType();

  /**
   *
   *
   * <pre>
   * The branch, tag, arbitrary ref, or SHA version of the repo to use when
   * resolving the filename (optional).
   * This field respects the same syntax/resolution as described here:
   * https://git-scm.com/docs/gitrevisions
   * If unspecified, the revision from which the trigger invocation originated
   * is assumed to be the revision from which to read the specified path.
   * </pre>
   *
   * <code>string revision = 4;</code>
   *
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   *
   *
   * <pre>
   * The branch, tag, arbitrary ref, or SHA version of the repo to use when
   * resolving the filename (optional).
   * This field respects the same syntax/resolution as described here:
   * https://git-scm.com/docs/gitrevisions
   * If unspecified, the revision from which the trigger invocation originated
   * is assumed to be the revision from which to read the specified path.
   * </pre>
   *
   * <code>string revision = 4;</code>
   *
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the githubEnterpriseConfig field is set.
   */
  boolean hasGithubEnterpriseConfig();
  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The githubEnterpriseConfig.
   */
  java.lang.String getGithubEnterpriseConfig();
  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for githubEnterpriseConfig.
   */
  com.google.protobuf.ByteString getGithubEnterpriseConfigBytes();

  com.google.cloudbuild.v1.GitFileSource.SourceCase getSourceCase();

  com.google.cloudbuild.v1.GitFileSource.EnterpriseConfigCase getEnterpriseConfigCase();
}
