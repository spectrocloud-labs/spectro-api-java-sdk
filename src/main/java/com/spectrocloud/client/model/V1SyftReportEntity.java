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
import com.spectrocloud.client.model.V1SyftDependencyEntity;
import com.spectrocloud.client.model.V1SyftImageContext;
import com.spectrocloud.client.model.V1SyftVulnerabilityEntity;
import com.spectrocloud.client.model.V1SyftVulnerabilitySummaryEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Syft report
 */
@Schema(description = "Syft report")


public class V1SyftReportEntity {
  @SerializedName("batchNo")
  private Integer batchNo = null;

  @SerializedName("batchSize")
  private Integer batchSize = null;

  @SerializedName("dependencies")
  private List<V1SyftDependencyEntity> dependencies = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageContexts")
  private List<V1SyftImageContext> imageContexts = null;

  @SerializedName("sbom")
  private String sbom = null;

  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("vulnerabilities")
  private List<V1SyftVulnerabilityEntity> vulnerabilities = null;

  @SerializedName("vulnerabilitySummary")
  private V1SyftVulnerabilitySummaryEntity vulnerabilitySummary = null;

  public V1SyftReportEntity batchNo(Integer batchNo) {
    this.batchNo = batchNo;
    return this;
  }

   /**
   * Get batchNo
   * @return batchNo
  **/
  @Schema(description = "")
  public Integer getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(Integer batchNo) {
    this.batchNo = batchNo;
  }

  public V1SyftReportEntity batchSize(Integer batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @Schema(description = "")
  public Integer getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }

  public V1SyftReportEntity dependencies(List<V1SyftDependencyEntity> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public V1SyftReportEntity addDependenciesItem(V1SyftDependencyEntity dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<V1SyftDependencyEntity>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @Schema(description = "")
  public List<V1SyftDependencyEntity> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<V1SyftDependencyEntity> dependencies) {
    this.dependencies = dependencies;
  }

  public V1SyftReportEntity image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1SyftReportEntity imageContexts(List<V1SyftImageContext> imageContexts) {
    this.imageContexts = imageContexts;
    return this;
  }

  public V1SyftReportEntity addImageContextsItem(V1SyftImageContext imageContextsItem) {
    if (this.imageContexts == null) {
      this.imageContexts = new ArrayList<V1SyftImageContext>();
    }
    this.imageContexts.add(imageContextsItem);
    return this;
  }

   /**
   * Get imageContexts
   * @return imageContexts
  **/
  @Schema(description = "")
  public List<V1SyftImageContext> getImageContexts() {
    return imageContexts;
  }

  public void setImageContexts(List<V1SyftImageContext> imageContexts) {
    this.imageContexts = imageContexts;
  }

  public V1SyftReportEntity sbom(String sbom) {
    this.sbom = sbom;
    return this;
  }

   /**
   * Get sbom
   * @return sbom
  **/
  @Schema(description = "")
  public String getSbom() {
    return sbom;
  }

  public void setSbom(String sbom) {
    this.sbom = sbom;
  }

  public V1SyftReportEntity time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public V1SyftReportEntity vulnerabilities(List<V1SyftVulnerabilityEntity> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    return this;
  }

  public V1SyftReportEntity addVulnerabilitiesItem(V1SyftVulnerabilityEntity vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<V1SyftVulnerabilityEntity>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    return this;
  }

   /**
   * Get vulnerabilities
   * @return vulnerabilities
  **/
  @Schema(description = "")
  public List<V1SyftVulnerabilityEntity> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(List<V1SyftVulnerabilityEntity> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }

  public V1SyftReportEntity vulnerabilitySummary(V1SyftVulnerabilitySummaryEntity vulnerabilitySummary) {
    this.vulnerabilitySummary = vulnerabilitySummary;
    return this;
  }

   /**
   * Get vulnerabilitySummary
   * @return vulnerabilitySummary
  **/
  @Schema(description = "")
  public V1SyftVulnerabilitySummaryEntity getVulnerabilitySummary() {
    return vulnerabilitySummary;
  }

  public void setVulnerabilitySummary(V1SyftVulnerabilitySummaryEntity vulnerabilitySummary) {
    this.vulnerabilitySummary = vulnerabilitySummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SyftReportEntity v1SyftReportEntity = (V1SyftReportEntity) o;
    return Objects.equals(this.batchNo, v1SyftReportEntity.batchNo) &&
        Objects.equals(this.batchSize, v1SyftReportEntity.batchSize) &&
        Objects.equals(this.dependencies, v1SyftReportEntity.dependencies) &&
        Objects.equals(this.image, v1SyftReportEntity.image) &&
        Objects.equals(this.imageContexts, v1SyftReportEntity.imageContexts) &&
        Objects.equals(this.sbom, v1SyftReportEntity.sbom) &&
        Objects.equals(this.time, v1SyftReportEntity.time) &&
        Objects.equals(this.vulnerabilities, v1SyftReportEntity.vulnerabilities) &&
        Objects.equals(this.vulnerabilitySummary, v1SyftReportEntity.vulnerabilitySummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchNo, batchSize, dependencies, image, imageContexts, sbom, time, vulnerabilities, vulnerabilitySummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SyftReportEntity {\n");
    
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContexts: ").append(toIndentedString(imageContexts)).append("\n");
    sb.append("    sbom: ").append(toIndentedString(sbom)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("    vulnerabilitySummary: ").append(toIndentedString(vulnerabilitySummary)).append("\n");
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
