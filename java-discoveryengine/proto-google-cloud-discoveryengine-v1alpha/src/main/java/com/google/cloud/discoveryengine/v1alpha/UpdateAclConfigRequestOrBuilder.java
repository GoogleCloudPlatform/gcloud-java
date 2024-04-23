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
// source: google/cloud/discoveryengine/v1alpha/acl_config_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public interface UpdateAclConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.UpdateAclConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>
   * .google.cloud.discoveryengine.v1alpha.AclConfig acl_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the aclConfig field is set.
   */
  boolean hasAclConfig();
  /**
   * <code>
   * .google.cloud.discoveryengine.v1alpha.AclConfig acl_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The aclConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.AclConfig getAclConfig();
  /**
   * <code>
   * .google.cloud.discoveryengine.v1alpha.AclConfig acl_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.AclConfigOrBuilder getAclConfigOrBuilder();
}
