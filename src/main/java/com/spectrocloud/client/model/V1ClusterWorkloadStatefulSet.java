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
import com.spectrocloud.client.model.V1ClusterWorkloadMetadata;
import com.spectrocloud.client.model.V1ClusterWorkloadStatefulSetStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster workload statefulset summary
 */
@Schema(description = "Cluster workload statefulset summary")


public class V1ClusterWorkloadStatefulSet {
  @SerializedName("metadata")
  private V1ClusterWorkloadMetadata metadata = null;

  @SerializedName("status")
  private V1ClusterWorkloadStatefulSetStatus status = null;

  public V1ClusterWorkloadStatefulSet metadata(V1ClusterWorkloadMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1ClusterWorkloadMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ClusterWorkloadMetadata metadata) {
    this.metadata = metadata;
  }

  public V1ClusterWorkloadStatefulSet status(V1ClusterWorkloadStatefulSetStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1ClusterWorkloadStatefulSetStatus getStatus() {
    return status;
  }

  public void setStatus(V1ClusterWorkloadStatefulSetStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterWorkloadStatefulSet v1ClusterWorkloadStatefulSet = (V1ClusterWorkloadStatefulSet) o;
    return Objects.equals(this.metadata, v1ClusterWorkloadStatefulSet.metadata) &&
        Objects.equals(this.status, v1ClusterWorkloadStatefulSet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadStatefulSet {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
