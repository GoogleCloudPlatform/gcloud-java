package com.google.cloud.bigquery;

import com.google.api.services.bigquery.model.JobStatistics2;
import com.google.api.services.bigquery.model.JobStatistics3;
import com.google.api.services.bigquery.model.JobStatistics4;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A Google BigQuery Job statistics.
 */
public abstract class JobStatistics implements Serializable {

  private static final long serialVersionUID = 1433024714741660399L;

  private final Long creationTime;
  private final Long endTime;
  private final Long startTime;

  /**
   * A Google BigQuery Copy Job statistics.
   */
  public static class CopyStatistics extends JobStatistics {

    private static final long serialVersionUID = 8218325588441660938L;

    static final class Builder extends JobStatistics.Builder<CopyStatistics, Builder> {

      private Builder() {}

      private Builder(com.google.api.services.bigquery.model.JobStatistics statisticsPb) {
        super(statisticsPb);
      }

      @Override
      CopyStatistics build() {
        return new CopyStatistics(this);
      }
    }

    private CopyStatistics(Builder builder) {
      super(builder);
    }

    @Override
    public final boolean equals(Object obj) {
      return obj == this
          || obj != null
          && obj.getClass().equals(CopyStatistics.class)
          && baseEquals((CopyStatistics) obj);
    }

    @Override
    public final int hashCode() {
      return baseHashCode();
    }

    static Builder builder() {
      return new Builder();
    }

    @SuppressWarnings("unchecked")
    static CopyStatistics fromPb(
        com.google.api.services.bigquery.model.JobStatistics statisticPb) {
      return new Builder(statisticPb).build();
    }
  }

  /**
   * A Google BigQuery Extract Job statistics.
   */
  public static class ExtractStatistics extends JobStatistics {

    private static final long serialVersionUID = -1566598819212767373L;

    private final List<Long> destinationUriFileCounts;

    static final class Builder extends JobStatistics.Builder<ExtractStatistics, Builder> {

      private List<Long> destinationUriFileCounts;

      private Builder() {}

      private Builder(com.google.api.services.bigquery.model.JobStatistics statisticsPb) {
        super(statisticsPb);
        this.destinationUriFileCounts = statisticsPb.getExtract().getDestinationUriFileCounts();
      }

      Builder destinationUriFileCounts(List<Long> destinationUriFileCounts) {
        this.destinationUriFileCounts = destinationUriFileCounts;
        return self();
      }

      @Override
      ExtractStatistics build() {
        return new ExtractStatistics(this);
      }
    }

    private ExtractStatistics(Builder builder) {
      super(builder);
      this.destinationUriFileCounts = builder.destinationUriFileCounts;
    }

    /**
     * Returns the number of files per destination URI or URI pattern specified in the extract job.
     * These values will be in the same order as the URIs specified by
     * {@link ExtractJobConfiguration#destinationUris()}.
     */
    public List<Long> destinationUriFileCounts() {
      return destinationUriFileCounts;
    }

    @Override
    ToStringHelper toStringHelper() {
      return super.toStringHelper().add("destinationUriFileCounts", destinationUriFileCounts);
    }

    @Override
    public final boolean equals(Object obj) {
      return obj == this
          || obj != null
          && obj.getClass().equals(ExtractStatistics.class)
          && baseEquals((ExtractStatistics) obj);
    }

    @Override
    public final int hashCode() {
      return Objects.hash(baseHashCode(), destinationUriFileCounts);
    }

    @Override
    com.google.api.services.bigquery.model.JobStatistics toPb() {
      com.google.api.services.bigquery.model.JobStatistics statisticsPb = super.toPb();
      return statisticsPb.setExtract(
          new JobStatistics4().setDestinationUriFileCounts(destinationUriFileCounts));
    }

    static Builder builder() {
      return new Builder();
    }

