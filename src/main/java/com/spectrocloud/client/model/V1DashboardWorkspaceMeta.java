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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Deprecated. Workspace meta data
 */
@Schema(description = "Deprecated. Workspace meta data")


public class V1DashboardWorkspaceMeta {
  @SerializedName("clusterNames")
  private List<String> clusterNames = null;

  @SerializedName("clusterRefs")
  private List<V1DashboardWorkspaceClusterRef> clusterRefs = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("uid")
  private String uid = null;

  public V1DashboardWorkspaceMeta clusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
    return this;
  }

  public V1DashboardWorkspaceMeta addClusterNamesItem(String clusterNamesItem) {
    if (this.clusterNames == null) {
      this.clusterNames = new ArrayList<String>();
    }
    this.clusterNames.add(clusterNamesItem);
    return this;
  }

   /**
   * Deprecated. Use clusterRefs
   * @return clusterNames
  **/
  @Schema(description = "Deprecated. Use clusterRefs")
  public List<String> getClusterNames() {
    return clusterNames;
  }

  public void setClusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
  }

  public V1DashboardWorkspaceMeta clusterRefs(List<V1DashboardWorkspaceClusterRef> clusterRefs) {
    this.clusterRefs = clusterRefs;
    return this;
  }

  public V1DashboardWorkspaceMeta addClusterRefsItem(V1DashboardWorkspaceClusterRef clusterRefsItem) {
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

  public V1DashboardWorkspaceMeta creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public V1DashboardWorkspaceMeta name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1DashboardWorkspaceMeta namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1DashboardWorkspaceMeta addNamespacesItem(String namespacesItem) {
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

  public V1DashboardWorkspaceMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1DashboardWorkspaceMeta v1DashboardWorkspaceMeta = (V1DashboardWorkspaceMeta) o;
    return Objects.equals(this.clusterNames, v1DashboardWorkspaceMeta.clusterNames) &&
        Objects.equals(this.clusterRefs, v1DashboardWorkspaceMeta.clusterRefs) &&
        Objects.equals(this.creationTime, v1DashboardWorkspaceMeta.creationTime) &&
        Objects.equals(this.name, v1DashboardWorkspaceMeta.name) &&
        Objects.equals(this.namespaces, v1DashboardWorkspaceMeta.namespaces) &&
        Objects.equals(this.uid, v1DashboardWorkspaceMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterNames, clusterRefs, creationTime, name, namespaces, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DashboardWorkspaceMeta {\n");
    
    sb.append("    clusterNames: ").append(toIndentedString(clusterNames)).append("\n");
    sb.append("    clusterRefs: ").append(toIndentedString(clusterRefs)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
