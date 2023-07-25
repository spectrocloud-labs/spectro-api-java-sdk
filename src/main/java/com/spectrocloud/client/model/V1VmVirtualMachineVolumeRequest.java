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
import com.spectrocloud.client.model.V1VmAddVolumeOptions;
import com.spectrocloud.client.model.V1VmRemoveVolumeOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1VmVirtualMachineVolumeRequest
 */



public class V1VmVirtualMachineVolumeRequest {
  @SerializedName("addVolumeOptions")
  private V1VmAddVolumeOptions addVolumeOptions = null;

  @SerializedName("removeVolumeOptions")
  private V1VmRemoveVolumeOptions removeVolumeOptions = null;

  public V1VmVirtualMachineVolumeRequest addVolumeOptions(V1VmAddVolumeOptions addVolumeOptions) {
    this.addVolumeOptions = addVolumeOptions;
    return this;
  }

   /**
   * Get addVolumeOptions
   * @return addVolumeOptions
  **/
  @Schema(description = "")
  public V1VmAddVolumeOptions getAddVolumeOptions() {
    return addVolumeOptions;
  }

  public void setAddVolumeOptions(V1VmAddVolumeOptions addVolumeOptions) {
    this.addVolumeOptions = addVolumeOptions;
  }

  public V1VmVirtualMachineVolumeRequest removeVolumeOptions(V1VmRemoveVolumeOptions removeVolumeOptions) {
    this.removeVolumeOptions = removeVolumeOptions;
    return this;
  }

   /**
   * Get removeVolumeOptions
   * @return removeVolumeOptions
  **/
  @Schema(description = "")
  public V1VmRemoveVolumeOptions getRemoveVolumeOptions() {
    return removeVolumeOptions;
  }

  public void setRemoveVolumeOptions(V1VmRemoveVolumeOptions removeVolumeOptions) {
    this.removeVolumeOptions = removeVolumeOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmVirtualMachineVolumeRequest v1VmVirtualMachineVolumeRequest = (V1VmVirtualMachineVolumeRequest) o;
    return Objects.equals(this.addVolumeOptions, v1VmVirtualMachineVolumeRequest.addVolumeOptions) &&
        Objects.equals(this.removeVolumeOptions, v1VmVirtualMachineVolumeRequest.removeVolumeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addVolumeOptions, removeVolumeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmVirtualMachineVolumeRequest {\n");
    
    sb.append("    addVolumeOptions: ").append(toIndentedString(addVolumeOptions)).append("\n");
    sb.append("    removeVolumeOptions: ").append(toIndentedString(removeVolumeOptions)).append("\n");
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
