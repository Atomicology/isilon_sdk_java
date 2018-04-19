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
import io.swagger.client.model.NodeHardwareFastNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeHardwareFast
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NodeHardwareFast {
  @SerializedName("nodes")
  private List<NodeHardwareFastNode> nodes = null;

  @SerializedName("total")
  private Integer total = null;

  public NodeHardwareFast nodes(List<NodeHardwareFastNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public NodeHardwareFast addNodesItem(NodeHardwareFastNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeHardwareFastNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public List<NodeHardwareFastNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeHardwareFastNode> nodes) {
    this.nodes = nodes;
  }

  public NodeHardwareFast total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeHardwareFast nodeHardwareFast = (NodeHardwareFast) o;
    return Objects.equals(this.nodes, nodeHardwareFast.nodes) &&
        Objects.equals(this.total, nodeHardwareFast.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeHardwareFast {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

