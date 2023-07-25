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
import com.spectrocloud.client.model.V1AwsSubnet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A virtual network dedicated to a AWS account
 */
@Schema(description = "A virtual network dedicated to a AWS account")


public class V1AwsVpc {
  @SerializedName("cidrBlock")
  private String cidrBlock = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subnets")
  private List<V1AwsSubnet> subnets = null;

  @SerializedName("vpcId")
  private String vpcId = null;

  public V1AwsVpc cidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * Get cidrBlock
   * @return cidrBlock
  **/
  @Schema(description = "")
  public String getCidrBlock() {
    return cidrBlock;
  }

  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }

  public V1AwsVpc name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the virtual network
   * @return name
  **/
  @Schema(description = "Name of the virtual network")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AwsVpc subnets(List<V1AwsSubnet> subnets) {
    this.subnets = subnets;
    return this;
  }

  public V1AwsVpc addSubnetsItem(V1AwsSubnet subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<V1AwsSubnet>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * List of subnets associated to a AWS VPC
   * @return subnets
  **/
  @Schema(description = "List of subnets associated to a AWS VPC")
  public List<V1AwsSubnet> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<V1AwsSubnet> subnets) {
    this.subnets = subnets;
  }

  public V1AwsVpc vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Id of the virtual network
   * @return vpcId
  **/
  @Schema(required = true, description = "Id of the virtual network")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsVpc v1AwsVpc = (V1AwsVpc) o;
    return Objects.equals(this.cidrBlock, v1AwsVpc.cidrBlock) &&
        Objects.equals(this.name, v1AwsVpc.name) &&
        Objects.equals(this.subnets, v1AwsVpc.subnets) &&
        Objects.equals(this.vpcId, v1AwsVpc.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrBlock, name, subnets, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsVpc {\n");
    
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
