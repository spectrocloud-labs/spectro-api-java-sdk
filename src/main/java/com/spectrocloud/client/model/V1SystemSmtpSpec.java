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
 * system smtp config spec
 */
@Schema(description = "system smtp config spec")


public class V1SystemSmtpSpec {
  @SerializedName("fromEmailId")
  private String fromEmailId = null;

  @SerializedName("insecureSkipVerifyTls")
  private Boolean insecureSkipVerifyTls = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("smtpPort")
  private Integer smtpPort = null;

  @SerializedName("smtpServer")
  private String smtpServer = null;

  @SerializedName("userName")
  private String userName = null;

  public V1SystemSmtpSpec fromEmailId(String fromEmailId) {
    this.fromEmailId = fromEmailId;
    return this;
  }

   /**
   * Get fromEmailId
   * @return fromEmailId
  **/
  @Schema(description = "")
  public String getFromEmailId() {
    return fromEmailId;
  }

  public void setFromEmailId(String fromEmailId) {
    this.fromEmailId = fromEmailId;
  }

  public V1SystemSmtpSpec insecureSkipVerifyTls(Boolean insecureSkipVerifyTls) {
    this.insecureSkipVerifyTls = insecureSkipVerifyTls;
    return this;
  }

   /**
   * Get insecureSkipVerifyTls
   * @return insecureSkipVerifyTls
  **/
  @Schema(description = "")
  public Boolean isInsecureSkipVerifyTls() {
    return insecureSkipVerifyTls;
  }

  public void setInsecureSkipVerifyTls(Boolean insecureSkipVerifyTls) {
    this.insecureSkipVerifyTls = insecureSkipVerifyTls;
  }

  public V1SystemSmtpSpec password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public V1SystemSmtpSpec smtpPort(Integer smtpPort) {
    this.smtpPort = smtpPort;
    return this;
  }

   /**
   * Get smtpPort
   * @return smtpPort
  **/
  @Schema(description = "")
  public Integer getSmtpPort() {
    return smtpPort;
  }

  public void setSmtpPort(Integer smtpPort) {
    this.smtpPort = smtpPort;
  }

  public V1SystemSmtpSpec smtpServer(String smtpServer) {
    this.smtpServer = smtpServer;
    return this;
  }

   /**
   * Get smtpServer
   * @return smtpServer
  **/
  @Schema(description = "")
  public String getSmtpServer() {
    return smtpServer;
  }

  public void setSmtpServer(String smtpServer) {
    this.smtpServer = smtpServer;
  }

  public V1SystemSmtpSpec userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SystemSmtpSpec v1SystemSmtpSpec = (V1SystemSmtpSpec) o;
    return Objects.equals(this.fromEmailId, v1SystemSmtpSpec.fromEmailId) &&
        Objects.equals(this.insecureSkipVerifyTls, v1SystemSmtpSpec.insecureSkipVerifyTls) &&
        Objects.equals(this.password, v1SystemSmtpSpec.password) &&
        Objects.equals(this.smtpPort, v1SystemSmtpSpec.smtpPort) &&
        Objects.equals(this.smtpServer, v1SystemSmtpSpec.smtpServer) &&
        Objects.equals(this.userName, v1SystemSmtpSpec.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromEmailId, insecureSkipVerifyTls, password, smtpPort, smtpServer, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SystemSmtpSpec {\n");
    
    sb.append("    fromEmailId: ").append(toIndentedString(fromEmailId)).append("\n");
    sb.append("    insecureSkipVerifyTls: ").append(toIndentedString(insecureSkipVerifyTls)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
    sb.append("    smtpServer: ").append(toIndentedString(smtpServer)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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