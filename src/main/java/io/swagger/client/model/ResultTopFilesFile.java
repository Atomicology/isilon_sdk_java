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
 * ResultTopFilesFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ResultTopFilesFile {
  @SerializedName("atime")
  private Integer atime = null;

  @SerializedName("btime")
  private Integer btime = null;

  @SerializedName("ctime")
  private Integer ctime = null;

  @SerializedName("log_size")
  private Integer logSize = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("phys_size")
  private Integer physSize = null;

  public ResultTopFilesFile atime(Integer atime) {
    this.atime = atime;
    return this;
  }

   /**
   * File access time.
   * @return atime
  **/
  @ApiModelProperty(required = true, value = "File access time.")
  public Integer getAtime() {
    return atime;
  }

  public void setAtime(Integer atime) {
    this.atime = atime;
  }

  public ResultTopFilesFile btime(Integer btime) {
    this.btime = btime;
    return this;
  }

   /**
   * File creation begin time.
   * @return btime
  **/
  @ApiModelProperty(required = true, value = "File creation begin time.")
  public Integer getBtime() {
    return btime;
  }

  public void setBtime(Integer btime) {
    this.btime = btime;
  }

  public ResultTopFilesFile ctime(Integer ctime) {
    this.ctime = ctime;
    return this;
  }

   /**
   * Unix inode change time.
   * @return ctime
  **/
  @ApiModelProperty(required = true, value = "Unix inode change time.")
  public Integer getCtime() {
    return ctime;
  }

  public void setCtime(Integer ctime) {
    this.ctime = ctime;
  }

  public ResultTopFilesFile logSize(Integer logSize) {
    this.logSize = logSize;
    return this;
  }

   /**
   * Logical file size in bytes.
   * @return logSize
  **/
  @ApiModelProperty(required = true, value = "Logical file size in bytes.")
  public Integer getLogSize() {
    return logSize;
  }

  public void setLogSize(Integer logSize) {
    this.logSize = logSize;
  }

  public ResultTopFilesFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Relative file path under /ifs/.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Relative file path under /ifs/.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ResultTopFilesFile physSize(Integer physSize) {
    this.physSize = physSize;
    return this;
  }

   /**
   * Physical file size in bytes.
   * @return physSize
  **/
  @ApiModelProperty(required = true, value = "Physical file size in bytes.")
  public Integer getPhysSize() {
    return physSize;
  }

  public void setPhysSize(Integer physSize) {
    this.physSize = physSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultTopFilesFile resultTopFilesFile = (ResultTopFilesFile) o;
    return Objects.equals(this.atime, resultTopFilesFile.atime) &&
        Objects.equals(this.btime, resultTopFilesFile.btime) &&
        Objects.equals(this.ctime, resultTopFilesFile.ctime) &&
        Objects.equals(this.logSize, resultTopFilesFile.logSize) &&
        Objects.equals(this.path, resultTopFilesFile.path) &&
        Objects.equals(this.physSize, resultTopFilesFile.physSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atime, btime, ctime, logSize, path, physSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultTopFilesFile {\n");
    
    sb.append("    atime: ").append(toIndentedString(atime)).append("\n");
    sb.append("    btime: ").append(toIndentedString(btime)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    logSize: ").append(toIndentedString(logSize)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    physSize: ").append(toIndentedString(physSize)).append("\n");
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

