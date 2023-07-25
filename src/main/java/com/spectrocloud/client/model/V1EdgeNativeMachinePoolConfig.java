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
import com.spectrocloud.client.model.V1ClusterProfileTemplate;
import com.spectrocloud.client.model.V1EdgeNativeHost;
import com.spectrocloud.client.model.V1ObjectReference;
import com.spectrocloud.client.model.V1Taint;
import com.spectrocloud.client.model.V1UpdateStrategy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * V1EdgeNativeMachinePoolConfig
 */



public class V1EdgeNativeMachinePoolConfig {
  @SerializedName("additionalLabels")
  private Map<String, String> additionalLabels = null;

  @SerializedName("additionalTags")
  private Map<String, String> additionalTags = null;

  @SerializedName("hosts")
  private List<V1EdgeNativeHost> hosts = new ArrayList<V1EdgeNativeHost>();

  @SerializedName("infraProfileRef")
  private V1ObjectReference infraProfileRef = null;

  @SerializedName("infraProfileTemplate")
  private V1ClusterProfileTemplate infraProfileTemplate = null;

  @SerializedName("isControlPlane")
  private Boolean isControlPlane = null;

  @SerializedName("labels")
  private List<String> labels = null;

  @SerializedName("maxSize")
  private Integer maxSize = null;

  @SerializedName("minSize")
  private Integer minSize = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("osType")
  private String osType = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("taints")
  private List<V1Taint> taints = null;

  @SerializedName("updateStrategy")
  private V1UpdateStrategy updateStrategy = null;

  @SerializedName("useControlPlaneAsWorker")
  private Boolean useControlPlaneAsWorker = null;

  public V1EdgeNativeMachinePoolConfig additionalLabels(Map<String, String> additionalLabels) {
    this.additionalLabels = additionalLabels;
    return this;
  }

  public V1EdgeNativeMachinePoolConfig putAdditionalLabelsItem(String key, String additionalLabelsItem) {
    if (this.additionalLabels == null) {
      this.additionalLabels = new HashMap<String, String>();
    }
    this.additionalLabels.put(key, additionalLabelsItem);
    return this;
  }

   /**
   * AdditionalLabels
   * @return additionalLabels
  **/
  @Schema(description = "AdditionalLabels")
  public Map<String, String> getAdditionalLabels() {
    return additionalLabels;
  }

  public void setAdditionalLabels(Map<String, String> additionalLabels) {
    this.additionalLabels = additionalLabels;
  }

  public V1EdgeNativeMachinePoolConfig additionalTags(Map<String, String> additionalTags) {
    this.additionalTags = additionalTags;
    return this;
  }

  public V1EdgeNativeMachinePoolConfig putAdditionalTagsItem(String key, String additionalTagsItem) {
    if (this.additionalTags == null) {
      this.additionalTags = new HashMap<String, String>();
    }
    this.additionalTags.put(key, additionalTagsItem);
    return this;
  }

   /**
   * AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole
   * @return additionalTags
  **/
  @Schema(description = "AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole")
  public Map<String, String> getAdditionalTags() {
    return additionalTags;
  }

  public void setAdditionalTags(Map<String, String> additionalTags) {
    this.additionalTags = additionalTags;
  }

  public V1EdgeNativeMachinePoolConfig hosts(List<V1EdgeNativeHost> hosts) {
    this.hosts = hosts;
    return this;
  }

