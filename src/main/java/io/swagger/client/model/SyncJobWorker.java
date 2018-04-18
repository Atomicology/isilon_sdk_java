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

/**
 * SyncJobWorker
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SyncJobWorker {
  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("last_split")
  private Integer lastSplit = null;

  @SerializedName("last_work")
  private Integer lastWork = null;

  @SerializedName("lin")
  private Integer lin = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("process_id")
  private Integer processId = null;

  @SerializedName("source_host")
  private String sourceHost = null;

  @SerializedName("target_host")
  private String targetHost = null;

  @SerializedName("worker_id")
  private Integer workerId = null;

  public SyncJobWorker connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Whether there is a connection between the source and target.
   * @return connected
  **/
  @ApiModelProperty(value = "Whether there is a connection between the source and target.")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public SyncJobWorker lastSplit(Integer lastSplit) {
    this.lastSplit = lastSplit;
    return this;
  }

   /**
   * The last time a network split occurred.
   * @return lastSplit
  **/
  @ApiModelProperty(value = "The last time a network split occurred.")
  public Integer getLastSplit() {
    return lastSplit;
  }

  public void setLastSplit(Integer lastSplit) {
    this.lastSplit = lastSplit;
  }

  public SyncJobWorker lastWork(Integer lastWork) {
    this.lastWork = lastWork;
    return this;
  }

   /**
   * The last time the worker performed work.
   * @return lastWork
  **/
  @ApiModelProperty(value = "The last time the worker performed work.")
  public Integer getLastWork() {
    return lastWork;
  }

  public void setLastWork(Integer lastWork) {
    this.lastWork = lastWork;
  }

  public SyncJobWorker lin(Integer lin) {
    this.lin = lin;
    return this;
  }

   /**
   * The LIN being worked on.
   * @return lin
  **/
  @ApiModelProperty(value = "The LIN being worked on.")
  public Integer getLin() {
    return lin;
  }

  public void setLin(Integer lin) {
    this.lin = lin;
  }

  public SyncJobWorker lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * The lnn the worker is assigned to run on.
   * @return lnn
  **/
  @ApiModelProperty(value = "The lnn the worker is assigned to run on.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public SyncJobWorker processId(Integer processId) {
    this.processId = processId;
    return this;
  }

   /**
   * The process ID of the worker.
   * @return processId
  **/
  @ApiModelProperty(value = "The process ID of the worker.")
  public Integer getProcessId() {
    return processId;
  }

  public void setProcessId(Integer processId) {
    this.processId = processId;
  }

  public SyncJobWorker sourceHost(String sourceHost) {
    this.sourceHost = sourceHost;
    return this;
  }

   /**
   * The source host for this worker.
   * @return sourceHost
  **/
  @ApiModelProperty(value = "The source host for this worker.")
  public String getSourceHost() {
    return sourceHost;
  }

  public void setSourceHost(String sourceHost) {
    this.sourceHost = sourceHost;
  }

  public SyncJobWorker targetHost(String targetHost) {
    this.targetHost = targetHost;
    return this;
  }

   /**
   * The target host for this worker.
   * @return targetHost
  **/
  @ApiModelProperty(value = "The target host for this worker.")
  public String getTargetHost() {
    return targetHost;
  }

  public void setTargetHost(String targetHost) {
    this.targetHost = targetHost;
  }

  public SyncJobWorker workerId(Integer workerId) {
    this.workerId = workerId;
    return this;
  }

   /**
   * The ID of the worker.
   * @return workerId
  **/
  @ApiModelProperty(value = "The ID of the worker.")
  public Integer getWorkerId() {
    return workerId;
  }

  public void setWorkerId(Integer workerId) {
    this.workerId = workerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncJobWorker syncJobWorker = (SyncJobWorker) o;
    return Objects.equals(this.connected, syncJobWorker.connected) &&
        Objects.equals(this.lastSplit, syncJobWorker.lastSplit) &&
        Objects.equals(this.lastWork, syncJobWorker.lastWork) &&
        Objects.equals(this.lin, syncJobWorker.lin) &&
        Objects.equals(this.lnn, syncJobWorker.lnn) &&
        Objects.equals(this.processId, syncJobWorker.processId) &&
        Objects.equals(this.sourceHost, syncJobWorker.sourceHost) &&
        Objects.equals(this.targetHost, syncJobWorker.targetHost) &&
        Objects.equals(this.workerId, syncJobWorker.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected, lastSplit, lastWork, lin, lnn, processId, sourceHost, targetHost, workerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncJobWorker {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    lastSplit: ").append(toIndentedString(lastSplit)).append("\n");
    sb.append("    lastWork: ").append(toIndentedString(lastWork)).append("\n");
    sb.append("    lin: ").append(toIndentedString(lin)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    sourceHost: ").append(toIndentedString(sourceHost)).append("\n");
    sb.append("    targetHost: ").append(toIndentedString(targetHost)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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
