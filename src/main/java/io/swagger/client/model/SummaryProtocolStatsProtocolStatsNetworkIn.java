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
import java.math.BigDecimal;

/**
 * SummaryProtocolStatsProtocolStatsNetworkIn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SummaryProtocolStatsProtocolStatsNetworkIn {
  @SerializedName("errors_per_sec")
  private BigDecimal errorsPerSec = null;

  @SerializedName("megabytes_per_sec")
  private BigDecimal megabytesPerSec = null;

  @SerializedName("packets_per_sec")
  private BigDecimal packetsPerSec = null;

  public SummaryProtocolStatsProtocolStatsNetworkIn errorsPerSec(BigDecimal errorsPerSec) {
    this.errorsPerSec = errorsPerSec;
    return this;
  }

   /**
   * Network input errors per-second
   * @return errorsPerSec
  **/
  @ApiModelProperty(required = true, value = "Network input errors per-second")
  public BigDecimal getErrorsPerSec() {
    return errorsPerSec;
  }

  public void setErrorsPerSec(BigDecimal errorsPerSec) {
    this.errorsPerSec = errorsPerSec;
  }

  public SummaryProtocolStatsProtocolStatsNetworkIn megabytesPerSec(BigDecimal megabytesPerSec) {
    this.megabytesPerSec = megabytesPerSec;
    return this;
  }

   /**
   * Network input megabytes per-second
   * @return megabytesPerSec
  **/
  @ApiModelProperty(required = true, value = "Network input megabytes per-second")
  public BigDecimal getMegabytesPerSec() {
    return megabytesPerSec;
  }

  public void setMegabytesPerSec(BigDecimal megabytesPerSec) {
    this.megabytesPerSec = megabytesPerSec;
  }

  public SummaryProtocolStatsProtocolStatsNetworkIn packetsPerSec(BigDecimal packetsPerSec) {
    this.packetsPerSec = packetsPerSec;
    return this;
  }

   /**
   * Network input packets per-second
   * @return packetsPerSec
  **/
  @ApiModelProperty(required = true, value = "Network input packets per-second")
  public BigDecimal getPacketsPerSec() {
    return packetsPerSec;
  }

  public void setPacketsPerSec(BigDecimal packetsPerSec) {
    this.packetsPerSec = packetsPerSec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryProtocolStatsProtocolStatsNetworkIn summaryProtocolStatsProtocolStatsNetworkIn = (SummaryProtocolStatsProtocolStatsNetworkIn) o;
    return Objects.equals(this.errorsPerSec, summaryProtocolStatsProtocolStatsNetworkIn.errorsPerSec) &&
        Objects.equals(this.megabytesPerSec, summaryProtocolStatsProtocolStatsNetworkIn.megabytesPerSec) &&
        Objects.equals(this.packetsPerSec, summaryProtocolStatsProtocolStatsNetworkIn.packetsPerSec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorsPerSec, megabytesPerSec, packetsPerSec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryProtocolStatsProtocolStatsNetworkIn {\n");
    
    sb.append("    errorsPerSec: ").append(toIndentedString(errorsPerSec)).append("\n");
    sb.append("    megabytesPerSec: ").append(toIndentedString(megabytesPerSec)).append("\n");
    sb.append("    packetsPerSec: ").append(toIndentedString(packetsPerSec)).append("\n");
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

