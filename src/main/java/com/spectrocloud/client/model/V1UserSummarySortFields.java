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
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets v1UserSummarySortFields
 */
@JsonAdapter(V1UserSummarySortFields.Adapter.class)
public enum V1UserSummarySortFields {
  NAME("name"),
  CREATIONTIMESTAMP("creationTimestamp");

  private String value;

  V1UserSummarySortFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V1UserSummarySortFields fromValue(String input) {
    for (V1UserSummarySortFields b : V1UserSummarySortFields.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<V1UserSummarySortFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final V1UserSummarySortFields enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public V1UserSummarySortFields read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return V1UserSummarySortFields.fromValue((String)(value));
    }
  }
}
