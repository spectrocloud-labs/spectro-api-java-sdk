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
import com.spectrocloud.client.model.V1ObjectMeta;
import com.spectrocloud.client.model.V1SpectroClusterSummarySpecSummary;
import com.spectrocloud.client.model.V1SpectroClusterSummaryStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Spectro cluster summary
 */
@Schema(description = "Spectro cluster summary")


public class V1SpectroClusterSummary {
  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("specSummary")
  private V1SpectroClusterSummarySpecSummary specSummary = null;

  @SerializedName("status")
  private V1SpectroClusterSummaryStatus status = null;

  public V1SpectroClusterSummary metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1SpectroClusterSummary specSummary(V1SpectroClusterSummarySpecSummary specSummary) {
    this.specSummary = specSummary;
    return this;
  }

   /**
   * Get specSummary
   * @return specSummary
  **/
  @Schema(description = "")
  public V1SpectroClusterSummarySpecSummary getSpecSummary() {
    return specSummary;
  }

  public void setSpecSummary(V1SpectroClusterSummarySpecSummary specSummary) {
    this.specSummary = specSummary;
  }

  public V1SpectroClusterSummary status(V1SpectroClusterSummaryStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1SpectroClusterSummaryStatus getStatus() {
    return status;
  }

  public void setStatus(V1SpectroClusterSummaryStatus status) {
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
    V1SpectroClusterSummary v1SpectroClusterSummary = (V1SpectroClusterSummary) o;
    return Objects.equals(this.metadata, v1SpectroClusterSummary.metadata) &&
        Objects.equals(this.specSummary, v1SpectroClusterSummary.specSummary) &&
        Objects.equals(this.status, v1SpectroClusterSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, specSummary, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterSummary {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    specSummary: ").append(toIndentedString(specSummary)).append("\n");
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
