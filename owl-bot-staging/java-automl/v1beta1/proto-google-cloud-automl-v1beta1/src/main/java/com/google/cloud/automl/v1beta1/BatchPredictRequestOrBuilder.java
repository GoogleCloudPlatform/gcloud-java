// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/prediction_service.proto

package com.google.cloud.automl.v1beta1;

public interface BatchPredictRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.BatchPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the model requested to serve the batch prediction.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the model requested to serve the batch prediction.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();
  /**
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The inputConfig.
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfig getInputConfig();
  /**
   * <pre>
   * Required. The input configuration for batch prediction.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictInputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictInputConfigOrBuilder getInputConfigOrBuilder();

  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictOutputConfig output_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictOutputConfig output_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The outputConfig.
   */
  com.google.cloud.automl.v1beta1.BatchPredictOutputConfig getOutputConfig();
  /**
   * <pre>
   * Required. The Configuration specifying where output predictions should
   * be written.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BatchPredictOutputConfig output_config = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.automl.v1beta1.BatchPredictOutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * Required. Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * *  For Video Classification :
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *        makes predictions for a video, it will only produce results that
   *        have at least this confidence score. The default is 0.5.
   *    `segment_classification` - (boolean) Set to true to request
   *        segment-level classification. AutoML Video Intelligence returns
   *        labels and their confidence scores for the entire segment of the
   *        video that user specified in the request configuration.
   *        The default is "true".
   *    `shot_classification` - (boolean) Set to true to request shot-level
   *        classification. AutoML Video Intelligence determines the boundaries
   *        for each camera shot in the entire segment of the video that user
   *        specified in the request configuration. AutoML Video Intelligence
   *        then returns labels and their confidence scores for each detected
   *        shot, along with the start and end time of the shot.
   *        WARNING: Model evaluation is not done for this classification type,
   *        the quality of it depends on training data, but there are no metrics
   *        provided to describe that quality. The default is "false".
   *    `1s_interval_classification` - (boolean) Set to true to request
   *        classification for a video at one-second intervals. AutoML Video
   *        Intelligence returns labels and their confidence scores for each
   *        second of the entire segment of the video that user specified in the
   *        request configuration.
   *        WARNING: Model evaluation is not done for this classification
   *        type, the quality of it depends on training data, but there are no
   *        metrics provided to describe that quality. The default is
   *        "false".
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotations. The
   *        default is false.
   * *  For Video Object Tracking:
   *    `score_threshold` - (float) When Model detects objects on video frames,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned per frame. Default is 100, the requested
   *        value may be limited by server.
   *    `min_bounding_box_size` - (float) Only bounding boxes with shortest edge
   *      at least that long as a relative value of video frame size will be
   *      returned. Value in 0 to 1 range. Default is 0.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getParamsCount();
  /**
   * <pre>
   * Required. Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * *  For Video Classification :
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *        makes predictions for a video, it will only produce results that
   *        have at least this confidence score. The default is 0.5.
   *    `segment_classification` - (boolean) Set to true to request
   *        segment-level classification. AutoML Video Intelligence returns
   *        labels and their confidence scores for the entire segment of the
   *        video that user specified in the request configuration.
   *        The default is "true".
   *    `shot_classification` - (boolean) Set to true to request shot-level
   *        classification. AutoML Video Intelligence determines the boundaries
   *        for each camera shot in the entire segment of the video that user
   *        specified in the request configuration. AutoML Video Intelligence
   *        then returns labels and their confidence scores for each detected
   *        shot, along with the start and end time of the shot.
   *        WARNING: Model evaluation is not done for this classification type,
   *        the quality of it depends on training data, but there are no metrics
   *        provided to describe that quality. The default is "false".
   *    `1s_interval_classification` - (boolean) Set to true to request
   *        classification for a video at one-second intervals. AutoML Video
   *        Intelligence returns labels and their confidence scores for each
   *        second of the entire segment of the video that user specified in the
   *        request configuration.
   *        WARNING: Model evaluation is not done for this classification
   *        type, the quality of it depends on training data, but there are no
   *        metrics provided to describe that quality. The default is
   *        "false".
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotations. The
   *        default is false.
   * *  For Video Object Tracking:
   *    `score_threshold` - (float) When Model detects objects on video frames,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned per frame. Default is 100, the requested
   *        value may be limited by server.
   *    `min_bounding_box_size` - (float) Only bounding boxes with shortest edge
   *      at least that long as a relative value of video frame size will be
   *      returned. Value in 0 to 1 range. Default is 0.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsParams(
      java.lang.String key);
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParams();
  /**
   * <pre>
   * Required. Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * *  For Video Classification :
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *        makes predictions for a video, it will only produce results that
   *        have at least this confidence score. The default is 0.5.
   *    `segment_classification` - (boolean) Set to true to request
   *        segment-level classification. AutoML Video Intelligence returns
   *        labels and their confidence scores for the entire segment of the
   *        video that user specified in the request configuration.
   *        The default is "true".
   *    `shot_classification` - (boolean) Set to true to request shot-level
   *        classification. AutoML Video Intelligence determines the boundaries
   *        for each camera shot in the entire segment of the video that user
   *        specified in the request configuration. AutoML Video Intelligence
   *        then returns labels and their confidence scores for each detected
   *        shot, along with the start and end time of the shot.
   *        WARNING: Model evaluation is not done for this classification type,
   *        the quality of it depends on training data, but there are no metrics
   *        provided to describe that quality. The default is "false".
   *    `1s_interval_classification` - (boolean) Set to true to request
   *        classification for a video at one-second intervals. AutoML Video
   *        Intelligence returns labels and their confidence scores for each
   *        second of the entire segment of the video that user specified in the
   *        request configuration.
   *        WARNING: Model evaluation is not done for this classification
   *        type, the quality of it depends on training data, but there are no
   *        metrics provided to describe that quality. The default is
   *        "false".
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotations. The
   *        default is false.
   * *  For Video Object Tracking:
   *    `score_threshold` - (float) When Model detects objects on video frames,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned per frame. Default is 100, the requested
   *        value may be limited by server.
   *    `min_bounding_box_size` - (float) Only bounding boxes with shortest edge
   *      at least that long as a relative value of video frame size will be
   *      returned. Value in 0 to 1 range. Default is 0.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParamsMap();
  /**
   * <pre>
   * Required. Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * *  For Video Classification :
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *        makes predictions for a video, it will only produce results that
   *        have at least this confidence score. The default is 0.5.
   *    `segment_classification` - (boolean) Set to true to request
   *        segment-level classification. AutoML Video Intelligence returns
   *        labels and their confidence scores for the entire segment of the
   *        video that user specified in the request configuration.
   *        The default is "true".
   *    `shot_classification` - (boolean) Set to true to request shot-level
   *        classification. AutoML Video Intelligence determines the boundaries
   *        for each camera shot in the entire segment of the video that user
   *        specified in the request configuration. AutoML Video Intelligence
   *        then returns labels and their confidence scores for each detected
   *        shot, along with the start and end time of the shot.
   *        WARNING: Model evaluation is not done for this classification type,
   *        the quality of it depends on training data, but there are no metrics
   *        provided to describe that quality. The default is "false".
   *    `1s_interval_classification` - (boolean) Set to true to request
   *        classification for a video at one-second intervals. AutoML Video
   *        Intelligence returns labels and their confidence scores for each
   *        second of the entire segment of the video that user specified in the
   *        request configuration.
   *        WARNING: Model evaluation is not done for this classification
   *        type, the quality of it depends on training data, but there are no
   *        metrics provided to describe that quality. The default is
   *        "false".
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotations. The
   *        default is false.
   * *  For Video Object Tracking:
   *    `score_threshold` - (float) When Model detects objects on video frames,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned per frame. Default is 100, the requested
   *        value may be limited by server.
   *    `min_bounding_box_size` - (float) Only bounding boxes with shortest edge
   *      at least that long as a relative value of video frame size will be
   *      returned. Value in 0 to 1 range. Default is 0.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  /* nullable */
