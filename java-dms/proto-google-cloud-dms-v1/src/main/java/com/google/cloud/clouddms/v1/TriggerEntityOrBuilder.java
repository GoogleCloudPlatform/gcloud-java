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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.clouddms.v1;

public interface TriggerEntityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.TriggerEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the trigger.
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
   * The name of the trigger.
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
   * The DML, DDL, or database events that fire the trigger, for example
   * INSERT, UPDATE.
   * </pre>
   *
   * <code>repeated string triggering_events = 2;</code>
   *
   * @return A list containing the triggeringEvents.
   */
  java.util.List<java.lang.String> getTriggeringEventsList();
  /**
   *
   *
   * <pre>
   * The DML, DDL, or database events that fire the trigger, for example
   * INSERT, UPDATE.
   * </pre>
   *
   * <code>repeated string triggering_events = 2;</code>
   *
   * @return The count of triggeringEvents.
   */
  int getTriggeringEventsCount();
  /**
   *
   *
   * <pre>
   * The DML, DDL, or database events that fire the trigger, for example
   * INSERT, UPDATE.
   * </pre>
   *
   * <code>repeated string triggering_events = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The triggeringEvents at the given index.
   */
  java.lang.String getTriggeringEvents(int index);
  /**
   *
   *
   * <pre>
   * The DML, DDL, or database events that fire the trigger, for example
   * INSERT, UPDATE.
   * </pre>
   *
   * <code>repeated string triggering_events = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the triggeringEvents at the given index.
   */
  com.google.protobuf.ByteString getTriggeringEventsBytes(int index);

  /**
   *
   *
   * <pre>
   * Indicates when the trigger fires, for example BEFORE STATEMENT, AFTER EACH
   * ROW.
   * </pre>
   *
   * <code>string trigger_type = 3;</code>
   *
   * @return The triggerType.
   */
  java.lang.String getTriggerType();
  /**
   *
   *
   * <pre>
   * Indicates when the trigger fires, for example BEFORE STATEMENT, AFTER EACH
   * ROW.
   * </pre>
   *
   * <code>string trigger_type = 3;</code>
   *
   * @return The bytes for triggerType.
   */
  com.google.protobuf.ByteString getTriggerTypeBytes();

  /**
   *
   *
   * <pre>
   * The SQL code which creates the trigger.
   * </pre>
   *
   * <code>string sql_code = 4;</code>
   *
   * @return The sqlCode.
   */
  java.lang.String getSqlCode();
  /**
   *
   *
   * <pre>
   * The SQL code which creates the trigger.
   * </pre>
   *
   * <code>string sql_code = 4;</code>
   *
   * @return The bytes for sqlCode.
   */
  com.google.protobuf.ByteString getSqlCodeBytes();

  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   *
   * @return Whether the customFeatures field is set.
   */
  boolean hasCustomFeatures();
  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   *
   * @return The customFeatures.
   */
  com.google.protobuf.Struct getCustomFeatures();
  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 5;</code>
   */
  com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder();
}
