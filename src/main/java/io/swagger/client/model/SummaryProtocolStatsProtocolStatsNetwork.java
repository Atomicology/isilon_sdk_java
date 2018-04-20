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
import io.swagger.client.model.SummaryProtocolStatsProtocolStatsNetworkIn;
import io.swagger.client.model.SummaryProtocolStatsProtocolStatsNetworkOut;
import java.io.IOException;

/**
 * SummaryProtocolStatsProtocolStatsNetwork
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SummaryProtocolStatsProtocolStatsNetwork {
  @SerializedName("in")
  private SummaryProtocolStatsProtocolStatsNetworkIn in = null;

  @SerializedName("out")
  private SummaryProtocolStatsProtocolStatsNetworkOut out = null;

  public SummaryProtocolStatsProtocolStatsNetwork in(SummaryProtocolStatsProtocolStatsNetworkIn in) {
    this.in = in;
    return this;
  }

   /**
   * 
   * @return in
  **/
  @ApiModelProperty(value = "")
  public SummaryProtocolStatsProtocolStatsNetworkIn getIn() {
    return in;
  }

  public void setIn(SummaryProtocolStatsProtocolStatsNetworkIn in) {
    this.in = in;
  }

  public SummaryProtocolStatsProtocolStatsNetwork out(SummaryProtocolStatsProtocolStatsNetworkOut out) {
    this.out = out;
    return this;
  }

   /**
   * 
   * @return out
  **/
  @ApiModelProperty(value = "")
  public SummaryProtocolStatsProtocolStatsNetworkOut getOut() {
    return out;
  }

  public void setOut(SummaryProtocolStatsProtocolStatsNetworkOut out) {
    this.out = out;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryProtocolStatsProtocolStatsNetwork summaryProtocolStatsProtocolStatsNetwork = (SummaryProtocolStatsProtocolStatsNetwork) o;
    return Objects.equals(this.in, summaryProtocolStatsProtocolStatsNetwork.in) &&
        Objects.equals(this.out, summaryProtocolStatsProtocolStatsNetwork.out);
  }

  @Override
  public int hashCode() {
    return Objects.hash(in, out);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryProtocolStatsProtocolStatsNetwork {\n");
    
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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

