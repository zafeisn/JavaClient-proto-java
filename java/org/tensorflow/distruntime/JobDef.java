// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/cluster.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Defines a single job in a TensorFlow cluster.
 * </pre>
 *
 * Protobuf type {@code tensorflow.JobDef}
 */
public  final class JobDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.JobDef)
    JobDefOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobDef.newBuilder() to construct.
  private JobDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobDef() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobDef(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              tasks_ = com.google.protobuf.MapField.newMapField(
                  TasksDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
            tasks__ = input.readMessage(
                TasksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            tasks_.getMutableMap().put(
                tasks__.getKey(), tasks__.getValue());
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetTasks();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.JobDef.class, org.tensorflow.distruntime.JobDef.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of this job.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of this job.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TASKS_FIELD_NUMBER = 2;
  private static final class TasksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.String>newDefaultInstance(
                org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_TasksEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.String> tasks_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
  internalGetTasks() {
    if (tasks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          TasksDefaultEntryHolder.defaultEntry);
    }
    return tasks_;
  }

  public int getTasksCount() {
    return internalGetTasks().getMap().size();
  }
  /**
   * <pre>
   * Mapping from task ID to "hostname:port" string.
   * If the `name` field contains "worker", and the `tasks` map contains a
   * mapping from 7 to "example.org:2222", then the device prefix
   * "/job:worker/task:7" will be assigned to "example.org:2222".
   * </pre>
   *
   * <code>map&lt;int32, string&gt; tasks = 2;</code>
   */

  public boolean containsTasks(
      int key) {
    
    return internalGetTasks().getMap().containsKey(key);
  }
  /**
   * Use {@link #getTasksMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.String> getTasks() {
    return getTasksMap();
  }
  /**
   * <pre>
   * Mapping from task ID to "hostname:port" string.
   * If the `name` field contains "worker", and the `tasks` map contains a
   * mapping from 7 to "example.org:2222", then the device prefix
   * "/job:worker/task:7" will be assigned to "example.org:2222".
   * </pre>
   *
   * <code>map&lt;int32, string&gt; tasks = 2;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.String> getTasksMap() {
    return internalGetTasks().getMap();
  }
  /**
   * <pre>
   * Mapping from task ID to "hostname:port" string.
   * If the `name` field contains "worker", and the `tasks` map contains a
   * mapping from 7 to "example.org:2222", then the device prefix
   * "/job:worker/task:7" will be assigned to "example.org:2222".
   * </pre>
   *
   * <code>map&lt;int32, string&gt; tasks = 2;</code>
   */

  public java.lang.String getTasksOrDefault(
      int key,
      java.lang.String defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.String> map =
        internalGetTasks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Mapping from task ID to "hostname:port" string.
   * If the `name` field contains "worker", and the `tasks` map contains a
   * mapping from 7 to "example.org:2222", then the device prefix
   * "/job:worker/task:7" will be assigned to "example.org:2222".
   * </pre>
   *
   * <code>map&lt;int32, string&gt; tasks = 2;</code>
   */

  public java.lang.String getTasksOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.String> map =
        internalGetTasks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetTasks(),
        TasksDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
         : internalGetTasks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
      tasks__ = TasksDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, tasks__);
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
    if (!(obj instanceof org.tensorflow.distruntime.JobDef)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.JobDef other = (org.tensorflow.distruntime.JobDef) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && internalGetTasks().equals(
        other.internalGetTasks());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetTasks().getMap().isEmpty()) {
      hash = (37 * hash) + TASKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetTasks().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.JobDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.JobDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.JobDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.JobDef parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.JobDef prototype) {
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
   * <pre>
   * Defines a single job in a TensorFlow cluster.
   * </pre>
   *
   * Protobuf type {@code tensorflow.JobDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.JobDef)
      org.tensorflow.distruntime.JobDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetTasks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableTasks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.JobDef.class, org.tensorflow.distruntime.JobDef.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.JobDef.newBuilder()
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
      name_ = "";

      internalGetMutableTasks().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.ClusterProtos.internal_static_tensorflow_JobDef_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.JobDef getDefaultInstanceForType() {
      return org.tensorflow.distruntime.JobDef.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.JobDef build() {
      org.tensorflow.distruntime.JobDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.JobDef buildPartial() {
      org.tensorflow.distruntime.JobDef result = new org.tensorflow.distruntime.JobDef(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.tasks_ = internalGetTasks();
      result.tasks_.makeImmutable();
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
      if (other instanceof org.tensorflow.distruntime.JobDef) {
        return mergeFrom((org.tensorflow.distruntime.JobDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.JobDef other) {
      if (other == org.tensorflow.distruntime.JobDef.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableTasks().mergeFrom(
          other.internalGetTasks());
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
      org.tensorflow.distruntime.JobDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.JobDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of this job.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of this job.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of this job.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this job.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of this job.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.String> tasks_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
    internalGetTasks() {
      if (tasks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TasksDefaultEntryHolder.defaultEntry);
      }
      return tasks_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
    internalGetMutableTasks() {
      onChanged();;
      if (tasks_ == null) {
        tasks_ = com.google.protobuf.MapField.newMapField(
            TasksDefaultEntryHolder.defaultEntry);
      }
      if (!tasks_.isMutable()) {
        tasks_ = tasks_.copy();
      }
      return tasks_;
    }

    public int getTasksCount() {
      return internalGetTasks().getMap().size();
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public boolean containsTasks(
        int key) {
      
      return internalGetTasks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTasksMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String> getTasks() {
      return getTasksMap();
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.String> getTasksMap() {
      return internalGetTasks().getMap();
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public java.lang.String getTasksOrDefault(
        int key,
        java.lang.String defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetTasks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public java.lang.String getTasksOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetTasks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearTasks() {
      internalGetMutableTasks().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public Builder removeTasks(
        int key) {
      
      internalGetMutableTasks().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String>
    getMutableTasks() {
      return internalGetMutableTasks().getMutableMap();
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */
    public Builder putTasks(
        int key,
        java.lang.String value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableTasks().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Mapping from task ID to "hostname:port" string.
     * If the `name` field contains "worker", and the `tasks` map contains a
     * mapping from 7 to "example.org:2222", then the device prefix
     * "/job:worker/task:7" will be assigned to "example.org:2222".
     * </pre>
     *
     * <code>map&lt;int32, string&gt; tasks = 2;</code>
     */

    public Builder putAllTasks(
        java.util.Map<java.lang.Integer, java.lang.String> values) {
      internalGetMutableTasks().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.JobDef)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.JobDef)
  private static final org.tensorflow.distruntime.JobDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.JobDef();
  }

  public static org.tensorflow.distruntime.JobDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobDef>
      PARSER = new com.google.protobuf.AbstractParser<JobDef>() {
    @java.lang.Override
    public JobDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobDef> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.JobDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

