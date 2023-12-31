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
/**
 * Cluster level configuration for aws cloud and applicable for all the machine pools
 */
@Schema(description = "Cluster level configuration for aws cloud and applicable for all the machine pools")


public class V1AwsClusterConfig {
  @SerializedName("bastionDisabled")
  private Boolean bastionDisabled = null;

  @SerializedName("controlPlaneLoadBalancer")
  private String controlPlaneLoadBalancer = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("sshKeyName")
  private String sshKeyName = null;

  @SerializedName("vpcId")
  private String vpcId = null;

  public V1AwsClusterConfig bastionDisabled(Boolean bastionDisabled) {
    this.bastionDisabled = bastionDisabled;
    return this;
  }

   /**
   * Create bastion node option we have earlier supported creation of bastion by default capa seems to favour session manager against bastion node https://github.com/kubernetes-sigs/cluster-api-provider-aws/issues/947
   * @return bastionDisabled
  **/
  @Schema(description = "Create bastion node option we have earlier supported creation of bastion by default capa seems to favour session manager against bastion node https://github.com/kubernetes-sigs/cluster-api-provider-aws/issues/947")
  public Boolean isBastionDisabled() {
    return bastionDisabled;
  }

  public void setBastionDisabled(Boolean bastionDisabled) {
    this.bastionDisabled = bastionDisabled;
  }

  public V1AwsClusterConfig controlPlaneLoadBalancer(String controlPlaneLoadBalancer) {
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

  public V1AwsClusterConfig region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(required = true, description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public V1AwsClusterConfig sshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
    return this;
  }

   /**
   * Get sshKeyName
   * @return sshKeyName
  **/
  @Schema(description = "")
  public String getSshKeyName() {
    return sshKeyName;
  }

  public void setSshKeyName(String sshKeyName) {
    this.sshKeyName = sshKeyName;
  }

  public V1AwsClusterConfig vpcId(String vpcId) {
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
    V1AwsClusterConfig v1AwsClusterConfig = (V1AwsClusterConfig) o;
    return Objects.equals(this.bastionDisabled, v1AwsClusterConfig.bastionDisabled) &&
        Objects.equals(this.controlPlaneLoadBalancer, v1AwsClusterConfig.controlPlaneLoadBalancer) &&
        Objects.equals(this.region, v1AwsClusterConfig.region) &&
        Objects.equals(this.sshKeyName, v1AwsClusterConfig.sshKeyName) &&
        Objects.equals(this.vpcId, v1AwsClusterConfig.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bastionDisabled, controlPlaneLoadBalancer, region, sshKeyName, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsClusterConfig {\n");
    
    sb.append("    bastionDisabled: ").append(toIndentedString(bastionDisabled)).append("\n");
    sb.append("    controlPlaneLoadBalancer: ").append(toIndentedString(controlPlaneLoadBalancer)).append("\n");
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
