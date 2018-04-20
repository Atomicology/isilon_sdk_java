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
 * NodeDriveconfigNodeStall
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeDriveconfigNodeStall {
  @SerializedName("clear_time")
  private Integer clearTime = null;

  @SerializedName("diskscrub_stripes")
  private Integer diskscrubStripes = null;

  @SerializedName("max_error_frequency")
  private Integer maxErrorFrequency = null;

  @SerializedName("max_slow_access")
  private Integer maxSlowAccess = null;

  @SerializedName("max_slow_frequency")
  private Integer maxSlowFrequency = null;

  @SerializedName("max_total_stall_time")
  private Integer maxTotalStallTime = null;

  @SerializedName("scan_max_ecc_delay")
  private Integer scanMaxEccDelay = null;

  @SerializedName("scan_size")
  private Integer scanSize = null;

  @SerializedName("sleep")
  private Integer sleep = null;

  public NodeDriveconfigNodeStall clearTime(Integer clearTime) {
    this.clearTime = clearTime;
    return this;
  }

   /**
   * The amount of time in seconds with no stalls before ignoring previous stalls.
   * maximum: 4294967295
   * @return clearTime
  **/
  @ApiModelProperty(value = "The amount of time in seconds with no stalls before ignoring previous stalls.")
  public Integer getClearTime() {
    return clearTime;
  }

  public void setClearTime(Integer clearTime) {
    this.clearTime = clearTime;
  }

  public NodeDriveconfigNodeStall diskscrubStripes(Integer diskscrubStripes) {
    this.diskscrubStripes = diskscrubStripes;
    return this;
  }

   /**
   * Number of stripes to read during a diskscrub.
   * maximum: 4294967295
   * @return diskscrubStripes
  **/
  @ApiModelProperty(value = "Number of stripes to read during a diskscrub.")
  public Integer getDiskscrubStripes() {
    return diskscrubStripes;
  }

  public void setDiskscrubStripes(Integer diskscrubStripes) {
    this.diskscrubStripes = diskscrubStripes;
  }

  public NodeDriveconfigNodeStall maxErrorFrequency(Integer maxErrorFrequency) {
    this.maxErrorFrequency = maxErrorFrequency;
    return this;
  }

   /**
   * The number of errors during stalled drive disk exercises to cause the drive to be softfailed.
   * maximum: 4294967295
   * @return maxErrorFrequency
  **/
  @ApiModelProperty(value = "The number of errors during stalled drive disk exercises to cause the drive to be softfailed.")
  public Integer getMaxErrorFrequency() {
    return maxErrorFrequency;
  }

  public void setMaxErrorFrequency(Integer maxErrorFrequency) {
    this.maxErrorFrequency = maxErrorFrequency;
  }

  public NodeDriveconfigNodeStall maxSlowAccess(Integer maxSlowAccess) {
    this.maxSlowAccess = maxSlowAccess;
    return this;
  }

   /**
   * The number of slow accesses during stalled drive disk exercises to cause the drive to be softfailed.
   * maximum: 4294967295
   * @return maxSlowAccess
  **/
  @ApiModelProperty(value = "The number of slow accesses during stalled drive disk exercises to cause the drive to be softfailed.")
  public Integer getMaxSlowAccess() {
    return maxSlowAccess;
  }

  public void setMaxSlowAccess(Integer maxSlowAccess) {
    this.maxSlowAccess = maxSlowAccess;
  }

  public NodeDriveconfigNodeStall maxSlowFrequency(Integer maxSlowFrequency) {
    this.maxSlowFrequency = maxSlowFrequency;
    return this;
  }

   /**
   * The number of slow frequency triggers during stalled drive disk exercises to cause the drive to be softfailed.
   * maximum: 4294967295
   * @return maxSlowFrequency
  **/
  @ApiModelProperty(value = "The number of slow frequency triggers during stalled drive disk exercises to cause the drive to be softfailed.")
  public Integer getMaxSlowFrequency() {
    return maxSlowFrequency;
  }

  public void setMaxSlowFrequency(Integer maxSlowFrequency) {
    this.maxSlowFrequency = maxSlowFrequency;
  }

  public NodeDriveconfigNodeStall maxTotalStallTime(Integer maxTotalStallTime) {
    this.maxTotalStallTime = maxTotalStallTime;
    return this;
  }

   /**
   * The maximum amount of time, in seconds, to remain stalled before softfailing the drive.
   * maximum: 4294967295
   * @return maxTotalStallTime
  **/
  @ApiModelProperty(value = "The maximum amount of time, in seconds, to remain stalled before softfailing the drive.")
  public Integer getMaxTotalStallTime() {
    return maxTotalStallTime;
  }

  public void setMaxTotalStallTime(Integer maxTotalStallTime) {
    this.maxTotalStallTime = maxTotalStallTime;
  }

  public NodeDriveconfigNodeStall scanMaxEccDelay(Integer scanMaxEccDelay) {
    this.scanMaxEccDelay = scanMaxEccDelay;
    return this;
  }

   /**
   * Maximum delay in seconds after an ECC correction during a scan.
   * maximum: 4294967295
   * @return scanMaxEccDelay
  **/
  @ApiModelProperty(value = "Maximum delay in seconds after an ECC correction during a scan.")
  public Integer getScanMaxEccDelay() {
    return scanMaxEccDelay;
  }

  public void setScanMaxEccDelay(Integer scanMaxEccDelay) {
    this.scanMaxEccDelay = scanMaxEccDelay;
  }

  public NodeDriveconfigNodeStall scanSize(Integer scanSize) {
    this.scanSize = scanSize;
    return this;
  }

   /**
   * Total bytes of error-free reads to complete a scan.
   * maximum: 4294967295
   * @return scanSize
  **/
  @ApiModelProperty(value = "Total bytes of error-free reads to complete a scan.")
  public Integer getScanSize() {
    return scanSize;
  }

  public void setScanSize(Integer scanSize) {
    this.scanSize = scanSize;
  }

  public NodeDriveconfigNodeStall sleep(Integer sleep) {
    this.sleep = sleep;
    return this;
  }

   /**
   * Delay in seconds between evaluations.
   * maximum: 4294967295
   * @return sleep
  **/
  @ApiModelProperty(value = "Delay in seconds between evaluations.")
  public Integer getSleep() {
    return sleep;
  }

  public void setSleep(Integer sleep) {
    this.sleep = sleep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDriveconfigNodeStall nodeDriveconfigNodeStall = (NodeDriveconfigNodeStall) o;
    return Objects.equals(this.clearTime, nodeDriveconfigNodeStall.clearTime) &&
        Objects.equals(this.diskscrubStripes, nodeDriveconfigNodeStall.diskscrubStripes) &&
        Objects.equals(this.maxErrorFrequency, nodeDriveconfigNodeStall.maxErrorFrequency) &&
        Objects.equals(this.maxSlowAccess, nodeDriveconfigNodeStall.maxSlowAccess) &&
        Objects.equals(this.maxSlowFrequency, nodeDriveconfigNodeStall.maxSlowFrequency) &&
        Objects.equals(this.maxTotalStallTime, nodeDriveconfigNodeStall.maxTotalStallTime) &&
        Objects.equals(this.scanMaxEccDelay, nodeDriveconfigNodeStall.scanMaxEccDelay) &&
        Objects.equals(this.scanSize, nodeDriveconfigNodeStall.scanSize) &&
        Objects.equals(this.sleep, nodeDriveconfigNodeStall.sleep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearTime, diskscrubStripes, maxErrorFrequency, maxSlowAccess, maxSlowFrequency, maxTotalStallTime, scanMaxEccDelay, scanSize, sleep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDriveconfigNodeStall {\n");
    
    sb.append("    clearTime: ").append(toIndentedString(clearTime)).append("\n");
    sb.append("    diskscrubStripes: ").append(toIndentedString(diskscrubStripes)).append("\n");
    sb.append("    maxErrorFrequency: ").append(toIndentedString(maxErrorFrequency)).append("\n");
    sb.append("    maxSlowAccess: ").append(toIndentedString(maxSlowAccess)).append("\n");
    sb.append("    maxSlowFrequency: ").append(toIndentedString(maxSlowFrequency)).append("\n");
    sb.append("    maxTotalStallTime: ").append(toIndentedString(maxTotalStallTime)).append("\n");
    sb.append("    scanMaxEccDelay: ").append(toIndentedString(scanMaxEccDelay)).append("\n");
    sb.append("    scanSize: ").append(toIndentedString(scanSize)).append("\n");
    sb.append("    sleep: ").append(toIndentedString(sleep)).append("\n");
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

