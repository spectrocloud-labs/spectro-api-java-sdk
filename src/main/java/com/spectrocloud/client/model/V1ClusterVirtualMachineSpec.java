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
import com.spectrocloud.client.model.V1VmDataVolumeTemplateSpec;
import com.spectrocloud.client.model.V1VmInstancetypeMatcher;
import com.spectrocloud.client.model.V1VmPreferenceMatcher;
import com.spectrocloud.client.model.V1VmVirtualMachineInstanceTemplateSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VirtualMachineSpec describes how the proper VirtualMachine should look like
 */
@Schema(description = "VirtualMachineSpec describes how the proper VirtualMachine should look like")


public class V1ClusterVirtualMachineSpec {
  @SerializedName("dataVolumeTemplates")
  private List<V1VmDataVolumeTemplateSpec> dataVolumeTemplates = null;

  @SerializedName("instancetype")
  private V1VmInstancetypeMatcher instancetype = null;

  @SerializedName("preference")
  private V1VmPreferenceMatcher preference = null;

  @SerializedName("runStrategy")
  private String runStrategy = null;

  @SerializedName("running")
  private Boolean running = null;

  @SerializedName("template")
  private V1VmVirtualMachineInstanceTemplateSpec template = null;

  public V1ClusterVirtualMachineSpec dataVolumeTemplates(List<V1VmDataVolumeTemplateSpec> dataVolumeTemplates) {
    this.dataVolumeTemplates = dataVolumeTemplates;
    return this;
  }

  public V1ClusterVirtualMachineSpec addDataVolumeTemplatesItem(V1VmDataVolumeTemplateSpec dataVolumeTemplatesItem) {
    if (this.dataVolumeTemplates == null) {
      this.dataVolumeTemplates = new ArrayList<V1VmDataVolumeTemplateSpec>();
    }
    this.dataVolumeTemplates.add(dataVolumeTemplatesItem);
    return this;
  }

   /**
   * dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this list are dynamically created for the VirtualMachine and are tied to the VirtualMachine&#x27;s life-cycle.
   * @return dataVolumeTemplates
  **/
  @Schema(description = "dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this list are dynamically created for the VirtualMachine and are tied to the VirtualMachine's life-cycle.")
  public List<V1VmDataVolumeTemplateSpec> getDataVolumeTemplates() {
    return dataVolumeTemplates;
  }

  public void setDataVolumeTemplates(List<V1VmDataVolumeTemplateSpec> dataVolumeTemplates) {
    this.dataVolumeTemplates = dataVolumeTemplates;
  }

  public V1ClusterVirtualMachineSpec instancetype(V1VmInstancetypeMatcher instancetype) {
    this.instancetype = instancetype;
    return this;
  }

   /**
   * Get instancetype
   * @return instancetype
  **/
  @Schema(description = "")
  public V1VmInstancetypeMatcher getInstancetype() {
    return instancetype;
  }

  public void setInstancetype(V1VmInstancetypeMatcher instancetype) {
    this.instancetype = instancetype;
  }

  public V1ClusterVirtualMachineSpec preference(V1VmPreferenceMatcher preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Get preference
   * @return preference
  **/
  @Schema(description = "")
  public V1VmPreferenceMatcher getPreference() {
    return preference;
  }

  public void setPreference(V1VmPreferenceMatcher preference) {
    this.preference = preference;
  }

  public V1ClusterVirtualMachineSpec runStrategy(String runStrategy) {
    this.runStrategy = runStrategy;
    return this;
  }

   /**
   * Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running
   * @return runStrategy
  **/
  @Schema(description = "Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running")
  public String getRunStrategy() {
    return runStrategy;
  }

  public void setRunStrategy(String runStrategy) {
    this.runStrategy = runStrategy;
  }

  public V1ClusterVirtualMachineSpec running(Boolean running) {
    this.running = running;
    return this;
  }

   /**
   * Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy
   * @return running
  **/
  @Schema(description = "Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy")
  public Boolean isRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public V1ClusterVirtualMachineSpec template(V1VmVirtualMachineInstanceTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(required = true, description = "")
  public V1VmVirtualMachineInstanceTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1VmVirtualMachineInstanceTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterVirtualMachineSpec v1ClusterVirtualMachineSpec = (V1ClusterVirtualMachineSpec) o;
    return Objects.equals(this.dataVolumeTemplates, v1ClusterVirtualMachineSpec.dataVolumeTemplates) &&
        Objects.equals(this.instancetype, v1ClusterVirtualMachineSpec.instancetype) &&
        Objects.equals(this.preference, v1ClusterVirtualMachineSpec.preference) &&
        Objects.equals(this.runStrategy, v1ClusterVirtualMachineSpec.runStrategy) &&
        Objects.equals(this.running, v1ClusterVirtualMachineSpec.running) &&
        Objects.equals(this.template, v1ClusterVirtualMachineSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVolumeTemplates, instancetype, preference, runStrategy, running, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterVirtualMachineSpec {\n");
    
    sb.append("    dataVolumeTemplates: ").append(toIndentedString(dataVolumeTemplates)).append("\n");
    sb.append("    instancetype: ").append(toIndentedString(instancetype)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    runStrategy: ").append(toIndentedString(runStrategy)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
