// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/source_context.proto

package com.google.containeranalysis.v1alpha1;

public interface AliasContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.AliasContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The alias kind.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext.Kind kind = 1;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * The alias kind.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext.Kind kind = 1;</code>
   */
  com.google.containeranalysis.v1alpha1.AliasContext.Kind getKind();

  /**
   * <pre>
   * The alias name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The alias name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
