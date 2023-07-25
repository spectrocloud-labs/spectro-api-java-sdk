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
 * V1MsgBrokerVariables
 */



public class V1MsgBrokerVariables {
  @SerializedName("authRequired")
  private Boolean authRequired = null;

  @SerializedName("authTimeout")
  private Integer authTimeout = null;

  @SerializedName("cluster")
  private V1MsgBrokerConnectionCluster cluster = null;

  @SerializedName("configLoadTime")
  private OffsetDateTime configLoadTime = null;

  @SerializedName("connectUrls")
  private List<String> connectUrls = null;

  @SerializedName("connections")
  private Integer connections = null;

  @SerializedName("cores")
  private Integer cores = null;

  @SerializedName("cpu")
  private BigDecimal cpu = null;

  @SerializedName("gitCommit")
  private String gitCommit = null;

  @SerializedName("go")
  private String go = null;

  @SerializedName("gomaxprocs")
  private Integer gomaxprocs = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("httpHost")
  private String httpHost = null;

  @SerializedName("httpPort")
  private Integer httpPort = null;

  @SerializedName("inBytes")
  private Integer inBytes = null;

  @SerializedName("inMsgs")
  private Integer inMsgs = null;

  @SerializedName("leafNodes")
  private Integer leafNodes = null;

  @SerializedName("maxConnections")
  private Integer maxConnections = null;

  @SerializedName("maxControlLine")
  private Integer maxControlLine = null;

  @SerializedName("maxPayload")
  private Integer maxPayload = null;

  @SerializedName("maxPending")
  private Integer maxPending = null;

  @SerializedName("mem")
  private Integer mem = null;

  @SerializedName("now")
  private OffsetDateTime now = null;

  @SerializedName("outBytes")
  private Integer outBytes = null;

  @SerializedName("outMsgs")
  private Integer outMsgs = null;

  @SerializedName("pingInterval")
  private Integer pingInterval = null;

  @SerializedName("pingMax")
  private Integer pingMax = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("proto")
  private Integer proto = null;

  @SerializedName("remotes")
  private Integer remotes = null;

  @SerializedName("routes")
  private Integer routes = null;

  @SerializedName("serverId")
  private String serverId = null;

  @SerializedName("serverName")
  private String serverName = null;

  @SerializedName("slowConsumers")
  private Integer slowConsumers = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("subscriptions")
  private Integer subscriptions = null;

  @SerializedName("tlsRequired")
  private Boolean tlsRequired = null;

  @SerializedName("tlsTimeout")
  private Integer tlsTimeout = null;

  @SerializedName("totalConnections")
  private Integer totalConnections = null;

  @SerializedName("uptime")
  private String uptime = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("writeDeadline")
  private Integer writeDeadline = null;

  public V1MsgBrokerVariables authRequired(Boolean authRequired) {
    this.authRequired = authRequired;
    return this;
  }

   /**
   * Get authRequired
   * @return authRequired
  **/
  @Schema(description = "")
  public Boolean isAuthRequired() {
    return authRequired;
  }

  public void setAuthRequired(Boolean authRequired) {
    this.authRequired = authRequired;
  }

  public V1MsgBrokerVariables authTimeout(Integer authTimeout) {
    this.authTimeout = authTimeout;
    return this;
  }

   /**
   * Get authTimeout
   * @return authTimeout
  **/
  @Schema(description = "")
  public Integer getAuthTimeout() {
    return authTimeout;
  }

  public void setAuthTimeout(Integer authTimeout) {
    this.authTimeout = authTimeout;
  }

