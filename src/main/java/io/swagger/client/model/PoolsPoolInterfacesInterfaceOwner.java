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
 * PoolsPoolInterfacesInterfaceOwner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class PoolsPoolInterfacesInterfaceOwner {
  @SerializedName("groupnet")
  private String groupnet = null;

  @SerializedName("pool")
  private String pool = null;

  @SerializedName("subnet")
  private String subnet = null;

  public PoolsPoolInterfacesInterfaceOwner groupnet(String groupnet) {
    this.groupnet = groupnet;
    return this;
  }

   /**
   * Get groupnet
   * @return groupnet
  **/
  @ApiModelProperty(value = "")
  public String getGroupnet() {
    return groupnet;
  }

  public void setGroupnet(String groupnet) {
    this.groupnet = groupnet;
  }

  public PoolsPoolInterfacesInterfaceOwner pool(String pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @ApiModelProperty(value = "")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public PoolsPoolInterfacesInterfaceOwner subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

   /**
   * Get subnet
   * @return subnet
  **/
  @ApiModelProperty(value = "")
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsPoolInterfacesInterfaceOwner poolsPoolInterfacesInterfaceOwner = (PoolsPoolInterfacesInterfaceOwner) o;
    return Objects.equals(this.groupnet, poolsPoolInterfacesInterfaceOwner.groupnet) &&
        Objects.equals(this.pool, poolsPoolInterfacesInterfaceOwner.pool) &&
        Objects.equals(this.subnet, poolsPoolInterfacesInterfaceOwner.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupnet, pool, subnet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsPoolInterfacesInterfaceOwner {\n");
    
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
