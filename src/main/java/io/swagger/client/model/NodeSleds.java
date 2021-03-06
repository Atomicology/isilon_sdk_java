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
import io.swagger.client.model.NodeDrivesPurposelistError;
import io.swagger.client.model.NodeSledsNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeSleds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeSleds {
  @SerializedName("errors")
  private List<NodeDrivesPurposelistError> errors = null;

  @SerializedName("nodes")
  private List<NodeSledsNode> nodes = null;

  @SerializedName("total")
  private Integer total = null;

  public NodeSleds errors(List<NodeDrivesPurposelistError> errors) {
    this.errors = errors;
    return this;
  }

  public NodeSleds addErrorsItem(NodeDrivesPurposelistError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<NodeDrivesPurposelistError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of errors encountered by the individual nodes involved in this request, or an empty list if there were no errors.
   * @return errors
  **/
  @ApiModelProperty(value = "A list of errors encountered by the individual nodes involved in this request, or an empty list if there were no errors.")
  public List<NodeDrivesPurposelistError> getErrors() {
    return errors;
  }

  public void setErrors(List<NodeDrivesPurposelistError> errors) {
    this.errors = errors;
  }

  public NodeSleds nodes(List<NodeSledsNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public NodeSleds addNodesItem(NodeSledsNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeSledsNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * The responses from the individual nodes involved in this request.
   * @return nodes
  **/
  @ApiModelProperty(value = "The responses from the individual nodes involved in this request.")
  public List<NodeSledsNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeSledsNode> nodes) {
    this.nodes = nodes;
  }

  public NodeSleds total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of nodes responding.
   * @return total
  **/
  @ApiModelProperty(value = "The total number of nodes responding.")
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
    NodeSleds nodeSleds = (NodeSleds) o;
    return Objects.equals(this.errors, nodeSleds.errors) &&
        Objects.equals(this.nodes, nodeSleds.nodes) &&
        Objects.equals(this.total, nodeSleds.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, nodes, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSleds {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

