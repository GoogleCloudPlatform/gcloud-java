/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.documentai.v1.samples;

// [START documentai_v1_generated_documentprocessorserviceclient_batchprocessdocuments_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.documentai.v1.BatchDocumentsInputConfig;
import com.google.cloud.documentai.v1.BatchProcessRequest;
import com.google.cloud.documentai.v1.DocumentOutputConfig;
import com.google.cloud.documentai.v1.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1.ProcessorName;
import com.google.longrunning.Operation;

public class AsyncBatchProcessDocuments {

  public static void main(String[] args) throws Exception {
    asyncBatchProcessDocuments();
  }

  public static void asyncBatchProcessDocuments() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      BatchProcessRequest request =
          BatchProcessRequest.newBuilder()
              .setName(ProcessorName.of("[PROJECT]", "[LOCATION]", "[PROCESSOR]").toString())
              .setInputDocuments(BatchDocumentsInputConfig.newBuilder().build())
              .setDocumentOutputConfig(DocumentOutputConfig.newBuilder().build())
              .setSkipHumanReview(true)
              .build();
      ApiFuture<Operation> future =
          documentProcessorServiceClient.batchProcessDocumentsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END documentai_v1_generated_documentprocessorserviceclient_batchprocessdocuments_async]
