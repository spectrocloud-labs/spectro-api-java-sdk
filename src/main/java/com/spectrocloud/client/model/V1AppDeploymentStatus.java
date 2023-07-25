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
import com.spectrocloud.client.model.V1ClusterPackStatus;
import com.spectrocloud.client.model.V1LifecycleStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Application deployment status
 */
@Schema(description = "Application deployment status")


public class V1AppDeploymentStatus {
  @SerializedName("appTiers")
  private List<V1ClusterPackStatus> appTiers = null;

  @SerializedName("lifecycleStatus")
  private V1LifecycleStatus lifecycleStatus = null;

  @SerializedName("state")
  private String state = null;

  public V1AppDeploymentStatus appTiers(List<V1ClusterPackStatus> appTiers) {
    this.appTiers = appTiers;
    return this;
  }

  public V1AppDeploymentStatus addAppTiersItem(V1ClusterPackStatus appTiersItem) {
    if (this.appTiers == null) {
      this.appTiers = new ArrayList<V1ClusterPackStatus>();
    }
    this.appTiers.add(appTiersItem);
    return this;
  }

   /**
   * Application deployment tiers
   * @return appTiers
  **/
  @Schema(description = "Application deployment tiers")
  public List<V1ClusterPackStatus> getAppTiers() {
    return appTiers;
  }

  public void setAppTiers(List<V1ClusterPackStatus> appTiers) {
    this.appTiers = appTiers;
  }

  public V1AppDeploymentStatus lifecycleStatus(V1LifecycleStatus lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Get lifecycleStatus
   * @return lifecycleStatus
  **/
  @Schema(description = "")
  public V1LifecycleStatus getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(V1LifecycleStatus lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public V1AppDeploymentStatus state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Application deployment state [ \&quot;Pending\&quot;, \&quot;Deploying\&quot;, \&quot;Deployed\&quot;, \&quot;Updating\&quot; ]
   * @return state
  **/
  @Schema(description = "Application deployment state [ \"Pending\", \"Deploying\", \"Deployed\", \"Updating\" ]")
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
    V1AppDeploymentStatus v1AppDeploymentStatus = (V1AppDeploymentStatus) o;
    return Objects.equals(this.appTiers, v1AppDeploymentStatus.appTiers) &&
        Objects.equals(this.lifecycleStatus, v1AppDeploymentStatus.lifecycleStatus) &&
        Objects.equals(this.state, v1AppDeploymentStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appTiers, lifecycleStatus, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppDeploymentStatus {\n");
    
    sb.append("    appTiers: ").append(toIndentedString(appTiers)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
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
