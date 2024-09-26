/*
 * Copyright 2024 Google LLC
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

package com.google.shopping.merchant.accounts.v1beta.samples;

// [START merchantapi_v1beta_generated_AutofeedSettingsServiceSettings_GetAutofeedSettings_sync]
import com.google.shopping.merchant.accounts.v1beta.AutofeedSettingsServiceSettings;
import java.time.Duration;

public class SyncGetAutofeedSettings {

  public static void main(String[] args) throws Exception {
    syncGetAutofeedSettings();
  }

  public static void syncGetAutofeedSettings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    AutofeedSettingsServiceSettings.Builder autofeedSettingsServiceSettingsBuilder =
        AutofeedSettingsServiceSettings.newBuilder();
    autofeedSettingsServiceSettingsBuilder
        .getAutofeedSettingsSettings()
        .setRetrySettings(
            autofeedSettingsServiceSettingsBuilder
                .getAutofeedSettingsSettings()
                .getRetrySettings()
                .toBuilder()
                .setInitialRetryDelayDuration(Duration.ofSeconds(1))
                .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
                .setMaxAttempts(5)
                .setMaxRetryDelayDuration(Duration.ofSeconds(30))
                .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
                .setRetryDelayMultiplier(1.3)
                .setRpcTimeoutMultiplier(1.5)
                .setTotalTimeoutDuration(Duration.ofSeconds(300))
                .build());
    AutofeedSettingsServiceSettings autofeedSettingsServiceSettings =
        autofeedSettingsServiceSettingsBuilder.build();
  }
}
// [END merchantapi_v1beta_generated_AutofeedSettingsServiceSettings_GetAutofeedSettings_sync]
