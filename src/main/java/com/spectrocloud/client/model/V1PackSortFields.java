/*
 * Palette APIs - 3.4
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.spectrocloud.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Packs sort by fields
 */
@JsonAdapter(V1PackSortFields.Adapter.class)
public enum V1PackSortFields {
  NAME("name"),
  TYPE("type"),
  LAYER("layer"),
  ADDONTYPE("addOnType"),
  DISPLAYNAME("displayName");

  private String value;

  V1PackSortFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V1PackSortFields fromValue(String input) {
    for (V1PackSortFields b : V1PackSortFields.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<V1PackSortFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final V1PackSortFields enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public V1PackSortFields read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return V1PackSortFields.fromValue((String)(value));
    }
  }
}
