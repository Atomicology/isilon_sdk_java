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
import java.util.ArrayList;
import java.util.List;

/**
 * Dedupe settings.
 */
@ApiModel(description = "Dedupe settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class DedupeSettingsExtended {
  @SerializedName("assess_paths")
  private List<String> assessPaths = null;

  @SerializedName("paths")
  private List<String> paths = null;

  public DedupeSettingsExtended assessPaths(List<String> assessPaths) {
    this.assessPaths = assessPaths;
    return this;
  }

  public DedupeSettingsExtended addAssessPathsItem(String assessPathsItem) {
    if (this.assessPaths == null) {
      this.assessPaths = new ArrayList<String>();
    }
    this.assessPaths.add(assessPathsItem);
    return this;
  }

   /**
   * The paths that will be assessed.
   * @return assessPaths
  **/
  @ApiModelProperty(value = "The paths that will be assessed.")
  public List<String> getAssessPaths() {
    return assessPaths;
  }

  public void setAssessPaths(List<String> assessPaths) {
    this.assessPaths = assessPaths;
  }

  public DedupeSettingsExtended paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public DedupeSettingsExtended addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * The paths that will be deduped.
   * @return paths
  **/
  @ApiModelProperty(value = "The paths that will be deduped.")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
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
    DedupeSettingsExtended dedupeSettingsExtended = (DedupeSettingsExtended) o;
    return Objects.equals(this.assessPaths, dedupeSettingsExtended.assessPaths) &&
        Objects.equals(this.paths, dedupeSettingsExtended.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessPaths, paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DedupeSettingsExtended {\n");
    
    sb.append("    assessPaths: ").append(toIndentedString(assessPaths)).append("\n");
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
