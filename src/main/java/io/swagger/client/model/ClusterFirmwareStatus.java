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
import io.swagger.client.model.ClusterFirmwareStatusNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The firmware status for the cluster.
 */
@ApiModel(description = "The firmware status for the cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterFirmwareStatus {
  @SerializedName("nodes")
  private List<ClusterFirmwareStatusNode> nodes = null;

  public ClusterFirmwareStatus nodes(List<ClusterFirmwareStatusNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public ClusterFirmwareStatus addNodesItem(ClusterFirmwareStatusNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<ClusterFirmwareStatusNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * List of the firmware status information for all the nodes in the cluster.
   * @return nodes
  **/
  @ApiModelProperty(value = "List of the firmware status information for all the nodes in the cluster.")
  public List<ClusterFirmwareStatusNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<ClusterFirmwareStatusNode> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterFirmwareStatus clusterFirmwareStatus = (ClusterFirmwareStatus) o;
    return Objects.equals(this.nodes, clusterFirmwareStatus.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterFirmwareStatus {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

