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
 * A cloud account object
 */
@ApiModel(description = "A cloud account object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class CloudAccountCreateParams {
  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("account_username")
  private String accountUsername = null;

  @SerializedName("birth_cluster_id")
  private String birthClusterId = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("proxy")
  private String proxy = null;

  @SerializedName("skip_ssl_validation")
  private Boolean skipSslValidation = null;

  @SerializedName("storage_region")
  private String storageRegion = null;

  @SerializedName("telemetry_bucket")
  private String telemetryBucket = null;

  /**
   * The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ISILON("isilon"),
    
    ECS("ecs"),
    
    VIRTUSTREAM("virtustream"),
    
    AZURE("azure"),
    
    S3("s3"),
    
    RAN("ran"),
    
    ECS2("ecs2");

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

  @SerializedName("uri")
  private String uri = null;

  public CloudAccountCreateParams accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * (S3 only) The user id of the S3 account
   * @return accountId
  **/
  @ApiModelProperty(value = "(S3 only) The user id of the S3 account")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CloudAccountCreateParams accountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
    return this;
  }

   /**
   * The username required to authenticate against the cloud service
   * @return accountUsername
  **/
  @ApiModelProperty(required = true, value = "The username required to authenticate against the cloud service")
  public String getAccountUsername() {
    return accountUsername;
  }

  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }

  public CloudAccountCreateParams birthClusterId(String birthClusterId) {
    this.birthClusterId = birthClusterId;
    return this;
  }

   /**
   * The guid of the cluster where this account was created
   * @return birthClusterId
  **/
  @ApiModelProperty(value = "The guid of the cluster where this account was created")
  public String getBirthClusterId() {
    return birthClusterId;
  }

  public void setBirthClusterId(String birthClusterId) {
    this.birthClusterId = birthClusterId;
  }

  public CloudAccountCreateParams enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether this account is explicitly enabled or disabled by a user
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether this account is explicitly enabled or disabled by a user")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CloudAccountCreateParams key(String key) {
    this.key = key;
    return this;
  }

   /**
   * A valid authentication key for connecting to the cloud
   * @return key
  **/
  @ApiModelProperty(required = true, value = "A valid authentication key for connecting to the cloud")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CloudAccountCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique name for this account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A unique name for this account")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudAccountCreateParams proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }

   /**
   * The id or name of a proxy to be used by this account
   * @return proxy
  **/
  @ApiModelProperty(value = "The id or name of a proxy to be used by this account")
  public String getProxy() {
    return proxy;
  }

  public void setProxy(String proxy) {
    this.proxy = proxy;
  }

  public CloudAccountCreateParams skipSslValidation(Boolean skipSslValidation) {
    this.skipSslValidation = skipSslValidation;
    return this;
  }

   /**
   * Indicates whether to skip SSL certificate validation when connecting to the cloud
   * @return skipSslValidation
  **/
  @ApiModelProperty(value = "Indicates whether to skip SSL certificate validation when connecting to the cloud")
  public Boolean isSkipSslValidation() {
    return skipSslValidation;
  }

  public void setSkipSslValidation(Boolean skipSslValidation) {
    this.skipSslValidation = skipSslValidation;
  }

  public CloudAccountCreateParams storageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
    return this;
  }

   /**
   * (S3 only) An appropriate region for the S3 account.  For example, faster access times may be gained by referencing a nearby region
   * @return storageRegion
  **/
  @ApiModelProperty(value = "(S3 only) An appropriate region for the S3 account.  For example, faster access times may be gained by referencing a nearby region")
  public String getStorageRegion() {
    return storageRegion;
  }

  public void setStorageRegion(String storageRegion) {
    this.storageRegion = storageRegion;
  }

  public CloudAccountCreateParams telemetryBucket(String telemetryBucket) {
    this.telemetryBucket = telemetryBucket;
    return this;
  }

   /**
   * (S3 only) The name of the bucket into which generated metrics reports are placed by the cloud service provider
   * @return telemetryBucket
  **/
  @ApiModelProperty(value = "(S3 only) The name of the bucket into which generated metrics reports are placed by the cloud service provider")
  public String getTelemetryBucket() {
    return telemetryBucket;
  }

  public void setTelemetryBucket(String telemetryBucket) {
    this.telemetryBucket = telemetryBucket;
  }

  public CloudAccountCreateParams type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of cloud protocol required.  E.g., \"isilon\" for EMC Isilon, \"ecs\" for EMC ECS Appliance, \"virtustream\" for Virtustream Storage Cloud, \"azure\" for Microsoft Azure and \"s3\" for Amazon S3")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CloudAccountCreateParams uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * A valid URI pointing to the location of the cloud storage
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "A valid URI pointing to the location of the cloud storage")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountCreateParams cloudAccountCreateParams = (CloudAccountCreateParams) o;
    return Objects.equals(this.accountId, cloudAccountCreateParams.accountId) &&
        Objects.equals(this.accountUsername, cloudAccountCreateParams.accountUsername) &&
        Objects.equals(this.birthClusterId, cloudAccountCreateParams.birthClusterId) &&
        Objects.equals(this.enabled, cloudAccountCreateParams.enabled) &&
        Objects.equals(this.key, cloudAccountCreateParams.key) &&
        Objects.equals(this.name, cloudAccountCreateParams.name) &&
        Objects.equals(this.proxy, cloudAccountCreateParams.proxy) &&
        Objects.equals(this.skipSslValidation, cloudAccountCreateParams.skipSslValidation) &&
        Objects.equals(this.storageRegion, cloudAccountCreateParams.storageRegion) &&
        Objects.equals(this.telemetryBucket, cloudAccountCreateParams.telemetryBucket) &&
        Objects.equals(this.type, cloudAccountCreateParams.type) &&
        Objects.equals(this.uri, cloudAccountCreateParams.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountUsername, birthClusterId, enabled, key, name, proxy, skipSslValidation, storageRegion, telemetryBucket, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountCreateParams {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    birthClusterId: ").append(toIndentedString(birthClusterId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    skipSslValidation: ").append(toIndentedString(skipSslValidation)).append("\n");
    sb.append("    storageRegion: ").append(toIndentedString(storageRegion)).append("\n");
    sb.append("    telemetryBucket: ").append(toIndentedString(telemetryBucket)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

