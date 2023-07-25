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
import com.spectrocloud.client.model.V1CloudType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1PcgSelfHostedParams
 */



public class V1PcgSelfHostedParams {
  @SerializedName("cloudType")
  private V1CloudType cloudType = null;

  @SerializedName("name")
  private String name = null;

  public V1PcgSelfHostedParams cloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @Schema(description = "")
  public V1CloudType getCloudType() {
    return cloudType;
  }

  public void setCloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
  }

  public V1PcgSelfHostedParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PcgSelfHostedParams v1PcgSelfHostedParams = (V1PcgSelfHostedParams) o;
    return Objects.equals(this.cloudType, v1PcgSelfHostedParams.cloudType) &&
        Objects.equals(this.name, v1PcgSelfHostedParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PcgSelfHostedParams {\n");
    
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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