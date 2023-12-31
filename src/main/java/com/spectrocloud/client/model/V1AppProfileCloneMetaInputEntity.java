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
import com.spectrocloud.client.model.V1AppProfileCloneTarget;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Application profile clone metadata
 */
@Schema(description = "Application profile clone metadata")


public class V1AppProfileCloneMetaInputEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("target")
  private V1AppProfileCloneTarget target = null;

  @SerializedName("version")
  private String version = null;

  public V1AppProfileCloneMetaInputEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application profile name
   * @return name
  **/
  @Schema(required = true, description = "Application profile name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1AppProfileCloneMetaInputEntity target(V1AppProfileCloneTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public V1AppProfileCloneTarget getTarget() {
    return target;
  }

  public void setTarget(V1AppProfileCloneTarget target) {
    this.target = target;
  }

  public V1AppProfileCloneMetaInputEntity version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Application profile version
   * @return version
  **/
  @Schema(description = "Application profile version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AppProfileCloneMetaInputEntity v1AppProfileCloneMetaInputEntity = (V1AppProfileCloneMetaInputEntity) o;
    return Objects.equals(this.name, v1AppProfileCloneMetaInputEntity.name) &&
        Objects.equals(this.target, v1AppProfileCloneMetaInputEntity.target) &&
        Objects.equals(this.version, v1AppProfileCloneMetaInputEntity.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, target, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppProfileCloneMetaInputEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
