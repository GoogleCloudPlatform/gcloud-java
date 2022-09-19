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

package com.google.cloud.retail.v2beta.stub.samples;

// [START retail_v2beta_generated_productservicestubsettings_createproduct_sync]
import com.google.cloud.retail.v2beta.stub.ProductServiceStubSettings;
import java.time.Duration;

public class SyncCreateProduct {

  public static void main(String[] args) throws Exception {
    syncCreateProduct();
  }

  public static void syncCreateProduct() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    ProductServiceStubSettings.Builder productServiceSettingsBuilder =
        ProductServiceStubSettings.newBuilder();
    productServiceSettingsBuilder
        .createProductSettings()
        .setRetrySettings(
            productServiceSettingsBuilder
                .createProductSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    ProductServiceStubSettings productServiceSettings = productServiceSettingsBuilder.build();
  }
}
// [END retail_v2beta_generated_productservicestubsettings_createproduct_sync]
