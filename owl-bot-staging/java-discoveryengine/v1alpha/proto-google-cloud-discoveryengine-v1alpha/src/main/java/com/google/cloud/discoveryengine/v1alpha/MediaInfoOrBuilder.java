// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/discoveryengine/v1alpha/user_event.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface MediaInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.MediaInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   * @return Whether the mediaProgressDuration field is set.
   */
  boolean hasMediaProgressDuration();
  /**
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   * @return The mediaProgressDuration.
   */
  com.google.protobuf.Duration getMediaProgressDuration();
  /**
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getMediaProgressDurationOrBuilder();

  /**
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   * @return Whether the mediaProgressPercentage field is set.
   */
  boolean hasMediaProgressPercentage();
  /**
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1alpha.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   * @return The mediaProgressPercentage.
   */
  float getMediaProgressPercentage();
}
