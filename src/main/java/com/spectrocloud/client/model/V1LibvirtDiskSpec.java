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
 * V1LibvirtDiskSpec
 */



public class V1LibvirtDiskSpec {
  @SerializedName("dataStoragePool")
  private String dataStoragePool = null;

  @SerializedName("managed")
  private Boolean managed = null;

  @SerializedName("sizeInGB")
  private Integer sizeInGB = null;

  public V1LibvirtDiskSpec dataStoragePool(String dataStoragePool) {
    this.dataStoragePool = dataStoragePool;
    return this;
  }

   /**
   * DataStoragePool is the storage pool from which additional disks are assigned
   * @return dataStoragePool
  **/
  @Schema(description = "DataStoragePool is the storage pool from which additional disks are assigned")
  public String getDataStoragePool() {
    return dataStoragePool;
  }

  public void setDataStoragePool(String dataStoragePool) {
    this.dataStoragePool = dataStoragePool;
  }

  public V1LibvirtDiskSpec managed(Boolean managed) {
    this.managed = managed;
    return this;
  }

   /**
   * Managed indicates if the disk is a persistent or not. By default its false indicating all disks are ephemeral.
   * @return managed
  **/
  @Schema(description = "Managed indicates if the disk is a persistent or not. By default its false indicating all disks are ephemeral.")
  public Boolean isManaged() {
    return managed;
  }

  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  public V1LibvirtDiskSpec sizeInGB(Integer sizeInGB) {
    this.sizeInGB = sizeInGB;
    return this;
  }

   /**
   * SizeInGB is the target size in GB of the disk to be added
   * @return sizeInGB
  **/
  @Schema(required = true, description = "SizeInGB is the target size in GB of the disk to be added")
  public Integer getSizeInGB() {
    return sizeInGB;
  }

  public void setSizeInGB(Integer sizeInGB) {
    this.sizeInGB = sizeInGB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LibvirtDiskSpec v1LibvirtDiskSpec = (V1LibvirtDiskSpec) o;
    return Objects.equals(this.dataStoragePool, v1LibvirtDiskSpec.dataStoragePool) &&
        Objects.equals(this.managed, v1LibvirtDiskSpec.managed) &&
        Objects.equals(this.sizeInGB, v1LibvirtDiskSpec.sizeInGB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataStoragePool, managed, sizeInGB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LibvirtDiskSpec {\n");
    
    sb.append("    dataStoragePool: ").append(toIndentedString(dataStoragePool)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    sizeInGB: ").append(toIndentedString(sizeInGB)).append("\n");
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
