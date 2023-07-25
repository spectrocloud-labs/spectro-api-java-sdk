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
import com.spectrocloud.client.model.V1ClusterWorkloadRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Cluster workload metadata
 */
@Schema(description = "Cluster workload metadata")


public class V1ClusterWorkloadMetadata {
  @SerializedName("creationTimestamp")
  private OffsetDateTime creationTimestamp = null;

  @SerializedName("entity")
  private V1ClusterWorkloadRef entity = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("namespace")
  private String namespace = null;

  public V1ClusterWorkloadMetadata creationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Get creationTimestamp
   * @return creationTimestamp
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public V1ClusterWorkloadMetadata entity(V1ClusterWorkloadRef entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @Schema(description = "")
  public V1ClusterWorkloadRef getEntity() {
    return entity;
  }

  public void setEntity(V1ClusterWorkloadRef entity) {
    this.entity = entity;
  }

  public V1ClusterWorkloadMetadata labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ClusterWorkloadMetadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ClusterWorkloadMetadata namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @Schema(description = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterWorkloadMetadata v1ClusterWorkloadMetadata = (V1ClusterWorkloadMetadata) o;
    return Objects.equals(this.creationTimestamp, v1ClusterWorkloadMetadata.creationTimestamp) &&
        Objects.equals(this.entity, v1ClusterWorkloadMetadata.entity) &&
        Objects.equals(this.labels, v1ClusterWorkloadMetadata.labels) &&
        Objects.equals(this.namespace, v1ClusterWorkloadMetadata.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTimestamp, entity, labels, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadMetadata {\n");
    
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
