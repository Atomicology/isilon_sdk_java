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
 * DrivesDriveFirmwareUpdateNodeStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class DrivesDriveFirmwareUpdateNodeStatus {
  @SerializedName("failed")
  private Integer failed = null;

  @SerializedName("finish_time")
  private String finishTime = null;

  @SerializedName("remaining")
  private Integer remaining = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated")
  private Integer updated = null;

  public DrivesDriveFirmwareUpdateNodeStatus failed(Integer failed) {
    this.failed = failed;
    return this;
  }

   /**
   * The number of drives that did not successfully complete firmware updates update on the node.
   * @return failed
  **/
  @ApiModelProperty(value = "The number of drives that did not successfully complete firmware updates update on the node.")
  public Integer getFailed() {
    return failed;
  }

  public void setFailed(Integer failed) {
    this.failed = failed;
  }

  public DrivesDriveFirmwareUpdateNodeStatus finishTime(String finishTime) {
    this.finishTime = finishTime;
    return this;
  }

   /**
   * Time when drive firmware update finished on node.
   * @return finishTime
  **/
  @ApiModelProperty(value = "Time when drive firmware update finished on node.")
  public String getFinishTime() {
    return finishTime;
  }

  public void setFinishTime(String finishTime) {
    this.finishTime = finishTime;
  }

  public DrivesDriveFirmwareUpdateNodeStatus remaining(Integer remaining) {
    this.remaining = remaining;
    return this;
  }

   /**
   * Number of drives remaining to be updated on node.
   * @return remaining
  **/
  @ApiModelProperty(value = "Number of drives remaining to be updated on node.")
  public Integer getRemaining() {
    return remaining;
  }

  public void setRemaining(Integer remaining) {
    this.remaining = remaining;
  }

  public DrivesDriveFirmwareUpdateNodeStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time when drive firmware update started on node.
   * @return startTime
  **/
  @ApiModelProperty(value = "Time when drive firmware update started on node.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DrivesDriveFirmwareUpdateNodeStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Overall status of this nodes firmware updates.
   * @return status
  **/
  @ApiModelProperty(value = "Overall status of this nodes firmware updates.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DrivesDriveFirmwareUpdateNodeStatus updated(Integer updated) {
    this.updated = updated;
    return this;
  }

   /**
   * The number of drives that completed firmware updates on the node.
   * @return updated
  **/
  @ApiModelProperty(value = "The number of drives that completed firmware updates on the node.")
  public Integer getUpdated() {
    return updated;
  }

  public void setUpdated(Integer updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivesDriveFirmwareUpdateNodeStatus drivesDriveFirmwareUpdateNodeStatus = (DrivesDriveFirmwareUpdateNodeStatus) o;
    return Objects.equals(this.failed, drivesDriveFirmwareUpdateNodeStatus.failed) &&
        Objects.equals(this.finishTime, drivesDriveFirmwareUpdateNodeStatus.finishTime) &&
        Objects.equals(this.remaining, drivesDriveFirmwareUpdateNodeStatus.remaining) &&
        Objects.equals(this.startTime, drivesDriveFirmwareUpdateNodeStatus.startTime) &&
        Objects.equals(this.status, drivesDriveFirmwareUpdateNodeStatus.status) &&
        Objects.equals(this.updated, drivesDriveFirmwareUpdateNodeStatus.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, finishTime, remaining, startTime, status, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivesDriveFirmwareUpdateNodeStatus {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

