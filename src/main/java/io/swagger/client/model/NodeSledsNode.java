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
import io.swagger.client.model.NodeSledsNodeSled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeSledsNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NodeSledsNode {
  @SerializedName("error")
  private String error = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("sleds")
  private List<NodeSledsNodeSled> sleds = null;

  @SerializedName("status")
  private Integer status = null;

  public NodeSledsNode error(String error) {
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

  public NodeSledsNode id(Integer id) {
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

  public NodeSledsNode lnn(Integer lnn) {
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

  public NodeSledsNode sleds(List<NodeSledsNodeSled> sleds) {
    this.sleds = sleds;
    return this;
  }

  public NodeSledsNode addSledsItem(NodeSledsNodeSled sledsItem) {
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

  public NodeSledsNode status(Integer status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSledsNode nodeSledsNode = (NodeSledsNode) o;
    return Objects.equals(this.error, nodeSledsNode.error) &&
        Objects.equals(this.id, nodeSledsNode.id) &&
        Objects.equals(this.lnn, nodeSledsNode.lnn) &&
        Objects.equals(this.sleds, nodeSledsNode.sleds) &&
        Objects.equals(this.status, nodeSledsNode.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, id, lnn, sleds, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSledsNode {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    sleds: ").append(toIndentedString(sleds)).append("\n");
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

