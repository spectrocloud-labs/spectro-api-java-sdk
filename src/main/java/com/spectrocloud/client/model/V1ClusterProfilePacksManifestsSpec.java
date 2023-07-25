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
import com.spectrocloud.client.model.V1ClusterProfilePackManifests;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1ClusterProfilePacksManifestsSpec
 */



public class V1ClusterProfilePacksManifestsSpec {
  @SerializedName("packs")
  private List<V1ClusterProfilePackManifests> packs = null;

  public V1ClusterProfilePacksManifestsSpec packs(List<V1ClusterProfilePackManifests> packs) {
    this.packs = packs;
    return this;
  }

  public V1ClusterProfilePacksManifestsSpec addPacksItem(V1ClusterProfilePackManifests packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1ClusterProfilePackManifests>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Cluster profile packs array
   * @return packs
  **/
  @Schema(description = "Cluster profile packs array")
  public List<V1ClusterProfilePackManifests> getPacks() {
    return packs;
  }

  public void setPacks(List<V1ClusterProfilePackManifests> packs) {
    this.packs = packs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterProfilePacksManifestsSpec v1ClusterProfilePacksManifestsSpec = (V1ClusterProfilePacksManifestsSpec) o;
    return Objects.equals(this.packs, v1ClusterProfilePacksManifestsSpec.packs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterProfilePacksManifestsSpec {\n");
    
    sb.append("    packs: ").append(toIndentedString(packs)).append("\n");
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