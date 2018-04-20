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
import io.swagger.client.model.DiagnosticsGatherStatusGather;
import java.io.IOException;

/**
 * DiagnosticsNetloggerStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class DiagnosticsNetloggerStatus {
  @SerializedName("netlogger")
  private DiagnosticsGatherStatusGather netlogger = null;

  public DiagnosticsNetloggerStatus netlogger(DiagnosticsGatherStatusGather netlogger) {
    this.netlogger = netlogger;
    return this;
  }

   /**
   * 
   * @return netlogger
  **/
  @ApiModelProperty(value = "")
  public DiagnosticsGatherStatusGather getNetlogger() {
    return netlogger;
  }

  public void setNetlogger(DiagnosticsGatherStatusGather netlogger) {
    this.netlogger = netlogger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsNetloggerStatus diagnosticsNetloggerStatus = (DiagnosticsNetloggerStatus) o;
    return Objects.equals(this.netlogger, diagnosticsNetloggerStatus.netlogger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netlogger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsNetloggerStatus {\n");
    
    sb.append("    netlogger: ").append(toIndentedString(netlogger)).append("\n");
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

