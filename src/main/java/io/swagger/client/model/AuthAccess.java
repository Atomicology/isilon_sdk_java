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
import io.swagger.client.model.AuthAccessAccessItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthAccess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class AuthAccess {
  @SerializedName("access")
  private List<AuthAccessAccessItem> access = null;

  public AuthAccess access(List<AuthAccessAccessItem> access) {
    this.access = access;
    return this;
  }

  public AuthAccess addAccessItem(AuthAccessAccessItem accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<AuthAccessAccessItem>();
    }
    this.access.add(accessItem);
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @ApiModelProperty(value = "")
  public List<AuthAccessAccessItem> getAccess() {
    return access;
  }

  public void setAccess(List<AuthAccessAccessItem> access) {
    this.access = access;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthAccess authAccess = (AuthAccess) o;
    return Objects.equals(this.access, authAccess.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthAccess {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

