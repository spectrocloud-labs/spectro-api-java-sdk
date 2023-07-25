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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Represent a subset of client devices that can be accessed by VMI. At the moment only, USB devices using Usbredir&#x27;s library and tooling. Another fit would be a smartcard with libcacard.  The struct is currently empty as there is no immediate request for user-facing APIs. This structure simply turns on USB redirection of UsbClientPassthroughMaxNumberOf devices.
 */
@Schema(description = "Represent a subset of client devices that can be accessed by VMI. At the moment only, USB devices using Usbredir's library and tooling. Another fit would be a smartcard with libcacard.  The struct is currently empty as there is no immediate request for user-facing APIs. This structure simply turns on USB redirection of UsbClientPassthroughMaxNumberOf devices.")


public class V1VmClientPassthroughDevices {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmClientPassthroughDevices {\n");
    
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
