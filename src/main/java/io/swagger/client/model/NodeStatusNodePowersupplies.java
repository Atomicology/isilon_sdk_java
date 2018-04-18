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
import io.swagger.client.model.NodeStatusNodePowersuppliesSupply;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeStatusNodePowersupplies
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeStatusNodePowersupplies {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("failures")
  private Integer failures = null;

  @SerializedName("has_cff")
  private Boolean hasCff = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("supplies")
  private List<NodeStatusNodePowersuppliesSupply> supplies = null;

  @SerializedName("supports_cff")
  private Boolean supportsCff = null;

  public NodeStatusNodePowersupplies count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of how many power supplies are supported.
   * @return count
  **/
  @ApiModelProperty(value = "Count of how many power supplies are supported.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public NodeStatusNodePowersupplies failures(Integer failures) {
    this.failures = failures;
    return this;
  }

   /**
   * Count of how many power supplies have failed.
   * @return failures
  **/
  @ApiModelProperty(value = "Count of how many power supplies have failed.")
  public Integer getFailures() {
    return failures;
  }

  public void setFailures(Integer failures) {
    this.failures = failures;
  }

  public NodeStatusNodePowersupplies hasCff(Boolean hasCff) {
    this.hasCff = hasCff;
    return this;
  }

   /**
   * Does this node have a CFF power supply.
   * @return hasCff
  **/
  @ApiModelProperty(value = "Does this node have a CFF power supply.")
  public Boolean isHasCff() {
    return hasCff;
  }

  public void setHasCff(Boolean hasCff) {
    this.hasCff = hasCff;
  }

  public NodeStatusNodePowersupplies status(String status) {
    this.status = status;
    return this;
  }

   /**
   * A descriptive status string for this node&#39;s power supplies.
   * @return status
  **/
  @ApiModelProperty(value = "A descriptive status string for this node's power supplies.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NodeStatusNodePowersupplies supplies(List<NodeStatusNodePowersuppliesSupply> supplies) {
    this.supplies = supplies;
    return this;
  }

  public NodeStatusNodePowersupplies addSuppliesItem(NodeStatusNodePowersuppliesSupply suppliesItem) {
    if (this.supplies == null) {
      this.supplies = new ArrayList<NodeStatusNodePowersuppliesSupply>();
    }
    this.supplies.add(suppliesItem);
    return this;
  }

   /**
   * List of this node&#39;s power supplies.
   * @return supplies
  **/
  @ApiModelProperty(value = "List of this node's power supplies.")
  public List<NodeStatusNodePowersuppliesSupply> getSupplies() {
    return supplies;
  }

  public void setSupplies(List<NodeStatusNodePowersuppliesSupply> supplies) {
    this.supplies = supplies;
  }

  public NodeStatusNodePowersupplies supportsCff(Boolean supportsCff) {
    this.supportsCff = supportsCff;
    return this;
  }

   /**
   * Does this node support CFF power supplies.
   * @return supportsCff
  **/
  @ApiModelProperty(value = "Does this node support CFF power supplies.")
  public Boolean isSupportsCff() {
    return supportsCff;
  }

  public void setSupportsCff(Boolean supportsCff) {
    this.supportsCff = supportsCff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusNodePowersupplies nodeStatusNodePowersupplies = (NodeStatusNodePowersupplies) o;
    return Objects.equals(this.count, nodeStatusNodePowersupplies.count) &&
        Objects.equals(this.failures, nodeStatusNodePowersupplies.failures) &&
        Objects.equals(this.hasCff, nodeStatusNodePowersupplies.hasCff) &&
        Objects.equals(this.status, nodeStatusNodePowersupplies.status) &&
        Objects.equals(this.supplies, nodeStatusNodePowersupplies.supplies) &&
        Objects.equals(this.supportsCff, nodeStatusNodePowersupplies.supportsCff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, failures, hasCff, status, supplies, supportsCff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusNodePowersupplies {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    hasCff: ").append(toIndentedString(hasCff)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplies: ").append(toIndentedString(supplies)).append("\n");
    sb.append("    supportsCff: ").append(toIndentedString(supportsCff)).append("\n");
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

