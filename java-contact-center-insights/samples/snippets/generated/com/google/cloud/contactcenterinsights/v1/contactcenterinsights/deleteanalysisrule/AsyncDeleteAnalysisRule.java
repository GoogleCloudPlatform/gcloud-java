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

package com.google.cloud.contactcenterinsights.v1.samples;

// [START contactcenterinsights_v1_generated_ContactCenterInsights_DeleteAnalysisRule_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.contactcenterinsights.v1.AnalysisRuleName;
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRuleRequest;
import com.google.protobuf.Empty;

public class AsyncDeleteAnalysisRule {

  public static void main(String[] args) throws Exception {
    asyncDeleteAnalysisRule();
  }

  public static void asyncDeleteAnalysisRule() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ContactCenterInsightsClient contactCenterInsightsClient =
        ContactCenterInsightsClient.create()) {
      DeleteAnalysisRuleRequest request =
          DeleteAnalysisRuleRequest.newBuilder()
              .setName(AnalysisRuleName.of("[PROJECT]", "[LOCATION]", "[ANALYSIS_RULE]").toString())
              .build();
      ApiFuture<Empty> future =
          contactCenterInsightsClient.deleteAnalysisRuleCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END contactcenterinsights_v1_generated_ContactCenterInsights_DeleteAnalysisRule_async]
