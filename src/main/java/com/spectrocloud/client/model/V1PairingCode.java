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
 * Pairing code response
 */
@Schema(description = "Pairing code response")


public class V1PairingCode {
  @SerializedName("pairingCode")
  private String pairingCode = null;

  public V1PairingCode pairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
    return this;
  }

   /**
   * Get pairingCode
   * @return pairingCode
  **/
  @Schema(description = "")
  public String getPairingCode() {
    return pairingCode;
  }

  public void setPairingCode(String pairingCode) {
    this.pairingCode = pairingCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PairingCode v1PairingCode = (V1PairingCode) o;
    return Objects.equals(this.pairingCode, v1PairingCode.pairingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PairingCode {\n");
    
    sb.append("    pairingCode: ").append(toIndentedString(pairingCode)).append("\n");
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
