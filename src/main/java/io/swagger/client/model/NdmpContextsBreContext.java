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
 * NdmpContextsBreContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpContextsBreContext {
  @SerializedName("bre_context_id")
  private String breContextId = null;

  @SerializedName("id")
  private String id = null;

  public NdmpContextsBreContext breContextId(String breContextId) {
    this.breContextId = breContextId;
    return this;
  }

   /**
   * Unique ID of NDMP BRE context
   * @return breContextId
  **/
  @ApiModelProperty(value = "Unique ID of NDMP BRE context")
  public String getBreContextId() {
    return breContextId;
  }

  public void setBreContextId(String breContextId) {
    this.breContextId = breContextId;
  }

  public NdmpContextsBreContext id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique display id.
   * @return id
  **/
  @ApiModelProperty(value = "Unique display id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpContextsBreContext ndmpContextsBreContext = (NdmpContextsBreContext) o;
    return Objects.equals(this.breContextId, ndmpContextsBreContext.breContextId) &&
        Objects.equals(this.id, ndmpContextsBreContext.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breContextId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpContextsBreContext {\n");
    
    sb.append("    breContextId: ").append(toIndentedString(breContextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

