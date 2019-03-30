// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface QueryParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.QueryParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Optional. The time zone of this conversational query from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris. If not provided, the time zone specified in
   * agent settings is used.
   * </pre>
   *
   * <code>string time_zone = 1;</code>
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  boolean hasGeoLocation();
  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLng getGeoLocation();
  /**
   *
   *
   * <pre>
   * Optional. The geo location of this conversational query.
   * </pre>
   *
   * <code>.google.type.LatLng geo_location = 2;</code>
   */
  com.google.type.LatLngOrBuilder getGeoLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context contexts = 3;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Context> getContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2.Context getContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context contexts = 3;</code>
   */
  int getContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context contexts = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.ContextOrBuilder>
      getContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts to be activated before this query is
   * executed.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Context contexts = 3;</code>
   */
  com.google.cloud.dialogflow.v2.ContextOrBuilder getContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Specifies whether to delete all contexts in the current session
   * before the new ones are activated.
   * </pre>
   *
   * <code>bool reset_contexts = 4;</code>
   */
  boolean getResetContexts();

  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.SessionEntityType> getSessionEntityTypesList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 5;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityType getSessionEntityTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 5;</code>
   */
  int getSessionEntityTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder>
      getSessionEntityTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Additional session entity types to replace or extend developer
   * entity types with. The entity synonyms apply to all languages and persist
   * for the session of this query.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.SessionEntityType session_entity_types = 5;</code>
   */
  com.google.cloud.dialogflow.v2.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. This field can be used to pass custom data into the webhook
   * associated with the agent. Arbitrary JSON objects are supported.
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 6;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  boolean hasSentimentAnalysisRequestConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig getSentimentAnalysisRequestConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configures the type of sentiment analysis to perform. If not
   * provided, sentiment analysis is not performed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SentimentAnalysisRequestConfig sentiment_analysis_request_config = 10;
   * </code>
   */
  com.google.cloud.dialogflow.v2.SentimentAnalysisRequestConfigOrBuilder
      getSentimentAnalysisRequestConfigOrBuilder();
}
