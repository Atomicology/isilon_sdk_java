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
 * SettingsMappingExtendedExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class SettingsMappingExtendedExtended {
  @SerializedName("domain")
  private String domain = null;

  @SerializedName("mapping")
  private String mapping = null;

  /**
   * The authentication provider type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AD("ad"),
    
    LOCAL("local"),
    
    NIS("nis"),
    
    LDAP("ldap");

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

  public SettingsMappingExtendedExtended domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The FQDN of the source domain to map.
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "The FQDN of the source domain to map.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public SettingsMappingExtendedExtended mapping(String mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * The FQDN of destination domain to map to.
   * @return mapping
  **/
  @ApiModelProperty(required = true, value = "The FQDN of destination domain to map to.")
  public String getMapping() {
    return mapping;
  }

  public void setMapping(String mapping) {
    this.mapping = mapping;
  }

  public SettingsMappingExtendedExtended type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The authentication provider type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The authentication provider type.")
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
    SettingsMappingExtendedExtended settingsMappingExtendedExtended = (SettingsMappingExtendedExtended) o;
    return Objects.equals(this.domain, settingsMappingExtendedExtended.domain) &&
        Objects.equals(this.mapping, settingsMappingExtendedExtended.mapping) &&
        Objects.equals(this.type, settingsMappingExtendedExtended.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, mapping, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsMappingExtendedExtended {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

