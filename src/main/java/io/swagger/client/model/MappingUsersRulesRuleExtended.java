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
import io.swagger.client.model.MappingUsersRulesRuleOptionsDefaultUser;
import io.swagger.client.model.MappingUsersRulesRuleOptionsExtended;
import io.swagger.client.model.MappingUsersRulesRuleUser2Extended;
import java.io.IOException;

/**
 * MappingUsersRulesRuleExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class MappingUsersRulesRuleExtended {
  /**
   * Specifies the operator to make rules on specified users or groups.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    APPEND("append"),
    
    INSERT("insert"),
    
    REPLACE("replace"),
    
    TRIM("trim"),
    
    UNION("union");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperatorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("options")
  private MappingUsersRulesRuleOptionsExtended options = null;

  @SerializedName("user1")
  private MappingUsersRulesRuleOptionsDefaultUser user1 = null;

  @SerializedName("user2")
  private MappingUsersRulesRuleUser2Extended user2 = null;

  public MappingUsersRulesRuleExtended operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Specifies the operator to make rules on specified users or groups.
   * @return operator
  **/
  @ApiModelProperty(value = "Specifies the operator to make rules on specified users or groups.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public MappingUsersRulesRuleExtended options(MappingUsersRulesRuleOptionsExtended options) {
    this.options = options;
    return this;
  }

   /**
   * Specifies the properties for user mapping rules.
   * @return options
  **/
  @ApiModelProperty(value = "Specifies the properties for user mapping rules.")
  public MappingUsersRulesRuleOptionsExtended getOptions() {
    return options;
  }

  public void setOptions(MappingUsersRulesRuleOptionsExtended options) {
    this.options = options;
  }

  public MappingUsersRulesRuleExtended user1(MappingUsersRulesRuleOptionsDefaultUser user1) {
    this.user1 = user1;
    return this;
  }

   /**
   * 
   * @return user1
  **/
  @ApiModelProperty(required = true, value = "")
  public MappingUsersRulesRuleOptionsDefaultUser getUser1() {
    return user1;
  }

  public void setUser1(MappingUsersRulesRuleOptionsDefaultUser user1) {
    this.user1 = user1;
  }

  public MappingUsersRulesRuleExtended user2(MappingUsersRulesRuleUser2Extended user2) {
    this.user2 = user2;
    return this;
  }

   /**
   * 
   * @return user2
  **/
  @ApiModelProperty(value = "")
  public MappingUsersRulesRuleUser2Extended getUser2() {
    return user2;
  }

  public void setUser2(MappingUsersRulesRuleUser2Extended user2) {
    this.user2 = user2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingUsersRulesRuleExtended mappingUsersRulesRuleExtended = (MappingUsersRulesRuleExtended) o;
    return Objects.equals(this.operator, mappingUsersRulesRuleExtended.operator) &&
        Objects.equals(this.options, mappingUsersRulesRuleExtended.options) &&
        Objects.equals(this.user1, mappingUsersRulesRuleExtended.user1) &&
        Objects.equals(this.user2, mappingUsersRulesRuleExtended.user2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, options, user1, user2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingUsersRulesRuleExtended {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    user1: ").append(toIndentedString(user1)).append("\n");
    sb.append("    user2: ").append(toIndentedString(user2)).append("\n");
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

