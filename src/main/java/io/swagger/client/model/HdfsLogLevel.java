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
 * HdfsLogLevel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class HdfsLogLevel {
  /**
   * Setup the HDFS service log level for this node
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    ALWAYS("always"),
    
    ERROR("error"),
    
    WARNING("warning"),
    
    INFO("info"),
    
    VERBOSE("verbose"),
    
    DEBUG("debug"),
    
    TRACE("trace"),
    
    DEFAULT("default");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  public HdfsLogLevel level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Setup the HDFS service log level for this node
   * @return level
  **/
  @ApiModelProperty(value = "Setup the HDFS service log level for this node")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdfsLogLevel hdfsLogLevel = (HdfsLogLevel) o;
    return Objects.equals(this.level, hdfsLogLevel.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdfsLogLevel {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

