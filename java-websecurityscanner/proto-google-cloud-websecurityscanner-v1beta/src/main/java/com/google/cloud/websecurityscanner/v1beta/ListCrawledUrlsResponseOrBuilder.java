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
// source: google/cloud/websecurityscanner/v1beta/web_security_scanner.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1beta;

public interface ListCrawledUrlsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.ListCrawledUrlsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.CrawledUrl crawled_urls = 1;</code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.CrawledUrl> getCrawledUrlsList();
  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.CrawledUrl crawled_urls = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.CrawledUrl getCrawledUrls(int index);
  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.CrawledUrl crawled_urls = 1;</code>
   */
  int getCrawledUrlsCount();
  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.CrawledUrl crawled_urls = 1;</code>
   */
  java.util.List<? extends com.google.cloud.websecurityscanner.v1beta.CrawledUrlOrBuilder>
      getCrawledUrlsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of CrawledUrls returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.CrawledUrl crawled_urls = 1;</code>
   */
  com.google.cloud.websecurityscanner.v1beta.CrawledUrlOrBuilder getCrawledUrlsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
