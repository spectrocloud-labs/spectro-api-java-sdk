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
import com.spectrocloud.client.model.V1VsphereInstanceType;
import com.spectrocloud.client.model.V1VspherePlacementConfigEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1VsphereMachinePoolCloudConfigEntity
 */



public class V1VsphereMachinePoolCloudConfigEntity {
  @SerializedName("instanceType")
  private V1VsphereInstanceType instanceType = null;

  @SerializedName("placements")
  private List<V1VspherePlacementConfigEntity> placements = null;

  public V1VsphereMachinePoolCloudConfigEntity instanceType(V1VsphereInstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public V1VsphereInstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(V1VsphereInstanceType instanceType) {
    this.instanceType = instanceType;
  }

  public V1VsphereMachinePoolCloudConfigEntity placements(List<V1VspherePlacementConfigEntity> placements) {
    this.placements = placements;
    return this;
  }

  public V1VsphereMachinePoolCloudConfigEntity addPlacementsItem(V1VspherePlacementConfigEntity placementsItem) {
    if (this.placements == null) {
      this.placements = new ArrayList<V1VspherePlacementConfigEntity>();
    }
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Placements configuration Placements If defined, will replace default values defined in VsphereClusterConfig Array means one MachinePool can span across multiple vsphere compute cluster
   * @return placements
  **/
  @Schema(description = "Placements configuration Placements If defined, will replace default values defined in VsphereClusterConfig Array means one MachinePool can span across multiple vsphere compute cluster")
  public List<V1VspherePlacementConfigEntity> getPlacements() {
    return placements;
  }

  public void setPlacements(List<V1VspherePlacementConfigEntity> placements) {
    this.placements = placements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereMachinePoolCloudConfigEntity v1VsphereMachinePoolCloudConfigEntity = (V1VsphereMachinePoolCloudConfigEntity) o;
    return Objects.equals(this.instanceType, v1VsphereMachinePoolCloudConfigEntity.instanceType) &&
        Objects.equals(this.placements, v1VsphereMachinePoolCloudConfigEntity.placements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, placements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereMachinePoolCloudConfigEntity {\n");
    
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
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