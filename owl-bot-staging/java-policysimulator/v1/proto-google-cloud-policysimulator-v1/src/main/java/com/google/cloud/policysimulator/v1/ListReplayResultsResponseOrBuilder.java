// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/policysimulator/v1/simulator.proto

package com.google.cloud.policysimulator.v1;

public interface ListReplayResultsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policysimulator.v1.ListReplayResultsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The results of running a [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>repeated .google.cloud.policysimulator.v1.ReplayResult replay_results = 1;</code>
   */
  java.util.List<com.google.cloud.policysimulator.v1.ReplayResult> 
      getReplayResultsList();
  /**
   * <pre>
   * The results of running a [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>repeated .google.cloud.policysimulator.v1.ReplayResult replay_results = 1;</code>
   */
  com.google.cloud.policysimulator.v1.ReplayResult getReplayResults(int index);
  /**
   * <pre>
   * The results of running a [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>repeated .google.cloud.policysimulator.v1.ReplayResult replay_results = 1;</code>
   */
  int getReplayResultsCount();
  /**
   * <pre>
   * The results of running a [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>repeated .google.cloud.policysimulator.v1.ReplayResult replay_results = 1;</code>
   */
  java.util.List<? extends com.google.cloud.policysimulator.v1.ReplayResultOrBuilder> 
      getReplayResultsOrBuilderList();
  /**
   * <pre>
   * The results of running a [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>repeated .google.cloud.policysimulator.v1.ReplayResult replay_results = 1;</code>
   */
  com.google.cloud.policysimulator.v1.ReplayResultOrBuilder getReplayResultsOrBuilder(
      int index);

  /**
   * <pre>
   * A token that you can use to retrieve the next page of
   * [ReplayResult][google.cloud.policysimulator.v1.ReplayResult] objects. If
   * this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token that you can use to retrieve the next page of
   * [ReplayResult][google.cloud.policysimulator.v1.ReplayResult] objects. If
   * this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
