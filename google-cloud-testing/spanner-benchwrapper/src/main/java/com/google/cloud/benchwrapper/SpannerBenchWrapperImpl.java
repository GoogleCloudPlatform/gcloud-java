/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.benchwrapper;

import static com.google.cloud.spanner.TransactionRunner.TransactionCallable;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.cloud.benchwrapper.SpannerBenchWrapperGrpc.SpannerBenchWrapperImplBase;
import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.ReadOnlyTransaction;
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerBatchUpdateException;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.SpannerOptions.CallCredentialsProvider;
import com.google.cloud.spanner.Statement;
import com.google.cloud.spanner.TransactionContext;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

class SpannerBenchWrapperImpl extends SpannerBenchWrapperImplBase {
  private Spanner spanner;
  private DatabaseClient dbClient;

  public SpannerBenchWrapperImpl() {
    final SpannerOptions.Builder optionsBuilder = SpannerOptions.newBuilder();
    final SpannerOptions options = optionsBuilder
        .setEmulatorHost("localhost:9010")
        .build();
    spanner = options.getService();

    dbClient =
        spanner.getDatabaseClient(
            DatabaseId.of(options.getProjectId(), "someinstance", "somedatabase"));
  }

  public void read(ReadQuery request, StreamObserver<EmptyResponse> responseObserver) {
    System.out.println("read has been called");

    try (ReadOnlyTransaction transaction = dbClient.readOnlyTransaction()) {
      ResultSet resultSet = transaction.executeQuery(Statement.of(request.getQuery()));
      while (resultSet.next()) {
        // Do nothing with the data.
      }
    }

    EmptyResponse reply = EmptyResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  public void insert(InsertQuery request, StreamObserver<EmptyResponse> responseObserver) {
    System.out.println("insert has been called");

    List<Mutation> mutations = new ArrayList<>();
    for (Singer singer : request.getSingersList()) {
      mutations.add(
          Mutation.newInsertBuilder("Singers")
              .set("SingerId")
              .to(singer.getId())
              .set("FirstName")
              .to(singer.getFirstName())
              .set("LastName")
              .to(singer.getLastName())
              .build());
    }
    dbClient.write(mutations);

    EmptyResponse reply = EmptyResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  public void update(UpdateQuery request, StreamObserver<EmptyResponse> responseObserver) {
    System.out.println("update has been called");

    dbClient
        .readWriteTransaction()
        .run(
            new TransactionCallable<Void>() {
              @Override
              public Void run(TransactionContext transaction) throws Exception {
                List<Statement> statements = new ArrayList<>();
                for (String query : request.getQueriesList()) {
                  statements.add(Statement.of(query));
                }
                long[] rowCounts;
                try {
                  rowCounts = transaction.batchUpdate((statements));
                } catch (SpannerBatchUpdateException e) {
                  rowCounts = e.getUpdateCounts();
                }
                for (int i = 0; i < rowCounts.length; i++) {
                  System.out.printf("%d records updated by statement %d.\n", rowCounts[i], i);
                }
                return null;
              }
            });

    EmptyResponse reply = EmptyResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
