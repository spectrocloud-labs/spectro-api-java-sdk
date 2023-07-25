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
 * V1CPU
 */



public class V1CPU {
  @SerializedName("cores")
  private Integer cores = null;

  public V1CPU cores(Integer cores) {
    this.cores = cores;
    return this;
  }

   /**
   * number of cpu cores
   * @return cores
  **/
  @Schema(description = "number of cpu cores")
  public Integer getCores() {
    return cores;
  }

  public void setCores(Integer cores) {
    this.cores = cores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CPU v1CPU = (V1CPU) o;
    return Objects.equals(this.cores, v1CPU.cores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CPU {\n");
    
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
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
