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
/**
 * Compliance Scan Syft Image Context
 */
@Schema(description = "Compliance Scan Syft Image Context")


public class V1SyftImageContext {
  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("podName")
  private String podName = null;

  public V1SyftImageContext containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Get containerName
   * @return containerName
  **/
  @Schema(description = "")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public V1SyftImageContext namespace(String namespace) {
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

  public V1SyftImageContext podName(String podName) {
    this.podName = podName;
    return this;
  }

   /**
   * Get podName
   * @return podName
  **/
  @Schema(description = "")
  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyftImageContext v1SyftImageContext = (V1SyftImageContext) o;
    return Objects.equals(this.containerName, v1SyftImageContext.containerName) &&
        Objects.equals(this.namespace, v1SyftImageContext.namespace) &&
        Objects.equals(this.podName, v1SyftImageContext.podName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, namespace, podName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyftImageContext {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
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
