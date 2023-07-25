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
import com.spectrocloud.client.model.V1CloudAccountMeta;
import com.spectrocloud.client.model.V1CloudConfigMeta;
import com.spectrocloud.client.model.V1ClusterConfigResponse;
import com.spectrocloud.client.model.V1ClusterProfileTemplateMeta;
import com.spectrocloud.client.model.V1ProjectMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Spectro cluster spec summary
 */
@Schema(description = "Spectro cluster spec summary")


public class V1SpectroClusterSummarySpecSummary {
  @SerializedName("cloudAccountMeta")
  private V1CloudAccountMeta cloudAccountMeta = null;

  @SerializedName("cloudConfig")
  private V1CloudConfigMeta cloudConfig = null;

  @SerializedName("clusterConfig")
  private V1ClusterConfigResponse clusterConfig = null;

  @SerializedName("clusterProfileTemplate")
  private V1ClusterProfileTemplateMeta clusterProfileTemplate = null;

  @SerializedName("clusterProfileTemplates")
  private List<V1ClusterProfileTemplateMeta> clusterProfileTemplates = null;

  @SerializedName("projectMeta")
  private V1ProjectMeta projectMeta = null;

  public V1SpectroClusterSummarySpecSummary cloudAccountMeta(V1CloudAccountMeta cloudAccountMeta) {
    this.cloudAccountMeta = cloudAccountMeta;
    return this;
  }

   /**
   * Get cloudAccountMeta
   * @return cloudAccountMeta
  **/
  @Schema(description = "")
  public V1CloudAccountMeta getCloudAccountMeta() {
    return cloudAccountMeta;
  }

  public void setCloudAccountMeta(V1CloudAccountMeta cloudAccountMeta) {
    this.cloudAccountMeta = cloudAccountMeta;
  }

  public V1SpectroClusterSummarySpecSummary cloudConfig(V1CloudConfigMeta cloudConfig) {
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Get cloudConfig
   * @return cloudConfig
  **/
  @Schema(description = "")
  public V1CloudConfigMeta getCloudConfig() {
    return cloudConfig;
  }

  public void setCloudConfig(V1CloudConfigMeta cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  public V1SpectroClusterSummarySpecSummary clusterConfig(V1ClusterConfigResponse clusterConfig) {
    this.clusterConfig = clusterConfig;
    return this;
  }

   /**
   * Get clusterConfig
   * @return clusterConfig
  **/
  @Schema(description = "")
  public V1ClusterConfigResponse getClusterConfig() {
    return clusterConfig;
  }

  public void setClusterConfig(V1ClusterConfigResponse clusterConfig) {
    this.clusterConfig = clusterConfig;
  }

  public V1SpectroClusterSummarySpecSummary clusterProfileTemplate(V1ClusterProfileTemplateMeta clusterProfileTemplate) {
    this.clusterProfileTemplate = clusterProfileTemplate;
    return this;
  }

   /**
   * Get clusterProfileTemplate
   * @return clusterProfileTemplate
  **/
  @Schema(description = "")
  public V1ClusterProfileTemplateMeta getClusterProfileTemplate() {
    return clusterProfileTemplate;
  }

  public void setClusterProfileTemplate(V1ClusterProfileTemplateMeta clusterProfileTemplate) {
    this.clusterProfileTemplate = clusterProfileTemplate;
  }

  public V1SpectroClusterSummarySpecSummary clusterProfileTemplates(List<V1ClusterProfileTemplateMeta> clusterProfileTemplates) {
    this.clusterProfileTemplates = clusterProfileTemplates;
    return this;
  }

  public V1SpectroClusterSummarySpecSummary addClusterProfileTemplatesItem(V1ClusterProfileTemplateMeta clusterProfileTemplatesItem) {
    if (this.clusterProfileTemplates == null) {
      this.clusterProfileTemplates = new ArrayList<V1ClusterProfileTemplateMeta>();
    }
    this.clusterProfileTemplates.add(clusterProfileTemplatesItem);
    return this;
  }

   /**
   * Get clusterProfileTemplates
   * @return clusterProfileTemplates
  **/
  @Schema(description = "")
  public List<V1ClusterProfileTemplateMeta> getClusterProfileTemplates() {
    return clusterProfileTemplates;
  }

  public void setClusterProfileTemplates(List<V1ClusterProfileTemplateMeta> clusterProfileTemplates) {
    this.clusterProfileTemplates = clusterProfileTemplates;
  }

  public V1SpectroClusterSummarySpecSummary projectMeta(V1ProjectMeta projectMeta) {
    this.projectMeta = projectMeta;
    return this;
  }

   /**
   * Get projectMeta
   * @return projectMeta
  **/
  @Schema(description = "")
  public V1ProjectMeta getProjectMeta() {
    return projectMeta;
  }

  public void setProjectMeta(V1ProjectMeta projectMeta) {
    this.projectMeta = projectMeta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroClusterSummarySpecSummary v1SpectroClusterSummarySpecSummary = (V1SpectroClusterSummarySpecSummary) o;
    return Objects.equals(this.cloudAccountMeta, v1SpectroClusterSummarySpecSummary.cloudAccountMeta) &&
        Objects.equals(this.cloudConfig, v1SpectroClusterSummarySpecSummary.cloudConfig) &&
        Objects.equals(this.clusterConfig, v1SpectroClusterSummarySpecSummary.clusterConfig) &&
        Objects.equals(this.clusterProfileTemplate, v1SpectroClusterSummarySpecSummary.clusterProfileTemplate) &&
        Objects.equals(this.clusterProfileTemplates, v1SpectroClusterSummarySpecSummary.clusterProfileTemplates) &&
        Objects.equals(this.projectMeta, v1SpectroClusterSummarySpecSummary.projectMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountMeta, cloudConfig, clusterConfig, clusterProfileTemplate, clusterProfileTemplates, projectMeta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterSummarySpecSummary {\n");
    
    sb.append("    cloudAccountMeta: ").append(toIndentedString(cloudAccountMeta)).append("\n");
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
    sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
    sb.append("    clusterProfileTemplate: ").append(toIndentedString(clusterProfileTemplate)).append("\n");
    sb.append("    clusterProfileTemplates: ").append(toIndentedString(clusterProfileTemplates)).append("\n");
    sb.append("    projectMeta: ").append(toIndentedString(projectMeta)).append("\n");
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