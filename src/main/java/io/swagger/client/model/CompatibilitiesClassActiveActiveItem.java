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
 * CompatibilitiesClassActiveActiveItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CompatibilitiesClassActiveActiveItem {
  @SerializedName("class_1")
  private String class1 = null;

  @SerializedName("class_2")
  private String class2 = null;

  @SerializedName("id")
  private Integer id = null;

  public CompatibilitiesClassActiveActiveItem class1(String class1) {
    this.class1 = class1;
    return this;
  }

   /**
   * The first class in an active compatibility
   * @return class1
  **/
  @ApiModelProperty(required = true, value = "The first class in an active compatibility")
  public String getClass1() {
    return class1;
  }

  public void setClass1(String class1) {
    this.class1 = class1;
  }

  public CompatibilitiesClassActiveActiveItem class2(String class2) {
    this.class2 = class2;
    return this;
  }

   /**
   * The second class in an active compatibility
   * @return class2
  **/
  @ApiModelProperty(required = true, value = "The second class in an active compatibility")
  public String getClass2() {
    return class2;
  }

  public void setClass2(String class2) {
    this.class2 = class2;
  }

  public CompatibilitiesClassActiveActiveItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this active compatibility
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of this active compatibility")
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
    CompatibilitiesClassActiveActiveItem compatibilitiesClassActiveActiveItem = (CompatibilitiesClassActiveActiveItem) o;
    return Objects.equals(this.class1, compatibilitiesClassActiveActiveItem.class1) &&
        Objects.equals(this.class2, compatibilitiesClassActiveActiveItem.class2) &&
        Objects.equals(this.id, compatibilitiesClassActiveActiveItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(class1, class2, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesClassActiveActiveItem {\n");
    
    sb.append("    class1: ").append(toIndentedString(class1)).append("\n");
    sb.append("    class2: ").append(toIndentedString(class2)).append("\n");
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

