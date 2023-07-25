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
import com.spectrocloud.client.model.V1HostClusterConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1HostClusterConfigEntity
 */



public class V1HostClusterConfigEntity {
  @SerializedName("hostClusterConfig")
  private V1HostClusterConfig hostClusterConfig = null;

  public V1HostClusterConfigEntity hostClusterConfig(V1HostClusterConfig hostClusterConfig) {
    this.hostClusterConfig = hostClusterConfig;
    return this;
  }

   /**
   * Get hostClusterConfig
   * @return hostClusterConfig
  **/
  @Schema(description = "")
  public V1HostClusterConfig getHostClusterConfig() {
    return hostClusterConfig;
  }

  public void setHostClusterConfig(V1HostClusterConfig hostClusterConfig) {
    this.hostClusterConfig = hostClusterConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostClusterConfigEntity v1HostClusterConfigEntity = (V1HostClusterConfigEntity) o;
    return Objects.equals(this.hostClusterConfig, v1HostClusterConfigEntity.hostClusterConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostClusterConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostClusterConfigEntity {\n");
    
    sb.append("    hostClusterConfig: ").append(toIndentedString(hostClusterConfig)).append("\n");
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
