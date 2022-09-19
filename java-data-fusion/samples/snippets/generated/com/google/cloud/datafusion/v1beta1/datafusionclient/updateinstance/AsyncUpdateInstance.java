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

package com.google.cloud.datafusion.v1beta1.samples;

// [START datafusion_v1beta1_generated_datafusionclient_updateinstance_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datafusion.v1beta1.DataFusionClient;
import com.google.cloud.datafusion.v1beta1.Instance;
import com.google.cloud.datafusion.v1beta1.UpdateInstanceRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateInstance {

  public static void main(String[] args) throws Exception {
    asyncUpdateInstance();
  }

  public static void asyncUpdateInstance() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataFusionClient dataFusionClient = DataFusionClient.create()) {
      UpdateInstanceRequest request =
          UpdateInstanceRequest.newBuilder()
              .setInstance(Instance.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Operation> future = dataFusionClient.updateInstanceCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END datafusion_v1beta1_generated_datafusionclient_updateinstance_async]
