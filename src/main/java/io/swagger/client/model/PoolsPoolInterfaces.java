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
import io.swagger.client.model.PoolsPoolInterfacesInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PoolsPoolInterfaces
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class PoolsPoolInterfaces {
  @SerializedName("interfaces")
  private List<PoolsPoolInterfacesInterface> interfaces = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public PoolsPoolInterfaces interfaces(List<PoolsPoolInterfacesInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  public PoolsPoolInterfaces addInterfacesItem(PoolsPoolInterfacesInterface interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<PoolsPoolInterfacesInterface>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }

   /**
   * Get interfaces
   * @return interfaces
  **/
  @ApiModelProperty(value = "")
  public List<PoolsPoolInterfacesInterface> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(List<PoolsPoolInterfacesInterface> interfaces) {
    this.interfaces = interfaces;
  }

  public PoolsPoolInterfaces resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public PoolsPoolInterfaces total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsPoolInterfaces poolsPoolInterfaces = (PoolsPoolInterfaces) o;
    return Objects.equals(this.interfaces, poolsPoolInterfaces.interfaces) &&
        Objects.equals(this.resume, poolsPoolInterfaces.resume) &&
        Objects.equals(this.total, poolsPoolInterfaces.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaces, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsPoolInterfaces {\n");
    
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

