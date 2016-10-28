/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

import static com.google.common.base.MoreObjects.firstNonNull;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import com.google.api.client.util.Data;
import com.google.api.services.bigquery.model.TableFieldSchema;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Google BigQuery Table field. A table field has a name, a type, a mode and possibly a description.
 * Supported types are: {@link Type#integer()}, {@link Type#bool()}, {@link Type#string()},
 * {@link Type#floatingPoint()}, {@link Type#timestamp()} and {@link Type#record(Field...)}. One or
 * more fields form a table's schema.
 */
public final class Field implements Serializable {

  static final Function<TableFieldSchema, Field> FROM_PB_FUNCTION =
      new Function<TableFieldSchema, Field>() {
        @Override
        public Field apply(TableFieldSchema pb) {
          return Field.fromPb(pb);
        }
      };
  static final Function<Field, TableFieldSchema> TO_PB_FUNCTION =
      new Function<Field, TableFieldSchema>() {
        @Override
        public TableFieldSchema apply(Field field) {
          return field.toPb();
        }
      };

  private static final long serialVersionUID = -8154262932305199256L;

  private final String name;
  private final Type type;
  private final String mode;
  private final String description;

  /**
   * Data Types for a BigQuery Table field. This class provides factory methods for all BigQuery
   * field types. To instantiate a RECORD value the list of sub-fields must be provided.
   *
   * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
   *     Data Types</a>
   */
  public static class Type implements Serializable {

    private static final long serialVersionUID = 2841484762609576959L;

    public enum Value {
      BYTES, STRING, INTEGER, FLOAT, BOOLEAN, TIMESTAMP, RECORD
    }

    private final Value value;
    private final List<Field> fields;

    private Type(Value value) {
      this.value = checkNotNull(value);
      this.fields = null;
    }

    private Type(Value value, List<Field> fields) {
      checkArgument(fields.size() > 0, "Record must have at least one field");
      this.value = value;
      this.fields = fields;
    }

    /**
     * Returns the value identifier.
     *
     * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
     *     Data Types</a>
     */
    @Deprecated
    public Value value() {
      return getValue();
    }

    /**
     * Returns the value identifier.
     *
     * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
     *     Data Types</a>
     */
    public Value getValue() {
      return value;
    }

    /**
     * Returns the list of sub-fields if {@link #value()} is set to {@link Value#RECORD}. Returns
     * {@code null} otherwise.
     */
    @Deprecated
    public List<Field> fields() {
      return getFields();
    }

    /**
     * Returns the list of sub-fields if {@link #value()} is set to {@link Value#RECORD}. Returns
     * {@code null} otherwise.
     */
    public List<Field> getFields() {
      return fields;
    }

    /**
     * Returns a {@link Value#BYTES} field value.
     */
    public static Type bytes() {
      return new Type(Value.BYTES);
    }

    /**
     * Returns a {@link Value#STRING} field value.
     */
    public static Type string() {
      return new Type(Value.STRING);
    }

    /**
     * Returns an {@link Value#INTEGER} field value.
     */
    public static Type integer() {
      return new Type(Value.INTEGER);
    }

    /**
     * Returns a {@link Value#FLOAT} field value.
     */
    public static Type floatingPoint() {
      return new Type(Value.FLOAT);
    }

    /**
     * Returns a {@link Value#BOOLEAN} field value.
     */
    public static Type bool() {
      return new Type(Value.BOOLEAN);
    }

    /**
     * Returns a {@link Value#TIMESTAMP} field value.
     */
    public static Type timestamp() {
      return new Type(Value.TIMESTAMP);
    }

    /**
     * Returns a {@link Value#RECORD} field value with associated list of sub-fields.
     */
    public static Type record(Field... fields) {
      return new Type(Value.RECORD, ImmutableList.copyOf(fields));
    }

    /**
     * Returns a {@link Value#RECORD} field value with associated list of sub-fields.
     */
    public static Type record(List<Field> fields) {
      return new Type(Value.RECORD, ImmutableList.copyOf(checkNotNull(fields)));
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(this)
          .add("value", value)
          .add("fields", fields)
          .toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(value, fields);
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Type)) {
        return false;
      }
      Type other = (Type) obj;
      return Objects.equals(value, other.value)
          && Objects.equals(fields, other.fields);
    }
  }

  /**
   * Mode for a BigQuery Table field. {@link Mode#NULLABLE} fields can be set to {@code null},
   * {@link Mode#REQUIRED} fields must be provided. {@link Mode#REPEATED} fields can contain more
   * than one value.
   */
  public enum Mode {
    NULLABLE, REQUIRED, REPEATED
  }

  public static final class Builder {

    private String name;
    private Type type;
    private String mode;
    private String description;

    private Builder() {}

    private Builder(Field field) {
      this.name = field.name;
      this.type = field.type;
      this.mode = field.mode;
      this.description = field.description;
    }

    /**
     * Sets the field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
     * underscores (_), and must start with a letter or underscore. The maximum length is 128
     * characters.
     */
    @Deprecated
    public Builder name(String name) {
      return setName(name);
    }

    /**
     * Sets the field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
     * underscores (_), and must start with a letter or underscore. The maximum length is 128
     * characters.
     */
    public Builder setName(String name) {
      this.name = checkNotNull(name);
      return this;
    }

    /**
     * Sets the value of the field.
     *
     * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
     *     Data Types</a>
     */
    @Deprecated
    public Builder type(Type type) {
      return setType(type);
    }

    /**
     * Sets the value of the field.
     *
     * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
     *     Data Types</a>
     */
    public Builder setType(Type type) {
      this.type = checkNotNull(type);
      return this;
    }

    /**
     * Sets the mode of the field. When not specified {@link Mode#NULLABLE} is used.
     */
    @Deprecated
    public Builder mode(Mode mode) {
      return setMode(mode);
    }

    /**
     * Sets the mode of the field. When not specified {@link Mode#NULLABLE} is used.
     */
    public Builder setMode(Mode mode) {
      this.mode = mode != null ? mode.name() : Data.<String>nullOf(String.class);
      return this;
    }

    /**
     * Sets the field description. The maximum length is 16K characters.
     */
    @Deprecated
    public Builder description(String description) {
      return setDescription(description);
    }

    /**
     * Sets the field description. The maximum length is 16K characters.
     */
    public Builder setDescription(String description) {
      this.description = firstNonNull(description, Data.<String>nullOf(String.class));
      return this;
    }

    /**
     * Creates a {@code Field} object.
     */
    public Field build() {
      return new Field(this);
    }
  }

  private Field(Builder builder) {
    this.name = checkNotNull(builder.name);
    this.type = checkNotNull(builder.type);
    this.mode = builder.mode;
    this.description = builder.description;
  }

  /**
   * Returns the field name.
   */
  @Deprecated
  public String name() {
    return getName();
  }

  /**
   * Returns the field name.
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the field value.
   *
   * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
   *     Data Types</a>
   */
  @Deprecated
  public Type type() {
    return getType();
  }

  /**
   * Returns the field value.
   *
   * @see <a href="https://cloud.google.com/bigquery/preparing-data-for-bigquery#datatypes">
   *     Data Types</a>
   */
  public Type getType() {
    return type;
  }

  /**
   * Returns the field mode. By default {@link Mode#NULLABLE} is used.
   */
  @Deprecated
  public Mode mode() {
    return getMode();
  }

  /**
   * Returns the field mode. By default {@link Mode#NULLABLE} is used.
   */
  public Mode getMode() {
    return mode != null ? Mode.valueOf(mode) : null;
  }

  /**
   * Returns the field description.
   */
  @Deprecated
  public String description() {
    return getDescription();
  }

  /**
   * Returns the field description.
   */
  public String getDescription() {
    return Data.isNull(description) ? null : description;
  }

  /**
   * Returns the list of sub-fields if {@link #type()} is a {@link Type.Value#RECORD}. Returns
   * {@code null} otherwise.
   */
  @Deprecated
  public List<Field> fields() {
    return getFields();
  }

  /**
   * Returns the list of sub-fields if {@link #type()} is a {@link Type.Value#RECORD}. Returns
   * {@code null} otherwise.
   */
  public List<Field> getFields() {
    return type.getFields();
  }

  /**
   * Returns a builder for the {@code Field} object.
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("value", type)
        .add("mode", mode)
        .add("description", description)
        .toString();
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, mode, description);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Field && Objects.equals(toPb(), ((Field) obj).toPb());
  }

  TableFieldSchema toPb() {
    TableFieldSchema fieldSchemaPb = new TableFieldSchema();
    fieldSchemaPb.setName(name);
    fieldSchemaPb.setType(type.getValue().name());
    if (mode != null) {
      fieldSchemaPb.setMode(mode);
    }
    if (description != null) {
      fieldSchemaPb.setDescription(description);
    }
    if (getFields() != null) {
      List<TableFieldSchema> fieldsPb = Lists.transform(getFields(), TO_PB_FUNCTION);
      fieldSchemaPb.setFields(fieldsPb);
    }
    return fieldSchemaPb;
  }

  /**
   * Returns a Field object with given name and value.
   */
  public static Field of(String name, Type type) {
    return newBuilder(name, type).build();
  }

  /**
   * Returns a builder for a Field object with given name and value.
   */
  @Deprecated
  public static Builder builder(String name, Type type) {
    return newBuilder(name, type);
  }

  /**
   * Returns a builder for a Field object with given name and value.
   */
  public static Builder newBuilder(String name, Type type) {
    return new Builder().setName(name).setType(type);
  }

  static Field fromPb(TableFieldSchema fieldSchemaPb) {
    Builder fieldBuilder = new Builder();
    fieldBuilder.setName(fieldSchemaPb.getName());
    Type.Value enumValue = Type.Value.valueOf(fieldSchemaPb.getType());
    if (fieldSchemaPb.getMode() != null) {
      fieldBuilder.setMode(Mode.valueOf(fieldSchemaPb.getMode()));
    }
    if (fieldSchemaPb.getDescription() != null) {
      fieldBuilder.setDescription(fieldSchemaPb.getDescription());
    }
    if (fieldSchemaPb.getFields() != null) {
      fieldBuilder.setType(
          Type.record(Lists.transform(fieldSchemaPb.getFields(), FROM_PB_FUNCTION)));
    } else {
      fieldBuilder.setType(new Type(enumValue));
    }
    return fieldBuilder.build();
  }
}
