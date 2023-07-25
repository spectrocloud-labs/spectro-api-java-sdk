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
import com.spectrocloud.client.model.V1VmKernelBootContainer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents the firmware blob used to assist in the kernel boot process. Used for setting the kernel, initrd and command line arguments
 */
@Schema(description = "Represents the firmware blob used to assist in the kernel boot process. Used for setting the kernel, initrd and command line arguments")


public class V1VmKernelBoot {
  @SerializedName("container")
  private V1VmKernelBootContainer container = null;

  @SerializedName("kernelArgs")
  private String kernelArgs = null;

  public V1VmKernelBoot container(V1VmKernelBootContainer container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @Schema(description = "")
  public V1VmKernelBootContainer getContainer() {
    return container;
  }

  public void setContainer(V1VmKernelBootContainer container) {
    this.container = container;
  }

  public V1VmKernelBoot kernelArgs(String kernelArgs) {
    this.kernelArgs = kernelArgs;
    return this;
  }

   /**
   * Arguments to be passed to the kernel at boot time
   * @return kernelArgs
  **/
  @Schema(description = "Arguments to be passed to the kernel at boot time")
  public String getKernelArgs() {
    return kernelArgs;
  }

  public void setKernelArgs(String kernelArgs) {
    this.kernelArgs = kernelArgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmKernelBoot v1VmKernelBoot = (V1VmKernelBoot) o;
    return Objects.equals(this.container, v1VmKernelBoot.container) &&
        Objects.equals(this.kernelArgs, v1VmKernelBoot.kernelArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, kernelArgs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmKernelBoot {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    kernelArgs: ").append(toIndentedString(kernelArgs)).append("\n");
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