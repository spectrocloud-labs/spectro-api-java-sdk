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
 * Application tier property object
 */
@Schema(description = "Application tier property object")


public class V1AppTierPropertyEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public V1AppTierPropertyEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application tier property name
   * @return name
  **/
  @Schema(description = "Application tier property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AppTierPropertyEntity value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Application tier property value
   * @return value
  **/
  @Schema(description = "Application tier property value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    V1AppTierPropertyEntity v1AppTierPropertyEntity = (V1AppTierPropertyEntity) o;
    return Objects.equals(this.name, v1AppTierPropertyEntity.name) &&
        Objects.equals(this.value, v1AppTierPropertyEntity.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppTierPropertyEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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