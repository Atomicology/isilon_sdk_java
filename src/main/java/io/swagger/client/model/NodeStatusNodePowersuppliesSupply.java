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
 * NodeStatusNodePowersuppliesSupply
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeStatusNodePowersuppliesSupply {
  @SerializedName("chassis")
  private Integer chassis = null;

  @SerializedName("firmware")
  private String firmware = null;

  @SerializedName("good")
  private String good = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public NodeStatusNodePowersuppliesSupply chassis(Integer chassis) {
    this.chassis = chassis;
    return this;
  }

   /**
   * Which node chassis is this power supply in.
   * @return chassis
  **/
  @ApiModelProperty(value = "Which node chassis is this power supply in.")
  public Integer getChassis() {
    return chassis;
  }

  public void setChassis(Integer chassis) {
    this.chassis = chassis;
  }

  public NodeStatusNodePowersuppliesSupply firmware(String firmware) {
    this.firmware = firmware;
    return this;
  }

   /**
   * The current firmware revision of this power supply.
   * @return firmware
  **/
  @ApiModelProperty(value = "The current firmware revision of this power supply.")
  public String getFirmware() {
    return firmware;
  }

  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }

  public NodeStatusNodePowersuppliesSupply good(String good) {
    this.good = good;
    return this;
  }

   /**
   * Is this power supply in a failure state.
   * @return good
  **/
  @ApiModelProperty(value = "Is this power supply in a failure state.")
  public String getGood() {
    return good;
  }

  public void setGood(String good) {
    this.good = good;
  }

  public NodeStatusNodePowersuppliesSupply id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Identifying index for this power supply.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifying index for this power supply.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NodeStatusNodePowersuppliesSupply name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Complete identifying string for this power supply.
   * @return name
  **/
  @ApiModelProperty(value = "Complete identifying string for this power supply.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeStatusNodePowersuppliesSupply status(String status) {
    this.status = status;
    return this;
  }

   /**
   * A descriptive status string for this power supply.
   * @return status
  **/
  @ApiModelProperty(value = "A descriptive status string for this power supply.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NodeStatusNodePowersuppliesSupply type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this power supply.
   * @return type
  **/
  @ApiModelProperty(value = "The type of this power supply.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusNodePowersuppliesSupply nodeStatusNodePowersuppliesSupply = (NodeStatusNodePowersuppliesSupply) o;
    return Objects.equals(this.chassis, nodeStatusNodePowersuppliesSupply.chassis) &&
        Objects.equals(this.firmware, nodeStatusNodePowersuppliesSupply.firmware) &&
        Objects.equals(this.good, nodeStatusNodePowersuppliesSupply.good) &&
        Objects.equals(this.id, nodeStatusNodePowersuppliesSupply.id) &&
        Objects.equals(this.name, nodeStatusNodePowersuppliesSupply.name) &&
        Objects.equals(this.status, nodeStatusNodePowersuppliesSupply.status) &&
        Objects.equals(this.type, nodeStatusNodePowersuppliesSupply.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chassis, firmware, good, id, name, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusNodePowersuppliesSupply {\n");
    
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

