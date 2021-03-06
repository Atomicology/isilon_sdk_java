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
 * ResultDirectoriesTotalUsage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ResultDirectoriesTotalUsage {
  @SerializedName("ads_cnt")
  private Integer adsCnt = null;

  @SerializedName("dir_cnt")
  private Integer dirCnt = null;

  @SerializedName("file_cnt")
  private Integer fileCnt = null;

  @SerializedName("lin")
  private Integer lin = null;

  @SerializedName("log_size_sum")
  private Integer logSizeSum = null;

  @SerializedName("log_size_sum_overflow")
  private Integer logSizeSumOverflow = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("other_cnt")
  private Integer otherCnt = null;

  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("phys_size_sum")
  private Integer physSizeSum = null;

  public ResultDirectoriesTotalUsage adsCnt(Integer adsCnt) {
    this.adsCnt = adsCnt;
    return this;
  }

   /**
   * Number of alternate data streams.
   * @return adsCnt
  **/
  @ApiModelProperty(required = true, value = "Number of alternate data streams.")
  public Integer getAdsCnt() {
    return adsCnt;
  }

  public void setAdsCnt(Integer adsCnt) {
    this.adsCnt = adsCnt;
  }

  public ResultDirectoriesTotalUsage dirCnt(Integer dirCnt) {
    this.dirCnt = dirCnt;
    return this;
  }

   /**
   * Number of directories.
   * @return dirCnt
  **/
  @ApiModelProperty(required = true, value = "Number of directories.")
  public Integer getDirCnt() {
    return dirCnt;
  }

  public void setDirCnt(Integer dirCnt) {
    this.dirCnt = dirCnt;
  }

  public ResultDirectoriesTotalUsage fileCnt(Integer fileCnt) {
    this.fileCnt = fileCnt;
    return this;
  }

   /**
   * Number of files.
   * @return fileCnt
  **/
  @ApiModelProperty(required = true, value = "Number of files.")
  public Integer getFileCnt() {
    return fileCnt;
  }

  public void setFileCnt(Integer fileCnt) {
    this.fileCnt = fileCnt;
  }

  public ResultDirectoriesTotalUsage lin(Integer lin) {
    this.lin = lin;
    return this;
  }

   /**
   * Logical inode number.
   * @return lin
  **/
  @ApiModelProperty(required = true, value = "Logical inode number.")
  public Integer getLin() {
    return lin;
  }

  public void setLin(Integer lin) {
    this.lin = lin;
  }

  public ResultDirectoriesTotalUsage logSizeSum(Integer logSizeSum) {
    this.logSizeSum = logSizeSum;
    return this;
  }

   /**
   * Logical size directory in bytes.
   * @return logSizeSum
  **/
  @ApiModelProperty(required = true, value = "Logical size directory in bytes.")
  public Integer getLogSizeSum() {
    return logSizeSum;
  }

  public void setLogSizeSum(Integer logSizeSum) {
    this.logSizeSum = logSizeSum;
  }

  public ResultDirectoriesTotalUsage logSizeSumOverflow(Integer logSizeSumOverflow) {
    this.logSizeSumOverflow = logSizeSumOverflow;
    return this;
  }

   /**
   * Logical size sum of overflow in bytes.
   * @return logSizeSumOverflow
  **/
  @ApiModelProperty(required = true, value = "Logical size sum of overflow in bytes.")
  public Integer getLogSizeSumOverflow() {
    return logSizeSumOverflow;
  }

  public void setLogSizeSumOverflow(Integer logSizeSumOverflow) {
    this.logSizeSumOverflow = logSizeSumOverflow;
  }

  public ResultDirectoriesTotalUsage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of directory.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of directory.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResultDirectoriesTotalUsage otherCnt(Integer otherCnt) {
    this.otherCnt = otherCnt;
    return this;
  }

   /**
   * Other count.
   * @return otherCnt
  **/
  @ApiModelProperty(required = true, value = "Other count.")
  public Integer getOtherCnt() {
    return otherCnt;
  }

  public void setOtherCnt(Integer otherCnt) {
    this.otherCnt = otherCnt;
  }

  public ResultDirectoriesTotalUsage parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent directory inode.
   * @return parent
  **/
  @ApiModelProperty(required = true, value = "Parent directory inode.")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public ResultDirectoriesTotalUsage physSizeSum(Integer physSizeSum) {
    this.physSizeSum = physSizeSum;
    return this;
  }

   /**
   * Physical size directory in bytes.
   * @return physSizeSum
  **/
  @ApiModelProperty(required = true, value = "Physical size directory in bytes.")
  public Integer getPhysSizeSum() {
    return physSizeSum;
  }

  public void setPhysSizeSum(Integer physSizeSum) {
    this.physSizeSum = physSizeSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultDirectoriesTotalUsage resultDirectoriesTotalUsage = (ResultDirectoriesTotalUsage) o;
    return Objects.equals(this.adsCnt, resultDirectoriesTotalUsage.adsCnt) &&
        Objects.equals(this.dirCnt, resultDirectoriesTotalUsage.dirCnt) &&
        Objects.equals(this.fileCnt, resultDirectoriesTotalUsage.fileCnt) &&
        Objects.equals(this.lin, resultDirectoriesTotalUsage.lin) &&
        Objects.equals(this.logSizeSum, resultDirectoriesTotalUsage.logSizeSum) &&
        Objects.equals(this.logSizeSumOverflow, resultDirectoriesTotalUsage.logSizeSumOverflow) &&
        Objects.equals(this.name, resultDirectoriesTotalUsage.name) &&
        Objects.equals(this.otherCnt, resultDirectoriesTotalUsage.otherCnt) &&
        Objects.equals(this.parent, resultDirectoriesTotalUsage.parent) &&
        Objects.equals(this.physSizeSum, resultDirectoriesTotalUsage.physSizeSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsCnt, dirCnt, fileCnt, lin, logSizeSum, logSizeSumOverflow, name, otherCnt, parent, physSizeSum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultDirectoriesTotalUsage {\n");
    
    sb.append("    adsCnt: ").append(toIndentedString(adsCnt)).append("\n");
    sb.append("    dirCnt: ").append(toIndentedString(dirCnt)).append("\n");
    sb.append("    fileCnt: ").append(toIndentedString(fileCnt)).append("\n");
    sb.append("    lin: ").append(toIndentedString(lin)).append("\n");
    sb.append("    logSizeSum: ").append(toIndentedString(logSizeSum)).append("\n");
    sb.append("    logSizeSumOverflow: ").append(toIndentedString(logSizeSumOverflow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherCnt: ").append(toIndentedString(otherCnt)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    physSizeSum: ").append(toIndentedString(physSizeSum)).append("\n");
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

