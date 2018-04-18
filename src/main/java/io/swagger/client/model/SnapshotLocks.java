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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotLocks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SnapshotLocks {
  @SerializedName("locks")
  private List<SnapshotLockExtended> locks = null;

  public SnapshotLocks locks(List<SnapshotLockExtended> locks) {
    this.locks = locks;
    return this;
  }

  public SnapshotLocks addLocksItem(SnapshotLockExtended locksItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotLocks snapshotLocks = (SnapshotLocks) o;
    return Objects.equals(this.locks, snapshotLocks.locks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotLocks {\n");
    
    sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
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

