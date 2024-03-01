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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.gkehub.configmanagement.v1beta;

public interface GitConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.GitConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL of the Git repository to use as the source of truth.
   * </pre>
   *
   * <code>string sync_repo = 1;</code>
   *
   * @return The syncRepo.
   */
  java.lang.String getSyncRepo();
  /**
   *
   *
   * <pre>
   * The URL of the Git repository to use as the source of truth.
   * </pre>
   *
   * <code>string sync_repo = 1;</code>
   *
   * @return The bytes for syncRepo.
   */
  com.google.protobuf.ByteString getSyncRepoBytes();

  /**
   *
   *
   * <pre>
   * The branch of the repository to sync from. Default: master.
   * </pre>
   *
   * <code>string sync_branch = 2;</code>
   *
   * @return The syncBranch.
   */
  java.lang.String getSyncBranch();
  /**
   *
   *
   * <pre>
   * The branch of the repository to sync from. Default: master.
   * </pre>
   *
   * <code>string sync_branch = 2;</code>
   *
   * @return The bytes for syncBranch.
   */
  com.google.protobuf.ByteString getSyncBranchBytes();

  /**
   *
   *
   * <pre>
   * The path within the Git repository that represents the top level of the
   * repo to sync. Default: the root directory of the repository.
   * </pre>
   *
   * <code>string policy_dir = 3;</code>
   *
   * @return The policyDir.
   */
  java.lang.String getPolicyDir();
  /**
   *
   *
   * <pre>
   * The path within the Git repository that represents the top level of the
   * repo to sync. Default: the root directory of the repository.
   * </pre>
   *
   * <code>string policy_dir = 3;</code>
   *
   * @return The bytes for policyDir.
   */
  com.google.protobuf.ByteString getPolicyDirBytes();

  /**
   *
   *
   * <pre>
   * Period in seconds between consecutive syncs. Default: 15.
   * </pre>
   *
   * <code>int64 sync_wait_secs = 4;</code>
   *
   * @return The syncWaitSecs.
   */
  long getSyncWaitSecs();

  /**
   *
   *
   * <pre>
   * Git revision (tag or hash) to check out. Default HEAD.
   * </pre>
   *
   * <code>string sync_rev = 5;</code>
   *
   * @return The syncRev.
   */
  java.lang.String getSyncRev();
  /**
   *
   *
   * <pre>
   * Git revision (tag or hash) to check out. Default HEAD.
   * </pre>
   *
   * <code>string sync_rev = 5;</code>
   *
   * @return The bytes for syncRev.
   */
  com.google.protobuf.ByteString getSyncRevBytes();

  /**
   *
   *
   * <pre>
   * Type of secret configured for access to the Git repo.
   * </pre>
   *
   * <code>string secret_type = 6;</code>
   *
   * @return The secretType.
   */
  java.lang.String getSecretType();
  /**
   *
   *
   * <pre>
   * Type of secret configured for access to the Git repo.
   * </pre>
   *
   * <code>string secret_type = 6;</code>
   *
   * @return The bytes for secretType.
   */
  com.google.protobuf.ByteString getSecretTypeBytes();

  /**
   *
   *
   * <pre>
   * URL for the HTTPS proxy to be used when communicating with the Git repo.
   * </pre>
   *
   * <code>string https_proxy = 7;</code>
   *
   * @return The httpsProxy.
   */
  java.lang.String getHttpsProxy();
  /**
   *
   *
   * <pre>
   * URL for the HTTPS proxy to be used when communicating with the Git repo.
   * </pre>
   *
   * <code>string https_proxy = 7;</code>
   *
   * @return The bytes for httpsProxy.
   */
  com.google.protobuf.ByteString getHttpsProxyBytes();

  /**
   *
   *
   * <pre>
   * The GCP Service Account Email used for auth when secret_type is
   * gcpServiceAccount.
   * </pre>
   *
   * <code>string gcp_service_account_email = 8;</code>
   *
   * @return The gcpServiceAccountEmail.
   */
  java.lang.String getGcpServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * The GCP Service Account Email used for auth when secret_type is
   * gcpServiceAccount.
   * </pre>
   *
   * <code>string gcp_service_account_email = 8;</code>
   *
   * @return The bytes for gcpServiceAccountEmail.
   */
  com.google.protobuf.ByteString getGcpServiceAccountEmailBytes();
}
