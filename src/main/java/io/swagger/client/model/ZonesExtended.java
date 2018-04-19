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
import io.swagger.client.model.ZoneExtendedExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ZonesExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ZonesExtended {
  @SerializedName("zones")
  private List<ZoneExtendedExtended> zones = null;

  public ZonesExtended zones(List<ZoneExtendedExtended> zones) {
    this.zones = zones;
    return this;
  }

  public ZonesExtended addZonesItem(ZoneExtendedExtended zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<ZoneExtendedExtended>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Get zones
   * @return zones
  **/
  @ApiModelProperty(value = "")
  public List<ZoneExtendedExtended> getZones() {
    return zones;
  }

  public void setZones(List<ZoneExtendedExtended> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesExtended zonesExtended = (ZonesExtended) o;
    return Objects.equals(this.zones, zonesExtended.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesExtended {\n");
    
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

