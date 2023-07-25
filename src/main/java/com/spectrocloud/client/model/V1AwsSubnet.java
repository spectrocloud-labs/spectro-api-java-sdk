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
 * A subnet is a range of IP addresses in a AWS VPC
 */
@Schema(description = "A subnet is a range of IP addresses in a AWS VPC")


public class V1AwsSubnet {
  @SerializedName("az")
  private String az = null;

  @SerializedName("isPrivate")
  private Boolean isPrivate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subnetId")
  private String subnetId = null;

  public V1AwsSubnet az(String az) {
    this.az = az;
    return this;
  }

   /**
   * Every subnet can only be associated with only one Availability Zone
   * @return az
  **/
  @Schema(description = "Every subnet can only be associated with only one Availability Zone")
  public String getAz() {
    return az;
  }

  public void setAz(String az) {
    this.az = az;
  }

  public V1AwsSubnet isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Is this subnet private
   * @return isPrivate
  **/
  @Schema(description = "Is this subnet private")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public V1AwsSubnet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the subnet
   * @return name
  **/
  @Schema(description = "Name of the subnet")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AwsSubnet subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Id of the subnet
   * @return subnetId
  **/
  @Schema(description = "Id of the subnet")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsSubnet v1AwsSubnet = (V1AwsSubnet) o;
    return Objects.equals(this.az, v1AwsSubnet.az) &&
        Objects.equals(this.isPrivate, v1AwsSubnet.isPrivate) &&
        Objects.equals(this.name, v1AwsSubnet.name) &&
        Objects.equals(this.subnetId, v1AwsSubnet.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(az, isPrivate, name, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsSubnet {\n");
    
    sb.append("    az: ").append(toIndentedString(az)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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