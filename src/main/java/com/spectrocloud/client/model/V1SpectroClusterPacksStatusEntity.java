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
import com.spectrocloud.client.model.V1SpectroClusterPackStatusEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1SpectroClusterPacksStatusEntity
 */



public class V1SpectroClusterPacksStatusEntity {
  @SerializedName("packs")
  private List<V1SpectroClusterPackStatusEntity> packs = null;

  public V1SpectroClusterPacksStatusEntity packs(List<V1SpectroClusterPackStatusEntity> packs) {
    this.packs = packs;
    return this;
  }

  public V1SpectroClusterPacksStatusEntity addPacksItem(V1SpectroClusterPackStatusEntity packsItem) {
    if (this.packs == null) {
      this.packs = new ArrayList<V1SpectroClusterPackStatusEntity>();
    }
    this.packs.add(packsItem);
    return this;
  }

   /**
   * Get packs
   * @return packs
  **/
  @Schema(description = "")
  public List<V1SpectroClusterPackStatusEntity> getPacks() {
    return packs;
  }

  public void setPacks(List<V1SpectroClusterPackStatusEntity> packs) {
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
    V1SpectroClusterPacksStatusEntity v1SpectroClusterPacksStatusEntity = (V1SpectroClusterPacksStatusEntity) o;
    return Objects.equals(this.packs, v1SpectroClusterPacksStatusEntity.packs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SpectroClusterPacksStatusEntity {\n");
    
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