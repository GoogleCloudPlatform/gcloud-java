// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommendationengine/v1beta1/user_event.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface UserEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.UserEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. User event type. Allowed values are:
   *
   * * `add-to-cart` Products being added to cart.
   * * `add-to-list` Items being added to a list (shopping list, favorites
   *   etc).
   * * `category-page-view` Special pages such as sale or promotion pages
   *   viewed.
   * * `checkout-start` User starting a checkout process.
   * * `detail-page-view` Products detail page viewed.
   * * `home-page-view` Homepage viewed.
   * * `page-visit` Generic page visits not included in the event types above.
   * * `purchase-complete` User finishing a purchase.
   * * `refund` Purchased items being refunded or returned.
   * * `remove-from-cart` Products being removed from cart.
   * * `remove-from-list` Items being removed from a list.
   * * `search` Product search.
   * * `shopping-cart-page-view` User viewing a shopping cart.
   * * `impression` List of items displayed. Used by Google Tag Manager.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * Required. User event type. Allowed values are:
   *
   * * `add-to-cart` Products being added to cart.
   * * `add-to-list` Items being added to a list (shopping list, favorites
   *   etc).
   * * `category-page-view` Special pages such as sale or promotion pages
   *   viewed.
   * * `checkout-start` User starting a checkout process.
   * * `detail-page-view` Products detail page viewed.
   * * `home-page-view` Homepage viewed.
   * * `page-visit` Generic page visits not included in the event types above.
   * * `purchase-complete` User finishing a purchase.
   * * `refund` Purchased items being refunded or returned.
   * * `remove-from-cart` Products being removed from cart.
   * * `remove-from-list` Items being removed from a list.
   * * `search` Product search.
   * * `shopping-cart-page-view` User viewing a shopping cart.
   * * `impression` List of items displayed. Used by Google Tag Manager.
   * </pre>
   *
   * <code>string event_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * Required. User information.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserInfo user_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   * <pre>
   * Required. User information.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserInfo user_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The userInfo.
   */
  com.google.cloud.recommendationengine.v1beta1.UserInfo getUserInfo();
  /**
   * <pre>
   * Required. User information.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserInfo user_info = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.recommendationengine.v1beta1.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   * <pre>
   * Optional. User event detailed information common across different
   * recommendation types.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.EventDetail event_detail = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the eventDetail field is set.
   */
  boolean hasEventDetail();
  /**
   * <pre>
   * Optional. User event detailed information common across different
   * recommendation types.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.EventDetail event_detail = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The eventDetail.
   */
  com.google.cloud.recommendationengine.v1beta1.EventDetail getEventDetail();
  /**
   * <pre>
   * Optional. User event detailed information common across different
   * recommendation types.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.EventDetail event_detail = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.recommendationengine.v1beta1.EventDetailOrBuilder getEventDetailOrBuilder();

  /**
   * <pre>
   * Optional. Retail product specific user event metadata.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `category-page-view`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   * * `search`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_event_detail' should be
   *   set for this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `home-page-view`
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ProductEventDetail product_event_detail = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the productEventDetail field is set.
   */
  boolean hasProductEventDetail();
  /**
   * <pre>
   * Optional. Retail product specific user event metadata.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `category-page-view`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   * * `search`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_event_detail' should be
   *   set for this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `home-page-view`
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ProductEventDetail product_event_detail = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The productEventDetail.
   */
  com.google.cloud.recommendationengine.v1beta1.ProductEventDetail getProductEventDetail();
  /**
   * <pre>
   * Optional. Retail product specific user event metadata.
   *
   * This field is required for the following event types:
   *
   * * `add-to-cart`
   * * `add-to-list`
   * * `category-page-view`
   * * `checkout-start`
   * * `detail-page-view`
   * * `purchase-complete`
   * * `refund`
   * * `remove-from-cart`
   * * `remove-from-list`
   * * `search`
   *
   * This field is optional for the following event types:
   *
   * * `page-visit`
   * * `shopping-cart-page-view` - note that 'product_event_detail' should be
   *   set for this unless the shopping cart is empty.
   *
   * This field is not allowed for the following event types:
   *
   * * `home-page-view`
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.ProductEventDetail product_event_detail = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.recommendationengine.v1beta1.ProductEventDetailOrBuilder getProductEventDetailOrBuilder();

  /**
   * <pre>
   * Optional. Only required for ImportUserEvents method. Timestamp of user
   * event created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Optional. Only required for ImportUserEvents method. Timestamp of user
   * event created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * Optional. Only required for ImportUserEvents method. Timestamp of user
   * event created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * Optional. This field should *not* be set when using JavaScript pixel
   * or the Recommendations AI Tag. Defaults to `EVENT_SOURCE_UNSPECIFIED`.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserEvent.EventSource event_source = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for eventSource.
   */
  int getEventSourceValue();
  /**
   * <pre>
   * Optional. This field should *not* be set when using JavaScript pixel
   * or the Recommendations AI Tag. Defaults to `EVENT_SOURCE_UNSPECIFIED`.
   * </pre>
   *
   * <code>.google.cloud.recommendationengine.v1beta1.UserEvent.EventSource event_source = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The eventSource.
   */
  com.google.cloud.recommendationengine.v1beta1.UserEvent.EventSource getEventSource();
}
