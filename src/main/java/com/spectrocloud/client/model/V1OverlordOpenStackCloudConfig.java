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
import com.spectrocloud.client.model.V1ClusterConfigEntity;
import com.spectrocloud.client.model.V1OpenStackClusterConfig;
import com.spectrocloud.client.model.V1OpenStackMachineConfigEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1OverlordOpenStackCloudConfig
 */



public class V1OverlordOpenStackCloudConfig {
  @SerializedName("clusterConfig")
  private V1OpenStackClusterConfig clusterConfig = null;

  @SerializedName("clusterSettings")
  private V1ClusterConfigEntity clusterSettings = null;

  @SerializedName("machineConfig")
  private V1OpenStackMachineConfigEntity machineConfig = null;

  @SerializedName("size")
  private Integer size = null;

  public V1OverlordOpenStackCloudConfig clusterConfig(V1OpenStackClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1OpenStackClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1OpenStackClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public V1OverlordOpenStackCloudConfig clusterSettings(V1ClusterConfigEntity clusterSettings) {
    this.clusterSettings = clusterSettings;
    return this;
  }

   /**
   * Get clusterSettings
   * @return clusterSettings
  **/
  @Schema(description = "")
  public V1ClusterConfigEntity getClusterSettings() {
    return clusterSettings;
  }

  public void setClusterSettings(V1ClusterConfigEntity clusterSettings) {
    this.clusterSettings = clusterSettings;
  }

  public V1OverlordOpenStackCloudConfig machineConfig(V1OpenStackMachineConfigEntity machineConfig) {
    this.machineConfig = machineConfig;
    return this;
  }

   /**
   * Get machineConfig
   * @return machineConfig
  **/
  @Schema(description = "")
  public V1OpenStackMachineConfigEntity getMachineConfig() {
    return machineConfig;
  }

  public void setMachineConfig(V1OpenStackMachineConfigEntity machineConfig) {
    this.machineConfig = machineConfig;
  }

  public V1OverlordOpenStackCloudConfig size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * size of the pool, number of machines
   * @return size
  **/
  @Schema(description = "size of the pool, number of machines")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OverlordOpenStackCloudConfig v1OverlordOpenStackCloudConfig = (V1OverlordOpenStackCloudConfig) o;
    return Objects.equals(this.clusterConfig, v1OverlordOpenStackCloudConfig.clusterConfig) &&
        Objects.equals(this.clusterSettings, v1OverlordOpenStackCloudConfig.clusterSettings) &&
        Objects.equals(this.machineConfig, v1OverlordOpenStackCloudConfig.machineConfig) &&
        Objects.equals(this.size, v1OverlordOpenStackCloudConfig.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterConfig, clusterSettings, machineConfig, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OverlordOpenStackCloudConfig {\n");
    
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    clusterSettings: ").append(toIndentedString(clusterSettings)).append("\n");
    sb.append("    machineConfig: ").append(toIndentedString(machineConfig)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
