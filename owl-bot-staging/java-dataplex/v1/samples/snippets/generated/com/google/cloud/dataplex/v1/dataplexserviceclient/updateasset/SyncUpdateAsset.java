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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_dataplexserviceclient_updateasset_sync]
import com.google.cloud.dataplex.v1.Asset;
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.UpdateAssetRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateAsset {

  public static void main(String[] args) throws Exception {
    syncUpdateAsset();
  }

  public static void syncUpdateAsset() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      UpdateAssetRequest request =
          UpdateAssetRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setAsset(Asset.newBuilder().build())
              .setValidateOnly(true)
              .build();
      Asset response = dataplexServiceClient.updateAssetAsync(request).get();
    }
  }
}
// [END dataplex_v1_generated_dataplexserviceclient_updateasset_sync]
