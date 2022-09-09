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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_getapiversion_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.apigeeregistry.v1.ApiVersion;
import com.google.cloud.apigeeregistry.v1.ApiVersionName;
import com.google.cloud.apigeeregistry.v1.GetApiVersionRequest;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class AsyncGetApiVersion {

  public static void main(String[] args) throws Exception {
    asyncGetApiVersion();
  }

  public static void asyncGetApiVersion() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RegistryClient registryClient = RegistryClient.create()) {
      GetApiVersionRequest request =
          GetApiVersionRequest.newBuilder()
              .setName(
                  ApiVersionName.of("[PROJECT]", "[LOCATION]", "[API]", "[VERSION]").toString())
              .build();
      ApiFuture<ApiVersion> future = registryClient.getApiVersionCallable().futureCall(request);
      // Do something.
      ApiVersion response = future.get();
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_getapiversion_async]
