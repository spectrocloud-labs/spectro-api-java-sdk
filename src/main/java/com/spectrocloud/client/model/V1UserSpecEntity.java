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
 * User Entity input
 */
@Schema(description = "User Entity input")


public class V1UserSpecEntity {
  @SerializedName("emailId")
  private String emailId = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("loginMode")
  private String loginMode = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("teams")
  private List<String> teams = null;

  public V1UserSpecEntity emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Get emailId
   * @return emailId
  **/
  @Schema(description = "")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public V1UserSpecEntity firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public V1UserSpecEntity lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public V1UserSpecEntity loginMode(String loginMode) {
    this.loginMode = loginMode;
    return this;
  }

   /**
   * Get loginMode
   * @return loginMode
  **/
  @Schema(description = "")
  public String getLoginMode() {
    return loginMode;
  }

  public void setLoginMode(String loginMode) {
    this.loginMode = loginMode;
  }

  public V1UserSpecEntity roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public V1UserSpecEntity addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public V1UserSpecEntity teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public V1UserSpecEntity addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<String>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @Schema(description = "")
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserSpecEntity v1UserSpecEntity = (V1UserSpecEntity) o;
    return Objects.equals(this.emailId, v1UserSpecEntity.emailId) &&
        Objects.equals(this.firstName, v1UserSpecEntity.firstName) &&
        Objects.equals(this.lastName, v1UserSpecEntity.lastName) &&
        Objects.equals(this.loginMode, v1UserSpecEntity.loginMode) &&
        Objects.equals(this.roles, v1UserSpecEntity.roles) &&
        Objects.equals(this.teams, v1UserSpecEntity.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, firstName, lastName, loginMode, roles, teams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserSpecEntity {\n");
    
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    loginMode: ").append(toIndentedString(loginMode)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
