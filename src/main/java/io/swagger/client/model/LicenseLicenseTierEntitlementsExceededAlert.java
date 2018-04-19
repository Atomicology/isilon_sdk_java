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
 * LicenseLicenseTierEntitlementsExceededAlert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class LicenseLicenseTierEntitlementsExceededAlert {
  @SerializedName("current")
  private Integer current = null;

  /**
   * Alert type. The unit of measure for the current and licensed fields for capacity is terabytes. For nodes_with_seds_count, it is the number of nodes that have one or more self-encrypting drives.
   */
  @JsonAdapter(IssueTypeEnum.Adapter.class)
  public enum IssueTypeEnum {
    CAPACITY("capacity"),
    
    NODE_COUNT("node_count"),
    
    NODES_WITH_SEDS_COUNT("nodes_with_seds_count");

    private String value;

    IssueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IssueTypeEnum fromValue(String text) {
      for (IssueTypeEnum b : IssueTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IssueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IssueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IssueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IssueTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("issue_type")
  private IssueTypeEnum issueType = null;

  @SerializedName("licensed")
  private Integer licensed = null;

  public LicenseLicenseTierEntitlementsExceededAlert current(Integer current) {
    this.current = current;
    return this;
  }

   /**
   * Current usage.
   * minimum: 0
   * maximum: 2147483647
   * @return current
  **/
  @ApiModelProperty(value = "Current usage.")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public LicenseLicenseTierEntitlementsExceededAlert issueType(IssueTypeEnum issueType) {
    this.issueType = issueType;
    return this;
  }

   /**
   * Alert type. The unit of measure for the current and licensed fields for capacity is terabytes. For nodes_with_seds_count, it is the number of nodes that have one or more self-encrypting drives.
   * @return issueType
  **/
  @ApiModelProperty(required = true, value = "Alert type. The unit of measure for the current and licensed fields for capacity is terabytes. For nodes_with_seds_count, it is the number of nodes that have one or more self-encrypting drives.")
  public IssueTypeEnum getIssueType() {
    return issueType;
  }

  public void setIssueType(IssueTypeEnum issueType) {
    this.issueType = issueType;
  }

  public LicenseLicenseTierEntitlementsExceededAlert licensed(Integer licensed) {
    this.licensed = licensed;
    return this;
  }

   /**
   * Licensed amount.
   * minimum: 0
   * maximum: 2147483647
   * @return licensed
  **/
  @ApiModelProperty(value = "Licensed amount.")
  public Integer getLicensed() {
    return licensed;
  }

  public void setLicensed(Integer licensed) {
    this.licensed = licensed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseLicenseTierEntitlementsExceededAlert licenseLicenseTierEntitlementsExceededAlert = (LicenseLicenseTierEntitlementsExceededAlert) o;
    return Objects.equals(this.current, licenseLicenseTierEntitlementsExceededAlert.current) &&
        Objects.equals(this.issueType, licenseLicenseTierEntitlementsExceededAlert.issueType) &&
        Objects.equals(this.licensed, licenseLicenseTierEntitlementsExceededAlert.licensed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, issueType, licensed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseLicenseTierEntitlementsExceededAlert {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    licensed: ").append(toIndentedString(licensed)).append("\n");
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

