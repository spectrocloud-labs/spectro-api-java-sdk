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
import com.spectrocloud.client.model.V1ClusterCondition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V1ClusterPackManifestStatus
 */



public class V1ClusterPackManifestStatus {
  @SerializedName("condition")
  private V1ClusterCondition condition = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ClusterPackManifestStatus condition(V1ClusterCondition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public V1ClusterCondition getCondition() {
    return condition;
  }

  public void setCondition(V1ClusterCondition condition) {
    this.condition = condition;
  }

  public V1ClusterPackManifestStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ClusterPackManifestStatus uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterPackManifestStatus v1ClusterPackManifestStatus = (V1ClusterPackManifestStatus) o;
    return Objects.equals(this.condition, v1ClusterPackManifestStatus.condition) &&
        Objects.equals(this.name, v1ClusterPackManifestStatus.name) &&
        Objects.equals(this.uid, v1ClusterPackManifestStatus.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, name, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterPackManifestStatus {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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