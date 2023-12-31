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
import com.spectrocloud.client.model.V1AwsVpc;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of AWS VPCs
 */
@Schema(description = "List of AWS VPCs")


public class V1AwsVpcs {
  @SerializedName("vpcs")
  private List<V1AwsVpc> vpcs = new ArrayList<V1AwsVpc>();

  public V1AwsVpcs vpcs(List<V1AwsVpc> vpcs) {
    this.vpcs = vpcs;
    return this;
  }

  public V1AwsVpcs addVpcsItem(V1AwsVpc vpcsItem) {
    this.vpcs.add(vpcsItem);
    return this;
  }

   /**
   * Get vpcs
   * @return vpcs
  **/
  @Schema(required = true, description = "")
  public List<V1AwsVpc> getVpcs() {
    return vpcs;
  }

  public void setVpcs(List<V1AwsVpc> vpcs) {
    this.vpcs = vpcs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsVpcs v1AwsVpcs = (V1AwsVpcs) o;
    return Objects.equals(this.vpcs, v1AwsVpcs.vpcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsVpcs {\n");
    
    sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
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
