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
import com.spectrocloud.client.model.V1ObjectReference;
import com.spectrocloud.client.model.V1OpenStackResource;
import com.spectrocloud.client.model.V1OpenstackFlavorConfig;
import com.spectrocloud.client.model.V1Taint;
import com.spectrocloud.client.model.V1UpdateStrategy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * V1OpenStackMachinePoolConfig
 */



public class V1OpenStackMachinePoolConfig {
  @SerializedName("additionalLabels")
  private Map<String, String> additionalLabels = null;

  @SerializedName("additionalTags")
  private Map<String, String> additionalTags = null;

  @SerializedName("azs")
  private List<String> azs = null;

  @SerializedName("diskGiB")
  private Integer diskGiB = null;

  @SerializedName("flavor")
  private String flavor = null;

  @SerializedName("flavorConfig")
  private V1OpenstackFlavorConfig flavorConfig = null;

  @SerializedName("image")
  private String image = null;

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

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("subnet")
  private V1OpenStackResource subnet = null;

  @SerializedName("taints")
  private List<V1Taint> taints = null;

  @SerializedName("updateStrategy")
  private V1UpdateStrategy updateStrategy = null;

  @SerializedName("useControlPlaneAsWorker")
  private Boolean useControlPlaneAsWorker = null;

  public V1OpenStackMachinePoolConfig additionalLabels(Map<String, String> additionalLabels) {
    this.additionalLabels = additionalLabels;
    return this;
  }

  public V1OpenStackMachinePoolConfig putAdditionalLabelsItem(String key, String additionalLabelsItem) {
    if (this.additionalLabels == null) {
      this.additionalLabels = new HashMap<String, String>();
    }
    this.additionalLabels.put(key, additionalLabelsItem);
    return this;
  }

   /**
   * additionalLabels
   * @return additionalLabels
  **/
  @Schema(description = "additionalLabels")
  public Map<String, String> getAdditionalLabels() {
    return additionalLabels;
  }

  public void setAdditionalLabels(Map<String, String> additionalLabels) {
    this.additionalLabels = additionalLabels;
  }

  public V1OpenStackMachinePoolConfig additionalTags(Map<String, String> additionalTags) {
    this.additionalTags = additionalTags;
    return this;
  }

