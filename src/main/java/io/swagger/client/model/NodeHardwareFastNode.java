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
 * NodeHardwareFastNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NodeHardwareFastNode {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("storage_class")
  private String storageClass = null;

  public NodeHardwareFastNode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID (Device Number) of this node.
   * @return id
  **/
  @ApiModelProperty(value = "Node ID (Device Number) of this node.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public NodeHardwareFastNode lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * Logical Node Number (LNN) of this node.
   * @return lnn
  **/
  @ApiModelProperty(value = "Logical Node Number (LNN) of this node.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public NodeHardwareFastNode product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Isilon product name.
   * @return product
  **/
  @ApiModelProperty(value = "Isilon product name.")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public NodeHardwareFastNode serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number of this node.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "Serial number of this node.")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public NodeHardwareFastNode storageClass(String storageClass) {
    this.storageClass = storageClass;
    return this;
  }

   /**
   * Storage class of this node (storage or diskless).
   * @return storageClass
  **/
  @ApiModelProperty(value = "Storage class of this node (storage or diskless).")
  public String getStorageClass() {
    return storageClass;
  }

  public void setStorageClass(String storageClass) {
    this.storageClass = storageClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeHardwareFastNode nodeHardwareFastNode = (NodeHardwareFastNode) o;
    return Objects.equals(this.id, nodeHardwareFastNode.id) &&
        Objects.equals(this.lnn, nodeHardwareFastNode.lnn) &&
        Objects.equals(this.product, nodeHardwareFastNode.product) &&
        Objects.equals(this.serialNumber, nodeHardwareFastNode.serialNumber) &&
        Objects.equals(this.storageClass, nodeHardwareFastNode.storageClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lnn, product, serialNumber, storageClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeHardwareFastNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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

