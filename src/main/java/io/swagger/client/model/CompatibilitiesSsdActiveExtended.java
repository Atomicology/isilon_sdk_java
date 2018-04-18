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
import io.swagger.client.model.CompatibilitiesSsdActive;
import io.swagger.client.model.CompatibilitiesSsdActiveActiveItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CompatibilitiesSsdActiveExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class CompatibilitiesSsdActiveExtended {
  @SerializedName("active")
  private List<CompatibilitiesSsdActiveActiveItem> active = null;

  @SerializedName("total")
  private Integer total = null;

  public CompatibilitiesSsdActiveExtended active(List<CompatibilitiesSsdActiveActiveItem> active) {
    this.active = active;
    return this;
  }

  public CompatibilitiesSsdActiveExtended addActiveItem(CompatibilitiesSsdActiveActiveItem activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<CompatibilitiesSsdActiveActiveItem>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public List<CompatibilitiesSsdActiveActiveItem> getActive() {
    return active;
  }

  public void setActive(List<CompatibilitiesSsdActiveActiveItem> active) {
    this.active = active;
  }

  public CompatibilitiesSsdActiveExtended total(Integer total) {
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
    CompatibilitiesSsdActiveExtended compatibilitiesSsdActiveExtended = (CompatibilitiesSsdActiveExtended) o;
    return Objects.equals(this.active, compatibilitiesSsdActiveExtended.active) &&
        Objects.equals(this.total, compatibilitiesSsdActiveExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesSsdActiveExtended {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

