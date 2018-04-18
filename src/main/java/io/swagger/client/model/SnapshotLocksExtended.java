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
import io.swagger.client.model.SnapshotLockExtended;
import io.swagger.client.model.SnapshotLocks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotLocksExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SnapshotLocksExtended {
  @SerializedName("locks")
  private List<SnapshotLockExtended> locks = null;

  @SerializedName("resume")
  private String resume = null;

  @SerializedName("total")
  private Integer total = null;

  public SnapshotLocksExtended locks(List<SnapshotLockExtended> locks) {
    this.locks = locks;
    return this;
  }

  public SnapshotLocksExtended addLocksItem(SnapshotLockExtended locksItem) {
    if (this.locks == null) {
      this.locks = new ArrayList<SnapshotLockExtended>();
    }
    this.locks.add(locksItem);
    return this;
  }

   /**
   * Get locks
   * @return locks
  **/
  @ApiModelProperty(value = "")
  public List<SnapshotLockExtended> getLocks() {
    return locks;
  }

  public void setLocks(List<SnapshotLockExtended> locks) {
    this.locks = locks;
  }

  public SnapshotLocksExtended resume(String resume) {
    this.resume = resume;
    return this;
  }

   /**
   * Resume token value to use in subsequent calls for continuation.
   * @return resume
  **/
  @ApiModelProperty(value = "Resume token value to use in subsequent calls for continuation.")
  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public SnapshotLocksExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotLocksExtended snapshotLocksExtended = (SnapshotLocksExtended) o;
    return Objects.equals(this.locks, snapshotLocksExtended.locks) &&
        Objects.equals(this.resume, snapshotLocksExtended.resume) &&
        Objects.equals(this.total, snapshotLocksExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locks, resume, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotLocksExtended {\n");
    
    sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

