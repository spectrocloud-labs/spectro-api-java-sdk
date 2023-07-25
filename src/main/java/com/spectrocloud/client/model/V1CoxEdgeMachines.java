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
import com.spectrocloud.client.model.V1CoxEdgeMachine;
import com.spectrocloud.client.model.V1ListMetaData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CoxEdge machine list
 */
@Schema(description = "CoxEdge machine list")


public class V1CoxEdgeMachines {
  @SerializedName("items")
  private List<V1CoxEdgeMachine> items = new ArrayList<V1CoxEdgeMachine>();

  @SerializedName("listmeta")
  private V1ListMetaData listmeta = null;

  public V1CoxEdgeMachines items(List<V1CoxEdgeMachine> items) {
    this.items = items;
    return this;
  }

  public V1CoxEdgeMachines addItemsItem(V1CoxEdgeMachine itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(required = true, description = "")
  public List<V1CoxEdgeMachine> getItems() {
    return items;
  }

  public void setItems(List<V1CoxEdgeMachine> items) {
    this.items = items;
  }

  public V1CoxEdgeMachines listmeta(V1ListMetaData listmeta) {
    this.listmeta = listmeta;
    return this;
  }

   /**
   * Get listmeta
   * @return listmeta
  **/
  @Schema(description = "")
  public V1ListMetaData getListmeta() {
    return listmeta;
  }

  public void setListmeta(V1ListMetaData listmeta) {
    this.listmeta = listmeta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CoxEdgeMachines v1CoxEdgeMachines = (V1CoxEdgeMachines) o;
    return Objects.equals(this.items, v1CoxEdgeMachines.items) &&
        Objects.equals(this.listmeta, v1CoxEdgeMachines.listmeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, listmeta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CoxEdgeMachines {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    listmeta: ").append(toIndentedString(listmeta)).append("\n");
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
