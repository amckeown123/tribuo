// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

// Protobuf Java Version: 3.25.5
package org.tribuo.protos.core;

public interface MutableFeatureMapProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.MutableFeatureMapProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool convert_high_cardinality = 1;</code>
   * @return The convertHighCardinality.
   */
  boolean getConvertHighCardinality();

  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  java.util.List<org.tribuo.protos.core.VariableInfoProto> 
      getInfoList();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  org.tribuo.protos.core.VariableInfoProto getInfo(int index);
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  int getInfoCount();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  java.util.List<? extends org.tribuo.protos.core.VariableInfoProtoOrBuilder> 
      getInfoOrBuilderList();
  /**
   * <code>repeated .tribuo.core.VariableInfoProto info = 2;</code>
   */
  org.tribuo.protos.core.VariableInfoProtoOrBuilder getInfoOrBuilder(
      int index);
}
