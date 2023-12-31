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
import com.spectrocloud.client.model.V1EdgeClusterConfig;
import com.spectrocloud.client.model.V1EdgeMachinePoolConfigEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Edge cluster request payload for estimating rate
 */
@Schema(description = "Edge cluster request payload for estimating rate")


public class V1SpectroEdgeClusterRateEntity {
  @SerializedName("cloudConfig")
  private V1EdgeClusterConfig cloudConfig = null;

  @SerializedName("machinepoolconfig")
  private List<V1EdgeMachinePoolConfigEntity> machinepoolconfig = null;

  public V1SpectroEdgeClusterRateEntity cloudConfig(V1EdgeClusterConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Get cloudConfig
   * @return cloudConfig
  **/
  @Schema(description = "")
  public V1EdgeClusterConfig getCloudConfig() {
    return cloudConfig;
  }

  public void setCloudConfig(V1EdgeClusterConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  public V1SpectroEdgeClusterRateEntity machinepoolconfig(List<V1EdgeMachinePoolConfigEntity> machinepoolconfig) {
    this.machinepoolconfig = machinepoolconfig;
    return this;
  }

  public V1SpectroEdgeClusterRateEntity addMachinepoolconfigItem(V1EdgeMachinePoolConfigEntity machinepoolconfigItem) {
    if (this.machinepoolconfig == null) {
      this.machinepoolconfig = new ArrayList<V1EdgeMachinePoolConfigEntity>();
    }
    this.machinepoolconfig.add(machinepoolconfigItem);
    return this;
  }

   /**
   * Get machinepoolconfig
   * @return machinepoolconfig
  **/
  @Schema(description = "")
  public List<V1EdgeMachinePoolConfigEntity> getMachinepoolconfig() {
    return machinepoolconfig;
  }

  public void setMachinepoolconfig(List<V1EdgeMachinePoolConfigEntity> machinepoolconfig) {
    this.machinepoolconfig = machinepoolconfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroEdgeClusterRateEntity v1SpectroEdgeClusterRateEntity = (V1SpectroEdgeClusterRateEntity) o;
    return Objects.equals(this.cloudConfig, v1SpectroEdgeClusterRateEntity.cloudConfig) &&
        Objects.equals(this.machinepoolconfig, v1SpectroEdgeClusterRateEntity.machinepoolconfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudConfig, machinepoolconfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroEdgeClusterRateEntity {\n");
    
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
    sb.append("    machinepoolconfig: ").append(toIndentedString(machinepoolconfig)).append("\n");
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
