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
 * V1PackManifestRef
 */



public class V1PackManifestRef {
  @SerializedName("digest")
  private String digest = null;

  @SerializedName("isOverridden")
  private Boolean isOverridden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentUid")
  private String parentUid = null;

  @SerializedName("uid")
  private String uid = null;

  public V1PackManifestRef digest(String digest) {
    this.digest = digest;
    return this;
  }

   /**
   * Get digest
   * @return digest
  **/
  @Schema(description = "")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public V1PackManifestRef isOverridden(Boolean isOverridden) {
    this.isOverridden = isOverridden;
    return this;
  }

   /**
   * Get isOverridden
   * @return isOverridden
  **/
  @Schema(description = "")
  public Boolean isIsOverridden() {
    return isOverridden;
  }

  public void setIsOverridden(Boolean isOverridden) {
    this.isOverridden = isOverridden;
  }

  public V1PackManifestRef name(String name) {
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

  public V1PackManifestRef parentUid(String parentUid) {
    this.parentUid = parentUid;
    return this;
  }

   /**
   * Get parentUid
   * @return parentUid
  **/
  @Schema(description = "")
  public String getParentUid() {
    return parentUid;
  }

  public void setParentUid(String parentUid) {
    this.parentUid = parentUid;
  }

  public V1PackManifestRef uid(String uid) {
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
    V1PackManifestRef v1PackManifestRef = (V1PackManifestRef) o;
    return Objects.equals(this.digest, v1PackManifestRef.digest) &&
        Objects.equals(this.isOverridden, v1PackManifestRef.isOverridden) &&
        Objects.equals(this.name, v1PackManifestRef.name) &&
        Objects.equals(this.parentUid, v1PackManifestRef.parentUid) &&
        Objects.equals(this.uid, v1PackManifestRef.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, isOverridden, name, parentUid, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackManifestRef {\n");
    
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    isOverridden: ").append(toIndentedString(isOverridden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentUid: ").append(toIndentedString(parentUid)).append("\n");
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