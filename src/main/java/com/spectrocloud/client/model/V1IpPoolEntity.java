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
import com.spectrocloud.client.model.V1IpPoolEntitySpec;
import com.spectrocloud.client.model.V1IpPoolStatus;
import com.spectrocloud.client.model.V1ObjectMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * IP Pool entity definition
 */
@Schema(description = "IP Pool entity definition")


public class V1IpPoolEntity {
  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1IpPoolEntitySpec spec = null;

  @SerializedName("status")
  private V1IpPoolStatus status = null;

  public V1IpPoolEntity metadata(V1ObjectMeta metadata) {
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

  public V1IpPoolEntity spec(V1IpPoolEntitySpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1IpPoolEntitySpec getSpec() {
    return spec;
  }

  public void setSpec(V1IpPoolEntitySpec spec) {
    this.spec = spec;
  }

  public V1IpPoolEntity status(V1IpPoolStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1IpPoolStatus getStatus() {
    return status;
  }

  public void setStatus(V1IpPoolStatus status) {
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
    V1IpPoolEntity v1IpPoolEntity = (V1IpPoolEntity) o;
    return Objects.equals(this.metadata, v1IpPoolEntity.metadata) &&
        Objects.equals(this.spec, v1IpPoolEntity.spec) &&
        Objects.equals(this.status, v1IpPoolEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IpPoolEntity {\n");
    
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
