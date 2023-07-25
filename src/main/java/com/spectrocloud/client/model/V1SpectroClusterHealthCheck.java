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
import com.spectrocloud.client.model.V1SpectroClusterHealthCheckSpec;
import com.spectrocloud.client.model.V1SpectroClusterHealthCheckStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1SpectroClusterHealthCheck
 */



public class V1SpectroClusterHealthCheck {
  @SerializedName("spec")
  private V1SpectroClusterHealthCheckSpec spec = null;

  @SerializedName("status")
  private V1SpectroClusterHealthCheckStatus status = null;

  public V1SpectroClusterHealthCheck spec(V1SpectroClusterHealthCheckSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1SpectroClusterHealthCheckSpec getSpec() {
    return spec;
  }

  public void setSpec(V1SpectroClusterHealthCheckSpec spec) {
    this.spec = spec;
  }

  public V1SpectroClusterHealthCheck status(V1SpectroClusterHealthCheckStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1SpectroClusterHealthCheckStatus getStatus() {
    return status;
  }

  public void setStatus(V1SpectroClusterHealthCheckStatus status) {
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
    V1SpectroClusterHealthCheck v1SpectroClusterHealthCheck = (V1SpectroClusterHealthCheck) o;
    return Objects.equals(this.spec, v1SpectroClusterHealthCheck.spec) &&
        Objects.equals(this.status, v1SpectroClusterHealthCheck.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterHealthCheck {\n");
    
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