  public V1OpenStackMachinePoolConfig putAdditionalTagsItem(String key, String additionalTagsItem) {
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

  public V1OpenStackMachinePoolConfig azs(List<String> azs) {
    this.azs = azs;
    return this;
  }

  public V1OpenStackMachinePoolConfig addAzsItem(String azsItem) {
    if (this.azs == null) {
      this.azs = new ArrayList<String>();
    }
    this.azs.add(azsItem);
    return this;
  }

   /**
   * for master pool, this will be the failure domains for kcp
   * @return azs
  **/
  @Schema(description = "for master pool, this will be the failure domains for kcp")
  public List<String> getAzs() {
    return azs;
  }

  public void setAzs(List<String> azs) {
    this.azs = azs;
  }

  public V1OpenStackMachinePoolConfig diskGiB(Integer diskGiB) {
    this.diskGiB = diskGiB;
    return this;
  }

   /**
   * DiskGiB is used to configure rootVolume, the volume metadata to boot from
   * @return diskGiB
  **/
  @Schema(description = "DiskGiB is used to configure rootVolume, the volume metadata to boot from")
  public Integer getDiskGiB() {
    return diskGiB;
  }

  public void setDiskGiB(Integer diskGiB) {
    this.diskGiB = diskGiB;
  }

  public V1OpenStackMachinePoolConfig flavor(String flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Openstack flavor name, only return argument
   * @return flavor
  **/
  @Schema(description = "Openstack flavor name, only return argument")
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public V1OpenStackMachinePoolConfig flavorConfig(V1OpenstackFlavorConfig flavorConfig) {
    this.flavorConfig = flavorConfig;
    return this;
  }

   /**
   * Get flavorConfig
   * @return flavorConfig
  **/
  @Schema(required = true, description = "")
  public V1OpenstackFlavorConfig getFlavorConfig() {
    return flavorConfig;
  }

  public void setFlavorConfig(V1OpenstackFlavorConfig flavorConfig) {
    this.flavorConfig = flavorConfig;
  }

  public V1OpenStackMachinePoolConfig image(String image) {
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

  public V1OpenStackMachinePoolConfig infraProfileRef(V1ObjectReference infraProfileRef) {
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

  public V1OpenStackMachinePoolConfig infraProfileTemplate(V1ClusterProfileTemplate infraProfileTemplate) {
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

  public V1OpenStackMachinePoolConfig isControlPlane(Boolean isControlPlane) {
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

  public V1OpenStackMachinePoolConfig labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public V1OpenStackMachinePoolConfig addLabelsItem(String labelsItem) {
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

  public V1OpenStackMachinePoolConfig maxSize(Integer maxSize) {
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

  public V1OpenStackMachinePoolConfig minSize(Integer minSize) {
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

  public V1OpenStackMachinePoolConfig name(String name) {
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

  public V1OpenStackMachinePoolConfig size(Integer size) {
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

  public V1OpenStackMachinePoolConfig subnet(V1OpenStackResource subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * Get subnet
   * @return subnet
  **/
  @Schema(description = "")
  public V1OpenStackResource getSubnet() {
    return subnet;
  }

  public void setSubnet(V1OpenStackResource subnet) {
    this.subnet = subnet;
  }

  public V1OpenStackMachinePoolConfig taints(List<V1Taint> taints) {
    this.taints = taints;
    return this;
  }

  public V1OpenStackMachinePoolConfig addTaintsItem(V1Taint taintsItem) {
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

  public V1OpenStackMachinePoolConfig updateStrategy(V1UpdateStrategy updateStrategy) {
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

  public V1OpenStackMachinePoolConfig useControlPlaneAsWorker(Boolean useControlPlaneAsWorker) {
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
    V1OpenStackMachinePoolConfig v1OpenStackMachinePoolConfig = (V1OpenStackMachinePoolConfig) o;
    return Objects.equals(this.additionalLabels, v1OpenStackMachinePoolConfig.additionalLabels) &&
        Objects.equals(this.additionalTags, v1OpenStackMachinePoolConfig.additionalTags) &&
        Objects.equals(this.azs, v1OpenStackMachinePoolConfig.azs) &&
        Objects.equals(this.diskGiB, v1OpenStackMachinePoolConfig.diskGiB) &&
        Objects.equals(this.flavor, v1OpenStackMachinePoolConfig.flavor) &&
        Objects.equals(this.flavorConfig, v1OpenStackMachinePoolConfig.flavorConfig) &&
        Objects.equals(this.image, v1OpenStackMachinePoolConfig.image) &&
        Objects.equals(this.infraProfileRef, v1OpenStackMachinePoolConfig.infraProfileRef) &&
        Objects.equals(this.infraProfileTemplate, v1OpenStackMachinePoolConfig.infraProfileTemplate) &&
        Objects.equals(this.isControlPlane, v1OpenStackMachinePoolConfig.isControlPlane) &&
        Objects.equals(this.labels, v1OpenStackMachinePoolConfig.labels) &&
        Objects.equals(this.maxSize, v1OpenStackMachinePoolConfig.maxSize) &&
        Objects.equals(this.minSize, v1OpenStackMachinePoolConfig.minSize) &&
        Objects.equals(this.name, v1OpenStackMachinePoolConfig.name) &&
        Objects.equals(this.size, v1OpenStackMachinePoolConfig.size) &&
        Objects.equals(this.subnet, v1OpenStackMachinePoolConfig.subnet) &&
        Objects.equals(this.taints, v1OpenStackMachinePoolConfig.taints) &&
        Objects.equals(this.updateStrategy, v1OpenStackMachinePoolConfig.updateStrategy) &&
        Objects.equals(this.useControlPlaneAsWorker, v1OpenStackMachinePoolConfig.useControlPlaneAsWorker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalLabels, additionalTags, azs, diskGiB, flavor, flavorConfig, image, infraProfileRef, infraProfileTemplate, isControlPlane, labels, maxSize, minSize, name, size, subnet, taints, updateStrategy, useControlPlaneAsWorker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OpenStackMachinePoolConfig {\n");
    
    sb.append("    additionalLabels: ").append(toIndentedString(additionalLabels)).append("\n");
    sb.append("    additionalTags: ").append(toIndentedString(additionalTags)).append("\n");
    sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
    sb.append("    diskGiB: ").append(toIndentedString(diskGiB)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    flavorConfig: ").append(toIndentedString(flavorConfig)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    infraProfileRef: ").append(toIndentedString(infraProfileRef)).append("\n");
    sb.append("    infraProfileTemplate: ").append(toIndentedString(infraProfileTemplate)).append("\n");
    sb.append("    isControlPlane: ").append(toIndentedString(isControlPlane)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
