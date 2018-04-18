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
 * CompatibilitiesSsdActiveActiveItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class CompatibilitiesSsdActiveActiveItem {
  @SerializedName("class_1")
  private String class1 = null;

  @SerializedName("count")
  private Boolean count = null;

  @SerializedName("id")
  private Integer id = null;

  public CompatibilitiesSsdActiveActiveItem class1(String class1) {
    this.class1 = class1;
    return this;
  }

   /**
   * The node class of an ssd compatibility
   * @return class1
  **/
  @ApiModelProperty(required = true, value = "The node class of an ssd compatibility")
  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }

  public CompatibilitiesSsdActiveActiveItem count(Boolean count) {
    this.count = count;
    return this;
  }

   /**
   * Is this SSD Compatibility Count Compatible.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Is this SSD Compatibility Count Compatible.")
  public Boolean isCount() {
    return count;
  }

  public void setCount(Boolean count) {
    this.count = count;
  }

  public CompatibilitiesSsdActiveActiveItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this ssd compatibility
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of this ssd compatibility")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilitiesSsdActiveActiveItem compatibilitiesSsdActiveActiveItem = (CompatibilitiesSsdActiveActiveItem) o;
    return Objects.equals(this.class1, compatibilitiesSsdActiveActiveItem.class1) &&
        Objects.equals(this.count, compatibilitiesSsdActiveActiveItem.count) &&
        Objects.equals(this.id, compatibilitiesSsdActiveActiveItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(class1, count, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesSsdActiveActiveItem {\n");
    
    sb.append("    class1: ").append(toIndentedString(class1)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

