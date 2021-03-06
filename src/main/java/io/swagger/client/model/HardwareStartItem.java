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
 * HardwareStartItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HardwareStartItem {
  @SerializedName("node_pool")
  private String nodePool = null;

  @SerializedName("upgrade_type")
  private String upgradeType = null;

  public HardwareStartItem nodePool(String nodePool) {
    this.nodePool = nodePool;
    return this;
  }

   /**
   * The nodepool ID or name on which to start the upgrade.
   * @return nodePool
  **/
  @ApiModelProperty(required = true, value = "The nodepool ID or name on which to start the upgrade.")
  public String getNodePool() {
    return nodePool;
  }

  public void setNodePool(String nodePool) {
    this.nodePool = nodePool;
  }

  public HardwareStartItem upgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
    return this;
  }

   /**
   * The type of upgrade to start.
   * @return upgradeType
  **/
  @ApiModelProperty(required = true, value = "The type of upgrade to start.")
  public String getUpgradeType() {
    return upgradeType;
  }

  public void setUpgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareStartItem hardwareStartItem = (HardwareStartItem) o;
    return Objects.equals(this.nodePool, hardwareStartItem.nodePool) &&
        Objects.equals(this.upgradeType, hardwareStartItem.upgradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodePool, upgradeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareStartItem {\n");
    
    sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
    sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
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

