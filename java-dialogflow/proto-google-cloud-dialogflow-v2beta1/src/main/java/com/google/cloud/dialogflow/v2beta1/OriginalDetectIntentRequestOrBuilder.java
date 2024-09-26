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
// source: google/cloud/dialogflow/v2beta1/webhook.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.v2beta1;

public interface OriginalDetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.OriginalDetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The source of this request, e.g., `google`, `facebook`, `slack`. It is set
   * by Dialogflow-owned servers.
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Optional. The version of the protocol used for this request.
   * This field is AoG-specific.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of the protocol used for this request.
   * This field is AoG-specific.
   * </pre>
   *
   * <code>string version = 2;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. This field is set to the value of the `QueryParameters.payload`
   * field passed in the request. Some integrations that query a Dialogflow
   * agent may provide additional information in the payload.
   *
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be redacted for Trial
   * Edition agents and populated with the caller ID in [E.164
   * format](https://en.wikipedia.org/wiki/E.164) for Essentials Edition agents.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field is set to the value of the `QueryParameters.payload`
   * field passed in the request. Some integrations that query a Dialogflow
   * agent may provide additional information in the payload.
   *
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be redacted for Trial
   * Edition agents and populated with the caller ID in [E.164
   * format](https://en.wikipedia.org/wiki/E.164) for Essentials Edition agents.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field is set to the value of the `QueryParameters.payload`
   * field passed in the request. Some integrations that query a Dialogflow
   * agent may provide additional information in the payload.
   *
   * In particular, for the Dialogflow Phone Gateway integration, this field has
   * the form:
   * &lt;pre&gt;{
   *  "telephony": {
   *    "caller_id": "+18558363987"
   *  }
   * }&lt;/pre&gt;
   * Note: The caller ID field (`caller_id`) will be redacted for Trial
   * Edition agents and populated with the caller ID in [E.164
   * format](https://en.wikipedia.org/wiki/E.164) for Essentials Edition agents.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();
}
