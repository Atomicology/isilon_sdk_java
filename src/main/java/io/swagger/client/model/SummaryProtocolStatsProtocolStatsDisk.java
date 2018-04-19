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
 * SummaryProtocolStatsProtocolStatsDisk
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SummaryProtocolStatsProtocolStatsDisk {
  @SerializedName("iops")
  private BigDecimal iops = null;

  @SerializedName("read")
  private BigDecimal read = null;

  @SerializedName("write")
  private BigDecimal write = null;

  public SummaryProtocolStatsProtocolStatsDisk iops(BigDecimal iops) {
    this.iops = iops;
    return this;
  }

   /**
   * Disk iops
   * @return iops
  **/
  @ApiModelProperty(required = true, value = "Disk iops")
  public BigDecimal getIops() {
    return iops;
  }

  public void setIops(BigDecimal iops) {
    this.iops = iops;
  }

  public SummaryProtocolStatsProtocolStatsDisk read(BigDecimal read) {
    this.read = read;
    return this;
  }

   /**
   * Disk reads
   * @return read
  **/
  @ApiModelProperty(required = true, value = "Disk reads")
  public BigDecimal getRead() {
    return read;
  }

  public void setRead(BigDecimal read) {
    this.read = read;
  }

  public SummaryProtocolStatsProtocolStatsDisk write(BigDecimal write) {
    this.write = write;
    return this;
  }

   /**
   * Disk writes
   * @return write
  **/
  @ApiModelProperty(required = true, value = "Disk writes")
  public BigDecimal getWrite() {
    return write;
  }

  public void setWrite(BigDecimal write) {
    this.write = write;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryProtocolStatsProtocolStatsDisk summaryProtocolStatsProtocolStatsDisk = (SummaryProtocolStatsProtocolStatsDisk) o;
    return Objects.equals(this.iops, summaryProtocolStatsProtocolStatsDisk.iops) &&
        Objects.equals(this.read, summaryProtocolStatsProtocolStatsDisk.read) &&
        Objects.equals(this.write, summaryProtocolStatsProtocolStatsDisk.write);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iops, read, write);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryProtocolStatsProtocolStatsDisk {\n");
    
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    write: ").append(toIndentedString(write)).append("\n");
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

