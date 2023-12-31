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
import com.spectrocloud.client.model.V1OidcLoginsTenantLogin;
import com.spectrocloud.client.model.V1SsoLogin;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * loginsDetails
 */
@Schema(description = "loginsDetails")


public class V1OidcLogins {
  @SerializedName("systemLogins")
  private List<V1SsoLogin> systemLogins = null;

  @SerializedName("tenantLogin")
  private V1OidcLoginsTenantLogin tenantLogin = null;

  public V1OidcLogins systemLogins(List<V1SsoLogin> systemLogins) {
    this.systemLogins = systemLogins;
    return this;
  }

  public V1OidcLogins addSystemLoginsItem(V1SsoLogin systemLoginsItem) {
    if (this.systemLogins == null) {
      this.systemLogins = new ArrayList<V1SsoLogin>();
    }
    this.systemLogins.add(systemLoginsItem);
    return this;
  }

   /**
   * Get systemLogins
   * @return systemLogins
  **/
  @Schema(description = "")
  public List<V1SsoLogin> getSystemLogins() {
    return systemLogins;
  }

  public void setSystemLogins(List<V1SsoLogin> systemLogins) {
    this.systemLogins = systemLogins;
  }

  public V1OidcLogins tenantLogin(V1OidcLoginsTenantLogin tenantLogin) {
    this.tenantLogin = tenantLogin;
    return this;
  }

   /**
   * Get tenantLogin
   * @return tenantLogin
  **/
  @Schema(description = "")
  public V1OidcLoginsTenantLogin getTenantLogin() {
    return tenantLogin;
  }

  public void setTenantLogin(V1OidcLoginsTenantLogin tenantLogin) {
    this.tenantLogin = tenantLogin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OidcLogins v1OidcLogins = (V1OidcLogins) o;
    return Objects.equals(this.systemLogins, v1OidcLogins.systemLogins) &&
        Objects.equals(this.tenantLogin, v1OidcLogins.tenantLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemLogins, tenantLogin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OidcLogins {\n");
    
    sb.append("    systemLogins: ").append(toIndentedString(systemLogins)).append("\n");
    sb.append("    tenantLogin: ").append(toIndentedString(tenantLogin)).append("\n");
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
