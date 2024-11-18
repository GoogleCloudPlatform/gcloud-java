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
// source: google/cloud/dialogflow/v2beta1/sip_trunk.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface UpdateSipTrunkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.UpdateSipTrunkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The SipTrunk to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SipTrunk sip_trunk = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the sipTrunk field is set.
   */
  boolean hasSipTrunk();
  /**
   *
   *
   * <pre>
   * Required. The SipTrunk to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SipTrunk sip_trunk = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sipTrunk.
   */
  com.google.cloud.dialogflow.v2beta1.SipTrunk getSipTrunk();
  /**
   *
   *
   * <pre>
   * Required. The SipTrunk to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.SipTrunk sip_trunk = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SipTrunkOrBuilder getSipTrunkOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
