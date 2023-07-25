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
import com.spectrocloud.client.model.V1VmChassis;
import com.spectrocloud.client.model.V1VmClock;
import com.spectrocloud.client.model.V1VmCpu;
import com.spectrocloud.client.model.V1VmDevices;
import com.spectrocloud.client.model.V1VmFeatures;
import com.spectrocloud.client.model.V1VmFirmware;
import com.spectrocloud.client.model.V1VmLaunchSecurity;
import com.spectrocloud.client.model.V1VmMachine;
import com.spectrocloud.client.model.V1VmMemory;
import com.spectrocloud.client.model.V1VmResourceRequirements;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VmDomainSpec
 */



public class V1VmDomainSpec {
  @SerializedName("chassis")
  private V1VmChassis chassis = null;

  @SerializedName("clock")
  private V1VmClock clock = null;

  @SerializedName("cpu")
  private V1VmCpu cpu = null;

  @SerializedName("devices")
  private V1VmDevices devices = null;

  @SerializedName("features")
  private V1VmFeatures features = null;

  @SerializedName("firmware")
  private V1VmFirmware firmware = null;

  @SerializedName("ioThreadsPolicy")
  private String ioThreadsPolicy = null;

  @SerializedName("launchSecurity")
  private V1VmLaunchSecurity launchSecurity = null;

  @SerializedName("machine")
  private V1VmMachine machine = null;

  @SerializedName("memory")
  private V1VmMemory memory = null;

  @SerializedName("resources")
  private V1VmResourceRequirements resources = null;

  public V1VmDomainSpec chassis(V1VmChassis chassis) {
    this.chassis = chassis;
    return this;
  }

   /**
   * Get chassis
   * @return chassis
  **/
  @Schema(description = "")
  public V1VmChassis getChassis() {
    return chassis;
  }

  public void setChassis(V1VmChassis chassis) {
    this.chassis = chassis;
  }

  public V1VmDomainSpec clock(V1VmClock clock) {
    this.clock = clock;
    return this;
  }

   /**
   * Get clock
   * @return clock
  **/
  @Schema(description = "")
  public V1VmClock getClock() {
    return clock;
  }

  public void setClock(V1VmClock clock) {
    this.clock = clock;
  }

  public V1VmDomainSpec cpu(V1VmCpu cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @Schema(description = "")
  public V1VmCpu getCpu() {
    return cpu;
  }

  public void setCpu(V1VmCpu cpu) {
    this.cpu = cpu;
  }

  public V1VmDomainSpec devices(V1VmDevices devices) {
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @Schema(required = true, description = "")
  public V1VmDevices getDevices() {
    return devices;
  }

  public void setDevices(V1VmDevices devices) {
    this.devices = devices;
  }

  public V1VmDomainSpec features(V1VmFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(description = "")
  public V1VmFeatures getFeatures() {
    return features;
  }

  public void setFeatures(V1VmFeatures features) {
    this.features = features;
  }

  public V1VmDomainSpec firmware(V1VmFirmware firmware) {
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @Schema(description = "")
  public V1VmFirmware getFirmware() {
    return firmware;
  }

  public void setFirmware(V1VmFirmware firmware) {
    this.firmware = firmware;
  }

  public V1VmDomainSpec ioThreadsPolicy(String ioThreadsPolicy) {
    this.ioThreadsPolicy = ioThreadsPolicy;
    return this;
  }

   /**
   * Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared, auto
   * @return ioThreadsPolicy
  **/
  @Schema(description = "Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared, auto")
  public String getIoThreadsPolicy() {
    return ioThreadsPolicy;
  }

  public void setIoThreadsPolicy(String ioThreadsPolicy) {
    this.ioThreadsPolicy = ioThreadsPolicy;
  }

  public V1VmDomainSpec launchSecurity(V1VmLaunchSecurity launchSecurity) {
    this.launchSecurity = launchSecurity;
    return this;
  }

   /**
   * Get launchSecurity
   * @return launchSecurity
  **/
  @Schema(description = "")
  public V1VmLaunchSecurity getLaunchSecurity() {
    return launchSecurity;
  }

  public void setLaunchSecurity(V1VmLaunchSecurity launchSecurity) {
    this.launchSecurity = launchSecurity;
  }

  public V1VmDomainSpec machine(V1VmMachine machine) {
    this.machine = machine;
    return this;
  }

   /**
   * Get machine
   * @return machine
  **/
  @Schema(description = "")
  public V1VmMachine getMachine() {
    return machine;
  }

  public void setMachine(V1VmMachine machine) {
    this.machine = machine;
  }

  public V1VmDomainSpec memory(V1VmMemory memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @Schema(description = "")
  public V1VmMemory getMemory() {
    return memory;
  }

  public void setMemory(V1VmMemory memory) {
    this.memory = memory;
  }

  public V1VmDomainSpec resources(V1VmResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(description = "")
  public V1VmResourceRequirements getResources() {
    return resources;
  }

  public void setResources(V1VmResourceRequirements resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmDomainSpec v1VmDomainSpec = (V1VmDomainSpec) o;
    return Objects.equals(this.chassis, v1VmDomainSpec.chassis) &&
        Objects.equals(this.clock, v1VmDomainSpec.clock) &&
        Objects.equals(this.cpu, v1VmDomainSpec.cpu) &&
        Objects.equals(this.devices, v1VmDomainSpec.devices) &&
        Objects.equals(this.features, v1VmDomainSpec.features) &&
        Objects.equals(this.firmware, v1VmDomainSpec.firmware) &&
        Objects.equals(this.ioThreadsPolicy, v1VmDomainSpec.ioThreadsPolicy) &&
        Objects.equals(this.launchSecurity, v1VmDomainSpec.launchSecurity) &&
        Objects.equals(this.machine, v1VmDomainSpec.machine) &&
        Objects.equals(this.memory, v1VmDomainSpec.memory) &&
        Objects.equals(this.resources, v1VmDomainSpec.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chassis, clock, cpu, devices, features, firmware, ioThreadsPolicy, launchSecurity, machine, memory, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDomainSpec {\n");
    
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    ioThreadsPolicy: ").append(toIndentedString(ioThreadsPolicy)).append("\n");
    sb.append("    launchSecurity: ").append(toIndentedString(launchSecurity)).append("\n");
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
