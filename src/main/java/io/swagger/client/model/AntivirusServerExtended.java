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
import io.swagger.client.model.AntivirusServer;
import java.io.IOException;

/**
 * AntivirusServerExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class AntivirusServerExtended {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("definitions")
  private String definitions = null;

  @SerializedName("id")
  private String id = null;

  /**
   * The status of the server.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public AntivirusServerExtended description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the server.
   * @return description
  **/
  @ApiModelProperty(value = "A description for the server.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AntivirusServerExtended enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the server is enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether the server is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AntivirusServerExtended url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The icap url for the server.  This should have a format of: icap://host.domain:port/path
   * @return url
  **/
  @ApiModelProperty(value = "The icap url for the server.  This should have a format of: icap://host.domain:port/path")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AntivirusServerExtended definitions(String definitions) {
    this.definitions = definitions;
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/
  @ApiModelProperty(value = "")
  public String getDefinitions() {
    return definitions;
  }

  public void setDefinitions(String definitions) {
    this.definitions = definitions;
  }

  public AntivirusServerExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the server.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the server.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AntivirusServerExtended status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the server.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the server.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntivirusServerExtended antivirusServerExtended = (AntivirusServerExtended) o;
    return Objects.equals(this.description, antivirusServerExtended.description) &&
        Objects.equals(this.enabled, antivirusServerExtended.enabled) &&
        Objects.equals(this.url, antivirusServerExtended.url) &&
        Objects.equals(this.definitions, antivirusServerExtended.definitions) &&
        Objects.equals(this.id, antivirusServerExtended.id) &&
        Objects.equals(this.status, antivirusServerExtended.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, url, definitions, id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntivirusServerExtended {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
