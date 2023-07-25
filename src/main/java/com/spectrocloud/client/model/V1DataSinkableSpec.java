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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spectrocloud.client.model.V1CloudWatch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1DataSinkableSpec
 */



public class V1DataSinkableSpec {
  @SerializedName("cloudWatch")
  private V1CloudWatch cloudWatch = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLOUDWATCH("cloudwatch");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public V1DataSinkableSpec cloudWatch(V1CloudWatch cloudWatch) {
    this.cloudWatch = cloudWatch;
    return this;
  }

   /**
   * Get cloudWatch
   * @return cloudWatch
  **/
  @Schema(description = "")
  public V1CloudWatch getCloudWatch() {
    return cloudWatch;
  }

  public void setCloudWatch(V1CloudWatch cloudWatch) {
    this.cloudWatch = cloudWatch;
  }

  public V1DataSinkableSpec type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DataSinkableSpec v1DataSinkableSpec = (V1DataSinkableSpec) o;
    return Objects.equals(this.cloudWatch, v1DataSinkableSpec.cloudWatch) &&
        Objects.equals(this.type, v1DataSinkableSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudWatch, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DataSinkableSpec {\n");
    
    sb.append("    cloudWatch: ").append(toIndentedString(cloudWatch)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
