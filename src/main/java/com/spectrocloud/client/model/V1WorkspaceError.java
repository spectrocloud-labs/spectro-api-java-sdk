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
 * Workspace error
 */
@Schema(description = "Workspace error")


public class V1WorkspaceError {
  @SerializedName("clusterUid")
  private String clusterUid = null;

  @SerializedName("msg")
  private String msg = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  public V1WorkspaceError clusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
    return this;
  }

   /**
   * Get clusterUid
   * @return clusterUid
  **/
  @Schema(description = "")
  public String getClusterUid() {
    return clusterUid;
  }

  public void setClusterUid(String clusterUid) {
    this.clusterUid = clusterUid;
  }

  public V1WorkspaceError msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @Schema(description = "")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public V1WorkspaceError name(String name) {
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

  public V1WorkspaceError resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceError v1WorkspaceError = (V1WorkspaceError) o;
    return Objects.equals(this.clusterUid, v1WorkspaceError.clusterUid) &&
        Objects.equals(this.msg, v1WorkspaceError.msg) &&
        Objects.equals(this.name, v1WorkspaceError.name) &&
        Objects.equals(this.resourceType, v1WorkspaceError.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterUid, msg, name, resourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceError {\n");
    
    sb.append("    clusterUid: ").append(toIndentedString(clusterUid)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
