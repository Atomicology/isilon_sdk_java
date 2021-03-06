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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SummaryProtocolProtocolItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SummaryProtocolProtocolItem {
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

  @SerializedName("in_standard_dev")
  private BigDecimal inStandardDev = null;

  @SerializedName("node")
  private Integer node = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("operation_count")
  private Integer operationCount = null;

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

  @SerializedName("out_standard_dev")
  private BigDecimal outStandardDev = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("time_avg")
  private BigDecimal timeAvg = null;

  @SerializedName("time_max")
  private BigDecimal timeMax = null;

  @SerializedName("time_min")
  private BigDecimal timeMin = null;

  @SerializedName("time_standard_dev")
  private BigDecimal timeStandardDev = null;

  public SummaryProtocolProtocolItem propertyClass(String propertyClass) {
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

  public SummaryProtocolProtocolItem in(BigDecimal in) {
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

  public SummaryProtocolProtocolItem inAvg(BigDecimal inAvg) {
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

  public SummaryProtocolProtocolItem inMax(BigDecimal inMax) {
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

  public SummaryProtocolProtocolItem inMin(BigDecimal inMin) {
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

  public SummaryProtocolProtocolItem inStandardDev(BigDecimal inStandardDev) {
    this.inStandardDev = inStandardDev;
    return this;
  }

   /**
   * Standard deviation for input (received) bytes for an operation, in bytes.
   * @return inStandardDev
  **/
  @ApiModelProperty(required = true, value = "Standard deviation for input (received) bytes for an operation, in bytes.")
  public BigDecimal getInStandardDev() {
    return inStandardDev;
  }

  public void setInStandardDev(BigDecimal inStandardDev) {
    this.inStandardDev = inStandardDev;
  }

  public SummaryProtocolProtocolItem node(Integer node) {
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

  public SummaryProtocolProtocolItem operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The operation performed.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "The operation performed.")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public SummaryProtocolProtocolItem operationCount(Integer operationCount) {
    this.operationCount = operationCount;
    return this;
  }

   /**
   * The number of times an operation has been performed.
   * @return operationCount
  **/
  @ApiModelProperty(required = true, value = "The number of times an operation has been performed.")
  public Integer getOperationCount() {
    return operationCount;
  }

  public void setOperationCount(Integer operationCount) {
    this.operationCount = operationCount;
  }

  public SummaryProtocolProtocolItem operationRate(BigDecimal operationRate) {
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

  public SummaryProtocolProtocolItem out(BigDecimal out) {
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

  public SummaryProtocolProtocolItem outAvg(BigDecimal outAvg) {
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

  public SummaryProtocolProtocolItem outMax(BigDecimal outMax) {
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

  public SummaryProtocolProtocolItem outMin(BigDecimal outMin) {
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

  public SummaryProtocolProtocolItem outStandardDev(BigDecimal outStandardDev) {
    this.outStandardDev = outStandardDev;
    return this;
  }

   /**
   * Standard deviation for output (received) bytes for an operation, in bytes.
   * @return outStandardDev
  **/
  @ApiModelProperty(required = true, value = "Standard deviation for output (received) bytes for an operation, in bytes.")
  public BigDecimal getOutStandardDev() {
    return outStandardDev;
  }

  public void setOutStandardDev(BigDecimal outStandardDev) {
    this.outStandardDev = outStandardDev;
  }

  public SummaryProtocolProtocolItem protocol(String protocol) {
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

  public SummaryProtocolProtocolItem time(Integer time) {
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

  public SummaryProtocolProtocolItem timeAvg(BigDecimal timeAvg) {
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

  public SummaryProtocolProtocolItem timeMax(BigDecimal timeMax) {
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

  public SummaryProtocolProtocolItem timeMin(BigDecimal timeMin) {
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

  public SummaryProtocolProtocolItem timeStandardDev(BigDecimal timeStandardDev) {
    this.timeStandardDev = timeStandardDev;
    return this;
  }

   /**
   * The standard deviation time (in microseconds) taken to complete an operation.
   * @return timeStandardDev
  **/
  @ApiModelProperty(required = true, value = "The standard deviation time (in microseconds) taken to complete an operation.")
  public BigDecimal getTimeStandardDev() {
    return timeStandardDev;
  }

  public void setTimeStandardDev(BigDecimal timeStandardDev) {
    this.timeStandardDev = timeStandardDev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryProtocolProtocolItem summaryProtocolProtocolItem = (SummaryProtocolProtocolItem) o;
    return Objects.equals(this.propertyClass, summaryProtocolProtocolItem.propertyClass) &&
        Objects.equals(this.in, summaryProtocolProtocolItem.in) &&
        Objects.equals(this.inAvg, summaryProtocolProtocolItem.inAvg) &&
        Objects.equals(this.inMax, summaryProtocolProtocolItem.inMax) &&
        Objects.equals(this.inMin, summaryProtocolProtocolItem.inMin) &&
        Objects.equals(this.inStandardDev, summaryProtocolProtocolItem.inStandardDev) &&
        Objects.equals(this.node, summaryProtocolProtocolItem.node) &&
        Objects.equals(this.operation, summaryProtocolProtocolItem.operation) &&
        Objects.equals(this.operationCount, summaryProtocolProtocolItem.operationCount) &&
        Objects.equals(this.operationRate, summaryProtocolProtocolItem.operationRate) &&
        Objects.equals(this.out, summaryProtocolProtocolItem.out) &&
        Objects.equals(this.outAvg, summaryProtocolProtocolItem.outAvg) &&
        Objects.equals(this.outMax, summaryProtocolProtocolItem.outMax) &&
        Objects.equals(this.outMin, summaryProtocolProtocolItem.outMin) &&
        Objects.equals(this.outStandardDev, summaryProtocolProtocolItem.outStandardDev) &&
        Objects.equals(this.protocol, summaryProtocolProtocolItem.protocol) &&
        Objects.equals(this.time, summaryProtocolProtocolItem.time) &&
        Objects.equals(this.timeAvg, summaryProtocolProtocolItem.timeAvg) &&
        Objects.equals(this.timeMax, summaryProtocolProtocolItem.timeMax) &&
        Objects.equals(this.timeMin, summaryProtocolProtocolItem.timeMin) &&
        Objects.equals(this.timeStandardDev, summaryProtocolProtocolItem.timeStandardDev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, in, inAvg, inMax, inMin, inStandardDev, node, operation, operationCount, operationRate, out, outAvg, outMax, outMin, outStandardDev, protocol, time, timeAvg, timeMax, timeMin, timeStandardDev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryProtocolProtocolItem {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    inAvg: ").append(toIndentedString(inAvg)).append("\n");
    sb.append("    inMax: ").append(toIndentedString(inMax)).append("\n");
    sb.append("    inMin: ").append(toIndentedString(inMin)).append("\n");
    sb.append("    inStandardDev: ").append(toIndentedString(inStandardDev)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    operationCount: ").append(toIndentedString(operationCount)).append("\n");
    sb.append("    operationRate: ").append(toIndentedString(operationRate)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
    sb.append("    outAvg: ").append(toIndentedString(outAvg)).append("\n");
    sb.append("    outMax: ").append(toIndentedString(outMax)).append("\n");
    sb.append("    outMin: ").append(toIndentedString(outMin)).append("\n");
    sb.append("    outStandardDev: ").append(toIndentedString(outStandardDev)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeAvg: ").append(toIndentedString(timeAvg)).append("\n");
    sb.append("    timeMax: ").append(toIndentedString(timeMax)).append("\n");
    sb.append("    timeMin: ").append(toIndentedString(timeMin)).append("\n");
    sb.append("    timeStandardDev: ").append(toIndentedString(timeStandardDev)).append("\n");
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

