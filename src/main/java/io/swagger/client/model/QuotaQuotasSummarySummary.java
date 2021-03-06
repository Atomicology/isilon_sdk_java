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
 * QuotaQuotasSummarySummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class QuotaQuotasSummarySummary {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("default_group_quotas_count")
  private Integer defaultGroupQuotasCount = null;

  @SerializedName("default_user_quotas_count")
  private Integer defaultUserQuotasCount = null;

  @SerializedName("directory_quotas_count")
  private Integer directoryQuotasCount = null;

  @SerializedName("group_quotas_count")
  private Integer groupQuotasCount = null;

  @SerializedName("linked_quotas_count")
  private Integer linkedQuotasCount = null;

  @SerializedName("user_quotas_count")
  private Integer userQuotasCount = null;

  public QuotaQuotasSummarySummary count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of quotas.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Total number of quotas.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public QuotaQuotasSummarySummary defaultGroupQuotasCount(Integer defaultGroupQuotasCount) {
    this.defaultGroupQuotasCount = defaultGroupQuotasCount;
    return this;
  }

   /**
   * Total number of default-group quotas.
   * @return defaultGroupQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of default-group quotas.")
  public Integer getDefaultGroupQuotasCount() {
    return defaultGroupQuotasCount;
  }

  public void setDefaultGroupQuotasCount(Integer defaultGroupQuotasCount) {
    this.defaultGroupQuotasCount = defaultGroupQuotasCount;
  }

  public QuotaQuotasSummarySummary defaultUserQuotasCount(Integer defaultUserQuotasCount) {
    this.defaultUserQuotasCount = defaultUserQuotasCount;
    return this;
  }

   /**
   * Total number of default-user quotas.
   * @return defaultUserQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of default-user quotas.")
  public Integer getDefaultUserQuotasCount() {
    return defaultUserQuotasCount;
  }

  public void setDefaultUserQuotasCount(Integer defaultUserQuotasCount) {
    this.defaultUserQuotasCount = defaultUserQuotasCount;
  }

  public QuotaQuotasSummarySummary directoryQuotasCount(Integer directoryQuotasCount) {
    this.directoryQuotasCount = directoryQuotasCount;
    return this;
  }

   /**
   * Total number of directory quotas.
   * @return directoryQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of directory quotas.")
  public Integer getDirectoryQuotasCount() {
    return directoryQuotasCount;
  }

  public void setDirectoryQuotasCount(Integer directoryQuotasCount) {
    this.directoryQuotasCount = directoryQuotasCount;
  }

  public QuotaQuotasSummarySummary groupQuotasCount(Integer groupQuotasCount) {
    this.groupQuotasCount = groupQuotasCount;
    return this;
  }

   /**
   * Total number of -group quotas.
   * @return groupQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of -group quotas.")
  public Integer getGroupQuotasCount() {
    return groupQuotasCount;
  }

  public void setGroupQuotasCount(Integer groupQuotasCount) {
    this.groupQuotasCount = groupQuotasCount;
  }

  public QuotaQuotasSummarySummary linkedQuotasCount(Integer linkedQuotasCount) {
    this.linkedQuotasCount = linkedQuotasCount;
    return this;
  }

   /**
   * Total number of user and group totals that are linked.
   * @return linkedQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of user and group totals that are linked.")
  public Integer getLinkedQuotasCount() {
    return linkedQuotasCount;
  }

  public void setLinkedQuotasCount(Integer linkedQuotasCount) {
    this.linkedQuotasCount = linkedQuotasCount;
  }

  public QuotaQuotasSummarySummary userQuotasCount(Integer userQuotasCount) {
    this.userQuotasCount = userQuotasCount;
    return this;
  }

   /**
   * Total number of user quotas.
   * @return userQuotasCount
  **/
  @ApiModelProperty(required = true, value = "Total number of user quotas.")
  public Integer getUserQuotasCount() {
    return userQuotasCount;
  }

  public void setUserQuotasCount(Integer userQuotasCount) {
    this.userQuotasCount = userQuotasCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuotasSummarySummary quotaQuotasSummarySummary = (QuotaQuotasSummarySummary) o;
    return Objects.equals(this.count, quotaQuotasSummarySummary.count) &&
        Objects.equals(this.defaultGroupQuotasCount, quotaQuotasSummarySummary.defaultGroupQuotasCount) &&
        Objects.equals(this.defaultUserQuotasCount, quotaQuotasSummarySummary.defaultUserQuotasCount) &&
        Objects.equals(this.directoryQuotasCount, quotaQuotasSummarySummary.directoryQuotasCount) &&
        Objects.equals(this.groupQuotasCount, quotaQuotasSummarySummary.groupQuotasCount) &&
        Objects.equals(this.linkedQuotasCount, quotaQuotasSummarySummary.linkedQuotasCount) &&
        Objects.equals(this.userQuotasCount, quotaQuotasSummarySummary.userQuotasCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, defaultGroupQuotasCount, defaultUserQuotasCount, directoryQuotasCount, groupQuotasCount, linkedQuotasCount, userQuotasCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuotasSummarySummary {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    defaultGroupQuotasCount: ").append(toIndentedString(defaultGroupQuotasCount)).append("\n");
    sb.append("    defaultUserQuotasCount: ").append(toIndentedString(defaultUserQuotasCount)).append("\n");
    sb.append("    directoryQuotasCount: ").append(toIndentedString(directoryQuotasCount)).append("\n");
    sb.append("    groupQuotasCount: ").append(toIndentedString(groupQuotasCount)).append("\n");
    sb.append("    linkedQuotasCount: ").append(toIndentedString(linkedQuotasCount)).append("\n");
    sb.append("    userQuotasCount: ").append(toIndentedString(userQuotasCount)).append("\n");
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

