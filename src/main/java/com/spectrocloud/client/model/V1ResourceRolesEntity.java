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
import com.spectrocloud.client.model.V1UidSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1ResourceRolesEntity
 */



public class V1ResourceRolesEntity {
  @SerializedName("filterRefs")
  private List<V1UidSummary> filterRefs = null;

  @SerializedName("projectUids")
  private List<V1UidSummary> projectUids = null;

  @SerializedName("roles")
  private List<V1UidSummary> roles = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ResourceRolesEntity filterRefs(List<V1UidSummary> filterRefs) {
    this.filterRefs = filterRefs;
    return this;
  }

  public V1ResourceRolesEntity addFilterRefsItem(V1UidSummary filterRefsItem) {
    if (this.filterRefs == null) {
      this.filterRefs = new ArrayList<V1UidSummary>();
    }
    this.filterRefs.add(filterRefsItem);
    return this;
  }

   /**
   * Get filterRefs
   * @return filterRefs
  **/
  @Schema(description = "")
  public List<V1UidSummary> getFilterRefs() {
    return filterRefs;
  }

  public void setFilterRefs(List<V1UidSummary> filterRefs) {
    this.filterRefs = filterRefs;
  }

  public V1ResourceRolesEntity projectUids(List<V1UidSummary> projectUids) {
    this.projectUids = projectUids;
    return this;
  }

  public V1ResourceRolesEntity addProjectUidsItem(V1UidSummary projectUidsItem) {
    if (this.projectUids == null) {
      this.projectUids = new ArrayList<V1UidSummary>();
    }
    this.projectUids.add(projectUidsItem);
    return this;
  }

   /**
   * Get projectUids
   * @return projectUids
  **/
  @Schema(description = "")
  public List<V1UidSummary> getProjectUids() {
    return projectUids;
  }

  public void setProjectUids(List<V1UidSummary> projectUids) {
    this.projectUids = projectUids;
  }

  public V1ResourceRolesEntity roles(List<V1UidSummary> roles) {
    this.roles = roles;
    return this;
  }

  public V1ResourceRolesEntity addRolesItem(V1UidSummary rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<V1UidSummary>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<V1UidSummary> getRoles() {
    return roles;
  }

  public void setRoles(List<V1UidSummary> roles) {
    this.roles = roles;
  }

  public V1ResourceRolesEntity uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRolesEntity v1ResourceRolesEntity = (V1ResourceRolesEntity) o;
    return Objects.equals(this.filterRefs, v1ResourceRolesEntity.filterRefs) &&
        Objects.equals(this.projectUids, v1ResourceRolesEntity.projectUids) &&
        Objects.equals(this.roles, v1ResourceRolesEntity.roles) &&
        Objects.equals(this.uid, v1ResourceRolesEntity.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterRefs, projectUids, roles, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRolesEntity {\n");
    
    sb.append("    filterRefs: ").append(toIndentedString(filterRefs)).append("\n");
    sb.append("    projectUids: ").append(toIndentedString(projectUids)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
