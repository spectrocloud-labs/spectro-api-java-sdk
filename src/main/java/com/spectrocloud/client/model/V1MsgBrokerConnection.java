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
import com.spectrocloud.client.model.V1MsgBrokerConnectionCluster;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * V1MsgBrokerConnection
 */



public class V1MsgBrokerConnection {
  @SerializedName("account")
  private String account = null;

  @SerializedName("accountUid")
  private String accountUid = null;

  @SerializedName("cid")
  private Integer cid = null;

  @SerializedName("cluster")
  private V1MsgBrokerConnectionCluster cluster = null;

  @SerializedName("cpu")
  private BigDecimal cpu = null;

  @SerializedName("duplicationCount")
  private Integer duplicationCount = null;

  @SerializedName("iP")
  private String iP = null;

  @SerializedName("idle")
  private String idle = null;

  @SerializedName("inBytes")
  private Integer inBytes = null;

  @SerializedName("inMsgs")
  private Integer inMsgs = null;

  @SerializedName("lang")
  private String lang = null;

  @SerializedName("lastActivity")
  private OffsetDateTime lastActivity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("outBytes")
  private Integer outBytes = null;

  @SerializedName("outMsgs")
  private Integer outMsgs = null;

  @SerializedName("pendingBytes")
  private Integer pendingBytes = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("rtt")
  private String rtt = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("subscriptionList")
  private List<String> subscriptionList = null;

  @SerializedName("subscriptions")
  private Integer subscriptions = null;

  @SerializedName("tLSCipherSuite")
  private String tLSCipherSuite = null;

  @SerializedName("tLSVersion")
  private String tLSVersion = null;

  @SerializedName("uptime")
  private String uptime = null;

  @SerializedName("version")
  private String version = null;

  public V1MsgBrokerConnection account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public V1MsgBrokerConnection accountUid(String accountUid) {
    this.accountUid = accountUid;
    return this;
  }

   /**
   * Get accountUid
   * @return accountUid
  **/
  @Schema(description = "")
  public String getAccountUid() {
    return accountUid;
  }

  public void setAccountUid(String accountUid) {
    this.accountUid = accountUid;
  }

