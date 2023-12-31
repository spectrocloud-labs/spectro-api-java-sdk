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
 * DataVolumeSourceRef defines an indirect reference to the source of data for the DataVolume
 */
@Schema(description = "DataVolumeSourceRef defines an indirect reference to the source of data for the DataVolume")


public class V1VmDataVolumeSourceRef {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public V1VmDataVolumeSourceRef kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of the source reference, currently only \&quot;DataSource\&quot; is supported
   * @return kind
  **/
  @Schema(required = true, description = "The kind of the source reference, currently only \"DataSource\" is supported")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1VmDataVolumeSourceRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the source reference
   * @return name
  **/
  @Schema(required = true, description = "The name of the source reference")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VmDataVolumeSourceRef namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of the source reference, defaults to the DataVolume namespace
   * @return namespace
  **/
  @Schema(description = "The namespace of the source reference, defaults to the DataVolume namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmDataVolumeSourceRef v1VmDataVolumeSourceRef = (V1VmDataVolumeSourceRef) o;
    return Objects.equals(this.kind, v1VmDataVolumeSourceRef.kind) &&
        Objects.equals(this.name, v1VmDataVolumeSourceRef.name) &&
        Objects.equals(this.namespace, v1VmDataVolumeSourceRef.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmDataVolumeSourceRef {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
