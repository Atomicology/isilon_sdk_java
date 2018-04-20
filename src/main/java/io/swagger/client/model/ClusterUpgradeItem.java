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
 * The settings necessary to start an upgrade.
 */
@ApiModel(description = "The settings necessary to start an upgrade.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterUpgradeItem {
  @SerializedName("install_image_path")
  private String installImagePath = null;

  @SerializedName("nodes_to_rolling_upgrade")
  private List<Integer> nodesToRollingUpgrade = null;

  @SerializedName("skip_optional")
  private Boolean skipOptional = null;

  @SerializedName("upgrade_type")
  private String upgradeType = null;

  public ClusterUpgradeItem installImagePath(String installImagePath) {
    this.installImagePath = installImagePath;
    return this;
  }

   /**
   * The location (path) of the upgrade image which must be within /ifs.
   * @return installImagePath
  **/
  @ApiModelProperty(value = "The location (path) of the upgrade image which must be within /ifs.")
  public String getInstallImagePath() {
    return installImagePath;
  }

  public void setInstallImagePath(String installImagePath) {
    this.installImagePath = installImagePath;
  }

  public ClusterUpgradeItem nodesToRollingUpgrade(List<Integer> nodesToRollingUpgrade) {
    this.nodesToRollingUpgrade = nodesToRollingUpgrade;
    return this;
  }

  public ClusterUpgradeItem addNodesToRollingUpgradeItem(Integer nodesToRollingUpgradeItem) {
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

  public ClusterUpgradeItem skipOptional(Boolean skipOptional) {
    this.skipOptional = skipOptional;
    return this;
  }

   /**
   * Used to indicate that the pre-upgrade check should be skipped
   * @return skipOptional
  **/
  @ApiModelProperty(value = "Used to indicate that the pre-upgrade check should be skipped")
  public Boolean isSkipOptional() {
    return skipOptional;
  }

  public void setSkipOptional(Boolean skipOptional) {
    this.skipOptional = skipOptional;
  }

  public ClusterUpgradeItem upgradeType(String upgradeType) {
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
    ClusterUpgradeItem clusterUpgradeItem = (ClusterUpgradeItem) o;
    return Objects.equals(this.installImagePath, clusterUpgradeItem.installImagePath) &&
        Objects.equals(this.nodesToRollingUpgrade, clusterUpgradeItem.nodesToRollingUpgrade) &&
        Objects.equals(this.skipOptional, clusterUpgradeItem.skipOptional) &&
        Objects.equals(this.upgradeType, clusterUpgradeItem.upgradeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installImagePath, nodesToRollingUpgrade, skipOptional, upgradeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterUpgradeItem {\n");
    
    sb.append("    installImagePath: ").append(toIndentedString(installImagePath)).append("\n");
    sb.append("    nodesToRollingUpgrade: ").append(toIndentedString(nodesToRollingUpgrade)).append("\n");
    sb.append("    skipOptional: ").append(toIndentedString(skipOptional)).append("\n");
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

