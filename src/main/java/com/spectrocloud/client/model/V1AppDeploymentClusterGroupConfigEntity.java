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
import com.spectrocloud.client.model.V1AppDeploymentClusterGroupTargetSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application deployment cluster group config
 */
@Schema(description = "Application deployment cluster group config")


public class V1AppDeploymentClusterGroupConfigEntity {
  @SerializedName("targetSpec")
  private V1AppDeploymentClusterGroupTargetSpec targetSpec = null;

  public V1AppDeploymentClusterGroupConfigEntity targetSpec(V1AppDeploymentClusterGroupTargetSpec targetSpec) {
    this.targetSpec = targetSpec;
    return this;
  }

   /**
   * Get targetSpec
   * @return targetSpec
  **/
  @Schema(description = "")
  public V1AppDeploymentClusterGroupTargetSpec getTargetSpec() {
    return targetSpec;
  }

  public void setTargetSpec(V1AppDeploymentClusterGroupTargetSpec targetSpec) {
    this.targetSpec = targetSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppDeploymentClusterGroupConfigEntity v1AppDeploymentClusterGroupConfigEntity = (V1AppDeploymentClusterGroupConfigEntity) o;
    return Objects.equals(this.targetSpec, v1AppDeploymentClusterGroupConfigEntity.targetSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentClusterGroupConfigEntity {\n");
    
    sb.append("    targetSpec: ").append(toIndentedString(targetSpec)).append("\n");
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
