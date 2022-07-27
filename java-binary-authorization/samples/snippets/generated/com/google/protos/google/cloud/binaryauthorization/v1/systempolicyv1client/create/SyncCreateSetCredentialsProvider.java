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

package com.google.protos.google.cloud.binaryauthorization.v1.samples;

// [START binaryauthorization_v1_generated_systempolicyv1client_create_setcredentialsprovider_sync]
import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.protos.google.cloud.binaryauthorization.v1.SystemPolicyV1Client;
import com.google.protos.google.cloud.binaryauthorization.v1.SystemPolicyV1Settings;
import com.google.protos.google.cloud.binaryauthorization.v1.myCredentials;

public class SyncCreateSetCredentialsProvider {

  public static void main(String[] args) throws Exception {
    syncCreateSetCredentialsProvider();
  }

  public static void syncCreateSetCredentialsProvider() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    SystemPolicyV1Settings systemPolicyV1Settings =
        SystemPolicyV1Settings.newBuilder()
            .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
            .build();
    SystemPolicyV1Client systemPolicyV1Client = SystemPolicyV1Client.create(systemPolicyV1Settings);
  }
}
// [END binaryauthorization_v1_generated_systempolicyv1client_create_setcredentialsprovider_sync]
