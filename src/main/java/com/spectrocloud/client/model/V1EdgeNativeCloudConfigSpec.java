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
import com.spectrocloud.client.model.V1EdgeNativeClusterConfig;
import com.spectrocloud.client.model.V1EdgeNativeMachinePoolConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EdgeNativeCloudConfigSpec defines the desired state of EdgeNativeCloudConfig
 */
@Schema(description = "EdgeNativeCloudConfigSpec defines the desired state of EdgeNativeCloudConfig")


public class V1EdgeNativeCloudConfigSpec {
  @SerializedName("clusterConfig")
  private V1EdgeNativeClusterConfig clusterConfig = null;

  @SerializedName("machinePoolConfig")
  private List<V1EdgeNativeMachinePoolConfig> machinePoolConfig = new ArrayList<V1EdgeNativeMachinePoolConfig>();

  public V1EdgeNativeCloudConfigSpec clusterConfig(V1EdgeNativeClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(required = true, description = "")
  public V1EdgeNativeClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1EdgeNativeClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public V1EdgeNativeCloudConfigSpec machinePoolConfig(List<V1EdgeNativeMachinePoolConfig> machinePoolConfig) {
    this.machinePoolConfig = machinePoolConfig;
    return this;
  }

  public V1EdgeNativeCloudConfigSpec addMachinePoolConfigItem(V1EdgeNativeMachinePoolConfig machinePoolConfigItem) {
    this.machinePoolConfig.add(machinePoolConfigItem);
    return this;
  }

   /**
   * Get machinePoolConfig
   * @return machinePoolConfig
  **/
  @Schema(required = true, description = "")
  public List<V1EdgeNativeMachinePoolConfig> getMachinePoolConfig() {
    return machinePoolConfig;
  }

  public void setMachinePoolConfig(List<V1EdgeNativeMachinePoolConfig> machinePoolConfig) {
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
    V1EdgeNativeCloudConfigSpec v1EdgeNativeCloudConfigSpec = (V1EdgeNativeCloudConfigSpec) o;
    return Objects.equals(this.clusterConfig, v1EdgeNativeCloudConfigSpec.clusterConfig) &&
        Objects.equals(this.machinePoolConfig, v1EdgeNativeCloudConfigSpec.machinePoolConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterConfig, machinePoolConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EdgeNativeCloudConfigSpec {\n");
    
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