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
 * Cluster workload pod container state
 */
@Schema(description = "Cluster workload pod container state")


public class V1ClusterWorkloadPodContainerState {
  @SerializedName("exitCode")
  private Integer exitCode = null;

  @SerializedName("finishedAt")
  private OffsetDateTime finishedAt = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("startedAt")
  private OffsetDateTime startedAt = null;

  @SerializedName("state")
  private String state = null;

  public V1ClusterWorkloadPodContainerState exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

   /**
   * Get exitCode
   * @return exitCode
  **/
  @Schema(description = "")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public V1ClusterWorkloadPodContainerState finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public V1ClusterWorkloadPodContainerState reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1ClusterWorkloadPodContainerState startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public V1ClusterWorkloadPodContainerState state(String state) {
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
    V1ClusterWorkloadPodContainerState v1ClusterWorkloadPodContainerState = (V1ClusterWorkloadPodContainerState) o;
    return Objects.equals(this.exitCode, v1ClusterWorkloadPodContainerState.exitCode) &&
        Objects.equals(this.finishedAt, v1ClusterWorkloadPodContainerState.finishedAt) &&
        Objects.equals(this.reason, v1ClusterWorkloadPodContainerState.reason) &&
        Objects.equals(this.startedAt, v1ClusterWorkloadPodContainerState.startedAt) &&
        Objects.equals(this.state, v1ClusterWorkloadPodContainerState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exitCode, finishedAt, reason, startedAt, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadPodContainerState {\n");
    
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
