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
 * CloudJobFilesName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CloudJobFilesName {
  @SerializedName("name")
  private String name = null;

  @SerializedName("state")
  private String state = null;

  public CloudJobFilesName name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full path name of a file to be acted on by this job
   * @return name
  **/
  @ApiModelProperty(value = "The full path name of a file to be acted on by this job")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudJobFilesName state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of this file
   * @return state
  **/
  @ApiModelProperty(value = "The current state of this file")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudJobFilesName cloudJobFilesName = (CloudJobFilesName) o;
    return Objects.equals(this.name, cloudJobFilesName.name) &&
        Objects.equals(this.state, cloudJobFilesName.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudJobFilesName {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