java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Required. Additional domain-specific parameters for the predictions, any string must
   * be up to 25000 characters long.
   * *  For Text Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for a text snippet, it will only produce results
   *         that have at least this confidence score. The default is 0.5.
   * *  For Image Classification:
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *         makes predictions for an image, it will only produce results that
   *         have at least this confidence score. The default is 0.5.
   * *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be produced per image. Default is 100, the
   *        requested value may be limited by server.
   * *  For Video Classification :
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *        makes predictions for a video, it will only produce results that
   *        have at least this confidence score. The default is 0.5.
   *    `segment_classification` - (boolean) Set to true to request
   *        segment-level classification. AutoML Video Intelligence returns
   *        labels and their confidence scores for the entire segment of the
   *        video that user specified in the request configuration.
   *        The default is "true".
   *    `shot_classification` - (boolean) Set to true to request shot-level
   *        classification. AutoML Video Intelligence determines the boundaries
   *        for each camera shot in the entire segment of the video that user
   *        specified in the request configuration. AutoML Video Intelligence
   *        then returns labels and their confidence scores for each detected
   *        shot, along with the start and end time of the shot.
   *        WARNING: Model evaluation is not done for this classification type,
   *        the quality of it depends on training data, but there are no metrics
   *        provided to describe that quality. The default is "false".
   *    `1s_interval_classification` - (boolean) Set to true to request
   *        classification for a video at one-second intervals. AutoML Video
   *        Intelligence returns labels and their confidence scores for each
   *        second of the entire segment of the video that user specified in the
   *        request configuration.
   *        WARNING: Model evaluation is not done for this classification
   *        type, the quality of it depends on training data, but there are no
   *        metrics provided to describe that quality. The default is
   *        "false".
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotations. The
   *        default is false.
   * *  For Video Object Tracking:
   *    `score_threshold` - (float) When Model detects objects on video frames,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned per frame. Default is 100, the requested
   *        value may be limited by server.
   *    `min_bounding_box_size` - (float) Only bounding boxes with shortest edge
   *      at least that long as a relative value of video frame size will be
   *      returned. Value in 0 to 1 range. Default is 0.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  java.lang.String getParamsOrThrow(
      java.lang.String key);
}
