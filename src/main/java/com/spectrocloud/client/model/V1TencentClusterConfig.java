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
import com.spectrocloud.client.model.V1TkeEndpointAccess;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster level configuration for tencent cloud and applicable for all the machine pools
 */
@Schema(description = "Cluster level configuration for tencent cloud and applicable for all the machine pools")


public class V1TencentClusterConfig {
  @SerializedName("endpointAccess")
  private V1TkeEndpointAccess endpointAccess = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("sshKeyIDs")
  private List<String> sshKeyIDs = null;

  @SerializedName("vpcID")
  private String vpcID = null;

  public V1TencentClusterConfig endpointAccess(V1TkeEndpointAccess endpointAccess) {
    this.endpointAccess = endpointAccess;
    return this;
  }

   /**
   * Get endpointAccess
   * @return endpointAccess
  **/
  @Schema(description = "")
  public V1TkeEndpointAccess getEndpointAccess() {
    return endpointAccess;
  }

  public void setEndpointAccess(V1TkeEndpointAccess endpointAccess) {
    this.endpointAccess = endpointAccess;
  }

  public V1TencentClusterConfig region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(required = true, description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1TencentClusterConfig sshKeyIDs(List<String> sshKeyIDs) {
    this.sshKeyIDs = sshKeyIDs;
    return this;
  }

  public V1TencentClusterConfig addSshKeyIDsItem(String sshKeyIDsItem) {
    if (this.sshKeyIDs == null) {
      this.sshKeyIDs = new ArrayList<String>();
    }
    this.sshKeyIDs.add(sshKeyIDsItem);
    return this;
  }

   /**
   * Get sshKeyIDs
   * @return sshKeyIDs
  **/
  @Schema(description = "")
  public List<String> getSshKeyIDs() {
    return sshKeyIDs;
  }

  public void setSshKeyIDs(List<String> sshKeyIDs) {
    this.sshKeyIDs = sshKeyIDs;
  }

  public V1TencentClusterConfig vpcID(String vpcID) {
    this.vpcID = vpcID;
    return this;
  }

   /**
   * VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created
   * @return vpcID
  **/
  @Schema(description = "VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created")
  public String getVpcID() {
    return vpcID;
  }

  public void setVpcID(String vpcID) {
    this.vpcID = vpcID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TencentClusterConfig v1TencentClusterConfig = (V1TencentClusterConfig) o;
    return Objects.equals(this.endpointAccess, v1TencentClusterConfig.endpointAccess) &&
        Objects.equals(this.region, v1TencentClusterConfig.region) &&
        Objects.equals(this.sshKeyIDs, v1TencentClusterConfig.sshKeyIDs) &&
        Objects.equals(this.vpcID, v1TencentClusterConfig.vpcID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointAccess, region, sshKeyIDs, vpcID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentClusterConfig {\n");
    
    sb.append("    endpointAccess: ").append(toIndentedString(endpointAccess)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sshKeyIDs: ").append(toIndentedString(sshKeyIDs)).append("\n");
    sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
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