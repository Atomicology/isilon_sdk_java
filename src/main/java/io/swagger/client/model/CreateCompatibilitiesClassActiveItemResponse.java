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
import io.swagger.client.model.CreateCompatibilitiesClassActiveItemResponseMerge;
import io.swagger.client.model.CreateCompatibilitiesClassActiveItemResponseSplit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateCompatibilitiesClassActiveItemResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CreateCompatibilitiesClassActiveItemResponse {
  @SerializedName("merges")
  private List<CreateCompatibilitiesClassActiveItemResponseMerge> merges = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("splits")
  private List<CreateCompatibilitiesClassActiveItemResponseSplit> splits = null;

  public CreateCompatibilitiesClassActiveItemResponse merges(List<CreateCompatibilitiesClassActiveItemResponseMerge> merges) {
    this.merges = merges;
    return this;
  }

  public CreateCompatibilitiesClassActiveItemResponse addMergesItem(CreateCompatibilitiesClassActiveItemResponseMerge mergesItem) {
    if (this.merges == null) {
      this.merges = new ArrayList<CreateCompatibilitiesClassActiveItemResponseMerge>();
    }
    this.merges.add(mergesItem);
    return this;
  }

   /**
   * A list of all merges that will occur given this compatibility operation
   * @return merges
  **/
  @ApiModelProperty(value = "A list of all merges that will occur given this compatibility operation")
  public List<CreateCompatibilitiesClassActiveItemResponseMerge> getMerges() {
    return merges;
  }

  public void setMerges(List<CreateCompatibilitiesClassActiveItemResponseMerge> merges) {
    this.merges = merges;
  }

  public CreateCompatibilitiesClassActiveItemResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A string describing the effects of the compatibility operation.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A string describing the effects of the compatibility operation.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateCompatibilitiesClassActiveItemResponse splits(List<CreateCompatibilitiesClassActiveItemResponseSplit> splits) {
    this.splits = splits;
    return this;
  }

  public CreateCompatibilitiesClassActiveItemResponse addSplitsItem(CreateCompatibilitiesClassActiveItemResponseSplit splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<CreateCompatibilitiesClassActiveItemResponseSplit>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * A list of all splits that will occur given this compatibility operation
   * @return splits
  **/
  @ApiModelProperty(value = "A list of all splits that will occur given this compatibility operation")
  public List<CreateCompatibilitiesClassActiveItemResponseSplit> getSplits() {
    return splits;
  }

  public void setSplits(List<CreateCompatibilitiesClassActiveItemResponseSplit> splits) {
    this.splits = splits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompatibilitiesClassActiveItemResponse createCompatibilitiesClassActiveItemResponse = (CreateCompatibilitiesClassActiveItemResponse) o;
    return Objects.equals(this.merges, createCompatibilitiesClassActiveItemResponse.merges) &&
        Objects.equals(this.message, createCompatibilitiesClassActiveItemResponse.message) &&
        Objects.equals(this.splits, createCompatibilitiesClassActiveItemResponse.splits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merges, message, splits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompatibilitiesClassActiveItemResponse {\n");
    
    sb.append("    merges: ").append(toIndentedString(merges)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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

