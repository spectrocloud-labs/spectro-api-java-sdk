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
import com.spectrocloud.client.model.V1MaasClusterConfig;
import com.spectrocloud.client.model.V1MaasMachinePoolConfig;
import com.spectrocloud.client.model.V1ObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MaasCloudConfigSpec defines the cloud configuration input by user This will translate to clusterspec/machinespec for cluster-api
 */
@Schema(description = "MaasCloudConfigSpec defines the cloud configuration input by user This will translate to clusterspec/machinespec for cluster-api")


public class V1MaasCloudConfigSpec {
  @SerializedName("cloudAccountRef")
  private V1ObjectReference cloudAccountRef = null;

  @SerializedName("clusterConfig")
  private V1MaasClusterConfig clusterConfig = null;

  @SerializedName("machinePoolConfig")
  private List<V1MaasMachinePoolConfig> machinePoolConfig = null;

  public V1MaasCloudConfigSpec cloudAccountRef(V1ObjectReference cloudAccountRef) {
    this.cloudAccountRef = cloudAccountRef;
    return this;
  }

   /**
   * Get cloudAccountRef
   * @return cloudAccountRef
  **/
  @Schema(description = "")
  public V1ObjectReference getCloudAccountRef() {
    return cloudAccountRef;
  }

  public void setCloudAccountRef(V1ObjectReference cloudAccountRef) {
    this.cloudAccountRef = cloudAccountRef;
  }

  public V1MaasCloudConfigSpec clusterConfig(V1MaasClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1MaasClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1MaasClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public V1MaasCloudConfigSpec machinePoolConfig(List<V1MaasMachinePoolConfig> machinePoolConfig) {
    this.machinePoolConfig = machinePoolConfig;
    return this;
  }

  public V1MaasCloudConfigSpec addMachinePoolConfigItem(V1MaasMachinePoolConfig machinePoolConfigItem) {
    if (this.machinePoolConfig == null) {
      this.machinePoolConfig = new ArrayList<V1MaasMachinePoolConfig>();
    }
    this.machinePoolConfig.add(machinePoolConfigItem);
    return this;
  }

   /**
   * Get machinePoolConfig
   * @return machinePoolConfig
  **/
  @Schema(description = "")
  public List<V1MaasMachinePoolConfig> getMachinePoolConfig() {
    return machinePoolConfig;
  }

  public void setMachinePoolConfig(List<V1MaasMachinePoolConfig> machinePoolConfig) {
    this.machinePoolConfig = machinePoolConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MaasCloudConfigSpec v1MaasCloudConfigSpec = (V1MaasCloudConfigSpec) o;
    return Objects.equals(this.cloudAccountRef, v1MaasCloudConfigSpec.cloudAccountRef) &&
        Objects.equals(this.clusterConfig, v1MaasCloudConfigSpec.clusterConfig) &&
        Objects.equals(this.machinePoolConfig, v1MaasCloudConfigSpec.machinePoolConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountRef, clusterConfig, machinePoolConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MaasCloudConfigSpec {\n");
    
    sb.append("    cloudAccountRef: ").append(toIndentedString(cloudAccountRef)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    machinePoolConfig: ").append(toIndentedString(machinePoolConfig)).append("\n");
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