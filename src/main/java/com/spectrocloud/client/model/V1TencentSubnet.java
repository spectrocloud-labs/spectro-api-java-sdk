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
 * Tencent Subnet entity
 */
@Schema(description = "Tencent Subnet entity")


public class V1TencentSubnet {
  @SerializedName("az")
  private String az = null;

  @SerializedName("cidrBlock")
  private String cidrBlock = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subnetId")
  private String subnetId = null;

  public V1TencentSubnet az(String az) {
    this.az = az;
    return this;
  }

   /**
   * Availability zone associated with tencent subnet
   * @return az
  **/
  @Schema(description = "Availability zone associated with tencent subnet")
  public String getAz() {
    return az;
  }

  public void setAz(String az) {
    this.az = az;
  }

  public V1TencentSubnet cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Tencent subnet CIDR. The CIDR notation consists of an IP address, a slash character (&#x27;/&#x27;) and a decimal number from 0 to 32
   * @return cidrBlock
  **/
  @Schema(description = "Tencent subnet CIDR. The CIDR notation consists of an IP address, a slash character ('/') and a decimal number from 0 to 32")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public V1TencentSubnet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tencent subnet name
   * @return name
  **/
  @Schema(description = "Tencent subnet name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1TencentSubnet subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Tencent subnet id
   * @return subnetId
  **/
  @Schema(description = "Tencent subnet id")
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
    V1TencentSubnet v1TencentSubnet = (V1TencentSubnet) o;
    return Objects.equals(this.az, v1TencentSubnet.az) &&
        Objects.equals(this.cidrBlock, v1TencentSubnet.cidrBlock) &&
        Objects.equals(this.name, v1TencentSubnet.name) &&
        Objects.equals(this.subnetId, v1TencentSubnet.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(az, cidrBlock, name, subnetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentSubnet {\n");
    
    sb.append("    az: ").append(toIndentedString(az)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
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
