// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface VideoPayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.VideoPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Video format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Video uri from the user bucket.
   * </pre>
   *
   * <code>string video_uri = 2;</code>
   */
  java.lang.String getVideoUri();
  /**
   *
   *
   * <pre>
   * Video uri from the user bucket.
   * </pre>
   *
   * <code>string video_uri = 2;</code>
   */
  com.google.protobuf.ByteString getVideoUriBytes();

  /**
   *
   *
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.VideoThumbnail> getVideoThumbnailsList();
  /**
   *
   *
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoThumbnail getVideoThumbnails(int index);
  /**
   *
   *
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  int getVideoThumbnailsCount();
  /**
   *
   *
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VideoThumbnailOrBuilder>
      getVideoThumbnailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of video thumbnails.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.VideoThumbnail video_thumbnails = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoThumbnailOrBuilder getVideoThumbnailsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * FPS of the video.
   * </pre>
   *
   * <code>float frame_rate = 4;</code>
   */
  float getFrameRate();
}
