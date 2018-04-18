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
import io.swagger.client.model.TargetPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TargetPolicies
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class TargetPolicies {
  @SerializedName("policies")
  private List<TargetPolicy> policies = null;

  @SerializedName("resume")
  private String resume = null;

  public TargetPolicies policies(List<TargetPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public TargetPolicies addPoliciesItem(TargetPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<TargetPolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")
  public List<TargetPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<TargetPolicy> policies) {
    this.policies = policies;
  }

  public TargetPolicies resume(String resume) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetPolicies targetPolicies = (TargetPolicies) o;
    return Objects.equals(this.policies, targetPolicies.policies) &&
        Objects.equals(this.resume, targetPolicies.resume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies, resume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetPolicies {\n");
    
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
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

