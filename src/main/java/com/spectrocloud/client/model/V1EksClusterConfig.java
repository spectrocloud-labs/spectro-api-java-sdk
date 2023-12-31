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
import com.spectrocloud.client.model.V1EksAddon;
import com.spectrocloud.client.model.V1EksClusterConfigEndpointAccess;
import com.spectrocloud.client.model.V1EncryptionConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EksClusterConfig defines EKS specific config
 */
@Schema(description = "EksClusterConfig defines EKS specific config")


public class V1EksClusterConfig {
  @SerializedName("addons")
  private List<V1EksAddon> addons = null;

  @SerializedName("bastionDisabled")
  private Boolean bastionDisabled = null;

  @SerializedName("controlPlaneLoadBalancer")
  private String controlPlaneLoadBalancer = null;

  @SerializedName("encryptionConfig")
  private V1EncryptionConfig encryptionConfig = null;

  @SerializedName("endpointAccess")
  private V1EksClusterConfigEndpointAccess endpointAccess = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("sshKeyName")
  private String sshKeyName = null;

  @SerializedName("vpcId")
  private String vpcId = null;

  public V1EksClusterConfig addons(List<V1EksAddon> addons) {
    this.addons = addons;
    return this;
  }

  public V1EksClusterConfig addAddonsItem(V1EksAddon addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<V1EksAddon>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Addons defines the EKS addons to enable with the EKS cluster. This may be required for brownfield clusters
   * @return addons
  **/
  @Schema(description = "Addons defines the EKS addons to enable with the EKS cluster. This may be required for brownfield clusters")
  public List<V1EksAddon> getAddons() {
    return addons;
  }

  public void setAddons(List<V1EksAddon> addons) {
    this.addons = addons;
  }

  public V1EksClusterConfig bastionDisabled(Boolean bastionDisabled) {
    this.bastionDisabled = bastionDisabled;
    return this;
  }

   /**
   * BastionDisabled is the option to disable bastion node
   * @return bastionDisabled
  **/
  @Schema(description = "BastionDisabled is the option to disable bastion node")
  public Boolean isBastionDisabled() {
    return bastionDisabled;
  }

  public void setBastionDisabled(Boolean bastionDisabled) {
    this.bastionDisabled = bastionDisabled;
  }

  public V1EksClusterConfig controlPlaneLoadBalancer(String controlPlaneLoadBalancer) {
    this.controlPlaneLoadBalancer = controlPlaneLoadBalancer;
    return this;
  }

   /**
   * ControlPlaneLoadBalancer specifies how API server elb will be configured, this field is optional, not provided, \&quot;\&quot;, default &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;Internet-facing\&quot; &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;internal\&quot; &#x3D;&gt; \&quot;internal\&quot; For spectro saas setup we require to talk to the apiserver from our cluster so ControlPlaneLoadBalancer should be \&quot;\&quot;, not provided or \&quot;Internet-facing\&quot;
   * @return controlPlaneLoadBalancer
  **/
  @Schema(description = "ControlPlaneLoadBalancer specifies how API server elb will be configured, this field is optional, not provided, \"\", default => \"Internet-facing\" \"Internet-facing\" => \"Internet-facing\" \"internal\" => \"internal\" For spectro saas setup we require to talk to the apiserver from our cluster so ControlPlaneLoadBalancer should be \"\", not provided or \"Internet-facing\"")
  public String getControlPlaneLoadBalancer() {
    return controlPlaneLoadBalancer;
  }

  public void setControlPlaneLoadBalancer(String controlPlaneLoadBalancer) {
    this.controlPlaneLoadBalancer = controlPlaneLoadBalancer;
  }

  public V1EksClusterConfig encryptionConfig(V1EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

   /**
   * Get encryptionConfig
   * @return encryptionConfig
  **/
  @Schema(description = "")
  public V1EncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  public void setEncryptionConfig(V1EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
  }

  public V1EksClusterConfig endpointAccess(V1EksClusterConfigEndpointAccess endpointAccess) {
    this.endpointAccess = endpointAccess;
    return this;
  }

   /**
   * Get endpointAccess
   * @return endpointAccess
  **/
  @Schema(description = "")
  public V1EksClusterConfigEndpointAccess getEndpointAccess() {
    return endpointAccess;
  }

  public void setEndpointAccess(V1EksClusterConfigEndpointAccess endpointAccess) {
    this.endpointAccess = endpointAccess;
  }

  public V1EksClusterConfig region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The AWS Region the cluster lives in.
   * @return region
  **/
  @Schema(required = true, description = "The AWS Region the cluster lives in.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1EksClusterConfig sshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
    return this;
  }

   /**
   * SSHKeyName specifies which EC2 SSH key can be used to access machines.
   * @return sshKeyName
  **/
  @Schema(description = "SSHKeyName specifies which EC2 SSH key can be used to access machines.")
  public String getSshKeyName() {
    return sshKeyName;
  }

  public void setSshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
  }

  public V1EksClusterConfig vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created
   * @return vpcId
  **/
  @Schema(description = "VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created")
  public String getVpcId() {
    return vpcId;
  }

  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EksClusterConfig v1EksClusterConfig = (V1EksClusterConfig) o;
    return Objects.equals(this.addons, v1EksClusterConfig.addons) &&
        Objects.equals(this.bastionDisabled, v1EksClusterConfig.bastionDisabled) &&
        Objects.equals(this.controlPlaneLoadBalancer, v1EksClusterConfig.controlPlaneLoadBalancer) &&
        Objects.equals(this.encryptionConfig, v1EksClusterConfig.encryptionConfig) &&
        Objects.equals(this.endpointAccess, v1EksClusterConfig.endpointAccess) &&
        Objects.equals(this.region, v1EksClusterConfig.region) &&
        Objects.equals(this.sshKeyName, v1EksClusterConfig.sshKeyName) &&
        Objects.equals(this.vpcId, v1EksClusterConfig.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addons, bastionDisabled, controlPlaneLoadBalancer, encryptionConfig, endpointAccess, region, sshKeyName, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EksClusterConfig {\n");
    
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    bastionDisabled: ").append(toIndentedString(bastionDisabled)).append("\n");
    sb.append("    controlPlaneLoadBalancer: ").append(toIndentedString(controlPlaneLoadBalancer)).append("\n");
    sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
    sb.append("    endpointAccess: ").append(toIndentedString(endpointAccess)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    sshKeyName: ").append(toIndentedString(sshKeyName)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
