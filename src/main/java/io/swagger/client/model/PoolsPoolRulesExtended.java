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
import io.swagger.client.model.PoolsPoolRules;
import io.swagger.client.model.PoolsPoolRulesRule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PoolsPoolRulesExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class PoolsPoolRulesExtended {
  @SerializedName("rules")
  private List<PoolsPoolRulesRule> rules = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public PoolsPoolRulesExtended rules(List<PoolsPoolRulesRule> rules) {
    this.rules = rules;
    return this;
  }

  public PoolsPoolRulesExtended addRulesItem(PoolsPoolRulesRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<PoolsPoolRulesRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")
  public List<PoolsPoolRulesRule> getRules() {
    return rules;
  }

  public void setRules(List<PoolsPoolRulesRule> rules) {
    this.rules = rules;
  }

  public PoolsPoolRulesExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
   * @return resume
  **/
  @ApiModelProperty(value = "Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public PoolsPoolRulesExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsPoolRulesExtended poolsPoolRulesExtended = (PoolsPoolRulesExtended) o;
    return Objects.equals(this.rules, poolsPoolRulesExtended.rules) &&
        Objects.equals(this.resume, poolsPoolRulesExtended.resume) &&
        Objects.equals(this.total, poolsPoolRulesExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsPoolRulesExtended {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

