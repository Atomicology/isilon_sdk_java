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
import io.swagger.client.model.ClusterFirmwareStatusNodeDevice;
import io.swagger.client.model.ClusterFirmwareStatusNodePackageItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterFirmwareStatusNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterFirmwareStatusNode {
  @SerializedName("devices")
  private List<ClusterFirmwareStatusNodeDevice> devices = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("node_unavailable")
  private Boolean nodeUnavailable = null;

  @SerializedName("package")
  private List<ClusterFirmwareStatusNodePackageItem> _package = null;

  public ClusterFirmwareStatusNode devices(List<ClusterFirmwareStatusNodeDevice> devices) {
    this.devices = devices;
    return this;
  }

  public ClusterFirmwareStatusNode addDevicesItem(ClusterFirmwareStatusNodeDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<ClusterFirmwareStatusNodeDevice>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * List of the firmware status for hardware components on the node.
   * @return devices
  **/
  @ApiModelProperty(value = "List of the firmware status for hardware components on the node.")
  public List<ClusterFirmwareStatusNodeDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<ClusterFirmwareStatusNodeDevice> devices) {
    this.devices = devices;
  }

  public ClusterFirmwareStatusNode lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * The lnn of the node.
   * @return lnn
  **/
  @ApiModelProperty(value = "The lnn of the node.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public ClusterFirmwareStatusNode nodeUnavailable(Boolean nodeUnavailable) {
    this.nodeUnavailable = nodeUnavailable;
    return this;
  }

   /**
   * Node is unavailable.
   * @return nodeUnavailable
  **/
  @ApiModelProperty(value = "Node is unavailable.")
  public Boolean isNodeUnavailable() {
    return nodeUnavailable;
  }

  public void setNodeUnavailable(Boolean nodeUnavailable) {
    this.nodeUnavailable = nodeUnavailable;
  }

  public ClusterFirmwareStatusNode _package(List<ClusterFirmwareStatusNodePackageItem> _package) {
    this._package = _package;
    return this;
  }

  public ClusterFirmwareStatusNode addPackageItem(ClusterFirmwareStatusNodePackageItem _packageItem) {
    if (this._package == null) {
      this._package = new ArrayList<ClusterFirmwareStatusNodePackageItem>();
    }
    this._package.add(_packageItem);
    return this;
  }

   /**
   * List of the firmware binary information for the installed firmware package.
   * @return _package
  **/
  @ApiModelProperty(value = "List of the firmware binary information for the installed firmware package.")
  public List<ClusterFirmwareStatusNodePackageItem> getPackage() {
    return _package;
  }

  public void setPackage(List<ClusterFirmwareStatusNodePackageItem> _package) {
    this._package = _package;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterFirmwareStatusNode clusterFirmwareStatusNode = (ClusterFirmwareStatusNode) o;
    return Objects.equals(this.devices, clusterFirmwareStatusNode.devices) &&
        Objects.equals(this.lnn, clusterFirmwareStatusNode.lnn) &&
        Objects.equals(this.nodeUnavailable, clusterFirmwareStatusNode.nodeUnavailable) &&
        Objects.equals(this._package, clusterFirmwareStatusNode._package);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, lnn, nodeUnavailable, _package);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterFirmwareStatusNode {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    nodeUnavailable: ").append(toIndentedString(nodeUnavailable)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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

