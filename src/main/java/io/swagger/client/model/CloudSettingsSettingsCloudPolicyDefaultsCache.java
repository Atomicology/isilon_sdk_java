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
 * CloudSettingsSettingsCloudPolicyDefaultsCache
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CloudSettingsSettingsCloudPolicyDefaultsCache {
  @SerializedName("expiration")
  private Integer expiration = null;

  /**
   * Specifies cache read ahead type.
   */
  @JsonAdapter(ReadAheadEnum.Adapter.class)
  public enum ReadAheadEnum {
    PARTIAL("partial"),
    
    FULL("full");

    private String value;

    ReadAheadEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReadAheadEnum fromValue(String text) {
      for (ReadAheadEnum b : ReadAheadEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReadAheadEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReadAheadEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReadAheadEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReadAheadEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("read_ahead")
  private ReadAheadEnum readAhead = null;

  /**
   * Specifies cache type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CACHED("cached"),
    
    NO_CACHE("no-cache");

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

  public CloudSettingsSettingsCloudPolicyDefaultsCache expiration(Integer expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Specifies cache expiration.
   * @return expiration
  **/
  @ApiModelProperty(value = "Specifies cache expiration.")
  public Integer getExpiration() {
    return expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }

  public CloudSettingsSettingsCloudPolicyDefaultsCache readAhead(ReadAheadEnum readAhead) {
    this.readAhead = readAhead;
    return this;
  }

   /**
   * Specifies cache read ahead type.
   * @return readAhead
  **/
  @ApiModelProperty(value = "Specifies cache read ahead type.")
  public ReadAheadEnum getReadAhead() {
    return readAhead;
  }

  public void setReadAhead(ReadAheadEnum readAhead) {
    this.readAhead = readAhead;
  }

  public CloudSettingsSettingsCloudPolicyDefaultsCache type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies cache type.
   * @return type
  **/
  @ApiModelProperty(value = "Specifies cache type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudSettingsSettingsCloudPolicyDefaultsCache cloudSettingsSettingsCloudPolicyDefaultsCache = (CloudSettingsSettingsCloudPolicyDefaultsCache) o;
    return Objects.equals(this.expiration, cloudSettingsSettingsCloudPolicyDefaultsCache.expiration) &&
        Objects.equals(this.readAhead, cloudSettingsSettingsCloudPolicyDefaultsCache.readAhead) &&
        Objects.equals(this.type, cloudSettingsSettingsCloudPolicyDefaultsCache.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiration, readAhead, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudSettingsSettingsCloudPolicyDefaultsCache {\n");
    
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    readAhead: ").append(toIndentedString(readAhead)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

