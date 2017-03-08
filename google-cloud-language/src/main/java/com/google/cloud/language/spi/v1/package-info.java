/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Google Cloud Natural Language API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>===================== LanguageServiceClient =====================
 *
 * <p>Service Description: Provides text analysis operations such as sentiment analysis and entity
 * recognition.
 *
 * <p>Sample for LanguageServiceClient:
 *
 * <pre>
 * <code>
 * try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
 *   Document document = Document.newBuilder().build();
 *   AnalyzeSentimentResponse response = languageServiceClient.analyzeSentiment(document);
 * }
 * </code>
 * </pre>
 */
package com.google.cloud.language.spi.v1;
