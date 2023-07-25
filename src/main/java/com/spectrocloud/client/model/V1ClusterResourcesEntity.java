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
import com.spectrocloud.client.model.V1ClusterNamespaceResourceInputEntity;
import com.spectrocloud.client.model.V1ClusterRbacInputEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1ClusterResourcesEntity
 */



public class V1ClusterResourcesEntity {
  @SerializedName("namespaces")
  private List<V1ClusterNamespaceResourceInputEntity> namespaces = null;

  @SerializedName("rbacs")
  private List<V1ClusterRbacInputEntity> rbacs = null;

  public V1ClusterResourcesEntity namespaces(List<V1ClusterNamespaceResourceInputEntity> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public V1ClusterResourcesEntity addNamespacesItem(V1ClusterNamespaceResourceInputEntity namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<V1ClusterNamespaceResourceInputEntity>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @Schema(description = "")
  public List<V1ClusterNamespaceResourceInputEntity> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<V1ClusterNamespaceResourceInputEntity> namespaces) {
    this.namespaces = namespaces;
  }

  public V1ClusterResourcesEntity rbacs(List<V1ClusterRbacInputEntity> rbacs) {
    this.rbacs = rbacs;
    return this;
  }

  public V1ClusterResourcesEntity addRbacsItem(V1ClusterRbacInputEntity rbacsItem) {
    if (this.rbacs == null) {
      this.rbacs = new ArrayList<V1ClusterRbacInputEntity>();
    }
    this.rbacs.add(rbacsItem);
    return this;
  }

   /**
   * Get rbacs
   * @return rbacs
  **/
  @Schema(description = "")
  public List<V1ClusterRbacInputEntity> getRbacs() {
    return rbacs;
  }

  public void setRbacs(List<V1ClusterRbacInputEntity> rbacs) {
    this.rbacs = rbacs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterResourcesEntity v1ClusterResourcesEntity = (V1ClusterResourcesEntity) o;
    return Objects.equals(this.namespaces, v1ClusterResourcesEntity.namespaces) &&
        Objects.equals(this.rbacs, v1ClusterResourcesEntity.rbacs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, rbacs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterResourcesEntity {\n");
    
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    rbacs: ").append(toIndentedString(rbacs)).append("\n");
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
