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
import com.spectrocloud.client.model.V1StorageType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of GCP storage types
 */
@Schema(description = "List of GCP storage types")


public class V1GcpStorageTypes {
  @SerializedName("storageTypes")
  private List<V1StorageType> storageTypes = null;

  public V1GcpStorageTypes storageTypes(List<V1StorageType> storageTypes) {
    this.storageTypes = storageTypes;
    return this;
  }

  public V1GcpStorageTypes addStorageTypesItem(V1StorageType storageTypesItem) {
    if (this.storageTypes == null) {
      this.storageTypes = new ArrayList<V1StorageType>();
    }
    this.storageTypes.add(storageTypesItem);
    return this;
  }

   /**
   * Get storageTypes
   * @return storageTypes
  **/
  @Schema(description = "")
  public List<V1StorageType> getStorageTypes() {
    return storageTypes;
  }

  public void setStorageTypes(List<V1StorageType> storageTypes) {
    this.storageTypes = storageTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GcpStorageTypes v1GcpStorageTypes = (V1GcpStorageTypes) o;
    return Objects.equals(this.storageTypes, v1GcpStorageTypes.storageTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GcpStorageTypes {\n");
    
    sb.append("    storageTypes: ").append(toIndentedString(storageTypes)).append("\n");
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
