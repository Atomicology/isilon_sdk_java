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
 * StoragepoolSuggestedProtectionSuggestedProtectionItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class StoragepoolSuggestedProtectionSuggestedProtectionItem {
  @SerializedName("suggested_protection")
  private String suggestedProtection = null;

  public StoragepoolSuggestedProtectionSuggestedProtectionItem suggestedProtection(String suggestedProtection) {
    this.suggestedProtection = suggestedProtection;
    return this;
  }

   /**
   * The suggested protection policy.
   * @return suggestedProtection
  **/
  @ApiModelProperty(value = "The suggested protection policy.")
  public String getSuggestedProtection() {
    return suggestedProtection;
  }

  public void setSuggestedProtection(String suggestedProtection) {
    this.suggestedProtection = suggestedProtection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragepoolSuggestedProtectionSuggestedProtectionItem storagepoolSuggestedProtectionSuggestedProtectionItem = (StoragepoolSuggestedProtectionSuggestedProtectionItem) o;
    return Objects.equals(this.suggestedProtection, storagepoolSuggestedProtectionSuggestedProtectionItem.suggestedProtection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedProtection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragepoolSuggestedProtectionSuggestedProtectionItem {\n");
    
    sb.append("    suggestedProtection: ").append(toIndentedString(suggestedProtection)).append("\n");
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

