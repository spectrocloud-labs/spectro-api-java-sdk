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
 * V1VsphereCloudAccount
 */



public class V1VsphereCloudAccount {
  @SerializedName("insecure")
  private Boolean insecure = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("vcenterServer")
  private String vcenterServer = null;

  public V1VsphereCloudAccount insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

   /**
   * Insecure is a flag that controls whether or not to validate the vSphere server&#x27;s certificate.
   * @return insecure
  **/
  @Schema(description = "Insecure is a flag that controls whether or not to validate the vSphere server's certificate.")
  public Boolean isInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public V1VsphereCloudAccount password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(required = true, description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1VsphereCloudAccount username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public V1VsphereCloudAccount vcenterServer(String vcenterServer) {
    this.vcenterServer = vcenterServer;
    return this;
  }

   /**
   * VcenterServer is the address of the vSphere endpoint
   * @return vcenterServer
  **/
  @Schema(required = true, description = "VcenterServer is the address of the vSphere endpoint")
  public String getVcenterServer() {
    return vcenterServer;
  }

  public void setVcenterServer(String vcenterServer) {
    this.vcenterServer = vcenterServer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VsphereCloudAccount v1VsphereCloudAccount = (V1VsphereCloudAccount) o;
    return Objects.equals(this.insecure, v1VsphereCloudAccount.insecure) &&
        Objects.equals(this.password, v1VsphereCloudAccount.password) &&
        Objects.equals(this.username, v1VsphereCloudAccount.username) &&
        Objects.equals(this.vcenterServer, v1VsphereCloudAccount.vcenterServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insecure, password, username, vcenterServer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VsphereCloudAccount {\n");
    
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vcenterServer: ").append(toIndentedString(vcenterServer)).append("\n");
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
