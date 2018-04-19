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
 * Start an archive of an upgrade.
 */
@ApiModel(description = "Start an archive of an upgrade.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterArchiveItem {
  @SerializedName("clear")
  private Boolean clear = null;

  public ClusterArchiveItem clear(Boolean clear) {
    this.clear = clear;
    return this;
  }

   /**
   * If set to true the currently running upgrade will be cleared
   * @return clear
  **/
  @ApiModelProperty(value = "If set to true the currently running upgrade will be cleared")
  public Boolean isClear() {
    return clear;
  }

  public void setClear(Boolean clear) {
    this.clear = clear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterArchiveItem clusterArchiveItem = (ClusterArchiveItem) o;
    return Objects.equals(this.clear, clusterArchiveItem.clear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterArchiveItem {\n");
    
    sb.append("    clear: ").append(toIndentedString(clear)).append("\n");
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

