// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public interface GetContextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GetContextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the context. Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;/contexts/&lt;Context ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;/contexts/&lt;Context ID&gt;`,
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment.
   * If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the context. Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;/contexts/&lt;Context ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;/contexts/&lt;Context ID&gt;`,
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment.
   * If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
