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
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import java.io.IOException;

/**
 * SmbSharePermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class SmbSharePermission {
  /**
   * Specifies the file system rights that are allowed or denied.
   */
  @JsonAdapter(PermissionEnum.Adapter.class)
  public enum PermissionEnum {
    FULL("full"),
    
    CHANGE("change"),
    
    READ("read");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permission")
  private PermissionEnum permission = null;

  /**
   * Determines whether the permission is allowed or denied.
   */
  @JsonAdapter(PermissionTypeEnum.Adapter.class)
  public enum PermissionTypeEnum {
    ALLOW("allow"),
    
    DENY("deny");

    private String value;

    PermissionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionTypeEnum fromValue(String text) {
      for (PermissionTypeEnum b : PermissionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permission_type")
  private PermissionTypeEnum permissionType = null;

  @SerializedName("trustee")
  private AuthAccessAccessItemFileGroup trustee = null;

  public SmbSharePermission permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Specifies the file system rights that are allowed or denied.
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "Specifies the file system rights that are allowed or denied.")
  public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public SmbSharePermission permissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
    return this;
  }

   /**
   * Determines whether the permission is allowed or denied.
   * @return permissionType
  **/
  @ApiModelProperty(required = true, value = "Determines whether the permission is allowed or denied.")
  public PermissionTypeEnum getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
  }

  public SmbSharePermission trustee(AuthAccessAccessItemFileGroup trustee) {
    this.trustee = trustee;
    return this;
  }

   /**
   * Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;.
   * @return trustee
  **/
  @ApiModelProperty(required = true, value = "Specifies properties for a persona, which consists of either a 'type' and a 'name' or an 'ID'.")
  public AuthAccessAccessItemFileGroup getTrustee() {
    return trustee;
  }

  public void setTrustee(AuthAccessAccessItemFileGroup trustee) {
    this.trustee = trustee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmbSharePermission smbSharePermission = (SmbSharePermission) o;
    return Objects.equals(this.permission, smbSharePermission.permission) &&
        Objects.equals(this.permissionType, smbSharePermission.permissionType) &&
        Objects.equals(this.trustee, smbSharePermission.trustee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, permissionType, trustee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmbSharePermission {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
    sb.append("    trustee: ").append(toIndentedString(trustee)).append("\n");
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

