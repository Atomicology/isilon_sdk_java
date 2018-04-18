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
 * AuthPrivilege
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthPrivilege {
  @SerializedName("category")
  private String category = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("read_write")
  private Boolean readWrite = null;

  public AuthPrivilege category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Specifies the general categorization of the privilege.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "Specifies the general categorization of the privilege.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AuthPrivilege description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Specifies a short description of the privilege.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Specifies a short description of the privilege.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AuthPrivilege id(String id) {
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

  public AuthPrivilege name(String name) {
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

  public AuthPrivilege readWrite(Boolean readWrite) {
    this.readWrite = readWrite;
    return this;
  }

   /**
   * True, if the privilege is read-write.
   * @return readWrite
  **/
  @ApiModelProperty(value = "True, if the privilege is read-write.")
  public Boolean isReadWrite() {
    return readWrite;
  }

  public void setReadWrite(Boolean readWrite) {
    this.readWrite = readWrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthPrivilege authPrivilege = (AuthPrivilege) o;
    return Objects.equals(this.category, authPrivilege.category) &&
        Objects.equals(this.description, authPrivilege.description) &&
        Objects.equals(this.id, authPrivilege.id) &&
        Objects.equals(this.name, authPrivilege.name) &&
        Objects.equals(this.readWrite, authPrivilege.readWrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, id, name, readWrite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthPrivilege {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readWrite: ").append(toIndentedString(readWrite)).append("\n");
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
