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
import io.swagger.client.model.GroupnetSubnetExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GroupnetSubnets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class GroupnetSubnets {
  @SerializedName("subnets")
  private List<GroupnetSubnetExtended> subnets = null;

  public GroupnetSubnets subnets(List<GroupnetSubnetExtended> subnets) {
    this.subnets = subnets;
    return this;
  }

  public GroupnetSubnets addSubnetsItem(GroupnetSubnetExtended subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<GroupnetSubnetExtended>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @ApiModelProperty(value = "")
  public List<GroupnetSubnetExtended> getSubnets() {
    return subnets;
  }

  public void setSubnets(List<GroupnetSubnetExtended> subnets) {
    this.subnets = subnets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupnetSubnets groupnetSubnets = (GroupnetSubnets) o;
    return Objects.equals(this.subnets, groupnetSubnets.subnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupnetSubnets {\n");
    
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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

