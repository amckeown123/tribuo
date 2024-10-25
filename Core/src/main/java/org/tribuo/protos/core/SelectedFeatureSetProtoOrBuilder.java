// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

// Protobuf Java Version: 3.25.5
package org.tribuo.protos.core;

public interface SelectedFeatureSetProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.SelectedFeatureSetProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string feature_names = 1;</code>
   * @return A list containing the featureNames.
   */
  java.util.List<java.lang.String>
      getFeatureNamesList();
  /**
   * <code>repeated string feature_names = 1;</code>
   * @return The count of featureNames.
   */
  int getFeatureNamesCount();
  /**
   * <code>repeated string feature_names = 1;</code>
   * @param index The index of the element to return.
   * @return The featureNames at the given index.
   */
  java.lang.String getFeatureNames(int index);
  /**
   * <code>repeated string feature_names = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureNames at the given index.
   */
  com.google.protobuf.ByteString
      getFeatureNamesBytes(int index);

  /**
   * <code>repeated double feature_scores = 2;</code>
   * @return A list containing the featureScores.
   */
  java.util.List<java.lang.Double> getFeatureScoresList();
  /**
   * <code>repeated double feature_scores = 2;</code>
   * @return The count of featureScores.
   */
  int getFeatureScoresCount();
  /**
   * <code>repeated double feature_scores = 2;</code>
   * @param index The index of the element to return.
   * @return The featureScores at the given index.
   */
  double getFeatureScores(int index);

  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   * @return Whether the provenance field is set.
   */
  boolean hasProvenance();
  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   * @return The provenance.
   */
  com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProto getProvenance();
  /**
   * <code>.olcut.RootProvenanceProto provenance = 3;</code>
   */
  com.oracle.labs.mlrg.olcut.config.protobuf.protos.RootProvenanceProtoOrBuilder getProvenanceOrBuilder();

  /**
   * <code>bool ordered = 4;</code>
   * @return The ordered.
   */
  boolean getOrdered();
}
