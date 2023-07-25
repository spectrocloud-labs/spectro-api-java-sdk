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
import com.spectrocloud.client.model.V1LifecycleStatus;
import com.spectrocloud.client.model.V1ObjectResReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1Virtual
 */



public class V1Virtual {
  @SerializedName("appDeployments")
  private List<V1ObjectResReference> appDeployments = null;

  @SerializedName("clusterGroup")
  private V1ObjectResReference clusterGroup = null;

  @SerializedName("hostCluster")
  private V1ObjectResReference hostCluster = null;

  @SerializedName("lifecycleStatus")
  private V1LifecycleStatus lifecycleStatus = null;

  @SerializedName("nestedClusters")
  private List<V1ObjectResReference> nestedClusters = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("virtualClusters")
  private List<V1ObjectResReference> virtualClusters = null;

  public V1Virtual appDeployments(List<V1ObjectResReference> appDeployments) {
    this.appDeployments = appDeployments;
    return this;
  }

  public V1Virtual addAppDeploymentsItem(V1ObjectResReference appDeploymentsItem) {
    if (this.appDeployments == null) {
      this.appDeployments = new ArrayList<V1ObjectResReference>();
    }
    this.appDeployments.add(appDeploymentsItem);
    return this;
  }

   /**
   * list of apps deployed on the virtual cluster
   * @return appDeployments
  **/
  @Schema(description = "list of apps deployed on the virtual cluster")
  public List<V1ObjectResReference> getAppDeployments() {
    return appDeployments;
  }

  public void setAppDeployments(List<V1ObjectResReference> appDeployments) {
    this.appDeployments = appDeployments;
  }

  public V1Virtual clusterGroup(V1ObjectResReference clusterGroup) {
    this.clusterGroup = clusterGroup;
    return this;
  }

   /**
   * Get clusterGroup
   * @return clusterGroup
  **/
  @Schema(description = "")
  public V1ObjectResReference getClusterGroup() {
    return clusterGroup;
  }

  public void setClusterGroup(V1ObjectResReference clusterGroup) {
    this.clusterGroup = clusterGroup;
  }

  public V1Virtual hostCluster(V1ObjectResReference hostCluster) {
    this.hostCluster = hostCluster;
    return this;
  }

   /**
   * Get hostCluster
   * @return hostCluster
  **/
  @Schema(description = "")
  public V1ObjectResReference getHostCluster() {
    return hostCluster;
  }

  public void setHostCluster(V1ObjectResReference hostCluster) {
    this.hostCluster = hostCluster;
  }

  public V1Virtual lifecycleStatus(V1LifecycleStatus lifecycleStatus) {
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

  public V1Virtual nestedClusters(List<V1ObjectResReference> nestedClusters) {
    this.nestedClusters = nestedClusters;
    return this;
  }

  public V1Virtual addNestedClustersItem(V1ObjectResReference nestedClustersItem) {
    if (this.nestedClusters == null) {
      this.nestedClusters = new ArrayList<V1ObjectResReference>();
    }
    this.nestedClusters.add(nestedClustersItem);
    return this;
  }

   /**
   * Deprecated. Use field &#x27;virtualClusters&#x27;
   * @return nestedClusters
  **/
  @Schema(description = "Deprecated. Use field 'virtualClusters'")
  public List<V1ObjectResReference> getNestedClusters() {
    return nestedClusters;
  }

  public void setNestedClusters(List<V1ObjectResReference> nestedClusters) {
    this.nestedClusters = nestedClusters;
  }

  public V1Virtual state(String state) {
    this.state = state;
    return this;
  }

   /**
   * cluster virtual host status
   * @return state
  **/
  @Schema(description = "cluster virtual host status")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public V1Virtual virtualClusters(List<V1ObjectResReference> virtualClusters) {
    this.virtualClusters = virtualClusters;
    return this;
  }

  public V1Virtual addVirtualClustersItem(V1ObjectResReference virtualClustersItem) {
    if (this.virtualClusters == null) {
      this.virtualClusters = new ArrayList<V1ObjectResReference>();
    }
    this.virtualClusters.add(virtualClustersItem);
    return this;
  }

   /**
   * list of virtual clusters deployed on the cluster
   * @return virtualClusters
  **/
  @Schema(description = "list of virtual clusters deployed on the cluster")
  public List<V1ObjectResReference> getVirtualClusters() {
    return virtualClusters;
  }

  public void setVirtualClusters(List<V1ObjectResReference> virtualClusters) {
    this.virtualClusters = virtualClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Virtual v1Virtual = (V1Virtual) o;
    return Objects.equals(this.appDeployments, v1Virtual.appDeployments) &&
        Objects.equals(this.clusterGroup, v1Virtual.clusterGroup) &&
        Objects.equals(this.hostCluster, v1Virtual.hostCluster) &&
        Objects.equals(this.lifecycleStatus, v1Virtual.lifecycleStatus) &&
        Objects.equals(this.nestedClusters, v1Virtual.nestedClusters) &&
        Objects.equals(this.state, v1Virtual.state) &&
        Objects.equals(this.virtualClusters, v1Virtual.virtualClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDeployments, clusterGroup, hostCluster, lifecycleStatus, nestedClusters, state, virtualClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Virtual {\n");
    
    sb.append("    appDeployments: ").append(toIndentedString(appDeployments)).append("\n");
    sb.append("    clusterGroup: ").append(toIndentedString(clusterGroup)).append("\n");
    sb.append("    hostCluster: ").append(toIndentedString(hostCluster)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    nestedClusters: ").append(toIndentedString(nestedClusters)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    virtualClusters: ").append(toIndentedString(virtualClusters)).append("\n");
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
