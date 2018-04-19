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
 * ClusterFirmwareStatusNodeDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterFirmwareStatusNodeDevice {
  @SerializedName("device")
  private String device = null;

  @SerializedName("mismatch")
  private Boolean mismatch = null;

  @SerializedName("target_version")
  private String targetVersion = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("upgrade_status")
  private String upgradeStatus = null;

  @SerializedName("version")
  private String version = null;

  public ClusterFirmwareStatusNodeDevice device(String device) {
    this.device = device;
    return this;
  }

   /**
   * The name of the device.
   * @return device
  **/
  @ApiModelProperty(value = "The name of the device.")
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public ClusterFirmwareStatusNodeDevice mismatch(Boolean mismatch) {
    this.mismatch = mismatch;
    return this;
  }

   /**
   * Is the firmware up-to-date for this component.
   * @return mismatch
  **/
  @ApiModelProperty(value = "Is the firmware up-to-date for this component.")
  public Boolean isMismatch() {
    return mismatch;
  }

  public void setMismatch(Boolean mismatch) {
    this.mismatch = mismatch;
  }

  public ClusterFirmwareStatusNodeDevice targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

   /**
   * The target firmware version.
   * @return targetVersion
  **/
  @ApiModelProperty(value = "The target firmware version.")
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public ClusterFirmwareStatusNodeDevice type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The device type.
   * @return type
  **/
  @ApiModelProperty(value = "The device type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ClusterFirmwareStatusNodeDevice upgradeStatus(String upgradeStatus) {
    this.upgradeStatus = upgradeStatus;
    return this;
  }

   /**
   * The current state of the firmware upgrade for this component. One of the following values: &#39;queued&#39;, &#39;upgrading&#39;, &#39;upgraded&#39;, &#39;error&#39;. or &#39;null&#39;.&#39;null&#39; indicates that the upgrade status is unknown.
   * @return upgradeStatus
  **/
  @ApiModelProperty(value = "The current state of the firmware upgrade for this component. One of the following values: 'queued', 'upgrading', 'upgraded', 'error'. or 'null'.'null' indicates that the upgrade status is unknown.")
  public String getUpgradeStatus() {
    return upgradeStatus;
  }

  public void setUpgradeStatus(String upgradeStatus) {
    this.upgradeStatus = upgradeStatus;
  }

  public ClusterFirmwareStatusNodeDevice version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The current firmware version.
   * @return version
  **/
  @ApiModelProperty(value = "The current firmware version.")
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
    ClusterFirmwareStatusNodeDevice clusterFirmwareStatusNodeDevice = (ClusterFirmwareStatusNodeDevice) o;
    return Objects.equals(this.device, clusterFirmwareStatusNodeDevice.device) &&
        Objects.equals(this.mismatch, clusterFirmwareStatusNodeDevice.mismatch) &&
        Objects.equals(this.targetVersion, clusterFirmwareStatusNodeDevice.targetVersion) &&
        Objects.equals(this.type, clusterFirmwareStatusNodeDevice.type) &&
        Objects.equals(this.upgradeStatus, clusterFirmwareStatusNodeDevice.upgradeStatus) &&
        Objects.equals(this.version, clusterFirmwareStatusNodeDevice.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, mismatch, targetVersion, type, upgradeStatus, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterFirmwareStatusNodeDevice {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    mismatch: ").append(toIndentedString(mismatch)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upgradeStatus: ").append(toIndentedString(upgradeStatus)).append("\n");
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

