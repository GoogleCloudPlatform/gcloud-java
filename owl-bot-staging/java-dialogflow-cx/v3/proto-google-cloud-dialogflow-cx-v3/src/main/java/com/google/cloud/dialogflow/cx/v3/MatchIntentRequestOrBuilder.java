// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface MatchIntentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.MatchIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the session this query is sent to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * It's up to the API caller to choose an appropriate `Session ID`. It can be
   * a random number or some type of session identifiers (preferably hashed).
   * The length of the `Session ID` must not exceed 36 characters.
   * For more information, see the [sessions
   * guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The session.
   */
  java.lang.String getSession();
  /**
   * <pre>
   * Required. The name of the session this query is sent to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment.
   * It's up to the API caller to choose an appropriate `Session ID`. It can be
   * a random number or some type of session identifiers (preferably hashed).
   * The length of the `Session ID` must not exceed 36 characters.
   * For more information, see the [sessions
   * guide](https://cloud.google.com/dialogflow/cx/docs/concept/session).
   * </pre>
   *
   * <code>string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString
      getSessionBytes();

  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryParameters query_params = 2;</code>
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();
  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryParameters query_params = 2;</code>
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.cx.v3.QueryParameters getQueryParams();
  /**
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the queryInput field is set.
   */
  boolean hasQueryInput();
  /**
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The queryInput.
   */
  com.google.cloud.dialogflow.cx.v3.QueryInput getQueryInput();
  /**
   * <pre>
   * Required. The input specification.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   * <pre>
   * Persist session parameter changes from `query_params`.
   * </pre>
   *
   * <code>bool persist_parameter_changes = 5;</code>
   * @return The persistParameterChanges.
   */
  boolean getPersistParameterChanges();
}
