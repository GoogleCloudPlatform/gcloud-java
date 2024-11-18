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
// source: google/cloud/aiplatform/v1beta1/feature_monitor.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ScheduleConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ScheduleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled
   * runs. To explicitly set a timezone to the cron tab, apply a prefix in
   * the cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or "TZ=${IANA_TIME_ZONE}".
   * The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or
   * "TZ=America/New_York 1 * * * *".
   * </pre>
   *
   * <code>string cron = 1;</code>
   *
   * @return The cron.
   */
  java.lang.String getCron();
  /**
   *
   *
   * <pre>
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled
   * runs. To explicitly set a timezone to the cron tab, apply a prefix in
   * the cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or "TZ=${IANA_TIME_ZONE}".
   * The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or
   * "TZ=America/New_York 1 * * * *".
   * </pre>
   *
   * <code>string cron = 1;</code>
   *
   * @return The bytes for cron.
   */
  com.google.protobuf.ByteString getCronBytes();
}
