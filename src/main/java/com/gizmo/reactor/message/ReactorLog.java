/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.gizmo.reactor.message;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ReactorLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4237403623647015003L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReactorLog\",\"namespace\":\"com.gizmo.reactor.message\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"user\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"version\":\"1.0\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<ReactorLog> ENCODER =
      new BinaryMessageEncoder<ReactorLog>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReactorLog> DECODER =
      new BinaryMessageDecoder<ReactorLog>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ReactorLog> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ReactorLog> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ReactorLog> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReactorLog>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ReactorLog to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ReactorLog from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ReactorLog instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ReactorLog fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private java.lang.String user;
  private java.lang.String message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReactorLog() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param user The new value for user
   * @param message The new value for message
   */
  public ReactorLog(java.util.UUID id, java.lang.String user, java.lang.String message) {
    this.id = id;
    this.user = user;
    this.message = message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return user;
    case 2: return message;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: user = value$ != null ? value$.toString() : null; break;
    case 2: message = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'user' field.
   * @return The value of the 'user' field.
   */
  public java.lang.String getUser() {
    return user;
  }


  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.String value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.String getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.String value) {
    this.message = value;
  }

  /**
   * Creates a new ReactorLog RecordBuilder.
   * @return A new ReactorLog RecordBuilder
   */
  public static com.gizmo.reactor.message.ReactorLog.Builder newBuilder() {
    return new com.gizmo.reactor.message.ReactorLog.Builder();
  }

  /**
   * Creates a new ReactorLog RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReactorLog RecordBuilder
   */
  public static com.gizmo.reactor.message.ReactorLog.Builder newBuilder(com.gizmo.reactor.message.ReactorLog.Builder other) {
    if (other == null) {
      return new com.gizmo.reactor.message.ReactorLog.Builder();
    } else {
      return new com.gizmo.reactor.message.ReactorLog.Builder(other);
    }
  }

  /**
   * Creates a new ReactorLog RecordBuilder by copying an existing ReactorLog instance.
   * @param other The existing instance to copy.
   * @return A new ReactorLog RecordBuilder
   */
  public static com.gizmo.reactor.message.ReactorLog.Builder newBuilder(com.gizmo.reactor.message.ReactorLog other) {
    if (other == null) {
      return new com.gizmo.reactor.message.ReactorLog.Builder();
    } else {
      return new com.gizmo.reactor.message.ReactorLog.Builder(other);
    }
  }

  /**
   * RecordBuilder for ReactorLog instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReactorLog>
    implements org.apache.avro.data.RecordBuilder<ReactorLog> {

    private java.util.UUID id;
    private java.lang.String user;
    private java.lang.String message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.gizmo.reactor.message.ReactorLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.user)) {
        this.user = data().deepCopy(fields()[1].schema(), other.user);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ReactorLog instance
     * @param other The existing instance to copy.
     */
    private Builder(com.gizmo.reactor.message.ReactorLog other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.user)) {
        this.user = data().deepCopy(fields()[1].schema(), other.user);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'user' field.
      * @return The value.
      */
    public java.lang.String getUser() {
      return user;
    }


    /**
      * Sets the value of the 'user' field.
      * @param value The value of 'user'.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder setUser(java.lang.String value) {
      validate(fields()[1], value);
      this.user = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'user' field has been set.
      * @return True if the 'user' field has been set, false otherwise.
      */
    public boolean hasUser() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'user' field.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder clearUser() {
      user = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.String getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder setMessage(java.lang.String value) {
      validate(fields()[2], value);
      this.message = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public com.gizmo.reactor.message.ReactorLog.Builder clearMessage() {
      message = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReactorLog build() {
      try {
        ReactorLog record = new ReactorLog();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.user = fieldSetFlags()[1] ? this.user : (java.lang.String) defaultValue(fields()[1]);
        record.message = fieldSetFlags()[2] ? this.message : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReactorLog>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReactorLog>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReactorLog>
    READER$ = (org.apache.avro.io.DatumReader<ReactorLog>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










