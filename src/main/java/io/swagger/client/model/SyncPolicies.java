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
import io.swagger.client.model.SyncPolicyExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SyncPolicies
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SyncPolicies {
  @SerializedName("policies")
  private List<SyncPolicyExtended> policies = null;

  public SyncPolicies policies(List<SyncPolicyExtended> policies) {
    this.policies = policies;
    return this;
  }

  public SyncPolicies addPoliciesItem(SyncPolicyExtended policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<SyncPolicyExtended>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")
  public List<SyncPolicyExtended> getPolicies() {
    return policies;
  }

  public void setPolicies(List<SyncPolicyExtended> policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncPolicies syncPolicies = (SyncPolicies) o;
    return Objects.equals(this.policies, syncPolicies.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncPolicies {\n");
    
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

