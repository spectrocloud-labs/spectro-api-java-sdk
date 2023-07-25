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
import com.spectrocloud.client.model.V1ClusterNamespaceResourceAllocation;
import com.spectrocloud.client.model.V1RelatedObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster namespace spec
 */
@Schema(description = "Cluster namespace spec")


public class V1ClusterNamespaceSpec {
  @SerializedName("isRegex")
  private Boolean isRegex = null;

  @SerializedName("relatedObject")
  private V1RelatedObject relatedObject = null;

  @SerializedName("resourceAllocation")
  private V1ClusterNamespaceResourceAllocation resourceAllocation = null;

  public V1ClusterNamespaceSpec isRegex(Boolean isRegex) {
    this.isRegex = isRegex;
    return this;
  }

   /**
   * Get isRegex
   * @return isRegex
  **/
  @Schema(description = "")
  public Boolean isIsRegex() {
    return isRegex;
  }

  public void setIsRegex(Boolean isRegex) {
    this.isRegex = isRegex;
  }

  public V1ClusterNamespaceSpec relatedObject(V1RelatedObject relatedObject) {
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Get relatedObject
   * @return relatedObject
  **/
  @Schema(description = "")
  public V1RelatedObject getRelatedObject() {
    return relatedObject;
  }

  public void setRelatedObject(V1RelatedObject relatedObject) {
    this.relatedObject = relatedObject;
  }

  public V1ClusterNamespaceSpec resourceAllocation(V1ClusterNamespaceResourceAllocation resourceAllocation) {
    this.resourceAllocation = resourceAllocation;
    return this;
  }

   /**
   * Get resourceAllocation
   * @return resourceAllocation
  **/
  @Schema(description = "")
  public V1ClusterNamespaceResourceAllocation getResourceAllocation() {
    return resourceAllocation;
  }

  public void setResourceAllocation(V1ClusterNamespaceResourceAllocation resourceAllocation) {
    this.resourceAllocation = resourceAllocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterNamespaceSpec v1ClusterNamespaceSpec = (V1ClusterNamespaceSpec) o;
    return Objects.equals(this.isRegex, v1ClusterNamespaceSpec.isRegex) &&
        Objects.equals(this.relatedObject, v1ClusterNamespaceSpec.relatedObject) &&
        Objects.equals(this.resourceAllocation, v1ClusterNamespaceSpec.resourceAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRegex, relatedObject, resourceAllocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterNamespaceSpec {\n");
    
    sb.append("    isRegex: ").append(toIndentedString(isRegex)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    resourceAllocation: ").append(toIndentedString(resourceAllocation)).append("\n");
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
