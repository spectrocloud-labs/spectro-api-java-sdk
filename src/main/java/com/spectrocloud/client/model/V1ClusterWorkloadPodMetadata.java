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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Cluster workload pod metadata
 */
@Schema(description = "Cluster workload pod metadata")


public class V1ClusterWorkloadPodMetadata {
  @SerializedName("associatedRefs")
  private List<V1ClusterWorkloadRef> associatedRefs = null;

  @SerializedName("creationTimestamp")
  private OffsetDateTime creationTimestamp = null;

  @SerializedName("entity")
  private V1ClusterWorkloadRef entity = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("machineUid")
  private String machineUid = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("nodename")
  private String nodename = null;

  public V1ClusterWorkloadPodMetadata associatedRefs(List<V1ClusterWorkloadRef> associatedRefs) {
    this.associatedRefs = associatedRefs;
    return this;
  }

  public V1ClusterWorkloadPodMetadata addAssociatedRefsItem(V1ClusterWorkloadRef associatedRefsItem) {
    if (this.associatedRefs == null) {
      this.associatedRefs = new ArrayList<V1ClusterWorkloadRef>();
    }
    this.associatedRefs.add(associatedRefsItem);
    return this;
  }

   /**
   * Get associatedRefs
   * @return associatedRefs
  **/
  @Schema(description = "")
  public List<V1ClusterWorkloadRef> getAssociatedRefs() {
    return associatedRefs;
  }

  public void setAssociatedRefs(List<V1ClusterWorkloadRef> associatedRefs) {
    this.associatedRefs = associatedRefs;
  }

  public V1ClusterWorkloadPodMetadata creationTimestamp(OffsetDateTime creationTimestamp) {
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

  public V1ClusterWorkloadPodMetadata entity(V1ClusterWorkloadRef entity) {
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

  public V1ClusterWorkloadPodMetadata labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ClusterWorkloadPodMetadata putLabelsItem(String key, String labelsItem) {
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

  public V1ClusterWorkloadPodMetadata machineUid(String machineUid) {
    this.machineUid = machineUid;
    return this;
  }

   /**
   * Get machineUid
   * @return machineUid
  **/
  @Schema(description = "")
  public String getMachineUid() {
    return machineUid;
  }

  public void setMachineUid(String machineUid) {
    this.machineUid = machineUid;
  }

  public V1ClusterWorkloadPodMetadata namespace(String namespace) {
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

  public V1ClusterWorkloadPodMetadata nodename(String nodename) {
    this.nodename = nodename;
    return this;
  }

   /**
   * Get nodename
   * @return nodename
  **/
  @Schema(description = "")
  public String getNodename() {
    return nodename;
  }

  public void setNodename(String nodename) {
    this.nodename = nodename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterWorkloadPodMetadata v1ClusterWorkloadPodMetadata = (V1ClusterWorkloadPodMetadata) o;
    return Objects.equals(this.associatedRefs, v1ClusterWorkloadPodMetadata.associatedRefs) &&
        Objects.equals(this.creationTimestamp, v1ClusterWorkloadPodMetadata.creationTimestamp) &&
        Objects.equals(this.entity, v1ClusterWorkloadPodMetadata.entity) &&
        Objects.equals(this.labels, v1ClusterWorkloadPodMetadata.labels) &&
        Objects.equals(this.machineUid, v1ClusterWorkloadPodMetadata.machineUid) &&
        Objects.equals(this.namespace, v1ClusterWorkloadPodMetadata.namespace) &&
        Objects.equals(this.nodename, v1ClusterWorkloadPodMetadata.nodename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedRefs, creationTimestamp, entity, labels, machineUid, namespace, nodename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadPodMetadata {\n");
    
    sb.append("    associatedRefs: ").append(toIndentedString(associatedRefs)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    machineUid: ").append(toIndentedString(machineUid)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodename: ").append(toIndentedString(nodename)).append("\n");
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