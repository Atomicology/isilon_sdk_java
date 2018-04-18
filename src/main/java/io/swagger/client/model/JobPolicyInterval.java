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
 * JobPolicyInterval
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class JobPolicyInterval {
  @SerializedName("begin")
  private String begin = null;

  @SerializedName("end")
  private String end = null;

  /**
   * Impact for the corresponding time span.
   */
  @JsonAdapter(ImpactEnum.Adapter.class)
  public enum ImpactEnum {
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High"),
    
    PAUSED("Paused");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImpactEnum fromValue(String text) {
      for (ImpactEnum b : ImpactEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImpactEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("impact")
  private ImpactEnum impact = null;

  public JobPolicyInterval begin(String begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Beginning time for the corresponding impact, in the format &#39;WWWW HH:MM&#39;, where &#39;WWWW&#39; is the full English name of the day of the week, &#39;HH&#39; is the hour (00-23), and &#39;MM&#39; is the minute (00-59).
   * @return begin
  **/
  @ApiModelProperty(required = true, value = "Beginning time for the corresponding impact, in the format 'WWWW HH:MM', where 'WWWW' is the full English name of the day of the week, 'HH' is the hour (00-23), and 'MM' is the minute (00-59).")
  public String getBegin() {
    return begin;
  }

  public void setBegin(String begin) {
    this.begin = begin;
  }

  public JobPolicyInterval end(String end) {
    this.end = end;
    return this;
  }

   /**
   * Ending time for the corresponding impact, in the format &#39;WWWW HH:MM&#39;, where &#39;WWWW&#39; is the full English name of the day of the week, &#39;HH&#39; is the hour (00-23), and &#39;MM&#39; is the minute (00-59).
   * @return end
  **/
  @ApiModelProperty(required = true, value = "Ending time for the corresponding impact, in the format 'WWWW HH:MM', where 'WWWW' is the full English name of the day of the week, 'HH' is the hour (00-23), and 'MM' is the minute (00-59).")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public JobPolicyInterval impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Impact for the corresponding time span.
   * @return impact
  **/
  @ApiModelProperty(required = true, value = "Impact for the corresponding time span.")
  public ImpactEnum getImpact() {
    return impact;
  }

  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobPolicyInterval jobPolicyInterval = (JobPolicyInterval) o;
    return Objects.equals(this.begin, jobPolicyInterval.begin) &&
        Objects.equals(this.end, jobPolicyInterval.end) &&
        Objects.equals(this.impact, jobPolicyInterval.impact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end, impact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobPolicyInterval {\n");
    
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
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

