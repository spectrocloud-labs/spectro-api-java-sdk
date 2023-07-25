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
import java.util.ArrayList;
import java.util.List;
/**
 * V1FilterArray
 */



public class V1FilterArray {
  @SerializedName("beginsWith")
  private List<String> beginsWith = null;

  @SerializedName("eq")
  private List<String> eq = null;

  @SerializedName("ignoreCase")
  private Boolean ignoreCase = true;

  @SerializedName("ne")
  private List<String> ne = null;

  public V1FilterArray beginsWith(List<String> beginsWith) {
    this.beginsWith = beginsWith;
    return this;
  }

  public V1FilterArray addBeginsWithItem(String beginsWithItem) {
    if (this.beginsWith == null) {
      this.beginsWith = new ArrayList<String>();
    }
    this.beginsWith.add(beginsWithItem);
    return this;
  }

   /**
   * Get beginsWith
   * @return beginsWith
  **/
  @Schema(description = "")
  public List<String> getBeginsWith() {
    return beginsWith;
  }

  public void setBeginsWith(List<String> beginsWith) {
    this.beginsWith = beginsWith;
  }

  public V1FilterArray eq(List<String> eq) {
    this.eq = eq;
    return this;
  }

  public V1FilterArray addEqItem(String eqItem) {
    if (this.eq == null) {
      this.eq = new ArrayList<String>();
    }
    this.eq.add(eqItem);
    return this;
  }

   /**
   * Get eq
   * @return eq
  **/
  @Schema(description = "")
  public List<String> getEq() {
    return eq;
  }

  public void setEq(List<String> eq) {
    this.eq = eq;
  }

  public V1FilterArray ignoreCase(Boolean ignoreCase) {
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

  public V1FilterArray ne(List<String> ne) {
    this.ne = ne;
    return this;
  }

  public V1FilterArray addNeItem(String neItem) {
    if (this.ne == null) {
      this.ne = new ArrayList<String>();
    }
    this.ne.add(neItem);
    return this;
  }

   /**
   * Get ne
   * @return ne
  **/
  @Schema(description = "")
  public List<String> getNe() {
    return ne;
  }

  public void setNe(List<String> ne) {
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
    V1FilterArray v1FilterArray = (V1FilterArray) o;
    return Objects.equals(this.beginsWith, v1FilterArray.beginsWith) &&
        Objects.equals(this.eq, v1FilterArray.eq) &&
        Objects.equals(this.ignoreCase, v1FilterArray.ignoreCase) &&
        Objects.equals(this.ne, v1FilterArray.ne);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginsWith, eq, ignoreCase, ne);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FilterArray {\n");
    
    sb.append("    beginsWith: ").append(toIndentedString(beginsWith)).append("\n");
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