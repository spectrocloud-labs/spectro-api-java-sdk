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
 * LibvirtImage is the Image generated on the LibvirtHost
 */
@Schema(description = "LibvirtImage is the Image generated on the LibvirtHost")


public class V1LibvirtImage {
  @SerializedName("hostID")
  private String hostID = null;

  @SerializedName("imageName")
  private String imageName = null;

  @SerializedName("storagePool")
  private String storagePool = null;

  public V1LibvirtImage hostID(String hostID) {
    this.hostID = hostID;
    return this;
  }

   /**
   * HostID is the ID of the LibvirtHost
   * @return hostID
  **/
  @Schema(description = "HostID is the ID of the LibvirtHost")
  public String getHostID() {
    return hostID;
  }

  public void setHostID(String hostID) {
    this.hostID = hostID;
  }

  public V1LibvirtImage imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * ImageName is the name of the Libvirt image
   * @return imageName
  **/
  @Schema(description = "ImageName is the name of the Libvirt image")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public V1LibvirtImage storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

   /**
   * StoragePool is the name of the storagePool where is image is located
   * @return storagePool
  **/
  @Schema(description = "StoragePool is the name of the storagePool where is image is located")
  public String getStoragePool() {
    return storagePool;
  }

  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtImage v1LibvirtImage = (V1LibvirtImage) o;
    return Objects.equals(this.hostID, v1LibvirtImage.hostID) &&
        Objects.equals(this.imageName, v1LibvirtImage.imageName) &&
        Objects.equals(this.storagePool, v1LibvirtImage.storagePool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostID, imageName, storagePool);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtImage {\n");
    
    sb.append("    hostID: ").append(toIndentedString(hostID)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
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
