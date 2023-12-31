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
import com.spectrocloud.client.model.V1VsphereImage;
import com.spectrocloud.client.model.V1VsphereInstanceType;
import com.spectrocloud.client.model.V1VsphereNic;
import com.spectrocloud.client.model.V1VspherePlacementConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * vSphere cloud VM definition spec
 */
@Schema(description = "vSphere cloud VM definition spec")


public class V1VsphereMachineSpec {
  @SerializedName("images")
  private List<V1VsphereImage> images = null;

  @SerializedName("instanceType")
  private V1VsphereInstanceType instanceType = null;

  @SerializedName("nics")
  private List<V1VsphereNic> nics = new ArrayList<V1VsphereNic>();

  @SerializedName("ntpServers")
  private List<String> ntpServers = null;

  @SerializedName("placement")
  private V1VspherePlacementConfig placement = null;

  @SerializedName("vcenterServer")
  private String vcenterServer = null;

  public V1VsphereMachineSpec images(List<V1VsphereImage> images) {
    this.images = images;
    return this;
  }

  public V1VsphereMachineSpec addImagesItem(V1VsphereImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<V1VsphereImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @Schema(description = "")
  public List<V1VsphereImage> getImages() {
    return images;
  }

  public void setImages(List<V1VsphereImage> images) {
    this.images = images;
  }

  public V1VsphereMachineSpec instanceType(V1VsphereInstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public V1VsphereInstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(V1VsphereInstanceType instanceType) {
    this.instanceType = instanceType;
  }

  public V1VsphereMachineSpec nics(List<V1VsphereNic> nics) {
    this.nics = nics;
    return this;
  }

  public V1VsphereMachineSpec addNicsItem(V1VsphereNic nicsItem) {
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * Get nics
   * @return nics
  **/
  @Schema(required = true, description = "")
  public List<V1VsphereNic> getNics() {
    return nics;
  }

  public void setNics(List<V1VsphereNic> nics) {
    this.nics = nics;
  }

  public V1VsphereMachineSpec ntpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
    return this;
  }

  public V1VsphereMachineSpec addNtpServersItem(String ntpServersItem) {
    if (this.ntpServers == null) {
      this.ntpServers = new ArrayList<String>();
    }
    this.ntpServers.add(ntpServersItem);
    return this;
  }

   /**
   * NTPServers is a list of NTP servers to use instead of the machine image&#x27;s default NTP server list.
   * @return ntpServers
  **/
  @Schema(description = "NTPServers is a list of NTP servers to use instead of the machine image's default NTP server list.")
  public List<String> getNtpServers() {
    return ntpServers;
  }

  public void setNtpServers(List<String> ntpServers) {
    this.ntpServers = ntpServers;
  }

  public V1VsphereMachineSpec placement(V1VspherePlacementConfig placement) {
    this.placement = placement;
    return this;
  }

   /**
   * Get placement
   * @return placement
  **/
  @Schema(required = true, description = "")
  public V1VspherePlacementConfig getPlacement() {
    return placement;
  }

  public void setPlacement(V1VspherePlacementConfig placement) {
    this.placement = placement;
  }

  public V1VsphereMachineSpec vcenterServer(String vcenterServer) {
    this.vcenterServer = vcenterServer;
    return this;
  }

   /**
   * VcenterServer is the address of the vSphere endpoint
   * @return vcenterServer
  **/
  @Schema(required = true, description = "VcenterServer is the address of the vSphere endpoint")
  public String getVcenterServer() {
    return vcenterServer;
  }

  public void setVcenterServer(String vcenterServer) {
    this.vcenterServer = vcenterServer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereMachineSpec v1VsphereMachineSpec = (V1VsphereMachineSpec) o;
    return Objects.equals(this.images, v1VsphereMachineSpec.images) &&
        Objects.equals(this.instanceType, v1VsphereMachineSpec.instanceType) &&
        Objects.equals(this.nics, v1VsphereMachineSpec.nics) &&
        Objects.equals(this.ntpServers, v1VsphereMachineSpec.ntpServers) &&
        Objects.equals(this.placement, v1VsphereMachineSpec.placement) &&
        Objects.equals(this.vcenterServer, v1VsphereMachineSpec.vcenterServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, instanceType, nics, ntpServers, placement, vcenterServer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereMachineSpec {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    vcenterServer: ").append(toIndentedString(vcenterServer)).append("\n");
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
