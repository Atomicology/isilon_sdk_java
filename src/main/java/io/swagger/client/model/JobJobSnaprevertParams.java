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
 * JobJobSnaprevertParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class JobJobSnaprevertParams {
  @SerializedName("snapid")
  private Integer snapid = null;

  public JobJobSnaprevertParams snapid(Integer snapid) {
    this.snapid = snapid;
    return this;
  }

   /**
   * Snapshot to revert.
   * minimum: 1
   * @return snapid
  **/
  @ApiModelProperty(required = true, value = "Snapshot to revert.")
  public Integer getSnapid() {
    return snapid;
  }

  public void setSnapid(Integer snapid) {
    this.snapid = snapid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobJobSnaprevertParams jobJobSnaprevertParams = (JobJobSnaprevertParams) o;
    return Objects.equals(this.snapid, jobJobSnaprevertParams.snapid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobJobSnaprevertParams {\n");
    
    sb.append("    snapid: ").append(toIndentedString(snapid)).append("\n");
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

