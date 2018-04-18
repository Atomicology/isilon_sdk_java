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
import io.swagger.client.model.AuthNetgroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthNetgroups
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthNetgroups {
  @SerializedName("netgroups")
  private List<AuthNetgroup> netgroups = null;

  public AuthNetgroups netgroups(List<AuthNetgroup> netgroups) {
    this.netgroups = netgroups;
    return this;
  }

  public AuthNetgroups addNetgroupsItem(AuthNetgroup netgroupsItem) {
    if (this.netgroups == null) {
      this.netgroups = new ArrayList<AuthNetgroup>();
    }
    this.netgroups.add(netgroupsItem);
    return this;
  }

   /**
   * Get netgroups
   * @return netgroups
  **/
  @ApiModelProperty(value = "")
  public List<AuthNetgroup> getNetgroups() {
    return netgroups;
  }

  public void setNetgroups(List<AuthNetgroup> netgroups) {
    this.netgroups = netgroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNetgroups authNetgroups = (AuthNetgroups) o;
    return Objects.equals(this.netgroups, authNetgroups.netgroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netgroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNetgroups {\n");
    
    sb.append("    netgroups: ").append(toIndentedString(netgroups)).append("\n");
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
