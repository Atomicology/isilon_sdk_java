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
 * NdmpSettingsVariablesVariablePathVariable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NdmpSettingsVariablesVariablePathVariable {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public NdmpSettingsVariablesVariablePathVariable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of environment variable.
   * @return name
  **/
  @ApiModelProperty(value = "The name of environment variable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NdmpSettingsVariablesVariablePathVariable value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of environment variable.
   * @return value
  **/
  @ApiModelProperty(value = "The value of environment variable.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsVariablesVariablePathVariable ndmpSettingsVariablesVariablePathVariable = (NdmpSettingsVariablesVariablePathVariable) o;
    return Objects.equals(this.name, ndmpSettingsVariablesVariablePathVariable.name) &&
        Objects.equals(this.value, ndmpSettingsVariablesVariablePathVariable.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsVariablesVariablePathVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

