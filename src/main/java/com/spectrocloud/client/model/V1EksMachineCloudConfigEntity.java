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
import com.spectrocloud.client.model.V1AwsLaunchTemplate;
import com.spectrocloud.client.model.V1EksSubnetEntity;
import com.spectrocloud.client.model.V1SpotMarketOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V1EksMachineCloudConfigEntity
 */



public class V1EksMachineCloudConfigEntity {
  @SerializedName("awsLaunchTemplate")
  private V1AwsLaunchTemplate awsLaunchTemplate = null;

  @SerializedName("azs")
  private List<String> azs = null;

  /**
   * EC2 instance capacity type
   */
  @JsonAdapter(CapacityTypeEnum.Adapter.class)
  public enum CapacityTypeEnum {
    ON_DEMAND("on-demand"),
    SPOT("spot");

    private String value;

    CapacityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CapacityTypeEnum fromValue(String input) {
      for (CapacityTypeEnum b : CapacityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CapacityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapacityTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CapacityTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CapacityTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("capacityType")
  private CapacityTypeEnum capacityType = CapacityTypeEnum.ON_DEMAND;

  @SerializedName("enableAwsLaunchTemplate")
  private Boolean enableAwsLaunchTemplate = null;

  @SerializedName("instanceType")
  private String instanceType = null;

  @SerializedName("rootDeviceSize")
  private Long rootDeviceSize = null;

  @SerializedName("spotMarketOptions")
  private V1SpotMarketOptions spotMarketOptions = null;

  @SerializedName("subnets")
  private List<V1EksSubnetEntity> subnets = null;

  public V1EksMachineCloudConfigEntity awsLaunchTemplate(V1AwsLaunchTemplate awsLaunchTemplate) {
    this.awsLaunchTemplate = awsLaunchTemplate;
    return this;
  }

   /**
   * Get awsLaunchTemplate
   * @return awsLaunchTemplate
  **/
  @Schema(description = "")
  public V1AwsLaunchTemplate getAwsLaunchTemplate() {
    return awsLaunchTemplate;
  }

  public void setAwsLaunchTemplate(V1AwsLaunchTemplate awsLaunchTemplate) {
    this.awsLaunchTemplate = awsLaunchTemplate;
  }

  public V1EksMachineCloudConfigEntity azs(List<String> azs) {
    this.azs = azs;
    return this;
  }

  public V1EksMachineCloudConfigEntity addAzsItem(String azsItem) {
    if (this.azs == null) {
      this.azs = new ArrayList<String>();
    }
    this.azs.add(azsItem);
    return this;
  }

   /**
   * Get azs
   * @return azs
  **/
  @Schema(description = "")
  public List<String> getAzs() {
    return azs;
  }

  public void setAzs(List<String> azs) {
    this.azs = azs;
  }

  public V1EksMachineCloudConfigEntity capacityType(CapacityTypeEnum capacityType) {
    this.capacityType = capacityType;
    return this;
  }

   /**
   * EC2 instance capacity type
   * @return capacityType
  **/
  @Schema(description = "EC2 instance capacity type")
  public CapacityTypeEnum getCapacityType() {
    return capacityType;
  }

  public void setCapacityType(CapacityTypeEnum capacityType) {
    this.capacityType = capacityType;
  }

  public V1EksMachineCloudConfigEntity enableAwsLaunchTemplate(Boolean enableAwsLaunchTemplate) {
    this.enableAwsLaunchTemplate = enableAwsLaunchTemplate;
    return this;
  }

   /**
   * flag to know if aws launch template is enabled
   * @return enableAwsLaunchTemplate
  **/
  @Schema(description = "flag to know if aws launch template is enabled")
  public Boolean isEnableAwsLaunchTemplate() {
    return enableAwsLaunchTemplate;
  }

  public void setEnableAwsLaunchTemplate(Boolean enableAwsLaunchTemplate) {
    this.enableAwsLaunchTemplate = enableAwsLaunchTemplate;
  }

  public V1EksMachineCloudConfigEntity instanceType(String instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * instance type
   * @return instanceType
  **/
  @Schema(description = "instance type")
  public String getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  public V1EksMachineCloudConfigEntity rootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
    return this;
  }

   /**
   * rootDeviceSize in GBs
   * minimum: 1
   * maximum: 2000
   * @return rootDeviceSize
  **/
  @Schema(description = "rootDeviceSize in GBs")
  public Long getRootDeviceSize() {
    return rootDeviceSize;
  }

  public void setRootDeviceSize(Long rootDeviceSize) {
    this.rootDeviceSize = rootDeviceSize;
  }

  public V1EksMachineCloudConfigEntity spotMarketOptions(V1SpotMarketOptions spotMarketOptions) {
    this.spotMarketOptions = spotMarketOptions;
    return this;
  }

   /**
   * Get spotMarketOptions
   * @return spotMarketOptions
  **/
  @Schema(description = "")
  public V1SpotMarketOptions getSpotMarketOptions() {
    return spotMarketOptions;
  }

  public void setSpotMarketOptions(V1SpotMarketOptions spotMarketOptions) {
    this.spotMarketOptions = spotMarketOptions;
  }

  public V1EksMachineCloudConfigEntity subnets(List<V1EksSubnetEntity> subnets) {
    this.subnets = subnets;
    return this;
  }

  public V1EksMachineCloudConfigEntity addSubnetsItem(V1EksSubnetEntity subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<V1EksSubnetEntity>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @Schema(description = "")
  public List<V1EksSubnetEntity> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<V1EksSubnetEntity> subnets) {
    this.subnets = subnets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EksMachineCloudConfigEntity v1EksMachineCloudConfigEntity = (V1EksMachineCloudConfigEntity) o;
    return Objects.equals(this.awsLaunchTemplate, v1EksMachineCloudConfigEntity.awsLaunchTemplate) &&
        Objects.equals(this.azs, v1EksMachineCloudConfigEntity.azs) &&
        Objects.equals(this.capacityType, v1EksMachineCloudConfigEntity.capacityType) &&
        Objects.equals(this.enableAwsLaunchTemplate, v1EksMachineCloudConfigEntity.enableAwsLaunchTemplate) &&
        Objects.equals(this.instanceType, v1EksMachineCloudConfigEntity.instanceType) &&
        Objects.equals(this.rootDeviceSize, v1EksMachineCloudConfigEntity.rootDeviceSize) &&
        Objects.equals(this.spotMarketOptions, v1EksMachineCloudConfigEntity.spotMarketOptions) &&
        Objects.equals(this.subnets, v1EksMachineCloudConfigEntity.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsLaunchTemplate, azs, capacityType, enableAwsLaunchTemplate, instanceType, rootDeviceSize, spotMarketOptions, subnets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EksMachineCloudConfigEntity {\n");
    
    sb.append("    awsLaunchTemplate: ").append(toIndentedString(awsLaunchTemplate)).append("\n");
    sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
    sb.append("    capacityType: ").append(toIndentedString(capacityType)).append("\n");
    sb.append("    enableAwsLaunchTemplate: ").append(toIndentedString(enableAwsLaunchTemplate)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    rootDeviceSize: ").append(toIndentedString(rootDeviceSize)).append("\n");
    sb.append("    spotMarketOptions: ").append(toIndentedString(spotMarketOptions)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
