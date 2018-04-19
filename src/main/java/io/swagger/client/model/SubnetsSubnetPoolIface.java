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
 * SubnetsSubnetPoolIface
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SubnetsSubnetPoolIface {
  @SerializedName("iface")
  private String iface = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  public SubnetsSubnetPoolIface iface(String iface) {
    this.iface = iface;
    return this;
  }

   /**
   * A string that defines an interface name.
   * @return iface
  **/
  @ApiModelProperty(value = "A string that defines an interface name.")
  public String getIface() {
    return iface;
  }

  public void setIface(String iface) {
    this.iface = iface;
  }

  public SubnetsSubnetPoolIface lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * Logical Node Number.
   * @return lnn
  **/
  @ApiModelProperty(value = "Logical Node Number.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetsSubnetPoolIface subnetsSubnetPoolIface = (SubnetsSubnetPoolIface) o;
    return Objects.equals(this.iface, subnetsSubnetPoolIface.iface) &&
        Objects.equals(this.lnn, subnetsSubnetPoolIface.lnn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iface, lnn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetsSubnetPoolIface {\n");
    
    sb.append("    iface: ").append(toIndentedString(iface)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
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

