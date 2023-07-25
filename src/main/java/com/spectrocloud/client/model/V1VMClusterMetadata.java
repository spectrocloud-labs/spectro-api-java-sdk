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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VMClusterMetadata
 */



public class V1VMClusterMetadata {
  @SerializedName("name")
  private String name = null;

  @SerializedName("projectUid")
  private String projectUid = null;

  @SerializedName("uid")
  private String uid = null;

  public V1VMClusterMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VMClusterMetadata projectUid(String projectUid) {
    this.projectUid = projectUid;
    return this;
  }

   /**
   * Get projectUid
   * @return projectUid
  **/
  @Schema(description = "")
  public String getProjectUid() {
    return projectUid;
  }

  public void setProjectUid(String projectUid) {
    this.projectUid = projectUid;
  }

  public V1VMClusterMetadata uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VMClusterMetadata v1VMClusterMetadata = (V1VMClusterMetadata) o;
    return Objects.equals(this.name, v1VMClusterMetadata.name) &&
        Objects.equals(this.projectUid, v1VMClusterMetadata.projectUid) &&
        Objects.equals(this.uid, v1VMClusterMetadata.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectUid, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VMClusterMetadata {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectUid: ").append(toIndentedString(projectUid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
