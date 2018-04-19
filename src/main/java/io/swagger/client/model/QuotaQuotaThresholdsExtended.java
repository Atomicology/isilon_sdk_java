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
 * QuotaQuotaThresholdsExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class QuotaQuotaThresholdsExtended {
  @SerializedName("advisory")
  private Integer advisory = null;

  @SerializedName("hard")
  private Integer hard = null;

  @SerializedName("soft")
  private Integer soft = null;

  @SerializedName("soft_grace")
  private Integer softGrace = null;

  @SerializedName("advisory_exceeded")
  private Boolean advisoryExceeded = null;

  @SerializedName("advisory_last_exceeded")
  private Integer advisoryLastExceeded = null;

  @SerializedName("hard_exceeded")
  private Boolean hardExceeded = null;

  @SerializedName("hard_last_exceeded")
  private Integer hardLastExceeded = null;

  @SerializedName("soft_exceeded")
  private Boolean softExceeded = null;

  @SerializedName("soft_last_exceeded")
  private Integer softLastExceeded = null;

  public QuotaQuotaThresholdsExtended advisory(Integer advisory) {
    this.advisory = advisory;
    return this;
  }

   /**
   * Usage bytes at which notifications will be sent but writes will not be denied.
   * minimum: 1
   * @return advisory
  **/
  @ApiModelProperty(value = "Usage bytes at which notifications will be sent but writes will not be denied.")
  public Integer getAdvisory() {
    return advisory;
  }

  public void setAdvisory(Integer advisory) {
    this.advisory = advisory;
  }

  public QuotaQuotaThresholdsExtended hard(Integer hard) {
    this.hard = hard;
    return this;
  }

   /**
   * Usage bytes at which further writes will be denied.
   * minimum: 1
   * @return hard
  **/
  @ApiModelProperty(value = "Usage bytes at which further writes will be denied.")
  public Integer getHard() {
    return hard;
  }

  public void setHard(Integer hard) {
    this.hard = hard;
  }

  public QuotaQuotaThresholdsExtended soft(Integer soft) {
    this.soft = soft;
    return this;
  }

   /**
   * Usage bytes at which notifications will be sent and soft grace time will be started.
   * minimum: 1
   * @return soft
  **/
  @ApiModelProperty(value = "Usage bytes at which notifications will be sent and soft grace time will be started.")
  public Integer getSoft() {
    return soft;
  }

  public void setSoft(Integer soft) {
    this.soft = soft;
  }

  public QuotaQuotaThresholdsExtended softGrace(Integer softGrace) {
    this.softGrace = softGrace;
    return this;
  }

   /**
   * Time in seconds after which the soft threshold has been hit before writes will be denied.
   * minimum: 1
   * @return softGrace
  **/
  @ApiModelProperty(value = "Time in seconds after which the soft threshold has been hit before writes will be denied.")
  public Integer getSoftGrace() {
    return softGrace;
  }

  public void setSoftGrace(Integer softGrace) {
    this.softGrace = softGrace;
  }

  public QuotaQuotaThresholdsExtended advisoryExceeded(Boolean advisoryExceeded) {
    this.advisoryExceeded = advisoryExceeded;
    return this;
  }

   /**
   * True if the advisory threshold has been hit.
   * @return advisoryExceeded
  **/
  @ApiModelProperty(value = "True if the advisory threshold has been hit.")
  public Boolean isAdvisoryExceeded() {
    return advisoryExceeded;
  }

  public void setAdvisoryExceeded(Boolean advisoryExceeded) {
    this.advisoryExceeded = advisoryExceeded;
  }

  public QuotaQuotaThresholdsExtended advisoryLastExceeded(Integer advisoryLastExceeded) {
    this.advisoryLastExceeded = advisoryLastExceeded;
    return this;
  }

   /**
   * Time at which advisory threshold was hit.
   * @return advisoryLastExceeded
  **/
  @ApiModelProperty(value = "Time at which advisory threshold was hit.")
  public Integer getAdvisoryLastExceeded() {
    return advisoryLastExceeded;
  }

  public void setAdvisoryLastExceeded(Integer advisoryLastExceeded) {
    this.advisoryLastExceeded = advisoryLastExceeded;
  }

  public QuotaQuotaThresholdsExtended hardExceeded(Boolean hardExceeded) {
    this.hardExceeded = hardExceeded;
    return this;
  }

   /**
   * True if the hard threshold has been hit.
   * @return hardExceeded
  **/
  @ApiModelProperty(value = "True if the hard threshold has been hit.")
  public Boolean isHardExceeded() {
    return hardExceeded;
  }

  public void setHardExceeded(Boolean hardExceeded) {
    this.hardExceeded = hardExceeded;
  }

  public QuotaQuotaThresholdsExtended hardLastExceeded(Integer hardLastExceeded) {
    this.hardLastExceeded = hardLastExceeded;
    return this;
  }

   /**
   * Time at which hard threshold was hit.
   * @return hardLastExceeded
  **/
  @ApiModelProperty(value = "Time at which hard threshold was hit.")
  public Integer getHardLastExceeded() {
    return hardLastExceeded;
  }

  public void setHardLastExceeded(Integer hardLastExceeded) {
    this.hardLastExceeded = hardLastExceeded;
  }

  public QuotaQuotaThresholdsExtended softExceeded(Boolean softExceeded) {
    this.softExceeded = softExceeded;
    return this;
  }

   /**
   * True if the soft threshold has been hit.
   * @return softExceeded
  **/
  @ApiModelProperty(value = "True if the soft threshold has been hit.")
  public Boolean isSoftExceeded() {
    return softExceeded;
  }

  public void setSoftExceeded(Boolean softExceeded) {
    this.softExceeded = softExceeded;
  }

  public QuotaQuotaThresholdsExtended softLastExceeded(Integer softLastExceeded) {
    this.softLastExceeded = softLastExceeded;
    return this;
  }

   /**
   * Time at which soft threshold was hit
   * @return softLastExceeded
  **/
  @ApiModelProperty(value = "Time at which soft threshold was hit")
  public Integer getSoftLastExceeded() {
    return softLastExceeded;
  }

  public void setSoftLastExceeded(Integer softLastExceeded) {
    this.softLastExceeded = softLastExceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuotaThresholdsExtended quotaQuotaThresholdsExtended = (QuotaQuotaThresholdsExtended) o;
    return Objects.equals(this.advisory, quotaQuotaThresholdsExtended.advisory) &&
        Objects.equals(this.hard, quotaQuotaThresholdsExtended.hard) &&
        Objects.equals(this.soft, quotaQuotaThresholdsExtended.soft) &&
        Objects.equals(this.softGrace, quotaQuotaThresholdsExtended.softGrace) &&
        Objects.equals(this.advisoryExceeded, quotaQuotaThresholdsExtended.advisoryExceeded) &&
        Objects.equals(this.advisoryLastExceeded, quotaQuotaThresholdsExtended.advisoryLastExceeded) &&
        Objects.equals(this.hardExceeded, quotaQuotaThresholdsExtended.hardExceeded) &&
        Objects.equals(this.hardLastExceeded, quotaQuotaThresholdsExtended.hardLastExceeded) &&
        Objects.equals(this.softExceeded, quotaQuotaThresholdsExtended.softExceeded) &&
        Objects.equals(this.softLastExceeded, quotaQuotaThresholdsExtended.softLastExceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advisory, hard, soft, softGrace, advisoryExceeded, advisoryLastExceeded, hardExceeded, hardLastExceeded, softExceeded, softLastExceeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuotaThresholdsExtended {\n");
    
    sb.append("    advisory: ").append(toIndentedString(advisory)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
    sb.append("    softGrace: ").append(toIndentedString(softGrace)).append("\n");
    sb.append("    advisoryExceeded: ").append(toIndentedString(advisoryExceeded)).append("\n");
    sb.append("    advisoryLastExceeded: ").append(toIndentedString(advisoryLastExceeded)).append("\n");
    sb.append("    hardExceeded: ").append(toIndentedString(hardExceeded)).append("\n");
    sb.append("    hardLastExceeded: ").append(toIndentedString(hardLastExceeded)).append("\n");
    sb.append("    softExceeded: ").append(toIndentedString(softExceeded)).append("\n");
    sb.append("    softLastExceeded: ").append(toIndentedString(softLastExceeded)).append("\n");
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

