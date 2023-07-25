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
import com.spectrocloud.client.model.V1AwsAmiReference;
import com.spectrocloud.client.model.V1AwsResourceReference;
import com.spectrocloud.client.model.V1AwsRootVolume;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AWSLaunchTemplate specifies the launch template to use to create the managed node group
 */
@Schema(description = "AWSLaunchTemplate specifies the launch template to use to create the managed node group")


public class V1AwsLaunchTemplate {
  @SerializedName("additionalSecurityGroups")
  private List<V1AwsResourceReference> additionalSecurityGroups = null;

  @SerializedName("ami")
  private V1AwsAmiReference ami = null;

  @SerializedName("imageLookupBaseOS")
  private String imageLookupBaseOS = null;

  @SerializedName("imageLookupFormat")
  private String imageLookupFormat = null;

  @SerializedName("imageLookupOrg")
  private String imageLookupOrg = null;

  @SerializedName("rootVolume")
  private V1AwsRootVolume rootVolume = null;

  public V1AwsLaunchTemplate additionalSecurityGroups(List<V1AwsResourceReference> additionalSecurityGroups) {
    this.additionalSecurityGroups = additionalSecurityGroups;
    return this;
  }

  public V1AwsLaunchTemplate addAdditionalSecurityGroupsItem(V1AwsResourceReference additionalSecurityGroupsItem) {
    if (this.additionalSecurityGroups == null) {
      this.additionalSecurityGroups = new ArrayList<V1AwsResourceReference>();
    }
    this.additionalSecurityGroups.add(additionalSecurityGroupsItem);
    return this;
  }

   /**
   * AdditionalSecurityGroups is an array of references to security groups that should be applied to the instances
   * @return additionalSecurityGroups
  **/
  @Schema(description = "AdditionalSecurityGroups is an array of references to security groups that should be applied to the instances")
  public List<V1AwsResourceReference> getAdditionalSecurityGroups() {
    return additionalSecurityGroups;
  }

  public void setAdditionalSecurityGroups(List<V1AwsResourceReference> additionalSecurityGroups) {
    this.additionalSecurityGroups = additionalSecurityGroups;
  }

  public V1AwsLaunchTemplate ami(V1AwsAmiReference ami) {
    this.ami = ami;
    return this;
  }

   /**
   * Get ami
   * @return ami
  **/
  @Schema(description = "")
  public V1AwsAmiReference getAmi() {
    return ami;
  }

  public void setAmi(V1AwsAmiReference ami) {
    this.ami = ami;
  }

  public V1AwsLaunchTemplate imageLookupBaseOS(String imageLookupBaseOS) {
    this.imageLookupBaseOS = imageLookupBaseOS;
    return this;
  }

   /**
   * ImageLookupBaseOS is the name of the base operating system to use for image lookup the AMI is not set
   * @return imageLookupBaseOS
  **/
  @Schema(description = "ImageLookupBaseOS is the name of the base operating system to use for image lookup the AMI is not set")
  public String getImageLookupBaseOS() {
    return imageLookupBaseOS;
  }

  public void setImageLookupBaseOS(String imageLookupBaseOS) {
    this.imageLookupBaseOS = imageLookupBaseOS;
  }

  public V1AwsLaunchTemplate imageLookupFormat(String imageLookupFormat) {
    this.imageLookupFormat = imageLookupFormat;
    return this;
  }

   /**
   * ImageLookupFormat is the AMI naming format to look up the image
   * @return imageLookupFormat
  **/
  @Schema(description = "ImageLookupFormat is the AMI naming format to look up the image")
  public String getImageLookupFormat() {
    return imageLookupFormat;
  }

  public void setImageLookupFormat(String imageLookupFormat) {
    this.imageLookupFormat = imageLookupFormat;
  }

  public V1AwsLaunchTemplate imageLookupOrg(String imageLookupOrg) {
    this.imageLookupOrg = imageLookupOrg;
    return this;
  }

   /**
   * ImageLookupOrg is the AWS Organization ID to use for image lookup if AMI is not set
   * @return imageLookupOrg
  **/
  @Schema(description = "ImageLookupOrg is the AWS Organization ID to use for image lookup if AMI is not set")
  public String getImageLookupOrg() {
    return imageLookupOrg;
  }

  public void setImageLookupOrg(String imageLookupOrg) {
    this.imageLookupOrg = imageLookupOrg;
  }

  public V1AwsLaunchTemplate rootVolume(V1AwsRootVolume rootVolume) {
    this.rootVolume = rootVolume;
    return this;
  }

   /**
   * Get rootVolume
   * @return rootVolume
  **/
  @Schema(description = "")
  public V1AwsRootVolume getRootVolume() {
    return rootVolume;
  }

  public void setRootVolume(V1AwsRootVolume rootVolume) {
    this.rootVolume = rootVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AwsLaunchTemplate v1AwsLaunchTemplate = (V1AwsLaunchTemplate) o;
    return Objects.equals(this.additionalSecurityGroups, v1AwsLaunchTemplate.additionalSecurityGroups) &&
        Objects.equals(this.ami, v1AwsLaunchTemplate.ami) &&
        Objects.equals(this.imageLookupBaseOS, v1AwsLaunchTemplate.imageLookupBaseOS) &&
        Objects.equals(this.imageLookupFormat, v1AwsLaunchTemplate.imageLookupFormat) &&
        Objects.equals(this.imageLookupOrg, v1AwsLaunchTemplate.imageLookupOrg) &&
        Objects.equals(this.rootVolume, v1AwsLaunchTemplate.rootVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalSecurityGroups, ami, imageLookupBaseOS, imageLookupFormat, imageLookupOrg, rootVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AwsLaunchTemplate {\n");
    
    sb.append("    additionalSecurityGroups: ").append(toIndentedString(additionalSecurityGroups)).append("\n");
    sb.append("    ami: ").append(toIndentedString(ami)).append("\n");
    sb.append("    imageLookupBaseOS: ").append(toIndentedString(imageLookupBaseOS)).append("\n");
    sb.append("    imageLookupFormat: ").append(toIndentedString(imageLookupFormat)).append("\n");
    sb.append("    imageLookupOrg: ").append(toIndentedString(imageLookupOrg)).append("\n");
    sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
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
