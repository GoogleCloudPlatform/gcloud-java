// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/certificate.proto

package com.google.appengine.v1;

public interface ManagedCertificateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ManagedCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   * @return Whether the lastRenewalTime field is set.
   */
  boolean hasLastRenewalTime();
  /**
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   * @return The lastRenewalTime.
   */
  com.google.protobuf.Timestamp getLastRenewalTime();
  /**
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastRenewalTimeOrBuilder();

  /**
   * <pre>
   * Status of certificate management. Refers to the most recent certificate
   * acquisition or renewal attempt.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of certificate management. Refers to the most recent certificate
   * acquisition or renewal attempt.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
   * @return The status.
   */
  com.google.appengine.v1.ManagementStatus getStatus();
}
