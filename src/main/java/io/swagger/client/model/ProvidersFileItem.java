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
 * Specifies the properties for an authentication file provider
 */
@ApiModel(description = "Specifies the properties for an authentication file provider")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ProvidersFileItem {
  @SerializedName("authentication")
  private Boolean authentication = null;

  @SerializedName("create_home_directory")
  private Boolean createHomeDirectory = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("enumerate_groups")
  private Boolean enumerateGroups = null;

  @SerializedName("enumerate_users")
  private Boolean enumerateUsers = null;

  @SerializedName("findable_groups")
  private List<String> findableGroups = null;

  @SerializedName("findable_users")
  private List<String> findableUsers = null;

  @SerializedName("group_domain")
  private String groupDomain = null;

  @SerializedName("group_file")
  private String groupFile = null;

  @SerializedName("home_directory_template")
  private String homeDirectoryTemplate = null;

  @SerializedName("listable_groups")
  private List<String> listableGroups = null;

  @SerializedName("listable_users")
  private List<String> listableUsers = null;

  @SerializedName("login_shell")
  private String loginShell = null;

  @SerializedName("modifiable_groups")
  private List<String> modifiableGroups = null;

  @SerializedName("modifiable_users")
  private List<String> modifiableUsers = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("netgroup_file")
  private String netgroupFile = null;

  @SerializedName("normalize_groups")
  private Boolean normalizeGroups = null;

  @SerializedName("normalize_users")
  private Boolean normalizeUsers = null;

  /**
   * Specifies which NTLM versions to support for users with NTLM-compatible credentials.
   */
  @JsonAdapter(NtlmSupportEnum.Adapter.class)
  public enum NtlmSupportEnum {
    ALL("all"),
    
    V2ONLY("v2only"),
    
    NONE("none");

    private String value;

    NtlmSupportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NtlmSupportEnum fromValue(String text) {
      for (NtlmSupportEnum b : NtlmSupportEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NtlmSupportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NtlmSupportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NtlmSupportEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NtlmSupportEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ntlm_support")
  private NtlmSupportEnum ntlmSupport = null;

  @SerializedName("password_file")
  private String passwordFile = null;

  @SerializedName("provider_domain")
  private String providerDomain = null;

  @SerializedName("restrict_findable")
  private Boolean restrictFindable = null;

  @SerializedName("restrict_listable")
  private Boolean restrictListable = null;

  @SerializedName("restrict_modifiable")
  private Boolean restrictModifiable = null;

  @SerializedName("unfindable_groups")
  private List<String> unfindableGroups = null;

  @SerializedName("unfindable_users")
  private List<String> unfindableUsers = null;

  @SerializedName("unlistable_groups")
  private List<String> unlistableGroups = null;

  @SerializedName("unlistable_users")
  private List<String> unlistableUsers = null;

  @SerializedName("unmodifiable_groups")
  private List<String> unmodifiableGroups = null;

  @SerializedName("unmodifiable_users")
  private List<String> unmodifiableUsers = null;

  @SerializedName("user_domain")
  private String userDomain = null;

  public ProvidersFileItem authentication(Boolean authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Enables authentication and identity mapping through the authentication provider.
   * @return authentication
  **/
  @ApiModelProperty(value = "Enables authentication and identity mapping through the authentication provider.")
  public Boolean isAuthentication() {
    return authentication;
  }

  public void setAuthentication(Boolean authentication) {
    this.authentication = authentication;
  }

  public ProvidersFileItem createHomeDirectory(Boolean createHomeDirectory) {
    this.createHomeDirectory = createHomeDirectory;
    return this;
  }

   /**
   * Automatically creates a home directory on the first login.
   * @return createHomeDirectory
  **/
  @ApiModelProperty(value = "Automatically creates a home directory on the first login.")
  public Boolean isCreateHomeDirectory() {
    return createHomeDirectory;
  }

  public void setCreateHomeDirectory(Boolean createHomeDirectory) {
    this.createHomeDirectory = createHomeDirectory;
  }

  public ProvidersFileItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enables the file provider.
   * @return enabled
  **/
  @ApiModelProperty(value = "Enables the file provider.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ProvidersFileItem enumerateGroups(Boolean enumerateGroups) {
    this.enumerateGroups = enumerateGroups;
    return this;
  }

   /**
   * Enables the provider to enumerate groups.
   * @return enumerateGroups
  **/
  @ApiModelProperty(value = "Enables the provider to enumerate groups.")
  public Boolean isEnumerateGroups() {
    return enumerateGroups;
  }

  public void setEnumerateGroups(Boolean enumerateGroups) {
    this.enumerateGroups = enumerateGroups;
  }

  public ProvidersFileItem enumerateUsers(Boolean enumerateUsers) {
    this.enumerateUsers = enumerateUsers;
    return this;
  }

   /**
   * Enables the provider to enumerate users.
   * @return enumerateUsers
  **/
  @ApiModelProperty(value = "Enables the provider to enumerate users.")
  public Boolean isEnumerateUsers() {
    return enumerateUsers;
  }

  public void setEnumerateUsers(Boolean enumerateUsers) {
    this.enumerateUsers = enumerateUsers;
  }

  public ProvidersFileItem findableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
    return this;
  }

  public ProvidersFileItem addFindableGroupsItem(String findableGroupsItem) {
    if (this.findableGroups == null) {
      this.findableGroups = new ArrayList<String>();
    }
    this.findableGroups.add(findableGroupsItem);
    return this;
  }

   /**
   * Specifies the list of groups that can be resolved.
   * @return findableGroups
  **/
  @ApiModelProperty(value = "Specifies the list of groups that can be resolved.")
  public List<String> getFindableGroups() {
    return findableGroups;
  }

  public void setFindableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
  }

  public ProvidersFileItem findableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
    return this;
  }

  public ProvidersFileItem addFindableUsersItem(String findableUsersItem) {
    if (this.findableUsers == null) {
      this.findableUsers = new ArrayList<String>();
    }
    this.findableUsers.add(findableUsersItem);
    return this;
  }

   /**
   * Specifies the list of users that can be resolved.
   * @return findableUsers
  **/
  @ApiModelProperty(value = "Specifies the list of users that can be resolved.")
  public List<String> getFindableUsers() {
    return findableUsers;
  }

  public void setFindableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
  }

  public ProvidersFileItem groupDomain(String groupDomain) {
    this.groupDomain = groupDomain;
    return this;
  }

   /**
   * Specifies the domain for this provider through which domains are qualified.
   * @return groupDomain
  **/
  @ApiModelProperty(value = "Specifies the domain for this provider through which domains are qualified.")
  public String getGroupDomain() {
    return groupDomain;
  }

  public void setGroupDomain(String groupDomain) {
    this.groupDomain = groupDomain;
  }

  public ProvidersFileItem groupFile(String groupFile) {
    this.groupFile = groupFile;
    return this;
  }

   /**
   * Specifies the location of the file that contains information about the group.
   * @return groupFile
  **/
  @ApiModelProperty(required = true, value = "Specifies the location of the file that contains information about the group.")
  public String getGroupFile() {
    return groupFile;
  }

  public void setGroupFile(String groupFile) {
    this.groupFile = groupFile;
  }

  public ProvidersFileItem homeDirectoryTemplate(String homeDirectoryTemplate) {
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

  public ProvidersFileItem listableGroups(List<String> listableGroups) {
    this.listableGroups = listableGroups;
    return this;
  }

  public ProvidersFileItem addListableGroupsItem(String listableGroupsItem) {
    if (this.listableGroups == null) {
      this.listableGroups = new ArrayList<String>();
    }
    this.listableGroups.add(listableGroupsItem);
    return this;
  }

   /**
   * Specifies the groups that can be viewed in the provider.
   * @return listableGroups
  **/
  @ApiModelProperty(value = "Specifies the groups that can be viewed in the provider.")
  public List<String> getListableGroups() {
    return listableGroups;
  }

  public void setListableGroups(List<String> listableGroups) {
    this.listableGroups = listableGroups;
  }

  public ProvidersFileItem listableUsers(List<String> listableUsers) {
    this.listableUsers = listableUsers;
    return this;
  }

  public ProvidersFileItem addListableUsersItem(String listableUsersItem) {
    if (this.listableUsers == null) {
      this.listableUsers = new ArrayList<String>();
    }
    this.listableUsers.add(listableUsersItem);
    return this;
  }

   /**
   * Specifies the users that can be viewed in the provider.
   * @return listableUsers
  **/
  @ApiModelProperty(value = "Specifies the users that can be viewed in the provider.")
  public List<String> getListableUsers() {
    return listableUsers;
  }

  public void setListableUsers(List<String> listableUsers) {
    this.listableUsers = listableUsers;
  }

  public ProvidersFileItem loginShell(String loginShell) {
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

  public ProvidersFileItem modifiableGroups(List<String> modifiableGroups) {
    this.modifiableGroups = modifiableGroups;
    return this;
  }

  public ProvidersFileItem addModifiableGroupsItem(String modifiableGroupsItem) {
    if (this.modifiableGroups == null) {
      this.modifiableGroups = new ArrayList<String>();
    }
    this.modifiableGroups.add(modifiableGroupsItem);
    return this;
  }

   /**
   * Specifies the groups that can be modified in the provider.
   * @return modifiableGroups
  **/
  @ApiModelProperty(value = "Specifies the groups that can be modified in the provider.")
  public List<String> getModifiableGroups() {
    return modifiableGroups;
  }

  public void setModifiableGroups(List<String> modifiableGroups) {
    this.modifiableGroups = modifiableGroups;
  }

  public ProvidersFileItem modifiableUsers(List<String> modifiableUsers) {
    this.modifiableUsers = modifiableUsers;
    return this;
  }

  public ProvidersFileItem addModifiableUsersItem(String modifiableUsersItem) {
    if (this.modifiableUsers == null) {
      this.modifiableUsers = new ArrayList<String>();
    }
    this.modifiableUsers.add(modifiableUsersItem);
    return this;
  }

   /**
   * Specifies the users that can be modified in the provider.
   * @return modifiableUsers
  **/
  @ApiModelProperty(value = "Specifies the users that can be modified in the provider.")
  public List<String> getModifiableUsers() {
    return modifiableUsers;
  }

  public void setModifiableUsers(List<String> modifiableUsers) {
    this.modifiableUsers = modifiableUsers;
  }

  public ProvidersFileItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the file provider.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the file provider.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProvidersFileItem netgroupFile(String netgroupFile) {
    this.netgroupFile = netgroupFile;
    return this;
  }

   /**
   * Specifies the path to a netgroups replacement file.
   * @return netgroupFile
  **/
  @ApiModelProperty(value = "Specifies the path to a netgroups replacement file.")
  public String getNetgroupFile() {
    return netgroupFile;
  }

  public void setNetgroupFile(String netgroupFile) {
    this.netgroupFile = netgroupFile;
  }

  public ProvidersFileItem normalizeGroups(Boolean normalizeGroups) {
    this.normalizeGroups = normalizeGroups;
    return this;
  }

   /**
   * Normalizes group names to lowercase before look up.
   * @return normalizeGroups
  **/
  @ApiModelProperty(value = "Normalizes group names to lowercase before look up.")
  public Boolean isNormalizeGroups() {
    return normalizeGroups;
  }

  public void setNormalizeGroups(Boolean normalizeGroups) {
    this.normalizeGroups = normalizeGroups;
  }

  public ProvidersFileItem normalizeUsers(Boolean normalizeUsers) {
    this.normalizeUsers = normalizeUsers;
    return this;
  }

   /**
   * Normalizes user names to lowercase before look up.
   * @return normalizeUsers
  **/
  @ApiModelProperty(value = "Normalizes user names to lowercase before look up.")
  public Boolean isNormalizeUsers() {
    return normalizeUsers;
  }

  public void setNormalizeUsers(Boolean normalizeUsers) {
    this.normalizeUsers = normalizeUsers;
  }

  public ProvidersFileItem ntlmSupport(NtlmSupportEnum ntlmSupport) {
    this.ntlmSupport = ntlmSupport;
    return this;
  }

   /**
   * Specifies which NTLM versions to support for users with NTLM-compatible credentials.
   * @return ntlmSupport
  **/
  @ApiModelProperty(value = "Specifies which NTLM versions to support for users with NTLM-compatible credentials.")
  public NtlmSupportEnum getNtlmSupport() {
    return ntlmSupport;
  }

  public void setNtlmSupport(NtlmSupportEnum ntlmSupport) {
    this.ntlmSupport = ntlmSupport;
  }

  public ProvidersFileItem passwordFile(String passwordFile) {
    this.passwordFile = passwordFile;
    return this;
  }

   /**
   * Specifies the location of the file containing information about users.
   * @return passwordFile
  **/
  @ApiModelProperty(required = true, value = "Specifies the location of the file containing information about users.")
  public String getPasswordFile() {
    return passwordFile;
  }

  public void setPasswordFile(String passwordFile) {
    this.passwordFile = passwordFile;
  }

  public ProvidersFileItem providerDomain(String providerDomain) {
    this.providerDomain = providerDomain;
    return this;
  }

   /**
   * Specifies the domain for the provider.
   * @return providerDomain
  **/
  @ApiModelProperty(value = "Specifies the domain for the provider.")
  public String getProviderDomain() {
    return providerDomain;
  }

  public void setProviderDomain(String providerDomain) {
    this.providerDomain = providerDomain;
  }

  public ProvidersFileItem restrictFindable(Boolean restrictFindable) {
    this.restrictFindable = restrictFindable;
    return this;
  }

   /**
   * If true, checks the provider for filtered lists of findable and unfindable users and groups.
   * @return restrictFindable
  **/
  @ApiModelProperty(value = "If true, checks the provider for filtered lists of findable and unfindable users and groups.")
  public Boolean isRestrictFindable() {
    return restrictFindable;
  }

  public void setRestrictFindable(Boolean restrictFindable) {
    this.restrictFindable = restrictFindable;
  }

  public ProvidersFileItem restrictListable(Boolean restrictListable) {
    this.restrictListable = restrictListable;
    return this;
  }

   /**
   * If true, checks the provider for filtered lists of listable and unlistable users and groups.
   * @return restrictListable
  **/
  @ApiModelProperty(value = "If true, checks the provider for filtered lists of listable and unlistable users and groups.")
  public Boolean isRestrictListable() {
    return restrictListable;
  }

  public void setRestrictListable(Boolean restrictListable) {
    this.restrictListable = restrictListable;
  }

  public ProvidersFileItem restrictModifiable(Boolean restrictModifiable) {
    this.restrictModifiable = restrictModifiable;
    return this;
  }

   /**
   * If true, checks the provider for filtered lists of modifiable and unmodifiable users and groups.
   * @return restrictModifiable
  **/
  @ApiModelProperty(value = "If true, checks the provider for filtered lists of modifiable and unmodifiable users and groups.")
  public Boolean isRestrictModifiable() {
    return restrictModifiable;
  }

  public void setRestrictModifiable(Boolean restrictModifiable) {
    this.restrictModifiable = restrictModifiable;
  }

  public ProvidersFileItem unfindableGroups(List<String> unfindableGroups) {
    this.unfindableGroups = unfindableGroups;
    return this;
  }

  public ProvidersFileItem addUnfindableGroupsItem(String unfindableGroupsItem) {
    if (this.unfindableGroups == null) {
      this.unfindableGroups = new ArrayList<String>();
    }
    this.unfindableGroups.add(unfindableGroupsItem);
    return this;
  }

   /**
   * Specifies groups that cannot be resolved by the provider.
   * @return unfindableGroups
  **/
  @ApiModelProperty(value = "Specifies groups that cannot be resolved by the provider.")
  public List<String> getUnfindableGroups() {
    return unfindableGroups;
  }

  public void setUnfindableGroups(List<String> unfindableGroups) {
    this.unfindableGroups = unfindableGroups;
  }

  public ProvidersFileItem unfindableUsers(List<String> unfindableUsers) {
    this.unfindableUsers = unfindableUsers;
    return this;
  }

  public ProvidersFileItem addUnfindableUsersItem(String unfindableUsersItem) {
    if (this.unfindableUsers == null) {
      this.unfindableUsers = new ArrayList<String>();
    }
    this.unfindableUsers.add(unfindableUsersItem);
    return this;
  }

   /**
   * Specifies users that cannot be resolved by the provider.
   * @return unfindableUsers
  **/
  @ApiModelProperty(value = "Specifies users that cannot be resolved by the provider.")
  public List<String> getUnfindableUsers() {
    return unfindableUsers;
  }

  public void setUnfindableUsers(List<String> unfindableUsers) {
    this.unfindableUsers = unfindableUsers;
  }

  public ProvidersFileItem unlistableGroups(List<String> unlistableGroups) {
    this.unlistableGroups = unlistableGroups;
    return this;
  }

  public ProvidersFileItem addUnlistableGroupsItem(String unlistableGroupsItem) {
    if (this.unlistableGroups == null) {
      this.unlistableGroups = new ArrayList<String>();
    }
    this.unlistableGroups.add(unlistableGroupsItem);
    return this;
  }

   /**
   * Specifies a group that cannot be listed by the provider.
   * @return unlistableGroups
  **/
  @ApiModelProperty(value = "Specifies a group that cannot be listed by the provider.")
  public List<String> getUnlistableGroups() {
    return unlistableGroups;
  }

  public void setUnlistableGroups(List<String> unlistableGroups) {
    this.unlistableGroups = unlistableGroups;
  }

  public ProvidersFileItem unlistableUsers(List<String> unlistableUsers) {
    this.unlistableUsers = unlistableUsers;
    return this;
  }

  public ProvidersFileItem addUnlistableUsersItem(String unlistableUsersItem) {
    if (this.unlistableUsers == null) {
      this.unlistableUsers = new ArrayList<String>();
    }
    this.unlistableUsers.add(unlistableUsersItem);
    return this;
  }

   /**
   * Specifies a user that cannot be listed by the provider.
   * @return unlistableUsers
  **/
  @ApiModelProperty(value = "Specifies a user that cannot be listed by the provider.")
  public List<String> getUnlistableUsers() {
    return unlistableUsers;
  }

  public void setUnlistableUsers(List<String> unlistableUsers) {
    this.unlistableUsers = unlistableUsers;
  }

  public ProvidersFileItem unmodifiableGroups(List<String> unmodifiableGroups) {
    this.unmodifiableGroups = unmodifiableGroups;
    return this;
  }

  public ProvidersFileItem addUnmodifiableGroupsItem(String unmodifiableGroupsItem) {
    if (this.unmodifiableGroups == null) {
      this.unmodifiableGroups = new ArrayList<String>();
    }
    this.unmodifiableGroups.add(unmodifiableGroupsItem);
    return this;
  }

   /**
   * Specifies a group that cannot be modified by the provider.
   * @return unmodifiableGroups
  **/
  @ApiModelProperty(value = "Specifies a group that cannot be modified by the provider.")
  public List<String> getUnmodifiableGroups() {
    return unmodifiableGroups;
  }

  public void setUnmodifiableGroups(List<String> unmodifiableGroups) {
    this.unmodifiableGroups = unmodifiableGroups;
  }

  public ProvidersFileItem unmodifiableUsers(List<String> unmodifiableUsers) {
    this.unmodifiableUsers = unmodifiableUsers;
    return this;
  }

  public ProvidersFileItem addUnmodifiableUsersItem(String unmodifiableUsersItem) {
    if (this.unmodifiableUsers == null) {
      this.unmodifiableUsers = new ArrayList<String>();
    }
    this.unmodifiableUsers.add(unmodifiableUsersItem);
    return this;
  }

   /**
   * Specifies a user that cannot be modified by the provider.
   * @return unmodifiableUsers
  **/
  @ApiModelProperty(value = "Specifies a user that cannot be modified by the provider.")
  public List<String> getUnmodifiableUsers() {
    return unmodifiableUsers;
  }

  public void setUnmodifiableUsers(List<String> unmodifiableUsers) {
    this.unmodifiableUsers = unmodifiableUsers;
  }

  public ProvidersFileItem userDomain(String userDomain) {
    this.userDomain = userDomain;
    return this;
  }

   /**
   * Specifies the domain for this provider through which users are qualified.
   * @return userDomain
  **/
  @ApiModelProperty(value = "Specifies the domain for this provider through which users are qualified.")
  public String getUserDomain() {
    return userDomain;
  }

  public void setUserDomain(String userDomain) {
    this.userDomain = userDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersFileItem providersFileItem = (ProvidersFileItem) o;
    return Objects.equals(this.authentication, providersFileItem.authentication) &&
        Objects.equals(this.createHomeDirectory, providersFileItem.createHomeDirectory) &&
        Objects.equals(this.enabled, providersFileItem.enabled) &&
        Objects.equals(this.enumerateGroups, providersFileItem.enumerateGroups) &&
        Objects.equals(this.enumerateUsers, providersFileItem.enumerateUsers) &&
        Objects.equals(this.findableGroups, providersFileItem.findableGroups) &&
        Objects.equals(this.findableUsers, providersFileItem.findableUsers) &&
        Objects.equals(this.groupDomain, providersFileItem.groupDomain) &&
        Objects.equals(this.groupFile, providersFileItem.groupFile) &&
        Objects.equals(this.homeDirectoryTemplate, providersFileItem.homeDirectoryTemplate) &&
        Objects.equals(this.listableGroups, providersFileItem.listableGroups) &&
        Objects.equals(this.listableUsers, providersFileItem.listableUsers) &&
        Objects.equals(this.loginShell, providersFileItem.loginShell) &&
        Objects.equals(this.modifiableGroups, providersFileItem.modifiableGroups) &&
        Objects.equals(this.modifiableUsers, providersFileItem.modifiableUsers) &&
        Objects.equals(this.name, providersFileItem.name) &&
        Objects.equals(this.netgroupFile, providersFileItem.netgroupFile) &&
        Objects.equals(this.normalizeGroups, providersFileItem.normalizeGroups) &&
        Objects.equals(this.normalizeUsers, providersFileItem.normalizeUsers) &&
        Objects.equals(this.ntlmSupport, providersFileItem.ntlmSupport) &&
        Objects.equals(this.passwordFile, providersFileItem.passwordFile) &&
        Objects.equals(this.providerDomain, providersFileItem.providerDomain) &&
        Objects.equals(this.restrictFindable, providersFileItem.restrictFindable) &&
        Objects.equals(this.restrictListable, providersFileItem.restrictListable) &&
        Objects.equals(this.restrictModifiable, providersFileItem.restrictModifiable) &&
        Objects.equals(this.unfindableGroups, providersFileItem.unfindableGroups) &&
        Objects.equals(this.unfindableUsers, providersFileItem.unfindableUsers) &&
        Objects.equals(this.unlistableGroups, providersFileItem.unlistableGroups) &&
        Objects.equals(this.unlistableUsers, providersFileItem.unlistableUsers) &&
        Objects.equals(this.unmodifiableGroups, providersFileItem.unmodifiableGroups) &&
        Objects.equals(this.unmodifiableUsers, providersFileItem.unmodifiableUsers) &&
        Objects.equals(this.userDomain, providersFileItem.userDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, createHomeDirectory, enabled, enumerateGroups, enumerateUsers, findableGroups, findableUsers, groupDomain, groupFile, homeDirectoryTemplate, listableGroups, listableUsers, loginShell, modifiableGroups, modifiableUsers, name, netgroupFile, normalizeGroups, normalizeUsers, ntlmSupport, passwordFile, providerDomain, restrictFindable, restrictListable, restrictModifiable, unfindableGroups, unfindableUsers, unlistableGroups, unlistableUsers, unmodifiableGroups, unmodifiableUsers, userDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersFileItem {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    createHomeDirectory: ").append(toIndentedString(createHomeDirectory)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enumerateGroups: ").append(toIndentedString(enumerateGroups)).append("\n");
    sb.append("    enumerateUsers: ").append(toIndentedString(enumerateUsers)).append("\n");
    sb.append("    findableGroups: ").append(toIndentedString(findableGroups)).append("\n");
    sb.append("    findableUsers: ").append(toIndentedString(findableUsers)).append("\n");
    sb.append("    groupDomain: ").append(toIndentedString(groupDomain)).append("\n");
    sb.append("    groupFile: ").append(toIndentedString(groupFile)).append("\n");
    sb.append("    homeDirectoryTemplate: ").append(toIndentedString(homeDirectoryTemplate)).append("\n");
    sb.append("    listableGroups: ").append(toIndentedString(listableGroups)).append("\n");
    sb.append("    listableUsers: ").append(toIndentedString(listableUsers)).append("\n");
    sb.append("    loginShell: ").append(toIndentedString(loginShell)).append("\n");
    sb.append("    modifiableGroups: ").append(toIndentedString(modifiableGroups)).append("\n");
    sb.append("    modifiableUsers: ").append(toIndentedString(modifiableUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netgroupFile: ").append(toIndentedString(netgroupFile)).append("\n");
    sb.append("    normalizeGroups: ").append(toIndentedString(normalizeGroups)).append("\n");
    sb.append("    normalizeUsers: ").append(toIndentedString(normalizeUsers)).append("\n");
    sb.append("    ntlmSupport: ").append(toIndentedString(ntlmSupport)).append("\n");
    sb.append("    passwordFile: ").append(toIndentedString(passwordFile)).append("\n");
    sb.append("    providerDomain: ").append(toIndentedString(providerDomain)).append("\n");
    sb.append("    restrictFindable: ").append(toIndentedString(restrictFindable)).append("\n");
    sb.append("    restrictListable: ").append(toIndentedString(restrictListable)).append("\n");
    sb.append("    restrictModifiable: ").append(toIndentedString(restrictModifiable)).append("\n");
    sb.append("    unfindableGroups: ").append(toIndentedString(unfindableGroups)).append("\n");
    sb.append("    unfindableUsers: ").append(toIndentedString(unfindableUsers)).append("\n");
    sb.append("    unlistableGroups: ").append(toIndentedString(unlistableGroups)).append("\n");
    sb.append("    unlistableUsers: ").append(toIndentedString(unlistableUsers)).append("\n");
    sb.append("    unmodifiableGroups: ").append(toIndentedString(unmodifiableGroups)).append("\n");
    sb.append("    unmodifiableUsers: ").append(toIndentedString(unmodifiableUsers)).append("\n");
    sb.append("    userDomain: ").append(toIndentedString(userDomain)).append("\n");
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

