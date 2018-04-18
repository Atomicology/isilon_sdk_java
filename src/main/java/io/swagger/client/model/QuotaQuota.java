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
import io.swagger.client.model.QuotaQuotaThresholds;
import java.io.IOException;

/**
 * QuotaQuota
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class QuotaQuota {
  @SerializedName("container")
  private Boolean container = null;

  @SerializedName("enforced")
  private Boolean enforced = null;

  @SerializedName("linked")
  private Boolean linked = null;

  @SerializedName("thresholds")
  private QuotaQuotaThresholds thresholds = null;

  @SerializedName("thresholds_include_overhead")
  private Boolean thresholdsIncludeOverhead = null;

  public QuotaQuota container(Boolean container) {
    this.container = container;
    return this;
  }

   /**
   * If true, SMB shares using the quota directory see the quota thresholds as share size.
   * @return container
  **/
  @ApiModelProperty(value = "If true, SMB shares using the quota directory see the quota thresholds as share size.")
  public Boolean isContainer() {
    return container;
  }

  public void setContainer(Boolean container) {
    this.container = container;
  }

  public QuotaQuota enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

   /**
   * True if the quota provides enforcement, otherwise a accounting quota.
   * @return enforced
  **/
  @ApiModelProperty(value = "True if the quota provides enforcement, otherwise a accounting quota.")
  public Boolean isEnforced() {
    return enforced;
  }

  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }

  public QuotaQuota linked(Boolean linked) {
    this.linked = linked;
    return this;
  }

   /**
   * If false and the quota is linked, attempt to unlink.
   * @return linked
  **/
  @ApiModelProperty(value = "If false and the quota is linked, attempt to unlink.")
  public Boolean isLinked() {
    return linked;
  }

  public void setLinked(Boolean linked) {
    this.linked = linked;
  }

  public QuotaQuota thresholds(QuotaQuotaThresholds thresholds) {
    this.thresholds = thresholds;
    return this;
  }

   /**
   * 
   * @return thresholds
  **/
  @ApiModelProperty(value = "")
  public QuotaQuotaThresholds getThresholds() {
    return thresholds;
  }

  public void setThresholds(QuotaQuotaThresholds thresholds) {
    this.thresholds = thresholds;
  }

  public QuotaQuota thresholdsIncludeOverhead(Boolean thresholdsIncludeOverhead) {
    this.thresholdsIncludeOverhead = thresholdsIncludeOverhead;
    return this;
  }

   /**
   * If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. &#39;physical&#39; usage).
   * @return thresholdsIncludeOverhead
  **/
  @ApiModelProperty(value = "If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. 'physical' usage).")
  public Boolean isThresholdsIncludeOverhead() {
    return thresholdsIncludeOverhead;
  }

  public void setThresholdsIncludeOverhead(Boolean thresholdsIncludeOverhead) {
    this.thresholdsIncludeOverhead = thresholdsIncludeOverhead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuota quotaQuota = (QuotaQuota) o;
    return Objects.equals(this.container, quotaQuota.container) &&
        Objects.equals(this.enforced, quotaQuota.enforced) &&
        Objects.equals(this.linked, quotaQuota.linked) &&
        Objects.equals(this.thresholds, quotaQuota.thresholds) &&
        Objects.equals(this.thresholdsIncludeOverhead, quotaQuota.thresholdsIncludeOverhead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, enforced, linked, thresholds, thresholdsIncludeOverhead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuota {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    thresholdsIncludeOverhead: ").append(toIndentedString(thresholdsIncludeOverhead)).append("\n");
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
