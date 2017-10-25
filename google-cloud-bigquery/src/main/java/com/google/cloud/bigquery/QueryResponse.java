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

package com.google.cloud.bigquery;

import com.google.cloud.bigquery.BigQuery.QueryOption;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Google Cloud BigQuery Query Response. This class contains the results of a Query Job ({@link
 * BigQuery#getQueryResults(JobId, BigQuery.QueryResultsOption...)}) or of a Query Request ({@link
 * BigQuery#query(QueryJobConfiguration, QueryOption...)}).
 *
 * <p>Example usage of a query response:
 *
 * <pre>{@code
 * QueryResponse response = bigquery.query(queryConfig);
 * List<BigQueryError> executionErrors = response.getExecutionErrors();
 * // look for errors in executionErrors
 * QueryResult result = response.getResult();
 * for(FieldValueList row : result.iterateAll()) {
 *   // do something with row
 * }
 * }</pre>
 *
 * @see <a href="https://cloud.google.com/bigquery/docs/reference/v2/jobs/getQueryResults">Get Query
 *     Results</a>
 * @see <a href="https://cloud.google.com/bigquery/docs/reference/v2/jobs/query">Query</a>
 */
public class QueryResponse implements Serializable {

  private static final long serialVersionUID = 3549226764825005655L;

  private final String etag;
  private final JobId jobId;
  private final TableId tableId;
  private final Long numDmlAffectedRows;
  private final boolean jobCompleted;
  private final List<BigQueryError> executionErrors;
  private final boolean cacheHit;
  private final Schema schema;
  private final long totalBytesProcessed;

  static final class Builder {

    private String etag;
    private JobId jobId;
    private TableId tableId;
    private Long numDmlAffectedRows;
    private boolean jobCompleted;
    private List<BigQueryError> executionErrors;
    private boolean cacheHit;
    private Schema schema;
    private long totalBytesProcessed;

    private Builder() {}

    Builder setEtag(String etag) {
      this.etag = etag;
      return this;
    }

    Builder setJobId(JobId jobId) {
      this.jobId = jobId;
      return this;
    }

    Builder setTableId(TableId tableId) {
      this.tableId = tableId;
      return this;
    }

    Builder setNumDmlAffectedRows(Long numDmlAffectedRows) {
      this.numDmlAffectedRows = numDmlAffectedRows;
      return this;
    }

    Builder setJobCompleted(boolean jobCompleted) {
      this.jobCompleted = jobCompleted;
      return this;
    }

    Builder setExecutionErrors(List<BigQueryError> executionErrors) {
      this.executionErrors = executionErrors;
      return this;
    }

    Builder setCacheHit(boolean cacheHit) {
      this.cacheHit = cacheHit;
      return this;
    }

    Builder setSchema(Schema schema) {
      this.schema = schema;
      return this;
    }

    Builder setTotalBytesProcessed(long totalBytesProcessed) {
      this.totalBytesProcessed = totalBytesProcessed;
      return this;
    }

    QueryResponse build() {
      return new QueryResponse(this);
    }
  }

  private QueryResponse(Builder builder) {
    this.etag = builder.etag;
    this.jobId = builder.jobId;
    this.tableId = builder.tableId;
    this.numDmlAffectedRows = builder.numDmlAffectedRows;
    this.jobCompleted = builder.jobCompleted;
    this.executionErrors =
        builder.executionErrors != null
            ? builder.executionErrors
            : ImmutableList.<BigQueryError>of();
    this.cacheHit = builder.cacheHit;
    this.schema = builder.schema;
    this.totalBytesProcessed = builder.totalBytesProcessed;
  }

  /**
   * Returns the result of the query. Returns {@code null} if {@link #jobCompleted()} is {@code
   * false}.
   */
  public QueryResult getResult() {
    if (!jobCompleted()) {
      return null;
    }
    return null;
    // return result;
  }

  /** Returns the hash of the {@code QueryResponse} resource or {@code null} if not set. */
  public String getEtag() {
    return etag;
  }

  /**
   * Returns the identity of the BigQuery Job that was created to run the query. This field will be
   * present even if the original request timed out.
   */
  public JobId getJobId() {
    return jobId;
  }

  /**
   * Returns the number of rows affected by a DML statement. Present only for DML statements INSERT,
   * UPDATE or DELETE.
   */
  public Long getNumDmlAffectedRows() {
    return numDmlAffectedRows;
  }

  /**
   * Returns whether the job running the query has completed or not. If {@link #getResult()} is not
   * {@code null}, this method will always return {@code true}. If this method returns {@code false}
   * {@link #getResult()} returns {@code null}. This method can be used to check if query execution
   * completed and results are available.
   */
  public boolean jobCompleted() {
    return jobCompleted;
  }

  /**
   * Returns whether errors and warnings occurred during the execution of the job. If this method
   * returns {@code true} it does not necessarily mean that the job has completed or was
   * unsuccessful.
   */
  public boolean hasErrors() {
    return !executionErrors.isEmpty();
  }

  /**
   * Returns errors and warnings encountered during the running of the job, if any. Errors here do
   * not necessarily mean that the job has completed or was unsuccessful.
   */
  public List<BigQueryError> getExecutionErrors() {
    return executionErrors;
  }

  /**
   * Returns whether the query result was fetched from the query cache.
   *
   * @see <a href="https://cloud.google.com/bigquery/querying-data#querycaching">Query Caching</a>
   */
  public boolean cacheHit() {
    return cacheHit;
  }

  /**
   * Returns the schema of the results. This is present only when the query completes successfully.
   */
  public Schema getSchema() {
    return schema;
  }

  /**
   * Returns the total number of bytes processed for the query. If this query was a dry run, this is
   * the number of bytes that would be processed if the query were run.
   */
  public long getTotalBytesProcessed() {
    return totalBytesProcessed;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("etag", etag)
        .add("jobId", jobId)
        .add("numDmlAffectedRows", numDmlAffectedRows)
        .add("jobCompleted", jobCompleted)
        .add("executionErrors", executionErrors)
        .add("cacheHit", cacheHit)
        .add("schema", schema)
        .add("totalBytesProcessed", totalBytesProcessed)
        .toString();
  }

  @Override
  public final int hashCode() {
    return Objects.hash(
        etag,
        jobId,
        numDmlAffectedRows,
        jobCompleted,
        executionErrors,
        cacheHit,
        schema,
        totalBytesProcessed);
  }

  @Override
  public final boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || !obj.getClass().equals(QueryResponse.class)) {
      return false;
    }
    QueryResponse response = (QueryResponse) obj;
    return jobCompleted == response.jobCompleted
        && Objects.equals(etag, response.etag)
        && Objects.equals(jobId, response.jobId)
        && Objects.equals(numDmlAffectedRows, response.numDmlAffectedRows)
        && Objects.equals(executionErrors, response.executionErrors)
        && Objects.equals(schema, response.schema)
        && totalBytesProcessed == response.totalBytesProcessed
        && cacheHit == response.cacheHit;
  }

  static Builder newBuilder() {
    return new Builder();
  }
}
