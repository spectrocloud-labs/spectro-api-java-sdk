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
import com.spectrocloud.client.model.V1ResourceRolesEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1ResourceRoles
 */



public class V1ResourceRoles {
  @SerializedName("resourceRoles")
  private List<V1ResourceRolesEntity> resourceRoles = null;

  public V1ResourceRoles resourceRoles(List<V1ResourceRolesEntity> resourceRoles) {
    this.resourceRoles = resourceRoles;
    return this;
  }

  public V1ResourceRoles addResourceRolesItem(V1ResourceRolesEntity resourceRolesItem) {
    if (this.resourceRoles == null) {
      this.resourceRoles = new ArrayList<V1ResourceRolesEntity>();
    }
    this.resourceRoles.add(resourceRolesItem);
    return this;
  }

   /**
   * Get resourceRoles
   * @return resourceRoles
  **/
  @Schema(description = "")
  public List<V1ResourceRolesEntity> getResourceRoles() {
    return resourceRoles;
  }

  public void setResourceRoles(List<V1ResourceRolesEntity> resourceRoles) {
    this.resourceRoles = resourceRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ResourceRoles v1ResourceRoles = (V1ResourceRoles) o;
    return Objects.equals(this.resourceRoles, v1ResourceRoles.resourceRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ResourceRoles {\n");
    
    sb.append("    resourceRoles: ").append(toIndentedString(resourceRoles)).append("\n");
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
