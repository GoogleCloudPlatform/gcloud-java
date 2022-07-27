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

// [START binaryauthorization_v1_generated_binauthzmanagementservicev1client_getattestor_attestorname_sync]
import com.google.protos.google.cloud.binaryauthorization.v1.AttestorName;
import com.google.protos.google.cloud.binaryauthorization.v1.BinauthzManagementServiceV1Client;
import com.google.protos.google.cloud.binaryauthorization.v1.Resources;

public class SyncGetAttestorAttestorname {

  public static void main(String[] args) throws Exception {
    syncGetAttestorAttestorname();
  }

  public static void syncGetAttestorAttestorname() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BinauthzManagementServiceV1Client binauthzManagementServiceV1Client =
        BinauthzManagementServiceV1Client.create()) {
      AttestorName name = AttestorName.of("[PROJECT]", "[ATTESTOR]");
      Resources.Attestor response = binauthzManagementServiceV1Client.getAttestor(name);
    }
  }
}
// [END binaryauthorization_v1_generated_binauthzmanagementservicev1client_getattestor_attestorname_sync]
