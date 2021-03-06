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

/**
 * NodeStateReadonlyNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeStateReadonlyNode {
  @SerializedName("allowed")
  private Boolean allowed = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("mode")
  private Boolean mode = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("value")
  private Integer value = null;

  public NodeStateReadonlyNode allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * The current read-only mode allowed status for the node.
   * @return allowed
  **/
  @ApiModelProperty(value = "The current read-only mode allowed status for the node.")
  public Boolean isAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public NodeStateReadonlyNode enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The current read-only user mode status for the node. NOTE: If read-only mode is currently disallowed for this node, it will remain read/write until read-only mode is allowed again. This value only sets or clears any user-specified requests for read-only mode. If the node has been placed into read-only mode by the system, it will remain in read-only mode until the system conditions which triggered read-only mode have cleared.
   * @return enabled
  **/
  @ApiModelProperty(value = "The current read-only user mode status for the node. NOTE: If read-only mode is currently disallowed for this node, it will remain read/write until read-only mode is allowed again. This value only sets or clears any user-specified requests for read-only mode. If the node has been placed into read-only mode by the system, it will remain in read-only mode until the system conditions which triggered read-only mode have cleared.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NodeStateReadonlyNode error(String error) {
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

  public NodeStateReadonlyNode id(Integer id) {
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

  public NodeStateReadonlyNode lnn(Integer lnn) {
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

  public NodeStateReadonlyNode mode(Boolean mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The current read-only mode status for the node.
   * @return mode
  **/
  @ApiModelProperty(value = "The current read-only mode status for the node.")
  public Boolean isMode() {
    return mode;
  }

  public void setMode(Boolean mode) {
    this.mode = mode;
  }

  public NodeStateReadonlyNode status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current read-only mode status description for the node.
   * @return status
  **/
  @ApiModelProperty(value = "The current read-only mode status description for the node.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NodeStateReadonlyNode valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * The read-only state values are valid (False &#x3D; Error).
   * @return valid
  **/
  @ApiModelProperty(value = "The read-only state values are valid (False = Error).")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public NodeStateReadonlyNode value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The current read-only value (enumerated bitfield) for the node.
   * @return value
  **/
  @ApiModelProperty(value = "The current read-only value (enumerated bitfield) for the node.")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStateReadonlyNode nodeStateReadonlyNode = (NodeStateReadonlyNode) o;
    return Objects.equals(this.allowed, nodeStateReadonlyNode.allowed) &&
        Objects.equals(this.enabled, nodeStateReadonlyNode.enabled) &&
        Objects.equals(this.error, nodeStateReadonlyNode.error) &&
        Objects.equals(this.id, nodeStateReadonlyNode.id) &&
        Objects.equals(this.lnn, nodeStateReadonlyNode.lnn) &&
        Objects.equals(this.mode, nodeStateReadonlyNode.mode) &&
        Objects.equals(this.status, nodeStateReadonlyNode.status) &&
        Objects.equals(this.valid, nodeStateReadonlyNode.valid) &&
        Objects.equals(this.value, nodeStateReadonlyNode.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, enabled, error, id, lnn, mode, status, valid, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStateReadonlyNode {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

