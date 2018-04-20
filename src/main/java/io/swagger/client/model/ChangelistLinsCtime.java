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
 * ChangelistLinsCtime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ChangelistLinsCtime {
  @SerializedName("nsec")
  private Integer nsec = null;

  @SerializedName("sec")
  private Integer sec = null;

  public ChangelistLinsCtime nsec(Integer nsec) {
    this.nsec = nsec;
    return this;
  }

   /**
   * Nanoseconds component of timespec.
   * @return nsec
  **/
  @ApiModelProperty(value = "Nanoseconds component of timespec.")
  public Integer getNsec() {
    return nsec;
  }

  public void setNsec(Integer nsec) {
    this.nsec = nsec;
  }

  public ChangelistLinsCtime sec(Integer sec) {
    this.sec = sec;
    return this;
  }

   /**
   * Seconds component of timespec.
   * @return sec
  **/
  @ApiModelProperty(required = true, value = "Seconds component of timespec.")
  public Integer getSec() {
    return sec;
  }

  public void setSec(Integer sec) {
    this.sec = sec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangelistLinsCtime changelistLinsCtime = (ChangelistLinsCtime) o;
    return Objects.equals(this.nsec, changelistLinsCtime.nsec) &&
        Objects.equals(this.sec, changelistLinsCtime.sec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsec, sec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangelistLinsCtime {\n");
    
    sb.append("    nsec: ").append(toIndentedString(nsec)).append("\n");
    sb.append("    sec: ").append(toIndentedString(sec)).append("\n");
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

