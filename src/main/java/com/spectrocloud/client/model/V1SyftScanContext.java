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
 * Compliance Scan Syft Context
 */
@Schema(description = "Compliance Scan Syft Context")


public class V1SyftScanContext {
  @SerializedName("format")
  private String format = null;

  @SerializedName("labelSelector")
  private String labelSelector = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("podName")
  private String podName = null;

  @SerializedName("scope")
  private String scope = null;

  public V1SyftScanContext format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public V1SyftScanContext labelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @Schema(description = "")
  public String getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(String labelSelector) {
    this.labelSelector = labelSelector;
  }

  public V1SyftScanContext namespace(String namespace) {
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

  public V1SyftScanContext podName(String podName) {
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

  public V1SyftScanContext scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyftScanContext v1SyftScanContext = (V1SyftScanContext) o;
    return Objects.equals(this.format, v1SyftScanContext.format) &&
        Objects.equals(this.labelSelector, v1SyftScanContext.labelSelector) &&
        Objects.equals(this.namespace, v1SyftScanContext.namespace) &&
        Objects.equals(this.podName, v1SyftScanContext.podName) &&
        Objects.equals(this.scope, v1SyftScanContext.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, labelSelector, namespace, podName, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyftScanContext {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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