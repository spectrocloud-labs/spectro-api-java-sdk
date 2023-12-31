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
import com.spectrocloud.client.model.V1AppDeploymentClusterGroupConfigEntity;
import com.spectrocloud.client.model.V1AppDeploymentProfileEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application deployment cluster group spec
 */
@Schema(description = "Application deployment cluster group spec")


public class V1AppDeploymentClusterGroupSpec {
  @SerializedName("config")
  private V1AppDeploymentClusterGroupConfigEntity config = null;

  @SerializedName("profile")
  private V1AppDeploymentProfileEntity profile = null;

  public V1AppDeploymentClusterGroupSpec config(V1AppDeploymentClusterGroupConfigEntity config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public V1AppDeploymentClusterGroupConfigEntity getConfig() {
    return config;
  }

  public void setConfig(V1AppDeploymentClusterGroupConfigEntity config) {
    this.config = config;
  }

  public V1AppDeploymentClusterGroupSpec profile(V1AppDeploymentProfileEntity profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @Schema(description = "")
  public V1AppDeploymentProfileEntity getProfile() {
    return profile;
  }

  public void setProfile(V1AppDeploymentProfileEntity profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppDeploymentClusterGroupSpec v1AppDeploymentClusterGroupSpec = (V1AppDeploymentClusterGroupSpec) o;
    return Objects.equals(this.config, v1AppDeploymentClusterGroupSpec.config) &&
        Objects.equals(this.profile, v1AppDeploymentClusterGroupSpec.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentClusterGroupSpec {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
