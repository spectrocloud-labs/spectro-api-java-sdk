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
import com.spectrocloud.client.model.V1InstanceType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Retrieves a list of GCP instance types
 */
@Schema(description = "Retrieves a list of GCP instance types")


public class V1GcpInstanceTypes {
  @SerializedName("instanceTypes")
  private List<V1InstanceType> instanceTypes = null;

  public V1GcpInstanceTypes instanceTypes(List<V1InstanceType> instanceTypes) {
    this.instanceTypes = instanceTypes;
    return this;
  }

  public V1GcpInstanceTypes addInstanceTypesItem(V1InstanceType instanceTypesItem) {
    if (this.instanceTypes == null) {
      this.instanceTypes = new ArrayList<V1InstanceType>();
    }
    this.instanceTypes.add(instanceTypesItem);
    return this;
  }

   /**
   * List of GCP instance types
   * @return instanceTypes
  **/
  @Schema(description = "List of GCP instance types")
  public List<V1InstanceType> getInstanceTypes() {
    return instanceTypes;
  }

  public void setInstanceTypes(List<V1InstanceType> instanceTypes) {
    this.instanceTypes = instanceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpInstanceTypes v1GcpInstanceTypes = (V1GcpInstanceTypes) o;
    return Objects.equals(this.instanceTypes, v1GcpInstanceTypes.instanceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpInstanceTypes {\n");
    
    sb.append("    instanceTypes: ").append(toIndentedString(instanceTypes)).append("\n");
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
