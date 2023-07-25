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
 * Audit resource reference object
 */
@Schema(description = "Audit resource reference object")


public class V1AuditResourceReference {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uid")
  private String uid = null;

  public V1AuditResourceReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Audit resource type
   * @return kind
  **/
  @Schema(description = "Audit resource type")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1AuditResourceReference label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Audit resource label
   * @return label
  **/
  @Schema(description = "Audit resource label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public V1AuditResourceReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Audit resource name
   * @return name
  **/
  @Schema(description = "Audit resource name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AuditResourceReference uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Audit resource uid
   * @return uid
  **/
  @Schema(required = true, description = "Audit resource uid")
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
    V1AuditResourceReference v1AuditResourceReference = (V1AuditResourceReference) o;
    return Objects.equals(this.kind, v1AuditResourceReference.kind) &&
        Objects.equals(this.label, v1AuditResourceReference.label) &&
        Objects.equals(this.name, v1AuditResourceReference.name) &&
        Objects.equals(this.uid, v1AuditResourceReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, label, name, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AuditResourceReference {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
