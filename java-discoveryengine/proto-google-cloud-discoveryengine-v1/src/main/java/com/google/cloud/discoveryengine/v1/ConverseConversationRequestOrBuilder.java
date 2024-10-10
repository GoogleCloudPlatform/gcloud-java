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
// source: google/cloud/discoveryengine/v1/conversational_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface ConverseConversationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ConverseConversationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Conversation to get. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/conversations/{conversation_id}`.
   * Use
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/conversations/-`
   * to activate auto session mode, which automatically creates a new
   * conversation inside a ConverseConversation session.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Conversation to get. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/conversations/{conversation_id}`.
   * Use
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/conversations/-`
   * to activate auto session mode, which automatically creates a new
   * conversation inside a ConverseConversation session.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Current user input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TextInput query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * Required. Current user input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TextInput query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The query.
   */
  com.google.cloud.discoveryengine.v1.TextInput getQuery();
  /**
   *
   *
   * <pre>
   * Required. Current user input.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.TextInput query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1.TextInputOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the Serving Config to use. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/servingConfigs/{serving_config_id}`
   * If this is not set, the default serving config will be used.
   * </pre>
   *
   * <code>string serving_config = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The servingConfig.
   */
  java.lang.String getServingConfig();
  /**
   *
   *
   * <pre>
   * The resource name of the Serving Config to use. Format:
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store_id}/servingConfigs/{serving_config_id}`
   * If this is not set, the default serving config will be used.
   * </pre>
   *
   * <code>string serving_config = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for servingConfig.
   */
  com.google.protobuf.ByteString getServingConfigBytes();

  /**
   *
   *
   * <pre>
   * The conversation to be used by auto session only. The name field will be
   * ignored as we automatically assign new name for the conversation in auto
   * session.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 5;</code>
   *
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   *
   *
   * <pre>
   * The conversation to be used by auto session only. The name field will be
   * ignored as we automatically assign new name for the conversation in auto
   * session.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 5;</code>
   *
   * @return The conversation.
   */
  com.google.cloud.discoveryengine.v1.Conversation getConversation();
  /**
   *
   *
   * <pre>
   * The conversation to be used by auto session only. The name field will be
   * ignored as we automatically assign new name for the conversation in auto
   * session.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.Conversation conversation = 5;</code>
   */
  com.google.cloud.discoveryengine.v1.ConversationOrBuilder getConversationOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether to turn on safe search.
   * </pre>
   *
   * <code>bool safe_search = 6;</code>
   *
   * @return The safeSearch.
   */
  boolean getSafeSearch();

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A specification for configuring the summary returned in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.SummarySpec summary_spec = 8;
   * </code>
   *
   * @return Whether the summarySpec field is set.
   */
  boolean hasSummarySpec();
  /**
   *
   *
   * <pre>
   * A specification for configuring the summary returned in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.SummarySpec summary_spec = 8;
   * </code>
   *
   * @return The summarySpec.
   */
  com.google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.SummarySpec getSummarySpec();
  /**
   *
   *
   * <pre>
   * A specification for configuring the summary returned in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.SummarySpec summary_spec = 8;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.SearchRequest.ContentSearchSpec.SummarySpecOrBuilder
      getSummarySpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the documents being filtered. Filter
   * expression is case-sensitive. This will be used to filter search results
   * which may affect the summary response.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   *
   * Filtering in Vertex AI Search is done by mapping the LHS filter key to a
   * key property defined in the Vertex AI Search backend -- this mapping is
   * defined by the customer in their schema. For example a media customer might
   * have a field 'name' in their schema. In this case the filter would look
   * like this: filter --&gt; name:'ANY("king kong")'
   *
   * For more information about filtering including syntax and filter
   * operators, see
   * [Filter](https://cloud.google.com/generative-ai-app-builder/docs/filter-search-metadata)
   * </pre>
   *
   * <code>string filter = 9;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the documents being filtered. Filter
   * expression is case-sensitive. This will be used to filter search results
   * which may affect the summary response.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   *
   * Filtering in Vertex AI Search is done by mapping the LHS filter key to a
   * key property defined in the Vertex AI Search backend -- this mapping is
   * defined by the customer in their schema. For example a media customer might
   * have a field 'name' in their schema. In this case the filter would look
   * like this: filter --&gt; name:'ANY("king kong")'
   *
   * For more information about filtering including syntax and filter
   * operators, see
   * [Filter](https://cloud.google.com/generative-ai-app-builder/docs/filter-search-metadata)
   * </pre>
   *
   * <code>string filter = 9;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents in search results which may
   * affect the converse response. For more information on boosting, see
   * [Boosting](https://cloud.google.com/retail/docs/boosting#boost)
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchRequest.BoostSpec boost_spec = 10;</code>
   *
   * @return Whether the boostSpec field is set.
   */
  boolean hasBoostSpec();
  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents in search results which may
   * affect the converse response. For more information on boosting, see
   * [Boosting](https://cloud.google.com/retail/docs/boosting#boost)
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchRequest.BoostSpec boost_spec = 10;</code>
   *
   * @return The boostSpec.
   */
  com.google.cloud.discoveryengine.v1.SearchRequest.BoostSpec getBoostSpec();
  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents in search results which may
   * affect the converse response. For more information on boosting, see
   * [Boosting](https://cloud.google.com/retail/docs/boosting#boost)
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.SearchRequest.BoostSpec boost_spec = 10;</code>
   */
  com.google.cloud.discoveryengine.v1.SearchRequest.BoostSpecOrBuilder getBoostSpecOrBuilder();
}
