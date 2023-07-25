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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SnapshotVolumesLists includes the list of volumes which were included in the snapshot and volumes which were excluded from the snapshot
 */
@Schema(description = "SnapshotVolumesLists includes the list of volumes which were included in the snapshot and volumes which were excluded from the snapshot")


public class V1VmSnapshotVolumesLists {
  @SerializedName("excludedVolumes")
  private List<String> excludedVolumes = null;

  @SerializedName("includedVolumes")
  private List<String> includedVolumes = null;

  public V1VmSnapshotVolumesLists excludedVolumes(List<String> excludedVolumes) {
    this.excludedVolumes = excludedVolumes;
    return this;
  }

  public V1VmSnapshotVolumesLists addExcludedVolumesItem(String excludedVolumesItem) {
    if (this.excludedVolumes == null) {
      this.excludedVolumes = new ArrayList<String>();
    }
    this.excludedVolumes.add(excludedVolumesItem);
    return this;
  }

   /**
   * Get excludedVolumes
   * @return excludedVolumes
  **/
  @Schema(description = "")
  public List<String> getExcludedVolumes() {
    return excludedVolumes;
  }

  public void setExcludedVolumes(List<String> excludedVolumes) {
    this.excludedVolumes = excludedVolumes;
  }

  public V1VmSnapshotVolumesLists includedVolumes(List<String> includedVolumes) {
    this.includedVolumes = includedVolumes;
    return this;
  }

  public V1VmSnapshotVolumesLists addIncludedVolumesItem(String includedVolumesItem) {
    if (this.includedVolumes == null) {
      this.includedVolumes = new ArrayList<String>();
    }
    this.includedVolumes.add(includedVolumesItem);
    return this;
  }

   /**
   * Get includedVolumes
   * @return includedVolumes
  **/
  @Schema(description = "")
  public List<String> getIncludedVolumes() {
    return includedVolumes;
  }

  public void setIncludedVolumes(List<String> includedVolumes) {
    this.includedVolumes = includedVolumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSnapshotVolumesLists v1VmSnapshotVolumesLists = (V1VmSnapshotVolumesLists) o;
    return Objects.equals(this.excludedVolumes, v1VmSnapshotVolumesLists.excludedVolumes) &&
        Objects.equals(this.includedVolumes, v1VmSnapshotVolumesLists.includedVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedVolumes, includedVolumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSnapshotVolumesLists {\n");
    
    sb.append("    excludedVolumes: ").append(toIndentedString(excludedVolumes)).append("\n");
    sb.append("    includedVolumes: ").append(toIndentedString(includedVolumes)).append("\n");
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
