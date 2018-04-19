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
import io.swagger.client.model.ClusterNodeDriveDConfig;
import io.swagger.client.model.ClusterNodeHardware;
import io.swagger.client.model.ClusterNodePartitions;
import io.swagger.client.model.ClusterNodeSensors;
import io.swagger.client.model.ClusterNodeStateExtended;
import io.swagger.client.model.ClusterNodeStatus;
import io.swagger.client.model.NodeDrivesNodeDrive;
import io.swagger.client.model.NodeSledsNodeSled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterNodeExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterNodeExtended {
  @SerializedName("drive_d_config")
  private ClusterNodeDriveDConfig driveDConfig = null;

  @SerializedName("drives")
  private List<NodeDrivesNodeDrive> drives = null;

  @SerializedName("hardware")
  private ClusterNodeHardware hardware = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("partitions")
  private ClusterNodePartitions partitions = null;

  @SerializedName("sensors")
  private ClusterNodeSensors sensors = null;

  @SerializedName("sleds")
  private List<NodeSledsNodeSled> sleds = null;

  @SerializedName("state")
  private ClusterNodeStateExtended state = null;

  @SerializedName("status")
  private ClusterNodeStatus status = null;

  public ClusterNodeExtended driveDConfig(ClusterNodeDriveDConfig driveDConfig) {
    this.driveDConfig = driveDConfig;
    return this;
  }

   /**
   * An object containing a node&#39;s drive subsystem XML configuration file.
   * @return driveDConfig
  **/
  @ApiModelProperty(value = "An object containing a node's drive subsystem XML configuration file.")
  public ClusterNodeDriveDConfig getDriveDConfig() {
    return driveDConfig;
  }

  public void setDriveDConfig(ClusterNodeDriveDConfig driveDConfig) {
    this.driveDConfig = driveDConfig;
  }

  public ClusterNodeExtended drives(List<NodeDrivesNodeDrive> drives) {
    this.drives = drives;
    return this;
  }

  public ClusterNodeExtended addDrivesItem(NodeDrivesNodeDrive drivesItem) {
    if (this.drives == null) {
      this.drives = new ArrayList<NodeDrivesNodeDrive>();
    }
    this.drives.add(drivesItem);
    return this;
  }

   /**
   * List of the drives in this node.
   * @return drives
  **/
  @ApiModelProperty(value = "List of the drives in this node.")
  public List<NodeDrivesNodeDrive> getDrives() {
    return drives;
  }

  public void setDrives(List<NodeDrivesNodeDrive> drives) {
    this.drives = drives;
  }

  public ClusterNodeExtended hardware(ClusterNodeHardware hardware) {
    this.hardware = hardware;
    return this;
  }

   /**
   * Node hardware identifying information (static).
   * @return hardware
  **/
  @ApiModelProperty(value = "Node hardware identifying information (static).")
  public ClusterNodeHardware getHardware() {
    return hardware;
  }

  public void setHardware(ClusterNodeHardware hardware) {
    this.hardware = hardware;
  }

  public ClusterNodeExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID (Device Number) of this node.
   * @return id
  **/
  @ApiModelProperty(value = "Node ID (Device Number) of this node.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ClusterNodeExtended lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * Logical Node Number (LNN) of this node.
   * @return lnn
  **/
  @ApiModelProperty(value = "Logical Node Number (LNN) of this node.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public ClusterNodeExtended partitions(ClusterNodePartitions partitions) {
    this.partitions = partitions;
    return this;
  }

   /**
   * Node partition information.
   * @return partitions
  **/
  @ApiModelProperty(value = "Node partition information.")
  public ClusterNodePartitions getPartitions() {
    return partitions;
  }

  public void setPartitions(ClusterNodePartitions partitions) {
    this.partitions = partitions;
  }

  public ClusterNodeExtended sensors(ClusterNodeSensors sensors) {
    this.sensors = sensors;
    return this;
  }

   /**
   * Node sensor information (hardware reported).
   * @return sensors
  **/
  @ApiModelProperty(value = "Node sensor information (hardware reported).")
  public ClusterNodeSensors getSensors() {
    return sensors;
  }

  public void setSensors(ClusterNodeSensors sensors) {
    this.sensors = sensors;
  }

  public ClusterNodeExtended sleds(List<NodeSledsNodeSled> sleds) {
    this.sleds = sleds;
    return this;
  }

  public ClusterNodeExtended addSledsItem(NodeSledsNodeSled sledsItem) {
    if (this.sleds == null) {
      this.sleds = new ArrayList<NodeSledsNodeSled>();
    }
    this.sleds.add(sledsItem);
    return this;
  }

   /**
   * List of the sleds in this node.
   * @return sleds
  **/
  @ApiModelProperty(value = "List of the sleds in this node.")
  public List<NodeSledsNodeSled> getSleds() {
    return sleds;
  }

  public void setSleds(List<NodeSledsNodeSled> sleds) {
    this.sleds = sleds;
  }

  public ClusterNodeExtended state(ClusterNodeStateExtended state) {
    this.state = state;
    return this;
  }

   /**
   * Node state information (reported and modifiable).
   * @return state
  **/
  @ApiModelProperty(value = "Node state information (reported and modifiable).")
  public ClusterNodeStateExtended getState() {
    return state;
  }

  public void setState(ClusterNodeStateExtended state) {
    this.state = state;
  }

  public ClusterNodeExtended status(ClusterNodeStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Node status information (hardware reported).
   * @return status
  **/
  @ApiModelProperty(value = "Node status information (hardware reported).")
  public ClusterNodeStatus getStatus() {
    return status;
  }

  public void setStatus(ClusterNodeStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodeExtended clusterNodeExtended = (ClusterNodeExtended) o;
    return Objects.equals(this.driveDConfig, clusterNodeExtended.driveDConfig) &&
        Objects.equals(this.drives, clusterNodeExtended.drives) &&
        Objects.equals(this.hardware, clusterNodeExtended.hardware) &&
        Objects.equals(this.id, clusterNodeExtended.id) &&
        Objects.equals(this.lnn, clusterNodeExtended.lnn) &&
        Objects.equals(this.partitions, clusterNodeExtended.partitions) &&
        Objects.equals(this.sensors, clusterNodeExtended.sensors) &&
        Objects.equals(this.sleds, clusterNodeExtended.sleds) &&
        Objects.equals(this.state, clusterNodeExtended.state) &&
        Objects.equals(this.status, clusterNodeExtended.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driveDConfig, drives, hardware, id, lnn, partitions, sensors, sleds, state, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodeExtended {\n");
    
    sb.append("    driveDConfig: ").append(toIndentedString(driveDConfig)).append("\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    sleds: ").append(toIndentedString(sleds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

