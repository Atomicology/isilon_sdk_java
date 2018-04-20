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
 * FilepoolDefaultPolicyDefaultPolicyAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class FilepoolDefaultPolicyDefaultPolicyAction {
  @SerializedName("action_param")
  private String actionParam = null;

  /**
   * Gets or Sets actionType
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    SET_REQUESTED_PROTECTION("set_requested_protection"),
    
    SET_DATA_ACCESS_PATTERN("set_data_access_pattern"),
    
    ENABLE_COALESCER("enable_coalescer"),
    
    APPLY_DATA_STORAGE_POLICY("apply_data_storage_policy"),
    
    APPLY_SNAPSHOT_STORAGE_POLICY("apply_snapshot_storage_policy"),
    
    SET_CLOUDPOOL_POLICY("set_cloudpool_policy"),
    
    ENABLE_PACKING("enable_packing");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action_type")
  private ActionTypeEnum actionType = null;

  public FilepoolDefaultPolicyDefaultPolicyAction actionParam(String actionParam) {
    this.actionParam = actionParam;
    return this;
  }

   /**
   * Varies according to action_type
   * @return actionParam
  **/
  @ApiModelProperty(value = "Varies according to action_type")
  public String getActionParam() {
    return actionParam;
  }

  public void setActionParam(String actionParam) {
    this.actionParam = actionParam;
  }

  public FilepoolDefaultPolicyDefaultPolicyAction actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilepoolDefaultPolicyDefaultPolicyAction filepoolDefaultPolicyDefaultPolicyAction = (FilepoolDefaultPolicyDefaultPolicyAction) o;
    return Objects.equals(this.actionParam, filepoolDefaultPolicyDefaultPolicyAction.actionParam) &&
        Objects.equals(this.actionType, filepoolDefaultPolicyDefaultPolicyAction.actionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionParam, actionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilepoolDefaultPolicyDefaultPolicyAction {\n");
    
    sb.append("    actionParam: ").append(toIndentedString(actionParam)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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

