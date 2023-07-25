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
 * V1Subnet
 */



public class V1Subnet {
  @SerializedName("cidrBlock")
  private String cidrBlock = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("securityGroupName")
  private String securityGroupName = null;

  public V1Subnet cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * CidrBlock is the CIDR block to be used when the provider creates a managed Vnet.
   * @return cidrBlock
  **/
  @Schema(description = "CidrBlock is the CIDR block to be used when the provider creates a managed Vnet.")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public V1Subnet name(String name) {
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

  public V1Subnet securityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * Network Security Group(NSG) to be attached to subnet. NSG for a control plane subnet, should allow inbound to port 6443, as port 6443 is used by kubeadm to bootstrap the control planes
   * @return securityGroupName
  **/
  @Schema(description = "Network Security Group(NSG) to be attached to subnet. NSG for a control plane subnet, should allow inbound to port 6443, as port 6443 is used by kubeadm to bootstrap the control planes")
  public String getSecurityGroupName() {
    return securityGroupName;
  }

  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Subnet v1Subnet = (V1Subnet) o;
    return Objects.equals(this.cidrBlock, v1Subnet.cidrBlock) &&
        Objects.equals(this.name, v1Subnet.name) &&
        Objects.equals(this.securityGroupName, v1Subnet.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, name, securityGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Subnet {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
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