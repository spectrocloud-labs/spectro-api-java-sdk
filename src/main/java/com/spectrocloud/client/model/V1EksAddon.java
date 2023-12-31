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
 * EksAddon represents a EKS addon
 */
@Schema(description = "EksAddon represents a EKS addon")


public class V1EksAddon {
  @SerializedName("conflictResolution")
  private String conflictResolution = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("serviceAccountRoleARN")
  private String serviceAccountRoleARN = null;

  @SerializedName("version")
  private String version = null;

  public V1EksAddon conflictResolution(String conflictResolution) {
    this.conflictResolution = conflictResolution;
    return this;
  }

   /**
   * ConflictResolution is used to declare what should happen if there are parameter conflicts.
   * @return conflictResolution
  **/
  @Schema(description = "ConflictResolution is used to declare what should happen if there are parameter conflicts.")
  public String getConflictResolution() {
    return conflictResolution;
  }

  public void setConflictResolution(String conflictResolution) {
    this.conflictResolution = conflictResolution;
  }

  public V1EksAddon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the addon
   * @return name
  **/
  @Schema(required = true, description = "Name is the name of the addon")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EksAddon serviceAccountRoleARN(String serviceAccountRoleARN) {
    this.serviceAccountRoleARN = serviceAccountRoleARN;
    return this;
  }

   /**
   * ServiceAccountRoleArn is the ARN of an IAM role to bind to the addons service account
   * @return serviceAccountRoleARN
  **/
  @Schema(description = "ServiceAccountRoleArn is the ARN of an IAM role to bind to the addons service account")
  public String getServiceAccountRoleARN() {
    return serviceAccountRoleARN;
  }

  public void setServiceAccountRoleARN(String serviceAccountRoleARN) {
    this.serviceAccountRoleARN = serviceAccountRoleARN;
  }

  public V1EksAddon version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version is the version of the addon to use
   * @return version
  **/
  @Schema(required = true, description = "Version is the version of the addon to use")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EksAddon v1EksAddon = (V1EksAddon) o;
    return Objects.equals(this.conflictResolution, v1EksAddon.conflictResolution) &&
        Objects.equals(this.name, v1EksAddon.name) &&
        Objects.equals(this.serviceAccountRoleARN, v1EksAddon.serviceAccountRoleARN) &&
        Objects.equals(this.version, v1EksAddon.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conflictResolution, name, serviceAccountRoleARN, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EksAddon {\n");
    
    sb.append("    conflictResolution: ").append(toIndentedString(conflictResolution)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceAccountRoleARN: ").append(toIndentedString(serviceAccountRoleARN)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
