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
// source: google/cloud/discoveryengine/v1beta/conversation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1beta;

public interface ConversationContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.ConversationContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @return A list containing the contextDocuments.
   */
  java.util.List<java.lang.String> getContextDocumentsList();
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @return The count of contextDocuments.
   */
  int getContextDocumentsCount();
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The contextDocuments at the given index.
   */
  java.lang.String getContextDocuments(int index);
  /**
   *
   *
   * <pre>
   * The current list of documents the user is seeing.
   * It contains the document resource references.
   * </pre>
   *
   * <code>repeated string context_documents = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the contextDocuments at the given index.
   */
  com.google.protobuf.ByteString getContextDocumentsBytes(int index);

  /**
   *
   *
   * <pre>
   * The current active document the user opened.
   * It contains the document resource reference.
   * </pre>
   *
   * <code>string active_document = 2;</code>
   *
   * @return The activeDocument.
   */
  java.lang.String getActiveDocument();
  /**
   *
   *
   * <pre>
   * The current active document the user opened.
   * It contains the document resource reference.
   * </pre>
   *
   * <code>string active_document = 2;</code>
   *
   * @return The bytes for activeDocument.
   */
  com.google.protobuf.ByteString getActiveDocumentBytes();
}
