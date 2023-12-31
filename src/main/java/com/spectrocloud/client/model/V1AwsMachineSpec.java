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
import com.spectrocloud.client.model.V1AwsNic;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AWS cloud VM definition spec
 */
@Schema(description = "AWS cloud VM definition spec")


public class V1AwsMachineSpec {
  @SerializedName("ami")
  private String ami = null;

  @SerializedName("az")
  private String az = null;

  @SerializedName("dnsName")
  private String dnsName = null;

  @SerializedName("iamProfile")
  private String iamProfile = null;

  @SerializedName("instanceType")
  private String instanceType = null;

  @SerializedName("nics")
  private List<V1AwsNic> nics = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("sshKeyName")
  private String sshKeyName = null;

  @SerializedName("subnetId")
  private String subnetId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("vpcId")
  private String vpcId = null;

  public V1AwsMachineSpec ami(String ami) {
    this.ami = ami;
    return this;
  }

   /**
   * Get ami
   * @return ami
  **/
  @Schema(required = true, description = "")
  public String getAmi() {
    return ami;
  }

  public void setAmi(String ami) {
    this.ami = ami;
  }

  public V1AwsMachineSpec az(String az) {
    this.az = az;
    return this;
  }

   /**
   * Get az
   * @return az
  **/
  @Schema(description = "")
  public String getAz() {
    return az;
  }

  public void setAz(String az) {
    this.az = az;
  }

  public V1AwsMachineSpec dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

   /**
   * Get dnsName
   * @return dnsName
  **/
  @Schema(description = "")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }

  public V1AwsMachineSpec iamProfile(String iamProfile) {
    this.iamProfile = iamProfile;
    return this;
  }

   /**
   * Get iamProfile
   * @return iamProfile
  **/
  @Schema(description = "")
  public String getIamProfile() {
    return iamProfile;
  }

  public void setIamProfile(String iamProfile) {
    this.iamProfile = iamProfile;
  }

  public V1AwsMachineSpec instanceType(String instanceType) {
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

  public V1AwsMachineSpec nics(List<V1AwsNic> nics) {
    this.nics = nics;
    return this;
  }

  public V1AwsMachineSpec addNicsItem(V1AwsNic nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<V1AwsNic>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @Schema(description = "")
  public List<V1AwsNic> getNics() {
    return nics;
  }

  public void setNics(List<V1AwsNic> nics) {
    this.nics = nics;
  }

  public V1AwsMachineSpec phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @Schema(description = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1AwsMachineSpec sshKeyName(String sshKeyName) {
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

  public V1AwsMachineSpec subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
  }

   /**
   * Get subnetId
   * @return subnetId
  **/
  @Schema(description = "")
  public String getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  public V1AwsMachineSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1AwsMachineSpec vpcId(String vpcId) {
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @Schema(required = true, description = "")
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
    V1AwsMachineSpec v1AwsMachineSpec = (V1AwsMachineSpec) o;
    return Objects.equals(this.ami, v1AwsMachineSpec.ami) &&
        Objects.equals(this.az, v1AwsMachineSpec.az) &&
        Objects.equals(this.dnsName, v1AwsMachineSpec.dnsName) &&
        Objects.equals(this.iamProfile, v1AwsMachineSpec.iamProfile) &&
        Objects.equals(this.instanceType, v1AwsMachineSpec.instanceType) &&
        Objects.equals(this.nics, v1AwsMachineSpec.nics) &&
        Objects.equals(this.phase, v1AwsMachineSpec.phase) &&
        Objects.equals(this.sshKeyName, v1AwsMachineSpec.sshKeyName) &&
        Objects.equals(this.subnetId, v1AwsMachineSpec.subnetId) &&
        Objects.equals(this.type, v1AwsMachineSpec.type) &&
        Objects.equals(this.vpcId, v1AwsMachineSpec.vpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ami, az, dnsName, iamProfile, instanceType, nics, phase, sshKeyName, subnetId, type, vpcId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsMachineSpec {\n");
    
    sb.append("    ami: ").append(toIndentedString(ami)).append("\n");
    sb.append("    az: ").append(toIndentedString(az)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    iamProfile: ").append(toIndentedString(iamProfile)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    sshKeyName: ").append(toIndentedString(sshKeyName)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
