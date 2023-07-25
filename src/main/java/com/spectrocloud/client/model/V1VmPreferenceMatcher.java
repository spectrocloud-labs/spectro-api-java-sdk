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
 * PreferenceMatcher references a set of preference that is used to fill fields in the VMI template.
 */
@Schema(description = "PreferenceMatcher references a set of preference that is used to fill fields in the VMI template.")


public class V1VmPreferenceMatcher {
  @SerializedName("inferFromVolume")
  private String inferFromVolume = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("revisionName")
  private String revisionName = null;

  public V1VmPreferenceMatcher inferFromVolume(String inferFromVolume) {
    this.inferFromVolume = inferFromVolume;
    return this;
  }

   /**
   * InferFromVolume lists the name of a volume that should be used to infer or discover the preference to be used through known annotations on the underlying resource. Once applied to the PreferenceMatcher this field is removed.
   * @return inferFromVolume
  **/
  @Schema(description = "InferFromVolume lists the name of a volume that should be used to infer or discover the preference to be used through known annotations on the underlying resource. Once applied to the PreferenceMatcher this field is removed.")
  public String getInferFromVolume() {
    return inferFromVolume;
  }

  public void setInferFromVolume(String inferFromVolume) {
    this.inferFromVolume = inferFromVolume;
  }

  public V1VmPreferenceMatcher kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind specifies which preference resource is referenced. Allowed values are: \&quot;VirtualMachinePreference\&quot; and \&quot;VirtualMachineClusterPreference\&quot;. If not specified, \&quot;VirtualMachineClusterPreference\&quot; is used by default.
   * @return kind
  **/
  @Schema(description = "Kind specifies which preference resource is referenced. Allowed values are: \"VirtualMachinePreference\" and \"VirtualMachineClusterPreference\". If not specified, \"VirtualMachineClusterPreference\" is used by default.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1VmPreferenceMatcher name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the VirtualMachinePreference or VirtualMachineClusterPreference
   * @return name
  **/
  @Schema(description = "Name is the name of the VirtualMachinePreference or VirtualMachineClusterPreference")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1VmPreferenceMatcher revisionName(String revisionName) {
    this.revisionName = revisionName;
    return this;
  }

   /**
   * RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachinePreference or VirtualMachineClusterPreference to be used. This is initially captured the first time the instancetype is applied to the VirtualMachineInstance.
   * @return revisionName
  **/
  @Schema(description = "RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachinePreference or VirtualMachineClusterPreference to be used. This is initially captured the first time the instancetype is applied to the VirtualMachineInstance.")
  public String getRevisionName() {
    return revisionName;
  }

  public void setRevisionName(String revisionName) {
    this.revisionName = revisionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmPreferenceMatcher v1VmPreferenceMatcher = (V1VmPreferenceMatcher) o;
    return Objects.equals(this.inferFromVolume, v1VmPreferenceMatcher.inferFromVolume) &&
        Objects.equals(this.kind, v1VmPreferenceMatcher.kind) &&
        Objects.equals(this.name, v1VmPreferenceMatcher.name) &&
        Objects.equals(this.revisionName, v1VmPreferenceMatcher.revisionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inferFromVolume, kind, name, revisionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmPreferenceMatcher {\n");
    
    sb.append("    inferFromVolume: ").append(toIndentedString(inferFromVolume)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revisionName: ").append(toIndentedString(revisionName)).append("\n");
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
