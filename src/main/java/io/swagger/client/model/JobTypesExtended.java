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
import io.swagger.client.model.JobTypeExtended;
import io.swagger.client.model.JobTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JobTypesExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobTypesExtended {
  @SerializedName("types")
  private List<JobTypeExtended> types = null;

  @SerializedName("total")
  private Integer total = null;

  public JobTypesExtended types(List<JobTypeExtended> types) {
    this.types = types;
    return this;
  }

  public JobTypesExtended addTypesItem(JobTypeExtended typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<JobTypeExtended>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<JobTypeExtended> getTypes() {
    return types;
  }

  public void setTypes(List<JobTypeExtended> types) {
    this.types = types;
  }

  public JobTypesExtended total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of items available.
   * minimum: 0
   * maximum: 4294967295
   * @return total
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTypesExtended jobTypesExtended = (JobTypesExtended) o;
    return Objects.equals(this.types, jobTypesExtended.types) &&
        Objects.equals(this.total, jobTypesExtended.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTypesExtended {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

