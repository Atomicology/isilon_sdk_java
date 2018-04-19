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
import io.swagger.client.model.DebugStatsHandler;
import io.swagger.client.model.DebugStatsUnknown;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Statistics for all the methods of all URIs in the Platform API.
 */
@ApiModel(description = "Statistics for all the methods of all URIs in the Platform API.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class DebugStats {
  @SerializedName("DESCRIBE")
  private DebugStatsUnknown DESCRIBE = null;

  @SerializedName("UNKNOWN")
  private DebugStatsUnknown UNKNOWN = null;

  @SerializedName("handlers")
  private List<DebugStatsHandler> handlers = null;

  public DebugStats DESCRIBE(DebugStatsUnknown DESCRIBE) {
    this.DESCRIBE = DESCRIBE;
    return this;
  }

   /**
   * Per-method statistics.
   * @return DESCRIBE
  **/
  @ApiModelProperty(value = "Per-method statistics.")
  public DebugStatsUnknown getDESCRIBE() {
    return DESCRIBE;
  }

  public void setDESCRIBE(DebugStatsUnknown DESCRIBE) {
    this.DESCRIBE = DESCRIBE;
  }

  public DebugStats UNKNOWN(DebugStatsUnknown UNKNOWN) {
    this.UNKNOWN = UNKNOWN;
    return this;
  }

   /**
   * Per-method statistics.
   * @return UNKNOWN
  **/
  @ApiModelProperty(value = "Per-method statistics.")
  public DebugStatsUnknown getUNKNOWN() {
    return UNKNOWN;
  }

  public void setUNKNOWN(DebugStatsUnknown UNKNOWN) {
    this.UNKNOWN = UNKNOWN;
  }

  public DebugStats handlers(List<DebugStatsHandler> handlers) {
    this.handlers = handlers;
    return this;
  }

  public DebugStats addHandlersItem(DebugStatsHandler handlersItem) {
    if (this.handlers == null) {
      this.handlers = new ArrayList<DebugStatsHandler>();
    }
    this.handlers.add(handlersItem);
    return this;
  }

   /**
   * Get handlers
   * @return handlers
  **/
  @ApiModelProperty(value = "")
  public List<DebugStatsHandler> getHandlers() {
    return handlers;
  }

  public void setHandlers(List<DebugStatsHandler> handlers) {
    this.handlers = handlers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugStats debugStats = (DebugStats) o;
    return Objects.equals(this.DESCRIBE, debugStats.DESCRIBE) &&
        Objects.equals(this.UNKNOWN, debugStats.UNKNOWN) &&
        Objects.equals(this.handlers, debugStats.handlers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DESCRIBE, UNKNOWN, handlers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugStats {\n");
    
    sb.append("    DESCRIBE: ").append(toIndentedString(DESCRIBE)).append("\n");
    sb.append("    UNKNOWN: ").append(toIndentedString(UNKNOWN)).append("\n");
    sb.append("    handlers: ").append(toIndentedString(handlers)).append("\n");
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

