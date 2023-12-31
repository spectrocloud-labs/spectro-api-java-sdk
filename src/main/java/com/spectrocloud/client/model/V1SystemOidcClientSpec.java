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
import com.spectrocloud.client.model.V1SystemOidcClaims;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * system sso oidc config spec
 */
@Schema(description = "system sso oidc config spec")


public class V1SystemOidcClientSpec {
  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = null;

  @SerializedName("issuerUrl")
  private String issuerUrl = null;

  @SerializedName("logoUrl")
  private String logoUrl = null;

  @SerializedName("requiredClaims")
  private V1SystemOidcClaims requiredClaims = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  public V1SystemOidcClientSpec callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @Schema(description = "")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public V1SystemOidcClientSpec clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public V1SystemOidcClientSpec clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public V1SystemOidcClientSpec isEnabled(Boolean isEnabled) {
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

  public V1SystemOidcClientSpec issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * the issuer is the URL identifier for the service
   * @return issuerUrl
  **/
  @Schema(description = "the issuer is the URL identifier for the service")
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }

  public V1SystemOidcClientSpec logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @Schema(description = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public V1SystemOidcClientSpec requiredClaims(V1SystemOidcClaims requiredClaims) {
    this.requiredClaims = requiredClaims;
    return this;
  }

   /**
   * Get requiredClaims
   * @return requiredClaims
  **/
  @Schema(description = "")
  public V1SystemOidcClaims getRequiredClaims() {
    return requiredClaims;
  }

  public void setRequiredClaims(V1SystemOidcClaims requiredClaims) {
    this.requiredClaims = requiredClaims;
  }

  public V1SystemOidcClientSpec scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public V1SystemOidcClientSpec addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @Schema(description = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemOidcClientSpec v1SystemOidcClientSpec = (V1SystemOidcClientSpec) o;
    return Objects.equals(this.callbackUrl, v1SystemOidcClientSpec.callbackUrl) &&
        Objects.equals(this.clientId, v1SystemOidcClientSpec.clientId) &&
        Objects.equals(this.clientSecret, v1SystemOidcClientSpec.clientSecret) &&
        Objects.equals(this.isEnabled, v1SystemOidcClientSpec.isEnabled) &&
        Objects.equals(this.issuerUrl, v1SystemOidcClientSpec.issuerUrl) &&
        Objects.equals(this.logoUrl, v1SystemOidcClientSpec.logoUrl) &&
        Objects.equals(this.requiredClaims, v1SystemOidcClientSpec.requiredClaims) &&
        Objects.equals(this.scopes, v1SystemOidcClientSpec.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, clientId, clientSecret, isEnabled, issuerUrl, logoUrl, requiredClaims, scopes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemOidcClientSpec {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    requiredClaims: ").append(toIndentedString(requiredClaims)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
