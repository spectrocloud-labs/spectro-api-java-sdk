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
import com.spectrocloud.client.model.V1VmConfigDriveSshPublicKeyAccessCredentialPropagation;
import com.spectrocloud.client.model.V1VmQemuGuestAgentSshPublicKeyAccessCredentialPropagation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SSHPublicKeyAccessCredentialPropagationMethod represents the method used to inject a ssh public key into the vm guest. Only one of its members may be specified.
 */
@Schema(description = "SSHPublicKeyAccessCredentialPropagationMethod represents the method used to inject a ssh public key into the vm guest. Only one of its members may be specified.")


public class V1VmSshPublicKeyAccessCredentialPropagationMethod {
  @SerializedName("configDrive")
  private V1VmConfigDriveSshPublicKeyAccessCredentialPropagation configDrive = null;

  @SerializedName("qemuGuestAgent")
  private V1VmQemuGuestAgentSshPublicKeyAccessCredentialPropagation qemuGuestAgent = null;

  public V1VmSshPublicKeyAccessCredentialPropagationMethod configDrive(V1VmConfigDriveSshPublicKeyAccessCredentialPropagation configDrive) {
    this.configDrive = configDrive;
    return this;
  }

   /**
   * Get configDrive
   * @return configDrive
  **/
  @Schema(description = "")
  public V1VmConfigDriveSshPublicKeyAccessCredentialPropagation getConfigDrive() {
    return configDrive;
  }

  public void setConfigDrive(V1VmConfigDriveSshPublicKeyAccessCredentialPropagation configDrive) {
    this.configDrive = configDrive;
  }

  public V1VmSshPublicKeyAccessCredentialPropagationMethod qemuGuestAgent(V1VmQemuGuestAgentSshPublicKeyAccessCredentialPropagation qemuGuestAgent) {
    this.qemuGuestAgent = qemuGuestAgent;
    return this;
  }

   /**
   * Get qemuGuestAgent
   * @return qemuGuestAgent
  **/
  @Schema(description = "")
  public V1VmQemuGuestAgentSshPublicKeyAccessCredentialPropagation getQemuGuestAgent() {
    return qemuGuestAgent;
  }

  public void setQemuGuestAgent(V1VmQemuGuestAgentSshPublicKeyAccessCredentialPropagation qemuGuestAgent) {
    this.qemuGuestAgent = qemuGuestAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSshPublicKeyAccessCredentialPropagationMethod v1VmSshPublicKeyAccessCredentialPropagationMethod = (V1VmSshPublicKeyAccessCredentialPropagationMethod) o;
    return Objects.equals(this.configDrive, v1VmSshPublicKeyAccessCredentialPropagationMethod.configDrive) &&
        Objects.equals(this.qemuGuestAgent, v1VmSshPublicKeyAccessCredentialPropagationMethod.qemuGuestAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configDrive, qemuGuestAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSshPublicKeyAccessCredentialPropagationMethod {\n");
    
    sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
    sb.append("    qemuGuestAgent: ").append(toIndentedString(qemuGuestAgent)).append("\n");
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
