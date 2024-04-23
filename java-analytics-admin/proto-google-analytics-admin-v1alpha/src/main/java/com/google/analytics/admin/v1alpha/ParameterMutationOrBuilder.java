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
// source: google/analytics/admin/v1alpha/event_create_and_edit.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface ParameterMutationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ParameterMutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parameter to mutate.
   * This value must:
   * * be less than 40 characters.
   * * be unique across across all mutations within the rule
   * * consist only of letters, digits or _ (underscores)
   * For event edit rules, the name may also be set to 'event_name' to modify
   * the event_name in place.
   * </pre>
   *
   * <code>string parameter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parameter.
   */
  java.lang.String getParameter();
  /**
   *
   *
   * <pre>
   * Required. The name of the parameter to mutate.
   * This value must:
   * * be less than 40 characters.
   * * be unique across across all mutations within the rule
   * * consist only of letters, digits or _ (underscores)
   * For event edit rules, the name may also be set to 'event_name' to modify
   * the event_name in place.
   * </pre>
   *
   * <code>string parameter = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parameter.
   */
  com.google.protobuf.ByteString getParameterBytes();

  /**
   *
   *
   * <pre>
   * Required. The value mutation to perform.
   * * Must be less than 100 characters.
   * * To specify a constant value for the param, use the value's string.
   * * To copy value from another parameter, use syntax like
   * "[[other_parameter]]" For more details, see this [help center
   * article](https://support.google.com/analytics/answer/10085872#modify-an-event&amp;zippy=%2Cin-this-article%2Cmodify-parameters).
   * </pre>
   *
   * <code>string parameter_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parameterValue.
   */
  java.lang.String getParameterValue();
  /**
   *
   *
   * <pre>
   * Required. The value mutation to perform.
   * * Must be less than 100 characters.
   * * To specify a constant value for the param, use the value's string.
   * * To copy value from another parameter, use syntax like
   * "[[other_parameter]]" For more details, see this [help center
   * article](https://support.google.com/analytics/answer/10085872#modify-an-event&amp;zippy=%2Cin-this-article%2Cmodify-parameters).
   * </pre>
   *
   * <code>string parameter_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parameterValue.
   */
  com.google.protobuf.ByteString getParameterValueBytes();
}
