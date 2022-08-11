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

package com.google.cloud.datacatalog.v1.samples;

// [START datacatalog_v1_generated_datacatalogclient_getentrygroup_entrygroupnamefieldmask_sync]
import com.google.cloud.datacatalog.v1.DataCatalogClient;
import com.google.cloud.datacatalog.v1.EntryGroup;
import com.google.cloud.datacatalog.v1.EntryGroupName;
import com.google.protobuf.FieldMask;

public class SyncGetEntryGroupEntrygroupnameFieldmask {

  public static void main(String[] args) throws Exception {
    syncGetEntryGroupEntrygroupnameFieldmask();
  }

  public static void syncGetEntryGroupEntrygroupnameFieldmask() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
      EntryGroupName name = EntryGroupName.of("[PROJECT]", "[LOCATION]", "[ENTRY_GROUP]");
      FieldMask readMask = FieldMask.newBuilder().build();
      EntryGroup response = dataCatalogClient.getEntryGroup(name, readMask);
    }
  }
}
// [END datacatalog_v1_generated_datacatalogclient_getentrygroup_entrygroupnamefieldmask_sync]
