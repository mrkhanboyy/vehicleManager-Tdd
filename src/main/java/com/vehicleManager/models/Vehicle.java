/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.vehicleManager.models;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Vehicle extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5601437151679916292L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Vehicle\",\"namespace\":\"com.vehicleManager.models\",\"fields\":[{\"name\":\"uuid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"registrationNumber\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"driverName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"bodyType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"chassisType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"carryingCapacity\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String uuid;
  @Deprecated public java.lang.Object registrationNumber;
  @Deprecated public java.lang.String driverName;
  @Deprecated public java.lang.String bodyType;
  @Deprecated public java.lang.Object chassisType;
  @Deprecated public java.lang.String carryingCapacity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Vehicle() {}

  /**
   * All-args constructor.
   * @param uuid The new value for uuid
   * @param registrationNumber The new value for registrationNumber
   * @param driverName The new value for driverName
   * @param bodyType The new value for bodyType
   * @param chassisType The new value for chassisType
   * @param carryingCapacity The new value for carryingCapacity
   */
  public Vehicle(java.lang.String uuid, java.lang.Object registrationNumber, java.lang.String driverName, java.lang.String bodyType, java.lang.Object chassisType, java.lang.String carryingCapacity) {
    this.uuid = uuid;
    this.registrationNumber = registrationNumber;
    this.driverName = driverName;
    this.bodyType = bodyType;
    this.chassisType = chassisType;
    this.carryingCapacity = carryingCapacity;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return registrationNumber;
    case 2: return driverName;
    case 3: return bodyType;
    case 4: return chassisType;
    case 5: return carryingCapacity;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.String)value$; break;
    case 1: registrationNumber = (java.lang.Object)value$; break;
    case 2: driverName = (java.lang.String)value$; break;
    case 3: bodyType = (java.lang.String)value$; break;
    case 4: chassisType = (java.lang.Object)value$; break;
    case 5: carryingCapacity = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uuid' field.
   * @return The value of the 'uuid' field.
   */
  public java.lang.String getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.String value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'registrationNumber' field.
   * @return The value of the 'registrationNumber' field.
   */
  public java.lang.Object getRegistrationNumber() {
    return registrationNumber;
  }

  /**
   * Sets the value of the 'registrationNumber' field.
   * @param value the value to set.
   */
  public void setRegistrationNumber(java.lang.Object value) {
    this.registrationNumber = value;
  }

  /**
   * Gets the value of the 'driverName' field.
   * @return The value of the 'driverName' field.
   */
  public java.lang.String getDriverName() {
    return driverName;
  }

  /**
   * Sets the value of the 'driverName' field.
   * @param value the value to set.
   */
  public void setDriverName(java.lang.String value) {
    this.driverName = value;
  }

  /**
   * Gets the value of the 'bodyType' field.
   * @return The value of the 'bodyType' field.
   */
  public java.lang.String getBodyType() {
    return bodyType;
  }

  /**
   * Sets the value of the 'bodyType' field.
   * @param value the value to set.
   */
  public void setBodyType(java.lang.String value) {
    this.bodyType = value;
  }

  /**
   * Gets the value of the 'chassisType' field.
   * @return The value of the 'chassisType' field.
   */
  public java.lang.Object getChassisType() {
    return chassisType;
  }

  /**
   * Sets the value of the 'chassisType' field.
   * @param value the value to set.
   */
  public void setChassisType(java.lang.Object value) {
    this.chassisType = value;
  }

  /**
   * Gets the value of the 'carryingCapacity' field.
   * @return The value of the 'carryingCapacity' field.
   */
  public java.lang.String getCarryingCapacity() {
    return carryingCapacity;
  }

  /**
   * Sets the value of the 'carryingCapacity' field.
   * @param value the value to set.
   */
  public void setCarryingCapacity(java.lang.String value) {
    this.carryingCapacity = value;
  }

  /**
   * Creates a new Vehicle RecordBuilder.
   * @return A new Vehicle RecordBuilder
   */
  public static com.vehicleManager.models.Vehicle.Builder newBuilder() {
    return new com.vehicleManager.models.Vehicle.Builder();
  }

  /**
   * Creates a new Vehicle RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Vehicle RecordBuilder
   */
  public static com.vehicleManager.models.Vehicle.Builder newBuilder(com.vehicleManager.models.Vehicle.Builder other) {
    return new com.vehicleManager.models.Vehicle.Builder(other);
  }

  /**
   * Creates a new Vehicle RecordBuilder by copying an existing Vehicle instance.
   * @param other The existing instance to copy.
   * @return A new Vehicle RecordBuilder
   */
  public static com.vehicleManager.models.Vehicle.Builder newBuilder(com.vehicleManager.models.Vehicle other) {
    return new com.vehicleManager.models.Vehicle.Builder(other);
  }

  /**
   * RecordBuilder for Vehicle instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Vehicle>
    implements org.apache.avro.data.RecordBuilder<Vehicle> {

    private java.lang.String uuid;
    private java.lang.Object registrationNumber;
    private java.lang.String driverName;
    private java.lang.String bodyType;
    private java.lang.Object chassisType;
    private java.lang.String carryingCapacity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.vehicleManager.models.Vehicle.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.registrationNumber)) {
        this.registrationNumber = data().deepCopy(fields()[1].schema(), other.registrationNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.driverName)) {
        this.driverName = data().deepCopy(fields()[2].schema(), other.driverName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bodyType)) {
        this.bodyType = data().deepCopy(fields()[3].schema(), other.bodyType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.chassisType)) {
        this.chassisType = data().deepCopy(fields()[4].schema(), other.chassisType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.carryingCapacity)) {
        this.carryingCapacity = data().deepCopy(fields()[5].schema(), other.carryingCapacity);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Vehicle instance
     * @param other The existing instance to copy.
     */
    private Builder(com.vehicleManager.models.Vehicle other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.registrationNumber)) {
        this.registrationNumber = data().deepCopy(fields()[1].schema(), other.registrationNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.driverName)) {
        this.driverName = data().deepCopy(fields()[2].schema(), other.driverName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.bodyType)) {
        this.bodyType = data().deepCopy(fields()[3].schema(), other.bodyType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.chassisType)) {
        this.chassisType = data().deepCopy(fields()[4].schema(), other.chassisType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.carryingCapacity)) {
        this.carryingCapacity = data().deepCopy(fields()[5].schema(), other.carryingCapacity);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'uuid' field.
      * @return The value.
      */
    public java.lang.String getUuid() {
      return uuid;
    }

    /**
      * Sets the value of the 'uuid' field.
      * @param value The value of 'uuid'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setUuid(java.lang.String value) {
      validate(fields()[0], value);
      this.uuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uuid' field has been set.
      * @return True if the 'uuid' field has been set, false otherwise.
      */
    public boolean hasUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uuid' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'registrationNumber' field.
      * @return The value.
      */
    public java.lang.Object getRegistrationNumber() {
      return registrationNumber;
    }

    /**
      * Sets the value of the 'registrationNumber' field.
      * @param value The value of 'registrationNumber'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setRegistrationNumber(java.lang.Object value) {
      validate(fields()[1], value);
      this.registrationNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'registrationNumber' field has been set.
      * @return True if the 'registrationNumber' field has been set, false otherwise.
      */
    public boolean hasRegistrationNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'registrationNumber' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearRegistrationNumber() {
      registrationNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'driverName' field.
      * @return The value.
      */
    public java.lang.String getDriverName() {
      return driverName;
    }

    /**
      * Sets the value of the 'driverName' field.
      * @param value The value of 'driverName'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setDriverName(java.lang.String value) {
      validate(fields()[2], value);
      this.driverName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'driverName' field has been set.
      * @return True if the 'driverName' field has been set, false otherwise.
      */
    public boolean hasDriverName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'driverName' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearDriverName() {
      driverName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'bodyType' field.
      * @return The value.
      */
    public java.lang.String getBodyType() {
      return bodyType;
    }

    /**
      * Sets the value of the 'bodyType' field.
      * @param value The value of 'bodyType'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setBodyType(java.lang.String value) {
      validate(fields()[3], value);
      this.bodyType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'bodyType' field has been set.
      * @return True if the 'bodyType' field has been set, false otherwise.
      */
    public boolean hasBodyType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'bodyType' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearBodyType() {
      bodyType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'chassisType' field.
      * @return The value.
      */
    public java.lang.Object getChassisType() {
      return chassisType;
    }

    /**
      * Sets the value of the 'chassisType' field.
      * @param value The value of 'chassisType'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setChassisType(java.lang.Object value) {
      validate(fields()[4], value);
      this.chassisType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'chassisType' field has been set.
      * @return True if the 'chassisType' field has been set, false otherwise.
      */
    public boolean hasChassisType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'chassisType' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearChassisType() {
      chassisType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'carryingCapacity' field.
      * @return The value.
      */
    public java.lang.String getCarryingCapacity() {
      return carryingCapacity;
    }

    /**
      * Sets the value of the 'carryingCapacity' field.
      * @param value The value of 'carryingCapacity'.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder setCarryingCapacity(java.lang.String value) {
      validate(fields()[5], value);
      this.carryingCapacity = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'carryingCapacity' field has been set.
      * @return True if the 'carryingCapacity' field has been set, false otherwise.
      */
    public boolean hasCarryingCapacity() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'carryingCapacity' field.
      * @return This builder.
      */
    public com.vehicleManager.models.Vehicle.Builder clearCarryingCapacity() {
      carryingCapacity = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public Vehicle build() {
      try {
        Vehicle record = new Vehicle();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.String) defaultValue(fields()[0]);
        record.registrationNumber = fieldSetFlags()[1] ? this.registrationNumber : (java.lang.Object) defaultValue(fields()[1]);
        record.driverName = fieldSetFlags()[2] ? this.driverName : (java.lang.String) defaultValue(fields()[2]);
        record.bodyType = fieldSetFlags()[3] ? this.bodyType : (java.lang.String) defaultValue(fields()[3]);
        record.chassisType = fieldSetFlags()[4] ? this.chassisType : (java.lang.Object) defaultValue(fields()[4]);
        record.carryingCapacity = fieldSetFlags()[5] ? this.carryingCapacity : (java.lang.String) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
