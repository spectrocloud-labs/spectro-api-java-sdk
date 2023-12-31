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
import com.spectrocloud.client.model.V1LibvirtDiskSpec;
import com.spectrocloud.client.model.V1LibvirtInstanceType;
import com.spectrocloud.client.model.V1LibvirtPlacementEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1LibvirtMachinePoolCloudConfigEntity
 */



public class V1LibvirtMachinePoolCloudConfigEntity {
  @SerializedName("instanceType")
  private V1LibvirtInstanceType instanceType = null;

  @SerializedName("nonRootDisksInGB")
  private List<V1LibvirtDiskSpec> nonRootDisksInGB = null;

  @SerializedName("placements")
  private List<V1LibvirtPlacementEntity> placements = new ArrayList<V1LibvirtPlacementEntity>();

  @SerializedName("rootDiskInGB")
  private Integer rootDiskInGB = null;

  public V1LibvirtMachinePoolCloudConfigEntity instanceType(V1LibvirtInstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(required = true, description = "")
  public V1LibvirtInstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(V1LibvirtInstanceType instanceType) {
    this.instanceType = instanceType;
  }

  public V1LibvirtMachinePoolCloudConfigEntity nonRootDisksInGB(List<V1LibvirtDiskSpec> nonRootDisksInGB) {
    this.nonRootDisksInGB = nonRootDisksInGB;
    return this;
  }

  public V1LibvirtMachinePoolCloudConfigEntity addNonRootDisksInGBItem(V1LibvirtDiskSpec nonRootDisksInGBItem) {
    if (this.nonRootDisksInGB == null) {
      this.nonRootDisksInGB = new ArrayList<V1LibvirtDiskSpec>();
    }
    this.nonRootDisksInGB.add(nonRootDisksInGBItem);
    return this;
  }

   /**
   * NonRootDisksInGB is the list of additional disks, if required, in GB
   * @return nonRootDisksInGB
  **/
  @Schema(description = "NonRootDisksInGB is the list of additional disks, if required, in GB")
  public List<V1LibvirtDiskSpec> getNonRootDisksInGB() {
    return nonRootDisksInGB;
  }

  public void setNonRootDisksInGB(List<V1LibvirtDiskSpec> nonRootDisksInGB) {
    this.nonRootDisksInGB = nonRootDisksInGB;
  }

  public V1LibvirtMachinePoolCloudConfigEntity placements(List<V1LibvirtPlacementEntity> placements) {
    this.placements = placements;
    return this;
  }

  public V1LibvirtMachinePoolCloudConfigEntity addPlacementsItem(V1LibvirtPlacementEntity placementsItem) {
    this.placements.add(placementsItem);
    return this;
  }

   /**
   * Placements configuration Placements If defined, will replace default values defined in VsphereClusterConfig Array means one MachinePool can span across multiple vsphere compute cluster
   * @return placements
  **/
  @Schema(required = true, description = "Placements configuration Placements If defined, will replace default values defined in VsphereClusterConfig Array means one MachinePool can span across multiple vsphere compute cluster")
  public List<V1LibvirtPlacementEntity> getPlacements() {
    return placements;
  }

  public void setPlacements(List<V1LibvirtPlacementEntity> placements) {
    this.placements = placements;
  }

  public V1LibvirtMachinePoolCloudConfigEntity rootDiskInGB(Integer rootDiskInGB) {
    this.rootDiskInGB = rootDiskInGB;
    return this;
  }

   /**
   * RootDiskInGB is the size of a vm&#x27;s root disk, in GiB
   * @return rootDiskInGB
  **/
  @Schema(required = true, description = "RootDiskInGB is the size of a vm's root disk, in GiB")
  public Integer getRootDiskInGB() {
    return rootDiskInGB;
  }

  public void setRootDiskInGB(Integer rootDiskInGB) {
    this.rootDiskInGB = rootDiskInGB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtMachinePoolCloudConfigEntity v1LibvirtMachinePoolCloudConfigEntity = (V1LibvirtMachinePoolCloudConfigEntity) o;
    return Objects.equals(this.instanceType, v1LibvirtMachinePoolCloudConfigEntity.instanceType) &&
        Objects.equals(this.nonRootDisksInGB, v1LibvirtMachinePoolCloudConfigEntity.nonRootDisksInGB) &&
        Objects.equals(this.placements, v1LibvirtMachinePoolCloudConfigEntity.placements) &&
        Objects.equals(this.rootDiskInGB, v1LibvirtMachinePoolCloudConfigEntity.rootDiskInGB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, nonRootDisksInGB, placements, rootDiskInGB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtMachinePoolCloudConfigEntity {\n");
    
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nonRootDisksInGB: ").append(toIndentedString(nonRootDisksInGB)).append("\n");
    sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
    sb.append("    rootDiskInGB: ").append(toIndentedString(rootDiskInGB)).append("\n");
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
