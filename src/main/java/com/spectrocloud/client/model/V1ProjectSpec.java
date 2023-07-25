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
import com.spectrocloud.client.model.V1Alert;
import com.spectrocloud.client.model.V1TeamRoleMap;
import com.spectrocloud.client.model.V1UserRoleMap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Project specifications
 */
@Schema(description = "Project specifications")


public class V1ProjectSpec {
  @SerializedName("alerts")
  private List<V1Alert> alerts = null;

  @SerializedName("logoUrl")
  private String logoUrl = null;

  @SerializedName("teams")
  private List<V1TeamRoleMap> teams = null;

  @SerializedName("users")
  private List<V1UserRoleMap> users = null;

  public V1ProjectSpec alerts(List<V1Alert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public V1ProjectSpec addAlertsItem(V1Alert alertsItem) {
    if (this.alerts == null) {
      this.alerts = new ArrayList<V1Alert>();
    }
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @Schema(description = "")
  public List<V1Alert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<V1Alert> alerts) {
    this.alerts = alerts;
  }

  public V1ProjectSpec logoUrl(String logoUrl) {
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

  public V1ProjectSpec teams(List<V1TeamRoleMap> teams) {
    this.teams = teams;
    return this;
  }

  public V1ProjectSpec addTeamsItem(V1TeamRoleMap teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<V1TeamRoleMap>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @Schema(description = "")
  public List<V1TeamRoleMap> getTeams() {
    return teams;
  }

  public void setTeams(List<V1TeamRoleMap> teams) {
    this.teams = teams;
  }

  public V1ProjectSpec users(List<V1UserRoleMap> users) {
    this.users = users;
    return this;
  }

  public V1ProjectSpec addUsersItem(V1UserRoleMap usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<V1UserRoleMap>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<V1UserRoleMap> getUsers() {
    return users;
  }

  public void setUsers(List<V1UserRoleMap> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectSpec v1ProjectSpec = (V1ProjectSpec) o;
    return Objects.equals(this.alerts, v1ProjectSpec.alerts) &&
        Objects.equals(this.logoUrl, v1ProjectSpec.logoUrl) &&
        Objects.equals(this.teams, v1ProjectSpec.teams) &&
        Objects.equals(this.users, v1ProjectSpec.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, logoUrl, teams, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectSpec {\n");
    
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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