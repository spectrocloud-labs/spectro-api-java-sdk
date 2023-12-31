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
 * V1TenantSsoAuthProvidersEntity
 */



public class V1TenantSsoAuthProvidersEntity {
  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  @SerializedName("ssoLogins")
  private List<String> ssoLogins = null;

  public V1TenantSsoAuthProvidersEntity isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public V1TenantSsoAuthProvidersEntity ssoLogins(List<String> ssoLogins) {
    this.ssoLogins = ssoLogins;
    return this;
  }

  public V1TenantSsoAuthProvidersEntity addSsoLoginsItem(String ssoLoginsItem) {
    if (this.ssoLogins == null) {
      this.ssoLogins = new ArrayList<String>();
    }
    this.ssoLogins.add(ssoLoginsItem);
    return this;
  }

   /**
   * Get ssoLogins
   * @return ssoLogins
  **/
  @Schema(description = "")
  public List<String> getSsoLogins() {
    return ssoLogins;
  }

  public void setSsoLogins(List<String> ssoLogins) {
    this.ssoLogins = ssoLogins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TenantSsoAuthProvidersEntity v1TenantSsoAuthProvidersEntity = (V1TenantSsoAuthProvidersEntity) o;
    return Objects.equals(this.isEnabled, v1TenantSsoAuthProvidersEntity.isEnabled) &&
        Objects.equals(this.ssoLogins, v1TenantSsoAuthProvidersEntity.ssoLogins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, ssoLogins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TenantSsoAuthProvidersEntity {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    ssoLogins: ").append(toIndentedString(ssoLogins)).append("\n");
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
