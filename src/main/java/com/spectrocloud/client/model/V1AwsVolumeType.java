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
 * AWS Volume Type entity
 */
@Schema(description = "AWS Volume Type entity")


public class V1AwsVolumeType {
  @SerializedName("id")
  private String id = null;

  @SerializedName("maxIops")
  private String maxIops = null;

  @SerializedName("maxThroughPut")
  private String maxThroughPut = null;

  @SerializedName("name")
  private String name = null;

  public V1AwsVolumeType id(String id) {
    this.id = id;
    return this;
  }

   /**
   * AWS volume type id
   * @return id
  **/
  @Schema(description = "AWS volume type id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1AwsVolumeType maxIops(String maxIops) {
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Iops through put of volume type
   * @return maxIops
  **/
  @Schema(description = "Iops through put of volume type")
  public String getMaxIops() {
    return maxIops;
  }

  public void setMaxIops(String maxIops) {
    this.maxIops = maxIops;
  }

  public V1AwsVolumeType maxThroughPut(String maxThroughPut) {
    this.maxThroughPut = maxThroughPut;
    return this;
  }

   /**
   * Max through put of volume type
   * @return maxThroughPut
  **/
  @Schema(description = "Max through put of volume type")
  public String getMaxThroughPut() {
    return maxThroughPut;
  }

  public void setMaxThroughPut(String maxThroughPut) {
    this.maxThroughPut = maxThroughPut;
  }

  public V1AwsVolumeType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * AWS Volume Type Name
   * @return name
  **/
  @Schema(description = "AWS Volume Type Name")
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
    V1AwsVolumeType v1AwsVolumeType = (V1AwsVolumeType) o;
    return Objects.equals(this.id, v1AwsVolumeType.id) &&
        Objects.equals(this.maxIops, v1AwsVolumeType.maxIops) &&
        Objects.equals(this.maxThroughPut, v1AwsVolumeType.maxThroughPut) &&
        Objects.equals(this.name, v1AwsVolumeType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxIops, maxThroughPut, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsVolumeType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
    sb.append("    maxThroughPut: ").append(toIndentedString(maxThroughPut)).append("\n");
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
