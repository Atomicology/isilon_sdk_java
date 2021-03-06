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
 * AuthIdNtokenPrivilegeItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuthIdNtokenPrivilegeItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("read_only")
  private Boolean readOnly = null;

  public AuthIdNtokenPrivilegeItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the ID of the privilege.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Specifies the ID of the privilege.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthIdNtokenPrivilegeItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the privilege.
   * @return name
  **/
  @ApiModelProperty(value = "Specifies the name of the privilege.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthIdNtokenPrivilegeItem readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * True, if the privilege is read-only.
   * @return readOnly
  **/
  @ApiModelProperty(value = "True, if the privilege is read-only.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthIdNtokenPrivilegeItem authIdNtokenPrivilegeItem = (AuthIdNtokenPrivilegeItem) o;
    return Objects.equals(this.id, authIdNtokenPrivilegeItem.id) &&
        Objects.equals(this.name, authIdNtokenPrivilegeItem.name) &&
        Objects.equals(this.readOnly, authIdNtokenPrivilegeItem.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthIdNtokenPrivilegeItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

