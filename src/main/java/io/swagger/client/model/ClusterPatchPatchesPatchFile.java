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
 * ClusterPatchPatchesPatchFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterPatchPatchesPatchFile {
  @SerializedName("md5")
  private String md5 = null;

  @SerializedName("path")
  private String path = null;

  public ClusterPatchPatchesPatchFile md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * The md5 checksum of the file.
   * @return md5
  **/
  @ApiModelProperty(value = "The md5 checksum of the file.")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public ClusterPatchPatchesPatchFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path of the file.
   * @return path
  **/
  @ApiModelProperty(value = "The path of the file.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterPatchPatchesPatchFile clusterPatchPatchesPatchFile = (ClusterPatchPatchesPatchFile) o;
    return Objects.equals(this.md5, clusterPatchPatchesPatchFile.md5) &&
        Objects.equals(this.path, clusterPatchPatchesPatchFile.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(md5, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPatchPatchesPatchFile {\n");
    
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

