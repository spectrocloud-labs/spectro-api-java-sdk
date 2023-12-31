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
 * system smtp config spec
 */
@Schema(description = "system smtp config spec")


public class V1SystemCertificateSpec {
  @SerializedName("caCert")
  private String caCert = null;

  @SerializedName("crt")
  private String crt = null;

  @SerializedName("key")
  private String key = null;

  public V1SystemCertificateSpec caCert(String caCert) {
    this.caCert = caCert;
    return this;
  }

   /**
   * Get caCert
   * @return caCert
  **/
  @Schema(description = "")
  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }

  public V1SystemCertificateSpec crt(String crt) {
    this.crt = crt;
    return this;
  }

   /**
   * Get crt
   * @return crt
  **/
  @Schema(description = "")
  public String getCrt() {
    return crt;
  }

  public void setCrt(String crt) {
    this.crt = crt;
  }

  public V1SystemCertificateSpec key(String key) {
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
    V1SystemCertificateSpec v1SystemCertificateSpec = (V1SystemCertificateSpec) o;
    return Objects.equals(this.caCert, v1SystemCertificateSpec.caCert) &&
        Objects.equals(this.crt, v1SystemCertificateSpec.crt) &&
        Objects.equals(this.key, v1SystemCertificateSpec.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCert, crt, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemCertificateSpec {\n");
    
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
    sb.append("    crt: ").append(toIndentedString(crt)).append("\n");
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
