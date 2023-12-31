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
import com.spectrocloud.client.model.V1MaasVlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Maas subnet
 */
@Schema(description = "Maas subnet")


public class V1MaasSubnet {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("space")
  private String space = null;

  @SerializedName("vlans")
  private V1MaasVlan vlans = null;

  public V1MaasSubnet id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of Maas subnet
   * @return id
  **/
  @Schema(description = "Id of Maas subnet")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public V1MaasSubnet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Maas subnet
   * @return name
  **/
  @Schema(description = "Name of Maas subnet")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1MaasSubnet space(String space) {
    this.space = space;
    return this;
  }

   /**
   * Space associated with Maas subnet
   * @return space
  **/
  @Schema(description = "Space associated with Maas subnet")
  public String getSpace() {
    return space;
  }

  public void setSpace(String space) {
    this.space = space;
  }

  public V1MaasSubnet vlans(V1MaasVlan vlans) {
    this.vlans = vlans;
    return this;
  }

   /**
   * Get vlans
   * @return vlans
  **/
  @Schema(description = "")
  public V1MaasVlan getVlans() {
    return vlans;
  }

  public void setVlans(V1MaasVlan vlans) {
    this.vlans = vlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MaasSubnet v1MaasSubnet = (V1MaasSubnet) o;
    return Objects.equals(this.id, v1MaasSubnet.id) &&
        Objects.equals(this.name, v1MaasSubnet.name) &&
        Objects.equals(this.space, v1MaasSubnet.space) &&
        Objects.equals(this.vlans, v1MaasSubnet.vlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, space, vlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MaasSubnet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
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
