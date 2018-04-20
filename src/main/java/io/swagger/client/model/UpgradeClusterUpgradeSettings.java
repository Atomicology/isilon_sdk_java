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
import java.util.ArrayList;
import java.util.List;

/**
 * UpgradeClusterUpgradeSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class UpgradeClusterUpgradeSettings {
  @SerializedName("nodes_to_rolling_upgrade")
  private List<Integer> nodesToRollingUpgrade = null;

  @SerializedName("upgrade_type")
  private String upgradeType = null;

  public UpgradeClusterUpgradeSettings nodesToRollingUpgrade(List<Integer> nodesToRollingUpgrade) {
    this.nodesToRollingUpgrade = nodesToRollingUpgrade;
    return this;
  }

  public UpgradeClusterUpgradeSettings addNodesToRollingUpgradeItem(Integer nodesToRollingUpgradeItem) {
    if (this.nodesToRollingUpgrade == null) {
      this.nodesToRollingUpgrade = new ArrayList<Integer>();
    }
    this.nodesToRollingUpgrade.add(nodesToRollingUpgradeItem);
    return this;
  }

   /**
   * The nodes (to be) scheduled for upgrade ordered by queue position number. Null if the cluster_state is &#39;partially upgraded&#39; or upgrade_type is &#39;simultaneous&#39;. One of the following values: [&lt;lnn-1&gt;, &lt;lnn-2&gt;, ... ], &#39;All&#39;, null
   * @return nodesToRollingUpgrade
  **/
  @ApiModelProperty(value = "The nodes (to be) scheduled for upgrade ordered by queue position number. Null if the cluster_state is 'partially upgraded' or upgrade_type is 'simultaneous'. One of the following values: [<lnn-1>, <lnn-2>, ... ], 'All', null")
  public List<Integer> getNodesToRollingUpgrade() {
    return nodesToRollingUpgrade;
  }

  public void setNodesToRollingUpgrade(List<Integer> nodesToRollingUpgrade) {
    this.nodesToRollingUpgrade = nodesToRollingUpgrade;
  }

  public UpgradeClusterUpgradeSettings upgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
    return this;
  }

   /**
   * The type of upgrade to perform. One of the following values: &#39;rolling&#39;, &#39;simultaneous&#39;
   * @return upgradeType
  **/
  @ApiModelProperty(value = "The type of upgrade to perform. One of the following values: 'rolling', 'simultaneous'")
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
    UpgradeClusterUpgradeSettings upgradeClusterUpgradeSettings = (UpgradeClusterUpgradeSettings) o;
    return Objects.equals(this.nodesToRollingUpgrade, upgradeClusterUpgradeSettings.nodesToRollingUpgrade) &&
        Objects.equals(this.upgradeType, upgradeClusterUpgradeSettings.upgradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodesToRollingUpgrade, upgradeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeClusterUpgradeSettings {\n");
    
    sb.append("    nodesToRollingUpgrade: ").append(toIndentedString(nodesToRollingUpgrade)).append("\n");
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

