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
import com.spectrocloud.client.model.V1VmTypedLocalObjectReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VirtualMachineSnapshotSpec is the spec for a VirtualMachineSnapshot resource
 */
@Schema(description = "VirtualMachineSnapshotSpec is the spec for a VirtualMachineSnapshot resource")


public class V1VirtualMachineSnapshotSpec {
  @SerializedName("deletionPolicy")
  private String deletionPolicy = null;

  @SerializedName("failureDeadline")
  private String failureDeadline = null;

  @SerializedName("source")
  private V1VmTypedLocalObjectReference source = null;

  public V1VirtualMachineSnapshotSpec deletionPolicy(String deletionPolicy) {
    this.deletionPolicy = deletionPolicy;
    return this;
  }

   /**
   * Get deletionPolicy
   * @return deletionPolicy
  **/
  @Schema(description = "")
  public String getDeletionPolicy() {
    return deletionPolicy;
  }

  public void setDeletionPolicy(String deletionPolicy) {
    this.deletionPolicy = deletionPolicy;
  }

  public V1VirtualMachineSnapshotSpec failureDeadline(String failureDeadline) {
    this.failureDeadline = failureDeadline;
    return this;
  }

   /**
   * Get failureDeadline
   * @return failureDeadline
  **/
  @Schema(description = "")
  public String getFailureDeadline() {
    return failureDeadline;
  }

  public void setFailureDeadline(String failureDeadline) {
    this.failureDeadline = failureDeadline;
  }

  public V1VirtualMachineSnapshotSpec source(V1VmTypedLocalObjectReference source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public V1VmTypedLocalObjectReference getSource() {
    return source;
  }

  public void setSource(V1VmTypedLocalObjectReference source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VirtualMachineSnapshotSpec v1VirtualMachineSnapshotSpec = (V1VirtualMachineSnapshotSpec) o;
    return Objects.equals(this.deletionPolicy, v1VirtualMachineSnapshotSpec.deletionPolicy) &&
        Objects.equals(this.failureDeadline, v1VirtualMachineSnapshotSpec.failureDeadline) &&
        Objects.equals(this.source, v1VirtualMachineSnapshotSpec.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionPolicy, failureDeadline, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VirtualMachineSnapshotSpec {\n");
    
    sb.append("    deletionPolicy: ").append(toIndentedString(deletionPolicy)).append("\n");
    sb.append("    failureDeadline: ").append(toIndentedString(failureDeadline)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
