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
 * CompatibilitiesClassActiveItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CompatibilitiesClassActiveItem {
  @SerializedName("assess")
  private Boolean assess = null;

  @SerializedName("class_1")
  private String class1 = null;

  @SerializedName("class_2")
  private String class2 = null;

  public CompatibilitiesClassActiveItem assess(Boolean assess) {
    this.assess = assess;
    return this;
  }

   /**
   * Do not create compatibility, only assess if creation is possible.
   * @return assess
  **/
  @ApiModelProperty(value = "Do not create compatibility, only assess if creation is possible.")
  public Boolean isAssess() {
    return assess;
  }

  public void setAssess(Boolean assess) {
    this.assess = assess;
  }

  public CompatibilitiesClassActiveItem class1(String class1) {
    this.class1 = class1;
    return this;
  }

   /**
   * The first class in the desired compatibility
   * @return class1
  **/
  @ApiModelProperty(required = true, value = "The first class in the desired compatibility")
  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }

  public CompatibilitiesClassActiveItem class2(String class2) {
    this.class2 = class2;
    return this;
  }

   /**
   * The second class in the desired compatibility
   * @return class2
  **/
  @ApiModelProperty(required = true, value = "The second class in the desired compatibility")
  public String getClass2() {
    return class2;
  }

  public void setClass2(String class2) {
    this.class2 = class2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompatibilitiesClassActiveItem compatibilitiesClassActiveItem = (CompatibilitiesClassActiveItem) o;
    return Objects.equals(this.assess, compatibilitiesClassActiveItem.assess) &&
        Objects.equals(this.class1, compatibilitiesClassActiveItem.class1) &&
        Objects.equals(this.class2, compatibilitiesClassActiveItem.class2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assess, class1, class2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesClassActiveItem {\n");
    
    sb.append("    assess: ").append(toIndentedString(assess)).append("\n");
    sb.append("    class1: ").append(toIndentedString(class1)).append("\n");
    sb.append("    class2: ").append(toIndentedString(class2)).append("\n");
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

