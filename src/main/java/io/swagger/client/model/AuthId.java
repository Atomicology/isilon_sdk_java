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
import io.swagger.client.model.AuthIdNtoken;
import java.io.IOException;

/**
 * AuthId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class AuthId {
  @SerializedName("ntoken")
  private AuthIdNtoken ntoken = null;

  public AuthId ntoken(AuthIdNtoken ntoken) {
    this.ntoken = ntoken;
    return this;
  }

   /**
   * Specifies properties for a security token for the currently authenticated user.
   * @return ntoken
  **/
  @ApiModelProperty(value = "Specifies properties for a security token for the currently authenticated user.")
  public AuthIdNtoken getNtoken() {
    return ntoken;
  }

  public void setNtoken(AuthIdNtoken ntoken) {
    this.ntoken = ntoken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthId authId = (AuthId) o;
    return Objects.equals(this.ntoken, authId.ntoken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ntoken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthId {\n");
    
    sb.append("    ntoken: ").append(toIndentedString(ntoken)).append("\n");
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

