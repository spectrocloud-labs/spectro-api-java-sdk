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
 * SamlCallbackBody
 */



public class SamlCallbackBody {
  @SerializedName("SAMLResponse")
  private String saMLResponse = null;

  @SerializedName("RelayState")
  private String relayState = null;

  public SamlCallbackBody saMLResponse(String saMLResponse) {
    this.saMLResponse = saMLResponse;
    return this;
  }

   /**
   * Describe the SAML compliant response sent by IDP which will be validated by Palette
   * @return saMLResponse
  **/
  @Schema(description = "Describe the SAML compliant response sent by IDP which will be validated by Palette")
  public String getSaMLResponse() {
    return saMLResponse;
  }

  public void setSaMLResponse(String saMLResponse) {
    this.saMLResponse = saMLResponse;
  }

  public SamlCallbackBody relayState(String relayState) {
    this.relayState = relayState;
    return this;
  }

   /**
   * Describes a state to validate and associate request and response
   * @return relayState
  **/
  @Schema(description = "Describes a state to validate and associate request and response")
  public String getRelayState() {
    return relayState;
  }

  public void setRelayState(String relayState) {
    this.relayState = relayState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlCallbackBody samlCallbackBody = (SamlCallbackBody) o;
    return Objects.equals(this.saMLResponse, samlCallbackBody.saMLResponse) &&
        Objects.equals(this.relayState, samlCallbackBody.relayState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saMLResponse, relayState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlCallbackBody {\n");
    
    sb.append("    saMLResponse: ").append(toIndentedString(saMLResponse)).append("\n");
    sb.append("    relayState: ").append(toIndentedString(relayState)).append("\n");
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
