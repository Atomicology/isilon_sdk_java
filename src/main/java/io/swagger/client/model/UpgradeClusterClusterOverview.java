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
 * UpgradeClusterClusterOverview
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class UpgradeClusterClusterOverview {
  @SerializedName("nodes_current")
  private Integer nodesCurrent = null;

  @SerializedName("nodes_total")
  private Integer nodesTotal = null;

  @SerializedName("nodes_transitioning")
  private Integer nodesTransitioning = null;

  @SerializedName("nodes_upgraded")
  private Integer nodesUpgraded = null;

  public UpgradeClusterClusterOverview nodesCurrent(Integer nodesCurrent) {
    this.nodesCurrent = nodesCurrent;
    return this;
  }

   /**
   * Number of nodes running the current OneFS version.
   * @return nodesCurrent
  **/
  @ApiModelProperty(value = "Number of nodes running the current OneFS version.")
  public Integer getNodesCurrent() {
    return nodesCurrent;
  }

  public void setNodesCurrent(Integer nodesCurrent) {
    this.nodesCurrent = nodesCurrent;
  }

  public UpgradeClusterClusterOverview nodesTotal(Integer nodesTotal) {
    this.nodesTotal = nodesTotal;
    return this;
  }

   /**
   * Total number of nodes on the cluster.
   * @return nodesTotal
  **/
  @ApiModelProperty(value = "Total number of nodes on the cluster.")
  public Integer getNodesTotal() {
    return nodesTotal;
  }

  public void setNodesTotal(Integer nodesTotal) {
    this.nodesTotal = nodesTotal;
  }

  public UpgradeClusterClusterOverview nodesTransitioning(Integer nodesTransitioning) {
    this.nodesTransitioning = nodesTransitioning;
    return this;
  }

   /**
   * Number of nodes transitioning between OneFS versions. Null if the cluster_state is &#39;committed&#39; or &#39;assessing.&#39;
   * @return nodesTransitioning
  **/
  @ApiModelProperty(value = "Number of nodes transitioning between OneFS versions. Null if the cluster_state is 'committed' or 'assessing.'")
  public Integer getNodesTransitioning() {
    return nodesTransitioning;
  }

  public void setNodesTransitioning(Integer nodesTransitioning) {
    this.nodesTransitioning = nodesTransitioning;
  }

  public UpgradeClusterClusterOverview nodesUpgraded(Integer nodesUpgraded) {
    this.nodesUpgraded = nodesUpgraded;
    return this;
  }

   /**
   * Number of nodes running the upgraded OneFS version. Null if the cluster_state is &#39;committed&#39; or &#39;assessing.&#39;
   * @return nodesUpgraded
  **/
  @ApiModelProperty(value = "Number of nodes running the upgraded OneFS version. Null if the cluster_state is 'committed' or 'assessing.'")
  public Integer getNodesUpgraded() {
    return nodesUpgraded;
  }

  public void setNodesUpgraded(Integer nodesUpgraded) {
    this.nodesUpgraded = nodesUpgraded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeClusterClusterOverview upgradeClusterClusterOverview = (UpgradeClusterClusterOverview) o;
    return Objects.equals(this.nodesCurrent, upgradeClusterClusterOverview.nodesCurrent) &&
        Objects.equals(this.nodesTotal, upgradeClusterClusterOverview.nodesTotal) &&
        Objects.equals(this.nodesTransitioning, upgradeClusterClusterOverview.nodesTransitioning) &&
        Objects.equals(this.nodesUpgraded, upgradeClusterClusterOverview.nodesUpgraded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodesCurrent, nodesTotal, nodesTransitioning, nodesUpgraded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeClusterClusterOverview {\n");
    
    sb.append("    nodesCurrent: ").append(toIndentedString(nodesCurrent)).append("\n");
    sb.append("    nodesTotal: ").append(toIndentedString(nodesTotal)).append("\n");
    sb.append("    nodesTransitioning: ").append(toIndentedString(nodesTransitioning)).append("\n");
    sb.append("    nodesUpgraded: ").append(toIndentedString(nodesUpgraded)).append("\n");
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

