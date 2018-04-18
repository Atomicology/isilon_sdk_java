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
import io.swagger.client.model.AuthLdapTemplatesLdapFieldTemplateItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthLdapTemplates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AuthLdapTemplates {
  @SerializedName("ldap_field_template")
  private List<AuthLdapTemplatesLdapFieldTemplateItem> ldapFieldTemplate = null;

  public AuthLdapTemplates ldapFieldTemplate(List<AuthLdapTemplatesLdapFieldTemplateItem> ldapFieldTemplate) {
    this.ldapFieldTemplate = ldapFieldTemplate;
    return this;
  }

  public AuthLdapTemplates addLdapFieldTemplateItem(AuthLdapTemplatesLdapFieldTemplateItem ldapFieldTemplateItem) {
    if (this.ldapFieldTemplate == null) {
      this.ldapFieldTemplate = new ArrayList<AuthLdapTemplatesLdapFieldTemplateItem>();
    }
    this.ldapFieldTemplate.add(ldapFieldTemplateItem);
    return this;
  }

   /**
   * Get ldapFieldTemplate
   * @return ldapFieldTemplate
  **/
  @ApiModelProperty(value = "")
  public List<AuthLdapTemplatesLdapFieldTemplateItem> getLdapFieldTemplate() {
    return ldapFieldTemplate;
  }

  public void setLdapFieldTemplate(List<AuthLdapTemplatesLdapFieldTemplateItem> ldapFieldTemplate) {
    this.ldapFieldTemplate = ldapFieldTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthLdapTemplates authLdapTemplates = (AuthLdapTemplates) o;
    return Objects.equals(this.ldapFieldTemplate, authLdapTemplates.ldapFieldTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapFieldTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthLdapTemplates {\n");
    
    sb.append("    ldapFieldTemplate: ").append(toIndentedString(ldapFieldTemplate)).append("\n");
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
