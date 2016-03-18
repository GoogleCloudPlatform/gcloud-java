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

package com.google.gcloud.bigquery;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableList;

import org.junit.Test;

import java.util.List;

public class SchemaTest {

  private static final Field FIELD_SCHEMA1 =
      Field.builder("StringField", Field.Type.string())
          .mode(Field.Mode.NULLABLE)
          .description("FieldDescription1")
          .build();
  private static final Field FIELD_SCHEMA2 =
      Field.builder("IntegerField", Field.Type.integer())
          .mode(Field.Mode.REPEATED)
          .description("FieldDescription2")
          .build();
  private static final Field FIELD_SCHEMA3 =
      Field.builder("RecordField", Field.Type.record(FIELD_SCHEMA1, FIELD_SCHEMA2))
          .mode(Field.Mode.REQUIRED)
          .description("FieldDescription3")
          .build();
  private static final List<Field> FIELDS = ImmutableList.of(FIELD_SCHEMA1, FIELD_SCHEMA2,
      FIELD_SCHEMA3);
  private static final Schema TABLE_SCHEMA = Schema.builder().fields(FIELDS).build();

  @Test
  public void testToBuilder() {
    compareTableSchema(TABLE_SCHEMA, TABLE_SCHEMA.toBuilder().build());
  }

  @Test
  public void testBuilder() {
    assertEquals(FIELDS, TABLE_SCHEMA.fields());
    Schema schema = TABLE_SCHEMA.toBuilder()
        .fields(FIELD_SCHEMA1, FIELD_SCHEMA2)
        .addField(FIELD_SCHEMA3)
        .build();
    compareTableSchema(TABLE_SCHEMA, schema);
  }

  @Test
  public void testOf() {
    compareTableSchema(TABLE_SCHEMA, Schema.of(FIELDS));
  }

  @Test
  public void testToAndFromPb() {
    compareTableSchema(TABLE_SCHEMA, Schema.fromPb(TABLE_SCHEMA.toPb()));
  }

  private void compareTableSchema(Schema expected, Schema value) {
    assertEquals(expected, value);
    assertEquals(expected.fields(), value.fields());
  }
}
