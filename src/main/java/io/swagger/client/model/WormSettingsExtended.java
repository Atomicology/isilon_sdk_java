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
import io.swagger.client.model.Empty;
import java.io.IOException;

/**
 * Specifies global SmartLock (WORM) settings.
 */
@ApiModel(description = "Specifies global SmartLock (WORM) settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class WormSettingsExtended {
  @SerializedName("cdate")
  private Empty cdate = null;

  public WormSettingsExtended cdate(Empty cdate) {
    this.cdate = cdate;
    return this;
  }

   /**
   * To set the compliance clock to the current system time, PUT to this resource with an empty JSON object {} for the cdate value.  This cluster must be in compliance mode to set the compliance clock.
   * @return cdate
  **/
  @ApiModelProperty(value = "To set the compliance clock to the current system time, PUT to this resource with an empty JSON object {} for the cdate value.  This cluster must be in compliance mode to set the compliance clock.")
  public Empty getCdate() {
    return cdate;
  }

  public void setCdate(Empty cdate) {
    this.cdate = cdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WormSettingsExtended wormSettingsExtended = (WormSettingsExtended) o;
    return Objects.equals(this.cdate, wormSettingsExtended.cdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WormSettingsExtended {\n");
    
    sb.append("    cdate: ").append(toIndentedString(cdate)).append("\n");
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
