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
import com.spectrocloud.client.model.V1Scope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster profile clone meta input entity
 */
@Schema(description = "Cluster profile clone meta input entity")


public class V1ClusterProfileCloneTarget {
  @SerializedName("projectUid")
  private String projectUid = null;

  @SerializedName("scope")
  private V1Scope scope = null;

  public V1ClusterProfileCloneTarget projectUid(String projectUid) {
    this.projectUid = projectUid;
    return this;
  }

   /**
   * Cloned cluster profile project uid
   * @return projectUid
  **/
  @Schema(description = "Cloned cluster profile project uid")
  public String getProjectUid() {
    return projectUid;
  }

  public void setProjectUid(String projectUid) {
    this.projectUid = projectUid;
  }

  public V1ClusterProfileCloneTarget scope(V1Scope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(required = true, description = "")
  public V1Scope getScope() {
    return scope;
  }

  public void setScope(V1Scope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfileCloneTarget v1ClusterProfileCloneTarget = (V1ClusterProfileCloneTarget) o;
    return Objects.equals(this.projectUid, v1ClusterProfileCloneTarget.projectUid) &&
        Objects.equals(this.scope, v1ClusterProfileCloneTarget.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectUid, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfileCloneTarget {\n");
    
    sb.append("    projectUid: ").append(toIndentedString(projectUid)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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