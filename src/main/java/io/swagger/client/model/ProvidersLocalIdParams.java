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
import java.util.ArrayList;
import java.util.List;

/**
 * Specifies the properties for a local authentication provider.
 */
@ApiModel(description = "Specifies the properties for a local authentication provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ProvidersLocalIdParams {
  @SerializedName("authentication")
  private Boolean authentication = null;

  @SerializedName("create_home_directory")
  private Boolean createHomeDirectory = null;

  @SerializedName("home_directory_template")
  private String homeDirectoryTemplate = null;

  @SerializedName("lockout_duration")
  private Integer lockoutDuration = null;

  @SerializedName("lockout_threshold")
  private Integer lockoutThreshold = null;

  @SerializedName("lockout_window")
  private Integer lockoutWindow = null;

  @SerializedName("login_shell")
  private String loginShell = null;

  @SerializedName("machine_name")
  private String machineName = null;

  @SerializedName("max_password_age")
  private Integer maxPasswordAge = null;

  @SerializedName("min_password_age")
  private Integer minPasswordAge = null;

  @SerializedName("min_password_length")
  private Integer minPasswordLength = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets passwordComplexity
   */
  @JsonAdapter(PasswordComplexityEnum.Adapter.class)
  public enum PasswordComplexityEnum {
    LOWERCASE("lowercase"),
    
    UPPERCASE("uppercase"),
    
    NUMERIC("numeric"),
    
    SYMBOL("symbol");

    private String value;

    PasswordComplexityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PasswordComplexityEnum fromValue(String text) {
      for (PasswordComplexityEnum b : PasswordComplexityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PasswordComplexityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PasswordComplexityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PasswordComplexityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PasswordComplexityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("password_complexity")
  private List<PasswordComplexityEnum> passwordComplexity = null;

  @SerializedName("password_history_length")
  private Integer passwordHistoryLength = null;

  @SerializedName("password_prompt_time")
  private Integer passwordPromptTime = null;

  public ProvidersLocalIdParams authentication(Boolean authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * If true, enables authentication and identity management through the authentication provider.
   * @return authentication
  **/
  @ApiModelProperty(value = "If true, enables authentication and identity management through the authentication provider.")
  public Boolean isAuthentication() {
    return authentication;
  }

  public void setAuthentication(Boolean authentication) {
    this.authentication = authentication;
  }

  public ProvidersLocalIdParams createHomeDirectory(Boolean createHomeDirectory) {
    this.createHomeDirectory = createHomeDirectory;
    return this;
  }

   /**
   * Automatically creates the home directory on the first login.
   * @return createHomeDirectory
  **/
  @ApiModelProperty(value = "Automatically creates the home directory on the first login.")
  public Boolean isCreateHomeDirectory() {
    return createHomeDirectory;
  }

  public void setCreateHomeDirectory(Boolean createHomeDirectory) {
    this.createHomeDirectory = createHomeDirectory;
  }

  public ProvidersLocalIdParams homeDirectoryTemplate(String homeDirectoryTemplate) {
    this.homeDirectoryTemplate = homeDirectoryTemplate;
    return this;
  }

   /**
   * Specifies the path to the home directory template.
   * @return homeDirectoryTemplate
  **/
  @ApiModelProperty(value = "Specifies the path to the home directory template.")
  public String getHomeDirectoryTemplate() {
    return homeDirectoryTemplate;
  }

  public void setHomeDirectoryTemplate(String homeDirectoryTemplate) {
    this.homeDirectoryTemplate = homeDirectoryTemplate;
  }

  public ProvidersLocalIdParams lockoutDuration(Integer lockoutDuration) {
    this.lockoutDuration = lockoutDuration;
    return this;
  }

   /**
   * Specifies the length of time in seconds that an account will be inaccessible after multiple failed login attempts.
   * minimum: 0
   * maximum: 2592000
   * @return lockoutDuration
  **/
  @ApiModelProperty(value = "Specifies the length of time in seconds that an account will be inaccessible after multiple failed login attempts.")
  public Integer getLockoutDuration() {
    return lockoutDuration;
  }

  public void setLockoutDuration(Integer lockoutDuration) {
    this.lockoutDuration = lockoutDuration;
  }

  public ProvidersLocalIdParams lockoutThreshold(Integer lockoutThreshold) {
    this.lockoutThreshold = lockoutThreshold;
    return this;
  }

   /**
   * Specifies the number of failed login attempts necessary before an account is locked.
   * minimum: 0
   * maximum: 50
   * @return lockoutThreshold
  **/
  @ApiModelProperty(value = "Specifies the number of failed login attempts necessary before an account is locked.")
  public Integer getLockoutThreshold() {
    return lockoutThreshold;
  }

  public void setLockoutThreshold(Integer lockoutThreshold) {
    this.lockoutThreshold = lockoutThreshold;
  }

  public ProvidersLocalIdParams lockoutWindow(Integer lockoutWindow) {
    this.lockoutWindow = lockoutWindow;
    return this;
  }

   /**
   * Specifies the duration of time in seconds in which the number of failed attempts set in the &#39;lockout_threshold&#39; parameter must be made before an account is locked.
   * minimum: 0
   * maximum: 2592000
   * @return lockoutWindow
  **/
  @ApiModelProperty(value = "Specifies the duration of time in seconds in which the number of failed attempts set in the 'lockout_threshold' parameter must be made before an account is locked.")
  public Integer getLockoutWindow() {
    return lockoutWindow;
  }

  public void setLockoutWindow(Integer lockoutWindow) {
    this.lockoutWindow = lockoutWindow;
  }

  public ProvidersLocalIdParams loginShell(String loginShell) {
    this.loginShell = loginShell;
    return this;
  }

   /**
   * Specifies the login shell path.
   * @return loginShell
  **/
  @ApiModelProperty(value = "Specifies the login shell path.")
  public String getLoginShell() {
    return loginShell;
  }

  public void setLoginShell(String loginShell) {
    this.loginShell = loginShell;
  }

  public ProvidersLocalIdParams machineName(String machineName) {
    this.machineName = machineName;
    return this;
  }

   /**
   * Specifies the domain for this provider through which users and groups are qualified.
   * @return machineName
  **/
  @ApiModelProperty(value = "Specifies the domain for this provider through which users and groups are qualified.")
  public String getMachineName() {
    return machineName;
  }

  public void setMachineName(String machineName) {
    this.machineName = machineName;
  }

  public ProvidersLocalIdParams maxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
    return this;
  }

   /**
   * Specifies the maximum password age in seconds.
   * minimum: 0
   * maximum: 4294967295
   * @return maxPasswordAge
  **/
  @ApiModelProperty(value = "Specifies the maximum password age in seconds.")
  public Integer getMaxPasswordAge() {
    return maxPasswordAge;
  }

  public void setMaxPasswordAge(Integer maxPasswordAge) {
    this.maxPasswordAge = maxPasswordAge;
  }

  public ProvidersLocalIdParams minPasswordAge(Integer minPasswordAge) {
    this.minPasswordAge = minPasswordAge;
    return this;
  }

   /**
   * Specifies the minimum password age in seconds.
   * minimum: 0
   * maximum: 4294967295
   * @return minPasswordAge
  **/
  @ApiModelProperty(value = "Specifies the minimum password age in seconds.")
  public Integer getMinPasswordAge() {
    return minPasswordAge;
  }

  public void setMinPasswordAge(Integer minPasswordAge) {
    this.minPasswordAge = minPasswordAge;
  }

  public ProvidersLocalIdParams minPasswordLength(Integer minPasswordLength) {
    this.minPasswordLength = minPasswordLength;
    return this;
  }

   /**
   * Specifies the minimum password length.
   * minimum: 0
   * maximum: 4294967295
   * @return minPasswordLength
  **/
  @ApiModelProperty(value = "Specifies the minimum password length.")
  public Integer getMinPasswordLength() {
    return minPasswordLength;
  }

  public void setMinPasswordLength(Integer minPasswordLength) {
    this.minPasswordLength = minPasswordLength;
  }

  public ProvidersLocalIdParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the local provider name.
   * @return name
  **/
  @ApiModelProperty(value = "Specifies the local provider name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProvidersLocalIdParams passwordComplexity(List<PasswordComplexityEnum> passwordComplexity) {
    this.passwordComplexity = passwordComplexity;
    return this;
  }

  public ProvidersLocalIdParams addPasswordComplexityItem(PasswordComplexityEnum passwordComplexityItem) {
    if (this.passwordComplexity == null) {
      this.passwordComplexity = new ArrayList<PasswordComplexityEnum>();
    }
    this.passwordComplexity.add(passwordComplexityItem);
    return this;
  }

   /**
   * Specifies the conditions required for a password.
   * @return passwordComplexity
  **/
  @ApiModelProperty(value = "Specifies the conditions required for a password.")
  public List<PasswordComplexityEnum> getPasswordComplexity() {
    return passwordComplexity;
  }

  public void setPasswordComplexity(List<PasswordComplexityEnum> passwordComplexity) {
    this.passwordComplexity = passwordComplexity;
  }

  public ProvidersLocalIdParams passwordHistoryLength(Integer passwordHistoryLength) {
    this.passwordHistoryLength = passwordHistoryLength;
    return this;
  }

   /**
   * Specifies the number of previous passwords to store.
   * minimum: 0
   * maximum: 4294967295
   * @return passwordHistoryLength
  **/
  @ApiModelProperty(value = "Specifies the number of previous passwords to store.")
  public Integer getPasswordHistoryLength() {
    return passwordHistoryLength;
  }

  public void setPasswordHistoryLength(Integer passwordHistoryLength) {
    this.passwordHistoryLength = passwordHistoryLength;
  }

  public ProvidersLocalIdParams passwordPromptTime(Integer passwordPromptTime) {
    this.passwordPromptTime = passwordPromptTime;
    return this;
  }

   /**
   * Specifies the time in seconds remaining before a user will be prompted for a password change.
   * minimum: 0
   * maximum: 4294967295
   * @return passwordPromptTime
  **/
  @ApiModelProperty(value = "Specifies the time in seconds remaining before a user will be prompted for a password change.")
  public Integer getPasswordPromptTime() {
    return passwordPromptTime;
  }

  public void setPasswordPromptTime(Integer passwordPromptTime) {
    this.passwordPromptTime = passwordPromptTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersLocalIdParams providersLocalIdParams = (ProvidersLocalIdParams) o;
    return Objects.equals(this.authentication, providersLocalIdParams.authentication) &&
        Objects.equals(this.createHomeDirectory, providersLocalIdParams.createHomeDirectory) &&
        Objects.equals(this.homeDirectoryTemplate, providersLocalIdParams.homeDirectoryTemplate) &&
        Objects.equals(this.lockoutDuration, providersLocalIdParams.lockoutDuration) &&
        Objects.equals(this.lockoutThreshold, providersLocalIdParams.lockoutThreshold) &&
        Objects.equals(this.lockoutWindow, providersLocalIdParams.lockoutWindow) &&
        Objects.equals(this.loginShell, providersLocalIdParams.loginShell) &&
        Objects.equals(this.machineName, providersLocalIdParams.machineName) &&
        Objects.equals(this.maxPasswordAge, providersLocalIdParams.maxPasswordAge) &&
        Objects.equals(this.minPasswordAge, providersLocalIdParams.minPasswordAge) &&
        Objects.equals(this.minPasswordLength, providersLocalIdParams.minPasswordLength) &&
        Objects.equals(this.name, providersLocalIdParams.name) &&
        Objects.equals(this.passwordComplexity, providersLocalIdParams.passwordComplexity) &&
        Objects.equals(this.passwordHistoryLength, providersLocalIdParams.passwordHistoryLength) &&
        Objects.equals(this.passwordPromptTime, providersLocalIdParams.passwordPromptTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, createHomeDirectory, homeDirectoryTemplate, lockoutDuration, lockoutThreshold, lockoutWindow, loginShell, machineName, maxPasswordAge, minPasswordAge, minPasswordLength, name, passwordComplexity, passwordHistoryLength, passwordPromptTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersLocalIdParams {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    createHomeDirectory: ").append(toIndentedString(createHomeDirectory)).append("\n");
    sb.append("    homeDirectoryTemplate: ").append(toIndentedString(homeDirectoryTemplate)).append("\n");
    sb.append("    lockoutDuration: ").append(toIndentedString(lockoutDuration)).append("\n");
    sb.append("    lockoutThreshold: ").append(toIndentedString(lockoutThreshold)).append("\n");
    sb.append("    lockoutWindow: ").append(toIndentedString(lockoutWindow)).append("\n");
    sb.append("    loginShell: ").append(toIndentedString(loginShell)).append("\n");
    sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
    sb.append("    maxPasswordAge: ").append(toIndentedString(maxPasswordAge)).append("\n");
    sb.append("    minPasswordAge: ").append(toIndentedString(minPasswordAge)).append("\n");
    sb.append("    minPasswordLength: ").append(toIndentedString(minPasswordLength)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passwordComplexity: ").append(toIndentedString(passwordComplexity)).append("\n");
    sb.append("    passwordHistoryLength: ").append(toIndentedString(passwordHistoryLength)).append("\n");
    sb.append("    passwordPromptTime: ").append(toIndentedString(passwordPromptTime)).append("\n");
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

