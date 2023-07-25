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
import com.spectrocloud.client.model.V1EksClusterConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EKS cloud cluster config entity
 */
@Schema(description = "EKS cloud cluster config entity")


public class V1EksCloudClusterConfigEntity {
  @SerializedName("clusterConfig")
  private V1EksClusterConfig clusterConfig = null;

  public V1EksCloudClusterConfigEntity clusterConfig(V1EksClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1EksClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1EksClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EksCloudClusterConfigEntity v1EksCloudClusterConfigEntity = (V1EksCloudClusterConfigEntity) o;
    return Objects.equals(this.clusterConfig, v1EksCloudClusterConfigEntity.clusterConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EksCloudClusterConfigEntity {\n");
    
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
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