  public V1MsgBrokerVariables cluster(V1MsgBrokerConnectionCluster cluster) {
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

  public V1MsgBrokerVariables configLoadTime(OffsetDateTime configLoadTime) {
    this.configLoadTime = configLoadTime;
    return this;
  }

   /**
   * Get configLoadTime
   * @return configLoadTime
  **/
  @Schema(description = "")
  public OffsetDateTime getConfigLoadTime() {
    return configLoadTime;
  }

  public void setConfigLoadTime(OffsetDateTime configLoadTime) {
    this.configLoadTime = configLoadTime;
  }

  public V1MsgBrokerVariables connectUrls(List<String> connectUrls) {
    this.connectUrls = connectUrls;
    return this;
  }

  public V1MsgBrokerVariables addConnectUrlsItem(String connectUrlsItem) {
    if (this.connectUrls == null) {
      this.connectUrls = new ArrayList<String>();
    }
    this.connectUrls.add(connectUrlsItem);
    return this;
  }

   /**
   * Get connectUrls
   * @return connectUrls
  **/
  @Schema(description = "")
  public List<String> getConnectUrls() {
    return connectUrls;
  }

  public void setConnectUrls(List<String> connectUrls) {
    this.connectUrls = connectUrls;
  }

  public V1MsgBrokerVariables connections(Integer connections) {
    this.connections = connections;
    return this;
  }

   /**
   * Get connections
   * @return connections
  **/
  @Schema(description = "")
  public Integer getConnections() {
    return connections;
  }

  public void setConnections(Integer connections) {
    this.connections = connections;
  }

  public V1MsgBrokerVariables cores(Integer cores) {
    this.cores = cores;
    return this;
  }

   /**
   * Get cores
   * @return cores
  **/
  @Schema(description = "")
  public Integer getCores() {
    return cores;
  }

  public void setCores(Integer cores) {
    this.cores = cores;
  }

  public V1MsgBrokerVariables cpu(BigDecimal cpu) {
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

  public V1MsgBrokerVariables gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

   /**
   * Get gitCommit
   * @return gitCommit
  **/
  @Schema(description = "")
  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public V1MsgBrokerVariables go(String go) {
    this.go = go;
    return this;
  }

   /**
   * Get go
   * @return go
  **/
  @Schema(description = "")
  public String getGo() {
    return go;
  }

  public void setGo(String go) {
    this.go = go;
  }

  public V1MsgBrokerVariables gomaxprocs(Integer gomaxprocs) {
    this.gomaxprocs = gomaxprocs;
    return this;
  }

   /**
   * Get gomaxprocs
   * @return gomaxprocs
  **/
  @Schema(description = "")
  public Integer getGomaxprocs() {
    return gomaxprocs;
  }

  public void setGomaxprocs(Integer gomaxprocs) {
    this.gomaxprocs = gomaxprocs;
  }

  public V1MsgBrokerVariables host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1MsgBrokerVariables httpHost(String httpHost) {
    this.httpHost = httpHost;
    return this;
  }

   /**
   * Get httpHost
   * @return httpHost
  **/
  @Schema(description = "")
  public String getHttpHost() {
    return httpHost;
  }

  public void setHttpHost(String httpHost) {
    this.httpHost = httpHost;
  }

  public V1MsgBrokerVariables httpPort(Integer httpPort) {
    this.httpPort = httpPort;
    return this;
  }

   /**
   * Get httpPort
   * @return httpPort
  **/
  @Schema(description = "")
  public Integer getHttpPort() {
    return httpPort;
  }

  public void setHttpPort(Integer httpPort) {
    this.httpPort = httpPort;
  }

  public V1MsgBrokerVariables inBytes(Integer inBytes) {
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

  public V1MsgBrokerVariables inMsgs(Integer inMsgs) {
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

  public V1MsgBrokerVariables leafNodes(Integer leafNodes) {
    this.leafNodes = leafNodes;
    return this;
  }

   /**
   * Get leafNodes
   * @return leafNodes
  **/
  @Schema(description = "")
  public Integer getLeafNodes() {
    return leafNodes;
  }

  public void setLeafNodes(Integer leafNodes) {
    this.leafNodes = leafNodes;
  }

  public V1MsgBrokerVariables maxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
    return this;
  }

   /**
   * Get maxConnections
   * @return maxConnections
  **/
  @Schema(description = "")
  public Integer getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(Integer maxConnections) {
    this.maxConnections = maxConnections;
  }

  public V1MsgBrokerVariables maxControlLine(Integer maxControlLine) {
    this.maxControlLine = maxControlLine;
    return this;
  }

   /**
   * Get maxControlLine
   * @return maxControlLine
  **/
  @Schema(description = "")
  public Integer getMaxControlLine() {
    return maxControlLine;
  }

  public void setMaxControlLine(Integer maxControlLine) {
    this.maxControlLine = maxControlLine;
  }

  public V1MsgBrokerVariables maxPayload(Integer maxPayload) {
    this.maxPayload = maxPayload;
    return this;
  }

   /**
   * Get maxPayload
   * @return maxPayload
  **/
  @Schema(description = "")
  public Integer getMaxPayload() {
    return maxPayload;
  }

  public void setMaxPayload(Integer maxPayload) {
    this.maxPayload = maxPayload;
  }

  public V1MsgBrokerVariables maxPending(Integer maxPending) {
    this.maxPending = maxPending;
    return this;
  }

   /**
   * Get maxPending
   * @return maxPending
  **/
  @Schema(description = "")
  public Integer getMaxPending() {
    return maxPending;
  }

  public void setMaxPending(Integer maxPending) {
    this.maxPending = maxPending;
  }

  public V1MsgBrokerVariables mem(Integer mem) {
    this.mem = mem;
    return this;
  }

   /**
   * Get mem
   * @return mem
  **/
  @Schema(description = "")
  public Integer getMem() {
    return mem;
  }

  public void setMem(Integer mem) {
    this.mem = mem;
  }

  public V1MsgBrokerVariables now(OffsetDateTime now) {
    this.now = now;
    return this;
  }

   /**
   * Get now
   * @return now
  **/
  @Schema(description = "")
  public OffsetDateTime getNow() {
    return now;
  }

  public void setNow(OffsetDateTime now) {
    this.now = now;
  }

  public V1MsgBrokerVariables outBytes(Integer outBytes) {
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

  public V1MsgBrokerVariables outMsgs(Integer outMsgs) {
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

  public V1MsgBrokerVariables pingInterval(Integer pingInterval) {
    this.pingInterval = pingInterval;
    return this;
  }

   /**
   * Get pingInterval
   * @return pingInterval
  **/
  @Schema(description = "")
  public Integer getPingInterval() {
    return pingInterval;
  }

  public void setPingInterval(Integer pingInterval) {
    this.pingInterval = pingInterval;
  }

  public V1MsgBrokerVariables pingMax(Integer pingMax) {
    this.pingMax = pingMax;
    return this;
  }

   /**
   * Get pingMax
   * @return pingMax
  **/
  @Schema(description = "")
  public Integer getPingMax() {
    return pingMax;
  }

  public void setPingMax(Integer pingMax) {
    this.pingMax = pingMax;
  }

  public V1MsgBrokerVariables port(Integer port) {
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

  public V1MsgBrokerVariables proto(Integer proto) {
    this.proto = proto;
    return this;
  }

   /**
   * Get proto
   * @return proto
  **/
  @Schema(description = "")
  public Integer getProto() {
    return proto;
  }

  public void setProto(Integer proto) {
    this.proto = proto;
  }

  public V1MsgBrokerVariables remotes(Integer remotes) {
    this.remotes = remotes;
    return this;
  }

   /**
   * Get remotes
   * @return remotes
  **/
  @Schema(description = "")
  public Integer getRemotes() {
    return remotes;
  }

  public void setRemotes(Integer remotes) {
    this.remotes = remotes;
  }

  public V1MsgBrokerVariables routes(Integer routes) {
    this.routes = routes;
    return this;
  }

   /**
   * Get routes
   * @return routes
  **/
  @Schema(description = "")
  public Integer getRoutes() {
    return routes;
  }

  public void setRoutes(Integer routes) {
    this.routes = routes;
  }

  public V1MsgBrokerVariables serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @Schema(description = "")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public V1MsgBrokerVariables serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @Schema(description = "")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public V1MsgBrokerVariables slowConsumers(Integer slowConsumers) {
    this.slowConsumers = slowConsumers;
    return this;
  }

   /**
   * Get slowConsumers
   * @return slowConsumers
  **/
  @Schema(description = "")
  public Integer getSlowConsumers() {
    return slowConsumers;
  }

  public void setSlowConsumers(Integer slowConsumers) {
    this.slowConsumers = slowConsumers;
  }

  public V1MsgBrokerVariables start(OffsetDateTime start) {
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

  public V1MsgBrokerVariables subscriptions(Integer subscriptions) {
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

  public V1MsgBrokerVariables tlsRequired(Boolean tlsRequired) {
    this.tlsRequired = tlsRequired;
    return this;
  }

   /**
   * Get tlsRequired
   * @return tlsRequired
  **/
  @Schema(description = "")
  public Boolean isTlsRequired() {
    return tlsRequired;
  }

  public void setTlsRequired(Boolean tlsRequired) {
    this.tlsRequired = tlsRequired;
  }

  public V1MsgBrokerVariables tlsTimeout(Integer tlsTimeout) {
    this.tlsTimeout = tlsTimeout;
    return this;
  }

   /**
   * Get tlsTimeout
   * @return tlsTimeout
  **/
  @Schema(description = "")
  public Integer getTlsTimeout() {
    return tlsTimeout;
  }

  public void setTlsTimeout(Integer tlsTimeout) {
    this.tlsTimeout = tlsTimeout;
  }

  public V1MsgBrokerVariables totalConnections(Integer totalConnections) {
    this.totalConnections = totalConnections;
    return this;
  }

   /**
   * Get totalConnections
   * @return totalConnections
  **/
  @Schema(description = "")
  public Integer getTotalConnections() {
    return totalConnections;
  }

  public void setTotalConnections(Integer totalConnections) {
    this.totalConnections = totalConnections;
  }

  public V1MsgBrokerVariables uptime(String uptime) {
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

  public V1MsgBrokerVariables version(String version) {
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

  public V1MsgBrokerVariables writeDeadline(Integer writeDeadline) {
    this.writeDeadline = writeDeadline;
    return this;
  }

   /**
   * Get writeDeadline
   * @return writeDeadline
  **/
  @Schema(description = "")
  public Integer getWriteDeadline() {
    return writeDeadline;
  }

  public void setWriteDeadline(Integer writeDeadline) {
    this.writeDeadline = writeDeadline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MsgBrokerVariables v1MsgBrokerVariables = (V1MsgBrokerVariables) o;
    return Objects.equals(this.authRequired, v1MsgBrokerVariables.authRequired) &&
        Objects.equals(this.authTimeout, v1MsgBrokerVariables.authTimeout) &&
        Objects.equals(this.cluster, v1MsgBrokerVariables.cluster) &&
        Objects.equals(this.configLoadTime, v1MsgBrokerVariables.configLoadTime) &&
        Objects.equals(this.connectUrls, v1MsgBrokerVariables.connectUrls) &&
        Objects.equals(this.connections, v1MsgBrokerVariables.connections) &&
        Objects.equals(this.cores, v1MsgBrokerVariables.cores) &&
        Objects.equals(this.cpu, v1MsgBrokerVariables.cpu) &&
        Objects.equals(this.gitCommit, v1MsgBrokerVariables.gitCommit) &&
        Objects.equals(this.go, v1MsgBrokerVariables.go) &&
        Objects.equals(this.gomaxprocs, v1MsgBrokerVariables.gomaxprocs) &&
        Objects.equals(this.host, v1MsgBrokerVariables.host) &&
        Objects.equals(this.httpHost, v1MsgBrokerVariables.httpHost) &&
        Objects.equals(this.httpPort, v1MsgBrokerVariables.httpPort) &&
        Objects.equals(this.inBytes, v1MsgBrokerVariables.inBytes) &&
        Objects.equals(this.inMsgs, v1MsgBrokerVariables.inMsgs) &&
        Objects.equals(this.leafNodes, v1MsgBrokerVariables.leafNodes) &&
        Objects.equals(this.maxConnections, v1MsgBrokerVariables.maxConnections) &&
        Objects.equals(this.maxControlLine, v1MsgBrokerVariables.maxControlLine) &&
        Objects.equals(this.maxPayload, v1MsgBrokerVariables.maxPayload) &&
        Objects.equals(this.maxPending, v1MsgBrokerVariables.maxPending) &&
        Objects.equals(this.mem, v1MsgBrokerVariables.mem) &&
        Objects.equals(this.now, v1MsgBrokerVariables.now) &&
        Objects.equals(this.outBytes, v1MsgBrokerVariables.outBytes) &&
        Objects.equals(this.outMsgs, v1MsgBrokerVariables.outMsgs) &&
        Objects.equals(this.pingInterval, v1MsgBrokerVariables.pingInterval) &&
        Objects.equals(this.pingMax, v1MsgBrokerVariables.pingMax) &&
        Objects.equals(this.port, v1MsgBrokerVariables.port) &&
        Objects.equals(this.proto, v1MsgBrokerVariables.proto) &&
        Objects.equals(this.remotes, v1MsgBrokerVariables.remotes) &&
        Objects.equals(this.routes, v1MsgBrokerVariables.routes) &&
        Objects.equals(this.serverId, v1MsgBrokerVariables.serverId) &&
        Objects.equals(this.serverName, v1MsgBrokerVariables.serverName) &&
        Objects.equals(this.slowConsumers, v1MsgBrokerVariables.slowConsumers) &&
        Objects.equals(this.start, v1MsgBrokerVariables.start) &&
        Objects.equals(this.subscriptions, v1MsgBrokerVariables.subscriptions) &&
        Objects.equals(this.tlsRequired, v1MsgBrokerVariables.tlsRequired) &&
        Objects.equals(this.tlsTimeout, v1MsgBrokerVariables.tlsTimeout) &&
        Objects.equals(this.totalConnections, v1MsgBrokerVariables.totalConnections) &&
        Objects.equals(this.uptime, v1MsgBrokerVariables.uptime) &&
        Objects.equals(this.version, v1MsgBrokerVariables.version) &&
        Objects.equals(this.writeDeadline, v1MsgBrokerVariables.writeDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authRequired, authTimeout, cluster, configLoadTime, connectUrls, connections, cores, cpu, gitCommit, go, gomaxprocs, host, httpHost, httpPort, inBytes, inMsgs, leafNodes, maxConnections, maxControlLine, maxPayload, maxPending, mem, now, outBytes, outMsgs, pingInterval, pingMax, port, proto, remotes, routes, serverId, serverName, slowConsumers, start, subscriptions, tlsRequired, tlsTimeout, totalConnections, uptime, version, writeDeadline);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MsgBrokerVariables {\n");
    
    sb.append("    authRequired: ").append(toIndentedString(authRequired)).append("\n");
    sb.append("    authTimeout: ").append(toIndentedString(authTimeout)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    configLoadTime: ").append(toIndentedString(configLoadTime)).append("\n");
    sb.append("    connectUrls: ").append(toIndentedString(connectUrls)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    go: ").append(toIndentedString(go)).append("\n");
    sb.append("    gomaxprocs: ").append(toIndentedString(gomaxprocs)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHost: ").append(toIndentedString(httpHost)).append("\n");
    sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
    sb.append("    inBytes: ").append(toIndentedString(inBytes)).append("\n");
    sb.append("    inMsgs: ").append(toIndentedString(inMsgs)).append("\n");
    sb.append("    leafNodes: ").append(toIndentedString(leafNodes)).append("\n");
    sb.append("    maxConnections: ").append(toIndentedString(maxConnections)).append("\n");
    sb.append("    maxControlLine: ").append(toIndentedString(maxControlLine)).append("\n");
    sb.append("    maxPayload: ").append(toIndentedString(maxPayload)).append("\n");
    sb.append("    maxPending: ").append(toIndentedString(maxPending)).append("\n");
    sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
    sb.append("    outBytes: ").append(toIndentedString(outBytes)).append("\n");
    sb.append("    outMsgs: ").append(toIndentedString(outMsgs)).append("\n");
    sb.append("    pingInterval: ").append(toIndentedString(pingInterval)).append("\n");
    sb.append("    pingMax: ").append(toIndentedString(pingMax)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    remotes: ").append(toIndentedString(remotes)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    slowConsumers: ").append(toIndentedString(slowConsumers)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    tlsRequired: ").append(toIndentedString(tlsRequired)).append("\n");
    sb.append("    tlsTimeout: ").append(toIndentedString(tlsTimeout)).append("\n");
    sb.append("    totalConnections: ").append(toIndentedString(totalConnections)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    writeDeadline: ").append(toIndentedString(writeDeadline)).append("\n");
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