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
import java.util.ArrayList;
import java.util.List;
/**
 * V1GenericMachinePoolConfig
 */



public class V1GenericMachinePoolConfig {
  @SerializedName("instanceType")
  private String instanceType = null;

  @SerializedName("isControlPlane")
  private Boolean isControlPlane = null;

  @SerializedName("labels")
  private List<String> labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rootDeviceSize")
  private Long rootDeviceSize = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("useControlPlaneAsWorker")
  private Boolean useControlPlaneAsWorker = null;

  public V1GenericMachinePoolConfig instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public V1GenericMachinePoolConfig isControlPlane(Boolean isControlPlane) {
    this.isControlPlane = isControlPlane;
    return this;
  }

   /**
   * whether this pool is for control plane
   * @return isControlPlane
  **/
  @Schema(required = true, description = "whether this pool is for control plane")
  public Boolean isIsControlPlane() {
    return isControlPlane;
  }

  public void setIsControlPlane(Boolean isControlPlane) {
    this.isControlPlane = isControlPlane;
  }

  public V1GenericMachinePoolConfig labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public V1GenericMachinePoolConfig addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * labels for this pool, example: master/worker, gpu, windows
   * @return labels
  **/
  @Schema(description = "labels for this pool, example: master/worker, gpu, windows")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public V1GenericMachinePoolConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1GenericMachinePoolConfig rootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
    return this;
  }

   /**
   * Size of root volume in GB. Default is 30GB
   * @return rootDeviceSize
  **/
  @Schema(description = "Size of root volume in GB. Default is 30GB")
  public Long getRootDeviceSize() {
    return rootDeviceSize;
  }

  public void setRootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
  }

  public V1GenericMachinePoolConfig size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * size of the pool, number of machines
   * @return size
  **/
  @Schema(description = "size of the pool, number of machines")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public V1GenericMachinePoolConfig useControlPlaneAsWorker(Boolean useControlPlaneAsWorker) {
    this.useControlPlaneAsWorker = useControlPlaneAsWorker;
    return this;
  }

   /**
   * if IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools
   * @return useControlPlaneAsWorker
  **/
  @Schema(description = "if IsControlPlane==true && useControlPlaneAsWorker==true, then will remove master taint this will not be used for worker pools")
  public Boolean isUseControlPlaneAsWorker() {
    return useControlPlaneAsWorker;
  }

  public void setUseControlPlaneAsWorker(Boolean useControlPlaneAsWorker) {
    this.useControlPlaneAsWorker = useControlPlaneAsWorker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GenericMachinePoolConfig v1GenericMachinePoolConfig = (V1GenericMachinePoolConfig) o;
    return Objects.equals(this.instanceType, v1GenericMachinePoolConfig.instanceType) &&
        Objects.equals(this.isControlPlane, v1GenericMachinePoolConfig.isControlPlane) &&
        Objects.equals(this.labels, v1GenericMachinePoolConfig.labels) &&
        Objects.equals(this.name, v1GenericMachinePoolConfig.name) &&
        Objects.equals(this.rootDeviceSize, v1GenericMachinePoolConfig.rootDeviceSize) &&
        Objects.equals(this.size, v1GenericMachinePoolConfig.size) &&
        Objects.equals(this.useControlPlaneAsWorker, v1GenericMachinePoolConfig.useControlPlaneAsWorker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, isControlPlane, labels, name, rootDeviceSize, size, useControlPlaneAsWorker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GenericMachinePoolConfig {\n");
    
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    isControlPlane: ").append(toIndentedString(isControlPlane)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootDeviceSize: ").append(toIndentedString(rootDeviceSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    useControlPlaneAsWorker: ").append(toIndentedString(useControlPlaneAsWorker)).append("\n");
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
