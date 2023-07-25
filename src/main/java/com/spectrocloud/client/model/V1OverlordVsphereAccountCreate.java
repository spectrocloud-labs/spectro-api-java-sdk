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
import com.spectrocloud.client.model.V1VsphereCloudAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1OverlordVsphereAccountCreate
 */



public class V1OverlordVsphereAccountCreate {
  @SerializedName("account")
  private V1VsphereCloudAccount account = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shareWithProjects")
  private Boolean shareWithProjects = null;

  @SerializedName("useQualifiedNetworkName")
  private Boolean useQualifiedNetworkName = null;

  public V1OverlordVsphereAccountCreate account(V1VsphereCloudAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public V1VsphereCloudAccount getAccount() {
    return account;
  }

  public void setAccount(V1VsphereCloudAccount account) {
    this.account = account;
  }

  public V1OverlordVsphereAccountCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name for the private gateway &amp; cloud account
   * @return name
  **/
  @Schema(description = "Name for the private gateway & cloud account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1OverlordVsphereAccountCreate shareWithProjects(Boolean shareWithProjects) {
    this.shareWithProjects = shareWithProjects;
    return this;
  }

   /**
   * Get shareWithProjects
   * @return shareWithProjects
  **/
  @Schema(description = "")
  public Boolean isShareWithProjects() {
    return shareWithProjects;
  }

  public void setShareWithProjects(Boolean shareWithProjects) {
    this.shareWithProjects = shareWithProjects;
  }

  public V1OverlordVsphereAccountCreate useQualifiedNetworkName(Boolean useQualifiedNetworkName) {
    this.useQualifiedNetworkName = useQualifiedNetworkName;
    return this;
  }

   /**
   * Get useQualifiedNetworkName
   * @return useQualifiedNetworkName
  **/
  @Schema(description = "")
  public Boolean isUseQualifiedNetworkName() {
    return useQualifiedNetworkName;
  }

  public void setUseQualifiedNetworkName(Boolean useQualifiedNetworkName) {
    this.useQualifiedNetworkName = useQualifiedNetworkName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OverlordVsphereAccountCreate v1OverlordVsphereAccountCreate = (V1OverlordVsphereAccountCreate) o;
    return Objects.equals(this.account, v1OverlordVsphereAccountCreate.account) &&
        Objects.equals(this.name, v1OverlordVsphereAccountCreate.name) &&
        Objects.equals(this.shareWithProjects, v1OverlordVsphereAccountCreate.shareWithProjects) &&
        Objects.equals(this.useQualifiedNetworkName, v1OverlordVsphereAccountCreate.useQualifiedNetworkName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, name, shareWithProjects, useQualifiedNetworkName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OverlordVsphereAccountCreate {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shareWithProjects: ").append(toIndentedString(shareWithProjects)).append("\n");
    sb.append("    useQualifiedNetworkName: ").append(toIndentedString(useQualifiedNetworkName)).append("\n");
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