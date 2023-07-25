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
 * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly attached to the vmi via qemu. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
 */
@Schema(description = "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly attached to the vmi via qemu. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")


public class V1VmPersistentVolumeClaimVolumeSource {
  @SerializedName("claimName")
  private String claimName = null;

  @SerializedName("hotpluggable")
  private Boolean hotpluggable = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public V1VmPersistentVolumeClaimVolumeSource claimName(String claimName) {
    this.claimName = claimName;
    return this;
  }

   /**
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return claimName
  **/
  @Schema(required = true, description = "ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public String getClaimName() {
    return claimName;
  }

  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  public V1VmPersistentVolumeClaimVolumeSource hotpluggable(Boolean hotpluggable) {
    this.hotpluggable = hotpluggable;
    return this;
  }

   /**
   * Hotpluggable indicates whether the volume can be hotplugged and hotunplugged.
   * @return hotpluggable
  **/
  @Schema(description = "Hotpluggable indicates whether the volume can be hotplugged and hotunplugged.")
  public Boolean isHotpluggable() {
    return hotpluggable;
  }

  public void setHotpluggable(Boolean hotpluggable) {
    this.hotpluggable = hotpluggable;
  }

  public V1VmPersistentVolumeClaimVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Will force the ReadOnly setting in VolumeMounts. Default false.
   * @return readOnly
  **/
  @Schema(description = "Will force the ReadOnly setting in VolumeMounts. Default false.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmPersistentVolumeClaimVolumeSource v1VmPersistentVolumeClaimVolumeSource = (V1VmPersistentVolumeClaimVolumeSource) o;
    return Objects.equals(this.claimName, v1VmPersistentVolumeClaimVolumeSource.claimName) &&
        Objects.equals(this.hotpluggable, v1VmPersistentVolumeClaimVolumeSource.hotpluggable) &&
        Objects.equals(this.readOnly, v1VmPersistentVolumeClaimVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, hotpluggable, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmPersistentVolumeClaimVolumeSource {\n");
    
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
    sb.append("    hotpluggable: ").append(toIndentedString(hotpluggable)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
