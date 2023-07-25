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
import com.spectrocloud.client.model.V1ObjectMetaInputEntity;
import com.spectrocloud.client.model.V1SpectroAwsClusterImportEntitySpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Spectro GCP cluster import request payload
 */
@Schema(description = "Spectro GCP cluster import request payload")


public class V1SpectroGcpClusterImportEntity {
  @SerializedName("metadata")
  private V1ObjectMetaInputEntity metadata = null;

  @SerializedName("spec")
  private V1SpectroAwsClusterImportEntitySpec spec = null;

  public V1SpectroGcpClusterImportEntity metadata(V1ObjectMetaInputEntity metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1ObjectMetaInputEntity getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMetaInputEntity metadata) {
    this.metadata = metadata;
  }

  public V1SpectroGcpClusterImportEntity spec(V1SpectroAwsClusterImportEntitySpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1SpectroAwsClusterImportEntitySpec getSpec() {
    return spec;
  }

  public void setSpec(V1SpectroAwsClusterImportEntitySpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SpectroGcpClusterImportEntity v1SpectroGcpClusterImportEntity = (V1SpectroGcpClusterImportEntity) o;
    return Objects.equals(this.metadata, v1SpectroGcpClusterImportEntity.metadata) &&
        Objects.equals(this.spec, v1SpectroGcpClusterImportEntity.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroGcpClusterImportEntity {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
