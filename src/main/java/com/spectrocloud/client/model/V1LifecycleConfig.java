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
 * V1LifecycleConfig
 */



public class V1LifecycleConfig {
  @SerializedName("pause")
  private Boolean pause = false;

  public V1LifecycleConfig pause(Boolean pause) {
    this.pause = pause;
    return this;
  }

   /**
   * enable pause life cycle config
   * @return pause
  **/
  @Schema(description = "enable pause life cycle config")
  public Boolean isPause() {
    return pause;
  }

  public void setPause(Boolean pause) {
    this.pause = pause;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LifecycleConfig v1LifecycleConfig = (V1LifecycleConfig) o;
    return Objects.equals(this.pause, v1LifecycleConfig.pause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pause);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LifecycleConfig {\n");
    
    sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
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
