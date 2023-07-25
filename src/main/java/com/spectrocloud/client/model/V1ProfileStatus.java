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
 * V1ProfileStatus
 */



public class V1ProfileStatus {
  @SerializedName("hasUserMacros")
  private Boolean hasUserMacros = null;

  public V1ProfileStatus hasUserMacros(Boolean hasUserMacros) {
    this.hasUserMacros = hasUserMacros;
    return this;
  }

   /**
   * If it is true then profile pack values has a reference to user defined macros
   * @return hasUserMacros
  **/
  @Schema(description = "If it is true then profile pack values has a reference to user defined macros")
  public Boolean isHasUserMacros() {
    return hasUserMacros;
  }

  public void setHasUserMacros(Boolean hasUserMacros) {
    this.hasUserMacros = hasUserMacros;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProfileStatus v1ProfileStatus = (V1ProfileStatus) o;
    return Objects.equals(this.hasUserMacros, v1ProfileStatus.hasUserMacros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasUserMacros);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProfileStatus {\n");
    
    sb.append("    hasUserMacros: ").append(toIndentedString(hasUserMacros)).append("\n");
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
