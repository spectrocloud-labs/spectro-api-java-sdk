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
import com.spectrocloud.client.model.V1CloudType;
import com.spectrocloud.client.model.V1PackRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster profile template meta information
 */
@Schema(description = "Cluster profile template meta information")


public class V1ClusterProfileTemplateMeta {
  @SerializedName("cloudType")
  private V1CloudType cloudType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("packs")
  private List<V1PackRef> packs = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uid")
  private String uid = null;

  @SerializedName("version")
  private Integer version = null;

  public V1ClusterProfileTemplateMeta cloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @Schema(description = "")
  public V1CloudType getCloudType() {
    return cloudType;
  }

  public void setCloudType(V1CloudType cloudType) {
    this.cloudType = cloudType;
  }

  public V1ClusterProfileTemplateMeta name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster profile name
   * @return name
  **/
  @Schema(description = "Cluster profile name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ClusterProfileTemplateMeta packs(List<V1PackRef> packs) {
    this.packs = packs;
    return this;
  }

  public V1ClusterProfileTemplateMeta addPacksItem(V1PackRef packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1PackRef>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Cluster profile packs array
   * @return packs
  **/
  @Schema(description = "Cluster profile packs array")
  public List<V1PackRef> getPacks() {
    return packs;
  }

  public void setPacks(List<V1PackRef> packs) {
    this.packs = packs;
  }

  public V1ClusterProfileTemplateMeta scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * scope or context(system, tenant or project)
   * @return scope
  **/
  @Schema(description = "scope or context(system, tenant or project)")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public V1ClusterProfileTemplateMeta type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Cluster profile type [ \&quot;cluster\&quot;, \&quot;infra\&quot;, \&quot;add-on\&quot;, \&quot;system\&quot; ]
   * @return type
  **/
  @Schema(description = "Cluster profile type [ \"cluster\", \"infra\", \"add-on\", \"system\" ]")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1ClusterProfileTemplateMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Cluster profile uid
   * @return uid
  **/
  @Schema(description = "Cluster profile uid")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public V1ClusterProfileTemplateMeta version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
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
    V1ClusterProfileTemplateMeta v1ClusterProfileTemplateMeta = (V1ClusterProfileTemplateMeta) o;
    return Objects.equals(this.cloudType, v1ClusterProfileTemplateMeta.cloudType) &&
        Objects.equals(this.name, v1ClusterProfileTemplateMeta.name) &&
        Objects.equals(this.packs, v1ClusterProfileTemplateMeta.packs) &&
        Objects.equals(this.scope, v1ClusterProfileTemplateMeta.scope) &&
        Objects.equals(this.type, v1ClusterProfileTemplateMeta.type) &&
        Objects.equals(this.uid, v1ClusterProfileTemplateMeta.uid) &&
        Objects.equals(this.version, v1ClusterProfileTemplateMeta.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, name, packs, scope, type, uid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfileTemplateMeta {\n");
    
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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