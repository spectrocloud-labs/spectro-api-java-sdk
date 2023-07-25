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
import com.spectrocloud.client.model.V1PackImportEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Cluster profile import template
 */
@Schema(description = "Cluster profile import template")


public class V1ClusterProfileTemplateImportEntity {
  @SerializedName("cloudType")
  private String cloudType = null;

  @SerializedName("packs")
  private List<V1PackImportEntity> packs = null;

  @SerializedName("type")
  private String type = null;

  public V1ClusterProfileTemplateImportEntity cloudType(String cloudType) {
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Cluster profile cloud type
   * @return cloudType
  **/
  @Schema(description = "Cluster profile cloud type")
  public String getCloudType() {
    return cloudType;
  }

  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }

  public V1ClusterProfileTemplateImportEntity packs(List<V1PackImportEntity> packs) {
    this.packs = packs;
    return this;
  }

  public V1ClusterProfileTemplateImportEntity addPacksItem(V1PackImportEntity packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1PackImportEntity>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Cluster profile packs array
   * @return packs
  **/
  @Schema(description = "Cluster profile packs array")
  public List<V1PackImportEntity> getPacks() {
    return packs;
  }

  public void setPacks(List<V1PackImportEntity> packs) {
    this.packs = packs;
  }

  public V1ClusterProfileTemplateImportEntity type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfileTemplateImportEntity v1ClusterProfileTemplateImportEntity = (V1ClusterProfileTemplateImportEntity) o;
    return Objects.equals(this.cloudType, v1ClusterProfileTemplateImportEntity.cloudType) &&
        Objects.equals(this.packs, v1ClusterProfileTemplateImportEntity.packs) &&
        Objects.equals(this.type, v1ClusterProfileTemplateImportEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, packs, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfileTemplateImportEntity {\n");
    
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
