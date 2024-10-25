// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-classification-mnb.proto

// Protobuf Java Version: 3.25.5
package org.tribuo.classification.mnb.protos;

public interface MultinomialNaiveBayesProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.classification.mnb.MultinomialNaiveBayesProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return The metadata.
   */
  org.tribuo.protos.core.ModelDataProto getMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   */
  org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder();

  /**
   * <code>.tribuo.math.TensorProto label_word_probs = 2;</code>
   * @return Whether the labelWordProbs field is set.
   */
  boolean hasLabelWordProbs();
  /**
   * <code>.tribuo.math.TensorProto label_word_probs = 2;</code>
   * @return The labelWordProbs.
   */
  org.tribuo.math.protos.TensorProto getLabelWordProbs();
  /**
   * <code>.tribuo.math.TensorProto label_word_probs = 2;</code>
   */
  org.tribuo.math.protos.TensorProtoOrBuilder getLabelWordProbsOrBuilder();

  /**
   * <code>double alpha = 3;</code>
   * @return The alpha.
   */
  double getAlpha();
}
