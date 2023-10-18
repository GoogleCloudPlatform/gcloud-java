/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.discoveryengine.v1alpha.samples;

// [START discoveryengine_v1alpha_generated_UserEventService_ImportUserEvents_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.discoveryengine.v1alpha.DataStoreName;
import com.google.cloud.discoveryengine.v1alpha.ImportErrorConfig;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsMetadata;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsRequest;
import com.google.cloud.discoveryengine.v1alpha.ImportUserEventsResponse;
import com.google.cloud.discoveryengine.v1alpha.UserEventServiceClient;

public class AsyncImportUserEventsLRO {

  public static void main(String[] args) throws Exception {
    asyncImportUserEventsLRO();
  }

  public static void asyncImportUserEventsLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (UserEventServiceClient userEventServiceClient = UserEventServiceClient.create()) {
      ImportUserEventsRequest request =
          ImportUserEventsRequest.newBuilder()
              .setParent(
                  DataStoreName.ofProjectLocationDataStoreName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]")
                      .toString())
              .setErrorConfig(ImportErrorConfig.newBuilder().build())
              .build();
      OperationFuture<ImportUserEventsResponse, ImportUserEventsMetadata> future =
          userEventServiceClient.importUserEventsOperationCallable().futureCall(request);
      // Do something.
      ImportUserEventsResponse response = future.get();
    }
  }
}
// [END discoveryengine_v1alpha_generated_UserEventService_ImportUserEvents_LRO_async]
