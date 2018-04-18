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
import io.swagger.client.model.HistoryFileStatistic;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HistoryFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HistoryFile {
  @SerializedName("statistics")
  private List<HistoryFileStatistic> statistics = null;

  @SerializedName("total")
  private Integer total = null;

  public HistoryFile statistics(List<HistoryFileStatistic> statistics) {
    this.statistics = statistics;
    return this;
  }

  public HistoryFile addStatisticsItem(HistoryFileStatistic statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new ArrayList<HistoryFileStatistic>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(value = "")
  public List<HistoryFileStatistic> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<HistoryFileStatistic> statistics) {
    this.statistics = statistics;
  }

  public HistoryFile total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
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
    HistoryFile historyFile = (HistoryFile) o;
    return Objects.equals(this.statistics, historyFile.statistics) &&
        Objects.equals(this.total, historyFile.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryFile {\n");
    
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

