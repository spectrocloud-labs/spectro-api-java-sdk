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
import com.spectrocloud.client.model.V1VmFeatureSpinlocks;
import com.spectrocloud.client.model.V1VmFeatureState;
import com.spectrocloud.client.model.V1VmFeatureVendorId;
import com.spectrocloud.client.model.V1VmSyNICTimer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Hyperv specific features.
 */
@Schema(description = "Hyperv specific features.")


public class V1VmFeatureHyperv {
  @SerializedName("evmcs")
  private V1VmFeatureState evmcs = null;

  @SerializedName("frequencies")
  private V1VmFeatureState frequencies = null;

  @SerializedName("ipi")
  private V1VmFeatureState ipi = null;

  @SerializedName("reenlightenment")
  private V1VmFeatureState reenlightenment = null;

  @SerializedName("relaxed")
  private V1VmFeatureState relaxed = null;

  @SerializedName("reset")
  private V1VmFeatureState reset = null;

  @SerializedName("runtime")
  private V1VmFeatureState runtime = null;

  @SerializedName("spinlocks")
  private V1VmFeatureSpinlocks spinlocks = null;

  @SerializedName("synic")
  private V1VmFeatureState synic = null;

  @SerializedName("synictimer")
  private V1VmSyNICTimer synictimer = null;

  @SerializedName("tlbflush")
  private V1VmFeatureState tlbflush = null;

  @SerializedName("vapic")
  private V1VmFeatureState vapic = null;

  @SerializedName("vendorid")
  private V1VmFeatureVendorId vendorid = null;

  @SerializedName("vpindex")
  private V1VmFeatureState vpindex = null;

  public V1VmFeatureHyperv evmcs(V1VmFeatureState evmcs) {
    this.evmcs = evmcs;
    return this;
  }

   /**
   * Get evmcs
   * @return evmcs
  **/
  @Schema(description = "")
  public V1VmFeatureState getEvmcs() {
    return evmcs;
  }

  public void setEvmcs(V1VmFeatureState evmcs) {
    this.evmcs = evmcs;
  }

  public V1VmFeatureHyperv frequencies(V1VmFeatureState frequencies) {
    this.frequencies = frequencies;
    return this;
  }

   /**
   * Get frequencies
   * @return frequencies
  **/
  @Schema(description = "")
  public V1VmFeatureState getFrequencies() {
    return frequencies;
  }

  public void setFrequencies(V1VmFeatureState frequencies) {
    this.frequencies = frequencies;
  }

  public V1VmFeatureHyperv ipi(V1VmFeatureState ipi) {
    this.ipi = ipi;
    return this;
  }

   /**
   * Get ipi
   * @return ipi
  **/
  @Schema(description = "")
  public V1VmFeatureState getIpi() {
    return ipi;
  }

  public void setIpi(V1VmFeatureState ipi) {
    this.ipi = ipi;
  }

  public V1VmFeatureHyperv reenlightenment(V1VmFeatureState reenlightenment) {
    this.reenlightenment = reenlightenment;
    return this;
  }

   /**
   * Get reenlightenment
   * @return reenlightenment
  **/
  @Schema(description = "")
  public V1VmFeatureState getReenlightenment() {
    return reenlightenment;
  }

  public void setReenlightenment(V1VmFeatureState reenlightenment) {
    this.reenlightenment = reenlightenment;
  }

  public V1VmFeatureHyperv relaxed(V1VmFeatureState relaxed) {
    this.relaxed = relaxed;
    return this;
  }

   /**
   * Get relaxed
   * @return relaxed
  **/
  @Schema(description = "")
  public V1VmFeatureState getRelaxed() {
    return relaxed;
  }

  public void setRelaxed(V1VmFeatureState relaxed) {
    this.relaxed = relaxed;
  }

  public V1VmFeatureHyperv reset(V1VmFeatureState reset) {
    this.reset = reset;
    return this;
  }

   /**
   * Get reset
   * @return reset
  **/
  @Schema(description = "")
  public V1VmFeatureState getReset() {
    return reset;
  }

  public void setReset(V1VmFeatureState reset) {
    this.reset = reset;
  }

