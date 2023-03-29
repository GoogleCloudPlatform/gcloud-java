/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contentwarehouse/v1/ruleset_service_request.proto

package com.google.cloud.contentwarehouse.v1;

public interface CreateRuleSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.CreateRuleSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent name.
   * Format: projects/{project_number}/locations/{location}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent name.
   * Format: projects/{project_number}/locations/{location}.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The rule set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.RuleSet rule_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ruleSet field is set.
   */
  boolean hasRuleSet();
  /**
   *
   *
   * <pre>
   * Required. The rule set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.RuleSet rule_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ruleSet.
   */
  com.google.cloud.contentwarehouse.v1.RuleSet getRuleSet();
  /**
   *
   *
   * <pre>
   * Required. The rule set to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.RuleSet rule_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.RuleSetOrBuilder getRuleSetOrBuilder();
}
