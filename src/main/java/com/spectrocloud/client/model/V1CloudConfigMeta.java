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
import com.spectrocloud.client.model.V1CloudType;
import com.spectrocloud.client.model.V1MachinePoolMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1CloudConfigMeta
 */



public class V1CloudConfigMeta {
  @SerializedName("cloudType")
  private V1CloudType cloudType = null;

  @SerializedName("machinePools")
  private List<V1MachinePoolMeta> machinePools = null;

  @SerializedName("uid")
  private String uid = null;

  public V1CloudConfigMeta cloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @Schema(description = "")
  public V1CloudType getCloudType() {
    return cloudType;
  }

  public void setCloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
  }

  public V1CloudConfigMeta machinePools(List<V1MachinePoolMeta> machinePools) {
    this.machinePools = machinePools;
    return this;
  }

  public V1CloudConfigMeta addMachinePoolsItem(V1MachinePoolMeta machinePoolsItem) {
    if (this.machinePools == null) {
      this.machinePools = new ArrayList<V1MachinePoolMeta>();
    }
    this.machinePools.add(machinePoolsItem);
    return this;
  }

   /**
   * Machine pool meta information
   * @return machinePools
  **/
  @Schema(description = "Machine pool meta information")
  public List<V1MachinePoolMeta> getMachinePools() {
    return machinePools;
  }

  public void setMachinePools(List<V1MachinePoolMeta> machinePools) {
    this.machinePools = machinePools;
  }

  public V1CloudConfigMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Cluster&#x27;s cloud config uid
   * @return uid
  **/
  @Schema(description = "Cluster's cloud config uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CloudConfigMeta v1CloudConfigMeta = (V1CloudConfigMeta) o;
    return Objects.equals(this.cloudType, v1CloudConfigMeta.cloudType) &&
        Objects.equals(this.machinePools, v1CloudConfigMeta.machinePools) &&
        Objects.equals(this.uid, v1CloudConfigMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, machinePools, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CloudConfigMeta {\n");
    
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    machinePools: ").append(toIndentedString(machinePools)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
