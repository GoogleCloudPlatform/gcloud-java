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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface LicenseResourceCommitmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LicenseResourceCommitment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of licenses purchased.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   *
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   *
   *
   * <pre>
   * The number of licenses purchased.
   * </pre>
   *
   * <code>optional int64 amount = 196759640;</code>
   *
   * @return The amount.
   */
  long getAmount();

  /**
   *
   *
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   *
   * @return Whether the coresPerLicense field is set.
   */
  boolean hasCoresPerLicense();
  /**
   *
   *
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   *
   * @return The coresPerLicense.
   */
  java.lang.String getCoresPerLicense();
  /**
   *
   *
   * <pre>
   * Specifies the core range of the instance for which this license applies.
   * </pre>
   *
   * <code>optional string cores_per_license = 32482324;</code>
   *
   * @return The bytes for coresPerLicense.
   */
  com.google.protobuf.ByteString getCoresPerLicenseBytes();

  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   *
   * @return Whether the license field is set.
   */
  boolean hasLicense();
  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   *
   * @return The license.
   */
  java.lang.String getLicense();
  /**
   *
   *
   * <pre>
   * Any applicable license URI.
   * </pre>
   *
   * <code>optional string license = 166757441;</code>
   *
   * @return The bytes for license.
   */
  com.google.protobuf.ByteString getLicenseBytes();
}
