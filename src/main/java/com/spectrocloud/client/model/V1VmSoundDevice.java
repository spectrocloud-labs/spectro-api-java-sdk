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
 * Represents the user&#x27;s configuration to emulate sound cards in the VMI.
 */
@Schema(description = "Represents the user's configuration to emulate sound cards in the VMI.")


public class V1VmSoundDevice {
  @SerializedName("model")
  private String model = null;

  @SerializedName("name")
  private String name = null;

  public V1VmSoundDevice model(String model) {
    this.model = model;
    return this;
  }

   /**
   * We only support ich9 or ac97. If SoundDevice is not set: No sound card is emulated. If SoundDevice is set but Model is not: ich9
   * @return model
  **/
  @Schema(description = "We only support ich9 or ac97. If SoundDevice is not set: No sound card is emulated. If SoundDevice is set but Model is not: ich9")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public V1VmSoundDevice name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#x27;s defined name for this sound device
   * @return name
  **/
  @Schema(required = true, description = "User's defined name for this sound device")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmSoundDevice v1VmSoundDevice = (V1VmSoundDevice) o;
    return Objects.equals(this.model, v1VmSoundDevice.model) &&
        Objects.equals(this.name, v1VmSoundDevice.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmSoundDevice {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
