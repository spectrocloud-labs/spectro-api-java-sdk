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
import org.threeten.bp.OffsetDateTime;
/**
 * Workspace cluster restore state
 */
@Schema(description = "Workspace cluster restore state")


public class V1WorkspaceClusterRestoreState {
  @SerializedName("msg")
  private String msg = null;

  @SerializedName("restoreTime")
  private OffsetDateTime restoreTime = null;

  @SerializedName("state")
  private String state = null;

  public V1WorkspaceClusterRestoreState msg(String msg) {
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

  public V1WorkspaceClusterRestoreState restoreTime(OffsetDateTime restoreTime) {
    this.restoreTime = restoreTime;
    return this;
  }

   /**
   * Get restoreTime
   * @return restoreTime
  **/
  @Schema(description = "")
  public OffsetDateTime getRestoreTime() {
    return restoreTime;
  }

  public void setRestoreTime(OffsetDateTime restoreTime) {
    this.restoreTime = restoreTime;
  }

  public V1WorkspaceClusterRestoreState state(String state) {
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
    V1WorkspaceClusterRestoreState v1WorkspaceClusterRestoreState = (V1WorkspaceClusterRestoreState) o;
    return Objects.equals(this.msg, v1WorkspaceClusterRestoreState.msg) &&
        Objects.equals(this.restoreTime, v1WorkspaceClusterRestoreState.restoreTime) &&
        Objects.equals(this.state, v1WorkspaceClusterRestoreState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, restoreTime, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspaceClusterRestoreState {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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