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
import io.swagger.client.model.ResultTopDirsDir;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResultTopDirs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ResultTopDirs {
  @SerializedName("change")
  private Integer change = null;

  @SerializedName("dir_atime_enabled")
  private Boolean dirAtimeEnabled = null;

  @SerializedName("dirs")
  private List<ResultTopDirsDir> dirs = new ArrayList<ResultTopDirsDir>();

  @SerializedName("top_n_max")
  private Integer topNMax = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public ResultTopDirs change(Integer change) {
    this.change = change;
    return this;
  }

   /**
   * Change in directory ranking from result set comparison.
   * @return change
  **/
  @ApiModelProperty(value = "Change in directory ranking from result set comparison.")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public ResultTopDirs dirAtimeEnabled(Boolean dirAtimeEnabled) {
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

  public ResultTopDirs dirs(List<ResultTopDirsDir> dirs) {
    this.dirs = dirs;
    return this;
  }

  public ResultTopDirs addDirsItem(ResultTopDirsDir dirsItem) {
    this.dirs.add(dirsItem);
    return this;
  }

   /**
   * Directory listing.
   * @return dirs
  **/
  @ApiModelProperty(required = true, value = "Directory listing.")
  public List<ResultTopDirsDir> getDirs() {
    return dirs;
  }

  public void setDirs(List<ResultTopDirsDir> dirs) {
    this.dirs = dirs;
  }

  public ResultTopDirs topNMax(Integer topNMax) {
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

  public ResultTopDirs totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total count of directory results.
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "Total count of directory results.")
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
    ResultTopDirs resultTopDirs = (ResultTopDirs) o;
    return Objects.equals(this.change, resultTopDirs.change) &&
        Objects.equals(this.dirAtimeEnabled, resultTopDirs.dirAtimeEnabled) &&
        Objects.equals(this.dirs, resultTopDirs.dirs) &&
        Objects.equals(this.topNMax, resultTopDirs.topNMax) &&
        Objects.equals(this.totalCount, resultTopDirs.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, dirAtimeEnabled, dirs, topNMax, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultTopDirs {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    dirAtimeEnabled: ").append(toIndentedString(dirAtimeEnabled)).append("\n");
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
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
