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
 * HistoryFileStatistic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HistoryFileStatistic {
  @SerializedName("allocated")
  private Integer allocated = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("total")
  private Integer total = null;

  public HistoryFileStatistic allocated(Integer allocated) {
    this.allocated = allocated;
    return this;
  }

   /**
   * Nodes allocated for the sync action.
   * @return allocated
  **/
  @ApiModelProperty(required = true, value = "Nodes allocated for the sync action.")
  public Integer getAllocated() {
    return allocated;
  }

  public void setAllocated(Integer allocated) {
    this.allocated = allocated;
  }

  public HistoryFileStatistic id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * An ID for a single performance report.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An ID for a single performance report.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HistoryFileStatistic limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Sync action limit.
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "Sync action limit.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public HistoryFileStatistic timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp for the performance report.
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "Timestamp for the performance report.")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public HistoryFileStatistic total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total usage for the performance report.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total usage for the performance report.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryFileStatistic historyFileStatistic = (HistoryFileStatistic) o;
    return Objects.equals(this.allocated, historyFileStatistic.allocated) &&
        Objects.equals(this.id, historyFileStatistic.id) &&
        Objects.equals(this.limit, historyFileStatistic.limit) &&
        Objects.equals(this.timestamp, historyFileStatistic.timestamp) &&
        Objects.equals(this.total, historyFileStatistic.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocated, id, limit, timestamp, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryFileStatistic {\n");
    
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

