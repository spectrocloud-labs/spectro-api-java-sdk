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
import com.spectrocloud.client.model.V1UserMetaEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1UsersMetadata
 */



public class V1UsersMetadata {
  @SerializedName("items")
  private List<V1UserMetaEntity> items = new ArrayList<V1UserMetaEntity>();

  public V1UsersMetadata items(List<V1UserMetaEntity> items) {
    this.items = items;
    return this;
  }

  public V1UsersMetadata addItemsItem(V1UserMetaEntity itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<V1UserMetaEntity> getItems() {
    return items;
  }

  public void setItems(List<V1UserMetaEntity> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1UsersMetadata v1UsersMetadata = (V1UsersMetadata) o;
    return Objects.equals(this.items, v1UsersMetadata.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1UsersMetadata {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
