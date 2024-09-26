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

package com.google.cloud.backupdr.v1.samples;

// [START backupdr_v1_generated_BackupDR_UpdateBackup_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.backupdr.v1.Backup;
import com.google.cloud.backupdr.v1.BackupDRClient;
import com.google.cloud.backupdr.v1.UpdateBackupRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateBackup {

  public static void main(String[] args) throws Exception {
    asyncUpdateBackup();
  }

  public static void asyncUpdateBackup() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackupDRClient backupDRClient = BackupDRClient.create()) {
      UpdateBackupRequest request =
          UpdateBackupRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setBackup(Backup.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future = backupDRClient.updateBackupCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END backupdr_v1_generated_BackupDR_UpdateBackup_async]
