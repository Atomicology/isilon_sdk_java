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
import java.io.IOException;

/**
 * HttpSettingsSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HttpSettingsSettings {
  @SerializedName("access_control")
  private Boolean accessControl = null;

  @SerializedName("basic_authentication")
  private Boolean basicAuthentication = null;

  @SerializedName("dav")
  private Boolean dav = null;

  @SerializedName("enable_access_log")
  private Boolean enableAccessLog = null;

  @SerializedName("https")
  private Boolean https = null;

  @SerializedName("integrated_authentication")
  private Boolean integratedAuthentication = null;

  @SerializedName("server_root")
  private String serverRoot = null;

  /**
   * Enable/disable the HTTP service or redirect to WebUI.
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    REDIRECT("redirect");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("service")
  private ServiceEnum service = null;

  public HttpSettingsSettings accessControl(Boolean accessControl) {
    this.accessControl = accessControl;
    return this;
  }

   /**
   * Enable Access Control Authentication
   * @return accessControl
  **/
  @ApiModelProperty(value = "Enable Access Control Authentication")
  public Boolean isAccessControl() {
    return accessControl;
  }

  public void setAccessControl(Boolean accessControl) {
    this.accessControl = accessControl;
  }

  public HttpSettingsSettings basicAuthentication(Boolean basicAuthentication) {
    this.basicAuthentication = basicAuthentication;
    return this;
  }

   /**
   * Enable Basic Authentication
   * @return basicAuthentication
  **/
  @ApiModelProperty(value = "Enable Basic Authentication")
  public Boolean isBasicAuthentication() {
    return basicAuthentication;
  }

  public void setBasicAuthentication(Boolean basicAuthentication) {
    this.basicAuthentication = basicAuthentication;
  }

  public HttpSettingsSettings dav(Boolean dav) {
    this.dav = dav;
    return this;
  }

   /**
   * Enable DAV specification
   * @return dav
  **/
  @ApiModelProperty(value = "Enable DAV specification")
  public Boolean isDav() {
    return dav;
  }

  public void setDav(Boolean dav) {
    this.dav = dav;
  }

  public HttpSettingsSettings enableAccessLog(Boolean enableAccessLog) {
    this.enableAccessLog = enableAccessLog;
    return this;
  }

   /**
   * Enable HTTP access logging
   * @return enableAccessLog
  **/
  @ApiModelProperty(value = "Enable HTTP access logging")
  public Boolean isEnableAccessLog() {
    return enableAccessLog;
  }

  public void setEnableAccessLog(Boolean enableAccessLog) {
    this.enableAccessLog = enableAccessLog;
  }

  public HttpSettingsSettings https(Boolean https) {
    this.https = https;
    return this;
  }

   /**
   * Use HTTPS transport
   * @return https
  **/
  @ApiModelProperty(value = "Use HTTPS transport")
  public Boolean isHttps() {
    return https;
  }

  public void setHttps(Boolean https) {
    this.https = https;
  }

  public HttpSettingsSettings integratedAuthentication(Boolean integratedAuthentication) {
    this.integratedAuthentication = integratedAuthentication;
    return this;
  }

   /**
   * Enable Integrated Authentication
   * @return integratedAuthentication
  **/
  @ApiModelProperty(value = "Enable Integrated Authentication")
  public Boolean isIntegratedAuthentication() {
    return integratedAuthentication;
  }

  public void setIntegratedAuthentication(Boolean integratedAuthentication) {
    this.integratedAuthentication = integratedAuthentication;
  }

  public HttpSettingsSettings serverRoot(String serverRoot) {
    this.serverRoot = serverRoot;
    return this;
  }

   /**
   * Document root directory. Must be within /ifs.
   * @return serverRoot
  **/
  @ApiModelProperty(value = "Document root directory. Must be within /ifs.")
  public String getServerRoot() {
    return serverRoot;
  }

  public void setServerRoot(String serverRoot) {
    this.serverRoot = serverRoot;
  }

  public HttpSettingsSettings service(ServiceEnum service) {
    this.service = service;
    return this;
  }

   /**
   * Enable/disable the HTTP service or redirect to WebUI.
   * @return service
  **/
  @ApiModelProperty(value = "Enable/disable the HTTP service or redirect to WebUI.")
  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpSettingsSettings httpSettingsSettings = (HttpSettingsSettings) o;
    return Objects.equals(this.accessControl, httpSettingsSettings.accessControl) &&
        Objects.equals(this.basicAuthentication, httpSettingsSettings.basicAuthentication) &&
        Objects.equals(this.dav, httpSettingsSettings.dav) &&
        Objects.equals(this.enableAccessLog, httpSettingsSettings.enableAccessLog) &&
        Objects.equals(this.https, httpSettingsSettings.https) &&
        Objects.equals(this.integratedAuthentication, httpSettingsSettings.integratedAuthentication) &&
        Objects.equals(this.serverRoot, httpSettingsSettings.serverRoot) &&
        Objects.equals(this.service, httpSettingsSettings.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControl, basicAuthentication, dav, enableAccessLog, https, integratedAuthentication, serverRoot, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpSettingsSettings {\n");
    
    sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
    sb.append("    basicAuthentication: ").append(toIndentedString(basicAuthentication)).append("\n");
    sb.append("    dav: ").append(toIndentedString(dav)).append("\n");
    sb.append("    enableAccessLog: ").append(toIndentedString(enableAccessLog)).append("\n");
    sb.append("    https: ").append(toIndentedString(https)).append("\n");
    sb.append("    integratedAuthentication: ").append(toIndentedString(integratedAuthentication)).append("\n");
    sb.append("    serverRoot: ").append(toIndentedString(serverRoot)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
