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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1HttpPatch
 */



public class V1HttpPatch {
  @SerializedName("from")
  private String from = null;

  /**
   * The operation to be performed
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    ADD("add"),
    REMOVE("remove"),
    REPLACE("replace"),
    MOVE("move"),
    COPY("copy");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OpEnum fromValue(String input) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OpEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("op")
  private OpEnum op = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("value")
  private Object value = null;

  public V1HttpPatch from(String from) {
    this.from = from;
    return this;
  }

   /**
   * A path to the pointer from which reference will be taken
   * @return from
  **/
  @Schema(description = "A path to the pointer from which reference will be taken")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public V1HttpPatch op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The operation to be performed
   * @return op
  **/
  @Schema(required = true, description = "The operation to be performed")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public V1HttpPatch path(String path) {
    this.path = path;
    return this;
  }

   /**
   * A path to the pointer on which operation will be done
   * @return path
  **/
  @Schema(required = true, description = "A path to the pointer on which operation will be done")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1HttpPatch value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value to be used within the operations.
   * @return value
  **/
  @Schema(description = "The value to be used within the operations.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HttpPatch v1HttpPatch = (V1HttpPatch) o;
    return Objects.equals(this.from, v1HttpPatch.from) &&
        Objects.equals(this.op, v1HttpPatch.op) &&
        Objects.equals(this.path, v1HttpPatch.path) &&
        Objects.equals(this.value, v1HttpPatch.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, op, path, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HttpPatch {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
