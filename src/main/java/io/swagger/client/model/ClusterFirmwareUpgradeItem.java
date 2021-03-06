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
import java.util.ArrayList;
import java.util.List;

/**
 * The settings necessary to start a firmware upgrade.
 */
@ApiModel(description = "The settings necessary to start a firmware upgrade.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterFirmwareUpgradeItem {
  @SerializedName("exclude_device")
  private String excludeDevice = null;

  @SerializedName("exclude_type")
  private String excludeType = null;

  @SerializedName("include_device")
  private String includeDevice = null;

  @SerializedName("include_type")
  private String includeType = null;

  @SerializedName("no_burn")
  private Boolean noBurn = null;

  @SerializedName("no_reboot")
  private Boolean noReboot = null;

  @SerializedName("no_verify")
  private Boolean noVerify = null;

  @SerializedName("nodes_to_upgrade")
  private List<Integer> nodesToUpgrade = null;

  public ClusterFirmwareUpgradeItem excludeDevice(String excludeDevice) {
    this.excludeDevice = excludeDevice;
    return this;
  }

   /**
   * Exclude the specified devices in the firmware upgrade.
   * @return excludeDevice
  **/
  @ApiModelProperty(value = "Exclude the specified devices in the firmware upgrade.")
  public String getExcludeDevice() {
    return excludeDevice;
  }

  public void setExcludeDevice(String excludeDevice) {
    this.excludeDevice = excludeDevice;
  }

  public ClusterFirmwareUpgradeItem excludeType(String excludeType) {
    this.excludeType = excludeType;
    return this;
  }

   /**
   * Exclude the specified device type in the firmware upgrade.
   * @return excludeType
  **/
  @ApiModelProperty(value = "Exclude the specified device type in the firmware upgrade.")
  public String getExcludeType() {
    return excludeType;
  }

  public void setExcludeType(String excludeType) {
    this.excludeType = excludeType;
  }

  public ClusterFirmwareUpgradeItem includeDevice(String includeDevice) {
    this.includeDevice = includeDevice;
    return this;
  }

   /**
   * Include the specified devices in the firmware upgrade.
   * @return includeDevice
  **/
  @ApiModelProperty(value = "Include the specified devices in the firmware upgrade.")
  public String getIncludeDevice() {
    return includeDevice;
  }

  public void setIncludeDevice(String includeDevice) {
    this.includeDevice = includeDevice;
  }

  public ClusterFirmwareUpgradeItem includeType(String includeType) {
    this.includeType = includeType;
    return this;
  }

   /**
   * Include the specified device type in the firmware upgrade.
   * @return includeType
  **/
  @ApiModelProperty(value = "Include the specified device type in the firmware upgrade.")
  public String getIncludeType() {
    return includeType;
  }

  public void setIncludeType(String includeType) {
    this.includeType = includeType;
  }

  public ClusterFirmwareUpgradeItem noBurn(Boolean noBurn) {
    this.noBurn = noBurn;
    return this;
  }

   /**
   * Do not burn the firmware.
   * @return noBurn
  **/
  @ApiModelProperty(value = "Do not burn the firmware.")
  public Boolean isNoBurn() {
    return noBurn;
  }

  public void setNoBurn(Boolean noBurn) {
    this.noBurn = noBurn;
  }

  public ClusterFirmwareUpgradeItem noReboot(Boolean noReboot) {
    this.noReboot = noReboot;
    return this;
  }

   /**
   * Do not reboot the node after an upgrade
   * @return noReboot
  **/
  @ApiModelProperty(value = "Do not reboot the node after an upgrade")
  public Boolean isNoReboot() {
    return noReboot;
  }

  public void setNoReboot(Boolean noReboot) {
    this.noReboot = noReboot;
  }

  public ClusterFirmwareUpgradeItem noVerify(Boolean noVerify) {
    this.noVerify = noVerify;
    return this;
  }

   /**
   * Do not verify the firmware upgrade after an upgrade.
   * @return noVerify
  **/
  @ApiModelProperty(value = "Do not verify the firmware upgrade after an upgrade.")
  public Boolean isNoVerify() {
    return noVerify;
  }

  public void setNoVerify(Boolean noVerify) {
    this.noVerify = noVerify;
  }

  public ClusterFirmwareUpgradeItem nodesToUpgrade(List<Integer> nodesToUpgrade) {
    this.nodesToUpgrade = nodesToUpgrade;
    return this;
  }

  public ClusterFirmwareUpgradeItem addNodesToUpgradeItem(Integer nodesToUpgradeItem) {
    if (this.nodesToUpgrade == null) {
      this.nodesToUpgrade = new ArrayList<Integer>();
    }
    this.nodesToUpgrade.add(nodesToUpgradeItem);
    return this;
  }

   /**
   * The nodes scheduled for upgrade. Order in array determines queue position number. &#39;All&#39; and null option will upgrade all nodes in &lt;lnn&gt; order.
   * @return nodesToUpgrade
  **/
  @ApiModelProperty(value = "The nodes scheduled for upgrade. Order in array determines queue position number. 'All' and null option will upgrade all nodes in <lnn> order.")
  public List<Integer> getNodesToUpgrade() {
    return nodesToUpgrade;
  }

  public void setNodesToUpgrade(List<Integer> nodesToUpgrade) {
    this.nodesToUpgrade = nodesToUpgrade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterFirmwareUpgradeItem clusterFirmwareUpgradeItem = (ClusterFirmwareUpgradeItem) o;
    return Objects.equals(this.excludeDevice, clusterFirmwareUpgradeItem.excludeDevice) &&
        Objects.equals(this.excludeType, clusterFirmwareUpgradeItem.excludeType) &&
        Objects.equals(this.includeDevice, clusterFirmwareUpgradeItem.includeDevice) &&
        Objects.equals(this.includeType, clusterFirmwareUpgradeItem.includeType) &&
        Objects.equals(this.noBurn, clusterFirmwareUpgradeItem.noBurn) &&
        Objects.equals(this.noReboot, clusterFirmwareUpgradeItem.noReboot) &&
        Objects.equals(this.noVerify, clusterFirmwareUpgradeItem.noVerify) &&
        Objects.equals(this.nodesToUpgrade, clusterFirmwareUpgradeItem.nodesToUpgrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeDevice, excludeType, includeDevice, includeType, noBurn, noReboot, noVerify, nodesToUpgrade);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterFirmwareUpgradeItem {\n");
    
    sb.append("    excludeDevice: ").append(toIndentedString(excludeDevice)).append("\n");
    sb.append("    excludeType: ").append(toIndentedString(excludeType)).append("\n");
    sb.append("    includeDevice: ").append(toIndentedString(includeDevice)).append("\n");
    sb.append("    includeType: ").append(toIndentedString(includeType)).append("\n");
    sb.append("    noBurn: ").append(toIndentedString(noBurn)).append("\n");
    sb.append("    noReboot: ").append(toIndentedString(noReboot)).append("\n");
    sb.append("    noVerify: ").append(toIndentedString(noVerify)).append("\n");
    sb.append("    nodesToUpgrade: ").append(toIndentedString(nodesToUpgrade)).append("\n");
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

