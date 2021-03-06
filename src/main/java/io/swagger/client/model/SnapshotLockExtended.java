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
 * SnapshotLockExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SnapshotLockExtended {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("expires")
  private Integer expires = null;

  @SerializedName("id")
  private Integer id = null;

  public SnapshotLockExtended comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * User supplied lock comment.
   * @return comment
  **/
  @ApiModelProperty(value = "User supplied lock comment.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public SnapshotLockExtended count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Recursive lock count.
   * @return count
  **/
  @ApiModelProperty(value = "Recursive lock count.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SnapshotLockExtended expires(Integer expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The Unix Epoch time the snapshot lock will expire and be eligible for automatic deletion.
   * @return expires
  **/
  @ApiModelProperty(value = "The Unix Epoch time the snapshot lock will expire and be eligible for automatic deletion.")
  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }

  public SnapshotLockExtended id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * System generated lock ID.
   * @return id
  **/
  @ApiModelProperty(value = "System generated lock ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotLockExtended snapshotLockExtended = (SnapshotLockExtended) o;
    return Objects.equals(this.comment, snapshotLockExtended.comment) &&
        Objects.equals(this.count, snapshotLockExtended.count) &&
        Objects.equals(this.expires, snapshotLockExtended.expires) &&
        Objects.equals(this.id, snapshotLockExtended.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, count, expires, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotLockExtended {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

