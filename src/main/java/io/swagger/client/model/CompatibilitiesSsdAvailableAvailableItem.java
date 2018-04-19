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
 * CompatibilitiesSsdAvailableAvailableItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class CompatibilitiesSsdAvailableAvailableItem {
  @SerializedName("class_1")
  private String class1 = null;

  @SerializedName("id")
  private Integer id = null;

  public CompatibilitiesSsdAvailableAvailableItem class1(String class1) {
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

  public CompatibilitiesSsdAvailableAvailableItem id(Integer id) {
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
    CompatibilitiesSsdAvailableAvailableItem compatibilitiesSsdAvailableAvailableItem = (CompatibilitiesSsdAvailableAvailableItem) o;
    return Objects.equals(this.class1, compatibilitiesSsdAvailableAvailableItem.class1) &&
        Objects.equals(this.id, compatibilitiesSsdAvailableAvailableItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(class1, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompatibilitiesSsdAvailableAvailableItem {\n");
    
    sb.append("    class1: ").append(toIndentedString(class1)).append("\n");
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

