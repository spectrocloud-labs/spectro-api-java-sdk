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
 * Tencent Keypair entity
 */
@Schema(description = "Tencent Keypair entity")


public class V1TencentKeypair {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("publickey")
  private String publickey = null;

  public V1TencentKeypair id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Tencent keypair id
   * @return id
  **/
  @Schema(description = "Tencent keypair id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1TencentKeypair name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Tencent keypair name
   * @return name
  **/
  @Schema(description = "Tencent keypair name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1TencentKeypair publickey(String publickey) {
    this.publickey = publickey;
    return this;
  }

   /**
   * Tencent public key
   * @return publickey
  **/
  @Schema(description = "Tencent public key")
  public String getPublickey() {
    return publickey;
  }

  public void setPublickey(String publickey) {
    this.publickey = publickey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TencentKeypair v1TencentKeypair = (V1TencentKeypair) o;
    return Objects.equals(this.id, v1TencentKeypair.id) &&
        Objects.equals(this.name, v1TencentKeypair.name) &&
        Objects.equals(this.publickey, v1TencentKeypair.publickey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, publickey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TencentKeypair {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publickey: ").append(toIndentedString(publickey)).append("\n");
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
