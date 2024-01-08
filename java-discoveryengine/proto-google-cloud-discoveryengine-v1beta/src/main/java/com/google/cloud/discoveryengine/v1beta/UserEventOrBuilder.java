/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1beta/user_event.proto

package com.google.cloud.discoveryengine.v1beta;

public interface UserEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.UserEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. User event type. Allowed values are:
   *
   * Generic values:
   *
   * * `search`: Search for Documents.
   * * `view-item`: Detailed page view of a Document.
   * * `view-item-list`: View of a panel or ordered list of Documents.
   * * `view-home-page`: View of the home page.
   * * `view-category-page`: View of a category page, e.g. Home &gt; Men &gt; Jeans
   *
   * Retail-related values:
   *
   * * `add-to-cart`: Add an item(s) to cart, e.g. in Retail online shopping
   * * `purchase`: Purchase an item(s)
   *
   * Media-related values:
   *
   * * `media-play`: Start/resume watching a video, playing a song, etc.
   * * `media-complete`: Finished or stopped midway through a video, song, etc.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   *
   *
   * <pre>
   * Required. User event type. Allowed values are:
   *
   * Generic values:
   *
   * * `search`: Search for Documents.
   * * `view-item`: Detailed page view of a Document.
   * * `view-item-list`: View of a panel or ordered list of Documents.
   * * `view-home-page`: View of the home page.
   * * `view-category-page`: View of a category page, e.g. Home &gt; Men &gt; Jeans
   *
   * Retail-related values:
   *
   * * `add-to-cart`: Add an item(s) to cart, e.g. in Retail online shopping
   * * `purchase`: Purchase an item(s)
   *
   * Media-related values:
   *
   * * `media-play`: Start/resume watching a video, playing a song, etc.
   * * `media-complete`: Finished or stopped midway through a video, song, etc.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString getEventTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. A unique identifier for tracking visitors.
   *
   * For example, this could be implemented with an HTTP cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   *
   * Do not set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded model
   * quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * The field should not contain PII or user-data. We recommend to use Google
   * Analytics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#clientId)
   * for this field.
   * </pre>
   *
   * <code>string user_pseudo_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userPseudoId.
   */
  java.lang.String getUserPseudoId();
  /**
   *
   *
   * <pre>
   * Required. A unique identifier for tracking visitors.
   *
   * For example, this could be implemented with an HTTP cookie, which should be
   * able to uniquely identify a visitor on a single device. This unique
   * identifier should not change if the visitor log in/out of the website.
   *
   * Do not set the field to the same fixed ID for different users. This mixes
   * the event history of those users together, which results in degraded model
   * quality.
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
   *
   * The field should not contain PII or user-data. We recommend to use Google
   * Analytics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#clientId)
   * for this field.
   * </pre>
   *
   * <code>string user_pseudo_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for userPseudoId.
   */
  com.google.protobuf.ByteString getUserPseudoIdBytes();

  /**
   *
   *
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.discoveryengine.v1beta.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.discoveryengine.v1beta.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * Only required for
   * [UserEventService.ImportUserEvents][google.cloud.discoveryengine.v1beta.UserEventService.ImportUserEvents]
   * method. Timestamp of when the user event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the end user.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 4;</code>
   *
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   *
   *
   * <pre>
   * Information about the end user.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 4;</code>
   *
   * @return The userInfo.
   */
  com.google.cloud.discoveryengine.v1beta.UserInfo getUserInfo();
  /**
   *
   *
   * <pre>
   * Information about the end user.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 4;</code>
   */
  com.google.cloud.discoveryengine.v1beta.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Should set to true if the request is made directly from the end user, in
   * which case the
   * [UserEvent.user_info.user_agent][google.cloud.discoveryengine.v1beta.UserInfo.user_agent]
   * can be populated from the HTTP request.
   *
   * This flag should be set only if the API request is made directly from the
   * end user such as a mobile app (and not if a gateway or a server is
   * processing and pushing the user events).
   *
   * This should not be set when using the JavaScript tag in
   * [UserEventService.CollectUserEvent][google.cloud.discoveryengine.v1beta.UserEventService.CollectUserEvent].
   * </pre>
   *
   * <code>bool direct_user_request = 5;</code>
   *
   * @return The directUserRequest.
   */
  boolean getDirectUserRequest();

  /**
   *
   *
   * <pre>
   * A unique identifier for tracking a visitor session with a length limit of
   * 128 bytes. A session is an aggregation of an end user behavior in a time
   * span.
   *
   * A general guideline to populate the session_id:
   *
   * 1. If user has no activity for 30 min, a new session_id should be assigned.
   * 2. The session_id should be unique across users, suggest use uuid or add
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * as prefix.
   * </pre>
   *
   * <code>string session_id = 6;</code>
   *
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   *
   *
   * <pre>
   * A unique identifier for tracking a visitor session with a length limit of
   * 128 bytes. A session is an aggregation of an end user behavior in a time
   * span.
   *
   * A general guideline to populate the session_id:
   *
   * 1. If user has no activity for 30 min, a new session_id should be assigned.
   * 2. The session_id should be unique across users, suggest use uuid or add
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * as prefix.
   * </pre>
   *
   * <code>string session_id = 6;</code>
   *
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString getSessionIdBytes();

  /**
   *
   *
   * <pre>
   * Page metadata such as categories and other critical information for certain
   * event types such as `view-category-page`.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PageInfo page_info = 7;</code>
   *
   * @return Whether the pageInfo field is set.
   */
  boolean hasPageInfo();
  /**
   *
   *
   * <pre>
   * Page metadata such as categories and other critical information for certain
   * event types such as `view-category-page`.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PageInfo page_info = 7;</code>
   *
   * @return The pageInfo.
   */
  com.google.cloud.discoveryengine.v1beta.PageInfo getPageInfo();
  /**
   *
   *
   * <pre>
   * Page metadata such as categories and other critical information for certain
   * event types such as `view-category-page`.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PageInfo page_info = 7;</code>
   */
  com.google.cloud.discoveryengine.v1beta.PageInfoOrBuilder getPageInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Token to attribute an API response to user action(s) to trigger the event.
   *
   * Highly recommended for user events that are the result of
   * [RecommendationService.Recommend][google.cloud.discoveryengine.v1beta.RecommendationService.Recommend].
   * This field enables accurate attribution of recommendation model
   * performance.
   *
   * The value must be one of:
   *
   * * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token] for events that are the result of
   * [RecommendationService.Recommend][google.cloud.discoveryengine.v1beta.RecommendationService.Recommend].
   * * [SearchResponse.attribution_token][google.cloud.discoveryengine.v1beta.SearchResponse.attribution_token] for events that are the result of
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search].
   *
   * This token enables us to accurately attribute page view or conversion
   * completion back to the event and the particular predict response containing
   * this clicked/purchased product. If user clicks on product K in the
   * recommendation results, pass
   * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token]
   * as a URL parameter to product K's page. When recording events on product
   * K's page, log the
   * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token]
   * to this field.
   * </pre>
   *
   * <code>string attribution_token = 8;</code>
   *
   * @return The attributionToken.
   */
  java.lang.String getAttributionToken();
  /**
   *
   *
   * <pre>
   * Token to attribute an API response to user action(s) to trigger the event.
   *
   * Highly recommended for user events that are the result of
   * [RecommendationService.Recommend][google.cloud.discoveryengine.v1beta.RecommendationService.Recommend].
   * This field enables accurate attribution of recommendation model
   * performance.
   *
   * The value must be one of:
   *
   * * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token] for events that are the result of
   * [RecommendationService.Recommend][google.cloud.discoveryengine.v1beta.RecommendationService.Recommend].
   * * [SearchResponse.attribution_token][google.cloud.discoveryengine.v1beta.SearchResponse.attribution_token] for events that are the result of
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search].
   *
   * This token enables us to accurately attribute page view or conversion
   * completion back to the event and the particular predict response containing
   * this clicked/purchased product. If user clicks on product K in the
   * recommendation results, pass
   * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token]
   * as a URL parameter to product K's page. When recording events on product
   * K's page, log the
   * [RecommendResponse.attribution_token][google.cloud.discoveryengine.v1beta.RecommendResponse.attribution_token]
   * to this field.
   * </pre>
   *
   * <code>string attribution_token = 8;</code>
   *
   * @return The bytes for attributionToken.
   */
  com.google.protobuf.ByteString getAttributionTokenBytes();

  /**
   *
   *
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the documents being filtered.
   *
   * One example is for `search` events, the associated
   * [SearchRequest][google.cloud.discoveryengine.v1beta.SearchRequest] may
   * contain a filter expression in
   * [SearchRequest.filter][google.cloud.discoveryengine.v1beta.SearchRequest.filter]
   * conforming to https://google.aip.dev/160#filtering.
   *
   * Similarly, for `view-item-list` events that are generated from a
   * [RecommendationService.RecommendRequest][], this field may be populated
   * directly from [RecommendationService.RecommendRequest.filter][] conforming
   * to https://google.aip.dev/160#filtering.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
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
   * predicate from one or more fields of the documents being filtered.
   *
   * One example is for `search` events, the associated
   * [SearchRequest][google.cloud.discoveryengine.v1beta.SearchRequest] may
   * contain a filter expression in
   * [SearchRequest.filter][google.cloud.discoveryengine.v1beta.SearchRequest.filter]
   * conforming to https://google.aip.dev/160#filtering.
   *
   * Similarly, for `view-item-list` events that are generated from a
   * [RecommendationService.RecommendRequest][], this field may be populated
   * directly from [RecommendationService.RecommendRequest.filter][] conforming
   * to https://google.aip.dev/160#filtering.
   *
   * The value must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an `INVALID_ARGUMENT` error is returned.
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
   * List of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * associated with this user event.
   *
   * This field is optional except for the following event types:
   *
   * * `view-item`
   * * `add-to-cart`
   * * `purchase`
   * * `media-play`
   * * `media-complete`
   *
   * In a `search` event, this field represents the documents returned to the
   * end user on the current page (the end user may have not finished browsing
   * the whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [UserEvent.documents][google.cloud.discoveryengine.v1beta.UserEvent.documents]
   * is desired.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.DocumentInfo documents = 10;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.DocumentInfo> getDocumentsList();
  /**
   *
   *
   * <pre>
   * List of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * associated with this user event.
   *
   * This field is optional except for the following event types:
   *
   * * `view-item`
   * * `add-to-cart`
   * * `purchase`
   * * `media-play`
   * * `media-complete`
   *
   * In a `search` event, this field represents the documents returned to the
   * end user on the current page (the end user may have not finished browsing
   * the whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [UserEvent.documents][google.cloud.discoveryengine.v1beta.UserEvent.documents]
   * is desired.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.DocumentInfo documents = 10;</code>
   */
  com.google.cloud.discoveryengine.v1beta.DocumentInfo getDocuments(int index);
  /**
   *
   *
   * <pre>
   * List of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * associated with this user event.
   *
   * This field is optional except for the following event types:
   *
   * * `view-item`
   * * `add-to-cart`
   * * `purchase`
   * * `media-play`
   * * `media-complete`
   *
   * In a `search` event, this field represents the documents returned to the
   * end user on the current page (the end user may have not finished browsing
   * the whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [UserEvent.documents][google.cloud.discoveryengine.v1beta.UserEvent.documents]
   * is desired.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.DocumentInfo documents = 10;</code>
   */
  int getDocumentsCount();
  /**
   *
   *
   * <pre>
   * List of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * associated with this user event.
   *
   * This field is optional except for the following event types:
   *
   * * `view-item`
   * * `add-to-cart`
   * * `purchase`
   * * `media-play`
   * * `media-complete`
   *
   * In a `search` event, this field represents the documents returned to the
   * end user on the current page (the end user may have not finished browsing
   * the whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [UserEvent.documents][google.cloud.discoveryengine.v1beta.UserEvent.documents]
   * is desired.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.DocumentInfo documents = 10;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.DocumentInfoOrBuilder>
      getDocumentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * associated with this user event.
   *
   * This field is optional except for the following event types:
   *
   * * `view-item`
   * * `add-to-cart`
   * * `purchase`
   * * `media-play`
   * * `media-complete`
   *
   * In a `search` event, this field represents the documents returned to the
   * end user on the current page (the end user may have not finished browsing
   * the whole page yet). When a new page is returned to the end user, after
   * pagination/filtering/ordering even for the same query, a new `search` event
   * with different
   * [UserEvent.documents][google.cloud.discoveryengine.v1beta.UserEvent.documents]
   * is desired.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.DocumentInfo documents = 10;</code>
   */
  com.google.cloud.discoveryengine.v1beta.DocumentInfoOrBuilder getDocumentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Panel metadata associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PanelInfo panel = 11;</code>
   *
   * @return Whether the panel field is set.
   */
  boolean hasPanel();
  /**
   *
   *
   * <pre>
   * Panel metadata associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PanelInfo panel = 11;</code>
   *
   * @return The panel.
   */
  com.google.cloud.discoveryengine.v1beta.PanelInfo getPanel();
  /**
   *
   *
   * <pre>
   * Panel metadata associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.PanelInfo panel = 11;</code>
   */
  com.google.cloud.discoveryengine.v1beta.PanelInfoOrBuilder getPanelOrBuilder();

  /**
   *
   *
   * <pre>
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * details related to the event.
   *
   * This field should be set for `search` event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchInfo search_info = 12;</code>
   *
   * @return Whether the searchInfo field is set.
   */
  boolean hasSearchInfo();
  /**
   *
   *
   * <pre>
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * details related to the event.
   *
   * This field should be set for `search` event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchInfo search_info = 12;</code>
   *
   * @return The searchInfo.
   */
  com.google.cloud.discoveryengine.v1beta.SearchInfo getSearchInfo();
  /**
   *
   *
   * <pre>
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * details related to the event.
   *
   * This field should be set for `search` event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchInfo search_info = 12;</code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchInfoOrBuilder getSearchInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * [CompletionService.CompleteQuery][google.cloud.discoveryengine.v1beta.CompletionService.CompleteQuery]
   * details related to the event.
   *
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CompletionInfo completion_info = 13;</code>
   *
   * @return Whether the completionInfo field is set.
   */
  boolean hasCompletionInfo();
  /**
   *
   *
   * <pre>
   * [CompletionService.CompleteQuery][google.cloud.discoveryengine.v1beta.CompletionService.CompleteQuery]
   * details related to the event.
   *
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CompletionInfo completion_info = 13;</code>
   *
   * @return The completionInfo.
   */
  com.google.cloud.discoveryengine.v1beta.CompletionInfo getCompletionInfo();
  /**
   *
   *
   * <pre>
   * [CompletionService.CompleteQuery][google.cloud.discoveryengine.v1beta.CompletionService.CompleteQuery]
   * details related to the event.
   *
   * This field should be set for `search` event when autocomplete function is
   * enabled and the user clicks a suggestion for search.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CompletionInfo completion_info = 13;</code>
   */
  com.google.cloud.discoveryengine.v1beta.CompletionInfoOrBuilder getCompletionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The transaction metadata (if any) associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.TransactionInfo transaction_info = 14;</code>
   *
   * @return Whether the transactionInfo field is set.
   */
  boolean hasTransactionInfo();
  /**
   *
   *
   * <pre>
   * The transaction metadata (if any) associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.TransactionInfo transaction_info = 14;</code>
   *
   * @return The transactionInfo.
   */
  com.google.cloud.discoveryengine.v1beta.TransactionInfo getTransactionInfo();
  /**
   *
   *
   * <pre>
   * The transaction metadata (if any) associated with this user event.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.TransactionInfo transaction_info = 14;</code>
   */
  com.google.cloud.discoveryengine.v1beta.TransactionInfoOrBuilder getTransactionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups on the customer end.
   * </pre>
   *
   * <code>repeated string tag_ids = 15;</code>
   *
   * @return A list containing the tagIds.
   */
  java.util.List<java.lang.String> getTagIdsList();
  /**
   *
   *
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups on the customer end.
   * </pre>
   *
   * <code>repeated string tag_ids = 15;</code>
   *
   * @return The count of tagIds.
   */
  int getTagIdsCount();
  /**
   *
   *
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups on the customer end.
   * </pre>
   *
   * <code>repeated string tag_ids = 15;</code>
   *
   * @param index The index of the element to return.
   * @return The tagIds at the given index.
   */
  java.lang.String getTagIds(int index);
  /**
   *
   *
   * <pre>
   * A list of identifiers for the independent experiment groups this user event
   * belongs to. This is used to distinguish between user events associated with
   * different experiment setups on the customer end.
   * </pre>
   *
   * <code>repeated string tag_ids = 15;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tagIds at the given index.
   */
  com.google.protobuf.ByteString getTagIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The promotion IDs if this is an event associated with promotions.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 16;</code>
   *
   * @return A list containing the promotionIds.
   */
  java.util.List<java.lang.String> getPromotionIdsList();
  /**
   *
   *
   * <pre>
   * The promotion IDs if this is an event associated with promotions.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 16;</code>
   *
   * @return The count of promotionIds.
   */
  int getPromotionIdsCount();
  /**
   *
   *
   * <pre>
   * The promotion IDs if this is an event associated with promotions.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The promotionIds at the given index.
   */
  java.lang.String getPromotionIds(int index);
  /**
   *
   *
   * <pre>
   * The promotion IDs if this is an event associated with promotions.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 16;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the promotionIds at the given index.
   */
  com.google.protobuf.ByteString getPromotionIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Extra user event features to include in the recommendation model.
   * These attributes must NOT contain data that needs to be parsed or processed
   * further, e.g. JSON or other encodings.
   *
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Discovery Engine API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   *
   * This field needs to pass all below criteria, otherwise an
   * `INVALID_ARGUMENT` error is returned:
   *
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   *
   * For product recommendations, an example of extra user information is
   * `traffic_channel`, which is how a user arrives at the site. Users can
   * arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.discoveryengine.v1beta.CustomAttribute&gt; attributes = 17;
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Extra user event features to include in the recommendation model.
   * These attributes must NOT contain data that needs to be parsed or processed
   * further, e.g. JSON or other encodings.
   *
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Discovery Engine API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   *
   * This field needs to pass all below criteria, otherwise an
   * `INVALID_ARGUMENT` error is returned:
   *
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   *
   * For product recommendations, an example of extra user information is
   * `traffic_channel`, which is how a user arrives at the site. Users can
   * arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.discoveryengine.v1beta.CustomAttribute&gt; attributes = 17;
   * </code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.discoveryengine.v1beta.CustomAttribute>
      getAttributes();
  /**
   *
   *
   * <pre>
   * Extra user event features to include in the recommendation model.
   * These attributes must NOT contain data that needs to be parsed or processed
   * further, e.g. JSON or other encodings.
   *
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Discovery Engine API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   *
   * This field needs to pass all below criteria, otherwise an
   * `INVALID_ARGUMENT` error is returned:
   *
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   *
   * For product recommendations, an example of extra user information is
   * `traffic_channel`, which is how a user arrives at the site. Users can
   * arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.discoveryengine.v1beta.CustomAttribute&gt; attributes = 17;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.discoveryengine.v1beta.CustomAttribute>
      getAttributesMap();
  /**
   *
   *
   * <pre>
   * Extra user event features to include in the recommendation model.
   * These attributes must NOT contain data that needs to be parsed or processed
   * further, e.g. JSON or other encodings.
   *
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Discovery Engine API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   *
   * This field needs to pass all below criteria, otherwise an
   * `INVALID_ARGUMENT` error is returned:
   *
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   *
   * For product recommendations, an example of extra user information is
   * `traffic_channel`, which is how a user arrives at the site. Users can
   * arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.discoveryengine.v1beta.CustomAttribute&gt; attributes = 17;
   * </code>
   */
  /* nullable */
  com.google.cloud.discoveryengine.v1beta.CustomAttribute getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.discoveryengine.v1beta.CustomAttribute defaultValue);
  /**
   *
   *
   * <pre>
   * Extra user event features to include in the recommendation model.
   * These attributes must NOT contain data that needs to be parsed or processed
   * further, e.g. JSON or other encodings.
   *
   * If you provide custom attributes for ingested user events, also include
   * them in the user events that you associate with prediction requests. Custom
   * attribute formatting must be consistent between imported events and events
   * provided with prediction requests. This lets the Discovery Engine API use
   * those custom attributes when training models and serving predictions, which
   * helps improve recommendation quality.
   *
   * This field needs to pass all below criteria, otherwise an
   * `INVALID_ARGUMENT` error is returned:
   *
   * * The key must be a UTF-8 encoded string with a length limit of 5,000
   *   characters.
   * * For text attributes, at most 400 values are allowed. Empty values are not
   *   allowed. Each value must be a UTF-8 encoded string with a length limit of
   *   256 characters.
   * * For number attributes, at most 400 values are allowed.
   *
   * For product recommendations, an example of extra user information is
   * `traffic_channel`, which is how a user arrives at the site. Users can
   * arrive
   * at the site by coming to the site directly, coming through Google
   * search, or in other ways.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.discoveryengine.v1beta.CustomAttribute&gt; attributes = 17;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.CustomAttribute getAttributesOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Media-specific info.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.MediaInfo media_info = 18;</code>
   *
   * @return Whether the mediaInfo field is set.
   */
  boolean hasMediaInfo();
  /**
   *
   *
   * <pre>
   * Media-specific info.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.MediaInfo media_info = 18;</code>
   *
   * @return The mediaInfo.
   */
  com.google.cloud.discoveryengine.v1beta.MediaInfo getMediaInfo();
  /**
   *
   *
   * <pre>
   * Media-specific info.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.MediaInfo media_info = 18;</code>
   */
  com.google.cloud.discoveryengine.v1beta.MediaInfoOrBuilder getMediaInfoOrBuilder();
}
