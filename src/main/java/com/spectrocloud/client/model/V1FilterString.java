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
 * V1FilterString
 */



public class V1FilterString {
  @SerializedName("beginsWith")
  private String beginsWith = null;

  @SerializedName("contains")
  private String contains = null;

  @SerializedName("eq")
  private String eq = null;

  @SerializedName("ignoreCase")
  private Boolean ignoreCase = true;

  @SerializedName("ne")
  private String ne = null;

  public V1FilterString beginsWith(String beginsWith) {
    this.beginsWith = beginsWith;
    return this;
  }

   /**
   * Get beginsWith
   * @return beginsWith
  **/
  @Schema(description = "")
  public String getBeginsWith() {
    return beginsWith;
  }

  public void setBeginsWith(String beginsWith) {
    this.beginsWith = beginsWith;
  }

  public V1FilterString contains(String contains) {
    this.contains = contains;
    return this;
  }

   /**
   * Get contains
   * @return contains
  **/
  @Schema(description = "")
  public String getContains() {
    return contains;
  }

  public void setContains(String contains) {
    this.contains = contains;
  }

  public V1FilterString eq(String eq) {
    this.eq = eq;
    return this;
  }

   /**
   * Get eq
   * @return eq
  **/
  @Schema(description = "")
  public String getEq() {
    return eq;
  }

  public void setEq(String eq) {
    this.eq = eq;
  }

  public V1FilterString ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @Schema(description = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public V1FilterString ne(String ne) {
    this.ne = ne;
    return this;
  }

   /**
   * Get ne
   * @return ne
  **/
  @Schema(description = "")
  public String getNe() {
    return ne;
  }

  public void setNe(String ne) {
    this.ne = ne;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1FilterString v1FilterString = (V1FilterString) o;
    return Objects.equals(this.beginsWith, v1FilterString.beginsWith) &&
        Objects.equals(this.contains, v1FilterString.contains) &&
        Objects.equals(this.eq, v1FilterString.eq) &&
        Objects.equals(this.ignoreCase, v1FilterString.ignoreCase) &&
        Objects.equals(this.ne, v1FilterString.ne);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginsWith, contains, eq, ignoreCase, ne);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FilterString {\n");
    
    sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
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
