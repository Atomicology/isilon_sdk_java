/*
 * Isilon SDK
 * Isilon SDK - Language bindings for the OneFS API
 *
 * OpenAPI spec version: 5
 * Contact: sdk@isilon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SummaryClientClientItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SummaryClientClientItem {
  @SerializedName("class")
  private String propertyClass = null;

  @SerializedName("in")
  private BigDecimal in = null;

  @SerializedName("in_avg")
  private BigDecimal inAvg = null;

  @SerializedName("in_max")
  private BigDecimal inMax = null;

  @SerializedName("in_min")
  private BigDecimal inMin = null;

  @SerializedName("local_addr")
  private String localAddr = null;

  @SerializedName("local_name")
  private String localName = null;

  @SerializedName("node")
  private Integer node = null;

  @SerializedName("num_operations")
  private Integer numOperations = null;

  @SerializedName("operation_rate")
  private BigDecimal operationRate = null;

  @SerializedName("out")
  private BigDecimal out = null;

  @SerializedName("out_avg")
  private BigDecimal outAvg = null;

  @SerializedName("out_max")
  private BigDecimal outMax = null;

  @SerializedName("out_min")
  private BigDecimal outMin = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("remote_addr")
  private String remoteAddr = null;

  @SerializedName("remote_name")
  private String remoteName = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("time_avg")
  private BigDecimal timeAvg = null;

  @SerializedName("time_max")
  private BigDecimal timeMax = null;

  @SerializedName("time_min")
  private BigDecimal timeMin = null;

  @SerializedName("user")
  private AuthAccessAccessItemFileGroup user = null;

  public SummaryClientClientItem propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * The class of the operation.
   * @return propertyClass
  **/
  @ApiModelProperty(required = true, value = "The class of the operation.")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public SummaryClientClientItem in(BigDecimal in) {
    this.in = in;
    return this;
  }

   /**
   * Rate of input (in bytes/second) for an operation since the last time isi statistics collected the data.
   * @return in
  **/
  @ApiModelProperty(required = true, value = "Rate of input (in bytes/second) for an operation since the last time isi statistics collected the data.")
  public BigDecimal getIn() {
    return in;
  }

  public void setIn(BigDecimal in) {
    this.in = in;
  }

  public SummaryClientClientItem inAvg(BigDecimal inAvg) {
    this.inAvg = inAvg;
    return this;
  }

   /**
   * Average input (received) bytes for an operation, in bytes.
   * @return inAvg
  **/
  @ApiModelProperty(required = true, value = "Average input (received) bytes for an operation, in bytes.")
  public BigDecimal getInAvg() {
    return inAvg;
  }

  public void setInAvg(BigDecimal inAvg) {
    this.inAvg = inAvg;
  }

  public SummaryClientClientItem inMax(BigDecimal inMax) {
    this.inMax = inMax;
    return this;
  }

   /**
   * Maximum input (received) bytes for an operation, in bytes.
   * @return inMax
  **/
  @ApiModelProperty(required = true, value = "Maximum input (received) bytes for an operation, in bytes.")
  public BigDecimal getInMax() {
    return inMax;
  }

  public void setInMax(BigDecimal inMax) {
    this.inMax = inMax;
  }

  public SummaryClientClientItem inMin(BigDecimal inMin) {
    this.inMin = inMin;
    return this;
  }

   /**
   * Minimum input (received) bytes for an operation, in bytes.
   * @return inMin
  **/
  @ApiModelProperty(required = true, value = "Minimum input (received) bytes for an operation, in bytes.")
  public BigDecimal getInMin() {
    return inMin;
  }

  public void setInMin(BigDecimal inMin) {
    this.inMin = inMin;
  }

  public SummaryClientClientItem localAddr(String localAddr) {
    this.localAddr = localAddr;
    return this;
  }

   /**
   * The IP address (in dotted-quad form) of the host receiving the operation request.
   * @return localAddr
  **/
  @ApiModelProperty(required = true, value = "The IP address (in dotted-quad form) of the host receiving the operation request.")
  public String getLocalAddr() {
    return localAddr;
  }

  public void setLocalAddr(String localAddr) {
    this.localAddr = localAddr;
  }

  public SummaryClientClientItem localName(String localName) {
    this.localName = localName;
    return this;
  }

   /**
   * The resolved text name of the LocalAddr, if resolution can be performed.
   * @return localName
  **/
  @ApiModelProperty(required = true, value = "The resolved text name of the LocalAddr, if resolution can be performed.")
  public String getLocalName() {
    return localName;
  }

  public void setLocalName(String localName) {
    this.localName = localName;
  }

  public SummaryClientClientItem node(Integer node) {
    this.node = node;
    return this;
  }

   /**
   * The node on which the operation was performed.
   * @return node
  **/
  @ApiModelProperty(value = "The node on which the operation was performed.")
  public Integer getNode() {
    return node;
  }

  public void setNode(Integer node) {
    this.node = node;
  }

  public SummaryClientClientItem numOperations(Integer numOperations) {
    this.numOperations = numOperations;
    return this;
  }

   /**
   * The number of times an operation has been performed.
   * @return numOperations
  **/
  @ApiModelProperty(required = true, value = "The number of times an operation has been performed.")
  public Integer getNumOperations() {
    return numOperations;
  }

  public void setNumOperations(Integer numOperations) {
    this.numOperations = numOperations;
  }

  public SummaryClientClientItem operationRate(BigDecimal operationRate) {
    this.operationRate = operationRate;
    return this;
  }

   /**
   * The rate (in ops/second) at which an operation has been performed.
   * @return operationRate
  **/
  @ApiModelProperty(required = true, value = "The rate (in ops/second) at which an operation has been performed.")
  public BigDecimal getOperationRate() {
    return operationRate;
  }

  public void setOperationRate(BigDecimal operationRate) {
    this.operationRate = operationRate;
  }

  public SummaryClientClientItem out(BigDecimal out) {
    this.out = out;
    return this;
  }

   /**
   * Rate of output (in bytes/second) for an operation since the last time isi statistics collected the data.
   * @return out
  **/
  @ApiModelProperty(required = true, value = "Rate of output (in bytes/second) for an operation since the last time isi statistics collected the data.")
  public BigDecimal getOut() {
    return out;
  }

  public void setOut(BigDecimal out) {
    this.out = out;
  }

  public SummaryClientClientItem outAvg(BigDecimal outAvg) {
    this.outAvg = outAvg;
    return this;
  }

   /**
   * Average output (sent) bytes for an operation, in bytes.
   * @return outAvg
  **/
  @ApiModelProperty(required = true, value = "Average output (sent) bytes for an operation, in bytes.")
  public BigDecimal getOutAvg() {
    return outAvg;
  }

  public void setOutAvg(BigDecimal outAvg) {
    this.outAvg = outAvg;
  }

  public SummaryClientClientItem outMax(BigDecimal outMax) {
    this.outMax = outMax;
    return this;
  }

   /**
   * Maximum output (sent) bytes for an operation, in bytes.
   * @return outMax
  **/
  @ApiModelProperty(required = true, value = "Maximum output (sent) bytes for an operation, in bytes.")
  public BigDecimal getOutMax() {
    return outMax;
  }

  public void setOutMax(BigDecimal outMax) {
    this.outMax = outMax;
  }

  public SummaryClientClientItem outMin(BigDecimal outMin) {
    this.outMin = outMin;
    return this;
  }

   /**
   * Minimum output (sent) bytes for an operation, in bytes.
   * @return outMin
  **/
  @ApiModelProperty(required = true, value = "Minimum output (sent) bytes for an operation, in bytes.")
  public BigDecimal getOutMin() {
    return outMin;
  }

  public void setOutMin(BigDecimal outMin) {
    this.outMin = outMin;
  }

  public SummaryClientClientItem protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The protocol of the operation.
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "The protocol of the operation.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SummaryClientClientItem remoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
    return this;
  }

   /**
   * The IP address (in dotted-quad form) of the host sending the operation request.
   * @return remoteAddr
  **/
  @ApiModelProperty(required = true, value = "The IP address (in dotted-quad form) of the host sending the operation request.")
  public String getRemoteAddr() {
    return remoteAddr;
  }

  public void setRemoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
  }

  public SummaryClientClientItem remoteName(String remoteName) {
    this.remoteName = remoteName;
    return this;
  }

   /**
   * The resolved text name of the RemoteAddr, if resolution can be performed.
   * @return remoteName
  **/
  @ApiModelProperty(required = true, value = "The resolved text name of the RemoteAddr, if resolution can be performed.")
  public String getRemoteName() {
    return remoteName;
  }

  public void setRemoteName(String remoteName) {
    this.remoteName = remoteName;
  }

  public SummaryClientClientItem time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Unix Epoch time in seconds of the request.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "Unix Epoch time in seconds of the request.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public SummaryClientClientItem timeAvg(BigDecimal timeAvg) {
    this.timeAvg = timeAvg;
    return this;
  }

   /**
   * The average elapsed time (in microseconds) taken to complete an operation.
   * @return timeAvg
  **/
  @ApiModelProperty(required = true, value = "The average elapsed time (in microseconds) taken to complete an operation.")
  public BigDecimal getTimeAvg() {
    return timeAvg;
  }

  public void setTimeAvg(BigDecimal timeAvg) {
    this.timeAvg = timeAvg;
  }

  public SummaryClientClientItem timeMax(BigDecimal timeMax) {
    this.timeMax = timeMax;
    return this;
  }

   /**
   * The maximum elapsed time (in microseconds) taken to complete an operation.
   * @return timeMax
  **/
  @ApiModelProperty(required = true, value = "The maximum elapsed time (in microseconds) taken to complete an operation.")
  public BigDecimal getTimeMax() {
    return timeMax;
  }

  public void setTimeMax(BigDecimal timeMax) {
    this.timeMax = timeMax;
  }

  public SummaryClientClientItem timeMin(BigDecimal timeMin) {
    this.timeMin = timeMin;
    return this;
  }

   /**
   * The minimum elapsed time (in microseconds) taken to complete an operation.
   * @return timeMin
  **/
  @ApiModelProperty(required = true, value = "The minimum elapsed time (in microseconds) taken to complete an operation.")
  public BigDecimal getTimeMin() {
    return timeMin;
  }

  public void setTimeMin(BigDecimal timeMin) {
    this.timeMin = timeMin;
  }

  public SummaryClientClientItem user(AuthAccessAccessItemFileGroup user) {
    this.user = user;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return user
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getUser() {
    return user;
  }

  public void setUser(AuthAccessAccessItemFileGroup user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryClientClientItem summaryClientClientItem = (SummaryClientClientItem) o;
    return Objects.equals(this.propertyClass, summaryClientClientItem.propertyClass) &&
        Objects.equals(this.in, summaryClientClientItem.in) &&
        Objects.equals(this.inAvg, summaryClientClientItem.inAvg) &&
        Objects.equals(this.inMax, summaryClientClientItem.inMax) &&
        Objects.equals(this.inMin, summaryClientClientItem.inMin) &&
        Objects.equals(this.localAddr, summaryClientClientItem.localAddr) &&
        Objects.equals(this.localName, summaryClientClientItem.localName) &&
        Objects.equals(this.node, summaryClientClientItem.node) &&
        Objects.equals(this.numOperations, summaryClientClientItem.numOperations) &&
        Objects.equals(this.operationRate, summaryClientClientItem.operationRate) &&
        Objects.equals(this.out, summaryClientClientItem.out) &&
        Objects.equals(this.outAvg, summaryClientClientItem.outAvg) &&
        Objects.equals(this.outMax, summaryClientClientItem.outMax) &&
        Objects.equals(this.outMin, summaryClientClientItem.outMin) &&
        Objects.equals(this.protocol, summaryClientClientItem.protocol) &&
        Objects.equals(this.remoteAddr, summaryClientClientItem.remoteAddr) &&
        Objects.equals(this.remoteName, summaryClientClientItem.remoteName) &&
        Objects.equals(this.time, summaryClientClientItem.time) &&
        Objects.equals(this.timeAvg, summaryClientClientItem.timeAvg) &&
        Objects.equals(this.timeMax, summaryClientClientItem.timeMax) &&
        Objects.equals(this.timeMin, summaryClientClientItem.timeMin) &&
        Objects.equals(this.user, summaryClientClientItem.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, in, inAvg, inMax, inMin, localAddr, localName, node, numOperations, operationRate, out, outAvg, outMax, outMin, protocol, remoteAddr, remoteName, time, timeAvg, timeMax, timeMin, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClientClientItem {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    inAvg: ").append(toIndentedString(inAvg)).append("\n");
    sb.append("    inMax: ").append(toIndentedString(inMax)).append("\n");
    sb.append("    inMin: ").append(toIndentedString(inMin)).append("\n");
    sb.append("    localAddr: ").append(toIndentedString(localAddr)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    numOperations: ").append(toIndentedString(numOperations)).append("\n");
    sb.append("    operationRate: ").append(toIndentedString(operationRate)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    outAvg: ").append(toIndentedString(outAvg)).append("\n");
    sb.append("    outMax: ").append(toIndentedString(outMax)).append("\n");
    sb.append("    outMin: ").append(toIndentedString(outMin)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    remoteAddr: ").append(toIndentedString(remoteAddr)).append("\n");
    sb.append("    remoteName: ").append(toIndentedString(remoteName)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeAvg: ").append(toIndentedString(timeAvg)).append("\n");
    sb.append("    timeMax: ").append(toIndentedString(timeMax)).append("\n");
    sb.append("    timeMin: ").append(toIndentedString(timeMin)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

