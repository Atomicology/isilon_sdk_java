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
 * IdResolutionPath
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class IdResolutionPath {
  @SerializedName("lin")
  private String lin = null;

  @SerializedName("path")
  private String path = null;

  public IdResolutionPath lin(String lin) {
    this.lin = lin;
    return this;
  }

   /**
   * Logical Inode Number (LIN). A 64-bit number which uniquely identifies a file throughout its life.
   * @return lin
  **/
  @ApiModelProperty(value = "Logical Inode Number (LIN). A 64-bit number which uniquely identifies a file throughout its life.")
  public String getLin() {
    return lin;
  }

  public void setLin(String lin) {
    this.lin = lin;
  }

  public IdResolutionPath path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The full path associated with the lin. null if the lin cannot be resolved to a path.
   * @return path
  **/
  @ApiModelProperty(value = "The full path associated with the lin. null if the lin cannot be resolved to a path.")
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
    IdResolutionPath idResolutionPath = (IdResolutionPath) o;
    return Objects.equals(this.lin, idResolutionPath.lin) &&
        Objects.equals(this.path, idResolutionPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lin, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdResolutionPath {\n");
    
    sb.append("    lin: ").append(toIndentedString(lin)).append("\n");
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

