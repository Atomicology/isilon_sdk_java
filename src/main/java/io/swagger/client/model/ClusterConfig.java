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
import io.swagger.client.model.ClusterConfigDevice;
import io.swagger.client.model.ClusterConfigOnefsVersion;
import io.swagger.client.model.ClusterConfigTimezone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * General cluster information.
 */
@ApiModel(description = "General cluster information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterConfig {
  @SerializedName("description")
  private String description = null;

  @SerializedName("devices")
  private List<ClusterConfigDevice> devices = new ArrayList<ClusterConfigDevice>();

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("has_quorum")
  private Boolean hasQuorum = null;

  @SerializedName("is_compliance")
  private Boolean isCompliance = null;

  @SerializedName("is_virtual")
  private Boolean isVirtual = null;

  @SerializedName("is_vonefs")
  private Boolean isVonefs = null;

  @SerializedName("join_mode")
  private String joinMode = null;

  @SerializedName("local_devid")
  private Integer localDevid = null;

  @SerializedName("local_lnn")
  private Integer localLnn = null;

  @SerializedName("local_serial")
  private String localSerial = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("onefs_version")
  private ClusterConfigOnefsVersion onefsVersion = null;

  @SerializedName("timezone")
  private ClusterConfigTimezone timezone = null;

  @SerializedName("upgrade_type")
  private String upgradeType = null;

  public ClusterConfig description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Customer configurable description.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Customer configurable description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ClusterConfig devices(List<ClusterConfigDevice> devices) {
    this.devices = devices;
    return this;
  }

  public ClusterConfig addDevicesItem(ClusterConfigDevice devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ClusterConfigDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<ClusterConfigDevice> devices) {
    this.devices = devices;
  }

  public ClusterConfig encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Default encoding.
   * @return encoding
  **/
  @ApiModelProperty(required = true, value = "Default encoding.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public ClusterConfig guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Cluster GUID.
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "Cluster GUID.")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public ClusterConfig hasQuorum(Boolean hasQuorum) {
    this.hasQuorum = hasQuorum;
    return this;
  }

   /**
   * If true, the local node is in a group with quorum: It is communicating, storing, and protecting data normally with other nodes in its group.  Under normal circumstances, every node in the cluster is part of one group.
   * @return hasQuorum
  **/
  @ApiModelProperty(required = true, value = "If true, the local node is in a group with quorum: It is communicating, storing, and protecting data normally with other nodes in its group.  Under normal circumstances, every node in the cluster is part of one group.")
  public Boolean isHasQuorum() {
    return hasQuorum;
  }

  public void setHasQuorum(Boolean hasQuorum) {
    this.hasQuorum = hasQuorum;
  }

  public ClusterConfig isCompliance(Boolean isCompliance) {
    this.isCompliance = isCompliance;
    return this;
  }

   /**
   * If true, the cluster is in compliance mode.  Compliance mode clusters do not allow root access and have stricter WORM (Write Once Read Many) features for retaining data in compliance with U.S. Securities and Exchange Commission rule 17a-4.
   * @return isCompliance
  **/
  @ApiModelProperty(required = true, value = "If true, the cluster is in compliance mode.  Compliance mode clusters do not allow root access and have stricter WORM (Write Once Read Many) features for retaining data in compliance with U.S. Securities and Exchange Commission rule 17a-4.")
  public Boolean isIsCompliance() {
    return isCompliance;
  }

  public void setIsCompliance(Boolean isCompliance) {
    this.isCompliance = isCompliance;
  }

  public ClusterConfig isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

   /**
   * true if the cluster is deployed on a desktop VMWorkstation
   * @return isVirtual
  **/
  @ApiModelProperty(required = true, value = "true if the cluster is deployed on a desktop VMWorkstation")
  public Boolean isIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  public ClusterConfig isVonefs(Boolean isVonefs) {
    this.isVonefs = isVonefs;
    return this;
  }

   /**
   * true if this is a vOneFS cluster on an ESXi
   * @return isVonefs
  **/
  @ApiModelProperty(required = true, value = "true if this is a vOneFS cluster on an ESXi")
  public Boolean isIsVonefs() {
    return isVonefs;
  }

  public void setIsVonefs(Boolean isVonefs) {
    this.isVonefs = isVonefs;
  }

  public ClusterConfig joinMode(String joinMode) {
    this.joinMode = joinMode;
    return this;
  }

   /**
   * Node join mode: &#39;manual&#39; or &#39;secure&#39;.
   * @return joinMode
  **/
  @ApiModelProperty(required = true, value = "Node join mode: 'manual' or 'secure'.")
  public String getJoinMode() {
    return joinMode;
  }

  public void setJoinMode(String joinMode) {
    this.joinMode = joinMode;
  }

  public ClusterConfig localDevid(Integer localDevid) {
    this.localDevid = localDevid;
    return this;
  }

   /**
   * Device ID of the queried node.
   * @return localDevid
  **/
  @ApiModelProperty(required = true, value = "Device ID of the queried node.")
  public Integer getLocalDevid() {
    return localDevid;
  }

  public void setLocalDevid(Integer localDevid) {
    this.localDevid = localDevid;
  }

  public ClusterConfig localLnn(Integer localLnn) {
    this.localLnn = localLnn;
    return this;
  }

   /**
   * Device logical node number of the queried node.
   * @return localLnn
  **/
  @ApiModelProperty(required = true, value = "Device logical node number of the queried node.")
  public Integer getLocalLnn() {
    return localLnn;
  }

  public void setLocalLnn(Integer localLnn) {
    this.localLnn = localLnn;
  }

  public ClusterConfig localSerial(String localSerial) {
    this.localSerial = localSerial;
    return this;
  }

   /**
   * Device serial number of the queried node.
   * @return localSerial
  **/
  @ApiModelProperty(required = true, value = "Device serial number of the queried node.")
  public String getLocalSerial() {
    return localSerial;
  }

  public void setLocalSerial(String localSerial) {
    this.localSerial = localSerial;
  }

  public ClusterConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Cluster name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterConfig onefsVersion(ClusterConfigOnefsVersion onefsVersion) {
    this.onefsVersion = onefsVersion;
    return this;
  }

   /**
   * 
   * @return onefsVersion
  **/
  @ApiModelProperty(value = "")
  public ClusterConfigOnefsVersion getOnefsVersion() {
    return onefsVersion;
  }

  public void setOnefsVersion(ClusterConfigOnefsVersion onefsVersion) {
    this.onefsVersion = onefsVersion;
  }

  public ClusterConfig timezone(ClusterConfigTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The cluster timezone settings.
   * @return timezone
  **/
  @ApiModelProperty(value = "The cluster timezone settings.")
  public ClusterConfigTimezone getTimezone() {
    return timezone;
  }

  public void setTimezone(ClusterConfigTimezone timezone) {
    this.timezone = timezone;
  }

  public ClusterConfig upgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
    return this;
  }

   /**
   * Get upgradeType
   * @return upgradeType
  **/
  @ApiModelProperty(value = "")
  public String getUpgradeType() {
    return upgradeType;
  }

  public void setUpgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterConfig clusterConfig = (ClusterConfig) o;
    return Objects.equals(this.description, clusterConfig.description) &&
        Objects.equals(this.devices, clusterConfig.devices) &&
        Objects.equals(this.encoding, clusterConfig.encoding) &&
        Objects.equals(this.guid, clusterConfig.guid) &&
        Objects.equals(this.hasQuorum, clusterConfig.hasQuorum) &&
        Objects.equals(this.isCompliance, clusterConfig.isCompliance) &&
        Objects.equals(this.isVirtual, clusterConfig.isVirtual) &&
        Objects.equals(this.isVonefs, clusterConfig.isVonefs) &&
        Objects.equals(this.joinMode, clusterConfig.joinMode) &&
        Objects.equals(this.localDevid, clusterConfig.localDevid) &&
        Objects.equals(this.localLnn, clusterConfig.localLnn) &&
        Objects.equals(this.localSerial, clusterConfig.localSerial) &&
        Objects.equals(this.name, clusterConfig.name) &&
        Objects.equals(this.onefsVersion, clusterConfig.onefsVersion) &&
        Objects.equals(this.timezone, clusterConfig.timezone) &&
        Objects.equals(this.upgradeType, clusterConfig.upgradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, devices, encoding, guid, hasQuorum, isCompliance, isVirtual, isVonefs, joinMode, localDevid, localLnn, localSerial, name, onefsVersion, timezone, upgradeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterConfig {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    hasQuorum: ").append(toIndentedString(hasQuorum)).append("\n");
    sb.append("    isCompliance: ").append(toIndentedString(isCompliance)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    isVonefs: ").append(toIndentedString(isVonefs)).append("\n");
    sb.append("    joinMode: ").append(toIndentedString(joinMode)).append("\n");
    sb.append("    localDevid: ").append(toIndentedString(localDevid)).append("\n");
    sb.append("    localLnn: ").append(toIndentedString(localLnn)).append("\n");
    sb.append("    localSerial: ").append(toIndentedString(localSerial)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onefsVersion: ").append(toIndentedString(onefsVersion)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
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

