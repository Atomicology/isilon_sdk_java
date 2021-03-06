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
 * A software patch that can be applied to OneFS.
 */
@ApiModel(description = "A software patch that can be applied to OneFS.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ClusterPatchPatch {
  @SerializedName("location")
  private String location = null;

  @SerializedName("patch")
  private String patch = null;

  public ClusterPatchPatch location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The path location of the patch file.
   * @return location
  **/
  @ApiModelProperty(value = "The path location of the patch file.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ClusterPatchPatch patch(String patch) {
    this.patch = patch;
    return this;
  }

   /**
   * The id or filename of the patch to install.
   * @return patch
  **/
  @ApiModelProperty(required = true, value = "The id or filename of the patch to install.")
  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterPatchPatch clusterPatchPatch = (ClusterPatchPatch) o;
    return Objects.equals(this.location, clusterPatchPatch.location) &&
        Objects.equals(this.patch, clusterPatchPatch.patch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, patch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPatchPatch {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
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

