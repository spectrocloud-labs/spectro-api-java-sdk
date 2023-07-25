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
import com.spectrocloud.client.model.V1VmSshPublicKeyAccessCredentialPropagationMethod;
import com.spectrocloud.client.model.V1VmSshPublicKeyAccessCredentialSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SSHPublicKeyAccessCredential represents a source and propagation method for injecting ssh public keys into a vm guest
 */
@Schema(description = "SSHPublicKeyAccessCredential represents a source and propagation method for injecting ssh public keys into a vm guest")


public class V1VmSshPublicKeyAccessCredential {
  @SerializedName("propagationMethod")
  private V1VmSshPublicKeyAccessCredentialPropagationMethod propagationMethod = null;

  @SerializedName("source")
  private V1VmSshPublicKeyAccessCredentialSource source = null;

  public V1VmSshPublicKeyAccessCredential propagationMethod(V1VmSshPublicKeyAccessCredentialPropagationMethod propagationMethod) {
    this.propagationMethod = propagationMethod;
    return this;
  }

   /**
   * Get propagationMethod
   * @return propagationMethod
  **/
  @Schema(required = true, description = "")
  public V1VmSshPublicKeyAccessCredentialPropagationMethod getPropagationMethod() {
    return propagationMethod;
  }

  public void setPropagationMethod(V1VmSshPublicKeyAccessCredentialPropagationMethod propagationMethod) {
    this.propagationMethod = propagationMethod;
  }

  public V1VmSshPublicKeyAccessCredential source(V1VmSshPublicKeyAccessCredentialSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public V1VmSshPublicKeyAccessCredentialSource getSource() {
    return source;
  }

  public void setSource(V1VmSshPublicKeyAccessCredentialSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSshPublicKeyAccessCredential v1VmSshPublicKeyAccessCredential = (V1VmSshPublicKeyAccessCredential) o;
    return Objects.equals(this.propagationMethod, v1VmSshPublicKeyAccessCredential.propagationMethod) &&
        Objects.equals(this.source, v1VmSshPublicKeyAccessCredential.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propagationMethod, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSshPublicKeyAccessCredential {\n");
    
    sb.append("    propagationMethod: ").append(toIndentedString(propagationMethod)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
