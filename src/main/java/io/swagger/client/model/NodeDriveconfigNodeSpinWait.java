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
 * NodeDriveconfigNodeSpinWait
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NodeDriveconfigNodeSpinWait {
  @SerializedName("check_drive")
  private Integer checkDrive = null;

  @SerializedName("stagger")
  private Integer stagger = null;

  public NodeDriveconfigNodeSpinWait checkDrive(Integer checkDrive) {
    this.checkDrive = checkDrive;
    return this;
  }

   /**
   * Seconds to wait between enabling a bay and checking for an inserted drive.
   * maximum: 4294967295
   * @return checkDrive
  **/
  @ApiModelProperty(value = "Seconds to wait between enabling a bay and checking for an inserted drive.")
  public Integer getCheckDrive() {
    return checkDrive;
  }

  public void setCheckDrive(Integer checkDrive) {
    this.checkDrive = checkDrive;
  }

  public NodeDriveconfigNodeSpinWait stagger(Integer stagger) {
    this.stagger = stagger;
    return this;
  }

   /**
   * Seconds to wait between enabling a bay and enabling another bay.
   * maximum: 4294967295
   * @return stagger
  **/
  @ApiModelProperty(value = "Seconds to wait between enabling a bay and enabling another bay.")
  public Integer getStagger() {
    return stagger;
  }

  public void setStagger(Integer stagger) {
    this.stagger = stagger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDriveconfigNodeSpinWait nodeDriveconfigNodeSpinWait = (NodeDriveconfigNodeSpinWait) o;
    return Objects.equals(this.checkDrive, nodeDriveconfigNodeSpinWait.checkDrive) &&
        Objects.equals(this.stagger, nodeDriveconfigNodeSpinWait.stagger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkDrive, stagger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDriveconfigNodeSpinWait {\n");
    
    sb.append("    checkDrive: ").append(toIndentedString(checkDrive)).append("\n");
    sb.append("    stagger: ").append(toIndentedString(stagger)).append("\n");
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

