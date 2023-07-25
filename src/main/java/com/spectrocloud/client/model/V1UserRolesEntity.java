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
 * V1UserRolesEntity
 */



public class V1UserRolesEntity {
  @SerializedName("inheritedRoles")
  private List<V1UidSummary> inheritedRoles = null;

  @SerializedName("roles")
  private List<V1UidSummary> roles = null;

  public V1UserRolesEntity inheritedRoles(List<V1UidSummary> inheritedRoles) {
    this.inheritedRoles = inheritedRoles;
    return this;
  }

  public V1UserRolesEntity addInheritedRolesItem(V1UidSummary inheritedRolesItem) {
    if (this.inheritedRoles == null) {
      this.inheritedRoles = new ArrayList<V1UidSummary>();
    }
    this.inheritedRoles.add(inheritedRolesItem);
    return this;
  }

   /**
   * Get inheritedRoles
   * @return inheritedRoles
  **/
  @Schema(description = "")
  public List<V1UidSummary> getInheritedRoles() {
    return inheritedRoles;
  }

  public void setInheritedRoles(List<V1UidSummary> inheritedRoles) {
    this.inheritedRoles = inheritedRoles;
  }

  public V1UserRolesEntity roles(List<V1UidSummary> roles) {
    this.roles = roles;
    return this;
  }

  public V1UserRolesEntity addRolesItem(V1UidSummary rolesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UserRolesEntity v1UserRolesEntity = (V1UserRolesEntity) o;
    return Objects.equals(this.inheritedRoles, v1UserRolesEntity.inheritedRoles) &&
        Objects.equals(this.roles, v1UserRolesEntity.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inheritedRoles, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UserRolesEntity {\n");
    
    sb.append("    inheritedRoles: ").append(toIndentedString(inheritedRoles)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
