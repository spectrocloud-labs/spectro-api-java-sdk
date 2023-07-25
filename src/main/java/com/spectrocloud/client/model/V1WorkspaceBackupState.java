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
 * Workspace backup state
 */
@Schema(description = "Workspace backup state")


public class V1WorkspaceBackupState {
  @SerializedName("deleteState")
  private String deleteState = null;

  @SerializedName("state")
  private String state = null;

  public V1WorkspaceBackupState deleteState(String deleteState) {
    this.deleteState = deleteState;
    return this;
  }

   /**
   * Get deleteState
   * @return deleteState
  **/
  @Schema(description = "")
  public String getDeleteState() {
    return deleteState;
  }

  public void setDeleteState(String deleteState) {
    this.deleteState = deleteState;
  }

  public V1WorkspaceBackupState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WorkspaceBackupState v1WorkspaceBackupState = (V1WorkspaceBackupState) o;
    return Objects.equals(this.deleteState, v1WorkspaceBackupState.deleteState) &&
        Objects.equals(this.state, v1WorkspaceBackupState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteState, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceBackupState {\n");
    
    sb.append("    deleteState: ").append(toIndentedString(deleteState)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
