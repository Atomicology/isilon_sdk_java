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
import io.swagger.client.model.MappingUsersRulesParameters;
import io.swagger.client.model.MappingUsersRulesRuleExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies the properties for user mapping rules.
 */
@ApiModel(description = "Specifies the properties for user mapping rules.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class MappingUsersRulesExtended {
  @SerializedName("parameters")
  private MappingUsersRulesParameters parameters = null;

  @SerializedName("rules")
  private List<MappingUsersRulesRuleExtended> rules = null;

  public MappingUsersRulesExtended parameters(MappingUsersRulesParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Specifies the default UNIX user information that can be applied if the final credentials do not have valid UID and GID information.
   * @return parameters
  **/
  @ApiModelProperty(value = "Specifies the default UNIX user information that can be applied if the final credentials do not have valid UID and GID information.")
  public MappingUsersRulesParameters getParameters() {
    return parameters;
  }

  public void setParameters(MappingUsersRulesParameters parameters) {
    this.parameters = parameters;
  }

  public MappingUsersRulesExtended rules(List<MappingUsersRulesRuleExtended> rules) {
    this.rules = rules;
    return this;
  }

  public MappingUsersRulesExtended addRulesItem(MappingUsersRulesRuleExtended rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<MappingUsersRulesRuleExtended>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Specifies the list of user mapping rules.
   * @return rules
  **/
  @ApiModelProperty(value = "Specifies the list of user mapping rules.")
  public List<MappingUsersRulesRuleExtended> getRules() {
    return rules;
  }

  public void setRules(List<MappingUsersRulesRuleExtended> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersRulesExtended mappingUsersRulesExtended = (MappingUsersRulesExtended) o;
    return Objects.equals(this.parameters, mappingUsersRulesExtended.parameters) &&
        Objects.equals(this.rules, mappingUsersRulesExtended.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersRulesExtended {\n");
    
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

