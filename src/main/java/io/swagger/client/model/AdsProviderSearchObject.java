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
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import java.io.IOException;

/**
 * AdsProviderSearchObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AdsProviderSearchObject {
  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private AuthAccessAccessItemFileGroup id = null;

  public AdsProviderSearchObject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdsProviderSearchObject displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AdsProviderSearchObject id(AuthAccessAccessItemFileGroup id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getId() {
    return id;
  }

  public void setId(AuthAccessAccessItemFileGroup id) {
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
    AdsProviderSearchObject adsProviderSearchObject = (AdsProviderSearchObject) o;
    return Objects.equals(this.description, adsProviderSearchObject.description) &&
        Objects.equals(this.displayName, adsProviderSearchObject.displayName) &&
        Objects.equals(this.id, adsProviderSearchObject.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsProviderSearchObject {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
