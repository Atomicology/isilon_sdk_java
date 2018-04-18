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
 * NodeStatusNodeBatterystatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeStatusNodeBatterystatus {
  @SerializedName("last_test_time1")
  private String lastTestTime1 = null;

  @SerializedName("last_test_time2")
  private String lastTestTime2 = null;

  @SerializedName("next_test_time1")
  private String nextTestTime1 = null;

  @SerializedName("next_test_time2")
  private String nextTestTime2 = null;

  @SerializedName("present")
  private Boolean present = null;

  @SerializedName("result1")
  private String result1 = null;

  @SerializedName("result2")
  private String result2 = null;

  @SerializedName("status1")
  private String status1 = null;

  @SerializedName("status2")
  private String status2 = null;

  @SerializedName("supported")
  private Boolean supported = null;

  public NodeStatusNodeBatterystatus lastTestTime1(String lastTestTime1) {
    this.lastTestTime1 = lastTestTime1;
    return this;
  }

   /**
   * The last battery test time for battery 1.
   * @return lastTestTime1
  **/
  @ApiModelProperty(value = "The last battery test time for battery 1.")
  public String getLastTestTime1() {
    return lastTestTime1;
  }

  public void setLastTestTime1(String lastTestTime1) {
    this.lastTestTime1 = lastTestTime1;
  }

  public NodeStatusNodeBatterystatus lastTestTime2(String lastTestTime2) {
    this.lastTestTime2 = lastTestTime2;
    return this;
  }

   /**
   * The last battery test time for battery 2.
   * @return lastTestTime2
  **/
  @ApiModelProperty(value = "The last battery test time for battery 2.")
  public String getLastTestTime2() {
    return lastTestTime2;
  }

  public void setLastTestTime2(String lastTestTime2) {
    this.lastTestTime2 = lastTestTime2;
  }

  public NodeStatusNodeBatterystatus nextTestTime1(String nextTestTime1) {
    this.nextTestTime1 = nextTestTime1;
    return this;
  }

   /**
   * The next checkup for battery 1.
   * @return nextTestTime1
  **/
  @ApiModelProperty(value = "The next checkup for battery 1.")
  public String getNextTestTime1() {
    return nextTestTime1;
  }

  public void setNextTestTime1(String nextTestTime1) {
    this.nextTestTime1 = nextTestTime1;
  }

  public NodeStatusNodeBatterystatus nextTestTime2(String nextTestTime2) {
    this.nextTestTime2 = nextTestTime2;
    return this;
  }

   /**
   * The next checkup for battery 2.
   * @return nextTestTime2
  **/
  @ApiModelProperty(value = "The next checkup for battery 2.")
  public String getNextTestTime2() {
    return nextTestTime2;
  }

  public void setNextTestTime2(String nextTestTime2) {
    this.nextTestTime2 = nextTestTime2;
  }

  public NodeStatusNodeBatterystatus present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * Node has battery status.
   * @return present
  **/
  @ApiModelProperty(value = "Node has battery status.")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  public NodeStatusNodeBatterystatus result1(String result1) {
    this.result1 = result1;
    return this;
  }

   /**
   * The result of the last battery test for battery 1.
   * @return result1
  **/
  @ApiModelProperty(value = "The result of the last battery test for battery 1.")
  public String getResult1() {
    return result1;
  }

  public void setResult1(String result1) {
    this.result1 = result1;
  }

  public NodeStatusNodeBatterystatus result2(String result2) {
    this.result2 = result2;
    return this;
  }

   /**
   * The result of the last battery test for battery 2.
   * @return result2
  **/
  @ApiModelProperty(value = "The result of the last battery test for battery 2.")
  public String getResult2() {
    return result2;
  }

  public void setResult2(String result2) {
    this.result2 = result2;
  }

  public NodeStatusNodeBatterystatus status1(String status1) {
    this.status1 = status1;
    return this;
  }

   /**
   * The status of battery 1.
   * @return status1
  **/
  @ApiModelProperty(value = "The status of battery 1.")
  public String getStatus1() {
    return status1;
  }

  public void setStatus1(String status1) {
    this.status1 = status1;
  }

  public NodeStatusNodeBatterystatus status2(String status2) {
    this.status2 = status2;
    return this;
  }

   /**
   * The status of battery 2.
   * @return status2
  **/
  @ApiModelProperty(value = "The status of battery 2.")
  public String getStatus2() {
    return status2;
  }

  public void setStatus2(String status2) {
    this.status2 = status2;
  }

  public NodeStatusNodeBatterystatus supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * Node supports battery status.
   * @return supported
  **/
  @ApiModelProperty(value = "Node supports battery status.")
  public Boolean isSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusNodeBatterystatus nodeStatusNodeBatterystatus = (NodeStatusNodeBatterystatus) o;
    return Objects.equals(this.lastTestTime1, nodeStatusNodeBatterystatus.lastTestTime1) &&
        Objects.equals(this.lastTestTime2, nodeStatusNodeBatterystatus.lastTestTime2) &&
        Objects.equals(this.nextTestTime1, nodeStatusNodeBatterystatus.nextTestTime1) &&
        Objects.equals(this.nextTestTime2, nodeStatusNodeBatterystatus.nextTestTime2) &&
        Objects.equals(this.present, nodeStatusNodeBatterystatus.present) &&
        Objects.equals(this.result1, nodeStatusNodeBatterystatus.result1) &&
        Objects.equals(this.result2, nodeStatusNodeBatterystatus.result2) &&
        Objects.equals(this.status1, nodeStatusNodeBatterystatus.status1) &&
        Objects.equals(this.status2, nodeStatusNodeBatterystatus.status2) &&
        Objects.equals(this.supported, nodeStatusNodeBatterystatus.supported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTestTime1, lastTestTime2, nextTestTime1, nextTestTime2, present, result1, result2, status1, status2, supported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusNodeBatterystatus {\n");
    
    sb.append("    lastTestTime1: ").append(toIndentedString(lastTestTime1)).append("\n");
    sb.append("    lastTestTime2: ").append(toIndentedString(lastTestTime2)).append("\n");
    sb.append("    nextTestTime1: ").append(toIndentedString(nextTestTime1)).append("\n");
    sb.append("    nextTestTime2: ").append(toIndentedString(nextTestTime2)).append("\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
    sb.append("    result1: ").append(toIndentedString(result1)).append("\n");
    sb.append("    result2: ").append(toIndentedString(result2)).append("\n");
    sb.append("    status1: ").append(toIndentedString(status1)).append("\n");
    sb.append("    status2: ").append(toIndentedString(status2)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
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

