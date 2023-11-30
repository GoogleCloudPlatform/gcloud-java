/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/tasks/v2beta3/target.proto

package com.google.cloud.tasks.v2beta3;

public interface OidcTokenOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.OidcToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OIDC token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * [Service account email](https://cloud.google.com/iam/docs/service-accounts)
   * to be used for generating OIDC token.
   * The service account must be within the same project as the queue. The
   * caller must have iam.serviceAccounts.actAs permission for the service
   * account.
   * </pre>
   *
   * <code>string service_account_email = 1;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   *
   * @return The audience.
   */
  java.lang.String getAudience();
  /**
   *
   *
   * <pre>
   * Audience to be used when generating OIDC token. If not specified, the URI
   * specified in target will be used.
   * </pre>
   *
   * <code>string audience = 2;</code>
   *
   * @return The bytes for audience.
   */
  com.google.protobuf.ByteString getAudienceBytes();
}
