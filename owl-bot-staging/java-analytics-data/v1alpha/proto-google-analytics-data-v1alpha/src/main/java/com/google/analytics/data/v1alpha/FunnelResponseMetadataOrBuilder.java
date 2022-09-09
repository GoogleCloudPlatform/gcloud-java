// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelResponseMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.SamplingMetadata> 
      getSamplingMetadatasList();
  /**
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  com.google.analytics.data.v1alpha.SamplingMetadata getSamplingMetadatas(int index);
  /**
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  int getSamplingMetadatasCount();
  /**
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.SamplingMetadataOrBuilder> 
      getSamplingMetadatasOrBuilderList();
  /**
   * <pre>
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * describes what percentage of events were used in this funnel report. One
   * `samplingMetadatas` is populated for each date range. Each
   * `samplingMetadatas` corresponds to a date range in order that date ranges
   * were specified in the request.
   * However if the results are not sampled, this field will not be defined.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.SamplingMetadata sampling_metadatas = 1;</code>
   */
  com.google.analytics.data.v1alpha.SamplingMetadataOrBuilder getSamplingMetadatasOrBuilder(
      int index);
}
