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
import io.swagger.client.model.NdmpSettingsVariablesVariablePathVariable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NdmpSettingsVariablesVariable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class NdmpSettingsVariablesVariable {
  @SerializedName("id")
  private String id = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("path_variables")
  private List<NdmpSettingsVariablesVariablePathVariable> pathVariables = null;

  public NdmpSettingsVariablesVariable id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique display id
   * @return id
  **/
  @ApiModelProperty(value = "The unique display id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NdmpSettingsVariablesVariable path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Return variables of the backup path.
   * @return path
  **/
  @ApiModelProperty(value = "Return variables of the backup path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public NdmpSettingsVariablesVariable pathVariables(List<NdmpSettingsVariablesVariablePathVariable> pathVariables) {
    this.pathVariables = pathVariables;
    return this;
  }

  public NdmpSettingsVariablesVariable addPathVariablesItem(NdmpSettingsVariablesVariablePathVariable pathVariablesItem) {
    if (this.pathVariables == null) {
      this.pathVariables = new ArrayList<NdmpSettingsVariablesVariablePathVariable>();
    }
    this.pathVariables.add(pathVariablesItem);
    return this;
  }

   /**
   * Get pathVariables
   * @return pathVariables
  **/
  @ApiModelProperty(value = "")
  public List<NdmpSettingsVariablesVariablePathVariable> getPathVariables() {
    return pathVariables;
  }

  public void setPathVariables(List<NdmpSettingsVariablesVariablePathVariable> pathVariables) {
    this.pathVariables = pathVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsVariablesVariable ndmpSettingsVariablesVariable = (NdmpSettingsVariablesVariable) o;
    return Objects.equals(this.id, ndmpSettingsVariablesVariable.id) &&
        Objects.equals(this.path, ndmpSettingsVariablesVariable.path) &&
        Objects.equals(this.pathVariables, ndmpSettingsVariablesVariable.pathVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, pathVariables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsVariablesVariable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathVariables: ").append(toIndentedString(pathVariables)).append("\n");
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

