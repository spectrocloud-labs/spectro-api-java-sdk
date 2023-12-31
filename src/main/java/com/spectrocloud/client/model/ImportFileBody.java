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
import java.io.File;
import java.io.IOException;
/**
 * ImportFileBody
 */



public class ImportFileBody {
  @SerializedName("importFile")
  private File importFile = null;

  public ImportFileBody importFile(File importFile) {
    this.importFile = importFile;
    return this;
  }

   /**
   * Cluster profile import file
   * @return importFile
  **/
  @Schema(description = "Cluster profile import file")
  public File getImportFile() {
    return importFile;
  }

  public void setImportFile(File importFile) {
    this.importFile = importFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportFileBody importFileBody = (ImportFileBody) o;
    return Objects.equals(this.importFile, importFileBody.importFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(importFile));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportFileBody {\n");
    
    sb.append("    importFile: ").append(toIndentedString(importFile)).append("\n");
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
