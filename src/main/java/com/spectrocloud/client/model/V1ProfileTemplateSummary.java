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
import com.spectrocloud.client.model.V1PackRefSummary;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Edge host clusterprofile template summary
 */
@Schema(description = "Edge host clusterprofile template summary")


public class V1ProfileTemplateSummary {
  @SerializedName("cloudType")
  private String cloudType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("packs")
  private List<V1PackRefSummary> packs = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("version")
  private String version = null;

  public V1ProfileTemplateSummary cloudType(String cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @Schema(description = "")
  public String getCloudType() {
    return cloudType;
  }

  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }

  public V1ProfileTemplateSummary name(String name) {
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

  public V1ProfileTemplateSummary packs(List<V1PackRefSummary> packs) {
    this.packs = packs;
    return this;
  }

  public V1ProfileTemplateSummary addPacksItem(V1PackRefSummary packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1PackRefSummary>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Get packs
   * @return packs
  **/
  @Schema(description = "")
  public List<V1PackRefSummary> getPacks() {
    return packs;
  }

  public void setPacks(List<V1PackRefSummary> packs) {
    this.packs = packs;
  }

  public V1ProfileTemplateSummary type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1ProfileTemplateSummary uid(String uid) {
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

  public V1ProfileTemplateSummary version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
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
    V1ProfileTemplateSummary v1ProfileTemplateSummary = (V1ProfileTemplateSummary) o;
    return Objects.equals(this.cloudType, v1ProfileTemplateSummary.cloudType) &&
        Objects.equals(this.name, v1ProfileTemplateSummary.name) &&
        Objects.equals(this.packs, v1ProfileTemplateSummary.packs) &&
        Objects.equals(this.type, v1ProfileTemplateSummary.type) &&
        Objects.equals(this.uid, v1ProfileTemplateSummary.uid) &&
        Objects.equals(this.version, v1ProfileTemplateSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, name, packs, type, uid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProfileTemplateSummary {\n");
    
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
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
