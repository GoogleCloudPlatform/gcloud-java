/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.orgpolicy.v2.samples;

// [START orgpolicy_v2_generated_OrgPolicy_GetCustomConstraint_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.orgpolicy.v2.CustomConstraint;
import com.google.cloud.orgpolicy.v2.CustomConstraintName;
import com.google.cloud.orgpolicy.v2.GetCustomConstraintRequest;
import com.google.cloud.orgpolicy.v2.OrgPolicyClient;

public class AsyncGetCustomConstraint {

  public static void main(String[] args) throws Exception {
    asyncGetCustomConstraint();
  }

  public static void asyncGetCustomConstraint() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (OrgPolicyClient orgPolicyClient = OrgPolicyClient.create()) {
      GetCustomConstraintRequest request =
          GetCustomConstraintRequest.newBuilder()
              .setName(CustomConstraintName.of("[ORGANIZATION]", "[CUSTOM_CONSTRAINT]").toString())
              .build();
      ApiFuture<CustomConstraint> future =
          orgPolicyClient.getCustomConstraintCallable().futureCall(request);
      // Do something.
      CustomConstraint response = future.get();
    }
  }
}
// [END orgpolicy_v2_generated_OrgPolicy_GetCustomConstraint_async]
