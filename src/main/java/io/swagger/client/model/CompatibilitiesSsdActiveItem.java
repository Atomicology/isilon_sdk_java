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
 * CompatibilitiesSsdActiveItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CompatibilitiesSsdActiveItem {
  @SerializedName("assess")
  private Boolean assess = null;

  @SerializedName("class_1")
  private String class1 = null;

  @SerializedName("class_2")
  private String class2 = null;

  @SerializedName("count")
  private Boolean count = null;

  public CompatibilitiesSsdActiveItem assess(Boolean assess) {
    this.assess = assess;
    return this;
  }

   /**
   * Do not create ssd compatibility, only assess if creation is possible.
   * @return assess
  **/
  @ApiModelProperty(value = "Do not create ssd compatibility, only assess if creation is possible.")
  public Boolean isAssess() {
    return assess;
  }

  public void setAssess(Boolean assess) {
    this.assess = assess;
  }

  public CompatibilitiesSsdActiveItem class1(String class1) {
    this.class1 = class1;
    return this;
  }

   /**
   * The node class of the desired ssd compatibility
   * @return class1
  **/
  @ApiModelProperty(required = true, value = "The node class of the desired ssd compatibility")
  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }

  public CompatibilitiesSsdActiveItem class2(String class2) {
    this.class2 = class2;
    return this;
  }

   /**
   * The optional second node class to turn on ssd compatibility
   * @return class2
  **/
  @ApiModelProperty(value = "The optional second node class to turn on ssd compatibility")
  public String getClass2() {
    return class2;
  }

  public void setClass2(String class2) {
    this.class2 = class2;
  }

  public CompatibilitiesSsdActiveItem count(Boolean count) {
    this.count = count;
    return this;
  }

   /**
   * Is this SSD Compatibility Count Compatible.
   * @return count
  **/
  @ApiModelProperty(value = "Is this SSD Compatibility Count Compatible.")
  public Boolean isCount() {
    return count;
  }

  public void setCount(Boolean count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilitiesSsdActiveItem compatibilitiesSsdActiveItem = (CompatibilitiesSsdActiveItem) o;
    return Objects.equals(this.assess, compatibilitiesSsdActiveItem.assess) &&
        Objects.equals(this.class1, compatibilitiesSsdActiveItem.class1) &&
        Objects.equals(this.class2, compatibilitiesSsdActiveItem.class2) &&
        Objects.equals(this.count, compatibilitiesSsdActiveItem.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assess, class1, class2, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesSsdActiveItem {\n");
    
    sb.append("    assess: ").append(toIndentedString(assess)).append("\n");
    sb.append("    class1: ").append(toIndentedString(class1)).append("\n");
    sb.append("    class2: ").append(toIndentedString(class2)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

