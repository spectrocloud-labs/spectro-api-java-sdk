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
import com.spectrocloud.client.model.V1VirtualMachinePoolCloudConfigEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VirtualMachinePoolConfigEntity
 */



public class V1VirtualMachinePoolConfigEntity {
  @SerializedName("cloudConfig")
  private V1VirtualMachinePoolCloudConfigEntity cloudConfig = null;

  public V1VirtualMachinePoolConfigEntity cloudConfig(V1VirtualMachinePoolCloudConfigEntity cloudConfig) {
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Get cloudConfig
   * @return cloudConfig
  **/
  @Schema(required = true, description = "")
  public V1VirtualMachinePoolCloudConfigEntity getCloudConfig() {
    return cloudConfig;
  }

  public void setCloudConfig(V1VirtualMachinePoolCloudConfigEntity cloudConfig) {
    this.cloudConfig = cloudConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualMachinePoolConfigEntity v1VirtualMachinePoolConfigEntity = (V1VirtualMachinePoolConfigEntity) o;
    return Objects.equals(this.cloudConfig, v1VirtualMachinePoolConfigEntity.cloudConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualMachinePoolConfigEntity {\n");
    
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
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
