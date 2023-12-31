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
import com.spectrocloud.client.model.V1FilterArray;
import com.spectrocloud.client.model.V1FilterString;
import com.spectrocloud.client.model.V1FilterVersionString;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application profile filter spec
 */
@Schema(description = "Application profile filter spec")


public class V1AppProfileFilterSpec {
  @SerializedName("profileName")
  private V1FilterString profileName = null;

  @SerializedName("tags")
  private V1FilterArray tags = null;

  @SerializedName("version")
  private V1FilterVersionString version = null;

  public V1AppProfileFilterSpec profileName(V1FilterString profileName) {
    this.profileName = profileName;
    return this;
  }

   /**
   * Get profileName
   * @return profileName
  **/
  @Schema(description = "")
  public V1FilterString getProfileName() {
    return profileName;
  }

  public void setProfileName(V1FilterString profileName) {
    this.profileName = profileName;
  }

  public V1AppProfileFilterSpec tags(V1FilterArray tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public V1FilterArray getTags() {
    return tags;
  }

  public void setTags(V1FilterArray tags) {
    this.tags = tags;
  }

  public V1AppProfileFilterSpec version(V1FilterVersionString version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public V1FilterVersionString getVersion() {
    return version;
  }

  public void setVersion(V1FilterVersionString version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppProfileFilterSpec v1AppProfileFilterSpec = (V1AppProfileFilterSpec) o;
    return Objects.equals(this.profileName, v1AppProfileFilterSpec.profileName) &&
        Objects.equals(this.tags, v1AppProfileFilterSpec.tags) &&
        Objects.equals(this.version, v1AppProfileFilterSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileName, tags, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppProfileFilterSpec {\n");
    
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
