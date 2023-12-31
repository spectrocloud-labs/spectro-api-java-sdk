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
import com.spectrocloud.client.model.V1AppTierType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application tier reference
 */
@Schema(description = "Application tier reference")


public class V1AppTierRef {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private V1AppTierType type = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("version")
  private String version = null;

  public V1AppTierRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application tier name
   * @return name
  **/
  @Schema(description = "Application tier name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AppTierRef type(V1AppTierType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public V1AppTierType getType() {
    return type;
  }

  public void setType(V1AppTierType type) {
    this.type = type;
  }

  public V1AppTierRef uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Application tier uid to uniquely identify the tier
   * @return uid
  **/
  @Schema(description = "Application tier uid to uniquely identify the tier")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1AppTierRef version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Application tier version
   * @return version
  **/
  @Schema(description = "Application tier version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppTierRef v1AppTierRef = (V1AppTierRef) o;
    return Objects.equals(this.name, v1AppTierRef.name) &&
        Objects.equals(this.type, v1AppTierRef.type) &&
        Objects.equals(this.uid, v1AppTierRef.uid) &&
        Objects.equals(this.version, v1AppTierRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, uid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppTierRef {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
