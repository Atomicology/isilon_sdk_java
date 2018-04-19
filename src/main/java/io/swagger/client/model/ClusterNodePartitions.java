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
import io.swagger.client.model.NodePartitionsNodePartition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterNodePartitions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ClusterNodePartitions {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("partitions")
  private List<NodePartitionsNodePartition> partitions = null;

  public ClusterNodePartitions count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of how many partitions are included.
   * @return count
  **/
  @ApiModelProperty(value = "Count of how many partitions are included.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ClusterNodePartitions partitions(List<NodePartitionsNodePartition> partitions) {
    this.partitions = partitions;
    return this;
  }

  public ClusterNodePartitions addPartitionsItem(NodePartitionsNodePartition partitionsItem) {
    if (this.partitions == null) {
      this.partitions = new ArrayList<NodePartitionsNodePartition>();
    }
    this.partitions.add(partitionsItem);
    return this;
  }

   /**
   * Partition information.
   * @return partitions
  **/
  @ApiModelProperty(value = "Partition information.")
  public List<NodePartitionsNodePartition> getPartitions() {
    return partitions;
  }

  public void setPartitions(List<NodePartitionsNodePartition> partitions) {
    this.partitions = partitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodePartitions clusterNodePartitions = (ClusterNodePartitions) o;
    return Objects.equals(this.count, clusterNodePartitions.count) &&
        Objects.equals(this.partitions, clusterNodePartitions.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, partitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodePartitions {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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

