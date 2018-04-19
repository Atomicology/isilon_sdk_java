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
 * Specifies the properties for an NIS authentication provider.
 */
@ApiModel(description = "Specifies the properties for an NIS authentication provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ProvidersNisItem {
  @SerializedName("authentication")
  private Boolean authentication = null;

  @SerializedName("balance_servers")
  private Boolean balanceServers = null;

  @SerializedName("check_online_interval")
  private Integer checkOnlineInterval = null;

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

  @SerializedName("groupnet")
  private String groupnet = null;

  @SerializedName("home_directory_template")
  private String homeDirectoryTemplate = null;

  @SerializedName("hostname_lookup")
  private Boolean hostnameLookup = null;

  @SerializedName("listable_groups")
  private List<String> listableGroups = null;

  @SerializedName("listable_users")
  private List<String> listableUsers = null;

  @SerializedName("login_shell")
  private String loginShell = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nis_domain")
  private String nisDomain = null;

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

  @SerializedName("provider_domain")
  private String providerDomain = null;

  @SerializedName("request_timeout")
  private Integer requestTimeout = null;

  @SerializedName("restrict_findable")
  private Boolean restrictFindable = null;

  @SerializedName("restrict_listable")
  private Boolean restrictListable = null;

  @SerializedName("retry_time")
  private Integer retryTime = null;

  @SerializedName("servers")
  private List<String> servers = new ArrayList<String>();

  @SerializedName("unfindable_groups")
  private List<String> unfindableGroups = null;

  @SerializedName("unfindable_users")
  private List<String> unfindableUsers = null;

  @SerializedName("unlistable_groups")
  private List<String> unlistableGroups = null;

  @SerializedName("unlistable_users")
  private List<String> unlistableUsers = null;

  @SerializedName("user_domain")
  private String userDomain = null;

  @SerializedName("ypmatch_using_tcp")
  private Boolean ypmatchUsingTcp = null;

  public ProvidersNisItem authentication(Boolean authentication) {
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

  public ProvidersNisItem balanceServers(Boolean balanceServers) {
    this.balanceServers = balanceServers;
    return this;
  }

   /**
   * If true, connects the provider to a random server.
   * @return balanceServers
  **/
  @ApiModelProperty(value = "If true, connects the provider to a random server.")
  public Boolean isBalanceServers() {
    return balanceServers;
  }

  public void setBalanceServers(Boolean balanceServers) {
    this.balanceServers = balanceServers;
  }

  public ProvidersNisItem checkOnlineInterval(Integer checkOnlineInterval) {
    this.checkOnlineInterval = checkOnlineInterval;
    return this;
  }

   /**
   * Specifies the time in seconds between provider online checks.
   * minimum: 0
   * maximum: 3600
   * @return checkOnlineInterval
  **/
  @ApiModelProperty(value = "Specifies the time in seconds between provider online checks.")
  public Integer getCheckOnlineInterval() {
    return checkOnlineInterval;
  }

  public void setCheckOnlineInterval(Integer checkOnlineInterval) {
    this.checkOnlineInterval = checkOnlineInterval;
  }

  public ProvidersNisItem createHomeDirectory(Boolean createHomeDirectory) {
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

  public ProvidersNisItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * If true, enables the NIS provider.
   * @return enabled
  **/
  @ApiModelProperty(value = "If true, enables the NIS provider.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ProvidersNisItem enumerateGroups(Boolean enumerateGroups) {
    this.enumerateGroups = enumerateGroups;
    return this;
  }

   /**
   * If true, allows the provider to enumerate groups.
   * @return enumerateGroups
  **/
  @ApiModelProperty(value = "If true, allows the provider to enumerate groups.")
  public Boolean isEnumerateGroups() {
    return enumerateGroups;
  }

  public void setEnumerateGroups(Boolean enumerateGroups) {
    this.enumerateGroups = enumerateGroups;
  }

  public ProvidersNisItem enumerateUsers(Boolean enumerateUsers) {
    this.enumerateUsers = enumerateUsers;
    return this;
  }

   /**
   * If true, allows the provider to enumerate users.
   * @return enumerateUsers
  **/
  @ApiModelProperty(value = "If true, allows the provider to enumerate users.")
  public Boolean isEnumerateUsers() {
    return enumerateUsers;
  }

  public void setEnumerateUsers(Boolean enumerateUsers) {
    this.enumerateUsers = enumerateUsers;
  }

  public ProvidersNisItem findableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
    return this;
  }

  public ProvidersNisItem addFindableGroupsItem(String findableGroupsItem) {
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

  public ProvidersNisItem findableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
    return this;
  }

  public ProvidersNisItem addFindableUsersItem(String findableUsersItem) {
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

  public ProvidersNisItem groupDomain(String groupDomain) {
    this.groupDomain = groupDomain;
    return this;
  }

   /**
   * Specifies the domain for this provider through which groups are qualified.
   * @return groupDomain
  **/
  @ApiModelProperty(value = "Specifies the domain for this provider through which groups are qualified.")
  public String getGroupDomain() {
    return groupDomain;
  }

  public void setGroupDomain(String groupDomain) {
    this.groupDomain = groupDomain;
  }

  public ProvidersNisItem groupnet(String groupnet) {
    this.groupnet = groupnet;
    return this;
  }

   /**
   * Groupnet identifier.
   * @return groupnet
  **/
  @ApiModelProperty(value = "Groupnet identifier.")
  public String getGroupnet() {
    return groupnet;
  }

  public void setGroupnet(String groupnet) {
    this.groupnet = groupnet;
  }

  public ProvidersNisItem homeDirectoryTemplate(String homeDirectoryTemplate) {
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

  public ProvidersNisItem hostnameLookup(Boolean hostnameLookup) {
    this.hostnameLookup = hostnameLookup;
    return this;
  }

   /**
   * If true, enables host name look ups.
   * @return hostnameLookup
  **/
  @ApiModelProperty(value = "If true, enables host name look ups.")
  public Boolean isHostnameLookup() {
    return hostnameLookup;
  }

  public void setHostnameLookup(Boolean hostnameLookup) {
    this.hostnameLookup = hostnameLookup;
  }

  public ProvidersNisItem listableGroups(List<String> listableGroups) {
    this.listableGroups = listableGroups;
    return this;
  }

  public ProvidersNisItem addListableGroupsItem(String listableGroupsItem) {
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

  public ProvidersNisItem listableUsers(List<String> listableUsers) {
    this.listableUsers = listableUsers;
    return this;
  }

  public ProvidersNisItem addListableUsersItem(String listableUsersItem) {
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

  public ProvidersNisItem loginShell(String loginShell) {
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

  public ProvidersNisItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the NIS provider name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies the NIS provider name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProvidersNisItem nisDomain(String nisDomain) {
    this.nisDomain = nisDomain;
    return this;
  }

   /**
   * Specifies the NIS domain name.
   * @return nisDomain
  **/
  @ApiModelProperty(required = true, value = "Specifies the NIS domain name.")
  public String getNisDomain() {
    return nisDomain;
  }

  public void setNisDomain(String nisDomain) {
    this.nisDomain = nisDomain;
  }

  public ProvidersNisItem normalizeGroups(Boolean normalizeGroups) {
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

  public ProvidersNisItem normalizeUsers(Boolean normalizeUsers) {
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

  public ProvidersNisItem ntlmSupport(NtlmSupportEnum ntlmSupport) {
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

  public ProvidersNisItem providerDomain(String providerDomain) {
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

  public ProvidersNisItem requestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
    return this;
  }

   /**
   * Specifies the request timeout interval in seconds.
   * minimum: 0
   * maximum: 3600
   * @return requestTimeout
  **/
  @ApiModelProperty(value = "Specifies the request timeout interval in seconds.")
  public Integer getRequestTimeout() {
    return requestTimeout;
  }

  public void setRequestTimeout(Integer requestTimeout) {
    this.requestTimeout = requestTimeout;
  }

  public ProvidersNisItem restrictFindable(Boolean restrictFindable) {
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

  public ProvidersNisItem restrictListable(Boolean restrictListable) {
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

  public ProvidersNisItem retryTime(Integer retryTime) {
    this.retryTime = retryTime;
    return this;
  }

   /**
   * Specifies the timeout period in seconds after which a request will be retried.
   * minimum: 0
   * maximum: 3600
   * @return retryTime
  **/
  @ApiModelProperty(value = "Specifies the timeout period in seconds after which a request will be retried.")
  public Integer getRetryTime() {
    return retryTime;
  }

  public void setRetryTime(Integer retryTime) {
    this.retryTime = retryTime;
  }

  public ProvidersNisItem servers(List<String> servers) {
    this.servers = servers;
    return this;
  }

  public ProvidersNisItem addServersItem(String serversItem) {
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Adds an NIS server for this provider.
   * @return servers
  **/
  @ApiModelProperty(required = true, value = "Adds an NIS server for this provider.")
  public List<String> getServers() {
    return servers;
  }

  public void setServers(List<String> servers) {
    this.servers = servers;
  }

  public ProvidersNisItem unfindableGroups(List<String> unfindableGroups) {
    this.unfindableGroups = unfindableGroups;
    return this;
  }

  public ProvidersNisItem addUnfindableGroupsItem(String unfindableGroupsItem) {
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

  public ProvidersNisItem unfindableUsers(List<String> unfindableUsers) {
    this.unfindableUsers = unfindableUsers;
    return this;
  }

  public ProvidersNisItem addUnfindableUsersItem(String unfindableUsersItem) {
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

  public ProvidersNisItem unlistableGroups(List<String> unlistableGroups) {
    this.unlistableGroups = unlistableGroups;
    return this;
  }

  public ProvidersNisItem addUnlistableGroupsItem(String unlistableGroupsItem) {
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

  public ProvidersNisItem unlistableUsers(List<String> unlistableUsers) {
    this.unlistableUsers = unlistableUsers;
    return this;
  }

  public ProvidersNisItem addUnlistableUsersItem(String unlistableUsersItem) {
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

  public ProvidersNisItem userDomain(String userDomain) {
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

  public ProvidersNisItem ypmatchUsingTcp(Boolean ypmatchUsingTcp) {
    this.ypmatchUsingTcp = ypmatchUsingTcp;
    return this;
  }

   /**
   * If true, specifies TCP for YP Match operations.
   * @return ypmatchUsingTcp
  **/
  @ApiModelProperty(value = "If true, specifies TCP for YP Match operations.")
  public Boolean isYpmatchUsingTcp() {
    return ypmatchUsingTcp;
  }

  public void setYpmatchUsingTcp(Boolean ypmatchUsingTcp) {
    this.ypmatchUsingTcp = ypmatchUsingTcp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersNisItem providersNisItem = (ProvidersNisItem) o;
    return Objects.equals(this.authentication, providersNisItem.authentication) &&
        Objects.equals(this.balanceServers, providersNisItem.balanceServers) &&
        Objects.equals(this.checkOnlineInterval, providersNisItem.checkOnlineInterval) &&
        Objects.equals(this.createHomeDirectory, providersNisItem.createHomeDirectory) &&
        Objects.equals(this.enabled, providersNisItem.enabled) &&
        Objects.equals(this.enumerateGroups, providersNisItem.enumerateGroups) &&
        Objects.equals(this.enumerateUsers, providersNisItem.enumerateUsers) &&
        Objects.equals(this.findableGroups, providersNisItem.findableGroups) &&
        Objects.equals(this.findableUsers, providersNisItem.findableUsers) &&
        Objects.equals(this.groupDomain, providersNisItem.groupDomain) &&
        Objects.equals(this.groupnet, providersNisItem.groupnet) &&
        Objects.equals(this.homeDirectoryTemplate, providersNisItem.homeDirectoryTemplate) &&
        Objects.equals(this.hostnameLookup, providersNisItem.hostnameLookup) &&
        Objects.equals(this.listableGroups, providersNisItem.listableGroups) &&
        Objects.equals(this.listableUsers, providersNisItem.listableUsers) &&
        Objects.equals(this.loginShell, providersNisItem.loginShell) &&
        Objects.equals(this.name, providersNisItem.name) &&
        Objects.equals(this.nisDomain, providersNisItem.nisDomain) &&
        Objects.equals(this.normalizeGroups, providersNisItem.normalizeGroups) &&
        Objects.equals(this.normalizeUsers, providersNisItem.normalizeUsers) &&
        Objects.equals(this.ntlmSupport, providersNisItem.ntlmSupport) &&
        Objects.equals(this.providerDomain, providersNisItem.providerDomain) &&
        Objects.equals(this.requestTimeout, providersNisItem.requestTimeout) &&
        Objects.equals(this.restrictFindable, providersNisItem.restrictFindable) &&
        Objects.equals(this.restrictListable, providersNisItem.restrictListable) &&
        Objects.equals(this.retryTime, providersNisItem.retryTime) &&
        Objects.equals(this.servers, providersNisItem.servers) &&
        Objects.equals(this.unfindableGroups, providersNisItem.unfindableGroups) &&
        Objects.equals(this.unfindableUsers, providersNisItem.unfindableUsers) &&
        Objects.equals(this.unlistableGroups, providersNisItem.unlistableGroups) &&
        Objects.equals(this.unlistableUsers, providersNisItem.unlistableUsers) &&
        Objects.equals(this.userDomain, providersNisItem.userDomain) &&
        Objects.equals(this.ypmatchUsingTcp, providersNisItem.ypmatchUsingTcp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, balanceServers, checkOnlineInterval, createHomeDirectory, enabled, enumerateGroups, enumerateUsers, findableGroups, findableUsers, groupDomain, groupnet, homeDirectoryTemplate, hostnameLookup, listableGroups, listableUsers, loginShell, name, nisDomain, normalizeGroups, normalizeUsers, ntlmSupport, providerDomain, requestTimeout, restrictFindable, restrictListable, retryTime, servers, unfindableGroups, unfindableUsers, unlistableGroups, unlistableUsers, userDomain, ypmatchUsingTcp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersNisItem {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    balanceServers: ").append(toIndentedString(balanceServers)).append("\n");
    sb.append("    checkOnlineInterval: ").append(toIndentedString(checkOnlineInterval)).append("\n");
    sb.append("    createHomeDirectory: ").append(toIndentedString(createHomeDirectory)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enumerateGroups: ").append(toIndentedString(enumerateGroups)).append("\n");
    sb.append("    enumerateUsers: ").append(toIndentedString(enumerateUsers)).append("\n");
    sb.append("    findableGroups: ").append(toIndentedString(findableGroups)).append("\n");
    sb.append("    findableUsers: ").append(toIndentedString(findableUsers)).append("\n");
    sb.append("    groupDomain: ").append(toIndentedString(groupDomain)).append("\n");
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    homeDirectoryTemplate: ").append(toIndentedString(homeDirectoryTemplate)).append("\n");
    sb.append("    hostnameLookup: ").append(toIndentedString(hostnameLookup)).append("\n");
    sb.append("    listableGroups: ").append(toIndentedString(listableGroups)).append("\n");
    sb.append("    listableUsers: ").append(toIndentedString(listableUsers)).append("\n");
    sb.append("    loginShell: ").append(toIndentedString(loginShell)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nisDomain: ").append(toIndentedString(nisDomain)).append("\n");
    sb.append("    normalizeGroups: ").append(toIndentedString(normalizeGroups)).append("\n");
    sb.append("    normalizeUsers: ").append(toIndentedString(normalizeUsers)).append("\n");
    sb.append("    ntlmSupport: ").append(toIndentedString(ntlmSupport)).append("\n");
    sb.append("    providerDomain: ").append(toIndentedString(providerDomain)).append("\n");
    sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
    sb.append("    restrictFindable: ").append(toIndentedString(restrictFindable)).append("\n");
    sb.append("    restrictListable: ").append(toIndentedString(restrictListable)).append("\n");
    sb.append("    retryTime: ").append(toIndentedString(retryTime)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
    sb.append("    unfindableGroups: ").append(toIndentedString(unfindableGroups)).append("\n");
    sb.append("    unfindableUsers: ").append(toIndentedString(unfindableUsers)).append("\n");
    sb.append("    unlistableGroups: ").append(toIndentedString(unlistableGroups)).append("\n");
    sb.append("    unlistableUsers: ").append(toIndentedString(unlistableUsers)).append("\n");
    sb.append("    userDomain: ").append(toIndentedString(userDomain)).append("\n");
    sb.append("    ypmatchUsingTcp: ").append(toIndentedString(ypmatchUsingTcp)).append("\n");
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

