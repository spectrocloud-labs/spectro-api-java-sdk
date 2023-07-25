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
 * V1VmHypervTimer
 */



public class V1VmHypervTimer {
  @SerializedName("present")
  private Boolean present = null;

  public V1VmHypervTimer present(Boolean present) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmHypervTimer v1VmHypervTimer = (V1VmHypervTimer) o;
    return Objects.equals(this.present, v1VmHypervTimer.present);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmHypervTimer {\n");
    
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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
