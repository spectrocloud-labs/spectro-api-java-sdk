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
import com.spectrocloud.client.model.V1DashboardWorkspaceClusterRef;
import com.spectrocloud.client.model.V1DashboardWorkspaceQuota;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Workspace spec summary
 */
@Schema(description = "Workspace spec summary")


public class V1DashboardWorkspaceSpec {
  @SerializedName("clusterRefs")
  private List<V1DashboardWorkspaceClusterRef> clusterRefs = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("quota")
  private V1DashboardWorkspaceQuota quota = null;

  public V1DashboardWorkspaceSpec clusterRefs(List<V1DashboardWorkspaceClusterRef> clusterRefs) {
    this.clusterRefs = clusterRefs;
    return this;
  }

  public V1DashboardWorkspaceSpec addClusterRefsItem(V1DashboardWorkspaceClusterRef clusterRefsItem) {
    if (this.clusterRefs == null) {
      this.clusterRefs = new ArrayList<V1DashboardWorkspaceClusterRef>();
    }
    this.clusterRefs.add(clusterRefsItem);
    return this;
  }

   /**
   * Get clusterRefs
   * @return clusterRefs
  **/
  @Schema(description = "")
  public List<V1DashboardWorkspaceClusterRef> getClusterRefs() {
    return clusterRefs;
  }

  public void setClusterRefs(List<V1DashboardWorkspaceClusterRef> clusterRefs) {
    this.clusterRefs = clusterRefs;
  }

  public V1DashboardWorkspaceSpec namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1DashboardWorkspaceSpec addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @Schema(description = "")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public V1DashboardWorkspaceSpec quota(V1DashboardWorkspaceQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @Schema(description = "")
  public V1DashboardWorkspaceQuota getQuota() {
    return quota;
  }

  public void setQuota(V1DashboardWorkspaceQuota quota) {
    this.quota = quota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DashboardWorkspaceSpec v1DashboardWorkspaceSpec = (V1DashboardWorkspaceSpec) o;
    return Objects.equals(this.clusterRefs, v1DashboardWorkspaceSpec.clusterRefs) &&
        Objects.equals(this.namespaces, v1DashboardWorkspaceSpec.namespaces) &&
        Objects.equals(this.quota, v1DashboardWorkspaceSpec.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRefs, namespaces, quota);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DashboardWorkspaceSpec {\n");
    
    sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
