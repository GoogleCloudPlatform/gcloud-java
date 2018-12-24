/*
 * Copyright 2018 Google LLC.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.bigtable;

import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ServerStream;
import com.google.cloud.bigtable.admin.v2.BigtableTableAdminClient;
import com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings;
import com.google.cloud.bigtable.admin.v2.models.CreateTableRequest;
import com.google.cloud.bigtable.data.v2.BigtableDataClient;
import com.google.cloud.bigtable.data.v2.BigtableDataSettings;
import com.google.cloud.bigtable.data.v2.models.InstanceName;
import com.google.cloud.bigtable.data.v2.models.Query;
import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.models.RowCell;
import com.google.cloud.bigtable.data.v2.models.RowMutation;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {

  private static String projectId;
  private static String instanceId;
  private static String tableId;
  private static BigtableDataClient dataClient;
  private static BigtableTableAdminClient adminClient;

  private static final String tablePrefix = "table";
  private static final String columnFamily = "cf1";
  private static final String columnQualifier = "greeting";
  private static final String rowKeyPrefix = "rowKey";

  public static void main(String[] args) throws Exception {

    if (args.length != 2) {
      System.out.println("Missing required project id or instance id");
    }
    projectId = args[0];
    instanceId = args[1];

    HelloWorld helloWorld = new HelloWorld(projectId, instanceId, generateTableId());
    helloWorld.run();
  }

  public HelloWorld(String projectId, String instanceId, String tableId) throws IOException {
    this.projectId = projectId;
    this.instanceId = instanceId;
    this.tableId = tableId;

    // [START connecting_to_bigtable]
    // Create the settings to configure a bigtable data client
    BigtableDataSettings settings =
        BigtableDataSettings.newBuilder()
            .setInstanceName(InstanceName.of(projectId, instanceId))
            .build();

    // Create bigtable data client
    dataClient = BigtableDataClient.create(settings);

    // Create the settings to configure a bigtable admin client
    BigtableTableAdminSettings adminSettings =
        BigtableTableAdminSettings.newBuilder()
            .setInstanceName(com.google.bigtable.admin.v2.InstanceName.of(projectId, instanceId))
            .build();

    // Create bigtable admin client
    adminClient = BigtableTableAdminClient.create(adminSettings);
    // [END connecting_to_bigtable]
  }

  public void run() throws Exception {
    try {
      createTable();
      writeToTable();
      readSingleRow();
      readTable();
      deleteTable();
      garbageCollect();
    } catch (ApiException e) {
      System.err.println("Exception while running HelloWorld: " + e.getMessage());
    } finally {
      dataClient.close();
      adminClient.close();
    }
  }

  public void createTable() {
    // [START creating_a_table]
    // Check if table exists, create table if does not exist
    if (!adminClient.exists(tableId)) {
      CreateTableRequest createTableRequest =
          CreateTableRequest.of(tableId).addFamily(columnFamily);
      System.out.println("Creating table: " + tableId);
      adminClient.createTable(createTableRequest);
      System.out.printf("Table %s created successfully%n", tableId);
    }
    // [END creating_a_table]
  }

  public void writeToTable() {
    // [START writing_rows]
    try {
      System.out.println("\nWriting some greetings to the table");
      String[] greetings = {"Hello World!", "Hello Bigtable!", "Hello Java!"};
      for (int i = 0; i < greetings.length; i++) {
        RowMutation rowMutation =
            RowMutation.create(tableId, rowKeyPrefix + i)
                .setCell(columnFamily, columnQualifier, greetings[i]);
        dataClient.mutateRow(rowMutation);
        System.out.println(greetings[i]);
      }
    } catch (ApiException e) {
      System.err.println("Exception while writing to table: " + e.getMessage());
    }
    // [END writing_rows]
  }

  public void readSingleRow() {
    // [START reading_a_row]
    try {
      System.out.println("\nReading a single row by row key");
      Row row = dataClient.readRow(tableId, rowKeyPrefix + 0);
      System.out.println("Row: " + row.getKey().toStringUtf8());
      for (RowCell cell : row.getCells()) {
        System.out.printf(
            "Family: %s    Qualifier: %s    Value: %s%n",
            cell.getFamily(), cell.getQualifier().toStringUtf8(), cell.getValue().toStringUtf8());
      }
    } catch (ApiException e) {
      System.err.println("Exception while reading a single row: " + e.getMessage());
    }
    // [END reading_a_row]
  }

  public void readTable() {
    // [START scanning_all_rows]
    try {
      System.out.println("\n================= Reading the entire table =================");
      Query query = Query.create(tableId);
      ServerStream<Row> rowStream = dataClient.readRows(query);
      for (Row r : rowStream) {
        System.out.println("Row Key: " + r.getKey().toStringUtf8());
        for (RowCell cell : r.getCells()) {
          System.out.printf(
              "Family: %s    Qualifier: %s    Value: %s%n",
              cell.getFamily(), cell.getQualifier().toStringUtf8(), cell.getValue().toStringUtf8());
        }
      }
    } catch (ApiException e) {
      System.err.println("Exception while reading table: " + e.getMessage());
    }
    // [END scanning_all_rows]
  }

  public void deleteTable() {
    // [START deleting_a_table]
    System.out.println("\nDeleting table");
    try {
      adminClient.deleteTable(tableId);
      System.out.printf("Table %s deleted successfully%n", tableId);
    } catch (ApiException e) {
      System.err.println("Exception while deleting table: " + e.getMessage());
    }
    // [END deleting_a_table]
  }

  private static String generateTableId() {
    return String.format(
        "%s-%016x-%d", tablePrefix, System.currentTimeMillis(), new Random().nextLong());
  }

  public void garbageCollect() {
    Pattern timestampPattern = Pattern.compile(tablePrefix + "-([0-9]+)");
    for (String tableId : adminClient.listTables()) {
      Matcher matcher = timestampPattern.matcher(tableId);
      if (!matcher.matches()) {
        continue;
      }
      String timestampStr = matcher.group(1);
      long timestamp = Long.parseLong(timestampStr);
      if (System.currentTimeMillis() - timestamp < TimeUnit.MINUTES.toMillis(15)) {
        continue;
      }
      System.out.println("Garbage collecting orphaned table: " + tableId);
      adminClient.deleteTable(tableId);
    }
  }
}
