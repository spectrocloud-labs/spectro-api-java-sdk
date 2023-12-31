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
import com.spectrocloud.client.model.V1MaasCloudAccount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1OverlordMaasAccountEntity
 */



public class V1OverlordMaasAccountEntity {
  @SerializedName("account")
  private V1MaasCloudAccount account = null;

  @SerializedName("shareWithProjects")
  private Boolean shareWithProjects = null;

  public V1OverlordMaasAccountEntity account(V1MaasCloudAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public V1MaasCloudAccount getAccount() {
    return account;
  }

  public void setAccount(V1MaasCloudAccount account) {
    this.account = account;
  }

  public V1OverlordMaasAccountEntity shareWithProjects(Boolean shareWithProjects) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OverlordMaasAccountEntity v1OverlordMaasAccountEntity = (V1OverlordMaasAccountEntity) o;
    return Objects.equals(this.account, v1OverlordMaasAccountEntity.account) &&
        Objects.equals(this.shareWithProjects, v1OverlordMaasAccountEntity.shareWithProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, shareWithProjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OverlordMaasAccountEntity {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    shareWithProjects: ").append(toIndentedString(shareWithProjects)).append("\n");
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
