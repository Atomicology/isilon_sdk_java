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
 * ReportAboutReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ReportAboutReport {
  /**
   * Whether report was manually requested (live) or scheduled.
   */
  @JsonAdapter(GeneratedEnum.Adapter.class)
  public enum GeneratedEnum {
    MANUAL("manual"),
    
    SCHEDULED("scheduled");

    private String value;

    GeneratedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GeneratedEnum fromValue(String text) {
      for (GeneratedEnum b : GeneratedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GeneratedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GeneratedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GeneratedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GeneratedEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("generated")
  private GeneratedEnum generated = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("time")
  private Integer time = null;

  /**
   * Whether this is a summary or detail report.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SUMMARY("summary"),
    
    DETAIL("detail");

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

  public ReportAboutReport generated(GeneratedEnum generated) {
    this.generated = generated;
    return this;
  }

   /**
   * Whether report was manually requested (live) or scheduled.
   * @return generated
  **/
  @ApiModelProperty(required = true, value = "Whether report was manually requested (live) or scheduled.")
  public GeneratedEnum getGenerated() {
    return generated;
  }

  public void setGenerated(GeneratedEnum generated) {
    this.generated = generated;
  }

  public ReportAboutReport id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The system ID given to the report.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The system ID given to the report.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportAboutReport time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Unix epoch time the report was taken.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "Unix epoch time the report was taken.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public ReportAboutReport type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Whether this is a summary or detail report.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Whether this is a summary or detail report.")
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
    ReportAboutReport reportAboutReport = (ReportAboutReport) o;
    return Objects.equals(this.generated, reportAboutReport.generated) &&
        Objects.equals(this.id, reportAboutReport.id) &&
        Objects.equals(this.time, reportAboutReport.time) &&
        Objects.equals(this.type, reportAboutReport.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generated, id, time, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAboutReport {\n");
    
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

