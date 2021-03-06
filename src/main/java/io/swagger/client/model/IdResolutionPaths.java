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
import io.swagger.client.model.IdResolutionPath;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdResolutionPaths
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class IdResolutionPaths {
  @SerializedName("paths")
  private List<IdResolutionPath> paths = null;

  public IdResolutionPaths paths(List<IdResolutionPath> paths) {
    this.paths = paths;
    return this;
  }

  public IdResolutionPaths addPathsItem(IdResolutionPath pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<IdResolutionPath>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * Get paths
   * @return paths
  **/
  @ApiModelProperty(value = "")
  public List<IdResolutionPath> getPaths() {
    return paths;
  }

  public void setPaths(List<IdResolutionPath> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdResolutionPaths idResolutionPaths = (IdResolutionPaths) o;
    return Objects.equals(this.paths, idResolutionPaths.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdResolutionPaths {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

