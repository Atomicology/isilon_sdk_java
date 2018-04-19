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
import io.swagger.client.model.LicenseLicenseTierEntitlementsExceededAlert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LicenseLicenseTier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class LicenseLicenseTier {
  @SerializedName("entitlements_exceeded_alerts")
  private List<LicenseLicenseTierEntitlementsExceededAlert> entitlementsExceededAlerts = null;

  @SerializedName("licensed_drive_capacity")
  private Integer licensedDriveCapacity = null;

  @SerializedName("licensed_node_count")
  private Integer licensedNodeCount = null;

  @SerializedName("licensed_nodes_with_seds_count")
  private Integer licensedNodesWithSedsCount = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("used_drive_capacity")
  private Integer usedDriveCapacity = null;

  @SerializedName("used_node_count")
  private Integer usedNodeCount = null;

  @SerializedName("used_nodes_with_seds_count")
  private Integer usedNodesWithSedsCount = null;

  public LicenseLicenseTier entitlementsExceededAlerts(List<LicenseLicenseTierEntitlementsExceededAlert> entitlementsExceededAlerts) {
    this.entitlementsExceededAlerts = entitlementsExceededAlerts;
    return this;
  }

  public LicenseLicenseTier addEntitlementsExceededAlertsItem(LicenseLicenseTierEntitlementsExceededAlert entitlementsExceededAlertsItem) {
    if (this.entitlementsExceededAlerts == null) {
      this.entitlementsExceededAlerts = new ArrayList<LicenseLicenseTierEntitlementsExceededAlert>();
    }
    this.entitlementsExceededAlerts.add(entitlementsExceededAlertsItem);
    return this;
  }

   /**
   * List of alerts about exceeded entitlements: The following alerts appear when usage of a resource such as a node, an encryption node, or storage capacity exceeds the quantity licensed for that resource.
   * @return entitlementsExceededAlerts
  **/
  @ApiModelProperty(value = "List of alerts about exceeded entitlements: The following alerts appear when usage of a resource such as a node, an encryption node, or storage capacity exceeds the quantity licensed for that resource.")
  public List<LicenseLicenseTierEntitlementsExceededAlert> getEntitlementsExceededAlerts() {
    return entitlementsExceededAlerts;
  }

  public void setEntitlementsExceededAlerts(List<LicenseLicenseTierEntitlementsExceededAlert> entitlementsExceededAlerts) {
    this.entitlementsExceededAlerts = entitlementsExceededAlerts;
  }

  public LicenseLicenseTier licensedDriveCapacity(Integer licensedDriveCapacity) {
    this.licensedDriveCapacity = licensedDriveCapacity;
    return this;
  }

   /**
   * Licensed terabyte (TB, 10^12 bytes) drive capacity allocated as storage associated with tier. Included if tier is not NONINF and license is not a base only license.
   * minimum: 0
   * maximum: 2147483647
   * @return licensedDriveCapacity
  **/
  @ApiModelProperty(value = "Licensed terabyte (TB, 10^12 bytes) drive capacity allocated as storage associated with tier. Included if tier is not NONINF and license is not a base only license.")
  public Integer getLicensedDriveCapacity() {
    return licensedDriveCapacity;
  }

  public void setLicensedDriveCapacity(Integer licensedDriveCapacity) {
    this.licensedDriveCapacity = licensedDriveCapacity;
  }

  public LicenseLicenseTier licensedNodeCount(Integer licensedNodeCount) {
    this.licensedNodeCount = licensedNodeCount;
    return this;
  }

   /**
   * Licensed number of nodes in this tier.
   * minimum: 0
   * maximum: 2147483647
   * @return licensedNodeCount
  **/
  @ApiModelProperty(value = "Licensed number of nodes in this tier.")
  public Integer getLicensedNodeCount() {
    return licensedNodeCount;
  }

  public void setLicensedNodeCount(Integer licensedNodeCount) {
    this.licensedNodeCount = licensedNodeCount;
  }

  public LicenseLicenseTier licensedNodesWithSedsCount(Integer licensedNodesWithSedsCount) {
    this.licensedNodesWithSedsCount = licensedNodesWithSedsCount;
    return this;
  }

   /**
   * Licensed number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and tier is not NONINF.
   * minimum: 0
   * maximum: 2147483647
   * @return licensedNodesWithSedsCount
  **/
  @ApiModelProperty(value = "Licensed number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and tier is not NONINF.")
  public Integer getLicensedNodesWithSedsCount() {
    return licensedNodesWithSedsCount;
  }

  public void setLicensedNodesWithSedsCount(Integer licensedNodesWithSedsCount) {
    this.licensedNodesWithSedsCount = licensedNodesWithSedsCount;
  }

  public LicenseLicenseTier tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * OneFS hardware tier. Tier is a number, NONINF, or NO_TIER. NONINF indicates a non infinity tier. NO_TIER indicates a license that is not tier based.
   * @return tier
  **/
  @ApiModelProperty(value = "OneFS hardware tier. Tier is a number, NONINF, or NO_TIER. NONINF indicates a non infinity tier. NO_TIER indicates a license that is not tier based.")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public LicenseLicenseTier usedDriveCapacity(Integer usedDriveCapacity) {
    this.usedDriveCapacity = usedDriveCapacity;
    return this;
  }

   /**
   * Actual terabyte (TB, 10^12 bytes) drive capacity allocated as storage space associated with tier. Included if tier is not NONINF and license is not a base only license.
   * minimum: 0
   * maximum: 2147483647
   * @return usedDriveCapacity
  **/
  @ApiModelProperty(value = "Actual terabyte (TB, 10^12 bytes) drive capacity allocated as storage space associated with tier. Included if tier is not NONINF and license is not a base only license.")
  public Integer getUsedDriveCapacity() {
    return usedDriveCapacity;
  }

  public void setUsedDriveCapacity(Integer usedDriveCapacity) {
    this.usedDriveCapacity = usedDriveCapacity;
  }

  public LicenseLicenseTier usedNodeCount(Integer usedNodeCount) {
    this.usedNodeCount = usedNodeCount;
    return this;
  }

   /**
   * Actual number of nodes in this tier.
   * minimum: 0
   * maximum: 2147483647
   * @return usedNodeCount
  **/
  @ApiModelProperty(value = "Actual number of nodes in this tier.")
  public Integer getUsedNodeCount() {
    return usedNodeCount;
  }

  public void setUsedNodeCount(Integer usedNodeCount) {
    this.usedNodeCount = usedNodeCount;
  }

  public LicenseLicenseTier usedNodesWithSedsCount(Integer usedNodesWithSedsCount) {
    this.usedNodesWithSedsCount = usedNodesWithSedsCount;
    return this;
  }

   /**
   * Actual number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and if tier is not NONINF.
   * minimum: 0
   * maximum: 2147483647
   * @return usedNodesWithSedsCount
  **/
  @ApiModelProperty(value = "Actual number of nodes of this tier that contain self-encrypting drives. Included only if license is ONEFS and if tier is not NONINF.")
  public Integer getUsedNodesWithSedsCount() {
    return usedNodesWithSedsCount;
  }

  public void setUsedNodesWithSedsCount(Integer usedNodesWithSedsCount) {
    this.usedNodesWithSedsCount = usedNodesWithSedsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseLicenseTier licenseLicenseTier = (LicenseLicenseTier) o;
    return Objects.equals(this.entitlementsExceededAlerts, licenseLicenseTier.entitlementsExceededAlerts) &&
        Objects.equals(this.licensedDriveCapacity, licenseLicenseTier.licensedDriveCapacity) &&
        Objects.equals(this.licensedNodeCount, licenseLicenseTier.licensedNodeCount) &&
        Objects.equals(this.licensedNodesWithSedsCount, licenseLicenseTier.licensedNodesWithSedsCount) &&
        Objects.equals(this.tier, licenseLicenseTier.tier) &&
        Objects.equals(this.usedDriveCapacity, licenseLicenseTier.usedDriveCapacity) &&
        Objects.equals(this.usedNodeCount, licenseLicenseTier.usedNodeCount) &&
        Objects.equals(this.usedNodesWithSedsCount, licenseLicenseTier.usedNodesWithSedsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementsExceededAlerts, licensedDriveCapacity, licensedNodeCount, licensedNodesWithSedsCount, tier, usedDriveCapacity, usedNodeCount, usedNodesWithSedsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseLicenseTier {\n");
    
    sb.append("    entitlementsExceededAlerts: ").append(toIndentedString(entitlementsExceededAlerts)).append("\n");
    sb.append("    licensedDriveCapacity: ").append(toIndentedString(licensedDriveCapacity)).append("\n");
    sb.append("    licensedNodeCount: ").append(toIndentedString(licensedNodeCount)).append("\n");
    sb.append("    licensedNodesWithSedsCount: ").append(toIndentedString(licensedNodesWithSedsCount)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    usedDriveCapacity: ").append(toIndentedString(usedDriveCapacity)).append("\n");
    sb.append("    usedNodeCount: ").append(toIndentedString(usedNodeCount)).append("\n");
    sb.append("    usedNodesWithSedsCount: ").append(toIndentedString(usedNodesWithSedsCount)).append("\n");
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

