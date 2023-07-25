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
import com.spectrocloud.client.model.V1CoxEdgeClusterConfig;
import com.spectrocloud.client.model.V1CoxEdgeMachinePoolConfig;
import com.spectrocloud.client.model.V1ObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CoxEdgeCloudConfigSpec defines the cloud configuration input by user This will translate to clusterspec/machinespec for cluster-api
 */
@Schema(description = "CoxEdgeCloudConfigSpec defines the cloud configuration input by user This will translate to clusterspec/machinespec for cluster-api")


public class V1CoxEdgeCloudConfigSpec {
  @SerializedName("cloudAccountRef")
  private V1ObjectReference cloudAccountRef = null;

  @SerializedName("clusterConfig")
  private V1CoxEdgeClusterConfig clusterConfig = null;

  @SerializedName("machinePoolConfig")
  private List<V1CoxEdgeMachinePoolConfig> machinePoolConfig = null;

  public V1CoxEdgeCloudConfigSpec cloudAccountRef(V1ObjectReference cloudAccountRef) {
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

  public V1CoxEdgeCloudConfigSpec clusterConfig(V1CoxEdgeClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1CoxEdgeClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1CoxEdgeClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public V1CoxEdgeCloudConfigSpec machinePoolConfig(List<V1CoxEdgeMachinePoolConfig> machinePoolConfig) {
    this.machinePoolConfig = machinePoolConfig;
    return this;
  }

  public V1CoxEdgeCloudConfigSpec addMachinePoolConfigItem(V1CoxEdgeMachinePoolConfig machinePoolConfigItem) {
    if (this.machinePoolConfig == null) {
      this.machinePoolConfig = new ArrayList<V1CoxEdgeMachinePoolConfig>();
    }
    this.machinePoolConfig.add(machinePoolConfigItem);
    return this;
  }

   /**
   * Get machinePoolConfig
   * @return machinePoolConfig
  **/
  @Schema(description = "")
  public List<V1CoxEdgeMachinePoolConfig> getMachinePoolConfig() {
    return machinePoolConfig;
  }

  public void setMachinePoolConfig(List<V1CoxEdgeMachinePoolConfig> machinePoolConfig) {
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
    V1CoxEdgeCloudConfigSpec v1CoxEdgeCloudConfigSpec = (V1CoxEdgeCloudConfigSpec) o;
    return Objects.equals(this.cloudAccountRef, v1CoxEdgeCloudConfigSpec.cloudAccountRef) &&
        Objects.equals(this.clusterConfig, v1CoxEdgeCloudConfigSpec.clusterConfig) &&
        Objects.equals(this.machinePoolConfig, v1CoxEdgeCloudConfigSpec.machinePoolConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountRef, clusterConfig, machinePoolConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CoxEdgeCloudConfigSpec {\n");
    
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
