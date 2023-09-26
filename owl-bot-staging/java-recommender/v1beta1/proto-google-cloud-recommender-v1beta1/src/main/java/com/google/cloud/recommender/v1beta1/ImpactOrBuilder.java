// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface ImpactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.Impact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Category that is being targeted.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.Impact.Category category = 1;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * Category that is being targeted.
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.Impact.Category category = 1;</code>
   * @return The category.
   */
  com.google.cloud.recommender.v1beta1.Impact.Category getCategory();

  /**
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   * @return Whether the costProjection field is set.
   */
  boolean hasCostProjection();
  /**
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   * @return The costProjection.
   */
  com.google.cloud.recommender.v1beta1.CostProjection getCostProjection();
  /**
   * <pre>
   * Use with CategoryType.COST
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.CostProjection cost_projection = 100;</code>
   */
  com.google.cloud.recommender.v1beta1.CostProjectionOrBuilder getCostProjectionOrBuilder();

  /**
   * <pre>
   * Use with CategoryType.SECURITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SecurityProjection security_projection = 101;</code>
   * @return Whether the securityProjection field is set.
   */
  boolean hasSecurityProjection();
  /**
   * <pre>
   * Use with CategoryType.SECURITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SecurityProjection security_projection = 101;</code>
   * @return The securityProjection.
   */
  com.google.cloud.recommender.v1beta1.SecurityProjection getSecurityProjection();
  /**
   * <pre>
   * Use with CategoryType.SECURITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SecurityProjection security_projection = 101;</code>
   */
  com.google.cloud.recommender.v1beta1.SecurityProjectionOrBuilder getSecurityProjectionOrBuilder();

  /**
   * <pre>
   * Use with CategoryType.SUSTAINABILITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SustainabilityProjection sustainability_projection = 102;</code>
   * @return Whether the sustainabilityProjection field is set.
   */
  boolean hasSustainabilityProjection();
  /**
   * <pre>
   * Use with CategoryType.SUSTAINABILITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SustainabilityProjection sustainability_projection = 102;</code>
   * @return The sustainabilityProjection.
   */
  com.google.cloud.recommender.v1beta1.SustainabilityProjection getSustainabilityProjection();
  /**
   * <pre>
   * Use with CategoryType.SUSTAINABILITY
   * </pre>
   *
   * <code>.google.cloud.recommender.v1beta1.SustainabilityProjection sustainability_projection = 102;</code>
   */
  com.google.cloud.recommender.v1beta1.SustainabilityProjectionOrBuilder getSustainabilityProjectionOrBuilder();

  com.google.cloud.recommender.v1beta1.Impact.ProjectionCase getProjectionCase();
}
