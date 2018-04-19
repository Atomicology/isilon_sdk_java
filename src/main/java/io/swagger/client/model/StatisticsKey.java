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
import io.swagger.client.model.StatisticsKeyPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatisticsKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class StatisticsKey {
  /**
   * Type of aggregation used in down-sampling.
   */
  @JsonAdapter(AggregationTypeEnum.Adapter.class)
  public enum AggregationTypeEnum {
    LAST("last"),
    
    MIN("min"),
    
    MAX("max"),
    
    AVG("avg"),
    
    SUM("sum"),
    
    CUSTOM("custom");

    private String value;

    AggregationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AggregationTypeEnum fromValue(String text) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AggregationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AggregationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AggregationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("aggregation_type")
  private AggregationTypeEnum aggregationType = null;

  @SerializedName("base_name")
  private String baseName = null;

  @SerializedName("default_cache_time")
  private Integer defaultCacheTime = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("policies")
  private List<StatisticsKeyPolicy> policies = null;

  @SerializedName("policy_cache_time")
  private Integer policyCacheTime = null;

  @SerializedName("real_name")
  private String realName = null;

  /**
   * Scope of key.
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    CLUSTER("cluster"),
    
    NODE("node");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("units")
  private String units = null;

  public StatisticsKey aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Type of aggregation used in down-sampling.
   * @return aggregationType
  **/
  @ApiModelProperty(required = true, value = "Type of aggregation used in down-sampling.")
  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }

  public StatisticsKey baseName(String baseName) {
    this.baseName = baseName;
    return this;
  }

   /**
   * Name of key this keys is derived from, if any.
   * @return baseName
  **/
  @ApiModelProperty(value = "Name of key this keys is derived from, if any.")
  public String getBaseName() {
    return baseName;
  }

  public void setBaseName(String baseName) {
    this.baseName = baseName;
  }

  public StatisticsKey defaultCacheTime(Integer defaultCacheTime) {
    this.defaultCacheTime = defaultCacheTime;
    return this;
  }

   /**
   * Default time in seconds system will used cached values.
   * @return defaultCacheTime
  **/
  @ApiModelProperty(required = true, value = "Default time in seconds system will used cached values.")
  public Integer getDefaultCacheTime() {
    return defaultCacheTime;
  }

  public void setDefaultCacheTime(Integer defaultCacheTime) {
    this.defaultCacheTime = defaultCacheTime;
  }

  public StatisticsKey description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of statistics key.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of statistics key.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatisticsKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key name.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key name.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StatisticsKey policies(List<StatisticsKeyPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public StatisticsKey addPoliciesItem(StatisticsKeyPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<StatisticsKeyPolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * List of effective history policies for key.
   * @return policies
  **/
  @ApiModelProperty(value = "List of effective history policies for key.")
  public List<StatisticsKeyPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<StatisticsKeyPolicy> policies) {
    this.policies = policies;
  }

  public StatisticsKey policyCacheTime(Integer policyCacheTime) {
    this.policyCacheTime = policyCacheTime;
    return this;
  }

   /**
   * Configured time in seconds system will used cached values.
   * @return policyCacheTime
  **/
  @ApiModelProperty(value = "Configured time in seconds system will used cached values.")
  public Integer getPolicyCacheTime() {
    return policyCacheTime;
  }

  public void setPolicyCacheTime(Integer policyCacheTime) {
    this.policyCacheTime = policyCacheTime;
  }

  public StatisticsKey realName(String realName) {
    this.realName = realName;
    return this;
  }

   /**
   * Name of real key if this is an alias.
   * @return realName
  **/
  @ApiModelProperty(value = "Name of real key if this is an alias.")
  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }

  public StatisticsKey scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Scope of key.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Scope of key.")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public StatisticsKey type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Data type of key values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Data type of key values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StatisticsKey units(String units) {
    this.units = units;
    return this;
  }

   /**
   * Units of key values.
   * @return units
  **/
  @ApiModelProperty(required = true, value = "Units of key values.")
  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsKey statisticsKey = (StatisticsKey) o;
    return Objects.equals(this.aggregationType, statisticsKey.aggregationType) &&
        Objects.equals(this.baseName, statisticsKey.baseName) &&
        Objects.equals(this.defaultCacheTime, statisticsKey.defaultCacheTime) &&
        Objects.equals(this.description, statisticsKey.description) &&
        Objects.equals(this.key, statisticsKey.key) &&
        Objects.equals(this.policies, statisticsKey.policies) &&
        Objects.equals(this.policyCacheTime, statisticsKey.policyCacheTime) &&
        Objects.equals(this.realName, statisticsKey.realName) &&
        Objects.equals(this.scope, statisticsKey.scope) &&
        Objects.equals(this.type, statisticsKey.type) &&
        Objects.equals(this.units, statisticsKey.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationType, baseName, defaultCacheTime, description, key, policies, policyCacheTime, realName, scope, type, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsKey {\n");
    
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    baseName: ").append(toIndentedString(baseName)).append("\n");
    sb.append("    defaultCacheTime: ").append(toIndentedString(defaultCacheTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    policyCacheTime: ").append(toIndentedString(policyCacheTime)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

