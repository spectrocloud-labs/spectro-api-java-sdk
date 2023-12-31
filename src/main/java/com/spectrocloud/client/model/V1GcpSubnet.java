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
 * Subnets are regional resources, and have IP address ranges associated with them
 */
@Schema(description = "Subnets are regional resources, and have IP address ranges associated with them")


public class V1GcpSubnet {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public V1GcpSubnet id(String id) {
    this.id = id;
    return this;
  }

   /**
   * GCP subnet id
   * @return id
  **/
  @Schema(description = "GCP subnet id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1GcpSubnet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * GCP subnet name
   * @return name
  **/
  @Schema(description = "GCP subnet name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpSubnet v1GcpSubnet = (V1GcpSubnet) o;
    return Objects.equals(this.id, v1GcpSubnet.id) &&
        Objects.equals(this.name, v1GcpSubnet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpSubnet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
