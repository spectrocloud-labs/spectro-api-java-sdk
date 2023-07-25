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
import com.spectrocloud.client.model.V1SystemGithubSsoSpec;
import com.spectrocloud.client.model.V1SystemOidcClientSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * system sso config spec
 */
@Schema(description = "system sso config spec")


public class V1SystemSsoAuthSpec {
  @SerializedName("github")
  private V1SystemGithubSsoSpec github = null;

  @SerializedName("oidcAuthSpecs")
  private Map<String, V1SystemOidcClientSpec> oidcAuthSpecs = null;

  public V1SystemSsoAuthSpec github(V1SystemGithubSsoSpec github) {
    this.github = github;
    return this;
  }

   /**
   * Get github
   * @return github
  **/
  @Schema(description = "")
  public V1SystemGithubSsoSpec getGithub() {
    return github;
  }

  public void setGithub(V1SystemGithubSsoSpec github) {
    this.github = github;
  }

  public V1SystemSsoAuthSpec oidcAuthSpecs(Map<String, V1SystemOidcClientSpec> oidcAuthSpecs) {
    this.oidcAuthSpecs = oidcAuthSpecs;
    return this;
  }

  public V1SystemSsoAuthSpec putOidcAuthSpecsItem(String key, V1SystemOidcClientSpec oidcAuthSpecsItem) {
    if (this.oidcAuthSpecs == null) {
      this.oidcAuthSpecs = new HashMap<String, V1SystemOidcClientSpec>();
    }
    this.oidcAuthSpecs.put(key, oidcAuthSpecsItem);
    return this;
  }

   /**
   * Get oidcAuthSpecs
   * @return oidcAuthSpecs
  **/
  @Schema(description = "")
  public Map<String, V1SystemOidcClientSpec> getOidcAuthSpecs() {
    return oidcAuthSpecs;
  }

  public void setOidcAuthSpecs(Map<String, V1SystemOidcClientSpec> oidcAuthSpecs) {
    this.oidcAuthSpecs = oidcAuthSpecs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemSsoAuthSpec v1SystemSsoAuthSpec = (V1SystemSsoAuthSpec) o;
    return Objects.equals(this.github, v1SystemSsoAuthSpec.github) &&
        Objects.equals(this.oidcAuthSpecs, v1SystemSsoAuthSpec.oidcAuthSpecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(github, oidcAuthSpecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemSsoAuthSpec {\n");
    
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    oidcAuthSpecs: ").append(toIndentedString(oidcAuthSpecs)).append("\n");
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
