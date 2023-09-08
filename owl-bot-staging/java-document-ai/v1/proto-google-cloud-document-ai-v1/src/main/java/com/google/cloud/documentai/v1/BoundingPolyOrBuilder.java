// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1/geometry.proto

package com.google.cloud.documentai.v1;

public interface BoundingPolyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.BoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Vertex vertices = 1;</code>
   */
  java.util.List<com.google.cloud.documentai.v1.Vertex> 
      getVerticesList();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Vertex vertices = 1;</code>
   */
  com.google.cloud.documentai.v1.Vertex getVertices(int index);
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Vertex vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Vertex vertices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1.VertexOrBuilder> 
      getVerticesOrBuilderList();
  /**
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Vertex vertices = 1;</code>
   */
  com.google.cloud.documentai.v1.VertexOrBuilder getVerticesOrBuilder(
      int index);

  /**
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.NormalizedVertex normalized_vertices = 2;</code>
   */
  java.util.List<com.google.cloud.documentai.v1.NormalizedVertex> 
      getNormalizedVerticesList();
  /**
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.NormalizedVertex normalized_vertices = 2;</code>
   */
  com.google.cloud.documentai.v1.NormalizedVertex getNormalizedVertices(int index);
  /**
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.NormalizedVertex normalized_vertices = 2;</code>
   */
  int getNormalizedVerticesCount();
  /**
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.NormalizedVertex normalized_vertices = 2;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1.NormalizedVertexOrBuilder> 
      getNormalizedVerticesOrBuilderList();
  /**
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.NormalizedVertex normalized_vertices = 2;</code>
   */
  com.google.cloud.documentai.v1.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}
