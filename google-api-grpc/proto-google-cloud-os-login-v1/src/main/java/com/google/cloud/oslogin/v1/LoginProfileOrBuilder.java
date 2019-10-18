// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

public interface LoginProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.LoginProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A unique user ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. A unique user ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The list of POSIX accounts associated with the user.
   * </pre>
   *
   * <code>repeated .google.cloud.oslogin.common.PosixAccount posix_accounts = 2;</code>
   */
  java.util.List<com.google.cloud.oslogin.common.OsLoginProto.PosixAccount> getPosixAccountsList();
  /**
   *
   *
   * <pre>
   * The list of POSIX accounts associated with the user.
   * </pre>
   *
   * <code>repeated .google.cloud.oslogin.common.PosixAccount posix_accounts = 2;</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.PosixAccount getPosixAccounts(int index);
  /**
   *
   *
   * <pre>
   * The list of POSIX accounts associated with the user.
   * </pre>
   *
   * <code>repeated .google.cloud.oslogin.common.PosixAccount posix_accounts = 2;</code>
   */
  int getPosixAccountsCount();
  /**
   *
   *
   * <pre>
   * The list of POSIX accounts associated with the user.
   * </pre>
   *
   * <code>repeated .google.cloud.oslogin.common.PosixAccount posix_accounts = 2;</code>
   */
  java.util.List<? extends com.google.cloud.oslogin.common.OsLoginProto.PosixAccountOrBuilder>
      getPosixAccountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of POSIX accounts associated with the user.
   * </pre>
   *
   * <code>repeated .google.cloud.oslogin.common.PosixAccount posix_accounts = 2;</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.PosixAccountOrBuilder getPosixAccountsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A map from SSH public key fingerprint to the associated key object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.oslogin.common.SshPublicKey&gt; ssh_public_keys = 3;</code>
   */
  int getSshPublicKeysCount();
  /**
   *
   *
   * <pre>
   * A map from SSH public key fingerprint to the associated key object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.oslogin.common.SshPublicKey&gt; ssh_public_keys = 3;</code>
   */
  boolean containsSshPublicKeys(java.lang.String key);
  /** Use {@link #getSshPublicKeysMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getSshPublicKeys();
  /**
   *
   *
   * <pre>
   * A map from SSH public key fingerprint to the associated key object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.oslogin.common.SshPublicKey&gt; ssh_public_keys = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey>
      getSshPublicKeysMap();
  /**
   *
   *
   * <pre>
   * A map from SSH public key fingerprint to the associated key object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.oslogin.common.SshPublicKey&gt; ssh_public_keys = 3;</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKeysOrDefault(
      java.lang.String key, com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey defaultValue);
  /**
   *
   *
   * <pre>
   * A map from SSH public key fingerprint to the associated key object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.oslogin.common.SshPublicKey&gt; ssh_public_keys = 3;</code>
   */
  com.google.cloud.oslogin.common.OsLoginProto.SshPublicKey getSshPublicKeysOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Indicates if the user is suspended. A suspended user cannot log in but
   * their profile information is retained.
   * </pre>
   *
   * <code>bool suspended = 4;</code>
   */
  boolean getSuspended();
}