    @SuppressWarnings("unchecked")
    static ExtractStatistics fromPb(
        com.google.api.services.bigquery.model.JobStatistics statisticPb) {
      return new Builder(statisticPb).build();
    }
  }

  /**
   * A Google BigQuery Load Job statistics.
   */
  public static class LoadStatistics extends JobStatistics {

    private static final long serialVersionUID = -707369246536309215L;

    private final Long inputBytes;
    private final Long inputFiles;
    private final Long outputBytes;
    private final Long outputRows;

    static final class Builder extends JobStatistics.Builder<LoadStatistics, Builder> {

      private Long inputBytes;
      private Long inputFiles;
      private Long outputBytes;
      private Long outputRows;

      private Builder() {}

      private Builder(com.google.api.services.bigquery.model.JobStatistics statisticsPb) {
        super(statisticsPb);
        this.inputBytes = statisticsPb.getLoad().getInputFileBytes();
        this.inputFiles = statisticsPb.getLoad().getInputFiles();
        this.outputBytes = statisticsPb.getLoad().getOutputBytes();
        this.outputRows = statisticsPb.getLoad().getOutputRows();
      }

      Builder inputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
        return self();
      }

      Builder inputFiles(Long inputFiles) {
        this.inputFiles = inputFiles;
        return self();
      }

      Builder outputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
        return self();
      }

      Builder outputRows(Long outputRows) {
        this.outputRows = outputRows;
        return self();
      }

