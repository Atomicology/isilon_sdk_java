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
import io.swagger.client.model.SmbLogLevelFiltersFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmbLogLevelFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class SmbLogLevelFilters {
  @SerializedName("filters")
  private List<SmbLogLevelFiltersFilter> filters = null;

  public SmbLogLevelFilters filters(List<SmbLogLevelFiltersFilter> filters) {
    this.filters = filters;
    return this;
  }

  public SmbLogLevelFilters addFiltersItem(SmbLogLevelFiltersFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<SmbLogLevelFiltersFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(value = "")
  public List<SmbLogLevelFiltersFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SmbLogLevelFiltersFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmbLogLevelFilters smbLogLevelFilters = (SmbLogLevelFilters) o;
    return Objects.equals(this.filters, smbLogLevelFilters.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmbLogLevelFilters {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

