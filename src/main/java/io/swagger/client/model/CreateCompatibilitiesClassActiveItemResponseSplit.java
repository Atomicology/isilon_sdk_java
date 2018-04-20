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
 * CreateCompatibilitiesClassActiveItemResponseSplit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CreateCompatibilitiesClassActiveItemResponseSplit {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tier_name")
  private String tierName = null;

  public CreateCompatibilitiesClassActiveItemResponseSplit id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The nodepool id that will be split
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The nodepool id that will be split")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CreateCompatibilitiesClassActiveItemResponseSplit name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The nodepool name that will be split
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The nodepool name that will be split")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCompatibilitiesClassActiveItemResponseSplit tierName(String tierName) {
    this.tierName = tierName;
    return this;
  }

   /**
   * A message explaining how the nodepools tier membership will change.
   * @return tierName
  **/
  @ApiModelProperty(required = true, value = "A message explaining how the nodepools tier membership will change.")
  public String getTierName() {
    return tierName;
  }

  public void setTierName(String tierName) {
    this.tierName = tierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompatibilitiesClassActiveItemResponseSplit createCompatibilitiesClassActiveItemResponseSplit = (CreateCompatibilitiesClassActiveItemResponseSplit) o;
    return Objects.equals(this.id, createCompatibilitiesClassActiveItemResponseSplit.id) &&
        Objects.equals(this.name, createCompatibilitiesClassActiveItemResponseSplit.name) &&
        Objects.equals(this.tierName, createCompatibilitiesClassActiveItemResponseSplit.tierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompatibilitiesClassActiveItemResponseSplit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tierName: ").append(toIndentedString(tierName)).append("\n");
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

