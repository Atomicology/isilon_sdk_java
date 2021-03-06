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
import io.swagger.client.model.ProvidersLdapLdapItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProvidersLdap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ProvidersLdap {
  @SerializedName("ldap")
  private List<ProvidersLdapLdapItem> ldap = null;

  public ProvidersLdap ldap(List<ProvidersLdapLdapItem> ldap) {
    this.ldap = ldap;
    return this;
  }

  public ProvidersLdap addLdapItem(ProvidersLdapLdapItem ldapItem) {
    if (this.ldap == null) {
      this.ldap = new ArrayList<ProvidersLdapLdapItem>();
    }
    this.ldap.add(ldapItem);
    return this;
  }

   /**
   * Get ldap
   * @return ldap
  **/
  @ApiModelProperty(value = "")
  public List<ProvidersLdapLdapItem> getLdap() {
    return ldap;
  }

  public void setLdap(List<ProvidersLdapLdapItem> ldap) {
    this.ldap = ldap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersLdap providersLdap = (ProvidersLdap) o;
    return Objects.equals(this.ldap, providersLdap.ldap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersLdap {\n");
    
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
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

