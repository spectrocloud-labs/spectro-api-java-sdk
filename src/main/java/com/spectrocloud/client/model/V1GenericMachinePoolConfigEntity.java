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
import com.spectrocloud.client.model.V1GenericClusterConfig;
import com.spectrocloud.client.model.V1MachinePoolConfigEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1GenericMachinePoolConfigEntity
 */



public class V1GenericMachinePoolConfigEntity {
  @SerializedName("cloudConfig")
  private V1GenericClusterConfig cloudConfig = null;

  @SerializedName("poolConfig")
  private V1MachinePoolConfigEntity poolConfig = null;

  public V1GenericMachinePoolConfigEntity cloudConfig(V1GenericClusterConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Get cloudConfig
   * @return cloudConfig
  **/
  @Schema(description = "")
  public V1GenericClusterConfig getCloudConfig() {
    return cloudConfig;
  }

  public void setCloudConfig(V1GenericClusterConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  public V1GenericMachinePoolConfigEntity poolConfig(V1MachinePoolConfigEntity poolConfig) {
    this.poolConfig = poolConfig;
    return this;
  }

   /**
   * Get poolConfig
   * @return poolConfig
  **/
  @Schema(description = "")
  public V1MachinePoolConfigEntity getPoolConfig() {
    return poolConfig;
  }

  public void setPoolConfig(V1MachinePoolConfigEntity poolConfig) {
    this.poolConfig = poolConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GenericMachinePoolConfigEntity v1GenericMachinePoolConfigEntity = (V1GenericMachinePoolConfigEntity) o;
    return Objects.equals(this.cloudConfig, v1GenericMachinePoolConfigEntity.cloudConfig) &&
        Objects.equals(this.poolConfig, v1GenericMachinePoolConfigEntity.poolConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudConfig, poolConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GenericMachinePoolConfigEntity {\n");
    
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
    sb.append("    poolConfig: ").append(toIndentedString(poolConfig)).append("\n");
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
