/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.storage.buckets;

// [START storage_remove_bucket_iam_member]
import com.google.cloud.Binding;
import com.google.cloud.Policy;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.ArrayList;
import java.util.List;

public class RemoveBucketIamMember {
  public static void removeBucketIamMember(String projectId, String bucketName) {
    // The ID of your GCP project
    // String projectId = "your-project-id";

    // The ID of your GCS bucket
    // String bucketName = "your-unique-bucket-name";

    Storage storage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();
    int policyVersion = 3;
    Policy originalPolicy = storage.getIamPolicy(bucketName, Storage.BucketSourceOption.requestedPolicyVersion(policyVersion));

    String role = "roles/storage.objectViewer";

    String member = "group:example@google.com";
    List<Binding> bindings = new ArrayList(originalPolicy.getBindingsList());
    for (int index = 0; index < bindings.size(); index++) {
      Binding binding = bindings.get(index);
      if (binding.getRole().equals(role)
          && binding.getMembers().contains(member)
          && binding.getCondition() == null) {
        bindings.set(index, binding.toBuilder().removeMembers(member).build());
        break;
      }
    }

    Policy updatedPolicy =
        storage.setIamPolicy(bucketName, originalPolicy.toBuilder().setBindings(bindings).setVersion(policyVersion).build());

    boolean bindingExists = false;
    for (Binding binding : updatedPolicy.getBindingsList()) {
      if (binding.getRole().equals(role) && null == binding.getCondition()) {
        bindingExists = true;
        if (!binding.getMembers().contains(member)) {
          System.out.printf("Removed %s with role %s from %s\n", member, role, bucketName);
        }
      }
    }
    if (!bindingExists) {
      System.out.printf("Removed %s with role %s from %s\n", member, role, bucketName);
    }
  }
}
// [END storage_remove_bucket_iam_member]
