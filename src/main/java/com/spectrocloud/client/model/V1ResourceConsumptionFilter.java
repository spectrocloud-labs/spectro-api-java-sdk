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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Resource consumption filter
 */
@Schema(description = "Resource consumption filter")


public class V1ResourceConsumptionFilter {
  @SerializedName("clouds")
  private List<String> clouds = null;

  @SerializedName("clusters")
  private List<String> clusters = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("includeMasterMachines")
  private Boolean includeMasterMachines = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("projects")
  private List<String> projects = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("workspaces")
  private List<String> workspaces = null;

  public V1ResourceConsumptionFilter clouds(List<String> clouds) {
    this.clouds = clouds;
    return this;
  }

  public V1ResourceConsumptionFilter addCloudsItem(String cloudsItem) {
    if (this.clouds == null) {
      this.clouds = new ArrayList<String>();
    }
    this.clouds.add(cloudsItem);
    return this;
  }

   /**
   * Get clouds
   * @return clouds
  **/
  @Schema(description = "")
  public List<String> getClouds() {
    return clouds;
  }

  public void setClouds(List<String> clouds) {
    this.clouds = clouds;
  }

  public V1ResourceConsumptionFilter clusters(List<String> clusters) {
    this.clusters = clusters;
    return this;
  }

  public V1ResourceConsumptionFilter addClustersItem(String clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<String>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @Schema(description = "")
  public List<String> getClusters() {
    return clusters;
  }

  public void setClusters(List<String> clusters) {
    this.clusters = clusters;
  }

  public V1ResourceConsumptionFilter endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public V1ResourceConsumptionFilter includeMasterMachines(Boolean includeMasterMachines) {
    this.includeMasterMachines = includeMasterMachines;
    return this;
  }

   /**
   * Get includeMasterMachines
   * @return includeMasterMachines
  **/
  @Schema(description = "")
  public Boolean isIncludeMasterMachines() {
    return includeMasterMachines;
  }

  public void setIncludeMasterMachines(Boolean includeMasterMachines) {
    this.includeMasterMachines = includeMasterMachines;
  }

  public V1ResourceConsumptionFilter namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1ResourceConsumptionFilter addNamespacesItem(String namespacesItem) {
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

  public V1ResourceConsumptionFilter projects(List<String> projects) {
    this.projects = projects;
    return this;
  }

  public V1ResourceConsumptionFilter addProjectsItem(String projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<String>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @Schema(description = "")
  public List<String> getProjects() {
    return projects;
  }

  public void setProjects(List<String> projects) {
    this.projects = projects;
  }

  public V1ResourceConsumptionFilter startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public V1ResourceConsumptionFilter workspaces(List<String> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  public V1ResourceConsumptionFilter addWorkspacesItem(String workspacesItem) {
    if (this.workspaces == null) {
      this.workspaces = new ArrayList<String>();
    }
    this.workspaces.add(workspacesItem);
    return this;
  }

   /**
   * Get workspaces
   * @return workspaces
  **/
  @Schema(description = "")
  public List<String> getWorkspaces() {
    return workspaces;
  }

  public void setWorkspaces(List<String> workspaces) {
    this.workspaces = workspaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceConsumptionFilter v1ResourceConsumptionFilter = (V1ResourceConsumptionFilter) o;
    return Objects.equals(this.clouds, v1ResourceConsumptionFilter.clouds) &&
        Objects.equals(this.clusters, v1ResourceConsumptionFilter.clusters) &&
        Objects.equals(this.endTime, v1ResourceConsumptionFilter.endTime) &&
        Objects.equals(this.includeMasterMachines, v1ResourceConsumptionFilter.includeMasterMachines) &&
        Objects.equals(this.namespaces, v1ResourceConsumptionFilter.namespaces) &&
        Objects.equals(this.projects, v1ResourceConsumptionFilter.projects) &&
        Objects.equals(this.startTime, v1ResourceConsumptionFilter.startTime) &&
        Objects.equals(this.workspaces, v1ResourceConsumptionFilter.workspaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clouds, clusters, endTime, includeMasterMachines, namespaces, projects, startTime, workspaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceConsumptionFilter {\n");
    
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    includeMasterMachines: ").append(toIndentedString(includeMasterMachines)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
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
