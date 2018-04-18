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
import io.swagger.client.model.SmbShareExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmbShares
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SmbShares {
  @SerializedName("shares")
  private List<SmbShareExtended> shares = null;

  public SmbShares shares(List<SmbShareExtended> shares) {
    this.shares = shares;
    return this;
  }

  public SmbShares addSharesItem(SmbShareExtended sharesItem) {
    if (this.shares == null) {
      this.shares = new ArrayList<SmbShareExtended>();
    }
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(value = "")
  public List<SmbShareExtended> getShares() {
    return shares;
  }

  public void setShares(List<SmbShareExtended> shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmbShares smbShares = (SmbShares) o;
    return Objects.equals(this.shares, smbShares.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmbShares {\n");
    
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

