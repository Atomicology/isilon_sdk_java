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
 * ClusterNodesError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterNodesError {
  @SerializedName("failed_upgrade_action")
  private String failedUpgradeAction = null;

  @SerializedName("log")
  private String log = null;

  public ClusterNodesError failedUpgradeAction(String failedUpgradeAction) {
    this.failedUpgradeAction = failedUpgradeAction;
    return this;
  }

   /**
   * Last upgrade step which failed on node.
   * @return failedUpgradeAction
  **/
  @ApiModelProperty(value = "Last upgrade step which failed on node.")
  public String getFailedUpgradeAction() {
    return failedUpgradeAction;
  }

  public void setFailedUpgradeAction(String failedUpgradeAction) {
    this.failedUpgradeAction = failedUpgradeAction;
  }

  public ClusterNodesError log(String log) {
    this.log = log;
    return this;
  }

   /**
   * Upgrade error log.
   * @return log
  **/
  @ApiModelProperty(value = "Upgrade error log.")
  public String getLog() {
    return log;
  }

  public void setLog(String log) {
    this.log = log;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodesError clusterNodesError = (ClusterNodesError) o;
    return Objects.equals(this.failedUpgradeAction, clusterNodesError.failedUpgradeAction) &&
        Objects.equals(this.log, clusterNodesError.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedUpgradeAction, log);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodesError {\n");
    
    sb.append("    failedUpgradeAction: ").append(toIndentedString(failedUpgradeAction)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

