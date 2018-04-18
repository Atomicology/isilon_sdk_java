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
 * SnapshotSnapshotsSummarySummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SnapshotSnapshotsSummarySummary {
  @SerializedName("active_count")
  private Integer activeCount = null;

  @SerializedName("active_size")
  private Integer activeSize = null;

  @SerializedName("aliases_count")
  private Integer aliasesCount = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("deleting_count")
  private Integer deletingCount = null;

  @SerializedName("deleting_size")
  private Integer deletingSize = null;

  @SerializedName("shadow_bytes")
  private Integer shadowBytes = null;

  @SerializedName("size")
  private Integer size = null;

  public SnapshotSnapshotsSummarySummary activeCount(Integer activeCount) {
    this.activeCount = activeCount;
    return this;
  }

   /**
   * Total number of active snapshots.
   * @return activeCount
  **/
  @ApiModelProperty(required = true, value = "Total number of active snapshots.")
  public Integer getActiveCount() {
    return activeCount;
  }

  public void setActiveCount(Integer activeCount) {
    this.activeCount = activeCount;
  }

  public SnapshotSnapshotsSummarySummary activeSize(Integer activeSize) {
    this.activeSize = activeSize;
    return this;
  }

   /**
   * Sum of sizes of active snapshots.
   * @return activeSize
  **/
  @ApiModelProperty(required = true, value = "Sum of sizes of active snapshots.")
  public Integer getActiveSize() {
    return activeSize;
  }

  public void setActiveSize(Integer activeSize) {
    this.activeSize = activeSize;
  }

  public SnapshotSnapshotsSummarySummary aliasesCount(Integer aliasesCount) {
    this.aliasesCount = aliasesCount;
    return this;
  }

   /**
   * Total number of snapshot aliases.
   * @return aliasesCount
  **/
  @ApiModelProperty(required = true, value = "Total number of snapshot aliases.")
  public Integer getAliasesCount() {
    return aliasesCount;
  }

  public void setAliasesCount(Integer aliasesCount) {
    this.aliasesCount = aliasesCount;
  }

  public SnapshotSnapshotsSummarySummary count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of snapshots.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Total number of snapshots.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SnapshotSnapshotsSummarySummary deletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
    return this;
  }

   /**
   * Total number of delete-pending snapshots.
   * @return deletingCount
  **/
  @ApiModelProperty(required = true, value = "Total number of delete-pending snapshots.")
  public Integer getDeletingCount() {
    return deletingCount;
  }

  public void setDeletingCount(Integer deletingCount) {
    this.deletingCount = deletingCount;
  }

  public SnapshotSnapshotsSummarySummary deletingSize(Integer deletingSize) {
    this.deletingSize = deletingSize;
    return this;
  }

   /**
   * Sum of sizes of delete-pending snapshots.
   * @return deletingSize
  **/
  @ApiModelProperty(required = true, value = "Sum of sizes of delete-pending snapshots.")
  public Integer getDeletingSize() {
    return deletingSize;
  }

  public void setDeletingSize(Integer deletingSize) {
    this.deletingSize = deletingSize;
  }

  public SnapshotSnapshotsSummarySummary shadowBytes(Integer shadowBytes) {
    this.shadowBytes = shadowBytes;
    return this;
  }

   /**
   * Sum of shadow bytes of all snapshots.
   * @return shadowBytes
  **/
  @ApiModelProperty(required = true, value = "Sum of shadow bytes of all snapshots.")
  public Integer getShadowBytes() {
    return shadowBytes;
  }

  public void setShadowBytes(Integer shadowBytes) {
    this.shadowBytes = shadowBytes;
  }

  public SnapshotSnapshotsSummarySummary size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Sum of sizes in bytes of all snapshots.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Sum of sizes in bytes of all snapshots.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotSnapshotsSummarySummary snapshotSnapshotsSummarySummary = (SnapshotSnapshotsSummarySummary) o;
    return Objects.equals(this.activeCount, snapshotSnapshotsSummarySummary.activeCount) &&
        Objects.equals(this.activeSize, snapshotSnapshotsSummarySummary.activeSize) &&
        Objects.equals(this.aliasesCount, snapshotSnapshotsSummarySummary.aliasesCount) &&
        Objects.equals(this.count, snapshotSnapshotsSummarySummary.count) &&
        Objects.equals(this.deletingCount, snapshotSnapshotsSummarySummary.deletingCount) &&
        Objects.equals(this.deletingSize, snapshotSnapshotsSummarySummary.deletingSize) &&
        Objects.equals(this.shadowBytes, snapshotSnapshotsSummarySummary.shadowBytes) &&
        Objects.equals(this.size, snapshotSnapshotsSummarySummary.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeCount, activeSize, aliasesCount, count, deletingCount, deletingSize, shadowBytes, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSnapshotsSummarySummary {\n");
    
    sb.append("    activeCount: ").append(toIndentedString(activeCount)).append("\n");
    sb.append("    activeSize: ").append(toIndentedString(activeSize)).append("\n");
    sb.append("    aliasesCount: ").append(toIndentedString(aliasesCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deletingCount: ").append(toIndentedString(deletingCount)).append("\n");
    sb.append("    deletingSize: ").append(toIndentedString(deletingSize)).append("\n");
    sb.append("    shadowBytes: ").append(toIndentedString(shadowBytes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

