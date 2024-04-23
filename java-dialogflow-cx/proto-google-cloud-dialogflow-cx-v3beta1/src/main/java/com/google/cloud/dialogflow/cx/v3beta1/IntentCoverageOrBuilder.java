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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface IntentCoverageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.IntentCoverage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of Intents present in the agent
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent intents = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent> getIntentsList();
  /**
   *
   *
   * <pre>
   * The list of Intents present in the agent
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent getIntents(int index);
  /**
   *
   *
   * <pre>
   * The list of Intents present in the agent
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent intents = 1;</code>
   */
  int getIntentsCount();
  /**
   *
   *
   * <pre>
   * The list of Intents present in the agent
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent intents = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.IntentCoverage.IntentOrBuilder>
      getIntentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of Intents present in the agent
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.IntentCoverage.Intent intents = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.IntentCoverage.IntentOrBuilder getIntentsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The percent of intents in the agent that are covered.
   * </pre>
   *
   * <code>float coverage_score = 2;</code>
   *
   * @return The coverageScore.
   */
  float getCoverageScore();
}