  public V1VmFeatureHyperv runtime(V1VmFeatureState runtime) {
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @Schema(description = "")
  public V1VmFeatureState getRuntime() {
    return runtime;
  }

  public void setRuntime(V1VmFeatureState runtime) {
    this.runtime = runtime;
  }

  public V1VmFeatureHyperv spinlocks(V1VmFeatureSpinlocks spinlocks) {
    this.spinlocks = spinlocks;
    return this;
  }

   /**
   * Get spinlocks
   * @return spinlocks
  **/
  @Schema(description = "")
  public V1VmFeatureSpinlocks getSpinlocks() {
    return spinlocks;
  }

  public void setSpinlocks(V1VmFeatureSpinlocks spinlocks) {
    this.spinlocks = spinlocks;
  }

  public V1VmFeatureHyperv synic(V1VmFeatureState synic) {
    this.synic = synic;
    return this;
  }

   /**
   * Get synic
   * @return synic
  **/
  @Schema(description = "")
  public V1VmFeatureState getSynic() {
    return synic;
  }

  public void setSynic(V1VmFeatureState synic) {
    this.synic = synic;
  }

  public V1VmFeatureHyperv synictimer(V1VmSyNICTimer synictimer) {
    this.synictimer = synictimer;
    return this;
  }

   /**
   * Get synictimer
   * @return synictimer
  **/
  @Schema(description = "")
  public V1VmSyNICTimer getSynictimer() {
    return synictimer;
  }

  public void setSynictimer(V1VmSyNICTimer synictimer) {
    this.synictimer = synictimer;
  }

  public V1VmFeatureHyperv tlbflush(V1VmFeatureState tlbflush) {
    this.tlbflush = tlbflush;
    return this;
  }

   /**
   * Get tlbflush
   * @return tlbflush
  **/
  @Schema(description = "")
  public V1VmFeatureState getTlbflush() {
    return tlbflush;
  }

  public void setTlbflush(V1VmFeatureState tlbflush) {
    this.tlbflush = tlbflush;
  }

  public V1VmFeatureHyperv vapic(V1VmFeatureState vapic) {
    this.vapic = vapic;
    return this;
  }

   /**
   * Get vapic
   * @return vapic
  **/
  @Schema(description = "")
  public V1VmFeatureState getVapic() {
    return vapic;
  }

  public void setVapic(V1VmFeatureState vapic) {
    this.vapic = vapic;
  }

  public V1VmFeatureHyperv vendorid(V1VmFeatureVendorId vendorid) {
    this.vendorid = vendorid;
    return this;
  }

   /**
   * Get vendorid
   * @return vendorid
  **/
  @Schema(description = "")
  public V1VmFeatureVendorId getVendorid() {
    return vendorid;
  }

  public void setVendorid(V1VmFeatureVendorId vendorid) {
    this.vendorid = vendorid;
  }

  public V1VmFeatureHyperv vpindex(V1VmFeatureState vpindex) {
    this.vpindex = vpindex;
    return this;
  }

   /**
   * Get vpindex
   * @return vpindex
  **/
  @Schema(description = "")
  public V1VmFeatureState getVpindex() {
    return vpindex;
  }

  public void setVpindex(V1VmFeatureState vpindex) {
    this.vpindex = vpindex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VmFeatureHyperv v1VmFeatureHyperv = (V1VmFeatureHyperv) o;
    return Objects.equals(this.evmcs, v1VmFeatureHyperv.evmcs) &&
        Objects.equals(this.frequencies, v1VmFeatureHyperv.frequencies) &&
        Objects.equals(this.ipi, v1VmFeatureHyperv.ipi) &&
        Objects.equals(this.reenlightenment, v1VmFeatureHyperv.reenlightenment) &&
        Objects.equals(this.relaxed, v1VmFeatureHyperv.relaxed) &&
        Objects.equals(this.reset, v1VmFeatureHyperv.reset) &&
        Objects.equals(this.runtime, v1VmFeatureHyperv.runtime) &&
        Objects.equals(this.spinlocks, v1VmFeatureHyperv.spinlocks) &&
        Objects.equals(this.synic, v1VmFeatureHyperv.synic) &&
        Objects.equals(this.synictimer, v1VmFeatureHyperv.synictimer) &&
        Objects.equals(this.tlbflush, v1VmFeatureHyperv.tlbflush) &&
        Objects.equals(this.vapic, v1VmFeatureHyperv.vapic) &&
        Objects.equals(this.vendorid, v1VmFeatureHyperv.vendorid) &&
        Objects.equals(this.vpindex, v1VmFeatureHyperv.vpindex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evmcs, frequencies, ipi, reenlightenment, relaxed, reset, runtime, spinlocks, synic, synictimer, tlbflush, vapic, vendorid, vpindex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VmFeatureHyperv {\n");
    
    sb.append("    evmcs: ").append(toIndentedString(evmcs)).append("\n");
    sb.append("    frequencies: ").append(toIndentedString(frequencies)).append("\n");
    sb.append("    ipi: ").append(toIndentedString(ipi)).append("\n");
    sb.append("    reenlightenment: ").append(toIndentedString(reenlightenment)).append("\n");
    sb.append("    relaxed: ").append(toIndentedString(relaxed)).append("\n");
    sb.append("    reset: ").append(toIndentedString(reset)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    spinlocks: ").append(toIndentedString(spinlocks)).append("\n");
    sb.append("    synic: ").append(toIndentedString(synic)).append("\n");
    sb.append("    synictimer: ").append(toIndentedString(synictimer)).append("\n");
    sb.append("    tlbflush: ").append(toIndentedString(tlbflush)).append("\n");
    sb.append("    vapic: ").append(toIndentedString(vapic)).append("\n");
    sb.append("    vendorid: ").append(toIndentedString(vendorid)).append("\n");
    sb.append("    vpindex: ").append(toIndentedString(vpindex)).append("\n");
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