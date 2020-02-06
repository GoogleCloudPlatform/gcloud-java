/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public interface EnrolledServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.EnrolledService)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The product for which Access Approval will be enrolled. Allowed values are
   * listed below (case-sensitive):
   * &lt;ol&gt;
   *   &lt;li&gt;all&lt;/li&gt;
   *   &lt;li&gt;appengine.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;bigquery.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;bigtable.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;cloudkms.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;compute.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;dataflow.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;iam.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;pubsub.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;storage.googleapis.com&lt;/li&gt;
   * &lt;ol&gt;
   * </pre>
   *
   * <code>string cloud_product = 1;</code>
   *
   * @return The cloudProduct.
   */
  java.lang.String getCloudProduct();
  /**
   *
   *
   * <pre>
   * The product for which Access Approval will be enrolled. Allowed values are
   * listed below (case-sensitive):
   * &lt;ol&gt;
   *   &lt;li&gt;all&lt;/li&gt;
   *   &lt;li&gt;appengine.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;bigquery.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;bigtable.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;cloudkms.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;compute.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;dataflow.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;iam.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;pubsub.googleapis.com&lt;/li&gt;
   *   &lt;li&gt;storage.googleapis.com&lt;/li&gt;
   * &lt;ol&gt;
   * </pre>
   *
   * <code>string cloud_product = 1;</code>
   *
   * @return The bytes for cloudProduct.
   */
  com.google.protobuf.ByteString getCloudProductBytes();

  /**
   *
   *
   * <pre>
   * The enrollment level of the service.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
   *
   * @return The enum numeric value on the wire for enrollmentLevel.
   */
  int getEnrollmentLevelValue();
  /**
   *
   *
   * <pre>
   * The enrollment level of the service.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.EnrollmentLevel enrollment_level = 2;</code>
   *
   * @return The enrollmentLevel.
   */
  com.google.cloud.accessapproval.v1.EnrollmentLevel getEnrollmentLevel();
}
