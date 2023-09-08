// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/feature.proto

package com.google.cloud.gkehub.v1;

public interface CommonFeatureSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.CommonFeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1.FeatureSpec multiclusteringress = 102;</code>
   * @return Whether the multiclusteringress field is set.
   */
  boolean hasMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1.FeatureSpec multiclusteringress = 102;</code>
   * @return The multiclusteringress.
   */
  com.google.cloud.gkehub.multiclusteringress.v1.FeatureSpec getMulticlusteringress();
  /**
   * <pre>
   * Multicluster Ingress-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1.FeatureSpec multiclusteringress = 102;</code>
   */
  com.google.cloud.gkehub.multiclusteringress.v1.FeatureSpecOrBuilder getMulticlusteringressOrBuilder();

  com.google.cloud.gkehub.v1.CommonFeatureSpec.FeatureSpecCase getFeatureSpecCase();
}
