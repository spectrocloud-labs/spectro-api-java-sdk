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
import com.spectrocloud.client.model.V1StorageContainer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * List of Azure storage containers
 */
@Schema(description = "List of Azure storage containers")


public class V1AzureStorageContainers {
  @SerializedName("containers")
  private List<V1StorageContainer> containers = null;

  public V1AzureStorageContainers containers(List<V1StorageContainer> containers) {
    this.containers = containers;
    return this;
  }

  public V1AzureStorageContainers addContainersItem(V1StorageContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<V1StorageContainer>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Get containers
   * @return containers
  **/
  @Schema(description = "")
  public List<V1StorageContainer> getContainers() {
    return containers;
  }

  public void setContainers(List<V1StorageContainer> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureStorageContainers v1AzureStorageContainers = (V1AzureStorageContainers) o;
    return Objects.equals(this.containers, v1AzureStorageContainers.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureStorageContainers {\n");
    
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
