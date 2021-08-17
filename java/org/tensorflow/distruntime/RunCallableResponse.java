// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.RunCallableResponse}
 */
public  final class RunCallableResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.RunCallableResponse)
    RunCallableResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunCallableResponse.newBuilder() to construct.
  private RunCallableResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunCallableResponse() {
    fetch_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RunCallableResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              fetch_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            fetch_.add(
                input.readMessage(org.tensorflow.framework.TensorProto.parser(), extensionRegistry));
            break;
          }
          case 18: {
            org.tensorflow.framework.RunMetadata.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(org.tensorflow.framework.RunMetadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        fetch_ = java.util.Collections.unmodifiableList(fetch_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.RunCallableResponse.class, org.tensorflow.distruntime.RunCallableResponse.Builder.class);
  }

  private int bitField0_;
  public static final int FETCH_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.TensorProto> fetch_;
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.TensorProto> getFetchList() {
    return fetch_;
  }
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getFetchOrBuilderList() {
    return fetch_;
  }
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  public int getFetchCount() {
    return fetch_.size();
  }
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  public org.tensorflow.framework.TensorProto getFetch(int index) {
    return fetch_.get(index);
  }
  /**
   * <pre>
   * Values of the tensors returned by the callable, in the order defined in the
   * CallableOptions.fetch field passed to MakeCallable.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
   */
  public org.tensorflow.framework.TensorProtoOrBuilder getFetchOrBuilder(
      int index) {
    return fetch_.get(index);
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private org.tensorflow.framework.RunMetadata metadata_;
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  public org.tensorflow.framework.RunMetadata getMetadata() {
    return metadata_ == null ? org.tensorflow.framework.RunMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  public org.tensorflow.framework.RunMetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

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
    for (int i = 0; i < fetch_.size(); i++) {
      output.writeMessage(1, fetch_.get(i));
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fetch_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fetch_.get(i));
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof org.tensorflow.distruntime.RunCallableResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.RunCallableResponse other = (org.tensorflow.distruntime.RunCallableResponse) obj;

    boolean result = true;
    result = result && getFetchList()
        .equals(other.getFetchList());
    result = result && (hasMetadata() == other.hasMetadata());
    if (hasMetadata()) {
      result = result && getMetadata()
          .equals(other.getMetadata());
    }
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
    if (getFetchCount() > 0) {
      hash = (37 * hash) + FETCH_FIELD_NUMBER;
      hash = (53 * hash) + getFetchList().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.RunCallableResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.RunCallableResponse prototype) {
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
   * Protobuf type {@code tensorflow.RunCallableResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.RunCallableResponse)
      org.tensorflow.distruntime.RunCallableResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.RunCallableResponse.class, org.tensorflow.distruntime.RunCallableResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.RunCallableResponse.newBuilder()
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
        getFetchFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fetchBuilder_ == null) {
        fetch_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fetchBuilder_.clear();
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_RunCallableResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.RunCallableResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableResponse build() {
      org.tensorflow.distruntime.RunCallableResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.RunCallableResponse buildPartial() {
      org.tensorflow.distruntime.RunCallableResponse result = new org.tensorflow.distruntime.RunCallableResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (fetchBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          fetch_ = java.util.Collections.unmodifiableList(fetch_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fetch_ = fetch_;
      } else {
        result.fetch_ = fetchBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
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
      if (other instanceof org.tensorflow.distruntime.RunCallableResponse) {
        return mergeFrom((org.tensorflow.distruntime.RunCallableResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.RunCallableResponse other) {
      if (other == org.tensorflow.distruntime.RunCallableResponse.getDefaultInstance()) return this;
      if (fetchBuilder_ == null) {
        if (!other.fetch_.isEmpty()) {
          if (fetch_.isEmpty()) {
            fetch_ = other.fetch_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFetchIsMutable();
            fetch_.addAll(other.fetch_);
          }
          onChanged();
        }
      } else {
        if (!other.fetch_.isEmpty()) {
          if (fetchBuilder_.isEmpty()) {
            fetchBuilder_.dispose();
            fetchBuilder_ = null;
            fetch_ = other.fetch_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fetchBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFetchFieldBuilder() : null;
          } else {
            fetchBuilder_.addAllMessages(other.fetch_);
          }
        }
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      org.tensorflow.distruntime.RunCallableResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.RunCallableResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.TensorProto> fetch_ =
      java.util.Collections.emptyList();
    private void ensureFetchIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        fetch_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>(fetch_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> fetchBuilder_;

    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto> getFetchList() {
      if (fetchBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fetch_);
      } else {
        return fetchBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public int getFetchCount() {
      if (fetchBuilder_ == null) {
        return fetch_.size();
      } else {
        return fetchBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public org.tensorflow.framework.TensorProto getFetch(int index) {
      if (fetchBuilder_ == null) {
        return fetch_.get(index);
      } else {
        return fetchBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder setFetch(
        int index, org.tensorflow.framework.TensorProto value) {
      if (fetchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFetchIsMutable();
        fetch_.set(index, value);
        onChanged();
      } else {
        fetchBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder setFetch(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (fetchBuilder_ == null) {
        ensureFetchIsMutable();
        fetch_.set(index, builderForValue.build());
        onChanged();
      } else {
        fetchBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder addFetch(org.tensorflow.framework.TensorProto value) {
      if (fetchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFetchIsMutable();
        fetch_.add(value);
        onChanged();
      } else {
        fetchBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder addFetch(
        int index, org.tensorflow.framework.TensorProto value) {
      if (fetchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFetchIsMutable();
        fetch_.add(index, value);
        onChanged();
      } else {
        fetchBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder addFetch(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (fetchBuilder_ == null) {
        ensureFetchIsMutable();
        fetch_.add(builderForValue.build());
        onChanged();
      } else {
        fetchBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder addFetch(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (fetchBuilder_ == null) {
        ensureFetchIsMutable();
        fetch_.add(index, builderForValue.build());
        onChanged();
      } else {
        fetchBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder addAllFetch(
        java.lang.Iterable<? extends org.tensorflow.framework.TensorProto> values) {
      if (fetchBuilder_ == null) {
        ensureFetchIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fetch_);
        onChanged();
      } else {
        fetchBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder clearFetch() {
      if (fetchBuilder_ == null) {
        fetch_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fetchBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public Builder removeFetch(int index) {
      if (fetchBuilder_ == null) {
        ensureFetchIsMutable();
        fetch_.remove(index);
        onChanged();
      } else {
        fetchBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getFetchBuilder(
        int index) {
      return getFetchFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getFetchOrBuilder(
        int index) {
      if (fetchBuilder_ == null) {
        return fetch_.get(index);  } else {
        return fetchBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
         getFetchOrBuilderList() {
      if (fetchBuilder_ != null) {
        return fetchBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fetch_);
      }
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addFetchBuilder() {
      return getFetchFieldBuilder().addBuilder(
          org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addFetchBuilder(
        int index) {
      return getFetchFieldBuilder().addBuilder(
          index, org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Values of the tensors returned by the callable, in the order defined in the
     * CallableOptions.fetch field passed to MakeCallable.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto fetch = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto.Builder> 
         getFetchBuilderList() {
      return getFetchFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getFetchFieldBuilder() {
      if (fetchBuilder_ == null) {
        fetchBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                fetch_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        fetch_ = null;
      }
      return fetchBuilder_;
    }

    private org.tensorflow.framework.RunMetadata metadata_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.RunMetadata, org.tensorflow.framework.RunMetadata.Builder, org.tensorflow.framework.RunMetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public org.tensorflow.framework.RunMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? org.tensorflow.framework.RunMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public Builder setMetadata(org.tensorflow.framework.RunMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public Builder setMetadata(
        org.tensorflow.framework.RunMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public Builder mergeMetadata(org.tensorflow.framework.RunMetadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            org.tensorflow.framework.RunMetadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public org.tensorflow.framework.RunMetadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    public org.tensorflow.framework.RunMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            org.tensorflow.framework.RunMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Returned metadata if requested in the options.
     * </pre>
     *
     * <code>.tensorflow.RunMetadata metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.RunMetadata, org.tensorflow.framework.RunMetadata.Builder, org.tensorflow.framework.RunMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.RunMetadata, org.tensorflow.framework.RunMetadata.Builder, org.tensorflow.framework.RunMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.RunCallableResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.RunCallableResponse)
  private static final org.tensorflow.distruntime.RunCallableResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.RunCallableResponse();
  }

  public static org.tensorflow.distruntime.RunCallableResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunCallableResponse>
      PARSER = new com.google.protobuf.AbstractParser<RunCallableResponse>() {
    @java.lang.Override
    public RunCallableResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RunCallableResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RunCallableResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunCallableResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.RunCallableResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

