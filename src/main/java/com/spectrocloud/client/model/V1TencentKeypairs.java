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
import com.spectrocloud.client.model.V1TencentKeypair;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of Tencent keypairs
 */
@Schema(description = "List of Tencent keypairs")


public class V1TencentKeypairs {
  @SerializedName("keypairs")
  private List<V1TencentKeypair> keypairs = null;

  public V1TencentKeypairs keypairs(List<V1TencentKeypair> keypairs) {
    this.keypairs = keypairs;
    return this;
  }

  public V1TencentKeypairs addKeypairsItem(V1TencentKeypair keypairsItem) {
    if (this.keypairs == null) {
      this.keypairs = new ArrayList<V1TencentKeypair>();
    }
    this.keypairs.add(keypairsItem);
    return this;
  }

   /**
   * Get keypairs
   * @return keypairs
  **/
  @Schema(description = "")
  public List<V1TencentKeypair> getKeypairs() {
    return keypairs;
  }

  public void setKeypairs(List<V1TencentKeypair> keypairs) {
    this.keypairs = keypairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TencentKeypairs v1TencentKeypairs = (V1TencentKeypairs) o;
    return Objects.equals(this.keypairs, v1TencentKeypairs.keypairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypairs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentKeypairs {\n");
    
    sb.append("    keypairs: ").append(toIndentedString(keypairs)).append("\n");
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
