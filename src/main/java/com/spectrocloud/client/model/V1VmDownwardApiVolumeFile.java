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
import com.spectrocloud.client.model.V1VmObjectFieldSelector;
import com.spectrocloud.client.model.V1VmResourceFieldSelector;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 */
@Schema(description = "DownwardAPIVolumeFile represents information to create the file containing the pod field")


public class V1VmDownwardApiVolumeFile {
  @SerializedName("fieldRef")
  private V1VmObjectFieldSelector fieldRef = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("resourceFieldRef")
  private V1VmResourceFieldSelector resourceFieldRef = null;

  public V1VmDownwardApiVolumeFile fieldRef(V1VmObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @Schema(description = "")
  public V1VmObjectFieldSelector getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(V1VmObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  public V1VmDownwardApiVolumeFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @Schema(description = "Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public V1VmDownwardApiVolumeFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#x27;..&#x27; path. Must be utf-8 encoded. The first item of the relative path must not start with &#x27;..&#x27;
   * @return path
  **/
  @Schema(required = true, description = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1VmDownwardApiVolumeFile resourceFieldRef(V1VmResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @Schema(description = "")
  public V1VmResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(V1VmResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmDownwardApiVolumeFile v1VmDownwardApiVolumeFile = (V1VmDownwardApiVolumeFile) o;
    return Objects.equals(this.fieldRef, v1VmDownwardApiVolumeFile.fieldRef) &&
        Objects.equals(this.mode, v1VmDownwardApiVolumeFile.mode) &&
        Objects.equals(this.path, v1VmDownwardApiVolumeFile.path) &&
        Objects.equals(this.resourceFieldRef, v1VmDownwardApiVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDownwardApiVolumeFile {\n");
    
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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
