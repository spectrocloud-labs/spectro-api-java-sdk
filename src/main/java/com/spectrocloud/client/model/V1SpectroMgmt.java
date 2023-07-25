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
import com.spectrocloud.client.model.V1SpectroMgmtSpec;
import com.spectrocloud.client.model.V1SpectroMgmtStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Spectro management data
 */
@Schema(description = "Spectro management data")


public class V1SpectroMgmt {
  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1SpectroMgmtSpec spec = null;

  @SerializedName("status")
  private V1SpectroMgmtStatus status = null;

  public V1SpectroMgmt metadata(V1ObjectMeta metadata) {
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

  public V1SpectroMgmt spec(V1SpectroMgmtSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1SpectroMgmtSpec getSpec() {
    return spec;
  }

  public void setSpec(V1SpectroMgmtSpec spec) {
    this.spec = spec;
  }

  public V1SpectroMgmt status(V1SpectroMgmtStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1SpectroMgmtStatus getStatus() {
    return status;
  }

  public void setStatus(V1SpectroMgmtStatus status) {
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
    V1SpectroMgmt v1SpectroMgmt = (V1SpectroMgmt) o;
    return Objects.equals(this.metadata, v1SpectroMgmt.metadata) &&
        Objects.equals(this.spec, v1SpectroMgmt.spec) &&
        Objects.equals(this.status, v1SpectroMgmt.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroMgmt {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
