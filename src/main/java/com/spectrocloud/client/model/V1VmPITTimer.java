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
 * V1VmPITTimer
 */



public class V1VmPITTimer {
  @SerializedName("present")
  private Boolean present = null;

  @SerializedName("tickPolicy")
  private String tickPolicy = null;

  public V1VmPITTimer present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * Enabled set to false makes sure that the machine type or a preset can&#x27;t add the timer. Defaults to true.
   * @return present
  **/
  @Schema(description = "Enabled set to false makes sure that the machine type or a preset can't add the timer. Defaults to true.")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  public V1VmPITTimer tickPolicy(String tickPolicy) {
    this.tickPolicy = tickPolicy;
    return this;
  }

   /**
   * TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of \&quot;delay\&quot;, \&quot;catchup\&quot;, \&quot;discard\&quot;.
   * @return tickPolicy
  **/
  @Schema(description = "TickPolicy determines what happens when QEMU misses a deadline for injecting a tick to the guest. One of \"delay\", \"catchup\", \"discard\".")
  public String getTickPolicy() {
    return tickPolicy;
  }

  public void setTickPolicy(String tickPolicy) {
    this.tickPolicy = tickPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmPITTimer v1VmPITTimer = (V1VmPITTimer) o;
    return Objects.equals(this.present, v1VmPITTimer.present) &&
        Objects.equals(this.tickPolicy, v1VmPITTimer.tickPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present, tickPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmPITTimer {\n");
    
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
    sb.append("    tickPolicy: ").append(toIndentedString(tickPolicy)).append("\n");
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
