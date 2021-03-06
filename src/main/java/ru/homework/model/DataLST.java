/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.homework.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataLST extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5626631552072328795L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataLST\",\"namespace\":\"ru.homework.model\",\"fields\":[{\"name\":\"val1\",\"type\":\"int\"},{\"name\":\"val2\",\"type\":\"int\"},{\"name\":\"val3\",\"type\":\"int\"},{\"name\":\"val4\",\"type\":\"int\"},{\"name\":\"val5\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataLST> ENCODER =
      new BinaryMessageEncoder<DataLST>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataLST> DECODER =
      new BinaryMessageDecoder<DataLST>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<DataLST> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<DataLST> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataLST>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this DataLST to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a DataLST from a ByteBuffer. */
  public static DataLST fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int val1;
  @Deprecated public int val2;
  @Deprecated public int val3;
  @Deprecated public int val4;
  @Deprecated public int val5;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataLST() {}

  /**
   * All-args constructor.
   * @param val1 The new value for val1
   * @param val2 The new value for val2
   * @param val3 The new value for val3
   * @param val4 The new value for val4
   * @param val5 The new value for val5
   */
  public DataLST(java.lang.Integer val1, java.lang.Integer val2, java.lang.Integer val3, java.lang.Integer val4, java.lang.Integer val5) {
    this.val1 = val1;
    this.val2 = val2;
    this.val3 = val3;
    this.val4 = val4;
    this.val5 = val5;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return val1;
    case 1: return val2;
    case 2: return val3;
    case 3: return val4;
    case 4: return val5;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: val1 = (java.lang.Integer)value$; break;
    case 1: val2 = (java.lang.Integer)value$; break;
    case 2: val3 = (java.lang.Integer)value$; break;
    case 3: val4 = (java.lang.Integer)value$; break;
    case 4: val5 = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'val1' field.
   * @return The value of the 'val1' field.
   */
  public java.lang.Integer getVal1() {
    return val1;
  }

  /**
   * Sets the value of the 'val1' field.
   * @param value the value to set.
   */
  public void setVal1(java.lang.Integer value) {
    this.val1 = value;
  }

  /**
   * Gets the value of the 'val2' field.
   * @return The value of the 'val2' field.
   */
  public java.lang.Integer getVal2() {
    return val2;
  }

  /**
   * Sets the value of the 'val2' field.
   * @param value the value to set.
   */
  public void setVal2(java.lang.Integer value) {
    this.val2 = value;
  }

  /**
   * Gets the value of the 'val3' field.
   * @return The value of the 'val3' field.
   */
  public java.lang.Integer getVal3() {
    return val3;
  }

  /**
   * Sets the value of the 'val3' field.
   * @param value the value to set.
   */
  public void setVal3(java.lang.Integer value) {
    this.val3 = value;
  }

  /**
   * Gets the value of the 'val4' field.
   * @return The value of the 'val4' field.
   */
  public java.lang.Integer getVal4() {
    return val4;
  }

  /**
   * Sets the value of the 'val4' field.
   * @param value the value to set.
   */
  public void setVal4(java.lang.Integer value) {
    this.val4 = value;
  }

  /**
   * Gets the value of the 'val5' field.
   * @return The value of the 'val5' field.
   */
  public java.lang.Integer getVal5() {
    return val5;
  }

  /**
   * Sets the value of the 'val5' field.
   * @param value the value to set.
   */
  public void setVal5(java.lang.Integer value) {
    this.val5 = value;
  }

  /**
   * Creates a new DataLST RecordBuilder.
   * @return A new DataLST RecordBuilder
   */
  public static ru.homework.model.DataLST.Builder newBuilder() {
    return new ru.homework.model.DataLST.Builder();
  }

  /**
   * Creates a new DataLST RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataLST RecordBuilder
   */
  public static ru.homework.model.DataLST.Builder newBuilder(ru.homework.model.DataLST.Builder other) {
    return new ru.homework.model.DataLST.Builder(other);
  }

  /**
   * Creates a new DataLST RecordBuilder by copying an existing DataLST instance.
   * @param other The existing instance to copy.
   * @return A new DataLST RecordBuilder
   */
  public static ru.homework.model.DataLST.Builder newBuilder(ru.homework.model.DataLST other) {
    return new ru.homework.model.DataLST.Builder(other);
  }

  /**
   * RecordBuilder for DataLST instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataLST>
    implements org.apache.avro.data.RecordBuilder<DataLST> {

    private int val1;
    private int val2;
    private int val3;
    private int val4;
    private int val5;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.homework.model.DataLST.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.val1)) {
        this.val1 = data().deepCopy(fields()[0].schema(), other.val1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.val2)) {
        this.val2 = data().deepCopy(fields()[1].schema(), other.val2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.val3)) {
        this.val3 = data().deepCopy(fields()[2].schema(), other.val3);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.val4)) {
        this.val4 = data().deepCopy(fields()[3].schema(), other.val4);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.val5)) {
        this.val5 = data().deepCopy(fields()[4].schema(), other.val5);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataLST instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.homework.model.DataLST other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.val1)) {
        this.val1 = data().deepCopy(fields()[0].schema(), other.val1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.val2)) {
        this.val2 = data().deepCopy(fields()[1].schema(), other.val2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.val3)) {
        this.val3 = data().deepCopy(fields()[2].schema(), other.val3);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.val4)) {
        this.val4 = data().deepCopy(fields()[3].schema(), other.val4);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.val5)) {
        this.val5 = data().deepCopy(fields()[4].schema(), other.val5);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'val1' field.
      * @return The value.
      */
    public java.lang.Integer getVal1() {
      return val1;
    }

    /**
      * Sets the value of the 'val1' field.
      * @param value The value of 'val1'.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder setVal1(int value) {
      validate(fields()[0], value);
      this.val1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'val1' field has been set.
      * @return True if the 'val1' field has been set, false otherwise.
      */
    public boolean hasVal1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'val1' field.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder clearVal1() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'val2' field.
      * @return The value.
      */
    public java.lang.Integer getVal2() {
      return val2;
    }

    /**
      * Sets the value of the 'val2' field.
      * @param value The value of 'val2'.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder setVal2(int value) {
      validate(fields()[1], value);
      this.val2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'val2' field has been set.
      * @return True if the 'val2' field has been set, false otherwise.
      */
    public boolean hasVal2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'val2' field.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder clearVal2() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'val3' field.
      * @return The value.
      */
    public java.lang.Integer getVal3() {
      return val3;
    }

    /**
      * Sets the value of the 'val3' field.
      * @param value The value of 'val3'.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder setVal3(int value) {
      validate(fields()[2], value);
      this.val3 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'val3' field has been set.
      * @return True if the 'val3' field has been set, false otherwise.
      */
    public boolean hasVal3() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'val3' field.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder clearVal3() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'val4' field.
      * @return The value.
      */
    public java.lang.Integer getVal4() {
      return val4;
    }

    /**
      * Sets the value of the 'val4' field.
      * @param value The value of 'val4'.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder setVal4(int value) {
      validate(fields()[3], value);
      this.val4 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'val4' field has been set.
      * @return True if the 'val4' field has been set, false otherwise.
      */
    public boolean hasVal4() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'val4' field.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder clearVal4() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'val5' field.
      * @return The value.
      */
    public java.lang.Integer getVal5() {
      return val5;
    }

    /**
      * Sets the value of the 'val5' field.
      * @param value The value of 'val5'.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder setVal5(int value) {
      validate(fields()[4], value);
      this.val5 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'val5' field has been set.
      * @return True if the 'val5' field has been set, false otherwise.
      */
    public boolean hasVal5() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'val5' field.
      * @return This builder.
      */
    public ru.homework.model.DataLST.Builder clearVal5() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataLST build() {
      try {
        DataLST record = new DataLST();
        record.val1 = fieldSetFlags()[0] ? this.val1 : (java.lang.Integer) defaultValue(fields()[0]);
        record.val2 = fieldSetFlags()[1] ? this.val2 : (java.lang.Integer) defaultValue(fields()[1]);
        record.val3 = fieldSetFlags()[2] ? this.val3 : (java.lang.Integer) defaultValue(fields()[2]);
        record.val4 = fieldSetFlags()[3] ? this.val4 : (java.lang.Integer) defaultValue(fields()[3]);
        record.val5 = fieldSetFlags()[4] ? this.val5 : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataLST>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataLST>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataLST>
    READER$ = (org.apache.avro.io.DatumReader<DataLST>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
