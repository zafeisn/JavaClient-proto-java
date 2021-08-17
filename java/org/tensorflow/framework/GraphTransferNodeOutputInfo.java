// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/graph_transfer_info.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.GraphTransferNodeOutputInfo}
 */
public  final class GraphTransferNodeOutputInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.GraphTransferNodeOutputInfo)
    GraphTransferNodeOutputInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GraphTransferNodeOutputInfo.newBuilder() to construct.
  private GraphTransferNodeOutputInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GraphTransferNodeOutputInfo() {
    nodeId_ = 0;
    maxByteSize_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GraphTransferNodeOutputInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            nodeId_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              maxByteSize_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            maxByteSize_.add(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              maxByteSize_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              maxByteSize_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        maxByteSize_ = java.util.Collections.unmodifiableList(maxByteSize_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.GraphTransferNodeOutputInfo.class, org.tensorflow.framework.GraphTransferNodeOutputInfo.Builder.class);
  }

  private int bitField0_;
  public static final int NODE_ID_FIELD_NUMBER = 1;
  private int nodeId_;
  /**
   * <code>int32 node_id = 1;</code>
   */
  public int getNodeId() {
    return nodeId_;
  }

  public static final int MAX_BYTE_SIZE_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> maxByteSize_;
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getMaxByteSizeList() {
    return maxByteSize_;
  }
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  public int getMaxByteSizeCount() {
    return maxByteSize_.size();
  }
  /**
   * <code>repeated int32 max_byte_size = 2;</code>
   */
  public int getMaxByteSize(int index) {
    return maxByteSize_.get(index);
  }
  private int maxByteSizeMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (nodeId_ != 0) {
      output.writeInt32(1, nodeId_);
    }
    if (getMaxByteSizeList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(maxByteSizeMemoizedSerializedSize);
    }
    for (int i = 0; i < maxByteSize_.size(); i++) {
      output.writeInt32NoTag(maxByteSize_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nodeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nodeId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < maxByteSize_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(maxByteSize_.get(i));
      }
      size += dataSize;
      if (!getMaxByteSizeList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      maxByteSizeMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.GraphTransferNodeOutputInfo)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.GraphTransferNodeOutputInfo other = (org.tensorflow.framework.GraphTransferNodeOutputInfo) obj;

    boolean result = true;
    result = result && (getNodeId()
        == other.getNodeId());
    result = result && getMaxByteSizeList()
        .equals(other.getMaxByteSizeList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNodeId();
    if (getMaxByteSizeCount() > 0) {
      hash = (37 * hash) + MAX_BYTE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxByteSizeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.GraphTransferNodeOutputInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.GraphTransferNodeOutputInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.GraphTransferNodeOutputInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.GraphTransferNodeOutputInfo)
      org.tensorflow.framework.GraphTransferNodeOutputInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.GraphTransferNodeOutputInfo.class, org.tensorflow.framework.GraphTransferNodeOutputInfo.Builder.class);
    }

    // Construct using org.tensorflow.framework.GraphTransferNodeOutputInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nodeId_ = 0;

      maxByteSize_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.GraphTransferInfoProto.internal_static_tensorflow_GraphTransferNodeOutputInfo_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstanceForType() {
      return org.tensorflow.framework.GraphTransferNodeOutputInfo.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo build() {
      org.tensorflow.framework.GraphTransferNodeOutputInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.GraphTransferNodeOutputInfo buildPartial() {
      org.tensorflow.framework.GraphTransferNodeOutputInfo result = new org.tensorflow.framework.GraphTransferNodeOutputInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.nodeId_ = nodeId_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        maxByteSize_ = java.util.Collections.unmodifiableList(maxByteSize_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.maxByteSize_ = maxByteSize_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.GraphTransferNodeOutputInfo) {
        return mergeFrom((org.tensorflow.framework.GraphTransferNodeOutputInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.GraphTransferNodeOutputInfo other) {
      if (other == org.tensorflow.framework.GraphTransferNodeOutputInfo.getDefaultInstance()) return this;
      if (other.getNodeId() != 0) {
        setNodeId(other.getNodeId());
      }
      if (!other.maxByteSize_.isEmpty()) {
        if (maxByteSize_.isEmpty()) {
          maxByteSize_ = other.maxByteSize_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureMaxByteSizeIsMutable();
          maxByteSize_.addAll(other.maxByteSize_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.GraphTransferNodeOutputInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.GraphTransferNodeOutputInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int nodeId_ ;
    /**
     * <code>int32 node_id = 1;</code>
     */
    public int getNodeId() {
      return nodeId_;
    }
    /**
     * <code>int32 node_id = 1;</code>
     */
    public Builder setNodeId(int value) {
      
      nodeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 node_id = 1;</code>
     */
    public Builder clearNodeId() {
      
      nodeId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> maxByteSize_ = java.util.Collections.emptyList();
    private void ensureMaxByteSizeIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        maxByteSize_ = new java.util.ArrayList<java.lang.Integer>(maxByteSize_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getMaxByteSizeList() {
      return java.util.Collections.unmodifiableList(maxByteSize_);
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public int getMaxByteSizeCount() {
      return maxByteSize_.size();
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public int getMaxByteSize(int index) {
      return maxByteSize_.get(index);
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public Builder setMaxByteSize(
        int index, int value) {
      ensureMaxByteSizeIsMutable();
      maxByteSize_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public Builder addMaxByteSize(int value) {
      ensureMaxByteSizeIsMutable();
      maxByteSize_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public Builder addAllMaxByteSize(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureMaxByteSizeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, maxByteSize_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 max_byte_size = 2;</code>
     */
    public Builder clearMaxByteSize() {
      maxByteSize_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.GraphTransferNodeOutputInfo)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.GraphTransferNodeOutputInfo)
  private static final org.tensorflow.framework.GraphTransferNodeOutputInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.GraphTransferNodeOutputInfo();
  }

  public static org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GraphTransferNodeOutputInfo>
      PARSER = new com.google.protobuf.AbstractParser<GraphTransferNodeOutputInfo>() {
    @java.lang.Override
    public GraphTransferNodeOutputInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GraphTransferNodeOutputInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GraphTransferNodeOutputInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GraphTransferNodeOutputInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.GraphTransferNodeOutputInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

