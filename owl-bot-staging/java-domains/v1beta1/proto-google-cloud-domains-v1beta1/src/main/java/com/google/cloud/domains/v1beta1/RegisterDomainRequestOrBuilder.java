// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

public interface RegisterDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.RegisterDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource of the `Registration`. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource of the `Registration`. Must be in the
   * format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the registration field is set.
   */
  boolean hasRegistration();
  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The registration.
   */
  com.google.cloud.domains.v1beta1.Registration getRegistration();
  /**
   * <pre>
   * Required. The complete `Registration` resource to be created.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.domains.v1beta1.RegistrationOrBuilder getRegistrationOrBuilder();

  /**
   * <pre>
   * The list of domain notices that you acknowledge. Call
   * `RetrieveRegisterParameters` to see the notices that need acknowledgement.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 3;</code>
   * @return A list containing the domainNotices.
   */
  java.util.List<com.google.cloud.domains.v1beta1.DomainNotice> getDomainNoticesList();
  /**
   * <pre>
   * The list of domain notices that you acknowledge. Call
   * `RetrieveRegisterParameters` to see the notices that need acknowledgement.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 3;</code>
   * @return The count of domainNotices.
   */
  int getDomainNoticesCount();
  /**
   * <pre>
   * The list of domain notices that you acknowledge. Call
   * `RetrieveRegisterParameters` to see the notices that need acknowledgement.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 3;</code>
   * @param index The index of the element to return.
   * @return The domainNotices at the given index.
   */
  com.google.cloud.domains.v1beta1.DomainNotice getDomainNotices(int index);
  /**
   * <pre>
   * The list of domain notices that you acknowledge. Call
   * `RetrieveRegisterParameters` to see the notices that need acknowledgement.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 3;</code>
   * @return A list containing the enum numeric values on the wire for domainNotices.
   */
  java.util.List<java.lang.Integer>
  getDomainNoticesValueList();
  /**
   * <pre>
   * The list of domain notices that you acknowledge. Call
   * `RetrieveRegisterParameters` to see the notices that need acknowledgement.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DomainNotice domain_notices = 3;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of domainNotices at the given index.
   */
  int getDomainNoticesValue(int index);

  /**
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactNotice contact_notices = 4;</code>
   * @return A list containing the contactNotices.
   */
  java.util.List<com.google.cloud.domains.v1beta1.ContactNotice> getContactNoticesList();
  /**
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactNotice contact_notices = 4;</code>
   * @return The count of contactNotices.
   */
  int getContactNoticesCount();
  /**
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactNotice contact_notices = 4;</code>
   * @param index The index of the element to return.
   * @return The contactNotices at the given index.
   */
  com.google.cloud.domains.v1beta1.ContactNotice getContactNotices(int index);
  /**
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactNotice contact_notices = 4;</code>
   * @return A list containing the enum numeric values on the wire for contactNotices.
   */
  java.util.List<java.lang.Integer>
  getContactNoticesValueList();
  /**
   * <pre>
   * The list of contact notices that the caller acknowledges. The notices
   * needed here depend on the values specified in
   * `registration.contact_settings`.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactNotice contact_notices = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of contactNotices at the given index.
   */
  int getContactNoticesValue(int index);

  /**
   * <pre>
   * Required. Yearly price to register or renew the domain.
   * The value that should be put here can be obtained from
   * RetrieveRegisterParameters or SearchDomains calls.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the yearlyPrice field is set.
   */
  boolean hasYearlyPrice();
  /**
   * <pre>
   * Required. Yearly price to register or renew the domain.
   * The value that should be put here can be obtained from
   * RetrieveRegisterParameters or SearchDomains calls.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The yearlyPrice.
   */
  com.google.type.Money getYearlyPrice();
  /**
   * <pre>
   * Required. Yearly price to register or renew the domain.
   * The value that should be put here can be obtained from
   * RetrieveRegisterParameters or SearchDomains calls.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.MoneyOrBuilder getYearlyPriceOrBuilder();

  /**
   * <pre>
   * When true, only validation is performed, without actually registering
   * the domain. Follows:
   * https://cloud.google.com/apis/design/design_patterns#request_validation
   * </pre>
   *
   * <code>bool validate_only = 6;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
