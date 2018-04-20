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
import io.swagger.client.model.WormDomainExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WormDomains
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class WormDomains {
  @SerializedName("domains")
  private List<WormDomainExtended> domains = null;

  public WormDomains domains(List<WormDomainExtended> domains) {
    this.domains = domains;
    return this;
  }

  public WormDomains addDomainsItem(WormDomainExtended domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<WormDomainExtended>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @ApiModelProperty(value = "")
  public List<WormDomainExtended> getDomains() {
    return domains;
  }

  public void setDomains(List<WormDomainExtended> domains) {
    this.domains = domains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WormDomains wormDomains = (WormDomains) o;
    return Objects.equals(this.domains, wormDomains.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WormDomains {\n");
    
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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

