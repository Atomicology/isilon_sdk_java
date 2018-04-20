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
import io.swagger.client.model.SnapshotLock;
import java.io.IOException;

/**
 * SnapshotLockCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SnapshotLockCreateParams {
  @SerializedName("expires")
  private Integer expires = null;

  @SerializedName("comment")
  private String comment = null;

  public SnapshotLockCreateParams expires(Integer expires) {
    this.expires = expires;
    return this;
  }

   /**
   * The Unix Epoch time the snapshot lock will expire and be eligible for automatic deletion.
   * minimum: 1
   * maximum: 2147483647
   * @return expires
  **/
  @ApiModelProperty(value = "The Unix Epoch time the snapshot lock will expire and be eligible for automatic deletion.")
  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }

  public SnapshotLockCreateParams comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Free form comment.
   * @return comment
  **/
  @ApiModelProperty(value = "Free form comment.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotLockCreateParams snapshotLockCreateParams = (SnapshotLockCreateParams) o;
    return Objects.equals(this.expires, snapshotLockCreateParams.expires) &&
        Objects.equals(this.comment, snapshotLockCreateParams.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotLockCreateParams {\n");
    
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

