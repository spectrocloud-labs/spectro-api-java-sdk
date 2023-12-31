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
import com.spectrocloud.client.model.V1AADProfile;
import com.spectrocloud.client.model.V1APIServerAccessProfile;
import com.spectrocloud.client.model.V1InfraLBConfig;
import com.spectrocloud.client.model.V1Subnet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Cluster level configuration for Azure cloud and applicable for all the machine pools
 */
@Schema(description = "Cluster level configuration for Azure cloud and applicable for all the machine pools")


public class V1AzureClusterConfig {
  @SerializedName("aadProfile")
  private V1AADProfile aadProfile = null;

  @SerializedName("apiServerAccessProfile")
  private V1APIServerAccessProfile apiServerAccessProfile = null;

  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("controlPlaneSubnet")
  private V1Subnet controlPlaneSubnet = null;

  @SerializedName("enablePrivateCluster")
  private Boolean enablePrivateCluster = null;

  @SerializedName("infraLBConfig")
  private V1InfraLBConfig infraLBConfig = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("resourceGroup")
  private String resourceGroup = null;

  @SerializedName("sshKey")
  private String sshKey = null;

  @SerializedName("storageAccountName")
  private String storageAccountName = null;

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("vnetCidrBlock")
  private String vnetCidrBlock = null;

  @SerializedName("vnetName")
  private String vnetName = null;

  @SerializedName("vnetResourceGroup")
  private String vnetResourceGroup = null;

  @SerializedName("workerSubnet")
  private V1Subnet workerSubnet = null;

  public V1AzureClusterConfig aadProfile(V1AADProfile aadProfile) {
    this.aadProfile = aadProfile;
    return this;
  }

   /**
   * Get aadProfile
   * @return aadProfile
  **/
  @Schema(description = "")
  public V1AADProfile getAadProfile() {
    return aadProfile;
  }

  public void setAadProfile(V1AADProfile aadProfile) {
    this.aadProfile = aadProfile;
  }

  public V1AzureClusterConfig apiServerAccessProfile(V1APIServerAccessProfile apiServerAccessProfile) {
    this.apiServerAccessProfile = apiServerAccessProfile;
    return this;
  }

   /**
   * Get apiServerAccessProfile
   * @return apiServerAccessProfile
  **/
  @Schema(description = "")
  public V1APIServerAccessProfile getApiServerAccessProfile() {
    return apiServerAccessProfile;
  }

  public void setApiServerAccessProfile(V1APIServerAccessProfile apiServerAccessProfile) {
    this.apiServerAccessProfile = apiServerAccessProfile;
  }

