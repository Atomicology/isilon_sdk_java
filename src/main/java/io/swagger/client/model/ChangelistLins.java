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
import io.swagger.client.model.ChangelistLinsCtime;
import java.io.IOException;

/**
 * ChangelistLins
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ChangelistLins {
  @SerializedName("atime")
  private ChangelistLinsCtime atime = null;

  @SerializedName("ctime")
  private ChangelistLinsCtime ctime = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("mtime")
  private ChangelistLinsCtime mtime = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("type")
  private String type = null;

  public ChangelistLins atime(ChangelistLinsCtime atime) {
    this.atime = atime;
    return this;
  }

   /**
   * 
   * @return atime
  **/
  @ApiModelProperty(value = "")
  public ChangelistLinsCtime getAtime() {
    return atime;
  }

  public void setAtime(ChangelistLinsCtime atime) {
    this.atime = atime;
  }

  public ChangelistLins ctime(ChangelistLinsCtime ctime) {
    this.ctime = ctime;
    return this;
  }

   /**
   * 
   * @return ctime
  **/
  @ApiModelProperty(value = "")
  public ChangelistLinsCtime getCtime() {
    return ctime;
  }

  public void setCtime(ChangelistLinsCtime ctime) {
    this.ctime = ctime;
  }

  public ChangelistLins id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The LIN number of the file associated with the entry.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The LIN number of the file associated with the entry.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChangelistLins mtime(ChangelistLinsCtime mtime) {
    this.mtime = mtime;
    return this;
  }

   /**
   * 
   * @return mtime
  **/
  @ApiModelProperty(value = "")
  public ChangelistLinsCtime getMtime() {
    return mtime;
  }

  public void setMtime(ChangelistLinsCtime mtime) {
    this.mtime = mtime;
  }

  public ChangelistLins path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path to the file associated with the entry.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The path to the file associated with the entry.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ChangelistLins size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file associated with the entry.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "The size of the file associated with the entry.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ChangelistLins type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of file.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of file.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangelistLins changelistLins = (ChangelistLins) o;
    return Objects.equals(this.atime, changelistLins.atime) &&
        Objects.equals(this.ctime, changelistLins.ctime) &&
        Objects.equals(this.id, changelistLins.id) &&
        Objects.equals(this.mtime, changelistLins.mtime) &&
        Objects.equals(this.path, changelistLins.path) &&
        Objects.equals(this.size, changelistLins.size) &&
        Objects.equals(this.type, changelistLins.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atime, ctime, id, mtime, path, size, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelistLins {\n");
    
    sb.append("    atime: ").append(toIndentedString(atime)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
