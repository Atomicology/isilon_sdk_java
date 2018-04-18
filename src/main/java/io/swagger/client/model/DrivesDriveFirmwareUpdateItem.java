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
 * Drive firmware update information.
 */
@ApiModel(description = "Drive firmware update information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class DrivesDriveFirmwareUpdateItem {
  @SerializedName("cluster_wide")
  private Boolean clusterWide = null;

  public DrivesDriveFirmwareUpdateItem clusterWide(Boolean clusterWide) {
    this.clusterWide = clusterWide;
    return this;
  }

   /**
   * Indicates whether this is a cluster wide drive firwmare update or not
   * @return clusterWide
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this is a cluster wide drive firwmare update or not")
  public Boolean isClusterWide() {
    return clusterWide;
  }

  public void setClusterWide(Boolean clusterWide) {
    this.clusterWide = clusterWide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrivesDriveFirmwareUpdateItem drivesDriveFirmwareUpdateItem = (DrivesDriveFirmwareUpdateItem) o;
    return Objects.equals(this.clusterWide, drivesDriveFirmwareUpdateItem.clusterWide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterWide);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrivesDriveFirmwareUpdateItem {\n");
    
    sb.append("    clusterWide: ").append(toIndentedString(clusterWide)).append("\n");
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