  public V1MsgBrokerConnection cid(Integer cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @Schema(description = "")
  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public V1MsgBrokerConnection cluster(V1MsgBrokerConnectionCluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public V1MsgBrokerConnectionCluster getCluster() {
    return cluster;
  }

  public void setCluster(V1MsgBrokerConnectionCluster cluster) {
    this.cluster = cluster;
  }

  public V1MsgBrokerConnection cpu(BigDecimal cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @Schema(description = "")
  public BigDecimal getCpu() {
    return cpu;
  }

  public void setCpu(BigDecimal cpu) {
    this.cpu = cpu;
  }

  public V1MsgBrokerConnection duplicationCount(Integer duplicationCount) {
    this.duplicationCount = duplicationCount;
    return this;
  }

   /**
   * Get duplicationCount
   * @return duplicationCount
  **/
  @Schema(description = "")
  public Integer getDuplicationCount() {
    return duplicationCount;
  }

  public void setDuplicationCount(Integer duplicationCount) {
    this.duplicationCount = duplicationCount;
  }

  public V1MsgBrokerConnection iP(String iP) {
    this.iP = iP;
    return this;
  }

   /**
   * Get iP
   * @return iP
  **/
  @Schema(description = "")
  public String getIP() {
    return iP;
  }

  public void setIP(String iP) {
    this.iP = iP;
  }

  public V1MsgBrokerConnection idle(String idle) {
    this.idle = idle;
    return this;
  }

   /**
   * Get idle
   * @return idle
  **/
  @Schema(description = "")
  public String getIdle() {
    return idle;
  }

  public void setIdle(String idle) {
    this.idle = idle;
  }

  public V1MsgBrokerConnection inBytes(Integer inBytes) {
    this.inBytes = inBytes;
    return this;
  }

   /**
   * Get inBytes
   * @return inBytes
  **/
  @Schema(description = "")
  public Integer getInBytes() {
    return inBytes;
  }

  public void setInBytes(Integer inBytes) {
    this.inBytes = inBytes;
  }

  public V1MsgBrokerConnection inMsgs(Integer inMsgs) {
    this.inMsgs = inMsgs;
    return this;
  }

   /**
   * Get inMsgs
   * @return inMsgs
  **/
  @Schema(description = "")
  public Integer getInMsgs() {
    return inMsgs;
  }

  public void setInMsgs(Integer inMsgs) {
    this.inMsgs = inMsgs;
  }

  public V1MsgBrokerConnection lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public V1MsgBrokerConnection lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @Schema(description = "")
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }

  public V1MsgBrokerConnection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1MsgBrokerConnection outBytes(Integer outBytes) {
    this.outBytes = outBytes;
    return this;
  }

   /**
   * Get outBytes
   * @return outBytes
  **/
  @Schema(description = "")
  public Integer getOutBytes() {
    return outBytes;
  }

  public void setOutBytes(Integer outBytes) {
    this.outBytes = outBytes;
  }

  public V1MsgBrokerConnection outMsgs(Integer outMsgs) {
    this.outMsgs = outMsgs;
    return this;
  }

   /**
   * Get outMsgs
   * @return outMsgs
  **/
  @Schema(description = "")
  public Integer getOutMsgs() {
    return outMsgs;
  }

  public void setOutMsgs(Integer outMsgs) {
    this.outMsgs = outMsgs;
  }

  public V1MsgBrokerConnection pendingBytes(Integer pendingBytes) {
    this.pendingBytes = pendingBytes;
    return this;
  }

   /**
   * Get pendingBytes
   * @return pendingBytes
  **/
  @Schema(description = "")
  public Integer getPendingBytes() {
    return pendingBytes;
  }

  public void setPendingBytes(Integer pendingBytes) {
    this.pendingBytes = pendingBytes;
  }

  public V1MsgBrokerConnection port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public V1MsgBrokerConnection rtt(String rtt) {
    this.rtt = rtt;
    return this;
  }

   /**
   * Get rtt
   * @return rtt
  **/
  @Schema(description = "")
  public String getRtt() {
    return rtt;
  }

  public void setRtt(String rtt) {
    this.rtt = rtt;
  }

  public V1MsgBrokerConnection start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public V1MsgBrokerConnection subscriptionList(List<String> subscriptionList) {
    this.subscriptionList = subscriptionList;
    return this;
  }

  public V1MsgBrokerConnection addSubscriptionListItem(String subscriptionListItem) {
    if (this.subscriptionList == null) {
      this.subscriptionList = new ArrayList<String>();
    }
    this.subscriptionList.add(subscriptionListItem);
    return this;
  }

   /**
   * Get subscriptionList
   * @return subscriptionList
  **/
  @Schema(description = "")
  public List<String> getSubscriptionList() {
    return subscriptionList;
  }

  public void setSubscriptionList(List<String> subscriptionList) {
    this.subscriptionList = subscriptionList;
  }

  public V1MsgBrokerConnection subscriptions(Integer subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @Schema(description = "")
  public Integer getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(Integer subscriptions) {
    this.subscriptions = subscriptions;
  }

  public V1MsgBrokerConnection tLSCipherSuite(String tLSCipherSuite) {
    this.tLSCipherSuite = tLSCipherSuite;
    return this;
  }

   /**
   * Get tLSCipherSuite
   * @return tLSCipherSuite
  **/
  @Schema(description = "")
  public String getTLSCipherSuite() {
    return tLSCipherSuite;
  }

  public void setTLSCipherSuite(String tLSCipherSuite) {
    this.tLSCipherSuite = tLSCipherSuite;
  }

  public V1MsgBrokerConnection tLSVersion(String tLSVersion) {
    this.tLSVersion = tLSVersion;
    return this;
  }

   /**
   * Get tLSVersion
   * @return tLSVersion
  **/
  @Schema(description = "")
  public String getTLSVersion() {
    return tLSVersion;
  }

  public void setTLSVersion(String tLSVersion) {
    this.tLSVersion = tLSVersion;
  }

  public V1MsgBrokerConnection uptime(String uptime) {
    this.uptime = uptime;
    return this;
  }

   /**
   * Get uptime
   * @return uptime
  **/
  @Schema(description = "")
  public String getUptime() {
    return uptime;
  }

  public void setUptime(String uptime) {
    this.uptime = uptime;
  }

  public V1MsgBrokerConnection version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MsgBrokerConnection v1MsgBrokerConnection = (V1MsgBrokerConnection) o;
    return Objects.equals(this.account, v1MsgBrokerConnection.account) &&
        Objects.equals(this.accountUid, v1MsgBrokerConnection.accountUid) &&
        Objects.equals(this.cid, v1MsgBrokerConnection.cid) &&
        Objects.equals(this.cluster, v1MsgBrokerConnection.cluster) &&
        Objects.equals(this.cpu, v1MsgBrokerConnection.cpu) &&
        Objects.equals(this.duplicationCount, v1MsgBrokerConnection.duplicationCount) &&
        Objects.equals(this.iP, v1MsgBrokerConnection.iP) &&
        Objects.equals(this.idle, v1MsgBrokerConnection.idle) &&
        Objects.equals(this.inBytes, v1MsgBrokerConnection.inBytes) &&
        Objects.equals(this.inMsgs, v1MsgBrokerConnection.inMsgs) &&
        Objects.equals(this.lang, v1MsgBrokerConnection.lang) &&
        Objects.equals(this.lastActivity, v1MsgBrokerConnection.lastActivity) &&
        Objects.equals(this.name, v1MsgBrokerConnection.name) &&
        Objects.equals(this.outBytes, v1MsgBrokerConnection.outBytes) &&
        Objects.equals(this.outMsgs, v1MsgBrokerConnection.outMsgs) &&
        Objects.equals(this.pendingBytes, v1MsgBrokerConnection.pendingBytes) &&
        Objects.equals(this.port, v1MsgBrokerConnection.port) &&
        Objects.equals(this.rtt, v1MsgBrokerConnection.rtt) &&
        Objects.equals(this.start, v1MsgBrokerConnection.start) &&
        Objects.equals(this.subscriptionList, v1MsgBrokerConnection.subscriptionList) &&
        Objects.equals(this.subscriptions, v1MsgBrokerConnection.subscriptions) &&
        Objects.equals(this.tLSCipherSuite, v1MsgBrokerConnection.tLSCipherSuite) &&
        Objects.equals(this.tLSVersion, v1MsgBrokerConnection.tLSVersion) &&
        Objects.equals(this.uptime, v1MsgBrokerConnection.uptime) &&
        Objects.equals(this.version, v1MsgBrokerConnection.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountUid, cid, cluster, cpu, duplicationCount, iP, idle, inBytes, inMsgs, lang, lastActivity, name, outBytes, outMsgs, pendingBytes, port, rtt, start, subscriptionList, subscriptions, tLSCipherSuite, tLSVersion, uptime, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MsgBrokerConnection {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountUid: ").append(toIndentedString(accountUid)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    duplicationCount: ").append(toIndentedString(duplicationCount)).append("\n");
    sb.append("    iP: ").append(toIndentedString(iP)).append("\n");
    sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
    sb.append("    inBytes: ").append(toIndentedString(inBytes)).append("\n");
    sb.append("    inMsgs: ").append(toIndentedString(inMsgs)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outBytes: ").append(toIndentedString(outBytes)).append("\n");
    sb.append("    outMsgs: ").append(toIndentedString(outMsgs)).append("\n");
    sb.append("    pendingBytes: ").append(toIndentedString(pendingBytes)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    subscriptionList: ").append(toIndentedString(subscriptionList)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    tLSCipherSuite: ").append(toIndentedString(tLSCipherSuite)).append("\n");
    sb.append("    tLSVersion: ").append(toIndentedString(tLSVersion)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
