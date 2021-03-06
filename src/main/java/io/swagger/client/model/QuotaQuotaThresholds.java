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
 * QuotaQuotaThresholds
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class QuotaQuotaThresholds {
  @SerializedName("advisory")
  private Integer advisory = null;

  @SerializedName("hard")
  private Integer hard = null;

  @SerializedName("soft")
  private Integer soft = null;

  @SerializedName("soft_grace")
  private Integer softGrace = null;

  public QuotaQuotaThresholds advisory(Integer advisory) {
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

  public QuotaQuotaThresholds hard(Integer hard) {
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

  public QuotaQuotaThresholds soft(Integer soft) {
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

  public QuotaQuotaThresholds softGrace(Integer softGrace) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaQuotaThresholds quotaQuotaThresholds = (QuotaQuotaThresholds) o;
    return Objects.equals(this.advisory, quotaQuotaThresholds.advisory) &&
        Objects.equals(this.hard, quotaQuotaThresholds.hard) &&
        Objects.equals(this.soft, quotaQuotaThresholds.soft) &&
        Objects.equals(this.softGrace, quotaQuotaThresholds.softGrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advisory, hard, soft, softGrace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaQuotaThresholds {\n");
    
    sb.append("    advisory: ").append(toIndentedString(advisory)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
    sb.append("    softGrace: ").append(toIndentedString(softGrace)).append("\n");
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

