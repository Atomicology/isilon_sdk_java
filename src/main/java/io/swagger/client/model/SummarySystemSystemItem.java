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
 * SummarySystemSystemItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SummarySystemSystemItem {
  @SerializedName("cpu")
  private BigDecimal cpu = null;

  @SerializedName("disk_in")
  private BigDecimal diskIn = null;

  @SerializedName("disk_out")
  private BigDecimal diskOut = null;

  @SerializedName("ftp")
  private BigDecimal ftp = null;

  @SerializedName("hdfs")
  private BigDecimal hdfs = null;

  @SerializedName("http")
  private BigDecimal http = null;

  @SerializedName("net_in")
  private BigDecimal netIn = null;

  @SerializedName("net_out")
  private BigDecimal netOut = null;

  @SerializedName("nfs")
  private BigDecimal nfs = null;

  @SerializedName("node")
  private String node = null;

  @SerializedName("smb")
  private BigDecimal smb = null;

  @SerializedName("time")
  private Integer time = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public SummarySystemSystemItem cpu(BigDecimal cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * The percentage CPU utilization.
   * @return cpu
  **/
  @ApiModelProperty(required = true, value = "The percentage CPU utilization.")
  public BigDecimal getCpu() {
    return cpu;
  }

  public void setCpu(BigDecimal cpu) {
    this.cpu = cpu;
  }

  public SummarySystemSystemItem diskIn(BigDecimal diskIn) {
    this.diskIn = diskIn;
    return this;
  }

   /**
   * Traffic to disk (in bytes/sec).
   * @return diskIn
  **/
  @ApiModelProperty(required = true, value = "Traffic to disk (in bytes/sec).")
  public BigDecimal getDiskIn() {
    return diskIn;
  }

  public void setDiskIn(BigDecimal diskIn) {
    this.diskIn = diskIn;
  }

  public SummarySystemSystemItem diskOut(BigDecimal diskOut) {
    this.diskOut = diskOut;
    return this;
  }

   /**
   * Traffic from disk (in bytes/sec).
   * @return diskOut
  **/
  @ApiModelProperty(required = true, value = "Traffic from disk (in bytes/sec).")
  public BigDecimal getDiskOut() {
    return diskOut;
  }

  public void setDiskOut(BigDecimal diskOut) {
    this.diskOut = diskOut;
  }

  public SummarySystemSystemItem ftp(BigDecimal ftp) {
    this.ftp = ftp;
    return this;
  }

   /**
   * The total throughput (in bytes/sec) for FTP operations.
   * @return ftp
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/sec) for FTP operations.")
  public BigDecimal getFtp() {
    return ftp;
  }

  public void setFtp(BigDecimal ftp) {
    this.ftp = ftp;
  }

  public SummarySystemSystemItem hdfs(BigDecimal hdfs) {
    this.hdfs = hdfs;
    return this;
  }

   /**
   * The total throughput (in bytes/second) for HDFS operations.
   * @return hdfs
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/second) for HDFS operations.")
  public BigDecimal getHdfs() {
    return hdfs;
  }

  public void setHdfs(BigDecimal hdfs) {
    this.hdfs = hdfs;
  }

  public SummarySystemSystemItem http(BigDecimal http) {
    this.http = http;
    return this;
  }

   /**
   * The total throughput (in bytes/sec) for HTTP operations.
   * @return http
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/sec) for HTTP operations.")
  public BigDecimal getHttp() {
    return http;
  }

  public void setHttp(BigDecimal http) {
    this.http = http;
  }

  public SummarySystemSystemItem netIn(BigDecimal netIn) {
    this.netIn = netIn;
    return this;
  }

   /**
   * Incoming network traffic (in bytes/sec) for all operations.
   * @return netIn
  **/
  @ApiModelProperty(required = true, value = "Incoming network traffic (in bytes/sec) for all operations.")
  public BigDecimal getNetIn() {
    return netIn;
  }

  public void setNetIn(BigDecimal netIn) {
    this.netIn = netIn;
  }

  public SummarySystemSystemItem netOut(BigDecimal netOut) {
    this.netOut = netOut;
    return this;
  }

   /**
   * Outgoing network traffic (in bytes/sec) for all operations.
   * @return netOut
  **/
  @ApiModelProperty(required = true, value = "Outgoing network traffic (in bytes/sec) for all operations.")
  public BigDecimal getNetOut() {
    return netOut;
  }

  public void setNetOut(BigDecimal netOut) {
    this.netOut = netOut;
  }

  public SummarySystemSystemItem nfs(BigDecimal nfs) {
    this.nfs = nfs;
    return this;
  }

   /**
   * The total throughput (in bytes/sec) for NFS (NFS3 &amp; NFS4) operations.
   * @return nfs
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/sec) for NFS (NFS3 & NFS4) operations.")
  public BigDecimal getNfs() {
    return nfs;
  }

  public void setNfs(BigDecimal nfs) {
    this.nfs = nfs;
  }

  public SummarySystemSystemItem node(String node) {
    this.node = node;
    return this;
  }

   /**
   * Node ID/LNN, &#39;All&#39; for cluster.
   * @return node
  **/
  @ApiModelProperty(required = true, value = "Node ID/LNN, 'All' for cluster.")
  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }

  public SummarySystemSystemItem smb(BigDecimal smb) {
    this.smb = smb;
    return this;
  }

   /**
   * The total throughput (in bytes/sec) for SMB (SMB1 &amp; SMB2) operations.
   * @return smb
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/sec) for SMB (SMB1 & SMB2) operations.")
  public BigDecimal getSmb() {
    return smb;
  }

  public void setSmb(BigDecimal smb) {
    this.smb = smb;
  }

  public SummarySystemSystemItem time(Integer time) {
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

  public SummarySystemSystemItem total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * The total throughput (in bytes/sec) for all protocols listed.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "The total throughput (in bytes/sec) for all protocols listed.")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySystemSystemItem summarySystemSystemItem = (SummarySystemSystemItem) o;
    return Objects.equals(this.cpu, summarySystemSystemItem.cpu) &&
        Objects.equals(this.diskIn, summarySystemSystemItem.diskIn) &&
        Objects.equals(this.diskOut, summarySystemSystemItem.diskOut) &&
        Objects.equals(this.ftp, summarySystemSystemItem.ftp) &&
        Objects.equals(this.hdfs, summarySystemSystemItem.hdfs) &&
        Objects.equals(this.http, summarySystemSystemItem.http) &&
        Objects.equals(this.netIn, summarySystemSystemItem.netIn) &&
        Objects.equals(this.netOut, summarySystemSystemItem.netOut) &&
        Objects.equals(this.nfs, summarySystemSystemItem.nfs) &&
        Objects.equals(this.node, summarySystemSystemItem.node) &&
        Objects.equals(this.smb, summarySystemSystemItem.smb) &&
        Objects.equals(this.time, summarySystemSystemItem.time) &&
        Objects.equals(this.total, summarySystemSystemItem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, diskIn, diskOut, ftp, hdfs, http, netIn, netOut, nfs, node, smb, time, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySystemSystemItem {\n");
    
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    diskIn: ").append(toIndentedString(diskIn)).append("\n");
    sb.append("    diskOut: ").append(toIndentedString(diskOut)).append("\n");
    sb.append("    ftp: ").append(toIndentedString(ftp)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    netIn: ").append(toIndentedString(netIn)).append("\n");
    sb.append("    netOut: ").append(toIndentedString(netOut)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    smb: ").append(toIndentedString(smb)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
