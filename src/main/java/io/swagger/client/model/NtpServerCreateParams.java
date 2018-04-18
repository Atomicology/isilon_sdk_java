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
 * NTP server.
 */
@ApiModel(description = "NTP server.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NtpServerCreateParams {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  public NtpServerCreateParams key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key value from key_file that maps to this server.
   * @return key
  **/
  @ApiModelProperty(value = "Key value from key_file that maps to this server.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public NtpServerCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * NTP server name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "NTP server name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NtpServerCreateParams ntpServerCreateParams = (NtpServerCreateParams) o;
    return Objects.equals(this.key, ntpServerCreateParams.key) &&
        Objects.equals(this.name, ntpServerCreateParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NtpServerCreateParams {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
