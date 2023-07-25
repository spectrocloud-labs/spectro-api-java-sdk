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
 * SecretVolumeSource adapts a Secret into a volume.
 */
@Schema(description = "SecretVolumeSource adapts a Secret into a volume.")


public class V1VmSecretVolumeSource {
  @SerializedName("optional")
  private Boolean optional = null;

  @SerializedName("secretName")
  private String secretName = null;

  @SerializedName("volumeLabel")
  private String volumeLabel = null;

  public V1VmSecretVolumeSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the Secret or it&#x27;s keys must be defined
   * @return optional
  **/
  @Schema(description = "Specify whether the Secret or it's keys must be defined")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public V1VmSecretVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

   /**
   * Name of the secret in the pod&#x27;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secretName
  **/
  @Schema(description = "Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public V1VmSecretVolumeSource volumeLabel(String volumeLabel) {
    this.volumeLabel = volumeLabel;
    return this;
  }

   /**
   * The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \&quot;cidata\&quot; (cloud-init), \&quot;config-2\&quot; (cloud-init) or \&quot;OEMDRV\&quot; (kickstart).
   * @return volumeLabel
  **/
  @Schema(description = "The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \"cidata\" (cloud-init), \"config-2\" (cloud-init) or \"OEMDRV\" (kickstart).")
  public String getVolumeLabel() {
    return volumeLabel;
  }

  public void setVolumeLabel(String volumeLabel) {
    this.volumeLabel = volumeLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSecretVolumeSource v1VmSecretVolumeSource = (V1VmSecretVolumeSource) o;
    return Objects.equals(this.optional, v1VmSecretVolumeSource.optional) &&
        Objects.equals(this.secretName, v1VmSecretVolumeSource.secretName) &&
        Objects.equals(this.volumeLabel, v1VmSecretVolumeSource.volumeLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optional, secretName, volumeLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSecretVolumeSource {\n");
    
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    volumeLabel: ").append(toIndentedString(volumeLabel)).append("\n");
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