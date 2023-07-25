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
import com.spectrocloud.client.model.V1VmUserPasswordAccessCredentialPropagationMethod;
import com.spectrocloud.client.model.V1VmUserPasswordAccessCredentialSource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserPasswordAccessCredential represents a source and propagation method for injecting user passwords into a vm guest Only one of its members may be specified.
 */
@Schema(description = "UserPasswordAccessCredential represents a source and propagation method for injecting user passwords into a vm guest Only one of its members may be specified.")


public class V1VmUserPasswordAccessCredential {
  @SerializedName("propagationMethod")
  private V1VmUserPasswordAccessCredentialPropagationMethod propagationMethod = null;

  @SerializedName("source")
  private V1VmUserPasswordAccessCredentialSource source = null;

  public V1VmUserPasswordAccessCredential propagationMethod(V1VmUserPasswordAccessCredentialPropagationMethod propagationMethod) {
    this.propagationMethod = propagationMethod;
    return this;
  }

   /**
   * Get propagationMethod
   * @return propagationMethod
  **/
  @Schema(required = true, description = "")
  public V1VmUserPasswordAccessCredentialPropagationMethod getPropagationMethod() {
    return propagationMethod;
  }

  public void setPropagationMethod(V1VmUserPasswordAccessCredentialPropagationMethod propagationMethod) {
    this.propagationMethod = propagationMethod;
  }

  public V1VmUserPasswordAccessCredential source(V1VmUserPasswordAccessCredentialSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public V1VmUserPasswordAccessCredentialSource getSource() {
    return source;
  }

  public void setSource(V1VmUserPasswordAccessCredentialSource source) {
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
    V1VmUserPasswordAccessCredential v1VmUserPasswordAccessCredential = (V1VmUserPasswordAccessCredential) o;
    return Objects.equals(this.propagationMethod, v1VmUserPasswordAccessCredential.propagationMethod) &&
        Objects.equals(this.source, v1VmUserPasswordAccessCredential.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propagationMethod, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmUserPasswordAccessCredential {\n");
    
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
