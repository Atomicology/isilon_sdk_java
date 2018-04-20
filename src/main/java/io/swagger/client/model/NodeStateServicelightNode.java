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
 * NodeStateServicelightNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeStateServicelightNode {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("present")
  private Boolean present = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("supported")
  private Boolean supported = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public NodeStateServicelightNode enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * The node service light state (True &#x3D; on).
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "The node service light state (True = on).")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NodeStateServicelightNode error(String error) {
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

  public NodeStateServicelightNode id(Integer id) {
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

  public NodeStateServicelightNode lnn(Integer lnn) {
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

  public NodeStateServicelightNode present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * This node has a service light.
   * @return present
  **/
  @ApiModelProperty(value = "This node has a service light.")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  public NodeStateServicelightNode status(Integer status) {
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

  public NodeStateServicelightNode supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * This node supports a service light.
   * @return supported
  **/
  @ApiModelProperty(value = "This node supports a service light.")
  public Boolean isSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  public NodeStateServicelightNode valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * The node service light state is valid (False &#x3D; Error).
   * @return valid
  **/
  @ApiModelProperty(value = "The node service light state is valid (False = Error).")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStateServicelightNode nodeStateServicelightNode = (NodeStateServicelightNode) o;
    return Objects.equals(this.enabled, nodeStateServicelightNode.enabled) &&
        Objects.equals(this.error, nodeStateServicelightNode.error) &&
        Objects.equals(this.id, nodeStateServicelightNode.id) &&
        Objects.equals(this.lnn, nodeStateServicelightNode.lnn) &&
        Objects.equals(this.present, nodeStateServicelightNode.present) &&
        Objects.equals(this.status, nodeStateServicelightNode.status) &&
        Objects.equals(this.supported, nodeStateServicelightNode.supported) &&
        Objects.equals(this.valid, nodeStateServicelightNode.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, error, id, lnn, present, status, supported, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStateServicelightNode {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

