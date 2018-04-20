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
 * AuthLogLevelLevel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class AuthLogLevelLevel {
  /**
   * Valid auth logging levels
   */
  @JsonAdapter(LsassLevelEnum.Adapter.class)
  public enum LsassLevelEnum {
    ALWAYS("always"),
    
    ERROR("error"),
    
    WARNING("warning"),
    
    INFO("info"),
    
    VERBOSE("verbose"),
    
    DEBUG("debug"),
    
    TRACE("trace");

    private String value;

    LsassLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LsassLevelEnum fromValue(String text) {
      for (LsassLevelEnum b : LsassLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LsassLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LsassLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LsassLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LsassLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("lsass-level")
  private LsassLevelEnum lsassLevel = null;

  /**
   * Valid auth logging levels
   */
  @JsonAdapter(NetlogonLevelEnum.Adapter.class)
  public enum NetlogonLevelEnum {
    ALWAYS("always"),
    
    ERROR("error"),
    
    WARNING("warning"),
    
    INFO("info"),
    
    VERBOSE("verbose"),
    
    DEBUG("debug"),
    
    TRACE("trace");

    private String value;

    NetlogonLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetlogonLevelEnum fromValue(String text) {
      for (NetlogonLevelEnum b : NetlogonLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NetlogonLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetlogonLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetlogonLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NetlogonLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("netlogon-level")
  private NetlogonLevelEnum netlogonLevel = null;

  public AuthLogLevelLevel lsassLevel(LsassLevelEnum lsassLevel) {
    this.lsassLevel = lsassLevel;
    return this;
  }

   /**
   * Valid auth logging levels
   * @return lsassLevel
  **/
  @ApiModelProperty(value = "Valid auth logging levels")
  public LsassLevelEnum getLsassLevel() {
    return lsassLevel;
  }

  public void setLsassLevel(LsassLevelEnum lsassLevel) {
    this.lsassLevel = lsassLevel;
  }

  public AuthLogLevelLevel netlogonLevel(NetlogonLevelEnum netlogonLevel) {
    this.netlogonLevel = netlogonLevel;
    return this;
  }

   /**
   * Valid auth logging levels
   * @return netlogonLevel
  **/
  @ApiModelProperty(value = "Valid auth logging levels")
  public NetlogonLevelEnum getNetlogonLevel() {
    return netlogonLevel;
  }

  public void setNetlogonLevel(NetlogonLevelEnum netlogonLevel) {
    this.netlogonLevel = netlogonLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthLogLevelLevel authLogLevelLevel = (AuthLogLevelLevel) o;
    return Objects.equals(this.lsassLevel, authLogLevelLevel.lsassLevel) &&
        Objects.equals(this.netlogonLevel, authLogLevelLevel.netlogonLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lsassLevel, netlogonLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthLogLevelLevel {\n");
    
    sb.append("    lsassLevel: ").append(toIndentedString(lsassLevel)).append("\n");
    sb.append("    netlogonLevel: ").append(toIndentedString(netlogonLevel)).append("\n");
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

