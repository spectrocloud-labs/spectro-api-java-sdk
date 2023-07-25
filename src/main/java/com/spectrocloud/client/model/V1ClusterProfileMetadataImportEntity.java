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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Cluster profile import metadata
 */
@Schema(description = "Cluster profile import metadata")


public class V1ClusterProfileMetadataImportEntity {
  @SerializedName("description")
  private String description = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("name")
  private String name = null;

  public V1ClusterProfileMetadataImportEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Cluster profile description
   * @return description
  **/
  @Schema(description = "Cluster profile description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1ClusterProfileMetadataImportEntity labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ClusterProfileMetadataImportEntity putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Cluster profile labels
   * @return labels
  **/
  @Schema(description = "Cluster profile labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ClusterProfileMetadataImportEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster profile name
   * @return name
  **/
  @Schema(description = "Cluster profile name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfileMetadataImportEntity v1ClusterProfileMetadataImportEntity = (V1ClusterProfileMetadataImportEntity) o;
    return Objects.equals(this.description, v1ClusterProfileMetadataImportEntity.description) &&
        Objects.equals(this.labels, v1ClusterProfileMetadataImportEntity.labels) &&
        Objects.equals(this.name, v1ClusterProfileMetadataImportEntity.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, labels, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfileMetadataImportEntity {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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