// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

public interface ImageContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ImageContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.LatLongRect lat_long_rect = 1;</code>
   */
  boolean hasLatLongRect();
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.LatLongRect lat_long_rect = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.LatLongRect getLatLongRect();
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.LatLongRect lat_long_rect = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.LatLongRectOrBuilder getLatLongRectOrBuilder();

  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   */
  java.util.List<java.lang.String>
      getLanguageHintsList();
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   */
  int getLanguageHintsCount();
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   */
  java.lang.String getLanguageHints(int index);
  /**
   * <pre>
   * List of languages to use for TEXT_DETECTION. In most cases, an empty value
   * yields the best results since it enables automatic language detection. For
   * languages based on the Latin alphabet, setting `language_hints` is not
   * needed. In rare cases, when the language of the text in the image is known,
   * setting a hint will help get better results (although it will be a
   * significant hindrance if the hint is wrong). Text detection returns an
   * error if one or more of the specified languages is not one of the
   * [supported languages](/vision/docs/languages).
   * </pre>
   *
   * <code>repeated string language_hints = 2;</code>
   */
  com.google.protobuf.ByteString
      getLanguageHintsBytes(int index);

  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.CropHintsParams crop_hints_params = 4;</code>
   */
  boolean hasCropHintsParams();
  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.CropHintsParams crop_hints_params = 4;</code>
   */
  com.google.cloud.vision.v1p3beta1.CropHintsParams getCropHintsParams();
  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.CropHintsParams crop_hints_params = 4;</code>
   */
  com.google.cloud.vision.v1p3beta1.CropHintsParamsOrBuilder getCropHintsParamsOrBuilder();

  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSearchParams product_search_params = 5;</code>
   */
  boolean hasProductSearchParams();
  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSearchParams product_search_params = 5;</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchParams getProductSearchParams();
  /**
   * <pre>
   * Parameters for product search.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.ProductSearchParams product_search_params = 5;</code>
   */
  com.google.cloud.vision.v1p3beta1.ProductSearchParamsOrBuilder getProductSearchParamsOrBuilder();

  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.WebDetectionParams web_detection_params = 6;</code>
   */
  boolean hasWebDetectionParams();
  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.WebDetectionParams web_detection_params = 6;</code>
   */
  com.google.cloud.vision.v1p3beta1.WebDetectionParams getWebDetectionParams();
  /**
   * <pre>
   * Parameters for web detection.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.WebDetectionParams web_detection_params = 6;</code>
   */
  com.google.cloud.vision.v1p3beta1.WebDetectionParamsOrBuilder getWebDetectionParamsOrBuilder();
}
