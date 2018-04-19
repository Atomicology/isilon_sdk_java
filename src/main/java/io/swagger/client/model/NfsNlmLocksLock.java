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
import java.util.ArrayList;
import java.util.List;

/**
 * NfsNlmLocksLock
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NfsNlmLocksLock {
  @SerializedName("client")
  private String client = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("created")
  private Integer created = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("lin")
  private String lin = null;

  @SerializedName("lock_type")
  private String lockType = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("range")
  private List<Integer> range = null;

  public NfsNlmLocksLock client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Specifies the client host name and IP address.
   * @return client
  **/
  @ApiModelProperty(value = "Specifies the client host name and IP address.")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public NfsNlmLocksLock clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Specifies the client ID.
   * @return clientId
  **/
  @ApiModelProperty(value = "Specifies the client ID.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public NfsNlmLocksLock created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Specifies the UNIX EPoch time that the lock was created.
   * @return created
  **/
  @ApiModelProperty(value = "Specifies the UNIX EPoch time that the lock was created.")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public NfsNlmLocksLock id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the system-assigned ID given to the lock. This value is returned when the lock is created with the POST method.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies the system-assigned ID given to the lock. This value is returned when the lock is created with the POST method.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NfsNlmLocksLock lin(String lin) {
    this.lin = lin;
    return this;
  }

   /**
   * Specifies the LIN in /ifs that is locked.
   * @return lin
  **/
  @ApiModelProperty(value = "Specifies the LIN in /ifs that is locked.")
  public String getLin() {
    return lin;
  }

  public void setLin(String lin) {
    this.lin = lin;
  }

  public NfsNlmLocksLock lockType(String lockType) {
    this.lockType = lockType;
    return this;
  }

   /**
   * Specifies the lock type.
   * @return lockType
  **/
  @ApiModelProperty(value = "Specifies the lock type.")
  public String getLockType() {
    return lockType;
  }

  public void setLockType(String lockType) {
    this.lockType = lockType;
  }

  public NfsNlmLocksLock path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Specifies the path under /ifs that is locked.
   * @return path
  **/
  @ApiModelProperty(value = "Specifies the path under /ifs that is locked.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public NfsNlmLocksLock range(List<Integer> range) {
    this.range = range;
    return this;
  }

  public NfsNlmLocksLock addRangeItem(Integer rangeItem) {
    if (this.range == null) {
      this.range = new ArrayList<Integer>();
    }
    this.range.add(rangeItem);
    return this;
  }

   /**
   * Specifies the byte range within the locked file.
   * @return range
  **/
  @ApiModelProperty(value = "Specifies the byte range within the locked file.")
  public List<Integer> getRange() {
    return range;
  }

  public void setRange(List<Integer> range) {
    this.range = range;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NfsNlmLocksLock nfsNlmLocksLock = (NfsNlmLocksLock) o;
    return Objects.equals(this.client, nfsNlmLocksLock.client) &&
        Objects.equals(this.clientId, nfsNlmLocksLock.clientId) &&
        Objects.equals(this.created, nfsNlmLocksLock.created) &&
        Objects.equals(this.id, nfsNlmLocksLock.id) &&
        Objects.equals(this.lin, nfsNlmLocksLock.lin) &&
        Objects.equals(this.lockType, nfsNlmLocksLock.lockType) &&
        Objects.equals(this.path, nfsNlmLocksLock.path) &&
        Objects.equals(this.range, nfsNlmLocksLock.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, clientId, created, id, lin, lockType, path, range);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfsNlmLocksLock {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lin: ").append(toIndentedString(lin)).append("\n");
    sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

