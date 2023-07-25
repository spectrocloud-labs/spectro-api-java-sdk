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
import com.spectrocloud.client.model.V1ClusterMetaStatusCost;
import com.spectrocloud.client.model.V1ClusterMetaStatusHealth;
import com.spectrocloud.client.model.V1ClusterMetaStatusUpdates;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Spectro cluster meta status summary
 */
@Schema(description = "Spectro cluster meta status summary")


public class V1SpectroClusterMetaSummaryStatus {
  @SerializedName("cost")
  private V1ClusterMetaStatusCost cost = null;

  @SerializedName("health")
  private V1ClusterMetaStatusHealth health = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("updates")
  private V1ClusterMetaStatusUpdates updates = null;

  public V1SpectroClusterMetaSummaryStatus cost(V1ClusterMetaStatusCost cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @Schema(description = "")
  public V1ClusterMetaStatusCost getCost() {
    return cost;
  }

  public void setCost(V1ClusterMetaStatusCost cost) {
    this.cost = cost;
  }

  public V1SpectroClusterMetaSummaryStatus health(V1ClusterMetaStatusHealth health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @Schema(description = "")
  public V1ClusterMetaStatusHealth getHealth() {
    return health;
  }

  public void setHealth(V1ClusterMetaStatusHealth health) {
    this.health = health;
  }

  public V1SpectroClusterMetaSummaryStatus state(String state) {
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

  public V1SpectroClusterMetaSummaryStatus updates(V1ClusterMetaStatusUpdates updates) {
    this.updates = updates;
    return this;
  }

   /**
   * Get updates
   * @return updates
  **/
  @Schema(description = "")
  public V1ClusterMetaStatusUpdates getUpdates() {
    return updates;
  }

  public void setUpdates(V1ClusterMetaStatusUpdates updates) {
    this.updates = updates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterMetaSummaryStatus v1SpectroClusterMetaSummaryStatus = (V1SpectroClusterMetaSummaryStatus) o;
    return Objects.equals(this.cost, v1SpectroClusterMetaSummaryStatus.cost) &&
        Objects.equals(this.health, v1SpectroClusterMetaSummaryStatus.health) &&
        Objects.equals(this.state, v1SpectroClusterMetaSummaryStatus.state) &&
        Objects.equals(this.updates, v1SpectroClusterMetaSummaryStatus.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, health, state, updates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterMetaSummaryStatus {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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