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
 * Gets or Sets v1SearchSortFields
 */
@JsonAdapter(V1SearchSortFields.Adapter.class)
public enum V1SearchSortFields {
  ENVIRONMENT("environment"),
  CLUSTERNAME("clusterName"),
  CLUSTERSTATE("clusterState"),
  HEALTHSTATE("healthState"),
  CREATIONTIMESTAMP("creationTimestamp"),
  LASTMODIFIEDTIMESTAMP("lastModifiedTimestamp");

  private String value;

  V1SearchSortFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V1SearchSortFields fromValue(String input) {
    for (V1SearchSortFields b : V1SearchSortFields.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<V1SearchSortFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final V1SearchSortFields enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public V1SearchSortFields read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return V1SearchSortFields.fromValue((String)(value));
    }
  }
}
