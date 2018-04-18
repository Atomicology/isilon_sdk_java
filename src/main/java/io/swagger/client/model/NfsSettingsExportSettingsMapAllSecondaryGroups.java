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
 * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
 */
@ApiModel(description = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class NfsSettingsExportSettingsMapAllSecondaryGroups {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Specifies the type of persona, which must be combined with a name.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    
    GROUP("group"),
    
    WELLKNOWN("wellknown");

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

  public NfsSettingsExportSettingsMapAllSecondaryGroups id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Specifies the serialized form of a persona, which can be &#39;UID:0&#39;, &#39;USER:name&#39;, &#39;GID:0&#39;, &#39;GROUP:wheel&#39;, or &#39;SID:S-1-1&#39;.
   * @return id
  **/
  @ApiModelProperty(value = "Specifies the serialized form of a persona, which can be 'UID:0', 'USER:name', 'GID:0', 'GROUP:wheel', or 'SID:S-1-1'.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NfsSettingsExportSettingsMapAllSecondaryGroups name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the persona name, which must be combined with a type.
   * @return name
  **/
  @ApiModelProperty(value = "Specifies the persona name, which must be combined with a type.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NfsSettingsExportSettingsMapAllSecondaryGroups type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies the type of persona, which must be combined with a name.
   * @return type
  **/
  @ApiModelProperty(value = "Specifies the type of persona, which must be combined with a name.")
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
    NfsSettingsExportSettingsMapAllSecondaryGroups nfsSettingsExportSettingsMapAllSecondaryGroups = (NfsSettingsExportSettingsMapAllSecondaryGroups) o;
    return Objects.equals(this.id, nfsSettingsExportSettingsMapAllSecondaryGroups.id) &&
        Objects.equals(this.name, nfsSettingsExportSettingsMapAllSecondaryGroups.name) &&
        Objects.equals(this.type, nfsSettingsExportSettingsMapAllSecondaryGroups.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NfsSettingsExportSettingsMapAllSecondaryGroups {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

