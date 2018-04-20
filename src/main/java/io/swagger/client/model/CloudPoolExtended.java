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
import io.swagger.client.model.CloudPool;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CloudPoolExtended
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class CloudPoolExtended {
  @SerializedName("accounts")
  private List<String> accounts = null;

  @SerializedName("birth_cluster_id")
  private String birthClusterId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("vendor")
  private String vendor = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Indicates whether this pool is in a good state (\&quot;OK\&quot;) or disabled (\&quot;disabled\&quot;)
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    OK("OK"),
    
    DISABLED("disabled");

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

  @SerializedName("state_details")
  private String stateDetails = null;

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

  public CloudPoolExtended accounts(List<String> accounts) {
    this.accounts = accounts;
    return this;
  }

  public CloudPoolExtended addAccountsItem(String accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<String>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * A list of valid names for the accounts in this pool.  There is currently only one account allowed per pool.
   * @return accounts
  **/
  @ApiModelProperty(value = "A list of valid names for the accounts in this pool.  There is currently only one account allowed per pool.")
  public List<String> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<String> accounts) {
    this.accounts = accounts;
  }

  public CloudPoolExtended birthClusterId(String birthClusterId) {
    this.birthClusterId = birthClusterId;
    return this;
  }

   /**
   * The guid of the cluster where this pool was created
   * @return birthClusterId
  **/
  @ApiModelProperty(value = "The guid of the cluster where this pool was created")
  public String getBirthClusterId() {
    return birthClusterId;
  }

  public void setBirthClusterId(String birthClusterId) {
    this.birthClusterId = birthClusterId;
  }

  public CloudPoolExtended description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of this pool
   * @return description
  **/
  @ApiModelProperty(value = "A brief description of this pool")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudPoolExtended name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique name for this pool
   * @return name
  **/
  @ApiModelProperty(value = "A unique name for this pool")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudPoolExtended vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * A string identifier of the cloud services vendor
   * @return vendor
  **/
  @ApiModelProperty(value = "A string identifier of the cloud services vendor")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public CloudPoolExtended id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique name for this pool
   * @return id
  **/
  @ApiModelProperty(value = "A unique name for this pool")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudPoolExtended state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Indicates whether this pool is in a good state (\&quot;OK\&quot;) or disabled (\&quot;disabled\&quot;)
   * @return state
  **/
  @ApiModelProperty(value = "Indicates whether this pool is in a good state (\"OK\") or disabled (\"disabled\")")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CloudPoolExtended stateDetails(String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
  }

   /**
   * Gives further information to describe the state of this pool
   * @return stateDetails
  **/
  @ApiModelProperty(value = "Gives further information to describe the state of this pool")
  public String getStateDetails() {
    return stateDetails;
  }

  public void setStateDetails(String stateDetails) {
    this.stateDetails = stateDetails;
  }

  public CloudPoolExtended type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3
   * @return type
  **/
  @ApiModelProperty(value = "The type of cloud protocol required.  E.g., \"isilon\" for EMC Isilon, \"ecs\" for EMC ECS Appliance, \"virtustream\" for Virtustream Storage Cloud, \"azure\" for Microsoft Azure and \"s3\" for Amazon S3")
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
    CloudPoolExtended cloudPoolExtended = (CloudPoolExtended) o;
    return Objects.equals(this.accounts, cloudPoolExtended.accounts) &&
        Objects.equals(this.birthClusterId, cloudPoolExtended.birthClusterId) &&
        Objects.equals(this.description, cloudPoolExtended.description) &&
        Objects.equals(this.name, cloudPoolExtended.name) &&
        Objects.equals(this.vendor, cloudPoolExtended.vendor) &&
        Objects.equals(this.id, cloudPoolExtended.id) &&
        Objects.equals(this.state, cloudPoolExtended.state) &&
        Objects.equals(this.stateDetails, cloudPoolExtended.stateDetails) &&
        Objects.equals(this.type, cloudPoolExtended.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, birthClusterId, description, name, vendor, id, state, stateDetails, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudPoolExtended {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    birthClusterId: ").append(toIndentedString(birthClusterId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDetails: ").append(toIndentedString(stateDetails)).append("\n");
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

