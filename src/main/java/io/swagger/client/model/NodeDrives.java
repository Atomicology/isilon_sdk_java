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
import io.swagger.client.model.NodeDrivesNode;
import io.swagger.client.model.NodeDrivesPurposelistError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeDrives
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeDrives {
  @SerializedName("errors")
  private List<NodeDrivesPurposelistError> errors = null;

  @SerializedName("nodes")
  private List<NodeDrivesNode> nodes = null;

  @SerializedName("total")
  private Integer total = null;

  public NodeDrives errors(List<NodeDrivesPurposelistError> errors) {
    this.errors = errors;
    return this;
  }

  public NodeDrives addErrorsItem(NodeDrivesPurposelistError errorsItem) {
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

  public NodeDrives nodes(List<NodeDrivesNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public NodeDrives addNodesItem(NodeDrivesNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeDrivesNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * The responses from the individual nodes involved in this request.
   * @return nodes
  **/
  @ApiModelProperty(value = "The responses from the individual nodes involved in this request.")
  public List<NodeDrivesNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeDrivesNode> nodes) {
    this.nodes = nodes;
  }

  public NodeDrives total(Integer total) {
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
    NodeDrives nodeDrives = (NodeDrives) o;
    return Objects.equals(this.errors, nodeDrives.errors) &&
        Objects.equals(this.nodes, nodeDrives.nodes) &&
        Objects.equals(this.total, nodeDrives.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, nodes, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDrives {\n");
    
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

