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
import org.threeten.bp.OffsetDateTime;
/**
 * V1LockSpec
 */



public class V1LockSpec {
  @SerializedName("expireAt")
  private OffsetDateTime expireAt = null;

  @SerializedName("key")
  private String key = null;

  public V1LockSpec expireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Get expireAt
   * @return expireAt
  **/
  @Schema(description = "")
  public OffsetDateTime getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
  }

  public V1LockSpec key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LockSpec v1LockSpec = (V1LockSpec) o;
    return Objects.equals(this.expireAt, v1LockSpec.expireAt) &&
        Objects.equals(this.key, v1LockSpec.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expireAt, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LockSpec {\n");
    
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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