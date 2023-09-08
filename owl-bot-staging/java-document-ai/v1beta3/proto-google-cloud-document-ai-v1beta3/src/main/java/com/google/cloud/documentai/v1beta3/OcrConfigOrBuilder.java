// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/document_io.proto

package com.google.cloud.documentai.v1beta3;

public interface OcrConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.OcrConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hints for the OCR model.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig.Hints hints = 2;</code>
   * @return Whether the hints field is set.
   */
  boolean hasHints();
  /**
   * <pre>
   * Hints for the OCR model.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig.Hints hints = 2;</code>
   * @return The hints.
   */
  com.google.cloud.documentai.v1beta3.OcrConfig.Hints getHints();
  /**
   * <pre>
   * Hints for the OCR model.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.OcrConfig.Hints hints = 2;</code>
   */
  com.google.cloud.documentai.v1beta3.OcrConfig.HintsOrBuilder getHintsOrBuilder();

  /**
   * <pre>
   * Enables special handling for PDFs with existing text information. Results
   * in better text extraction quality in such PDF inputs.
   * </pre>
   *
   * <code>bool enable_native_pdf_parsing = 3;</code>
   * @return The enableNativePdfParsing.
   */
  boolean getEnableNativePdfParsing();

  /**
   * <pre>
   * Enables intelligent document quality scores after OCR. Can help with
   * diagnosing why OCR responses are of poor quality for a given input.
   * Adds additional latency comparable to regular OCR to the process call.
   * </pre>
   *
   * <code>bool enable_image_quality_scores = 4;</code>
   * @return The enableImageQualityScores.
   */
  boolean getEnableImageQualityScores();

  /**
   * <pre>
   * A list of advanced OCR options to further fine-tune OCR behavior. Current
   * valid values are:
   *
   * - `legacy_layout`: a heuristics layout detection algorithm, which serves as
   * an alternative to the current ML-based layout detection algorithm.
   * Customers can choose the best suitable layout algorithm based on their
   * situation.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 5;</code>
   * @return A list containing the advancedOcrOptions.
   */
  java.util.List<java.lang.String>
      getAdvancedOcrOptionsList();
  /**
   * <pre>
   * A list of advanced OCR options to further fine-tune OCR behavior. Current
   * valid values are:
   *
   * - `legacy_layout`: a heuristics layout detection algorithm, which serves as
   * an alternative to the current ML-based layout detection algorithm.
   * Customers can choose the best suitable layout algorithm based on their
   * situation.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 5;</code>
   * @return The count of advancedOcrOptions.
   */
  int getAdvancedOcrOptionsCount();
  /**
   * <pre>
   * A list of advanced OCR options to further fine-tune OCR behavior. Current
   * valid values are:
   *
   * - `legacy_layout`: a heuristics layout detection algorithm, which serves as
   * an alternative to the current ML-based layout detection algorithm.
   * Customers can choose the best suitable layout algorithm based on their
   * situation.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 5;</code>
   * @param index The index of the element to return.
   * @return The advancedOcrOptions at the given index.
   */
  java.lang.String getAdvancedOcrOptions(int index);
  /**
   * <pre>
   * A list of advanced OCR options to further fine-tune OCR behavior. Current
   * valid values are:
   *
   * - `legacy_layout`: a heuristics layout detection algorithm, which serves as
   * an alternative to the current ML-based layout detection algorithm.
   * Customers can choose the best suitable layout algorithm based on their
   * situation.
   * </pre>
   *
   * <code>repeated string advanced_ocr_options = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the advancedOcrOptions at the given index.
   */
  com.google.protobuf.ByteString
      getAdvancedOcrOptionsBytes(int index);

  /**
   * <pre>
   * Includes symbol level OCR information if set to true.
   * </pre>
   *
   * <code>bool enable_symbol = 6;</code>
   * @return The enableSymbol.
   */
  boolean getEnableSymbol();

  /**
   * <pre>
   * Turn on font id model and returns font style information.
   * </pre>
   *
   * <code>bool compute_style_info = 8;</code>
   * @return The computeStyleInfo.
   */
  boolean getComputeStyleInfo();
}
