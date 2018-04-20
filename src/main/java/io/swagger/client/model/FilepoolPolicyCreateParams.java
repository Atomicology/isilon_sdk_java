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
import io.swagger.client.model.FilepoolPolicyActionCreateParams;
import io.swagger.client.model.FilepoolPolicyFileMatchingPattern;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A filepool policy object
 */
@ApiModel(description = "A filepool policy object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class FilepoolPolicyCreateParams {
  @SerializedName("actions")
  private List<FilepoolPolicyActionCreateParams> actions = null;

  @SerializedName("apply_order")
  private Integer applyOrder = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("file_matching_pattern")
  private FilepoolPolicyFileMatchingPattern fileMatchingPattern = null;

  @SerializedName("name")
  private String name = null;

  public FilepoolPolicyCreateParams actions(List<FilepoolPolicyActionCreateParams> actions) {
    this.actions = actions;
    return this;
  }

  public FilepoolPolicyCreateParams addActionsItem(FilepoolPolicyActionCreateParams actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<FilepoolPolicyActionCreateParams>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * A list of actions to be taken for matching files
   * @return actions
  **/
  @ApiModelProperty(value = "A list of actions to be taken for matching files")
  public List<FilepoolPolicyActionCreateParams> getActions() {
    return actions;
  }

  public void setActions(List<FilepoolPolicyActionCreateParams> actions) {
    this.actions = actions;
  }

  public FilepoolPolicyCreateParams applyOrder(Integer applyOrder) {
    this.applyOrder = applyOrder;
    return this;
  }

   /**
   * The order in which this policy should be applied (relative to other policies)
   * @return applyOrder
  **/
  @ApiModelProperty(value = "The order in which this policy should be applied (relative to other policies)")
  public Integer getApplyOrder() {
    return applyOrder;
  }

  public void setApplyOrder(Integer applyOrder) {
    this.applyOrder = applyOrder;
  }

  public FilepoolPolicyCreateParams description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for this policy
   * @return description
  **/
  @ApiModelProperty(value = "A description for this policy")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FilepoolPolicyCreateParams fileMatchingPattern(FilepoolPolicyFileMatchingPattern fileMatchingPattern) {
    this.fileMatchingPattern = fileMatchingPattern;
    return this;
  }

   /**
   * The file matching rules for this policy
   * @return fileMatchingPattern
  **/
  @ApiModelProperty(required = true, value = "The file matching rules for this policy")
  public FilepoolPolicyFileMatchingPattern getFileMatchingPattern() {
    return fileMatchingPattern;
  }

  public void setFileMatchingPattern(FilepoolPolicyFileMatchingPattern fileMatchingPattern) {
    this.fileMatchingPattern = fileMatchingPattern;
  }

  public FilepoolPolicyCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique name for this policy
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A unique name for this policy")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilepoolPolicyCreateParams filepoolPolicyCreateParams = (FilepoolPolicyCreateParams) o;
    return Objects.equals(this.actions, filepoolPolicyCreateParams.actions) &&
        Objects.equals(this.applyOrder, filepoolPolicyCreateParams.applyOrder) &&
        Objects.equals(this.description, filepoolPolicyCreateParams.description) &&
        Objects.equals(this.fileMatchingPattern, filepoolPolicyCreateParams.fileMatchingPattern) &&
        Objects.equals(this.name, filepoolPolicyCreateParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, applyOrder, description, fileMatchingPattern, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilepoolPolicyCreateParams {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    applyOrder: ").append(toIndentedString(applyOrder)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileMatchingPattern: ").append(toIndentedString(fileMatchingPattern)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

