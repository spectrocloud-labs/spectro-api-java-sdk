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
import com.spectrocloud.client.model.V1ClusterWorkloadRoleBinding;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster workload rbac bindings summary
 */
@Schema(description = "Cluster workload rbac bindings summary")


public class V1ClusterWorkloadRoleBindings {
  @SerializedName("bindings")
  private List<V1ClusterWorkloadRoleBinding> bindings = null;

  public V1ClusterWorkloadRoleBindings bindings(List<V1ClusterWorkloadRoleBinding> bindings) {
    this.bindings = bindings;
    return this;
  }

  public V1ClusterWorkloadRoleBindings addBindingsItem(V1ClusterWorkloadRoleBinding bindingsItem) {
    if (this.bindings == null) {
      this.bindings = new ArrayList<V1ClusterWorkloadRoleBinding>();
    }
    this.bindings.add(bindingsItem);
    return this;
  }

   /**
   * Get bindings
   * @return bindings
  **/
  @Schema(description = "")
  public List<V1ClusterWorkloadRoleBinding> getBindings() {
    return bindings;
  }

  public void setBindings(List<V1ClusterWorkloadRoleBinding> bindings) {
    this.bindings = bindings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterWorkloadRoleBindings v1ClusterWorkloadRoleBindings = (V1ClusterWorkloadRoleBindings) o;
    return Objects.equals(this.bindings, v1ClusterWorkloadRoleBindings.bindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterWorkloadRoleBindings {\n");
    
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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
