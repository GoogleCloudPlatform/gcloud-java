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
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.metastore.v1beta;

public interface KerberosConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.KerberosConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.Secret keytab = 1;</code>
   *
   * @return Whether the keytab field is set.
   */
  boolean hasKeytab();
  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.Secret keytab = 1;</code>
   *
   * @return The keytab.
   */
  com.google.cloud.metastore.v1beta.Secret getKeytab();
  /**
   *
   *
   * <pre>
   * A Kerberos keytab file that can be used to authenticate a service principal
   * with a Kerberos Key Distribution Center (KDC).
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.Secret keytab = 1;</code>
   */
  com.google.cloud.metastore.v1beta.SecretOrBuilder getKeytabOrBuilder();

  /**
   *
   *
   * <pre>
   * A Kerberos principal that exists in the both the keytab the KDC
   * to authenticate as. A typical principal is of the form
   * `primary/instance&#64;REALM`, but there is no exact format.
   * </pre>
   *
   * <code>string principal = 2;</code>
   *
   * @return The principal.
   */
  java.lang.String getPrincipal();
  /**
   *
   *
   * <pre>
   * A Kerberos principal that exists in the both the keytab the KDC
   * to authenticate as. A typical principal is of the form
   * `primary/instance&#64;REALM`, but there is no exact format.
   * </pre>
   *
   * <code>string principal = 2;</code>
   *
   * @return The bytes for principal.
   */
  com.google.protobuf.ByteString getPrincipalBytes();

  /**
   *
   *
   * <pre>
   * A Cloud Storage URI that specifies the path to a
   * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
   * although the file does not need to be named krb5.conf explicitly.
   * </pre>
   *
   * <code>string krb5_config_gcs_uri = 3;</code>
   *
   * @return The krb5ConfigGcsUri.
   */
  java.lang.String getKrb5ConfigGcsUri();
  /**
   *
   *
   * <pre>
   * A Cloud Storage URI that specifies the path to a
   * krb5.conf file. It is of the form `gs://{bucket_name}/path/to/krb5.conf`,
   * although the file does not need to be named krb5.conf explicitly.
   * </pre>
   *
   * <code>string krb5_config_gcs_uri = 3;</code>
   *
   * @return The bytes for krb5ConfigGcsUri.
   */
  com.google.protobuf.ByteString getKrb5ConfigGcsUriBytes();
}
