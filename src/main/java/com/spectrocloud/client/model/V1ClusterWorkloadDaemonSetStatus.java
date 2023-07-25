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
 * Cluster workload daemonset status
 */
@Schema(description = "Cluster workload daemonset status")


public class V1ClusterWorkloadDaemonSetStatus {
  @SerializedName("available")
  private Integer available = null;

  @SerializedName("currentScheduled")
  private Integer currentScheduled = null;

  @SerializedName("desiredScheduled")
  private Integer desiredScheduled = null;

  @SerializedName("misScheduled")
  private Integer misScheduled = null;

  @SerializedName("ready")
  private Integer ready = null;

  @SerializedName("updatedScheduled")
  private Integer updatedScheduled = null;

  public V1ClusterWorkloadDaemonSetStatus available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @Schema(description = "")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public V1ClusterWorkloadDaemonSetStatus currentScheduled(Integer currentScheduled) {
    this.currentScheduled = currentScheduled;
    return this;
  }

   /**
   * Get currentScheduled
   * @return currentScheduled
  **/
  @Schema(description = "")
  public Integer getCurrentScheduled() {
    return currentScheduled;
  }

  public void setCurrentScheduled(Integer currentScheduled) {
    this.currentScheduled = currentScheduled;
  }

  public V1ClusterWorkloadDaemonSetStatus desiredScheduled(Integer desiredScheduled) {
    this.desiredScheduled = desiredScheduled;
    return this;
  }

   /**
   * Get desiredScheduled
   * @return desiredScheduled
  **/
  @Schema(description = "")
  public Integer getDesiredScheduled() {
    return desiredScheduled;
  }

  public void setDesiredScheduled(Integer desiredScheduled) {
    this.desiredScheduled = desiredScheduled;
  }

  public V1ClusterWorkloadDaemonSetStatus misScheduled(Integer misScheduled) {
    this.misScheduled = misScheduled;
    return this;
  }

   /**
   * Get misScheduled
   * @return misScheduled
  **/
  @Schema(description = "")
  public Integer getMisScheduled() {
    return misScheduled;
  }

  public void setMisScheduled(Integer misScheduled) {
    this.misScheduled = misScheduled;
  }

  public V1ClusterWorkloadDaemonSetStatus ready(Integer ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Get ready
   * @return ready
  **/
  @Schema(description = "")
  public Integer getReady() {
    return ready;
  }

  public void setReady(Integer ready) {
    this.ready = ready;
  }

  public V1ClusterWorkloadDaemonSetStatus updatedScheduled(Integer updatedScheduled) {
    this.updatedScheduled = updatedScheduled;
    return this;
  }

   /**
   * Get updatedScheduled
   * @return updatedScheduled
  **/
  @Schema(description = "")
  public Integer getUpdatedScheduled() {
    return updatedScheduled;
  }

  public void setUpdatedScheduled(Integer updatedScheduled) {
    this.updatedScheduled = updatedScheduled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterWorkloadDaemonSetStatus v1ClusterWorkloadDaemonSetStatus = (V1ClusterWorkloadDaemonSetStatus) o;
    return Objects.equals(this.available, v1ClusterWorkloadDaemonSetStatus.available) &&
        Objects.equals(this.currentScheduled, v1ClusterWorkloadDaemonSetStatus.currentScheduled) &&
        Objects.equals(this.desiredScheduled, v1ClusterWorkloadDaemonSetStatus.desiredScheduled) &&
        Objects.equals(this.misScheduled, v1ClusterWorkloadDaemonSetStatus.misScheduled) &&
        Objects.equals(this.ready, v1ClusterWorkloadDaemonSetStatus.ready) &&
        Objects.equals(this.updatedScheduled, v1ClusterWorkloadDaemonSetStatus.updatedScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, currentScheduled, desiredScheduled, misScheduled, ready, updatedScheduled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadDaemonSetStatus {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    currentScheduled: ").append(toIndentedString(currentScheduled)).append("\n");
    sb.append("    desiredScheduled: ").append(toIndentedString(desiredScheduled)).append("\n");
    sb.append("    misScheduled: ").append(toIndentedString(misScheduled)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    updatedScheduled: ").append(toIndentedString(updatedScheduled)).append("\n");
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