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
import com.spectrocloud.client.model.V1GcpSubnetEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1GcpMachinePoolCloudConfigEntity
 */



public class V1GcpMachinePoolCloudConfigEntity {
  @SerializedName("azs")
  private List<String> azs = null;

  @SerializedName("instanceType")
  private String instanceType = null;

  @SerializedName("rootDeviceSize")
  private Long rootDeviceSize = null;

  @SerializedName("subnet")
  private String subnet = null;

  @SerializedName("subnets")
  private List<V1GcpSubnetEntity> subnets = null;

  public V1GcpMachinePoolCloudConfigEntity azs(List<String> azs) {
    this.azs = azs;
    return this;
  }

  public V1GcpMachinePoolCloudConfigEntity addAzsItem(String azsItem) {
    if (this.azs == null) {
      this.azs = new ArrayList<String>();
    }
    this.azs.add(azsItem);
    return this;
  }

   /**
   * Get azs
   * @return azs
  **/
  @Schema(description = "")
  public List<String> getAzs() {
    return azs;
  }

  public void setAzs(List<String> azs) {
    this.azs = azs;
  }

  public V1GcpMachinePoolCloudConfigEntity instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(required = true, description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public V1GcpMachinePoolCloudConfigEntity rootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
    return this;
  }

   /**
   * Size of root volume in GB. Default is 30GB
   * @return rootDeviceSize
  **/
  @Schema(description = "Size of root volume in GB. Default is 30GB")
  public Long getRootDeviceSize() {
    return rootDeviceSize;
  }

  public void setRootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
  }

  public V1GcpMachinePoolCloudConfigEntity subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * Subnet specifies the subnetwork to use for given instance. If not specified, the first subnet from the cluster region and network is used
   * @return subnet
  **/
  @Schema(description = "Subnet specifies the subnetwork to use for given instance. If not specified, the first subnet from the cluster region and network is used")
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  public V1GcpMachinePoolCloudConfigEntity subnets(List<V1GcpSubnetEntity> subnets) {
    this.subnets = subnets;
    return this;
  }

  public V1GcpMachinePoolCloudConfigEntity addSubnetsItem(V1GcpSubnetEntity subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<V1GcpSubnetEntity>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @Schema(description = "")
  public List<V1GcpSubnetEntity> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<V1GcpSubnetEntity> subnets) {
    this.subnets = subnets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpMachinePoolCloudConfigEntity v1GcpMachinePoolCloudConfigEntity = (V1GcpMachinePoolCloudConfigEntity) o;
    return Objects.equals(this.azs, v1GcpMachinePoolCloudConfigEntity.azs) &&
        Objects.equals(this.instanceType, v1GcpMachinePoolCloudConfigEntity.instanceType) &&
        Objects.equals(this.rootDeviceSize, v1GcpMachinePoolCloudConfigEntity.rootDeviceSize) &&
        Objects.equals(this.subnet, v1GcpMachinePoolCloudConfigEntity.subnet) &&
        Objects.equals(this.subnets, v1GcpMachinePoolCloudConfigEntity.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azs, instanceType, rootDeviceSize, subnet, subnets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpMachinePoolCloudConfigEntity {\n");
    
    sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    rootDeviceSize: ").append(toIndentedString(rootDeviceSize)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
