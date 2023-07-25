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
import com.spectrocloud.client.model.V1WorkspaceRolesUidSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Workspace users and their roles
 */
@Schema(description = "Workspace users and their roles")


public class V1WorkspacesRoles {
  @SerializedName("inheritedRoles")
  private List<V1WorkspaceRolesUidSummary> inheritedRoles = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("roles")
  private List<V1WorkspaceRolesUidSummary> roles = null;

  @SerializedName("uid")
  private String uid = null;

  public V1WorkspacesRoles inheritedRoles(List<V1WorkspaceRolesUidSummary> inheritedRoles) {
    this.inheritedRoles = inheritedRoles;
    return this;
  }

  public V1WorkspacesRoles addInheritedRolesItem(V1WorkspaceRolesUidSummary inheritedRolesItem) {
    if (this.inheritedRoles == null) {
      this.inheritedRoles = new ArrayList<V1WorkspaceRolesUidSummary>();
    }
    this.inheritedRoles.add(inheritedRolesItem);
    return this;
  }

   /**
   * Get inheritedRoles
   * @return inheritedRoles
  **/
  @Schema(description = "")
  public List<V1WorkspaceRolesUidSummary> getInheritedRoles() {
    return inheritedRoles;
  }

  public void setInheritedRoles(List<V1WorkspaceRolesUidSummary> inheritedRoles) {
    this.inheritedRoles = inheritedRoles;
  }

  public V1WorkspacesRoles name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1WorkspacesRoles roles(List<V1WorkspaceRolesUidSummary> roles) {
    this.roles = roles;
    return this;
  }

  public V1WorkspacesRoles addRolesItem(V1WorkspaceRolesUidSummary rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<V1WorkspaceRolesUidSummary>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<V1WorkspaceRolesUidSummary> getRoles() {
    return roles;
  }

  public void setRoles(List<V1WorkspaceRolesUidSummary> roles) {
    this.roles = roles;
  }

  public V1WorkspacesRoles uid(String uid) {
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
    V1WorkspacesRoles v1WorkspacesRoles = (V1WorkspacesRoles) o;
    return Objects.equals(this.inheritedRoles, v1WorkspacesRoles.inheritedRoles) &&
        Objects.equals(this.name, v1WorkspacesRoles.name) &&
        Objects.equals(this.roles, v1WorkspacesRoles.roles) &&
        Objects.equals(this.uid, v1WorkspacesRoles.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedRoles, name, roles, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WorkspacesRoles {\n");
    
    sb.append("    inheritedRoles: ").append(toIndentedString(inheritedRoles)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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