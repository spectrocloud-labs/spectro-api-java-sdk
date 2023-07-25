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
import java.util.ArrayList;
import java.util.List;
/**
 * DataVolumeSourceHTTP can be either an http or https endpoint, with an optional basic auth user name and password, and an optional configmap containing additional CAs
 */
@Schema(description = "DataVolumeSourceHTTP can be either an http or https endpoint, with an optional basic auth user name and password, and an optional configmap containing additional CAs")


public class V1VmDataVolumeSourceHttp {
  @SerializedName("certConfigMap")
  private String certConfigMap = null;

  @SerializedName("extraHeaders")
  private List<String> extraHeaders = null;

  @SerializedName("secretExtraHeaders")
  private List<String> secretExtraHeaders = null;

  @SerializedName("secretRef")
  private String secretRef = null;

  @SerializedName("url")
  private String url = null;

  public V1VmDataVolumeSourceHttp certConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
    return this;
  }

   /**
   * CertConfigMap is a configmap reference, containing a Certificate Authority(CA) public key, and a base64 encoded pem certificate
   * @return certConfigMap
  **/
  @Schema(description = "CertConfigMap is a configmap reference, containing a Certificate Authority(CA) public key, and a base64 encoded pem certificate")
  public String getCertConfigMap() {
    return certConfigMap;
  }

  public void setCertConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
  }

  public V1VmDataVolumeSourceHttp extraHeaders(List<String> extraHeaders) {
    this.extraHeaders = extraHeaders;
    return this;
  }

  public V1VmDataVolumeSourceHttp addExtraHeadersItem(String extraHeadersItem) {
    if (this.extraHeaders == null) {
      this.extraHeaders = new ArrayList<String>();
    }
    this.extraHeaders.add(extraHeadersItem);
    return this;
  }

   /**
   * ExtraHeaders is a list of strings containing extra headers to include with HTTP transfer requests
   * @return extraHeaders
  **/
  @Schema(description = "ExtraHeaders is a list of strings containing extra headers to include with HTTP transfer requests")
  public List<String> getExtraHeaders() {
    return extraHeaders;
  }

  public void setExtraHeaders(List<String> extraHeaders) {
    this.extraHeaders = extraHeaders;
  }

  public V1VmDataVolumeSourceHttp secretExtraHeaders(List<String> secretExtraHeaders) {
    this.secretExtraHeaders = secretExtraHeaders;
    return this;
  }

  public V1VmDataVolumeSourceHttp addSecretExtraHeadersItem(String secretExtraHeadersItem) {
    if (this.secretExtraHeaders == null) {
      this.secretExtraHeaders = new ArrayList<String>();
    }
    this.secretExtraHeaders.add(secretExtraHeadersItem);
    return this;
  }

   /**
   * SecretExtraHeaders is a list of Secret references, each containing an extra HTTP header that may include sensitive information
   * @return secretExtraHeaders
  **/
  @Schema(description = "SecretExtraHeaders is a list of Secret references, each containing an extra HTTP header that may include sensitive information")
  public List<String> getSecretExtraHeaders() {
    return secretExtraHeaders;
  }

  public void setSecretExtraHeaders(List<String> secretExtraHeaders) {
    this.secretExtraHeaders = secretExtraHeaders;
  }

  public V1VmDataVolumeSourceHttp secretRef(String secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * SecretRef A Secret reference, the secret should contain accessKeyId (user name) base64 encoded, and secretKey (password) also base64 encoded
   * @return secretRef
  **/
  @Schema(description = "SecretRef A Secret reference, the secret should contain accessKeyId (user name) base64 encoded, and secretKey (password) also base64 encoded")
  public String getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(String secretRef) {
    this.secretRef = secretRef;
  }

  public V1VmDataVolumeSourceHttp url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL is the URL of the http(s) endpoint
   * @return url
  **/
  @Schema(required = true, description = "URL is the URL of the http(s) endpoint")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmDataVolumeSourceHttp v1VmDataVolumeSourceHttp = (V1VmDataVolumeSourceHttp) o;
    return Objects.equals(this.certConfigMap, v1VmDataVolumeSourceHttp.certConfigMap) &&
        Objects.equals(this.extraHeaders, v1VmDataVolumeSourceHttp.extraHeaders) &&
        Objects.equals(this.secretExtraHeaders, v1VmDataVolumeSourceHttp.secretExtraHeaders) &&
        Objects.equals(this.secretRef, v1VmDataVolumeSourceHttp.secretRef) &&
        Objects.equals(this.url, v1VmDataVolumeSourceHttp.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certConfigMap, extraHeaders, secretExtraHeaders, secretRef, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDataVolumeSourceHttp {\n");
    
    sb.append("    certConfigMap: ").append(toIndentedString(certConfigMap)).append("\n");
    sb.append("    extraHeaders: ").append(toIndentedString(extraHeaders)).append("\n");
    sb.append("    secretExtraHeaders: ").append(toIndentedString(secretExtraHeaders)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
