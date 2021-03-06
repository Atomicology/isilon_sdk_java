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
import io.swagger.client.model.NdmpSettingsDmasDmavendor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NdmpSettingsDmas
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class NdmpSettingsDmas {
  @SerializedName("dmavendors")
  private List<NdmpSettingsDmasDmavendor> dmavendors = null;

  public NdmpSettingsDmas dmavendors(List<NdmpSettingsDmasDmavendor> dmavendors) {
    this.dmavendors = dmavendors;
    return this;
  }

  public NdmpSettingsDmas addDmavendorsItem(NdmpSettingsDmasDmavendor dmavendorsItem) {
    if (this.dmavendors == null) {
      this.dmavendors = new ArrayList<NdmpSettingsDmasDmavendor>();
    }
    this.dmavendors.add(dmavendorsItem);
    return this;
  }

   /**
   * Get dmavendors
   * @return dmavendors
  **/
  @ApiModelProperty(value = "")
  public List<NdmpSettingsDmasDmavendor> getDmavendors() {
    return dmavendors;
  }

  public void setDmavendors(List<NdmpSettingsDmasDmavendor> dmavendors) {
    this.dmavendors = dmavendors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NdmpSettingsDmas ndmpSettingsDmas = (NdmpSettingsDmas) o;
    return Objects.equals(this.dmavendors, ndmpSettingsDmas.dmavendors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dmavendors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NdmpSettingsDmas {\n");
    
    sb.append("    dmavendors: ").append(toIndentedString(dmavendors)).append("\n");
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

