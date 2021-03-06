package com.vehicleManager.models;///**
// * Autogenerated by Avro
// *
// * DO NOT EDIT DIRECTLY
// */
//package com.vehicleManager.models;
//
//import org.apache.avro.specific.SpecificData;
//
//@SuppressWarnings("all")
//@org.apache.avro.specific.AvroGenerated
//public class ErrorResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
//  private static final long serialVersionUID = -9042074766388281104L;
//  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ErrorResponse\",\"namespace\":\"com.vehicleManager.models\",\"fields\":[{\"name\":\"errorCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"message\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"timeStamp\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
//  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
//  @Deprecated public java.lang.String errorCode;
//  @Deprecated public java.lang.String message;
//  @Deprecated public java.lang.String timeStamp;
//
//  /**
//   * Default constructor.  Note that this does not initialize fields
//   * to their default values from the schema.  If that is desired then
//   * one should use <code>newBuilder()</code>.
//   */
//  public ErrorResponse() {}
//
//  /**
//   * All-args constructor.
//   * @param errorCode The new value for errorCode
//   * @param message The new value for message
//   * @param timeStamp The new value for timeStamp
//   */
//  public ErrorResponse(java.lang.String errorCode, java.lang.String message, java.lang.String timeStamp) {
//    this.errorCode = errorCode;
//    this.message = message;
//    this.timeStamp = timeStamp;
//  }
//
//  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
//  // Used by DatumWriter.  Applications should not call.
//  public java.lang.Object get(int field$) {
//    switch (field$) {
//    case 0: return errorCode;
//    case 1: return message;
//    case 2: return timeStamp;
//    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//    }
//  }
//
//  // Used by DatumReader.  Applications should not call.
//  @SuppressWarnings(value="unchecked")
//  public void put(int field$, java.lang.Object value$) {
//    switch (field$) {
//    case 0: errorCode = (java.lang.String)value$; break;
//    case 1: message = (java.lang.String)value$; break;
//    case 2: timeStamp = (java.lang.String)value$; break;
//    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//    }
//  }
//
//  /**
//   * Gets the value of the 'errorCode' field.
//   * @return The value of the 'errorCode' field.
//   */
//  public java.lang.String getErrorCode() {
//    return errorCode;
//  }
//
//  /**
//   * Sets the value of the 'errorCode' field.
//   * @param value the value to set.
//   */
//  public void setErrorCode(java.lang.String value) {
//    this.errorCode = value;
//  }
//
//  /**
//   * Gets the value of the 'message' field.
//   * @return The value of the 'message' field.
//   */
//  public java.lang.String getMessage() {
//    return message;
//  }
//
//  /**
//   * Sets the value of the 'message' field.
//   * @param value the value to set.
//   */
//  public void setMessage(java.lang.String value) {
//    this.message = value;
//  }
//
//  /**
//   * Gets the value of the 'timeStamp' field.
//   * @return The value of the 'timeStamp' field.
//   */
//  public java.lang.String getTimeStamp() {
//    return timeStamp;
//  }
//
//  /**
//   * Sets the value of the 'timeStamp' field.
//   * @param value the value to set.
//   */
//  public void setTimeStamp(java.lang.String value) {
//    this.timeStamp = value;
//  }
//
//  /**
//   * Creates a new ErrorResponse RecordBuilder.
//   * @return A new ErrorResponse RecordBuilder
//   */
//  public static com.vehicleManager.models.ErrorResponse.Builder newBuilder() {
//    return new com.vehicleManager.models.ErrorResponse.Builder();
//  }
//
//  /**
//   * Creates a new ErrorResponse RecordBuilder by copying an existing Builder.
//   * @param other The existing builder to copy.
//   * @return A new ErrorResponse RecordBuilder
//   */
//  public static com.vehicleManager.models.ErrorResponse.Builder newBuilder(com.vehicleManager.models.ErrorResponse.Builder other) {
//    return new com.vehicleManager.models.ErrorResponse.Builder(other);
//  }
//
//  /**
//   * Creates a new ErrorResponse RecordBuilder by copying an existing ErrorResponse instance.
//   * @param other The existing instance to copy.
//   * @return A new ErrorResponse RecordBuilder
//   */
//  public static com.vehicleManager.models.ErrorResponse.Builder newBuilder(com.vehicleManager.models.ErrorResponse other) {
//    return new com.vehicleManager.models.ErrorResponse.Builder(other);
//  }
//
//  /**
//   * RecordBuilder for ErrorResponse instances.
//   */
//  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ErrorResponse>
//    implements org.apache.avro.data.RecordBuilder<ErrorResponse> {
//
//    private java.lang.String errorCode;
//    private java.lang.String message;
//    private java.lang.String timeStamp;
//
//    /** Creates a new Builder */
//    private Builder() {
//      super(SCHEMA$);
//    }
//
//    /**
//     * Creates a Builder by copying an existing Builder.
//     * @param other The existing Builder to copy.
//     */
//    private Builder(com.vehicleManager.models.ErrorResponse.Builder other) {
//      super(other);
//      if (isValidValue(fields()[0], other.errorCode)) {
//        this.errorCode = data().deepCopy(fields()[0].schema(), other.errorCode);
//        fieldSetFlags()[0] = true;
//      }
//      if (isValidValue(fields()[1], other.message)) {
//        this.message = data().deepCopy(fields()[1].schema(), other.message);
//        fieldSetFlags()[1] = true;
//      }
//      if (isValidValue(fields()[2], other.timeStamp)) {
//        this.timeStamp = data().deepCopy(fields()[2].schema(), other.timeStamp);
//        fieldSetFlags()[2] = true;
//      }
//    }
//
//    /**
//     * Creates a Builder by copying an existing ErrorResponse instance
//     * @param other The existing instance to copy.
//     */
//    private Builder(com.vehicleManager.models.ErrorResponse other) {
//            super(SCHEMA$);
//      if (isValidValue(fields()[0], other.errorCode)) {
//        this.errorCode = data().deepCopy(fields()[0].schema(), other.errorCode);
//        fieldSetFlags()[0] = true;
//      }
//      if (isValidValue(fields()[1], other.message)) {
//        this.message = data().deepCopy(fields()[1].schema(), other.message);
//        fieldSetFlags()[1] = true;
//      }
//      if (isValidValue(fields()[2], other.timeStamp)) {
//        this.timeStamp = data().deepCopy(fields()[2].schema(), other.timeStamp);
//        fieldSetFlags()[2] = true;
//      }
//    }
//
//    /**
//      * Gets the value of the 'errorCode' field.
//      * @return The value.
//      */
//    public java.lang.String getErrorCode() {
//      return errorCode;
//    }
//
//    /**
//      * Sets the value of the 'errorCode' field.
//      * @param value The value of 'errorCode'.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder setErrorCode(java.lang.String value) {
//      validate(fields()[0], value);
//      this.errorCode = value;
//      fieldSetFlags()[0] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'errorCode' field has been set.
//      * @return True if the 'errorCode' field has been set, false otherwise.
//      */
//    public boolean hasErrorCode() {
//      return fieldSetFlags()[0];
//    }
//
//
//    /**
//      * Clears the value of the 'errorCode' field.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder clearErrorCode() {
//      errorCode = null;
//      fieldSetFlags()[0] = false;
//      return this;
//    }
//
//    /**
//      * Gets the value of the 'message' field.
//      * @return The value.
//      */
//    public java.lang.String getMessage() {
//      return message;
//    }
//
//    /**
//      * Sets the value of the 'message' field.
//      * @param value The value of 'message'.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder setMessage(java.lang.String value) {
//      validate(fields()[1], value);
//      this.message = value;
//      fieldSetFlags()[1] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'message' field has been set.
//      * @return True if the 'message' field has been set, false otherwise.
//      */
//    public boolean hasMessage() {
//      return fieldSetFlags()[1];
//    }
//
//
//    /**
//      * Clears the value of the 'message' field.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder clearMessage() {
//      message = null;
//      fieldSetFlags()[1] = false;
//      return this;
//    }
//
//    /**
//      * Gets the value of the 'timeStamp' field.
//      * @return The value.
//      */
//    public java.lang.String getTimeStamp() {
//      return timeStamp;
//    }
//
//    /**
//      * Sets the value of the 'timeStamp' field.
//      * @param value The value of 'timeStamp'.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder setTimeStamp(java.lang.String value) {
//      validate(fields()[2], value);
//      this.timeStamp = value;
//      fieldSetFlags()[2] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'timeStamp' field has been set.
//      * @return True if the 'timeStamp' field has been set, false otherwise.
//      */
//    public boolean hasTimeStamp() {
//      return fieldSetFlags()[2];
//    }
//
//
//    /**
//      * Clears the value of the 'timeStamp' field.
//      * @return This builder.
//      */
//    public com.vehicleManager.models.ErrorResponse.Builder clearTimeStamp() {
//      timeStamp = null;
//      fieldSetFlags()[2] = false;
//      return this;
//    }
//
//    @Override
//    public ErrorResponse build() {
//      try {
//        ErrorResponse record = new ErrorResponse();
//        record.errorCode = fieldSetFlags()[0] ? this.errorCode : (java.lang.String) defaultValue(fields()[0]);
//        record.message = fieldSetFlags()[1] ? this.message : (java.lang.String) defaultValue(fields()[1]);
//        record.timeStamp = fieldSetFlags()[2] ? this.timeStamp : (java.lang.String) defaultValue(fields()[2]);
//        return record;
//      } catch (Exception e) {
//        throw new org.apache.avro.AvroRuntimeException(e);
//      }
//    }
//  }
//
//  private static final org.apache.avro.io.DatumWriter
//    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);
//
//  @Override public void writeExternal(java.io.ObjectOutput out)
//    throws java.io.IOException {
//    WRITER$.write(this, SpecificData.getEncoder(out));
//  }
//
//  private static final org.apache.avro.io.DatumReader
//    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);
//
//  @Override public void readExternal(java.io.ObjectInput in)
//    throws java.io.IOException {
//    READER$.read(this, SpecificData.getDecoder(in));
//  }
//
//}


public class ErrorResponse{

  private String errorCode;
  private String message;
  private String timeStamp;

  public ErrorResponse() {
  }

  public ErrorResponse(String errorCode, String message, String timeStamp) {
    this.errorCode = errorCode;
    this.message = message;
    this.timeStamp = timeStamp;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  @Override
  public String toString() {
    return "ErrorResponse{" +
            "errorCode='" + errorCode + '\'' +
            ", message='" + message + '\'' +
            ", timeStamp='" + timeStamp + '\'' +
            '}';
  }

}