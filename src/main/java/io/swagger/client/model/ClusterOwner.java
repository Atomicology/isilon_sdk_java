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
 * Cluster contact info settings.
 */
@ApiModel(description = "Cluster contact info settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterOwner {
  @SerializedName("company")
  private String company = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("primary_email")
  private String primaryEmail = null;

  @SerializedName("primary_name")
  private String primaryName = null;

  @SerializedName("primary_phone1")
  private String primaryPhone1 = null;

  @SerializedName("primary_phone2")
  private String primaryPhone2 = null;

  @SerializedName("secondary_email")
  private String secondaryEmail = null;

  @SerializedName("secondary_name")
  private String secondaryName = null;

  @SerializedName("secondary_phone1")
  private String secondaryPhone1 = null;

  @SerializedName("secondary_phone2")
  private String secondaryPhone2 = null;

  public ClusterOwner company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Cluster owner company name.
   * @return company
  **/
  @ApiModelProperty(value = "Cluster owner company name.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ClusterOwner location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Cluster owner location.
   * @return location
  **/
  @ApiModelProperty(value = "Cluster owner location.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ClusterOwner primaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * Cluster owner primary email address.
   * @return primaryEmail
  **/
  @ApiModelProperty(value = "Cluster owner primary email address.")
  public String getPrimaryEmail() {
    return primaryEmail;
  }

  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  public ClusterOwner primaryName(String primaryName) {
    this.primaryName = primaryName;
    return this;
  }

   /**
   * Cluster owner primary contact name.
   * @return primaryName
  **/
  @ApiModelProperty(value = "Cluster owner primary contact name.")
  public String getPrimaryName() {
    return primaryName;
  }

  public void setPrimaryName(String primaryName) {
    this.primaryName = primaryName;
  }

  public ClusterOwner primaryPhone1(String primaryPhone1) {
    this.primaryPhone1 = primaryPhone1;
    return this;
  }

   /**
   * Cluster owner primary contact phone number 1.
   * @return primaryPhone1
  **/
  @ApiModelProperty(value = "Cluster owner primary contact phone number 1.")
  public String getPrimaryPhone1() {
    return primaryPhone1;
  }

  public void setPrimaryPhone1(String primaryPhone1) {
    this.primaryPhone1 = primaryPhone1;
  }

  public ClusterOwner primaryPhone2(String primaryPhone2) {
    this.primaryPhone2 = primaryPhone2;
    return this;
  }

   /**
   * Cluster owner primary contact phone number 2.
   * @return primaryPhone2
  **/
  @ApiModelProperty(value = "Cluster owner primary contact phone number 2.")
  public String getPrimaryPhone2() {
    return primaryPhone2;
  }

  public void setPrimaryPhone2(String primaryPhone2) {
    this.primaryPhone2 = primaryPhone2;
  }

  public ClusterOwner secondaryEmail(String secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
    return this;
  }

   /**
   * Cluster owner secondary email address.
   * @return secondaryEmail
  **/
  @ApiModelProperty(value = "Cluster owner secondary email address.")
  public String getSecondaryEmail() {
    return secondaryEmail;
  }

  public void setSecondaryEmail(String secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
  }

  public ClusterOwner secondaryName(String secondaryName) {
    this.secondaryName = secondaryName;
    return this;
  }

   /**
   * Cluster owner secondary contact name.
   * @return secondaryName
  **/
  @ApiModelProperty(value = "Cluster owner secondary contact name.")
  public String getSecondaryName() {
    return secondaryName;
  }

  public void setSecondaryName(String secondaryName) {
    this.secondaryName = secondaryName;
  }

  public ClusterOwner secondaryPhone1(String secondaryPhone1) {
    this.secondaryPhone1 = secondaryPhone1;
    return this;
  }

   /**
   * Cluster owner secondary contact phone number 1.
   * @return secondaryPhone1
  **/
  @ApiModelProperty(value = "Cluster owner secondary contact phone number 1.")
  public String getSecondaryPhone1() {
    return secondaryPhone1;
  }

  public void setSecondaryPhone1(String secondaryPhone1) {
    this.secondaryPhone1 = secondaryPhone1;
  }

  public ClusterOwner secondaryPhone2(String secondaryPhone2) {
    this.secondaryPhone2 = secondaryPhone2;
    return this;
  }

   /**
   * Cluster owner secondary contact phone number 2.
   * @return secondaryPhone2
  **/
  @ApiModelProperty(value = "Cluster owner secondary contact phone number 2.")
  public String getSecondaryPhone2() {
    return secondaryPhone2;
  }

  public void setSecondaryPhone2(String secondaryPhone2) {
    this.secondaryPhone2 = secondaryPhone2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterOwner clusterOwner = (ClusterOwner) o;
    return Objects.equals(this.company, clusterOwner.company) &&
        Objects.equals(this.location, clusterOwner.location) &&
        Objects.equals(this.primaryEmail, clusterOwner.primaryEmail) &&
        Objects.equals(this.primaryName, clusterOwner.primaryName) &&
        Objects.equals(this.primaryPhone1, clusterOwner.primaryPhone1) &&
        Objects.equals(this.primaryPhone2, clusterOwner.primaryPhone2) &&
        Objects.equals(this.secondaryEmail, clusterOwner.secondaryEmail) &&
        Objects.equals(this.secondaryName, clusterOwner.secondaryName) &&
        Objects.equals(this.secondaryPhone1, clusterOwner.secondaryPhone1) &&
        Objects.equals(this.secondaryPhone2, clusterOwner.secondaryPhone2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, location, primaryEmail, primaryName, primaryPhone1, primaryPhone2, secondaryEmail, secondaryName, secondaryPhone1, secondaryPhone2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterOwner {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    primaryName: ").append(toIndentedString(primaryName)).append("\n");
    sb.append("    primaryPhone1: ").append(toIndentedString(primaryPhone1)).append("\n");
    sb.append("    primaryPhone2: ").append(toIndentedString(primaryPhone2)).append("\n");
    sb.append("    secondaryEmail: ").append(toIndentedString(secondaryEmail)).append("\n");
    sb.append("    secondaryName: ").append(toIndentedString(secondaryName)).append("\n");
    sb.append("    secondaryPhone1: ").append(toIndentedString(secondaryPhone1)).append("\n");
    sb.append("    secondaryPhone2: ").append(toIndentedString(secondaryPhone2)).append("\n");
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
