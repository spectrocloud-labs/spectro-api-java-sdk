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
 * V1EdgeHostSSHSecret
 */



public class V1EdgeHostSSHSecret {
  @SerializedName("name")
  private String name = null;

  @SerializedName("privateKey")
  private String privateKey = null;

  public V1EdgeHostSSHSecret name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SSH secret name
   * @return name
  **/
  @Schema(description = "SSH secret name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EdgeHostSSHSecret privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Private Key to access the host
   * @return privateKey
  **/
  @Schema(description = "Private Key to access the host")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EdgeHostSSHSecret v1EdgeHostSSHSecret = (V1EdgeHostSSHSecret) o;
    return Objects.equals(this.name, v1EdgeHostSSHSecret.name) &&
        Objects.equals(this.privateKey, v1EdgeHostSSHSecret.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EdgeHostSSHSecret {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
