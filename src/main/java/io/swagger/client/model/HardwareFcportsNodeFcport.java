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
 * HardwareFcportsNodeFcport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class HardwareFcportsNodeFcport {
  @SerializedName("id")
  private String id = null;

  @SerializedName("port")
  private String port = null;

  /**
   * Gets or Sets rate
   */
  @JsonAdapter(RateEnum.Adapter.class)
  public enum RateEnum {
    AUTO("auto"),
    
    _1("1"),
    
    _2("2"),
    
    _4("4"),
    
    _8("8");

    private String value;

    RateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RateEnum fromValue(String text) {
      for (RateEnum b : RateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rate")
  private RateEnum rate = null;

  /**
   * State of the port
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLE("enable"),
    
    DISABLE("disable");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  /**
   * Gets or Sets topology
   */
  @JsonAdapter(TopologyEnum.Adapter.class)
  public enum TopologyEnum {
    AUTO("auto"),
    
    PTP("ptp"),
    
    LOOP("loop");

    private String value;

    TopologyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TopologyEnum fromValue(String text) {
      for (TopologyEnum b : TopologyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TopologyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TopologyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TopologyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TopologyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("topology")
  private TopologyEnum topology = null;

  @SerializedName("wwnn")
  private String wwnn = null;

  @SerializedName("wwpn")
  private String wwpn = null;

  public HardwareFcportsNodeFcport id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique display id
   * @return id
  **/
  @ApiModelProperty(value = "The unique display id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HardwareFcportsNodeFcport port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Port ID
   * @return port
  **/
  @ApiModelProperty(value = "Port ID")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public HardwareFcportsNodeFcport rate(RateEnum rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public RateEnum getRate() {
    return rate;
  }

  public void setRate(RateEnum rate) {
    this.rate = rate;
  }

  public HardwareFcportsNodeFcport state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of the port
   * @return state
  **/
  @ApiModelProperty(value = "State of the port")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public HardwareFcportsNodeFcport topology(TopologyEnum topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(value = "")
  public TopologyEnum getTopology() {
    return topology;
  }

  public void setTopology(TopologyEnum topology) {
    this.topology = topology;
  }

  public HardwareFcportsNodeFcport wwnn(String wwnn) {
    this.wwnn = wwnn;
    return this;
  }

   /**
   * World wide node name of the port
   * @return wwnn
  **/
  @ApiModelProperty(value = "World wide node name of the port")
  public String getWwnn() {
    return wwnn;
  }

  public void setWwnn(String wwnn) {
    this.wwnn = wwnn;
  }

  public HardwareFcportsNodeFcport wwpn(String wwpn) {
    this.wwpn = wwpn;
    return this;
  }

   /**
   * World wide port name of the port
   * @return wwpn
  **/
  @ApiModelProperty(value = "World wide port name of the port")
  public String getWwpn() {
    return wwpn;
  }

  public void setWwpn(String wwpn) {
    this.wwpn = wwpn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HardwareFcportsNodeFcport hardwareFcportsNodeFcport = (HardwareFcportsNodeFcport) o;
    return Objects.equals(this.id, hardwareFcportsNodeFcport.id) &&
        Objects.equals(this.port, hardwareFcportsNodeFcport.port) &&
        Objects.equals(this.rate, hardwareFcportsNodeFcport.rate) &&
        Objects.equals(this.state, hardwareFcportsNodeFcport.state) &&
        Objects.equals(this.topology, hardwareFcportsNodeFcport.topology) &&
        Objects.equals(this.wwnn, hardwareFcportsNodeFcport.wwnn) &&
        Objects.equals(this.wwpn, hardwareFcportsNodeFcport.wwpn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, port, rate, state, topology, wwnn, wwpn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HardwareFcportsNodeFcport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    wwnn: ").append(toIndentedString(wwnn)).append("\n");
    sb.append("    wwpn: ").append(toIndentedString(wwpn)).append("\n");
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

