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
import io.swagger.client.model.WormDomain;
import java.io.IOException;

/**
 * WormDomainCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class WormDomainCreateParams {
  @SerializedName("autocommit_offset")
  private Integer autocommitOffset = null;

  @SerializedName("default_retention")
  private String defaultRetention = null;

  @SerializedName("max_retention")
  private String maxRetention = null;

  @SerializedName("min_retention")
  private String minRetention = null;

  @SerializedName("override_date")
  private Integer overrideDate = null;

  /**
   * When this value is set to &#39;on&#39;, files in this domain can be deleted through the privileged delete feature. If this value is set to &#39;disabled&#39;, privileged file deletes are permanently disabled and cannot be turned on again.
   */
  @JsonAdapter(PrivilegedDeleteEnum.Adapter.class)
  public enum PrivilegedDeleteEnum {
    ON("on"),
    
    OFF("off"),
    
    DISABLED("disabled");

    private String value;

    PrivilegedDeleteEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrivilegedDeleteEnum fromValue(String text) {
      for (PrivilegedDeleteEnum b : PrivilegedDeleteEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrivilegedDeleteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrivilegedDeleteEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrivilegedDeleteEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrivilegedDeleteEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("privileged_delete")
  private PrivilegedDeleteEnum privilegedDelete = null;

  /**
   * Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ENTERPRISE("enterprise"),
    
    COMPLIANCE("compliance"),
    
    COMPLIANCE_LEGACY_("compliance (legacy)");

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

  @SerializedName("path")
  private String path = null;

  public WormDomainCreateParams autocommitOffset(Integer autocommitOffset) {
    this.autocommitOffset = autocommitOffset;
    return this;
  }

   /**
   * Specifies the autocommit time period for the domain in seconds.  After a file is in the domain without being modified for the specified time period, the file is automatically committed. If this parameter is set to null, there is no autocommit time, and files must be committed manually.
   * minimum: 0
   * @return autocommitOffset
  **/
  @ApiModelProperty(value = "Specifies the autocommit time period for the domain in seconds.  After a file is in the domain without being modified for the specified time period, the file is automatically committed. If this parameter is set to null, there is no autocommit time, and files must be committed manually.")
  public Integer getAutocommitOffset() {
    return autocommitOffset;
  }

  public void setAutocommitOffset(Integer autocommitOffset) {
    this.autocommitOffset = autocommitOffset;
  }

  public WormDomainCreateParams defaultRetention(String defaultRetention) {
    this.defaultRetention = defaultRetention;
    return this;
  }

   /**
   * Get defaultRetention
   * @return defaultRetention
  **/
  @ApiModelProperty(value = "")
  public String getDefaultRetention() {
    return defaultRetention;
  }

  public void setDefaultRetention(String defaultRetention) {
    this.defaultRetention = defaultRetention;
  }

  public WormDomainCreateParams maxRetention(String maxRetention) {
    this.maxRetention = maxRetention;
    return this;
  }

   /**
   * Get maxRetention
   * @return maxRetention
  **/
  @ApiModelProperty(value = "")
  public String getMaxRetention() {
    return maxRetention;
  }

  public void setMaxRetention(String maxRetention) {
    this.maxRetention = maxRetention;
  }

  public WormDomainCreateParams minRetention(String minRetention) {
    this.minRetention = minRetention;
    return this;
  }

   /**
   * Get minRetention
   * @return minRetention
  **/
  @ApiModelProperty(value = "")
  public String getMinRetention() {
    return minRetention;
  }

  public void setMinRetention(String minRetention) {
    this.minRetention = minRetention;
  }

  public WormDomainCreateParams overrideDate(Integer overrideDate) {
    this.overrideDate = overrideDate;
    return this;
  }

   /**
   * Specifies the override retention date for the domain. If this date is later than the retention date for any committed file, the file will remain protected until the override retention date.
   * minimum: 0
   * @return overrideDate
  **/
  @ApiModelProperty(value = "Specifies the override retention date for the domain. If this date is later than the retention date for any committed file, the file will remain protected until the override retention date.")
  public Integer getOverrideDate() {
    return overrideDate;
  }

  public void setOverrideDate(Integer overrideDate) {
    this.overrideDate = overrideDate;
  }

  public WormDomainCreateParams privilegedDelete(PrivilegedDeleteEnum privilegedDelete) {
    this.privilegedDelete = privilegedDelete;
    return this;
  }

   /**
   * When this value is set to &#39;on&#39;, files in this domain can be deleted through the privileged delete feature. If this value is set to &#39;disabled&#39;, privileged file deletes are permanently disabled and cannot be turned on again.
   * @return privilegedDelete
  **/
  @ApiModelProperty(value = "When this value is set to 'on', files in this domain can be deleted through the privileged delete feature. If this value is set to 'disabled', privileged file deletes are permanently disabled and cannot be turned on again.")
  public PrivilegedDeleteEnum getPrivilegedDelete() {
    return privilegedDelete;
  }

  public void setPrivilegedDelete(PrivilegedDeleteEnum privilegedDelete) {
    this.privilegedDelete = privilegedDelete;
  }

  public WormDomainCreateParams type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.
   * @return type
  **/
  @ApiModelProperty(value = "Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public WormDomainCreateParams path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Specifies the root path of this domain. Files in this directory and all sub-directories will be protected.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Specifies the root path of this domain. Files in this directory and all sub-directories will be protected.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WormDomainCreateParams wormDomainCreateParams = (WormDomainCreateParams) o;
    return Objects.equals(this.autocommitOffset, wormDomainCreateParams.autocommitOffset) &&
        Objects.equals(this.defaultRetention, wormDomainCreateParams.defaultRetention) &&
        Objects.equals(this.maxRetention, wormDomainCreateParams.maxRetention) &&
        Objects.equals(this.minRetention, wormDomainCreateParams.minRetention) &&
        Objects.equals(this.overrideDate, wormDomainCreateParams.overrideDate) &&
        Objects.equals(this.privilegedDelete, wormDomainCreateParams.privilegedDelete) &&
        Objects.equals(this.type, wormDomainCreateParams.type) &&
        Objects.equals(this.path, wormDomainCreateParams.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocommitOffset, defaultRetention, maxRetention, minRetention, overrideDate, privilegedDelete, type, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WormDomainCreateParams {\n");
    
    sb.append("    autocommitOffset: ").append(toIndentedString(autocommitOffset)).append("\n");
    sb.append("    defaultRetention: ").append(toIndentedString(defaultRetention)).append("\n");
    sb.append("    maxRetention: ").append(toIndentedString(maxRetention)).append("\n");
    sb.append("    minRetention: ").append(toIndentedString(minRetention)).append("\n");
    sb.append("    overrideDate: ").append(toIndentedString(overrideDate)).append("\n");
    sb.append("    privilegedDelete: ").append(toIndentedString(privilegedDelete)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

