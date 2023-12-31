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
 * V1VsphereInstanceType
 */



public class V1VsphereInstanceType {
  @SerializedName("diskGiB")
  private Integer diskGiB = null;

  @SerializedName("memoryMiB")
  private Long memoryMiB = null;

  @SerializedName("numCPUs")
  private Integer numCPUs = null;

  public V1VsphereInstanceType diskGiB(Integer diskGiB) {
    this.diskGiB = diskGiB;
    return this;
  }

   /**
   * DiskGiB is the size of a virtual machine&#x27;s disk, in GiB. Defaults to the analogue property value in the template from which this machine is cloned.
   * @return diskGiB
  **/
  @Schema(required = true, description = "DiskGiB is the size of a virtual machine's disk, in GiB. Defaults to the analogue property value in the template from which this machine is cloned.")
  public Integer getDiskGiB() {
    return diskGiB;
  }

  public void setDiskGiB(Integer diskGiB) {
    this.diskGiB = diskGiB;
  }

  public V1VsphereInstanceType memoryMiB(Long memoryMiB) {
    this.memoryMiB = memoryMiB;
    return this;
  }

   /**
   * MemoryMiB is the size of a virtual machine&#x27;s memory, in MiB. Defaults to the analogue property value in the template from which this machine is cloned.
   * @return memoryMiB
  **/
  @Schema(required = true, description = "MemoryMiB is the size of a virtual machine's memory, in MiB. Defaults to the analogue property value in the template from which this machine is cloned.")
  public Long getMemoryMiB() {
    return memoryMiB;
  }

  public void setMemoryMiB(Long memoryMiB) {
    this.memoryMiB = memoryMiB;
  }

  public V1VsphereInstanceType numCPUs(Integer numCPUs) {
    this.numCPUs = numCPUs;
    return this;
  }

   /**
   * NumCPUs is the number of virtual processors in a virtual machine. Defaults to the analogue property value in the template from which this machine is cloned.
   * @return numCPUs
  **/
  @Schema(required = true, description = "NumCPUs is the number of virtual processors in a virtual machine. Defaults to the analogue property value in the template from which this machine is cloned.")
  public Integer getNumCPUs() {
    return numCPUs;
  }

  public void setNumCPUs(Integer numCPUs) {
    this.numCPUs = numCPUs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereInstanceType v1VsphereInstanceType = (V1VsphereInstanceType) o;
    return Objects.equals(this.diskGiB, v1VsphereInstanceType.diskGiB) &&
        Objects.equals(this.memoryMiB, v1VsphereInstanceType.memoryMiB) &&
        Objects.equals(this.numCPUs, v1VsphereInstanceType.numCPUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskGiB, memoryMiB, numCPUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereInstanceType {\n");
    
    sb.append("    diskGiB: ").append(toIndentedString(diskGiB)).append("\n");
    sb.append("    memoryMiB: ").append(toIndentedString(memoryMiB)).append("\n");
    sb.append("    numCPUs: ").append(toIndentedString(numCPUs)).append("\n");
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
