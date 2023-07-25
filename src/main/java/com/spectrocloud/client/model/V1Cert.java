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
 * V1Cert
 */



public class V1Cert {
  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("isCA")
  private Boolean isCA = null;

  @SerializedName("key")
  private String key = null;

  public V1Cert certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(description = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public V1Cert isCA(Boolean isCA) {
    this.isCA = isCA;
    return this;
  }

   /**
   * Get isCA
   * @return isCA
  **/
  @Schema(description = "")
  public Boolean isIsCA() {
    return isCA;
  }

  public void setIsCA(Boolean isCA) {
    this.isCA = isCA;
  }

  public V1Cert key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Cert v1Cert = (V1Cert) o;
    return Objects.equals(this.certificate, v1Cert.certificate) &&
        Objects.equals(this.isCA, v1Cert.isCA) &&
        Objects.equals(this.key, v1Cert.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, isCA, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Cert {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    isCA: ").append(toIndentedString(isCA)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
