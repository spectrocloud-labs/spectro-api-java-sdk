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
 * V1VirtualInstanceType
 */



public class V1VirtualInstanceType {
  @SerializedName("maxCPU")
  private Integer maxCPU = null;

  @SerializedName("maxMemInMiB")
  private Integer maxMemInMiB = null;

  @SerializedName("maxStorageGiB")
  private Integer maxStorageGiB = null;

  @SerializedName("minCPU")
  private Integer minCPU = null;

  @SerializedName("minMemInMiB")
  private Integer minMemInMiB = null;

  @SerializedName("minStorageGiB")
  private Integer minStorageGiB = null;

  public V1VirtualInstanceType maxCPU(Integer maxCPU) {
    this.maxCPU = maxCPU;
    return this;
  }

   /**
   * Maximum CPU cores
   * @return maxCPU
  **/
  @Schema(description = "Maximum CPU cores")
  public Integer getMaxCPU() {
    return maxCPU;
  }

  public void setMaxCPU(Integer maxCPU) {
    this.maxCPU = maxCPU;
  }

  public V1VirtualInstanceType maxMemInMiB(Integer maxMemInMiB) {
    this.maxMemInMiB = maxMemInMiB;
    return this;
  }

   /**
   * Maximum memory in MiB
   * @return maxMemInMiB
  **/
  @Schema(description = "Maximum memory in MiB")
  public Integer getMaxMemInMiB() {
    return maxMemInMiB;
  }

  public void setMaxMemInMiB(Integer maxMemInMiB) {
    this.maxMemInMiB = maxMemInMiB;
  }

  public V1VirtualInstanceType maxStorageGiB(Integer maxStorageGiB) {
    this.maxStorageGiB = maxStorageGiB;
    return this;
  }

   /**
   * Maximum storage in GiB
   * @return maxStorageGiB
  **/
  @Schema(description = "Maximum storage in GiB")
  public Integer getMaxStorageGiB() {
    return maxStorageGiB;
  }

  public void setMaxStorageGiB(Integer maxStorageGiB) {
    this.maxStorageGiB = maxStorageGiB;
  }

  public V1VirtualInstanceType minCPU(Integer minCPU) {
    this.minCPU = minCPU;
    return this;
  }

   /**
   * Minimum CPU cores
   * @return minCPU
  **/
  @Schema(description = "Minimum CPU cores")
  public Integer getMinCPU() {
    return minCPU;
  }

  public void setMinCPU(Integer minCPU) {
    this.minCPU = minCPU;
  }

  public V1VirtualInstanceType minMemInMiB(Integer minMemInMiB) {
    this.minMemInMiB = minMemInMiB;
    return this;
  }

   /**
   * Minimum memory in MiB
   * @return minMemInMiB
  **/
  @Schema(description = "Minimum memory in MiB")
  public Integer getMinMemInMiB() {
    return minMemInMiB;
  }

  public void setMinMemInMiB(Integer minMemInMiB) {
    this.minMemInMiB = minMemInMiB;
  }

  public V1VirtualInstanceType minStorageGiB(Integer minStorageGiB) {
    this.minStorageGiB = minStorageGiB;
    return this;
  }

   /**
   * Minimum storage in GiB
   * @return minStorageGiB
  **/
  @Schema(description = "Minimum storage in GiB")
  public Integer getMinStorageGiB() {
    return minStorageGiB;
  }

  public void setMinStorageGiB(Integer minStorageGiB) {
    this.minStorageGiB = minStorageGiB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualInstanceType v1VirtualInstanceType = (V1VirtualInstanceType) o;
    return Objects.equals(this.maxCPU, v1VirtualInstanceType.maxCPU) &&
        Objects.equals(this.maxMemInMiB, v1VirtualInstanceType.maxMemInMiB) &&
        Objects.equals(this.maxStorageGiB, v1VirtualInstanceType.maxStorageGiB) &&
        Objects.equals(this.minCPU, v1VirtualInstanceType.minCPU) &&
        Objects.equals(this.minMemInMiB, v1VirtualInstanceType.minMemInMiB) &&
        Objects.equals(this.minStorageGiB, v1VirtualInstanceType.minStorageGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCPU, maxMemInMiB, maxStorageGiB, minCPU, minMemInMiB, minStorageGiB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualInstanceType {\n");
    
    sb.append("    maxCPU: ").append(toIndentedString(maxCPU)).append("\n");
    sb.append("    maxMemInMiB: ").append(toIndentedString(maxMemInMiB)).append("\n");
    sb.append("    maxStorageGiB: ").append(toIndentedString(maxStorageGiB)).append("\n");
    sb.append("    minCPU: ").append(toIndentedString(minCPU)).append("\n");
    sb.append("    minMemInMiB: ").append(toIndentedString(minMemInMiB)).append("\n");
    sb.append("    minStorageGiB: ").append(toIndentedString(minStorageGiB)).append("\n");
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
