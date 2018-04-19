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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateCompatibilitiesClassActiveItemResponseMerge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class CreateCompatibilitiesClassActiveItemResponseMerge {
  @SerializedName("ids")
  private List<Integer> ids = new ArrayList<Integer>();

  @SerializedName("names")
  private List<String> names = new ArrayList<String>();

  @SerializedName("result_name")
  private String resultName = null;

  public CreateCompatibilitiesClassActiveItemResponseMerge ids(List<Integer> ids) {
    this.ids = ids;
    return this;
  }

  public CreateCompatibilitiesClassActiveItemResponseMerge addIdsItem(Integer idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The nodepool ids that will be merged
   * @return ids
  **/
  @ApiModelProperty(required = true, value = "The nodepool ids that will be merged")
  public List<Integer> getIds() {
    return ids;
  }

  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }

  public CreateCompatibilitiesClassActiveItemResponseMerge names(List<String> names) {
    this.names = names;
    return this;
  }

  public CreateCompatibilitiesClassActiveItemResponseMerge addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * The nodepool names that will be merged, in the sameorder as the ids
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The nodepool names that will be merged, in the sameorder as the ids")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public CreateCompatibilitiesClassActiveItemResponseMerge resultName(String resultName) {
    this.resultName = resultName;
    return this;
  }

   /**
   * The name of the nodepool all others will merge into
   * @return resultName
  **/
  @ApiModelProperty(required = true, value = "The name of the nodepool all others will merge into")
  public String getResultName() {
    return resultName;
  }

  public void setResultName(String resultName) {
    this.resultName = resultName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompatibilitiesClassActiveItemResponseMerge createCompatibilitiesClassActiveItemResponseMerge = (CreateCompatibilitiesClassActiveItemResponseMerge) o;
    return Objects.equals(this.ids, createCompatibilitiesClassActiveItemResponseMerge.ids) &&
        Objects.equals(this.names, createCompatibilitiesClassActiveItemResponseMerge.names) &&
        Objects.equals(this.resultName, createCompatibilitiesClassActiveItemResponseMerge.resultName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, names, resultName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompatibilitiesClassActiveItemResponseMerge {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
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

