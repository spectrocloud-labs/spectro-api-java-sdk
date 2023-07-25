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
import com.spectrocloud.client.model.V1Invoice;
import com.spectrocloud.client.model.V1ListMetaData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of invoices
 */
@Schema(description = "List of invoices")


public class V1Invoices {
  @SerializedName("invoices")
  private List<V1Invoice> invoices = new ArrayList<V1Invoice>();

  @SerializedName("listmeta")
  private V1ListMetaData listmeta = null;

  public V1Invoices invoices(List<V1Invoice> invoices) {
    this.invoices = invoices;
    return this;
  }

  public V1Invoices addInvoicesItem(V1Invoice invoicesItem) {
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @Schema(required = true, description = "")
  public List<V1Invoice> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<V1Invoice> invoices) {
    this.invoices = invoices;
  }

  public V1Invoices listmeta(V1ListMetaData listmeta) {
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
    V1Invoices v1Invoices = (V1Invoices) o;
    return Objects.equals(this.invoices, v1Invoices.invoices) &&
        Objects.equals(this.listmeta, v1Invoices.listmeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices, listmeta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Invoices {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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
