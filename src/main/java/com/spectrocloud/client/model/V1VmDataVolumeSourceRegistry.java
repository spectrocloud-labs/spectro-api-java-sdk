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
 * DataVolumeSourceRegistry provides the parameters to create a Data Volume from an registry source
 */
@Schema(description = "DataVolumeSourceRegistry provides the parameters to create a Data Volume from an registry source")


public class V1VmDataVolumeSourceRegistry {
  @SerializedName("certConfigMap")
  private String certConfigMap = null;

  @SerializedName("imageStream")
  private String imageStream = null;

  @SerializedName("pullMethod")
  private String pullMethod = null;

  @SerializedName("secretRef")
  private String secretRef = null;

  @SerializedName("url")
  private String url = null;

  public V1VmDataVolumeSourceRegistry certConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
    return this;
  }

   /**
   * CertConfigMap provides a reference to the Registry certs
   * @return certConfigMap
  **/
  @Schema(description = "CertConfigMap provides a reference to the Registry certs")
  public String getCertConfigMap() {
    return certConfigMap;
  }

  public void setCertConfigMap(String certConfigMap) {
    this.certConfigMap = certConfigMap;
  }

  public V1VmDataVolumeSourceRegistry imageStream(String imageStream) {
    this.imageStream = imageStream;
    return this;
  }

   /**
   * ImageStream is the name of image stream for import
   * @return imageStream
  **/
  @Schema(description = "ImageStream is the name of image stream for import")
  public String getImageStream() {
    return imageStream;
  }

  public void setImageStream(String imageStream) {
    this.imageStream = imageStream;
  }

  public V1VmDataVolumeSourceRegistry pullMethod(String pullMethod) {
    this.pullMethod = pullMethod;
    return this;
  }

   /**
   * PullMethod can be either \&quot;pod\&quot; (default import), or \&quot;node\&quot; (node docker cache based import)
   * @return pullMethod
  **/
  @Schema(description = "PullMethod can be either \"pod\" (default import), or \"node\" (node docker cache based import)")
  public String getPullMethod() {
    return pullMethod;
  }

  public void setPullMethod(String pullMethod) {
    this.pullMethod = pullMethod;
  }

  public V1VmDataVolumeSourceRegistry secretRef(String secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * SecretRef provides the secret reference needed to access the Registry source
   * @return secretRef
  **/
  @Schema(description = "SecretRef provides the secret reference needed to access the Registry source")
  public String getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(String secretRef) {
    this.secretRef = secretRef;
  }

  public V1VmDataVolumeSourceRegistry url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL is the url of the registry source (starting with the scheme: docker, oci-archive)
   * @return url
  **/
  @Schema(description = "URL is the url of the registry source (starting with the scheme: docker, oci-archive)")
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
    V1VmDataVolumeSourceRegistry v1VmDataVolumeSourceRegistry = (V1VmDataVolumeSourceRegistry) o;
    return Objects.equals(this.certConfigMap, v1VmDataVolumeSourceRegistry.certConfigMap) &&
        Objects.equals(this.imageStream, v1VmDataVolumeSourceRegistry.imageStream) &&
        Objects.equals(this.pullMethod, v1VmDataVolumeSourceRegistry.pullMethod) &&
        Objects.equals(this.secretRef, v1VmDataVolumeSourceRegistry.secretRef) &&
        Objects.equals(this.url, v1VmDataVolumeSourceRegistry.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certConfigMap, imageStream, pullMethod, secretRef, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDataVolumeSourceRegistry {\n");
    
    sb.append("    certConfigMap: ").append(toIndentedString(certConfigMap)).append("\n");
    sb.append("    imageStream: ").append(toIndentedString(imageStream)).append("\n");
    sb.append("    pullMethod: ").append(toIndentedString(pullMethod)).append("\n");
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
