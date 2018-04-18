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
import io.swagger.client.model.NodeDriveconfigNodeAutomaticReplacementRecognition;
import java.io.IOException;

/**
 * An object containing a node&#39;s drive subsystem XML configuration file.
 */
@ApiModel(description = "An object containing a node's drive subsystem XML configuration file.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeDriveconfigExtended {
  @SerializedName("automatic_replacement_recognition")
  private NodeDriveconfigNodeAutomaticReplacementRecognition automaticReplacementRecognition = null;

  public NodeDriveconfigExtended automaticReplacementRecognition(NodeDriveconfigNodeAutomaticReplacementRecognition automaticReplacementRecognition) {
    this.automaticReplacementRecognition = automaticReplacementRecognition;
    return this;
  }

   /**
   * Configuration settings for automatic replacement recognition (ARR).
   * @return automaticReplacementRecognition
  **/
  @ApiModelProperty(value = "Configuration settings for automatic replacement recognition (ARR).")
  public NodeDriveconfigNodeAutomaticReplacementRecognition getAutomaticReplacementRecognition() {
    return automaticReplacementRecognition;
  }

  public void setAutomaticReplacementRecognition(NodeDriveconfigNodeAutomaticReplacementRecognition automaticReplacementRecognition) {
    this.automaticReplacementRecognition = automaticReplacementRecognition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDriveconfigExtended nodeDriveconfigExtended = (NodeDriveconfigExtended) o;
    return Objects.equals(this.automaticReplacementRecognition, nodeDriveconfigExtended.automaticReplacementRecognition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticReplacementRecognition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDriveconfigExtended {\n");
    
    sb.append("    automaticReplacementRecognition: ").append(toIndentedString(automaticReplacementRecognition)).append("\n");
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

