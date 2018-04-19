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
 * PoolsPoolRuleCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class PoolsPoolRuleCreateParams {
  @SerializedName("description")
  private String description = null;

  @SerializedName("iface")
  private String iface = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Node type the provisioning rule applies to.
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    ANY("any"),
    
    STORAGE("storage"),
    
    ACCELERATOR("accelerator"),
    
    STORAGE_I("storage-i"),
    
    ACCELERATOR_I("accelerator-i"),
    
    BACKUP_ACCELERATOR("backup-accelerator");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTypeEnum fromValue(String text) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NodeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("node_type")
  private NodeTypeEnum nodeType = null;

  public PoolsPoolRuleCreateParams description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the provisioning rule.
   * @return description
  **/
  @ApiModelProperty(value = "Description for the provisioning rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PoolsPoolRuleCreateParams iface(String iface) {
    this.iface = iface;
    return this;
  }

   /**
   * Interface name the provisioning rule applies to.
   * @return iface
  **/
  @ApiModelProperty(required = true, value = "Interface name the provisioning rule applies to.")
  public String getIface() {
    return iface;
  }

  public void setIface(String iface) {
    this.iface = iface;
  }

  public PoolsPoolRuleCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the provisioning rule.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the provisioning rule.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PoolsPoolRuleCreateParams nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Node type the provisioning rule applies to.
   * @return nodeType
  **/
  @ApiModelProperty(value = "Node type the provisioning rule applies to.")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsPoolRuleCreateParams poolsPoolRuleCreateParams = (PoolsPoolRuleCreateParams) o;
    return Objects.equals(this.description, poolsPoolRuleCreateParams.description) &&
        Objects.equals(this.iface, poolsPoolRuleCreateParams.iface) &&
        Objects.equals(this.name, poolsPoolRuleCreateParams.name) &&
        Objects.equals(this.nodeType, poolsPoolRuleCreateParams.nodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, iface, name, nodeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsPoolRuleCreateParams {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iface: ").append(toIndentedString(iface)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

