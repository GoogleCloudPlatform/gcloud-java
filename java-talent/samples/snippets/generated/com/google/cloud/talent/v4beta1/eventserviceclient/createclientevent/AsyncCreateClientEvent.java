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

package com.google.cloud.talent.v4beta1.samples;

// [START talent_v4beta1_generated_eventserviceclient_createclientevent_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4beta1.ClientEvent;
import com.google.cloud.talent.v4beta1.CreateClientEventRequest;
import com.google.cloud.talent.v4beta1.EventServiceClient;
import com.google.cloud.talent.v4beta1.TenantName;

public class AsyncCreateClientEvent {

  public static void main(String[] args) throws Exception {
    asyncCreateClientEvent();
  }

  public static void asyncCreateClientEvent() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EventServiceClient eventServiceClient = EventServiceClient.create()) {
      CreateClientEventRequest request =
          CreateClientEventRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .setClientEvent(ClientEvent.newBuilder().build())
              .build();
      ApiFuture<ClientEvent> future =
          eventServiceClient.createClientEventCallable().futureCall(request);
      // Do something.
      ClientEvent response = future.get();
    }
  }
}
// [END talent_v4beta1_generated_eventserviceclient_createclientevent_async]
