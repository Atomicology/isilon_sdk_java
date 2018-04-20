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
 * JobJobPrepairParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class JobJobPrepairParams {
  /**
   * Type of permissions; not accepted with mode&#x3D;clone or mode&#x3D;inherit.
   */
  @JsonAdapter(MappingTypeEnum.Adapter.class)
  public enum MappingTypeEnum {
    GLOBAL("global"),
    
    SID("sid"),
    
    UNIX("unix"),
    
    NATIVE("native");

    private String value;

    MappingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MappingTypeEnum fromValue(String text) {
      for (MappingTypeEnum b : MappingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MappingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MappingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MappingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MappingTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mapping_type")
  private MappingTypeEnum mappingType = null;

  /**
   * Type of PermissionRepair operation.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    CLONE("clone"),
    
    INHERIT("inherit"),
    
    CONVERT("convert");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("zone")
  private String zone = null;

  public JobJobPrepairParams mappingType(MappingTypeEnum mappingType) {
    this.mappingType = mappingType;
    return this;
  }

   /**
   * Type of permissions; not accepted with mode&#x3D;clone or mode&#x3D;inherit.
   * @return mappingType
  **/
  @ApiModelProperty(value = "Type of permissions; not accepted with mode=clone or mode=inherit.")
  public MappingTypeEnum getMappingType() {
    return mappingType;
  }

  public void setMappingType(MappingTypeEnum mappingType) {
    this.mappingType = mappingType;
  }

  public JobJobPrepairParams mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Type of PermissionRepair operation.
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "Type of PermissionRepair operation.")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public JobJobPrepairParams template(String template) {
    this.template = template;
    return this;
  }

   /**
   * IFS file or directory to use as a template; required with mode&#x3D;clone and mode&#x3D;inherit, not accepted with mode&#x3D;convert.
   * @return template
  **/
  @ApiModelProperty(value = "IFS file or directory to use as a template; required with mode=clone and mode=inherit, not accepted with mode=convert.")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public JobJobPrepairParams zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Authentication zone; not accepted with mode&#x3D;clone or mode&#x3D;inherit.
   * @return zone
  **/
  @ApiModelProperty(value = "Authentication zone; not accepted with mode=clone or mode=inherit.")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobJobPrepairParams jobJobPrepairParams = (JobJobPrepairParams) o;
    return Objects.equals(this.mappingType, jobJobPrepairParams.mappingType) &&
        Objects.equals(this.mode, jobJobPrepairParams.mode) &&
        Objects.equals(this.template, jobJobPrepairParams.template) &&
        Objects.equals(this.zone, jobJobPrepairParams.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingType, mode, template, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobJobPrepairParams {\n");
    
    sb.append("    mappingType: ").append(toIndentedString(mappingType)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

