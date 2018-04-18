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
import io.swagger.client.model.ResultTopFilesFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResultTopFiles
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ResultTopFiles {
  @SerializedName("atime_enabled")
  private Boolean atimeEnabled = null;

  @SerializedName("change")
  private Integer change = null;

  @SerializedName("dir_atime_enabled")
  private Boolean dirAtimeEnabled = null;

  @SerializedName("files")
  private List<ResultTopFilesFile> files = new ArrayList<ResultTopFilesFile>();

  @SerializedName("top_n_max")
  private Integer topNMax = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public ResultTopFiles atimeEnabled(Boolean atimeEnabled) {
    this.atimeEnabled = atimeEnabled;
    return this;
  }

   /**
   * Access time enabled.
   * @return atimeEnabled
  **/
  @ApiModelProperty(required = true, value = "Access time enabled.")
  public Boolean isAtimeEnabled() {
    return atimeEnabled;
  }

  public void setAtimeEnabled(Boolean atimeEnabled) {
    this.atimeEnabled = atimeEnabled;
  }

  public ResultTopFiles change(Integer change) {
    this.change = change;
    return this;
  }

   /**
   * Change in file ranking from result set comparison.
   * @return change
  **/
  @ApiModelProperty(value = "Change in file ranking from result set comparison.")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public ResultTopFiles dirAtimeEnabled(Boolean dirAtimeEnabled) {
    this.dirAtimeEnabled = dirAtimeEnabled;
    return this;
  }

   /**
   * Directory access time enabled.
   * @return dirAtimeEnabled
  **/
  @ApiModelProperty(required = true, value = "Directory access time enabled.")
  public Boolean isDirAtimeEnabled() {
    return dirAtimeEnabled;
  }

  public void setDirAtimeEnabled(Boolean dirAtimeEnabled) {
    this.dirAtimeEnabled = dirAtimeEnabled;
  }

  public ResultTopFiles files(List<ResultTopFilesFile> files) {
    this.files = files;
    return this;
  }

  public ResultTopFiles addFilesItem(ResultTopFilesFile filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Files listing.
   * @return files
  **/
  @ApiModelProperty(required = true, value = "Files listing.")
  public List<ResultTopFilesFile> getFiles() {
    return files;
  }

  public void setFiles(List<ResultTopFilesFile> files) {
    this.files = files;
  }

  public ResultTopFiles topNMax(Integer topNMax) {
    this.topNMax = topNMax;
    return this;
  }

   /**
   * Limit on number of top results.
   * @return topNMax
  **/
  @ApiModelProperty(required = true, value = "Limit on number of top results.")
  public Integer getTopNMax() {
    return topNMax;
  }

  public void setTopNMax(Integer topNMax) {
    this.topNMax = topNMax;
  }

  public ResultTopFiles totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total count of file results.
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "Total count of file results.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultTopFiles resultTopFiles = (ResultTopFiles) o;
    return Objects.equals(this.atimeEnabled, resultTopFiles.atimeEnabled) &&
        Objects.equals(this.change, resultTopFiles.change) &&
        Objects.equals(this.dirAtimeEnabled, resultTopFiles.dirAtimeEnabled) &&
        Objects.equals(this.files, resultTopFiles.files) &&
        Objects.equals(this.topNMax, resultTopFiles.topNMax) &&
        Objects.equals(this.totalCount, resultTopFiles.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atimeEnabled, change, dirAtimeEnabled, files, topNMax, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultTopFiles {\n");
    
    sb.append("    atimeEnabled: ").append(toIndentedString(atimeEnabled)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    dirAtimeEnabled: ").append(toIndentedString(dirAtimeEnabled)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    topNMax: ").append(toIndentedString(topNMax)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

