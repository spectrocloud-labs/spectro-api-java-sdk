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
import com.spectrocloud.client.model.V1ManifestRefUpdateEntity;
import com.spectrocloud.client.model.V1PackType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Pack values entity to refer the existing pack for the values override
 */
@Schema(description = "Pack values entity to refer the existing pack for the values override")


public class V1PackValuesEntity {
  @SerializedName("manifests")
  private List<V1ManifestRefUpdateEntity> manifests = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("type")
  private V1PackType type = null;

  @SerializedName("values")
  private String values = null;

  public V1PackValuesEntity manifests(List<V1ManifestRefUpdateEntity> manifests) {
    this.manifests = manifests;
    return this;
  }

  public V1PackValuesEntity addManifestsItem(V1ManifestRefUpdateEntity manifestsItem) {
    if (this.manifests == null) {
      this.manifests = new ArrayList<V1ManifestRefUpdateEntity>();
    }
    this.manifests.add(manifestsItem);
    return this;
  }

   /**
   * Pack manifests are additional content as part of the profile
   * @return manifests
  **/
  @Schema(description = "Pack manifests are additional content as part of the profile")
  public List<V1ManifestRefUpdateEntity> getManifests() {
    return manifests;
  }

  public void setManifests(List<V1ManifestRefUpdateEntity> manifests) {
    this.manifests = manifests;
  }

  public V1PackValuesEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Pack name
   * @return name
  **/
  @Schema(required = true, description = "Pack name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1PackValuesEntity tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Pack version tag
   * @return tag
  **/
  @Schema(description = "Pack version tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1PackValuesEntity type(V1PackType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public V1PackType getType() {
    return type;
  }

  public void setType(V1PackType type) {
    this.type = type;
  }

  public V1PackValuesEntity values(String values) {
    this.values = values;
    return this;
  }

   /**
   * Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values
   * @return values
  **/
  @Schema(description = "Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values")
  public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PackValuesEntity v1PackValuesEntity = (V1PackValuesEntity) o;
    return Objects.equals(this.manifests, v1PackValuesEntity.manifests) &&
        Objects.equals(this.name, v1PackValuesEntity.name) &&
        Objects.equals(this.tag, v1PackValuesEntity.tag) &&
        Objects.equals(this.type, v1PackValuesEntity.type) &&
        Objects.equals(this.values, v1PackValuesEntity.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests, name, tag, type, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackValuesEntity {\n");
    
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
