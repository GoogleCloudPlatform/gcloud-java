/*
 * Copyright 2025 Google LLC
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

package com.google.cloud.networkmanagement.v1.samples;

// [START networkmanagement_v1_generated_VpcFlowLogsService_DeleteVpcFlowLogsConfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.networkmanagement.v1.DeleteVpcFlowLogsConfigRequest;
import com.google.cloud.networkmanagement.v1.VpcFlowLogsConfigName;
import com.google.cloud.networkmanagement.v1.VpcFlowLogsServiceClient;
import com.google.longrunning.Operation;

public class AsyncDeleteVpcFlowLogsConfig {

  public static void main(String[] args) throws Exception {
    asyncDeleteVpcFlowLogsConfig();
  }

  public static void asyncDeleteVpcFlowLogsConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VpcFlowLogsServiceClient vpcFlowLogsServiceClient = VpcFlowLogsServiceClient.create()) {
      DeleteVpcFlowLogsConfigRequest request =
          DeleteVpcFlowLogsConfigRequest.newBuilder()
              .setName(
                  VpcFlowLogsConfigName.of("[PROJECT]", "[LOCATION]", "[VPC_FLOW_LOGS_CONFIG]")
                      .toString())
              .build();
      ApiFuture<Operation> future =
          vpcFlowLogsServiceClient.deleteVpcFlowLogsConfigCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END networkmanagement_v1_generated_VpcFlowLogsService_DeleteVpcFlowLogsConfig_async]
