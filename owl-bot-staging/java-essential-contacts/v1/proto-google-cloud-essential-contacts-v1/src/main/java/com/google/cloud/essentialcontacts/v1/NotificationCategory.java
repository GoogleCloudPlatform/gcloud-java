// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/essentialcontacts/v1/enums.proto

package com.google.cloud.essentialcontacts.v1;

/**
 * <pre>
 * The notification categories that an essential contact can be subscribed to.
 * Each notification will be categorized by the sender into one of the following
 * categories. All contacts that are subscribed to that category will receive
 * the notification.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.essentialcontacts.v1.NotificationCategory}
 */
public enum NotificationCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Notification category is unrecognized or unspecified.
   * </pre>
   *
   * <code>NOTIFICATION_CATEGORY_UNSPECIFIED = 0;</code>
   */
  NOTIFICATION_CATEGORY_UNSPECIFIED(0),
  /**
   * <pre>
   * All notifications related to the resource, including notifications
   * pertaining to categories added in the future.
   * </pre>
   *
   * <code>ALL = 2;</code>
   */
  ALL(2),
  /**
   * <pre>
   * Notifications related to imminent account suspension.
   * </pre>
   *
   * <code>SUSPENSION = 3;</code>
   */
  SUSPENSION(3),
  /**
   * <pre>
   * Notifications related to security/privacy incidents, notifications, and
   * vulnerabilities.
   * </pre>
   *
   * <code>SECURITY = 5;</code>
   */
  SECURITY(5),
  /**
   * <pre>
   * Notifications related to technical events and issues such as outages,
   * errors, or bugs.
   * </pre>
   *
   * <code>TECHNICAL = 6;</code>
   */
  TECHNICAL(6),
  /**
   * <pre>
   * Notifications related to billing and payments notifications, price updates,
   * errors, or credits.
   * </pre>
   *
   * <code>BILLING = 7;</code>
   */
  BILLING(7),
  /**
   * <pre>
   * Notifications related to enforcement actions, regulatory compliance, or
   * government notices.
   * </pre>
   *
   * <code>LEGAL = 8;</code>
   */
  LEGAL(8),
  /**
   * <pre>
   * Notifications related to new versions, product terms updates, or
   * deprecations.
   * </pre>
   *
   * <code>PRODUCT_UPDATES = 9;</code>
   */
  PRODUCT_UPDATES(9),
  /**
   * <pre>
   * Child category of TECHNICAL. If assigned, technical incident notifications
   * will go to these contacts instead of TECHNICAL.
   * </pre>
   *
   * <code>TECHNICAL_INCIDENTS = 10;</code>
   */
  TECHNICAL_INCIDENTS(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Notification category is unrecognized or unspecified.
   * </pre>
   *
   * <code>NOTIFICATION_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int NOTIFICATION_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * All notifications related to the resource, including notifications
   * pertaining to categories added in the future.
   * </pre>
   *
   * <code>ALL = 2;</code>
   */
  public static final int ALL_VALUE = 2;
  /**
   * <pre>
   * Notifications related to imminent account suspension.
   * </pre>
   *
   * <code>SUSPENSION = 3;</code>
   */
  public static final int SUSPENSION_VALUE = 3;
  /**
   * <pre>
   * Notifications related to security/privacy incidents, notifications, and
   * vulnerabilities.
   * </pre>
   *
   * <code>SECURITY = 5;</code>
   */
  public static final int SECURITY_VALUE = 5;
  /**
   * <pre>
   * Notifications related to technical events and issues such as outages,
   * errors, or bugs.
   * </pre>
   *
   * <code>TECHNICAL = 6;</code>
   */
  public static final int TECHNICAL_VALUE = 6;
  /**
   * <pre>
   * Notifications related to billing and payments notifications, price updates,
   * errors, or credits.
   * </pre>
   *
   * <code>BILLING = 7;</code>
   */
  public static final int BILLING_VALUE = 7;
  /**
   * <pre>
   * Notifications related to enforcement actions, regulatory compliance, or
   * government notices.
   * </pre>
   *
   * <code>LEGAL = 8;</code>
   */
  public static final int LEGAL_VALUE = 8;
  /**
   * <pre>
   * Notifications related to new versions, product terms updates, or
   * deprecations.
   * </pre>
   *
   * <code>PRODUCT_UPDATES = 9;</code>
   */
  public static final int PRODUCT_UPDATES_VALUE = 9;
  /**
   * <pre>
   * Child category of TECHNICAL. If assigned, technical incident notifications
   * will go to these contacts instead of TECHNICAL.
   * </pre>
   *
   * <code>TECHNICAL_INCIDENTS = 10;</code>
   */
  public static final int TECHNICAL_INCIDENTS_VALUE = 10;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NotificationCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotificationCategory forNumber(int value) {
    switch (value) {
      case 0: return NOTIFICATION_CATEGORY_UNSPECIFIED;
      case 2: return ALL;
      case 3: return SUSPENSION;
      case 5: return SECURITY;
      case 6: return TECHNICAL;
      case 7: return BILLING;
      case 8: return LEGAL;
      case 9: return PRODUCT_UPDATES;
      case 10: return TECHNICAL_INCIDENTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotificationCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NotificationCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NotificationCategory>() {
          public NotificationCategory findValueByNumber(int number) {
            return NotificationCategory.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final NotificationCategory[] VALUES = values();

  public static NotificationCategory valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NotificationCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.essentialcontacts.v1.NotificationCategory)
}

