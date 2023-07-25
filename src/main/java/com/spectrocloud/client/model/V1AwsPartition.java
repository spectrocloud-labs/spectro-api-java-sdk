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
 * AWS accounts are scoped to a single partition. Allowed values [aws, aws-us-gov], Default values
 */
@JsonAdapter(V1AwsPartition.Adapter.class)
public enum V1AwsPartition {
  AWS("aws"),
  AWS_US_GOV("aws-us-gov");

  private String value;

  V1AwsPartition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static V1AwsPartition fromValue(String input) {
    for (V1AwsPartition b : V1AwsPartition.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<V1AwsPartition> {
    @Override
    public void write(final JsonWriter jsonWriter, final V1AwsPartition enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public V1AwsPartition read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return V1AwsPartition.fromValue((String)(value));
    }
  }
}