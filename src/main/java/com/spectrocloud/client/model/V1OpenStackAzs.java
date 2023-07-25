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
import com.spectrocloud.client.model.V1OpenStackAz;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of OpenStack azs
 */
@Schema(description = "List of OpenStack azs")


public class V1OpenStackAzs {
  @SerializedName("azs")
  private List<V1OpenStackAz> azs = new ArrayList<V1OpenStackAz>();

  public V1OpenStackAzs azs(List<V1OpenStackAz> azs) {
    this.azs = azs;
    return this;
  }

  public V1OpenStackAzs addAzsItem(V1OpenStackAz azsItem) {
    this.azs.add(azsItem);
    return this;
  }

   /**
   * Get azs
   * @return azs
  **/
  @Schema(required = true, description = "")
  public List<V1OpenStackAz> getAzs() {
    return azs;
  }

  public void setAzs(List<V1OpenStackAz> azs) {
    this.azs = azs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1OpenStackAzs v1OpenStackAzs = (V1OpenStackAzs) o;
    return Objects.equals(this.azs, v1OpenStackAzs.azs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1OpenStackAzs {\n");
    
    sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
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