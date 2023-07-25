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
import com.spectrocloud.client.model.V1LibvirtNetworkSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Libvirt placement config
 */
@Schema(description = "Libvirt placement config")


public class V1LibvirtPlacementEntity {
  @SerializedName("dataStoragePool")
  private String dataStoragePool = null;

  @SerializedName("hostUid")
  private String hostUid = null;

  @SerializedName("networks")
  private List<V1LibvirtNetworkSpec> networks = null;

  @SerializedName("sourceStoragePool")
  private String sourceStoragePool = null;

  @SerializedName("targetStoragePool")
  private String targetStoragePool = null;

  public V1LibvirtPlacementEntity dataStoragePool(String dataStoragePool) {
    this.dataStoragePool = dataStoragePool;
    return this;
  }

   /**
   * Get dataStoragePool
   * @return dataStoragePool
  **/
  @Schema(description = "")
  public String getDataStoragePool() {
    return dataStoragePool;
  }

  public void setDataStoragePool(String dataStoragePool) {
    this.dataStoragePool = dataStoragePool;
  }

  public V1LibvirtPlacementEntity hostUid(String hostUid) {
    this.hostUid = hostUid;
    return this;
  }

   /**
   * Get hostUid
   * @return hostUid
  **/
  @Schema(required = true, description = "")
  public String getHostUid() {
    return hostUid;
  }

  public void setHostUid(String hostUid) {
    this.hostUid = hostUid;
  }

  public V1LibvirtPlacementEntity networks(List<V1LibvirtNetworkSpec> networks) {
    this.networks = networks;
    return this;
  }

  public V1LibvirtPlacementEntity addNetworksItem(V1LibvirtNetworkSpec networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<V1LibvirtNetworkSpec>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @Schema(description = "")
  public List<V1LibvirtNetworkSpec> getNetworks() {
    return networks;
  }

  public void setNetworks(List<V1LibvirtNetworkSpec> networks) {
    this.networks = networks;
  }

  public V1LibvirtPlacementEntity sourceStoragePool(String sourceStoragePool) {
    this.sourceStoragePool = sourceStoragePool;
    return this;
  }

   /**
   * Get sourceStoragePool
   * @return sourceStoragePool
  **/
  @Schema(description = "")
  public String getSourceStoragePool() {
    return sourceStoragePool;
  }

  public void setSourceStoragePool(String sourceStoragePool) {
    this.sourceStoragePool = sourceStoragePool;
  }

  public V1LibvirtPlacementEntity targetStoragePool(String targetStoragePool) {
    this.targetStoragePool = targetStoragePool;
    return this;
  }

   /**
   * Get targetStoragePool
   * @return targetStoragePool
  **/
  @Schema(description = "")
  public String getTargetStoragePool() {
    return targetStoragePool;
  }

  public void setTargetStoragePool(String targetStoragePool) {
    this.targetStoragePool = targetStoragePool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtPlacementEntity v1LibvirtPlacementEntity = (V1LibvirtPlacementEntity) o;
    return Objects.equals(this.dataStoragePool, v1LibvirtPlacementEntity.dataStoragePool) &&
        Objects.equals(this.hostUid, v1LibvirtPlacementEntity.hostUid) &&
        Objects.equals(this.networks, v1LibvirtPlacementEntity.networks) &&
        Objects.equals(this.sourceStoragePool, v1LibvirtPlacementEntity.sourceStoragePool) &&
        Objects.equals(this.targetStoragePool, v1LibvirtPlacementEntity.targetStoragePool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStoragePool, hostUid, networks, sourceStoragePool, targetStoragePool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtPlacementEntity {\n");
    
    sb.append("    dataStoragePool: ").append(toIndentedString(dataStoragePool)).append("\n");
    sb.append("    hostUid: ").append(toIndentedString(hostUid)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    sourceStoragePool: ").append(toIndentedString(sourceStoragePool)).append("\n");
    sb.append("    targetStoragePool: ").append(toIndentedString(targetStoragePool)).append("\n");
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