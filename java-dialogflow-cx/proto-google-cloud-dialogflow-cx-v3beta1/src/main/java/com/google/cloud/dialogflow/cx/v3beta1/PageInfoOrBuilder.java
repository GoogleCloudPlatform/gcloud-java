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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface PageInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.PageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * unique identifier of the current page. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page
   * ID&gt;`.
   * </pre>
   *
   * <code>string current_page = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The currentPage.
   */
  java.lang.String getCurrentPage();
  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * unique identifier of the current page. Format: `projects/&lt;Project
   * ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page
   * ID&gt;`.
   * </pre>
   *
   * <code>string current_page = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for currentPage.
   */
  com.google.protobuf.ByteString getCurrentPageBytes();

  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * display name of the current page.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * display name of the current page.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional for both
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest] and
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse].
   * Information about the form.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo.FormInfo form_info = 3;</code>
   *
   * @return Whether the formInfo field is set.
   */
  boolean hasFormInfo();
  /**
   *
   *
   * <pre>
   * Optional for both
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest] and
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse].
   * Information about the form.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo.FormInfo form_info = 3;</code>
   *
   * @return The formInfo.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PageInfo.FormInfo getFormInfo();
  /**
   *
   *
   * <pre>
   * Optional for both
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest] and
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse].
   * Information about the form.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo.FormInfo form_info = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PageInfo.FormInfoOrBuilder getFormInfoOrBuilder();
}
