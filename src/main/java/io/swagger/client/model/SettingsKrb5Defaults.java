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
import io.swagger.client.model.SettingsKrb5DefaultsKrb5Settings;
import java.io.IOException;

/**
 * SettingsKrb5Defaults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SettingsKrb5Defaults {
  @SerializedName("krb5_settings")
  private SettingsKrb5DefaultsKrb5Settings krb5Settings = null;

  public SettingsKrb5Defaults krb5Settings(SettingsKrb5DefaultsKrb5Settings krb5Settings) {
    this.krb5Settings = krb5Settings;
    return this;
  }

   /**
   * Specifies the properties for the global Kerberos authentication settings.
   * @return krb5Settings
  **/
  @ApiModelProperty(value = "Specifies the properties for the global Kerberos authentication settings.")
  public SettingsKrb5DefaultsKrb5Settings getKrb5Settings() {
    return krb5Settings;
  }

  public void setKrb5Settings(SettingsKrb5DefaultsKrb5Settings krb5Settings) {
    this.krb5Settings = krb5Settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsKrb5Defaults settingsKrb5Defaults = (SettingsKrb5Defaults) o;
    return Objects.equals(this.krb5Settings, settingsKrb5Defaults.krb5Settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(krb5Settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsKrb5Defaults {\n");
    
    sb.append("    krb5Settings: ").append(toIndentedString(krb5Settings)).append("\n");
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

