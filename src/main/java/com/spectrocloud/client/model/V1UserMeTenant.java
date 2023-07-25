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
 * V1UserMeTenant
 */



public class V1UserMeTenant {
  @SerializedName("orgName")
  private String orgName = null;

  @SerializedName("tenantUid")
  private String tenantUid = null;

  public V1UserMeTenant orgName(String orgName) {
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

  public V1UserMeTenant tenantUid(String tenantUid) {
    this.tenantUid = tenantUid;
    return this;
  }

   /**
   * Get tenantUid
   * @return tenantUid
  **/
  @Schema(description = "")
  public String getTenantUid() {
    return tenantUid;
  }

  public void setTenantUid(String tenantUid) {
    this.tenantUid = tenantUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserMeTenant v1UserMeTenant = (V1UserMeTenant) o;
    return Objects.equals(this.orgName, v1UserMeTenant.orgName) &&
        Objects.equals(this.tenantUid, v1UserMeTenant.tenantUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgName, tenantUid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserMeTenant {\n");
    
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    tenantUid: ").append(toIndentedString(tenantUid)).append("\n");
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