  public V1EdgeNativeMachinePoolConfig addHostsItem(V1EdgeNativeHost hostsItem) {
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @Schema(required = true, description = "")
  public List<V1EdgeNativeHost> getHosts() {
    return hosts;
  }

  public void setHosts(List<V1EdgeNativeHost> hosts) {
    this.hosts = hosts;
  }

  public V1EdgeNativeMachinePoolConfig infraProfileRef(V1ObjectReference infraProfileRef) {
    this.infraProfileRef = infraProfileRef;
    return this;
  }

   /**
   * Get infraProfileRef
   * @return infraProfileRef
  **/
  @Schema(description = "")
  public V1ObjectReference getInfraProfileRef() {
    return infraProfileRef;
  }

  public void setInfraProfileRef(V1ObjectReference infraProfileRef) {
    this.infraProfileRef = infraProfileRef;
  }

  public V1EdgeNativeMachinePoolConfig infraProfileTemplate(V1ClusterProfileTemplate infraProfileTemplate) {
    this.infraProfileTemplate = infraProfileTemplate;
    return this;
  }

   /**
   * Get infraProfileTemplate
   * @return infraProfileTemplate
  **/
  @Schema(description = "")
  public V1ClusterProfileTemplate getInfraProfileTemplate() {
    return infraProfileTemplate;
  }

  public void setInfraProfileTemplate(V1ClusterProfileTemplate infraProfileTemplate) {
    this.infraProfileTemplate = infraProfileTemplate;
  }

  public V1EdgeNativeMachinePoolConfig isControlPlane(Boolean isControlPlane) {
    this.isControlPlane = isControlPlane;
    return this;
  }

   /**
   * whether this pool is for control plane
   * @return isControlPlane
  **/
  @Schema(description = "whether this pool is for control plane")
  public Boolean isIsControlPlane() {
    return isControlPlane;
  }

  public void setIsControlPlane(Boolean isControlPlane) {
    this.isControlPlane = isControlPlane;
  }

  public V1EdgeNativeMachinePoolConfig labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public V1EdgeNativeMachinePoolConfig addLabelsItem(String labelsItem) {
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

  public V1EdgeNativeMachinePoolConfig maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * max size of the pool, for scaling
   * @return maxSize
  **/
  @Schema(description = "max size of the pool, for scaling")
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public V1EdgeNativeMachinePoolConfig minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }

   /**
   * min size of the pool, for scaling
   * @return minSize
  **/
  @Schema(description = "min size of the pool, for scaling")
  public Integer getMinSize() {
    return minSize;
  }

  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  public V1EdgeNativeMachinePoolConfig name(String name) {
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

  public V1EdgeNativeMachinePoolConfig osType(String osType) {
    this.osType = osType;
    return this;
  }

   /**
   * the os type for the pool, must be supported by the provider
   * @return osType
  **/
  @Schema(description = "the os type for the pool, must be supported by the provider")
  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public V1EdgeNativeMachinePoolConfig size(Integer size) {
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

  public V1EdgeNativeMachinePoolConfig taints(List<V1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public V1EdgeNativeMachinePoolConfig addTaintsItem(V1Taint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<V1Taint>();
    }
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * master or worker taints
   * @return taints
  **/
  @Schema(description = "master or worker taints")
  public List<V1Taint> getTaints() {
    return taints;
  }

  public void setTaints(List<V1Taint> taints) {
    this.taints = taints;
  }

  public V1EdgeNativeMachinePoolConfig updateStrategy(V1UpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * Get updateStrategy
   * @return updateStrategy
  **/
  @Schema(description = "")
  public V1UpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(V1UpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }

  public V1EdgeNativeMachinePoolConfig useControlPlaneAsWorker(Boolean useControlPlaneAsWorker) {
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
    V1EdgeNativeMachinePoolConfig v1EdgeNativeMachinePoolConfig = (V1EdgeNativeMachinePoolConfig) o;
    return Objects.equals(this.additionalLabels, v1EdgeNativeMachinePoolConfig.additionalLabels) &&
        Objects.equals(this.additionalTags, v1EdgeNativeMachinePoolConfig.additionalTags) &&
        Objects.equals(this.hosts, v1EdgeNativeMachinePoolConfig.hosts) &&
        Objects.equals(this.infraProfileRef, v1EdgeNativeMachinePoolConfig.infraProfileRef) &&
        Objects.equals(this.infraProfileTemplate, v1EdgeNativeMachinePoolConfig.infraProfileTemplate) &&
        Objects.equals(this.isControlPlane, v1EdgeNativeMachinePoolConfig.isControlPlane) &&
        Objects.equals(this.labels, v1EdgeNativeMachinePoolConfig.labels) &&
        Objects.equals(this.maxSize, v1EdgeNativeMachinePoolConfig.maxSize) &&
        Objects.equals(this.minSize, v1EdgeNativeMachinePoolConfig.minSize) &&
        Objects.equals(this.name, v1EdgeNativeMachinePoolConfig.name) &&
        Objects.equals(this.osType, v1EdgeNativeMachinePoolConfig.osType) &&
        Objects.equals(this.size, v1EdgeNativeMachinePoolConfig.size) &&
        Objects.equals(this.taints, v1EdgeNativeMachinePoolConfig.taints) &&
        Objects.equals(this.updateStrategy, v1EdgeNativeMachinePoolConfig.updateStrategy) &&
        Objects.equals(this.useControlPlaneAsWorker, v1EdgeNativeMachinePoolConfig.useControlPlaneAsWorker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalLabels, additionalTags, hosts, infraProfileRef, infraProfileTemplate, isControlPlane, labels, maxSize, minSize, name, osType, size, taints, updateStrategy, useControlPlaneAsWorker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EdgeNativeMachinePoolConfig {\n");
    
    sb.append("    additionalLabels: ").append(toIndentedString(additionalLabels)).append("\n");
    sb.append("    additionalTags: ").append(toIndentedString(additionalTags)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    infraProfileRef: ").append(toIndentedString(infraProfileRef)).append("\n");
    sb.append("    infraProfileTemplate: ").append(toIndentedString(infraProfileTemplate)).append("\n");
    sb.append("    isControlPlane: ").append(toIndentedString(isControlPlane)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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