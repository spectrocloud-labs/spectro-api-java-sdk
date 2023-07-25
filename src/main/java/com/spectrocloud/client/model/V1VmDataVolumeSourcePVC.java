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
/**
 * DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC
 */
@Schema(description = "DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC")


public class V1VmDataVolumeSourcePVC {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public V1VmDataVolumeSourcePVC name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the source PVC
   * @return name
  **/
  @Schema(required = true, description = "The name of the source PVC")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VmDataVolumeSourcePVC namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of the source PVC
   * @return namespace
  **/
  @Schema(required = true, description = "The namespace of the source PVC")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmDataVolumeSourcePVC v1VmDataVolumeSourcePVC = (V1VmDataVolumeSourcePVC) o;
    return Objects.equals(this.name, v1VmDataVolumeSourcePVC.name) &&
        Objects.equals(this.namespace, v1VmDataVolumeSourcePVC.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDataVolumeSourcePVC {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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