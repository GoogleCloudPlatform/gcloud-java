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
// source: google/cloud/securitycenter/v1beta1/source.proto

package com.google.cloud.securitycenter.v1beta1;

public interface SourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must have a length between 1 and 64 characters
   * (inclusive).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must have a length between 1 and 64 characters
   * (inclusive).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Web Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Web Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated/insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
