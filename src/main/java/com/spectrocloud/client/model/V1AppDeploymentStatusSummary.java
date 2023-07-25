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
import com.spectrocloud.client.model.V1AppDeploymentClusterStatus;
import com.spectrocloud.client.model.V1AppDeploymentNotifications;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application deployment status summary
 */
@Schema(description = "Application deployment status summary")


public class V1AppDeploymentStatusSummary {
  @SerializedName("cluster")
  private V1AppDeploymentClusterStatus cluster = null;

  @SerializedName("notifications")
  private V1AppDeploymentNotifications notifications = null;

  @SerializedName("state")
  private String state = null;

  public V1AppDeploymentStatusSummary cluster(V1AppDeploymentClusterStatus cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public V1AppDeploymentClusterStatus getCluster() {
    return cluster;
  }

  public void setCluster(V1AppDeploymentClusterStatus cluster) {
    this.cluster = cluster;
  }

  public V1AppDeploymentStatusSummary notifications(V1AppDeploymentNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @Schema(description = "")
  public V1AppDeploymentNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(V1AppDeploymentNotifications notifications) {
    this.notifications = notifications;
  }

  public V1AppDeploymentStatusSummary state(String state) {
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
    V1AppDeploymentStatusSummary v1AppDeploymentStatusSummary = (V1AppDeploymentStatusSummary) o;
    return Objects.equals(this.cluster, v1AppDeploymentStatusSummary.cluster) &&
        Objects.equals(this.notifications, v1AppDeploymentStatusSummary.notifications) &&
        Objects.equals(this.state, v1AppDeploymentStatusSummary.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, notifications, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentStatusSummary {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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