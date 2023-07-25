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
import com.spectrocloud.client.model.V1CloudAccountStatus;
import com.spectrocloud.client.model.V1ObjectMeta;
import com.spectrocloud.client.model.V1VsphereCloudAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VSphere account information
 */
@Schema(description = "VSphere account information")


public class V1VsphereAccount {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1VsphereCloudAccount spec = null;

  @SerializedName("status")
  private V1CloudAccountStatus status = null;

  public V1VsphereAccount apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Cloud account api version
   * @return apiVersion
  **/
  @Schema(description = "Cloud account api version")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1VsphereAccount kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Cloud account kind
   * @return kind
  **/
  @Schema(description = "Cloud account kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1VsphereAccount metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1VsphereAccount spec(V1VsphereCloudAccount spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public V1VsphereCloudAccount getSpec() {
    return spec;
  }

  public void setSpec(V1VsphereCloudAccount spec) {
    this.spec = spec;
  }

  public V1VsphereAccount status(V1CloudAccountStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public V1CloudAccountStatus getStatus() {
    return status;
  }

  public void setStatus(V1CloudAccountStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereAccount v1VsphereAccount = (V1VsphereAccount) o;
    return Objects.equals(this.apiVersion, v1VsphereAccount.apiVersion) &&
        Objects.equals(this.kind, v1VsphereAccount.kind) &&
        Objects.equals(this.metadata, v1VsphereAccount.metadata) &&
        Objects.equals(this.spec, v1VsphereAccount.spec) &&
        Objects.equals(this.status, v1VsphereAccount.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereAccount {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
