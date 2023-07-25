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
import com.spectrocloud.client.model.V1ClusterCondition;
import com.spectrocloud.client.model.V1LibvirtImage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1LibvirtCloudConfigStatus
 */



public class V1LibvirtCloudConfigStatus {
  @SerializedName("conditions")
  private List<V1ClusterCondition> conditions = null;

  @SerializedName("nodeImages")
  private List<V1LibvirtImage> nodeImages = null;

  @SerializedName("sourceImageId")
  private String sourceImageId = null;

  public V1LibvirtCloudConfigStatus conditions(List<V1ClusterCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1LibvirtCloudConfigStatus addConditionsItem(V1ClusterCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1ClusterCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public List<V1ClusterCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ClusterCondition> conditions) {
    this.conditions = conditions;
  }

  public V1LibvirtCloudConfigStatus nodeImages(List<V1LibvirtImage> nodeImages) {
    this.nodeImages = nodeImages;
    return this;
  }

  public V1LibvirtCloudConfigStatus addNodeImagesItem(V1LibvirtImage nodeImagesItem) {
    if (this.nodeImages == null) {
      this.nodeImages = new ArrayList<V1LibvirtImage>();
    }
    this.nodeImages.add(nodeImagesItem);
    return this;
  }

   /**
   * NodeImages are the list of images generated on all the LibvirtHosts
   * @return nodeImages
  **/
  @Schema(description = "NodeImages are the list of images generated on all the LibvirtHosts")
  public List<V1LibvirtImage> getNodeImages() {
    return nodeImages;
  }

  public void setNodeImages(List<V1LibvirtImage> nodeImages) {
    this.nodeImages = nodeImages;
  }

  public V1LibvirtCloudConfigStatus sourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
    return this;
  }

   /**
   * SourceImageId can be from packref&#x27;s annotations or from pack.json
   * @return sourceImageId
  **/
  @Schema(description = "SourceImageId can be from packref's annotations or from pack.json")
  public String getSourceImageId() {
    return sourceImageId;
  }

  public void setSourceImageId(String sourceImageId) {
    this.sourceImageId = sourceImageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtCloudConfigStatus v1LibvirtCloudConfigStatus = (V1LibvirtCloudConfigStatus) o;
    return Objects.equals(this.conditions, v1LibvirtCloudConfigStatus.conditions) &&
        Objects.equals(this.nodeImages, v1LibvirtCloudConfigStatus.nodeImages) &&
        Objects.equals(this.sourceImageId, v1LibvirtCloudConfigStatus.sourceImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, nodeImages, sourceImageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtCloudConfigStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    nodeImages: ").append(toIndentedString(nodeImages)).append("\n");
    sb.append("    sourceImageId: ").append(toIndentedString(sourceImageId)).append("\n");
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