      @Override
      LoadStatistics build() {
        return new LoadStatistics(this);
      }
    }

    private LoadStatistics(Builder builder) {
      super(builder);
      this.inputBytes = builder.inputBytes;
      this.inputFiles = builder.inputFiles;
      this.outputBytes = builder.outputBytes;
      this.outputRows = builder.outputRows;

    }

    /**
     * Returns the number of bytes of source data in a load job.
     */
    public Long inputBytes() {
      return inputBytes;
    }

    /**
     * Returns the number of source files in a load job.
     */
    public Long inputFiles() {
      return inputFiles;
    }

    /**
     * Returns the size of the data loaded by a load job so far, in bytes.
     */
    public Long outputBytes() {
      return outputBytes;
    }

    /**
     * Returns the number of rows loaded by a load job so far.
     */
    public Long outputRows() {
      return outputRows;
    }

    @Override
    ToStringHelper toStringHelper() {
      return super.toStringHelper()
          .add("inputBytes", inputBytes)
          .add("inputFiles", inputFiles)
          .add("outputBytes", outputBytes)
          .add("outputRows", outputRows);
    }

    @Override
    public final boolean equals(Object obj) {
      return obj == this
          || obj != null
          && obj.getClass().equals(LoadStatistics.class)
          && baseEquals((LoadStatistics) obj);
    }

    @Override
    public final int hashCode() {
      return Objects.hash(baseHashCode(), inputBytes, inputFiles, outputBytes, outputRows);
    }

    @Override
    com.google.api.services.bigquery.model.JobStatistics toPb() {
      JobStatistics3 loadStatisticsPb = new JobStatistics3();
      loadStatisticsPb.setInputFileBytes(inputBytes);
      loadStatisticsPb.setInputFiles(inputFiles);
      loadStatisticsPb.setOutputBytes(outputBytes);
      loadStatisticsPb.setOutputRows(outputRows);
      return super.toPb().setLoad(loadStatisticsPb);
    }

    static Builder builder() {
      return new Builder();
    }

    @SuppressWarnings("unchecked")
    static LoadStatistics fromPb(com.google.api.services.bigquery.model.JobStatistics statisticPb) {
      return new Builder(statisticPb).build();
    }
  }

  /**
   * A Google BigQuery Query Job statistics.
   */
  public static class QueryStatistics extends JobStatistics {

    private static final long serialVersionUID = 7539354109226732353L;

    private final Integer billingTier;
    private final Boolean cacheHit;
    private final Long totalBytesBilled;
    private final Long totalBytesProcessed;
    private final List<QueryStage> queryPlan;

    static final class Builder extends JobStatistics.Builder<QueryStatistics, Builder> {

      private Integer billingTier;
      private Boolean cacheHit;
      private Long totalBytesBilled;
      private Long totalBytesProcessed;
      private List<QueryStage> queryPlan;

      private Builder() {}

      private Builder(com.google.api.services.bigquery.model.JobStatistics statisticsPb) {
        super(statisticsPb);
        this.billingTier = statisticsPb.getQuery().getBillingTier();
        this.cacheHit = statisticsPb.getQuery().getCacheHit();
        this.totalBytesBilled = statisticsPb.getQuery().getTotalBytesBilled();
        this.totalBytesProcessed = statisticsPb.getQuery().getTotalBytesProcessed();
        if (statisticsPb.getQuery().getQueryPlan() != null) {
          this.queryPlan =
              Lists.transform(statisticsPb.getQuery().getQueryPlan(), QueryStage.FROM_PB_FUNCTION);
        }
      }

      Builder billingTier(Integer billingTier) {
        this.billingTier = billingTier;
        return self();
      }

      Builder cacheHit(Boolean cacheHit) {
        this.cacheHit = cacheHit;
        return self();
      }

      Builder totalBytesBilled(Long totalBytesBilled) {
        this.totalBytesBilled = totalBytesBilled;
        return self();
      }

      Builder totalBytesProcessed(Long totalBytesProcessed) {
        this.totalBytesProcessed = totalBytesProcessed;
        return self();
      }

      Builder queryPlan(List<QueryStage> queryPlan) {
        this.queryPlan = queryPlan;
        return self();
      }

      @Override
      QueryStatistics build() {
        return new QueryStatistics(this);
      }
    }

    private QueryStatistics(Builder builder) {
      super(builder);
      this.billingTier = builder.billingTier;
      this.cacheHit = builder.cacheHit;
      this.totalBytesBilled = builder.totalBytesBilled;
      this.totalBytesProcessed = builder.totalBytesProcessed;
      this.queryPlan = builder.queryPlan;
    }

    /**
     * Returns the billing tier for the job.
     */
    public Integer billingTier() {
      return billingTier;
    }

    /**
     * Returns whether the query result was fetched from the query cache.
     *
     * @see <a href="https://cloud.google.com/bigquery/querying-data#querycaching">
     *     Query Caching</a>
     */
    public Boolean cacheHit() {
      return cacheHit;
    }

    /**
     * Returns the total number of bytes billed for the job.
     */
    public Long totalBytesBilled() {
      return totalBytesBilled;
    }

    /**
     * Returns the total number of bytes processed by the job.
     */
    public Long totalBytesProcessed() {
      return totalBytesProcessed;
    }

    /**
     * Returns the query plan as a list of stages or {@code null} if a query plan is not available.
     * Each stage involves a number of steps that read from data sources, perform a series of
     * transformations on the input, and emit an output to a future stage (or the final result). The
     * query plan is available for a completed query job and is retained for 7 days.
     *
     * @see <a href="https://cloud.google.com/bigquery/query-plan-explanation">Query Plan</a>
     */
    public List<QueryStage> queryPlan() {
      return queryPlan;
    }

    @Override
    ToStringHelper toStringHelper() {
      return super.toStringHelper()
          .add("billingTier", billingTier)
          .add("cacheHit", cacheHit)
          .add("totalBytesBilled", totalBytesBilled)
          .add("totalBytesProcessed", totalBytesProcessed)
          .add("queryPlan", queryPlan);
    }

    @Override
    public final boolean equals(Object obj) {
      return obj == this
          || obj != null
          && obj.getClass().equals(QueryStatistics.class)
          && baseEquals((QueryStatistics) obj);
    }

    @Override
    public final int hashCode() {
      return Objects.hash(baseHashCode(), billingTier, cacheHit, totalBytesBilled,
          totalBytesProcessed, queryPlan);
    }

    @Override
    com.google.api.services.bigquery.model.JobStatistics toPb() {
      JobStatistics2 queryStatisticsPb = new JobStatistics2();
      queryStatisticsPb.setBillingTier(billingTier);
      queryStatisticsPb.setCacheHit(cacheHit);
      queryStatisticsPb.setTotalBytesBilled(totalBytesBilled);
      queryStatisticsPb.setTotalBytesProcessed(totalBytesProcessed);
      if (queryPlan != null) {
        queryStatisticsPb.setQueryPlan(Lists.transform(queryPlan, QueryStage.TO_PB_FUNCTION));
      }
      return super.toPb().setQuery(queryStatisticsPb);
    }

    static Builder builder() {
      return new Builder();
    }

    @SuppressWarnings("unchecked")
    static QueryStatistics fromPb(
        com.google.api.services.bigquery.model.JobStatistics statisticPb) {
      return new Builder(statisticPb).build();
    }
  }

  abstract static class Builder<T extends JobStatistics, B extends Builder<T, B>> {

    private Long creationTime;
    private Long endTime;
    private Long startTime;

    protected Builder() {}

    protected Builder(com.google.api.services.bigquery.model.JobStatistics statisticsPb) {
      this.creationTime = statisticsPb.getCreationTime();
      this.endTime = statisticsPb.getEndTime();
      this.startTime = statisticsPb.getStartTime();
    }

    @SuppressWarnings("unchecked")
    protected B self() {
      return (B) this;
    }

    B creationTime(Long creationTime) {
      this.creationTime = creationTime;
      return self();
    }

    B endTime(Long endTime) {
      this.endTime = endTime;
      return self();
    }

    B startTime(Long startTime) {
      this.startTime = startTime;
      return self();
    }

    abstract T build();
  }

  protected JobStatistics(Builder builder) {
    this.creationTime = builder.creationTime;
    this.endTime = builder.endTime;
    this.startTime = builder.startTime;
  }

  /**
   * Returns the creation time of the job in milliseconds since epoch.
   */
  public Long creationTime() {
    return creationTime;
  }

  /**
   * Returns the end time of the job in milliseconds since epoch. Returns {@code null} if the
   * job has not finished yet.
   */
  public Long endTime() {
    return endTime;
  }

  /**
   * Returns the start time of the job in milliseconds since epoch. Returns {@code null} if the
   * job has not started yet.
   */
  public Long startTime() {
    return startTime;
  }

  ToStringHelper toStringHelper() {
    return MoreObjects.toStringHelper(this)
        .add("creationTime", creationTime)
        .add("endTime", endTime)
        .add("startTime", startTime);
  }

  @Override
  public String toString() {
    return toStringHelper().toString();
  }

  final int baseHashCode() {
    return Objects.hash(creationTime, endTime, startTime);
  }

  final boolean baseEquals(JobStatistics jobStatistics) {
    return Objects.equals(toPb(), jobStatistics.toPb());
  }

  com.google.api.services.bigquery.model.JobStatistics toPb() {
    com.google.api.services.bigquery.model.JobStatistics statistics =
        new com.google.api.services.bigquery.model.JobStatistics();
    statistics.setCreationTime(creationTime);
    statistics.setEndTime(endTime);
    statistics.setStartTime(startTime);
    return statistics;
  }

  @SuppressWarnings("unchecked")
  static <T extends JobStatistics> T fromPb(
      com.google.api.services.bigquery.model.JobStatistics statisticPb) {
    if (statisticPb.getLoad() != null) {
      return (T) LoadStatistics.fromPb(statisticPb);
    } else if (statisticPb.getExtract() != null) {
      return (T) ExtractStatistics.fromPb(statisticPb);
    } else if (statisticPb.getQuery() != null) {
      return (T) QueryStatistics.fromPb(statisticPb);
    } else {
      return (T) CopyStatistics.fromPb(statisticPb);
    }
  }
}
