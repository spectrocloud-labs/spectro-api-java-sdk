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
import com.spectrocloud.client.model.V1SearchFilterBoolCondition;
import com.spectrocloud.client.model.V1SearchFilterDateCondition;
import com.spectrocloud.client.model.V1SearchFilterFloatCondition;
import com.spectrocloud.client.model.V1SearchFilterIntegerCondition;
import com.spectrocloud.client.model.V1SearchFilterKeyValueCondition;
import com.spectrocloud.client.model.V1SearchFilterStringCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1SearchFilterCondition
 */



public class V1SearchFilterCondition {
  @SerializedName("bool")
  private V1SearchFilterBoolCondition bool = null;

  @SerializedName("date")
  private V1SearchFilterDateCondition date = null;

  @SerializedName("float")
  private V1SearchFilterFloatCondition _float = null;

  @SerializedName("int")
  private V1SearchFilterIntegerCondition _int = null;

  @SerializedName("keyValue")
  private V1SearchFilterKeyValueCondition keyValue = null;

  @SerializedName("string")
  private V1SearchFilterStringCondition string = null;

  public V1SearchFilterCondition bool(V1SearchFilterBoolCondition bool) {
    this.bool = bool;
    return this;
  }

   /**
   * Get bool
   * @return bool
  **/
  @Schema(description = "")
  public V1SearchFilterBoolCondition getBool() {
    return bool;
  }

  public void setBool(V1SearchFilterBoolCondition bool) {
    this.bool = bool;
  }

  public V1SearchFilterCondition date(V1SearchFilterDateCondition date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public V1SearchFilterDateCondition getDate() {
    return date;
  }

  public void setDate(V1SearchFilterDateCondition date) {
    this.date = date;
  }

  public V1SearchFilterCondition _float(V1SearchFilterFloatCondition _float) {
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * @return _float
  **/
  @Schema(description = "")
  public V1SearchFilterFloatCondition getFloat() {
    return _float;
  }

  public void setFloat(V1SearchFilterFloatCondition _float) {
    this._float = _float;
  }

  public V1SearchFilterCondition _int(V1SearchFilterIntegerCondition _int) {
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @Schema(description = "")
  public V1SearchFilterIntegerCondition getInt() {
    return _int;
  }

  public void setInt(V1SearchFilterIntegerCondition _int) {
    this._int = _int;
  }

  public V1SearchFilterCondition keyValue(V1SearchFilterKeyValueCondition keyValue) {
    this.keyValue = keyValue;
    return this;
  }

   /**
   * Get keyValue
   * @return keyValue
  **/
  @Schema(description = "")
  public V1SearchFilterKeyValueCondition getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(V1SearchFilterKeyValueCondition keyValue) {
    this.keyValue = keyValue;
  }

  public V1SearchFilterCondition string(V1SearchFilterStringCondition string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @Schema(description = "")
  public V1SearchFilterStringCondition getString() {
    return string;
  }

  public void setString(V1SearchFilterStringCondition string) {
    this.string = string;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SearchFilterCondition v1SearchFilterCondition = (V1SearchFilterCondition) o;
    return Objects.equals(this.bool, v1SearchFilterCondition.bool) &&
        Objects.equals(this.date, v1SearchFilterCondition.date) &&
        Objects.equals(this._float, v1SearchFilterCondition._float) &&
        Objects.equals(this._int, v1SearchFilterCondition._int) &&
        Objects.equals(this.keyValue, v1SearchFilterCondition.keyValue) &&
        Objects.equals(this.string, v1SearchFilterCondition.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bool, date, _float, _int, keyValue, string);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SearchFilterCondition {\n");
    
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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