  public V1AzureClusterConfig containerName(String containerName) {
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

  public V1AzureClusterConfig controlPlaneSubnet(V1Subnet controlPlaneSubnet) {
    this.controlPlaneSubnet = controlPlaneSubnet;
    return this;
  }

   /**
   * Get controlPlaneSubnet
   * @return controlPlaneSubnet
  **/
  @Schema(description = "")
  public V1Subnet getControlPlaneSubnet() {
    return controlPlaneSubnet;
  }

  public void setControlPlaneSubnet(V1Subnet controlPlaneSubnet) {
    this.controlPlaneSubnet = controlPlaneSubnet;
  }

  public V1AzureClusterConfig enablePrivateCluster(Boolean enablePrivateCluster) {
    this.enablePrivateCluster = enablePrivateCluster;
    return this;
  }

   /**
   * Deprecated. use apiServerAccessProfile.enablePrivateCluster
   * @return enablePrivateCluster
  **/
  @Schema(description = "Deprecated. use apiServerAccessProfile.enablePrivateCluster")
  public Boolean isEnablePrivateCluster() {
    return enablePrivateCluster;
  }

  public void setEnablePrivateCluster(Boolean enablePrivateCluster) {
    this.enablePrivateCluster = enablePrivateCluster;
  }

  public V1AzureClusterConfig infraLBConfig(V1InfraLBConfig infraLBConfig) {
    this.infraLBConfig = infraLBConfig;
    return this;
  }

   /**
   * Get infraLBConfig
   * @return infraLBConfig
  **/
  @Schema(description = "")
  public V1InfraLBConfig getInfraLBConfig() {
    return infraLBConfig;
  }

  public void setInfraLBConfig(V1InfraLBConfig infraLBConfig) {
    this.infraLBConfig = infraLBConfig;
  }

  public V1AzureClusterConfig location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location is the Azure datacenter location
   * @return location
  **/
  @Schema(required = true, description = "Location is the Azure datacenter location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public V1AzureClusterConfig resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

   /**
   * Get resourceGroup
   * @return resourceGroup
  **/
  @Schema(description = "")
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }

  public V1AzureClusterConfig sshKey(String sshKey) {
    this.sshKey = sshKey;
    return this;
  }

   /**
   * Get sshKey
   * @return sshKey
  **/
  @Schema(required = true, description = "")
  public String getSshKey() {
    return sshKey;
  }

  public void setSshKey(String sshKey) {
    this.sshKey = sshKey;
  }

  public V1AzureClusterConfig storageAccountName(String storageAccountName) {
    this.storageAccountName = storageAccountName;
    return this;
  }

   /**
   * Get storageAccountName
   * @return storageAccountName
  **/
  @Schema(description = "")
  public String getStorageAccountName() {
    return storageAccountName;
  }

  public void setStorageAccountName(String storageAccountName) {
    this.storageAccountName = storageAccountName;
  }

  public V1AzureClusterConfig subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Subscription ID is unique identifier for the subscription used to access Azure services
   * @return subscriptionId
  **/
  @Schema(required = true, description = "Subscription ID is unique identifier for the subscription used to access Azure services")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public V1AzureClusterConfig vnetCidrBlock(String vnetCidrBlock) {
    this.vnetCidrBlock = vnetCidrBlock;
    return this;
  }

   /**
   * Get vnetCidrBlock
   * @return vnetCidrBlock
  **/
  @Schema(description = "")
  public String getVnetCidrBlock() {
    return vnetCidrBlock;
  }

  public void setVnetCidrBlock(String vnetCidrBlock) {
    this.vnetCidrBlock = vnetCidrBlock;
  }

  public V1AzureClusterConfig vnetName(String vnetName) {
    this.vnetName = vnetName;
    return this;
  }

   /**
   * VNETName is the virtual network in which the cluster is to be provisioned.
   * @return vnetName
  **/
  @Schema(description = "VNETName is the virtual network in which the cluster is to be provisioned.")
  public String getVnetName() {
    return vnetName;
  }

  public void setVnetName(String vnetName) {
    this.vnetName = vnetName;
  }

  public V1AzureClusterConfig vnetResourceGroup(String vnetResourceGroup) {
    this.vnetResourceGroup = vnetResourceGroup;
    return this;
  }

   /**
   * Get vnetResourceGroup
   * @return vnetResourceGroup
  **/
  @Schema(description = "")
  public String getVnetResourceGroup() {
    return vnetResourceGroup;
  }

  public void setVnetResourceGroup(String vnetResourceGroup) {
    this.vnetResourceGroup = vnetResourceGroup;
  }

  public V1AzureClusterConfig workerSubnet(V1Subnet workerSubnet) {
    this.workerSubnet = workerSubnet;
    return this;
  }

   /**
   * Get workerSubnet
   * @return workerSubnet
  **/
  @Schema(description = "")
  public V1Subnet getWorkerSubnet() {
    return workerSubnet;
  }

  public void setWorkerSubnet(V1Subnet workerSubnet) {
    this.workerSubnet = workerSubnet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureClusterConfig v1AzureClusterConfig = (V1AzureClusterConfig) o;
    return Objects.equals(this.aadProfile, v1AzureClusterConfig.aadProfile) &&
        Objects.equals(this.apiServerAccessProfile, v1AzureClusterConfig.apiServerAccessProfile) &&
        Objects.equals(this.containerName, v1AzureClusterConfig.containerName) &&
        Objects.equals(this.controlPlaneSubnet, v1AzureClusterConfig.controlPlaneSubnet) &&
        Objects.equals(this.enablePrivateCluster, v1AzureClusterConfig.enablePrivateCluster) &&
        Objects.equals(this.infraLBConfig, v1AzureClusterConfig.infraLBConfig) &&
        Objects.equals(this.location, v1AzureClusterConfig.location) &&
        Objects.equals(this.resourceGroup, v1AzureClusterConfig.resourceGroup) &&
        Objects.equals(this.sshKey, v1AzureClusterConfig.sshKey) &&
        Objects.equals(this.storageAccountName, v1AzureClusterConfig.storageAccountName) &&
        Objects.equals(this.subscriptionId, v1AzureClusterConfig.subscriptionId) &&
        Objects.equals(this.vnetCidrBlock, v1AzureClusterConfig.vnetCidrBlock) &&
        Objects.equals(this.vnetName, v1AzureClusterConfig.vnetName) &&
        Objects.equals(this.vnetResourceGroup, v1AzureClusterConfig.vnetResourceGroup) &&
        Objects.equals(this.workerSubnet, v1AzureClusterConfig.workerSubnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aadProfile, apiServerAccessProfile, containerName, controlPlaneSubnet, enablePrivateCluster, infraLBConfig, location, resourceGroup, sshKey, storageAccountName, subscriptionId, vnetCidrBlock, vnetName, vnetResourceGroup, workerSubnet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureClusterConfig {\n");
    
    sb.append("    aadProfile: ").append(toIndentedString(aadProfile)).append("\n");
    sb.append("    apiServerAccessProfile: ").append(toIndentedString(apiServerAccessProfile)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    controlPlaneSubnet: ").append(toIndentedString(controlPlaneSubnet)).append("\n");
    sb.append("    enablePrivateCluster: ").append(toIndentedString(enablePrivateCluster)).append("\n");
    sb.append("    infraLBConfig: ").append(toIndentedString(infraLBConfig)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    storageAccountName: ").append(toIndentedString(storageAccountName)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    vnetCidrBlock: ").append(toIndentedString(vnetCidrBlock)).append("\n");
    sb.append("    vnetName: ").append(toIndentedString(vnetName)).append("\n");
    sb.append("    vnetResourceGroup: ").append(toIndentedString(vnetResourceGroup)).append("\n");
    sb.append("    workerSubnet: ").append(toIndentedString(workerSubnet)).append("\n");
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
