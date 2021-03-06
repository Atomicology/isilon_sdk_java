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
import io.swagger.client.model.NodeStatusNodeBatterystatus;
import io.swagger.client.model.NodeStatusNodeCapacityItem;
import io.swagger.client.model.NodeStatusNodeCpu;
import io.swagger.client.model.NodeStatusNodeNvram;
import io.swagger.client.model.NodeStatusNodePowersupplies;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeStatusNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeStatusNode {
  @SerializedName("batterystatus")
  private NodeStatusNodeBatterystatus batterystatus = null;

  @SerializedName("capacity")
  private List<NodeStatusNodeCapacityItem> capacity = null;

  @SerializedName("cpu")
  private NodeStatusNodeCpu cpu = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("nvram")
  private NodeStatusNodeNvram nvram = null;

  @SerializedName("powersupplies")
  private NodeStatusNodePowersupplies powersupplies = null;

  @SerializedName("release")
  private String release = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("uptime")
  private Integer uptime = null;

  @SerializedName("version")
  private String version = null;

  public NodeStatusNode batterystatus(NodeStatusNodeBatterystatus batterystatus) {
    this.batterystatus = batterystatus;
    return this;
  }

   /**
   * Battery status information.
   * @return batterystatus
  **/
  @ApiModelProperty(value = "Battery status information.")
  public NodeStatusNodeBatterystatus getBatterystatus() {
    return batterystatus;
  }

  public void setBatterystatus(NodeStatusNodeBatterystatus batterystatus) {
    this.batterystatus = batterystatus;
  }

  public NodeStatusNode capacity(List<NodeStatusNodeCapacityItem> capacity) {
    this.capacity = capacity;
    return this;
  }

  public NodeStatusNode addCapacityItem(NodeStatusNodeCapacityItem capacityItem) {
    if (this.capacity == null) {
      this.capacity = new ArrayList<NodeStatusNodeCapacityItem>();
    }
    this.capacity.add(capacityItem);
    return this;
  }

   /**
   * Storage capacity of this node.
   * @return capacity
  **/
  @ApiModelProperty(value = "Storage capacity of this node.")
  public List<NodeStatusNodeCapacityItem> getCapacity() {
    return capacity;
  }

  public void setCapacity(List<NodeStatusNodeCapacityItem> capacity) {
    this.capacity = capacity;
  }

  public NodeStatusNode cpu(NodeStatusNodeCpu cpu) {
    this.cpu = cpu;
    return this;
  }

   /**
   * CPU status information for this node.
   * @return cpu
  **/
  @ApiModelProperty(value = "CPU status information for this node.")
  public NodeStatusNodeCpu getCpu() {
    return cpu;
  }

  public void setCpu(NodeStatusNodeCpu cpu) {
    this.cpu = cpu;
  }

  public NodeStatusNode error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message, if the HTTP status returned from this node was not 200.
   * @return error
  **/
  @ApiModelProperty(value = "Error message, if the HTTP status returned from this node was not 200.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public NodeStatusNode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID of the node reporting this information.
   * minimum: 0
   * maximum: 4294967295
   * @return id
  **/
  @ApiModelProperty(value = "Node ID of the node reporting this information.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NodeStatusNode lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * Logical node number of the node reporting this information.
   * minimum: 0
   * maximum: 4294967295
   * @return lnn
  **/
  @ApiModelProperty(value = "Logical node number of the node reporting this information.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public NodeStatusNode nvram(NodeStatusNodeNvram nvram) {
    this.nvram = nvram;
    return this;
  }

   /**
   * Node NVRAM information.
   * @return nvram
  **/
  @ApiModelProperty(value = "Node NVRAM information.")
  public NodeStatusNodeNvram getNvram() {
    return nvram;
  }

  public void setNvram(NodeStatusNodeNvram nvram) {
    this.nvram = nvram;
  }

  public NodeStatusNode powersupplies(NodeStatusNodePowersupplies powersupplies) {
    this.powersupplies = powersupplies;
    return this;
  }

   /**
   * Information about this node&#39;s power supplies.
   * @return powersupplies
  **/
  @ApiModelProperty(value = "Information about this node's power supplies.")
  public NodeStatusNodePowersupplies getPowersupplies() {
    return powersupplies;
  }

  public void setPowersupplies(NodeStatusNodePowersupplies powersupplies) {
    this.powersupplies = powersupplies;
  }

  public NodeStatusNode release(String release) {
    this.release = release;
    return this;
  }

   /**
   * OneFS release.
   * @return release
  **/
  @ApiModelProperty(value = "OneFS release.")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }

  public NodeStatusNode status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the HTTP response from this node if not 200.  If 200, this field does not appear.
   * minimum: 0
   * maximum: 4294967295
   * @return status
  **/
  @ApiModelProperty(value = "Status of the HTTP response from this node if not 200.  If 200, this field does not appear.")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public NodeStatusNode uptime(Integer uptime) {
    this.uptime = uptime;
    return this;
  }

   /**
   * Seconds this node has been online.
   * @return uptime
  **/
  @ApiModelProperty(value = "Seconds this node has been online.")
  public Integer getUptime() {
    return uptime;
  }

  public void setUptime(Integer uptime) {
    this.uptime = uptime;
  }

  public NodeStatusNode version(String version) {
    this.version = version;
    return this;
  }

   /**
   * OneFS version.
   * @return version
  **/
  @ApiModelProperty(value = "OneFS version.")
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
    NodeStatusNode nodeStatusNode = (NodeStatusNode) o;
    return Objects.equals(this.batterystatus, nodeStatusNode.batterystatus) &&
        Objects.equals(this.capacity, nodeStatusNode.capacity) &&
        Objects.equals(this.cpu, nodeStatusNode.cpu) &&
        Objects.equals(this.error, nodeStatusNode.error) &&
        Objects.equals(this.id, nodeStatusNode.id) &&
        Objects.equals(this.lnn, nodeStatusNode.lnn) &&
        Objects.equals(this.nvram, nodeStatusNode.nvram) &&
        Objects.equals(this.powersupplies, nodeStatusNode.powersupplies) &&
        Objects.equals(this.release, nodeStatusNode.release) &&
        Objects.equals(this.status, nodeStatusNode.status) &&
        Objects.equals(this.uptime, nodeStatusNode.uptime) &&
        Objects.equals(this.version, nodeStatusNode.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batterystatus, capacity, cpu, error, id, lnn, nvram, powersupplies, release, status, uptime, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusNode {\n");
    
    sb.append("    batterystatus: ").append(toIndentedString(batterystatus)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    nvram: ").append(toIndentedString(nvram)).append("\n");
    sb.append("    powersupplies: ").append(toIndentedString(powersupplies)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
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

