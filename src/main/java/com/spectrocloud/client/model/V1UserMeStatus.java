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
import com.spectrocloud.client.model.V1UserMeTenant;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * User status with permissions
 */
@Schema(description = "User status with permissions")


public class V1UserMeStatus {
  @SerializedName("activationLink")
  private String activationLink = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("isContractAccepted")
  private Boolean isContractAccepted = null;

  @SerializedName("loginMode")
  private String loginMode = null;

  @SerializedName("projectPermissions")
  private Map<String, List<String>> projectPermissions = null;

  @SerializedName("tenant")
  private V1UserMeTenant tenant = null;

  @SerializedName("tenantPermissions")
  private Map<String, List<String>> tenantPermissions = null;

  public V1UserMeStatus activationLink(String activationLink) {
    this.activationLink = activationLink;
    return this;
  }

   /**
   * Contains activation link for the user
   * @return activationLink
  **/
  @Schema(description = "Contains activation link for the user")
  public String getActivationLink() {
    return activationLink;
  }

  public void setActivationLink(String activationLink) {
    this.activationLink = activationLink;
  }

  public V1UserMeStatus isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Specifies if user account is active/disabled
   * @return isActive
  **/
  @Schema(description = "Specifies if user account is active/disabled")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public V1UserMeStatus isContractAccepted(Boolean isContractAccepted) {
    this.isContractAccepted = isContractAccepted;
    return this;
  }

   /**
   * Specifies if user account has accepted the contract
   * @return isContractAccepted
  **/
  @Schema(description = "Specifies if user account has accepted the contract")
  public Boolean isIsContractAccepted() {
    return isContractAccepted;
  }

  public void setIsContractAccepted(Boolean isContractAccepted) {
    this.isContractAccepted = isContractAccepted;
  }

  public V1UserMeStatus loginMode(String loginMode) {
    this.loginMode = loginMode;
    return this;
  }

   /**
   * User&#x27;s login Mode
   * @return loginMode
  **/
  @Schema(description = "User's login Mode")
  public String getLoginMode() {
    return loginMode;
  }

  public void setLoginMode(String loginMode) {
    this.loginMode = loginMode;
  }

  public V1UserMeStatus projectPermissions(Map<String, List<String>> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public V1UserMeStatus putProjectPermissionsItem(String key, List<String> projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new HashMap<String, List<String>>();
    }
    this.projectPermissions.put(key, projectPermissionsItem);
    return this;
  }

   /**
   * Get projectPermissions
   * @return projectPermissions
  **/
  @Schema(description = "")
  public Map<String, List<String>> getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(Map<String, List<String>> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }

  public V1UserMeStatus tenant(V1UserMeTenant tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @Schema(description = "")
  public V1UserMeTenant getTenant() {
    return tenant;
  }

  public void setTenant(V1UserMeTenant tenant) {
    this.tenant = tenant;
  }

  public V1UserMeStatus tenantPermissions(Map<String, List<String>> tenantPermissions) {
    this.tenantPermissions = tenantPermissions;
    return this;
  }

  public V1UserMeStatus putTenantPermissionsItem(String key, List<String> tenantPermissionsItem) {
    if (this.tenantPermissions == null) {
      this.tenantPermissions = new HashMap<String, List<String>>();
    }
    this.tenantPermissions.put(key, tenantPermissionsItem);
    return this;
  }

   /**
   * Get tenantPermissions
   * @return tenantPermissions
  **/
  @Schema(description = "")
  public Map<String, List<String>> getTenantPermissions() {
    return tenantPermissions;
  }

  public void setTenantPermissions(Map<String, List<String>> tenantPermissions) {
    this.tenantPermissions = tenantPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserMeStatus v1UserMeStatus = (V1UserMeStatus) o;
    return Objects.equals(this.activationLink, v1UserMeStatus.activationLink) &&
        Objects.equals(this.isActive, v1UserMeStatus.isActive) &&
        Objects.equals(this.isContractAccepted, v1UserMeStatus.isContractAccepted) &&
        Objects.equals(this.loginMode, v1UserMeStatus.loginMode) &&
        Objects.equals(this.projectPermissions, v1UserMeStatus.projectPermissions) &&
        Objects.equals(this.tenant, v1UserMeStatus.tenant) &&
        Objects.equals(this.tenantPermissions, v1UserMeStatus.tenantPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationLink, isActive, isContractAccepted, loginMode, projectPermissions, tenant, tenantPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserMeStatus {\n");
    
    sb.append("    activationLink: ").append(toIndentedString(activationLink)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isContractAccepted: ").append(toIndentedString(isContractAccepted)).append("\n");
    sb.append("    loginMode: ").append(toIndentedString(loginMode)).append("\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    tenantPermissions: ").append(toIndentedString(tenantPermissions)).append("\n");
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
