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
import com.spectrocloud.client.model.V1GcpNic;
import com.spectrocloud.client.model.V1InstanceConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GCP cloud VM definition spec
 */
@Schema(description = "GCP cloud VM definition spec")


public class V1GcpMachineSpec {
  @SerializedName("image")
  private String image = null;

  @SerializedName("instanceConfig")
  private V1InstanceConfig instanceConfig = null;

  @SerializedName("instanceType")
  private String instanceType = null;

  @SerializedName("nics")
  private List<V1GcpNic> nics = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("rootDeviceSize")
  private Long rootDeviceSize = null;

  @SerializedName("zone")
  private String zone = null;

  public V1GcpMachineSpec image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1GcpMachineSpec instanceConfig(V1InstanceConfig instanceConfig) {
    this.instanceConfig = instanceConfig;
    return this;
  }

   /**
   * Get instanceConfig
   * @return instanceConfig
  **/
  @Schema(description = "")
  public V1InstanceConfig getInstanceConfig() {
    return instanceConfig;
  }

  public void setInstanceConfig(V1InstanceConfig instanceConfig) {
    this.instanceConfig = instanceConfig;
  }

  public V1GcpMachineSpec instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(required = true, description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public V1GcpMachineSpec nics(List<V1GcpNic> nics) {
    this.nics = nics;
    return this;
  }

  public V1GcpMachineSpec addNicsItem(V1GcpNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<V1GcpNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @Schema(description = "")
  public List<V1GcpNic> getNics() {
    return nics;
  }

  public void setNics(List<V1GcpNic> nics) {
    this.nics = nics;
  }

  public V1GcpMachineSpec project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public V1GcpMachineSpec region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1GcpMachineSpec rootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
    return this;
  }

   /**
   * Get rootDeviceSize
   * @return rootDeviceSize
  **/
  @Schema(description = "")
  public Long getRootDeviceSize() {
    return rootDeviceSize;
  }

  public void setRootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
  }

  public V1GcpMachineSpec zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpMachineSpec v1GcpMachineSpec = (V1GcpMachineSpec) o;
    return Objects.equals(this.image, v1GcpMachineSpec.image) &&
        Objects.equals(this.instanceConfig, v1GcpMachineSpec.instanceConfig) &&
        Objects.equals(this.instanceType, v1GcpMachineSpec.instanceType) &&
        Objects.equals(this.nics, v1GcpMachineSpec.nics) &&
        Objects.equals(this.project, v1GcpMachineSpec.project) &&
        Objects.equals(this.region, v1GcpMachineSpec.region) &&
        Objects.equals(this.rootDeviceSize, v1GcpMachineSpec.rootDeviceSize) &&
        Objects.equals(this.zone, v1GcpMachineSpec.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, instanceConfig, instanceType, nics, project, region, rootDeviceSize, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpMachineSpec {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    instanceConfig: ").append(toIndentedString(instanceConfig)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    rootDeviceSize: ").append(toIndentedString(rootDeviceSize)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
