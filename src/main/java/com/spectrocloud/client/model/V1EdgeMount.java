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
/**
 * Edge mounts
 */
@Schema(description = "Edge mounts")


public class V1EdgeMount {
  @SerializedName("containerPath")
  private String containerPath = null;

  @SerializedName("hostPath")
  private String hostPath = null;

  @SerializedName("readonly")
  private Boolean readonly = null;

  public V1EdgeMount containerPath(String containerPath) {
    this.containerPath = containerPath;
    return this;
  }

   /**
   * Get containerPath
   * @return containerPath
  **/
  @Schema(description = "")
  public String getContainerPath() {
    return containerPath;
  }

  public void setContainerPath(String containerPath) {
    this.containerPath = containerPath;
  }

  public V1EdgeMount hostPath(String hostPath) {
    this.hostPath = hostPath;
    return this;
  }

   /**
   * Get hostPath
   * @return hostPath
  **/
  @Schema(description = "")
  public String getHostPath() {
    return hostPath;
  }

  public void setHostPath(String hostPath) {
    this.hostPath = hostPath;
  }

  public V1EdgeMount readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

   /**
   * Get readonly
   * @return readonly
  **/
  @Schema(description = "")
  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EdgeMount v1EdgeMount = (V1EdgeMount) o;
    return Objects.equals(this.containerPath, v1EdgeMount.containerPath) &&
        Objects.equals(this.hostPath, v1EdgeMount.hostPath) &&
        Objects.equals(this.readonly, v1EdgeMount.readonly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPath, hostPath, readonly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EdgeMount {\n");
    
    sb.append("    containerPath: ").append(toIndentedString(containerPath)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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
