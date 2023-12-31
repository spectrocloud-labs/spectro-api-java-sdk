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
import com.spectrocloud.client.model.V1VmClockOffsetUTC;
import com.spectrocloud.client.model.V1VmTimer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Represents the clock and timers of a vmi.
 */
@Schema(description = "Represents the clock and timers of a vmi.")


public class V1VmClock {
  @SerializedName("timer")
  private V1VmTimer timer = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("utc")
  private V1VmClockOffsetUTC utc = null;

  public V1VmClock timer(V1VmTimer timer) {
    this.timer = timer;
    return this;
  }

   /**
   * Get timer
   * @return timer
  **/
  @Schema(description = "")
  public V1VmTimer getTimer() {
    return timer;
  }

  public void setTimer(V1VmTimer timer) {
    this.timer = timer;
  }

  public V1VmClock timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone sets the guest clock to the specified timezone. Zone name follows the TZ environment variable format (e.g. &#x27;America/New_York&#x27;).
   * @return timezone
  **/
  @Schema(description = "Timezone sets the guest clock to the specified timezone. Zone name follows the TZ environment variable format (e.g. 'America/New_York').")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public V1VmClock utc(V1VmClockOffsetUTC utc) {
    this.utc = utc;
    return this;
  }

   /**
   * Get utc
   * @return utc
  **/
  @Schema(description = "")
  public V1VmClockOffsetUTC getUtc() {
    return utc;
  }

  public void setUtc(V1VmClockOffsetUTC utc) {
    this.utc = utc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmClock v1VmClock = (V1VmClock) o;
    return Objects.equals(this.timer, v1VmClock.timer) &&
        Objects.equals(this.timezone, v1VmClock.timezone) &&
        Objects.equals(this.utc, v1VmClock.utc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timer, timezone, utc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmClock {\n");
    
    sb.append("    timer: ").append(toIndentedString(timer)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    utc: ").append(toIndentedString(utc)).append("\n");
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
