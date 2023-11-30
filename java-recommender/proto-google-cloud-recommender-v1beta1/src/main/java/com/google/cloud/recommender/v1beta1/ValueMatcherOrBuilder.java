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
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface ValueMatcherOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.ValueMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return Whether the matchesPattern field is set.
   */
  boolean hasMatchesPattern();
  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return The matchesPattern.
   */
  java.lang.String getMatchesPattern();
  /**
   *
   *
   * <pre>
   * To be used for full regex matching. The regular expression is using the
   * Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be
   * used with RE2::FullMatch
   * </pre>
   *
   * <code>string matches_pattern = 1;</code>
   *
   * @return The bytes for matchesPattern.
   */
  com.google.protobuf.ByteString getMatchesPatternBytes();

  com.google.cloud.recommender.v1beta1.ValueMatcher.MatchVariantCase getMatchVariantCase();
}
