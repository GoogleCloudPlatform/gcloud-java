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

package com.google.cloud.resourcemanager.v3.samples;

// [START resourcemanager_v3_generated_tagkeysclient_deletetagkey_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.resourcemanager.v3.DeleteTagKeyRequest;
import com.google.cloud.resourcemanager.v3.TagKeyName;
import com.google.cloud.resourcemanager.v3.TagKeysClient;
import com.google.longrunning.Operation;

public class AsyncDeleteTagKey {

  public static void main(String[] args) throws Exception {
    asyncDeleteTagKey();
  }

  public static void asyncDeleteTagKey() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (TagKeysClient tagKeysClient = TagKeysClient.create()) {
      DeleteTagKeyRequest request =
          DeleteTagKeyRequest.newBuilder()
              .setName(TagKeyName.of("[TAG_KEY]").toString())
              .setValidateOnly(true)
              .setEtag("etag3123477")
              .build();
      ApiFuture<Operation> future = tagKeysClient.deleteTagKeyCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END resourcemanager_v3_generated_tagkeysclient_deletetagkey_async]
