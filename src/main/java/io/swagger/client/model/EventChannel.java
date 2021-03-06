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
import io.swagger.client.model.EventChannelParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Named channel through which alerts can be delivered.
 */
@ApiModel(description = "Named channel through which alerts can be delivered.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class EventChannel {
  @SerializedName("allowed_nodes")
  private List<Integer> allowedNodes = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("excluded_nodes")
  private List<Integer> excludedNodes = null;

  @SerializedName("parameters")
  private EventChannelParameters parameters = null;

  @SerializedName("system")
  private Boolean system = null;

  /**
   * The mechanism used by the channel
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CONNECTEMC("connectemc"),
    
    SMTP("smtp"),
    
    SNMP("snmp"),
    
    HEARTBEAT("heartbeat");

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

  public EventChannel allowedNodes(List<Integer> allowedNodes) {
    this.allowedNodes = allowedNodes;
    return this;
  }

  public EventChannel addAllowedNodesItem(Integer allowedNodesItem) {
    if (this.allowedNodes == null) {
      this.allowedNodes = new ArrayList<Integer>();
    }
    this.allowedNodes.add(allowedNodesItem);
    return this;
  }

   /**
   * Nodes (LNNs) that can be masters for this channel
   * @return allowedNodes
  **/
  @ApiModelProperty(value = "Nodes (LNNs) that can be masters for this channel")
  public List<Integer> getAllowedNodes() {
    return allowedNodes;
  }

  public void setAllowedNodes(List<Integer> allowedNodes) {
    this.allowedNodes = allowedNodes;
  }

  public EventChannel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Channel is to be used or not
   * @return enabled
  **/
  @ApiModelProperty(value = "Channel is to be used or not")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public EventChannel excludedNodes(List<Integer> excludedNodes) {
    this.excludedNodes = excludedNodes;
    return this;
  }

  public EventChannel addExcludedNodesItem(Integer excludedNodesItem) {
    if (this.excludedNodes == null) {
      this.excludedNodes = new ArrayList<Integer>();
    }
    this.excludedNodes.add(excludedNodesItem);
    return this;
  }

   /**
   * Nodes (LNNs) that can NOT be the masters for this channel
   * @return excludedNodes
  **/
  @ApiModelProperty(value = "Nodes (LNNs) that can NOT be the masters for this channel")
  public List<Integer> getExcludedNodes() {
    return excludedNodes;
  }

  public void setExcludedNodes(List<Integer> excludedNodes) {
    this.excludedNodes = excludedNodes;
  }

  public EventChannel parameters(EventChannelParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Parameters to be used for an smtp channel
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters to be used for an smtp channel")
  public EventChannelParameters getParameters() {
    return parameters;
  }

  public void setParameters(EventChannelParameters parameters) {
    this.parameters = parameters;
  }

  public EventChannel system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Channel is a pre-defined system channel
   * @return system
  **/
  @ApiModelProperty(value = "Channel is a pre-defined system channel")
  public Boolean isSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }

  public EventChannel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The mechanism used by the channel
   * @return type
  **/
  @ApiModelProperty(value = "The mechanism used by the channel")
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
    EventChannel eventChannel = (EventChannel) o;
    return Objects.equals(this.allowedNodes, eventChannel.allowedNodes) &&
        Objects.equals(this.enabled, eventChannel.enabled) &&
        Objects.equals(this.excludedNodes, eventChannel.excludedNodes) &&
        Objects.equals(this.parameters, eventChannel.parameters) &&
        Objects.equals(this.system, eventChannel.system) &&
        Objects.equals(this.type, eventChannel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedNodes, enabled, excludedNodes, parameters, system, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventChannel {\n");
    
    sb.append("    allowedNodes: ").append(toIndentedString(allowedNodes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    excludedNodes: ").append(toIndentedString(excludedNodes)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

