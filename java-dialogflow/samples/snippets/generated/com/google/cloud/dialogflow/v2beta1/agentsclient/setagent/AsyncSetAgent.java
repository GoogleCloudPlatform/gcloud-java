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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_agentsclient_setagent_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.Agent;
import com.google.cloud.dialogflow.v2beta1.AgentsClient;
import com.google.cloud.dialogflow.v2beta1.SetAgentRequest;
import com.google.protobuf.FieldMask;

public class AsyncSetAgent {

  public static void main(String[] args) throws Exception {
    asyncSetAgent();
  }

  public static void asyncSetAgent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AgentsClient agentsClient = AgentsClient.create()) {
      SetAgentRequest request =
          SetAgentRequest.newBuilder()
              .setAgent(Agent.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Agent> future = agentsClient.setAgentCallable().futureCall(request);
      // Do something.
      Agent response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_agentsclient_setagent_async]
