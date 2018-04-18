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
 * ClusterTimeNode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ClusterTimeNode {
  @SerializedName("error")
  private String error = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lnn")
  private Integer lnn = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("time")
  private Integer time = null;

  public ClusterTimeNode error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message, if the HTTP status returned from this node was not 200.
   * @return error
  **/
  @ApiModelProperty(value = "Error message, if the HTTP status returned from this node was not 200.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ClusterTimeNode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Node ID of the node reporting this information.
   * minimum: 0
   * maximum: 4294967295
   * @return id
  **/
  @ApiModelProperty(value = "Node ID of the node reporting this information.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ClusterTimeNode lnn(Integer lnn) {
    this.lnn = lnn;
    return this;
  }

   /**
   * Logical node number of the node reporting this information.
   * minimum: 0
   * maximum: 4294967295
   * @return lnn
  **/
  @ApiModelProperty(value = "Logical node number of the node reporting this information.")
  public Integer getLnn() {
    return lnn;
  }

  public void setLnn(Integer lnn) {
    this.lnn = lnn;
  }

  public ClusterTimeNode status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the HTTP response from this node if not 200.  If 200, this field does not appear.
   * minimum: 0
   * maximum: 4294967295
   * @return status
  **/
  @ApiModelProperty(value = "Status of the HTTP response from this node if not 200.  If 200, this field does not appear.")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ClusterTimeNode time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The current time on the cluster as a UNIX epoch (seconds since 1/1/1970), as reported by this node.
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   * @return time
  **/
  @ApiModelProperty(value = "The current time on the cluster as a UNIX epoch (seconds since 1/1/1970), as reported by this node.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterTimeNode clusterTimeNode = (ClusterTimeNode) o;
    return Objects.equals(this.error, clusterTimeNode.error) &&
        Objects.equals(this.id, clusterTimeNode.id) &&
        Objects.equals(this.lnn, clusterTimeNode.lnn) &&
        Objects.equals(this.status, clusterTimeNode.status) &&
        Objects.equals(this.time, clusterTimeNode.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, id, lnn, status, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterTimeNode {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lnn: ").append(toIndentedString(lnn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
