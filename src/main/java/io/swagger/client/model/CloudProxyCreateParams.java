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
import io.swagger.client.model.CloudProxy;
import java.io.IOException;

/**
 * CloudProxyCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CloudProxyCreateParams {
  @SerializedName("host")
  private String host = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("port")
  private Integer port = null;

  /**
   * The type of connection used to connect to this proxy
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SOCKS_4("socks_4"),
    
    SOCKS_5("socks_5"),
    
    HTTP("http");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("username")
  private String username = null;

  public CloudProxyCreateParams host(String host) {
    this.host = host;
    return this;
  }

   /**
   * A host name or network address for connecting to this proxy
   * @return host
  **/
  @ApiModelProperty(required = true, value = "A host name or network address for connecting to this proxy")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public CloudProxyCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique friendly name for this proxy configuration
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A unique friendly name for this proxy configuration")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudProxyCreateParams password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to connect to this proxy if required (write-only)
   * @return password
  **/
  @ApiModelProperty(value = "The password to connect to this proxy if required (write-only)")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CloudProxyCreateParams port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * The port used to connect to this proxy
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port used to connect to this proxy")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public CloudProxyCreateParams type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of connection used to connect to this proxy
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of connection used to connect to this proxy")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CloudProxyCreateParams username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to connect to this proxy if required
   * @return username
  **/
  @ApiModelProperty(value = "The username to connect to this proxy if required")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProxyCreateParams cloudProxyCreateParams = (CloudProxyCreateParams) o;
    return Objects.equals(this.host, cloudProxyCreateParams.host) &&
        Objects.equals(this.name, cloudProxyCreateParams.name) &&
        Objects.equals(this.password, cloudProxyCreateParams.password) &&
        Objects.equals(this.port, cloudProxyCreateParams.port) &&
        Objects.equals(this.type, cloudProxyCreateParams.type) &&
        Objects.equals(this.username, cloudProxyCreateParams.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, name, password, port, type, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProxyCreateParams {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

