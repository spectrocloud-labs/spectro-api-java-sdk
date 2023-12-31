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
import com.spectrocloud.client.model.V1SystemGitAuthSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * system git auth account specifications
 */
@Schema(description = "system git auth account specifications")


public class V1SystemGitAuthSpec {
  @SerializedName("_type")
  private String _type = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("username")
  private V1SystemGitAuthSpec username = null;

  public V1SystemGitAuthSpec _type(String _type) {
    this._type = _type;
    return this;
  }

   /**
   * Get _type
   * @return _type
  **/
  @Schema(description = "")
  public String getType() {
    return _type;
  }

  public void setType(String _type) {
    this._type = _type;
  }

  public V1SystemGitAuthSpec password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1SystemGitAuthSpec token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @Schema(description = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public V1SystemGitAuthSpec username(V1SystemGitAuthSpec username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public V1SystemGitAuthSpec getUsername() {
    return username;
  }

  public void setUsername(V1SystemGitAuthSpec username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemGitAuthSpec v1SystemGitAuthSpec = (V1SystemGitAuthSpec) o;
    return Objects.equals(this._type, v1SystemGitAuthSpec._type) &&
        Objects.equals(this.password, v1SystemGitAuthSpec.password) &&
        Objects.equals(this.token, v1SystemGitAuthSpec.token) &&
        Objects.equals(this.username, v1SystemGitAuthSpec.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_type, password, token, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemGitAuthSpec {\n");
    
    sb.append("    _type: ").append(toIndentedString(_type)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
