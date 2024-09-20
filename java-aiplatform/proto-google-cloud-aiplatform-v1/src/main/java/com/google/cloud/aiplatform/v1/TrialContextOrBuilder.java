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
// source: google/cloud/aiplatform/v1/study.proto

package com.google.cloud.aiplatform.v1;

public interface TrialContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TrialContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A human-readable field which can store a description of this context.
   * This will become part of the resulting Trial's description field.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A human-readable field which can store a description of this context.
   * This will become part of the resulting Trial's description field.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * If/when a Trial is generated or selected from this Context,
   * its Parameters will match any parameters specified here.
   * (I.e. if this context specifies parameter name:'a' int_value:3,
   * then a resulting Trial will have int_value:3 for its parameter named
   * 'a'.) Note that we first attempt to match existing REQUESTED Trials with
   * contexts, and if there are no matches, we generate suggestions in the
   * subspace defined by the parameters specified here.
   * NOTE: a Context without any Parameters matches the entire feasible search
   *   space.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Trial.Parameter> getParametersList();
  /**
   *
   *
   * <pre>
   * If/when a Trial is generated or selected from this Context,
   * its Parameters will match any parameters specified here.
   * (I.e. if this context specifies parameter name:'a' int_value:3,
   * then a resulting Trial will have int_value:3 for its parameter named
   * 'a'.) Note that we first attempt to match existing REQUESTED Trials with
   * contexts, and if there are no matches, we generate suggestions in the
   * subspace defined by the parameters specified here.
   * NOTE: a Context without any Parameters matches the entire feasible search
   *   space.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 2;</code>
   */
  com.google.cloud.aiplatform.v1.Trial.Parameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * If/when a Trial is generated or selected from this Context,
   * its Parameters will match any parameters specified here.
   * (I.e. if this context specifies parameter name:'a' int_value:3,
   * then a resulting Trial will have int_value:3 for its parameter named
   * 'a'.) Note that we first attempt to match existing REQUESTED Trials with
   * contexts, and if there are no matches, we generate suggestions in the
   * subspace defined by the parameters specified here.
   * NOTE: a Context without any Parameters matches the entire feasible search
   *   space.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 2;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * If/when a Trial is generated or selected from this Context,
   * its Parameters will match any parameters specified here.
   * (I.e. if this context specifies parameter name:'a' int_value:3,
   * then a resulting Trial will have int_value:3 for its parameter named
   * 'a'.) Note that we first attempt to match existing REQUESTED Trials with
   * contexts, and if there are no matches, we generate suggestions in the
   * subspace defined by the parameters specified here.
   * NOTE: a Context without any Parameters matches the entire feasible search
   *   space.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.Trial.ParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * If/when a Trial is generated or selected from this Context,
   * its Parameters will match any parameters specified here.
   * (I.e. if this context specifies parameter name:'a' int_value:3,
   * then a resulting Trial will have int_value:3 for its parameter named
   * 'a'.) Note that we first attempt to match existing REQUESTED Trials with
   * contexts, and if there are no matches, we generate suggestions in the
   * subspace defined by the parameters specified here.
   * NOTE: a Context without any Parameters matches the entire feasible search
   *   space.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Trial.Parameter parameters = 2;</code>
   */
  com.google.cloud.aiplatform.v1.Trial.ParameterOrBuilder getParametersOrBuilder(int index);
}
