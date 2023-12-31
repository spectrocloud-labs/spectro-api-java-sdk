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
import com.spectrocloud.client.model.V1VmBootloader;
import com.spectrocloud.client.model.V1VmKernelBoot;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VmFirmware
 */



public class V1VmFirmware {
  @SerializedName("bootloader")
  private V1VmBootloader bootloader = null;

  @SerializedName("kernelBoot")
  private V1VmKernelBoot kernelBoot = null;

  @SerializedName("serial")
  private String serial = null;

  @SerializedName("uuid")
  private String uuid = null;

  public V1VmFirmware bootloader(V1VmBootloader bootloader) {
    this.bootloader = bootloader;
    return this;
  }

   /**
   * Get bootloader
   * @return bootloader
  **/
  @Schema(description = "")
  public V1VmBootloader getBootloader() {
    return bootloader;
  }

  public void setBootloader(V1VmBootloader bootloader) {
    this.bootloader = bootloader;
  }

  public V1VmFirmware kernelBoot(V1VmKernelBoot kernelBoot) {
    this.kernelBoot = kernelBoot;
    return this;
  }

   /**
   * Get kernelBoot
   * @return kernelBoot
  **/
  @Schema(description = "")
  public V1VmKernelBoot getKernelBoot() {
    return kernelBoot;
  }

  public void setKernelBoot(V1VmKernelBoot kernelBoot) {
    this.kernelBoot = kernelBoot;
  }

  public V1VmFirmware serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * The system-serial-number in SMBIOS
   * @return serial
  **/
  @Schema(description = "The system-serial-number in SMBIOS")
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public V1VmFirmware uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID reported by the vmi bios. Defaults to a random generated uid.
   * @return uuid
  **/
  @Schema(description = "UUID reported by the vmi bios. Defaults to a random generated uid.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmFirmware v1VmFirmware = (V1VmFirmware) o;
    return Objects.equals(this.bootloader, v1VmFirmware.bootloader) &&
        Objects.equals(this.kernelBoot, v1VmFirmware.kernelBoot) &&
        Objects.equals(this.serial, v1VmFirmware.serial) &&
        Objects.equals(this.uuid, v1VmFirmware.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootloader, kernelBoot, serial, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmFirmware {\n");
    
    sb.append("    bootloader: ").append(toIndentedString(bootloader)).append("\n");
    sb.append("    kernelBoot: ").append(toIndentedString(kernelBoot)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
