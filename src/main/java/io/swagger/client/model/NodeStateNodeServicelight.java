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
import io.swagger.client.model.NodeStateServicelightExtended;
import java.io.IOException;

/**
 * NodeStateNodeServicelight
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NodeStateNodeServicelight {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("present")
  private Boolean present = null;

  @SerializedName("supported")
  private Boolean supported = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public NodeStateNodeServicelight enabled(Boolean enabled) {
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

  public NodeStateNodeServicelight present(Boolean present) {
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

  public NodeStateNodeServicelight supported(Boolean supported) {
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

  public NodeStateNodeServicelight valid(Boolean valid) {
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
    NodeStateNodeServicelight nodeStateNodeServicelight = (NodeStateNodeServicelight) o;
    return Objects.equals(this.enabled, nodeStateNodeServicelight.enabled) &&
        Objects.equals(this.present, nodeStateNodeServicelight.present) &&
        Objects.equals(this.supported, nodeStateNodeServicelight.supported) &&
        Objects.equals(this.valid, nodeStateNodeServicelight.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, present, supported, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStateNodeServicelight {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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

