/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.cloud.bigquery.testing;

import com.google.cloud.AuthCredentials;
import com.google.cloud.RetryParams;
import com.google.cloud.bigquery.BigQuery;
import com.google.cloud.bigquery.BigQueryException;
import com.google.cloud.bigquery.BigQueryOptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility to create a remote BigQuery configuration for testing. BigQuery options can be obtained
 * via the {@link #options()} method. Returned options have custom
 * {@link BigQueryOptions#retryParams()}: {@link RetryParams#retryMaxAttempts()} is {@code 10},
 * {@link RetryParams#retryMinAttempts()} is {@code 6}, {@link RetryParams#maxRetryDelayMillis()} is
 * {@code 30000}, {@link RetryParams#totalRetryPeriodMillis()} is {@code 120000} and
 * {@link RetryParams#initialRetryDelayMillis()} is {@code 250}.
 * {@link BigQueryOptions#connectTimeout()} and {@link BigQueryOptions#readTimeout()} are both set
 * to {@code 60000}.
 */
public class RemoteBigQueryHelper {

  private static final Logger log = Logger.getLogger(RemoteBigQueryHelper.class.getName());
  private static final String DATASET_NAME_PREFIX = "gcloud_test_dataset_temp_";
  private final BigQueryOptions options;

  private RemoteBigQueryHelper(BigQueryOptions options) {
    this.options = options;
  }

  /**
   * Returns a {@link BigQueryOptions} object to be used for testing.
   */
  public BigQueryOptions options() {
    return options;
  }

  /**
   * Deletes a dataset, even if non-empty.
   *
   * @param bigquery the BigQuery service to be used to issue the delete request
   * @param dataset the dataset to be deleted
   * @return {@code true} if deletion succeeded, {@code false} if the dataset was not found
   * @throws BigQueryException upon failure
   */
  public static boolean forceDelete(BigQuery bigquery, String dataset) {
    return bigquery.delete(dataset, BigQuery.DatasetDeleteOption.deleteContents());
  }

  /**
   * Returns a dataset name generated using a random UUID.
   */
  public static String generateDatasetName() {
    return DATASET_NAME_PREFIX + UUID.randomUUID().toString().replace('-', '_');
  }

  /**
   * Creates a {@code RemoteBigQueryHelper} object for the given project id and JSON key input
   * stream.
   *
   * @param projectId id of the project to be used for running the tests
   * @param keyStream input stream for a JSON key
   * @return A {@code RemoteBigQueryHelper} object for the provided options
   * @throws BigQueryHelperException if {@code keyStream} is not a valid JSON key stream
   */
  public static RemoteBigQueryHelper create(String projectId, InputStream keyStream)
      throws BigQueryHelperException {
    try {
      BigQueryOptions bigqueryOptions = BigQueryOptions.builder()
          .authCredentials(AuthCredentials.createForJson(keyStream))
          .projectId(projectId)
          .retryParams(retryParams())
          .connectTimeout(60000)
          .readTimeout(60000)
          .build();
      return new RemoteBigQueryHelper(bigqueryOptions);
    } catch (IOException ex) {
      if (log.isLoggable(Level.WARNING)) {
        log.log(Level.WARNING, ex.getMessage());
      }
      throw BigQueryHelperException.translate(ex);
    }
  }

  /**
   * Creates a {@code RemoteBigQueryHelper} object using default project id and authentication
   * credentials.
   */
  public static RemoteBigQueryHelper create() {
    BigQueryOptions bigqueryOptions = BigQueryOptions.builder()
        .retryParams(retryParams())
        .connectTimeout(60000)
        .readTimeout(60000)
        .build();
    return new RemoteBigQueryHelper(bigqueryOptions);
  }

  private static RetryParams retryParams() {
    return RetryParams.builder()
        .retryMaxAttempts(10)
        .retryMinAttempts(6)
        .maxRetryDelayMillis(30000)
        .totalRetryPeriodMillis(120000)
        .initialRetryDelayMillis(250)
        .build();
  }

  public static class BigQueryHelperException extends RuntimeException {

    private static final long serialVersionUID = 3984993496060055562L;

    public BigQueryHelperException(String message, Throwable cause) {
      super(message, cause);
    }

    public static BigQueryHelperException translate(Exception ex) {
      return new BigQueryHelperException(ex.getMessage(), ex);
    }
  }
}
