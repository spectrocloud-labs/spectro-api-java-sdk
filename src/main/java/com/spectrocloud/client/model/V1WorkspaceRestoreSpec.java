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
 * Workspace restore spec
 */
@Schema(description = "Workspace restore spec")


public class V1WorkspaceRestoreSpec {
  @SerializedName("workspaceUid")
  private String workspaceUid = null;

  public V1WorkspaceRestoreSpec workspaceUid(String workspaceUid) {
    this.workspaceUid = workspaceUid;
    return this;
  }

   /**
   * Get workspaceUid
   * @return workspaceUid
  **/
  @Schema(description = "")
  public String getWorkspaceUid() {
    return workspaceUid;
  }

  public void setWorkspaceUid(String workspaceUid) {
    this.workspaceUid = workspaceUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceRestoreSpec v1WorkspaceRestoreSpec = (V1WorkspaceRestoreSpec) o;
    return Objects.equals(this.workspaceUid, v1WorkspaceRestoreSpec.workspaceUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceRestoreSpec {\n");
    
    sb.append("    workspaceUid: ").append(toIndentedString(workspaceUid)).append("\n");
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
