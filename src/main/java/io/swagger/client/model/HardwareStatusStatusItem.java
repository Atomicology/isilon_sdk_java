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
 * HardwareStatusStatusItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HardwareStatusStatusItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("nodepool_name")
  private String nodepoolName = null;

  @SerializedName("unupgraded_lnns")
  private List<Integer> unupgradedLnns = new ArrayList<Integer>();

  @SerializedName("upgrade_type")
  private String upgradeType = null;

  @SerializedName("upgraded_lnns")
  private List<Integer> upgradedLnns = new ArrayList<Integer>();

  public HardwareStatusStatusItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this upgrade.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of this upgrade.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HardwareStatusStatusItem nodepoolName(String nodepoolName) {
    this.nodepoolName = nodepoolName;
    return this;
  }

   /**
   * Name of the upgrading pool.
   * @return nodepoolName
  **/
  @ApiModelProperty(value = "Name of the upgrading pool.")
  public String getNodepoolName() {
    return nodepoolName;
  }

  public void setNodepoolName(String nodepoolName) {
    this.nodepoolName = nodepoolName;
  }

  public HardwareStatusStatusItem unupgradedLnns(List<Integer> unupgradedLnns) {
    this.unupgradedLnns = unupgradedLnns;
    return this;
  }

  public HardwareStatusStatusItem addUnupgradedLnnsItem(Integer unupgradedLnnsItem) {
    this.unupgradedLnns.add(unupgradedLnnsItem);
    return this;
  }

   /**
   * The lnns of the nodes in the pool that haven&#39;t been upgraded yet.
   * @return unupgradedLnns
  **/
  @ApiModelProperty(required = true, value = "The lnns of the nodes in the pool that haven't been upgraded yet.")
  public List<Integer> getUnupgradedLnns() {
    return unupgradedLnns;
  }

  public void setUnupgradedLnns(List<Integer> unupgradedLnns) {
    this.unupgradedLnns = unupgradedLnns;
  }

  public HardwareStatusStatusItem upgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
    return this;
  }

   /**
   * The type of upgrade this is.
   * @return upgradeType
  **/
  @ApiModelProperty(required = true, value = "The type of upgrade this is.")
  public String getUpgradeType() {
    return upgradeType;
  }

  public void setUpgradeType(String upgradeType) {
    this.upgradeType = upgradeType;
  }

  public HardwareStatusStatusItem upgradedLnns(List<Integer> upgradedLnns) {
    this.upgradedLnns = upgradedLnns;
    return this;
  }

  public HardwareStatusStatusItem addUpgradedLnnsItem(Integer upgradedLnnsItem) {
    this.upgradedLnns.add(upgradedLnnsItem);
    return this;
  }

   /**
   * The lnns of the nodes in the pool that have been successsfully upgraded.
   * @return upgradedLnns
  **/
  @ApiModelProperty(required = true, value = "The lnns of the nodes in the pool that have been successsfully upgraded.")
  public List<Integer> getUpgradedLnns() {
    return upgradedLnns;
  }

  public void setUpgradedLnns(List<Integer> upgradedLnns) {
    this.upgradedLnns = upgradedLnns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareStatusStatusItem hardwareStatusStatusItem = (HardwareStatusStatusItem) o;
    return Objects.equals(this.id, hardwareStatusStatusItem.id) &&
        Objects.equals(this.nodepoolName, hardwareStatusStatusItem.nodepoolName) &&
        Objects.equals(this.unupgradedLnns, hardwareStatusStatusItem.unupgradedLnns) &&
        Objects.equals(this.upgradeType, hardwareStatusStatusItem.upgradeType) &&
        Objects.equals(this.upgradedLnns, hardwareStatusStatusItem.upgradedLnns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodepoolName, unupgradedLnns, upgradeType, upgradedLnns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareStatusStatusItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodepoolName: ").append(toIndentedString(nodepoolName)).append("\n");
    sb.append("    unupgradedLnns: ").append(toIndentedString(unupgradedLnns)).append("\n");
    sb.append("    upgradeType: ").append(toIndentedString(upgradeType)).append("\n");
    sb.append("    upgradedLnns: ").append(toIndentedString(upgradedLnns)).append("\n");
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

