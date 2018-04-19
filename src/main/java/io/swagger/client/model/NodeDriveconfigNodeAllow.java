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
 * NodeDriveconfigNodeAllow
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NodeDriveconfigNodeAllow {
  @SerializedName("format_unknown_firmware")
  private Boolean formatUnknownFirmware = true;

  @SerializedName("format_unknown_model")
  private Boolean formatUnknownModel = true;

  public NodeDriveconfigNodeAllow formatUnknownFirmware(Boolean formatUnknownFirmware) {
    this.formatUnknownFirmware = formatUnknownFirmware;
    return this;
  }

   /**
   * Allow formatting a drive model with unknown firmware.
   * @return formatUnknownFirmware
  **/
  @ApiModelProperty(value = "Allow formatting a drive model with unknown firmware.")
  public Boolean isFormatUnknownFirmware() {
    return formatUnknownFirmware;
  }

  public void setFormatUnknownFirmware(Boolean formatUnknownFirmware) {
    this.formatUnknownFirmware = formatUnknownFirmware;
  }

  public NodeDriveconfigNodeAllow formatUnknownModel(Boolean formatUnknownModel) {
    this.formatUnknownModel = formatUnknownModel;
    return this;
  }

   /**
   * Allow formatting an unknown drive model.
   * @return formatUnknownModel
  **/
  @ApiModelProperty(value = "Allow formatting an unknown drive model.")
  public Boolean isFormatUnknownModel() {
    return formatUnknownModel;
  }

  public void setFormatUnknownModel(Boolean formatUnknownModel) {
    this.formatUnknownModel = formatUnknownModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDriveconfigNodeAllow nodeDriveconfigNodeAllow = (NodeDriveconfigNodeAllow) o;
    return Objects.equals(this.formatUnknownFirmware, nodeDriveconfigNodeAllow.formatUnknownFirmware) &&
        Objects.equals(this.formatUnknownModel, nodeDriveconfigNodeAllow.formatUnknownModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatUnknownFirmware, formatUnknownModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDriveconfigNodeAllow {\n");
    
    sb.append("    formatUnknownFirmware: ").append(toIndentedString(formatUnknownFirmware)).append("\n");
    sb.append("    formatUnknownModel: ").append(toIndentedString(formatUnknownModel)).append("\n");
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

