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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Generic cloud cluster config entity
 */
@Schema(description = "Generic cloud cluster config entity")


public class V1GenericCloudClusterConfigEntity {
  @SerializedName("clusterConfig")
  private V1GenericClusterConfig clusterConfig = null;

  public V1GenericCloudClusterConfigEntity clusterConfig(V1GenericClusterConfig clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1GenericClusterConfig getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1GenericClusterConfig clusterConfig) {
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
    V1GenericCloudClusterConfigEntity v1GenericCloudClusterConfigEntity = (V1GenericCloudClusterConfigEntity) o;
    return Objects.equals(this.clusterConfig, v1GenericCloudClusterConfigEntity.clusterConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GenericCloudClusterConfigEntity {\n");
    
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
