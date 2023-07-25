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
import com.spectrocloud.client.model.V1Address;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Tenant Spec
 */
@Schema(description = "Tenant Spec")


public class V1TenantSpec {
  @SerializedName("address")
  private V1Address address = null;

  @SerializedName("authType")
  private String authType = null;

  @SerializedName("defaultLoginMode")
  private String defaultLoginMode = null;

  @SerializedName("orgEmailId")
  private String orgEmailId = null;

  @SerializedName("orgName")
  private String orgName = null;

  @SerializedName("planUid")
  private String planUid = null;

  public V1TenantSpec address(V1Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public V1Address getAddress() {
    return address;
  }

  public void setAddress(V1Address address) {
    this.address = address;
  }

  public V1TenantSpec authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @Schema(description = "")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public V1TenantSpec defaultLoginMode(String defaultLoginMode) {
    this.defaultLoginMode = defaultLoginMode;
    return this;
  }

   /**
   * Get defaultLoginMode
   * @return defaultLoginMode
  **/
  @Schema(description = "")
  public String getDefaultLoginMode() {
    return defaultLoginMode;
  }

  public void setDefaultLoginMode(String defaultLoginMode) {
    this.defaultLoginMode = defaultLoginMode;
  }

  public V1TenantSpec orgEmailId(String orgEmailId) {
    this.orgEmailId = orgEmailId;
    return this;
  }

   /**
   * Get orgEmailId
   * @return orgEmailId
  **/
  @Schema(description = "")
  public String getOrgEmailId() {
    return orgEmailId;
  }

  public void setOrgEmailId(String orgEmailId) {
    this.orgEmailId = orgEmailId;
  }

  public V1TenantSpec orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @Schema(description = "")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public V1TenantSpec planUid(String planUid) {
    this.planUid = planUid;
    return this;
  }

   /**
   * Get planUid
   * @return planUid
  **/
  @Schema(description = "")
  public String getPlanUid() {
    return planUid;
  }

  public void setPlanUid(String planUid) {
    this.planUid = planUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TenantSpec v1TenantSpec = (V1TenantSpec) o;
    return Objects.equals(this.address, v1TenantSpec.address) &&
        Objects.equals(this.authType, v1TenantSpec.authType) &&
        Objects.equals(this.defaultLoginMode, v1TenantSpec.defaultLoginMode) &&
        Objects.equals(this.orgEmailId, v1TenantSpec.orgEmailId) &&
        Objects.equals(this.orgName, v1TenantSpec.orgName) &&
        Objects.equals(this.planUid, v1TenantSpec.planUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, authType, defaultLoginMode, orgEmailId, orgName, planUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TenantSpec {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    defaultLoginMode: ").append(toIndentedString(defaultLoginMode)).append("\n");
    sb.append("    orgEmailId: ").append(toIndentedString(orgEmailId)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    planUid: ").append(toIndentedString(planUid)).append("\n");
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