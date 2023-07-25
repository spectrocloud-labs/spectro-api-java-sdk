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
import com.spectrocloud.client.model.V1ClusterVirtualMachineSpec;
import com.spectrocloud.client.model.V1ClusterVirtualMachineStatus;
import com.spectrocloud.client.model.V1VmObjectMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VirtualMachine handles the VirtualMachines that are not running or are in a stopped state The VirtualMachine contains the template to create the VirtualMachineInstance. It also mirrors the running state of the created VirtualMachineInstance in its status.
 */
@Schema(description = "VirtualMachine handles the VirtualMachines that are not running or are in a stopped state The VirtualMachine contains the template to create the VirtualMachineInstance. It also mirrors the running state of the created VirtualMachineInstance in its status.")


public class V1ClusterVirtualMachine {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1VmObjectMeta metadata = null;

  @SerializedName("spec")
  private V1ClusterVirtualMachineSpec spec = null;

  @SerializedName("status")
  private V1ClusterVirtualMachineStatus status = null;

  public V1ClusterVirtualMachine apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * @return apiVersion
  **/
  @Schema(description = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1ClusterVirtualMachine kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase.
   * @return kind
  **/
  @Schema(description = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1ClusterVirtualMachine metadata(V1VmObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1VmObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1VmObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1ClusterVirtualMachine spec(V1ClusterVirtualMachineSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(required = true, description = "")
  public V1ClusterVirtualMachineSpec getSpec() {
    return spec;
  }

  public void setSpec(V1ClusterVirtualMachineSpec spec) {
    this.spec = spec;
  }

  public V1ClusterVirtualMachine status(V1ClusterVirtualMachineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1ClusterVirtualMachineStatus getStatus() {
    return status;
  }

  public void setStatus(V1ClusterVirtualMachineStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterVirtualMachine v1ClusterVirtualMachine = (V1ClusterVirtualMachine) o;
    return Objects.equals(this.apiVersion, v1ClusterVirtualMachine.apiVersion) &&
        Objects.equals(this.kind, v1ClusterVirtualMachine.kind) &&
        Objects.equals(this.metadata, v1ClusterVirtualMachine.metadata) &&
        Objects.equals(this.spec, v1ClusterVirtualMachine.spec) &&
        Objects.equals(this.status, v1ClusterVirtualMachine.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterVirtualMachine {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
