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
 * Specifies the properties for an ADS authentication provider.
 */
@ApiModel(description = "Specifies the properties for an ADS authentication provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-18T15:45:33.897-07:00")
public class ProvidersAdsIdParams {
  @SerializedName("allocate_gids")
  private Boolean allocateGids = null;

  @SerializedName("allocate_uids")
  private Boolean allocateUids = null;

  @SerializedName("assume_default_domain")
  private Boolean assumeDefaultDomain = null;

  @SerializedName("authentication")
  private Boolean authentication = null;

  @SerializedName("check_online_interval")
  private Integer checkOnlineInterval = null;

  @SerializedName("controller_time")
  private Integer controllerTime = null;

  @SerializedName("create_home_directory")
  private Boolean createHomeDirectory = null;

  @SerializedName("domain_controller")
  private String domainController = null;

  @SerializedName("domain_offline_alerts")
  private Boolean domainOfflineAlerts = null;

  @SerializedName("findable_groups")
  private List<String> findableGroups = null;

  @SerializedName("findable_users")
  private List<String> findableUsers = null;

  @SerializedName("home_directory_template")
  private String homeDirectoryTemplate = null;

  @SerializedName("ignore_all_trusts")
  private Boolean ignoreAllTrusts = null;

  @SerializedName("ignored_trusted_domains")
  private List<String> ignoredTrustedDomains = null;

  @SerializedName("include_trusted_domains")
  private List<String> includeTrustedDomains = null;

  @SerializedName("instance")
  private String instance = null;

  @SerializedName("ldap_sign_and_seal")
  private Boolean ldapSignAndSeal = null;

  @SerializedName("login_shell")
  private String loginShell = null;

  @SerializedName("lookup_domains")
  private List<String> lookupDomains = null;

  @SerializedName("lookup_groups")
  private Boolean lookupGroups = null;

  @SerializedName("lookup_normalize_groups")
  private Boolean lookupNormalizeGroups = null;

  @SerializedName("lookup_normalize_users")
  private Boolean lookupNormalizeUsers = null;

  @SerializedName("lookup_users")
  private Boolean lookupUsers = null;

  @SerializedName("machine_name")
  private String machineName = null;

  @SerializedName("machine_password_changes")
  private Boolean machinePasswordChanges = null;

  @SerializedName("machine_password_lifespan")
  private Integer machinePasswordLifespan = null;

  @SerializedName("node_dc_affinity")
  private String nodeDcAffinity = null;

  @SerializedName("node_dc_affinity_timeout")
  private Integer nodeDcAffinityTimeout = null;

  @SerializedName("nss_enumeration")
  private Boolean nssEnumeration = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("reset_schannel")
  private Boolean resetSchannel = null;

  @SerializedName("restrict_findable")
  private Boolean restrictFindable = null;

  @SerializedName("sfu_support")
  private String sfuSupport = null;

  @SerializedName("spns")
  private List<String> spns = null;

  @SerializedName("store_sfu_mappings")
  private Boolean storeSfuMappings = null;

  @SerializedName("unfindable_groups")
  private List<String> unfindableGroups = null;

  @SerializedName("unfindable_users")
  private List<String> unfindableUsers = null;

  @SerializedName("user")
  private String user = null;

  public ProvidersAdsIdParams allocateGids(Boolean allocateGids) {
    this.allocateGids = allocateGids;
    return this;
  }

   /**
   * Allocates an ID for an unmapped Active Directory (ADS) group. ADS groups without GIDs can be proactively assigned a GID by the ID mapper. If the ID mapper option is disabled, GIDs are not proactively assigned, and when a primary group for a user does not include a GID, the system may allocate one. 
   * @return allocateGids
  **/
  @ApiModelProperty(value = "Allocates an ID for an unmapped Active Directory (ADS) group. ADS groups without GIDs can be proactively assigned a GID by the ID mapper. If the ID mapper option is disabled, GIDs are not proactively assigned, and when a primary group for a user does not include a GID, the system may allocate one. ")
  public Boolean isAllocateGids() {
    return allocateGids;
  }

  public void setAllocateGids(Boolean allocateGids) {
    this.allocateGids = allocateGids;
  }

  public ProvidersAdsIdParams allocateUids(Boolean allocateUids) {
    this.allocateUids = allocateUids;
    return this;
  }

   /**
   * Allocates a user ID for an unmapped Active Directory (ADS) user. ADS users without UIDs can be proactively assigned a UID by the ID mapper. IF the ID mapper option is disabled, UIDs are not proactively assigned, and when an identify for a user does not include a UID, the system may allocate one.
   * @return allocateUids
  **/
  @ApiModelProperty(value = "Allocates a user ID for an unmapped Active Directory (ADS) user. ADS users without UIDs can be proactively assigned a UID by the ID mapper. IF the ID mapper option is disabled, UIDs are not proactively assigned, and when an identify for a user does not include a UID, the system may allocate one.")
  public Boolean isAllocateUids() {
    return allocateUids;
  }

  public void setAllocateUids(Boolean allocateUids) {
    this.allocateUids = allocateUids;
  }

  public ProvidersAdsIdParams assumeDefaultDomain(Boolean assumeDefaultDomain) {
    this.assumeDefaultDomain = assumeDefaultDomain;
    return this;
  }

   /**
   * Enables lookup of unqualified user names in the primary domain.
   * @return assumeDefaultDomain
  **/
  @ApiModelProperty(value = "Enables lookup of unqualified user names in the primary domain.")
  public Boolean isAssumeDefaultDomain() {
    return assumeDefaultDomain;
  }

  public void setAssumeDefaultDomain(Boolean assumeDefaultDomain) {
    this.assumeDefaultDomain = assumeDefaultDomain;
  }

  public ProvidersAdsIdParams authentication(Boolean authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Enables authentication and identity management through the authentication provider.
   * @return authentication
  **/
  @ApiModelProperty(value = "Enables authentication and identity management through the authentication provider.")
  public Boolean isAuthentication() {
    return authentication;
  }

  public void setAuthentication(Boolean authentication) {
    this.authentication = authentication;
  }

  public ProvidersAdsIdParams checkOnlineInterval(Integer checkOnlineInterval) {
    this.checkOnlineInterval = checkOnlineInterval;
    return this;
  }

   /**
   * Specifies the time in seconds between provider online checks.
   * minimum: 60
   * maximum: 86400
   * @return checkOnlineInterval
  **/
  @ApiModelProperty(value = "Specifies the time in seconds between provider online checks.")
  public Integer getCheckOnlineInterval() {
    return checkOnlineInterval;
  }

  public void setCheckOnlineInterval(Integer checkOnlineInterval) {
    this.checkOnlineInterval = checkOnlineInterval;
  }

  public ProvidersAdsIdParams controllerTime(Integer controllerTime) {
    this.controllerTime = controllerTime;
    return this;
  }

   /**
   * Specifies the current time for the domain controllers.
   * minimum: 0
   * maximum: 4294967295
   * @return controllerTime
  **/
  @ApiModelProperty(value = "Specifies the current time for the domain controllers.")
  public Integer getControllerTime() {
    return controllerTime;
  }

  public void setControllerTime(Integer controllerTime) {
    this.controllerTime = controllerTime;
  }

  public ProvidersAdsIdParams createHomeDirectory(Boolean createHomeDirectory) {
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

  public ProvidersAdsIdParams domainController(String domainController) {
    this.domainController = domainController;
    return this;
  }

   /**
   * Specifies the domain controller to which the authentication service should send requests
   * @return domainController
  **/
  @ApiModelProperty(value = "Specifies the domain controller to which the authentication service should send requests")
  public String getDomainController() {
    return domainController;
  }

  public void setDomainController(String domainController) {
    this.domainController = domainController;
  }

  public ProvidersAdsIdParams domainOfflineAlerts(Boolean domainOfflineAlerts) {
    this.domainOfflineAlerts = domainOfflineAlerts;
    return this;
  }

   /**
   * Sends an alert if the domain goes offline.
   * @return domainOfflineAlerts
  **/
  @ApiModelProperty(value = "Sends an alert if the domain goes offline.")
  public Boolean isDomainOfflineAlerts() {
    return domainOfflineAlerts;
  }

  public void setDomainOfflineAlerts(Boolean domainOfflineAlerts) {
    this.domainOfflineAlerts = domainOfflineAlerts;
  }

  public ProvidersAdsIdParams findableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
    return this;
  }

  public ProvidersAdsIdParams addFindableGroupsItem(String findableGroupsItem) {
    if (this.findableGroups == null) {
      this.findableGroups = new ArrayList<String>();
    }
    this.findableGroups.add(findableGroupsItem);
    return this;
  }

   /**
   * Sets list of groups that can be resolved.
   * @return findableGroups
  **/
  @ApiModelProperty(value = "Sets list of groups that can be resolved.")
  public List<String> getFindableGroups() {
    return findableGroups;
  }

  public void setFindableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
  }

  public ProvidersAdsIdParams findableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
    return this;
  }

  public ProvidersAdsIdParams addFindableUsersItem(String findableUsersItem) {
    if (this.findableUsers == null) {
      this.findableUsers = new ArrayList<String>();
    }
    this.findableUsers.add(findableUsersItem);
    return this;
  }

   /**
   * Sets list of users that can be resolved.
   * @return findableUsers
  **/
  @ApiModelProperty(value = "Sets list of users that can be resolved.")
  public List<String> getFindableUsers() {
    return findableUsers;
  }

  public void setFindableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
  }

  public ProvidersAdsIdParams homeDirectoryTemplate(String homeDirectoryTemplate) {
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

  public ProvidersAdsIdParams ignoreAllTrusts(Boolean ignoreAllTrusts) {
    this.ignoreAllTrusts = ignoreAllTrusts;
    return this;
  }

   /**
   * If set to true, ignores all trusted domains.
   * @return ignoreAllTrusts
  **/
  @ApiModelProperty(value = "If set to true, ignores all trusted domains.")
  public Boolean isIgnoreAllTrusts() {
    return ignoreAllTrusts;
  }

  public void setIgnoreAllTrusts(Boolean ignoreAllTrusts) {
    this.ignoreAllTrusts = ignoreAllTrusts;
  }

  public ProvidersAdsIdParams ignoredTrustedDomains(List<String> ignoredTrustedDomains) {
    this.ignoredTrustedDomains = ignoredTrustedDomains;
    return this;
  }

  public ProvidersAdsIdParams addIgnoredTrustedDomainsItem(String ignoredTrustedDomainsItem) {
    if (this.ignoredTrustedDomains == null) {
      this.ignoredTrustedDomains = new ArrayList<String>();
    }
    this.ignoredTrustedDomains.add(ignoredTrustedDomainsItem);
    return this;
  }

   /**
   * Includes trusted domains when &#39;ignore_all_trusts&#39; is set to false.
   * @return ignoredTrustedDomains
  **/
  @ApiModelProperty(value = "Includes trusted domains when 'ignore_all_trusts' is set to false.")
  public List<String> getIgnoredTrustedDomains() {
    return ignoredTrustedDomains;
  }

  public void setIgnoredTrustedDomains(List<String> ignoredTrustedDomains) {
    this.ignoredTrustedDomains = ignoredTrustedDomains;
  }

  public ProvidersAdsIdParams includeTrustedDomains(List<String> includeTrustedDomains) {
    this.includeTrustedDomains = includeTrustedDomains;
    return this;
  }

  public ProvidersAdsIdParams addIncludeTrustedDomainsItem(String includeTrustedDomainsItem) {
    if (this.includeTrustedDomains == null) {
      this.includeTrustedDomains = new ArrayList<String>();
    }
    this.includeTrustedDomains.add(includeTrustedDomainsItem);
    return this;
  }

   /**
   * Includes trusted domains when &#39;ignore_all_trusts&#39; is set to true.
   * @return includeTrustedDomains
  **/
  @ApiModelProperty(value = "Includes trusted domains when 'ignore_all_trusts' is set to true.")
  public List<String> getIncludeTrustedDomains() {
    return includeTrustedDomains;
  }

  public void setIncludeTrustedDomains(List<String> includeTrustedDomains) {
    this.includeTrustedDomains = includeTrustedDomains;
  }

  public ProvidersAdsIdParams instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Specifies Active Directory provider instance.
   * @return instance
  **/
  @ApiModelProperty(value = "Specifies Active Directory provider instance.")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  public ProvidersAdsIdParams ldapSignAndSeal(Boolean ldapSignAndSeal) {
    this.ldapSignAndSeal = ldapSignAndSeal;
    return this;
  }

   /**
   * Enables encryption and signing on LDAP requests.
   * @return ldapSignAndSeal
  **/
  @ApiModelProperty(value = "Enables encryption and signing on LDAP requests.")
  public Boolean isLdapSignAndSeal() {
    return ldapSignAndSeal;
  }

  public void setLdapSignAndSeal(Boolean ldapSignAndSeal) {
    this.ldapSignAndSeal = ldapSignAndSeal;
  }

  public ProvidersAdsIdParams loginShell(String loginShell) {
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

  public ProvidersAdsIdParams lookupDomains(List<String> lookupDomains) {
    this.lookupDomains = lookupDomains;
    return this;
  }

  public ProvidersAdsIdParams addLookupDomainsItem(String lookupDomainsItem) {
    if (this.lookupDomains == null) {
      this.lookupDomains = new ArrayList<String>();
    }
    this.lookupDomains.add(lookupDomainsItem);
    return this;
  }

   /**
   * Limits user and group lookups to the specified domains.
   * @return lookupDomains
  **/
  @ApiModelProperty(value = "Limits user and group lookups to the specified domains.")
  public List<String> getLookupDomains() {
    return lookupDomains;
  }

  public void setLookupDomains(List<String> lookupDomains) {
    this.lookupDomains = lookupDomains;
  }

  public ProvidersAdsIdParams lookupGroups(Boolean lookupGroups) {
    this.lookupGroups = lookupGroups;
    return this;
  }

   /**
   * Looks up AD groups in other providers before allocating a group ID.
   * @return lookupGroups
  **/
  @ApiModelProperty(value = "Looks up AD groups in other providers before allocating a group ID.")
  public Boolean isLookupGroups() {
    return lookupGroups;
  }

  public void setLookupGroups(Boolean lookupGroups) {
    this.lookupGroups = lookupGroups;
  }

  public ProvidersAdsIdParams lookupNormalizeGroups(Boolean lookupNormalizeGroups) {
    this.lookupNormalizeGroups = lookupNormalizeGroups;
    return this;
  }

   /**
   * Normalizes AD group names to lowercase before look up.
   * @return lookupNormalizeGroups
  **/
  @ApiModelProperty(value = "Normalizes AD group names to lowercase before look up.")
  public Boolean isLookupNormalizeGroups() {
    return lookupNormalizeGroups;
  }

  public void setLookupNormalizeGroups(Boolean lookupNormalizeGroups) {
    this.lookupNormalizeGroups = lookupNormalizeGroups;
  }

  public ProvidersAdsIdParams lookupNormalizeUsers(Boolean lookupNormalizeUsers) {
    this.lookupNormalizeUsers = lookupNormalizeUsers;
    return this;
  }

   /**
   * Normalize AD user names to lowercase before look up.
   * @return lookupNormalizeUsers
  **/
  @ApiModelProperty(value = "Normalize AD user names to lowercase before look up.")
  public Boolean isLookupNormalizeUsers() {
    return lookupNormalizeUsers;
  }

  public void setLookupNormalizeUsers(Boolean lookupNormalizeUsers) {
    this.lookupNormalizeUsers = lookupNormalizeUsers;
  }

  public ProvidersAdsIdParams lookupUsers(Boolean lookupUsers) {
    this.lookupUsers = lookupUsers;
    return this;
  }

   /**
   * Looks up AD users in other providers before allocating a user ID.
   * @return lookupUsers
  **/
  @ApiModelProperty(value = "Looks up AD users in other providers before allocating a user ID.")
  public Boolean isLookupUsers() {
    return lookupUsers;
  }

  public void setLookupUsers(Boolean lookupUsers) {
    this.lookupUsers = lookupUsers;
  }

  public ProvidersAdsIdParams machineName(String machineName) {
    this.machineName = machineName;
    return this;
  }

   /**
   * Specifies name to join AD as.
   * @return machineName
  **/
  @ApiModelProperty(value = "Specifies name to join AD as.")
  public String getMachineName() {
    return machineName;
  }

  public void setMachineName(String machineName) {
    this.machineName = machineName;
  }

  public ProvidersAdsIdParams machinePasswordChanges(Boolean machinePasswordChanges) {
    this.machinePasswordChanges = machinePasswordChanges;
    return this;
  }

   /**
   * Enables periodic changes of the machine password for security.
   * @return machinePasswordChanges
  **/
  @ApiModelProperty(value = "Enables periodic changes of the machine password for security.")
  public Boolean isMachinePasswordChanges() {
    return machinePasswordChanges;
  }

  public void setMachinePasswordChanges(Boolean machinePasswordChanges) {
    this.machinePasswordChanges = machinePasswordChanges;
  }

  public ProvidersAdsIdParams machinePasswordLifespan(Integer machinePasswordLifespan) {
    this.machinePasswordLifespan = machinePasswordLifespan;
    return this;
  }

   /**
   * Sets maximum age of a password in seconds.
   * minimum: 3600
   * maximum: 31536000
   * @return machinePasswordLifespan
  **/
  @ApiModelProperty(value = "Sets maximum age of a password in seconds.")
  public Integer getMachinePasswordLifespan() {
    return machinePasswordLifespan;
  }

  public void setMachinePasswordLifespan(Integer machinePasswordLifespan) {
    this.machinePasswordLifespan = machinePasswordLifespan;
  }

  public ProvidersAdsIdParams nodeDcAffinity(String nodeDcAffinity) {
    this.nodeDcAffinity = nodeDcAffinity;
    return this;
  }

   /**
   * Specifies the domain controller for which the node has affinity.
   * @return nodeDcAffinity
  **/
  @ApiModelProperty(value = "Specifies the domain controller for which the node has affinity.")
  public String getNodeDcAffinity() {
    return nodeDcAffinity;
  }

  public void setNodeDcAffinity(String nodeDcAffinity) {
    this.nodeDcAffinity = nodeDcAffinity;
  }

  public ProvidersAdsIdParams nodeDcAffinityTimeout(Integer nodeDcAffinityTimeout) {
    this.nodeDcAffinityTimeout = nodeDcAffinityTimeout;
    return this;
  }

   /**
   * Specifies the timeout for the domain controller for which the local node has affinity.
   * minimum: 0
   * maximum: 4294967295
   * @return nodeDcAffinityTimeout
  **/
  @ApiModelProperty(value = "Specifies the timeout for the domain controller for which the local node has affinity.")
  public Integer getNodeDcAffinityTimeout() {
    return nodeDcAffinityTimeout;
  }

  public void setNodeDcAffinityTimeout(Integer nodeDcAffinityTimeout) {
    this.nodeDcAffinityTimeout = nodeDcAffinityTimeout;
  }

  public ProvidersAdsIdParams nssEnumeration(Boolean nssEnumeration) {
    this.nssEnumeration = nssEnumeration;
    return this;
  }

   /**
   * Enables the Active Directory provider to respond to &#39;getpwent&#39; and &#39;getgrent&#39; requests.
   * @return nssEnumeration
  **/
  @ApiModelProperty(value = "Enables the Active Directory provider to respond to 'getpwent' and 'getgrent' requests.")
  public Boolean isNssEnumeration() {
    return nssEnumeration;
  }

  public void setNssEnumeration(Boolean nssEnumeration) {
    this.nssEnumeration = nssEnumeration;
  }

  public ProvidersAdsIdParams password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specifies the password used during domain join.
   * @return password
  **/
  @ApiModelProperty(value = "Specifies the password used during domain join.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ProvidersAdsIdParams resetSchannel(Boolean resetSchannel) {
    this.resetSchannel = resetSchannel;
    return this;
  }

   /**
   * Resets the secure channel to the primary domain.
   * @return resetSchannel
  **/
  @ApiModelProperty(value = "Resets the secure channel to the primary domain.")
  public Boolean isResetSchannel() {
    return resetSchannel;
  }

  public void setResetSchannel(Boolean resetSchannel) {
    this.resetSchannel = resetSchannel;
  }

  public ProvidersAdsIdParams restrictFindable(Boolean restrictFindable) {
    this.restrictFindable = restrictFindable;
    return this;
  }

   /**
   * Check the provider for filtered lists of findable and unfindable users and groups.
   * @return restrictFindable
  **/
  @ApiModelProperty(value = "Check the provider for filtered lists of findable and unfindable users and groups.")
  public Boolean isRestrictFindable() {
    return restrictFindable;
  }

  public void setRestrictFindable(Boolean restrictFindable) {
    this.restrictFindable = restrictFindable;
  }

  public ProvidersAdsIdParams sfuSupport(String sfuSupport) {
    this.sfuSupport = sfuSupport;
    return this;
  }

   /**
   * Specifies whether to support RFC 2307 attributes on ADS domain controllers.
   * @return sfuSupport
  **/
  @ApiModelProperty(value = "Specifies whether to support RFC 2307 attributes on ADS domain controllers.")
  public String getSfuSupport() {
    return sfuSupport;
  }

  public void setSfuSupport(String sfuSupport) {
    this.sfuSupport = sfuSupport;
  }

  public ProvidersAdsIdParams spns(List<String> spns) {
    this.spns = spns;
    return this;
  }

  public ProvidersAdsIdParams addSpnsItem(String spnsItem) {
    if (this.spns == null) {
      this.spns = new ArrayList<String>();
    }
    this.spns.add(spnsItem);
    return this;
  }

   /**
   * Currently configured SPNs.
   * @return spns
  **/
  @ApiModelProperty(value = "Currently configured SPNs.")
  public List<String> getSpns() {
    return spns;
  }

  public void setSpns(List<String> spns) {
    this.spns = spns;
  }

  public ProvidersAdsIdParams storeSfuMappings(Boolean storeSfuMappings) {
    this.storeSfuMappings = storeSfuMappings;
    return this;
  }

   /**
   * Stores SFU mappings permanently in the ID mapper.
   * @return storeSfuMappings
  **/
  @ApiModelProperty(value = "Stores SFU mappings permanently in the ID mapper.")
  public Boolean isStoreSfuMappings() {
    return storeSfuMappings;
  }

  public void setStoreSfuMappings(Boolean storeSfuMappings) {
    this.storeSfuMappings = storeSfuMappings;
  }

  public ProvidersAdsIdParams unfindableGroups(List<String> unfindableGroups) {
    this.unfindableGroups = unfindableGroups;
    return this;
  }

  public ProvidersAdsIdParams addUnfindableGroupsItem(String unfindableGroupsItem) {
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

  public ProvidersAdsIdParams unfindableUsers(List<String> unfindableUsers) {
    this.unfindableUsers = unfindableUsers;
    return this;
  }

  public ProvidersAdsIdParams addUnfindableUsersItem(String unfindableUsersItem) {
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

  public ProvidersAdsIdParams user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Specifies the user name that has permission to join a machine to the given domain.
   * @return user
  **/
  @ApiModelProperty(value = "Specifies the user name that has permission to join a machine to the given domain.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvidersAdsIdParams providersAdsIdParams = (ProvidersAdsIdParams) o;
    return Objects.equals(this.allocateGids, providersAdsIdParams.allocateGids) &&
        Objects.equals(this.allocateUids, providersAdsIdParams.allocateUids) &&
        Objects.equals(this.assumeDefaultDomain, providersAdsIdParams.assumeDefaultDomain) &&
        Objects.equals(this.authentication, providersAdsIdParams.authentication) &&
        Objects.equals(this.checkOnlineInterval, providersAdsIdParams.checkOnlineInterval) &&
        Objects.equals(this.controllerTime, providersAdsIdParams.controllerTime) &&
        Objects.equals(this.createHomeDirectory, providersAdsIdParams.createHomeDirectory) &&
        Objects.equals(this.domainController, providersAdsIdParams.domainController) &&
        Objects.equals(this.domainOfflineAlerts, providersAdsIdParams.domainOfflineAlerts) &&
        Objects.equals(this.findableGroups, providersAdsIdParams.findableGroups) &&
        Objects.equals(this.findableUsers, providersAdsIdParams.findableUsers) &&
        Objects.equals(this.homeDirectoryTemplate, providersAdsIdParams.homeDirectoryTemplate) &&
        Objects.equals(this.ignoreAllTrusts, providersAdsIdParams.ignoreAllTrusts) &&
        Objects.equals(this.ignoredTrustedDomains, providersAdsIdParams.ignoredTrustedDomains) &&
        Objects.equals(this.includeTrustedDomains, providersAdsIdParams.includeTrustedDomains) &&
        Objects.equals(this.instance, providersAdsIdParams.instance) &&
        Objects.equals(this.ldapSignAndSeal, providersAdsIdParams.ldapSignAndSeal) &&
        Objects.equals(this.loginShell, providersAdsIdParams.loginShell) &&
        Objects.equals(this.lookupDomains, providersAdsIdParams.lookupDomains) &&
        Objects.equals(this.lookupGroups, providersAdsIdParams.lookupGroups) &&
        Objects.equals(this.lookupNormalizeGroups, providersAdsIdParams.lookupNormalizeGroups) &&
        Objects.equals(this.lookupNormalizeUsers, providersAdsIdParams.lookupNormalizeUsers) &&
        Objects.equals(this.lookupUsers, providersAdsIdParams.lookupUsers) &&
        Objects.equals(this.machineName, providersAdsIdParams.machineName) &&
        Objects.equals(this.machinePasswordChanges, providersAdsIdParams.machinePasswordChanges) &&
        Objects.equals(this.machinePasswordLifespan, providersAdsIdParams.machinePasswordLifespan) &&
        Objects.equals(this.nodeDcAffinity, providersAdsIdParams.nodeDcAffinity) &&
        Objects.equals(this.nodeDcAffinityTimeout, providersAdsIdParams.nodeDcAffinityTimeout) &&
        Objects.equals(this.nssEnumeration, providersAdsIdParams.nssEnumeration) &&
        Objects.equals(this.password, providersAdsIdParams.password) &&
        Objects.equals(this.resetSchannel, providersAdsIdParams.resetSchannel) &&
        Objects.equals(this.restrictFindable, providersAdsIdParams.restrictFindable) &&
        Objects.equals(this.sfuSupport, providersAdsIdParams.sfuSupport) &&
        Objects.equals(this.spns, providersAdsIdParams.spns) &&
        Objects.equals(this.storeSfuMappings, providersAdsIdParams.storeSfuMappings) &&
        Objects.equals(this.unfindableGroups, providersAdsIdParams.unfindableGroups) &&
        Objects.equals(this.unfindableUsers, providersAdsIdParams.unfindableUsers) &&
        Objects.equals(this.user, providersAdsIdParams.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocateGids, allocateUids, assumeDefaultDomain, authentication, checkOnlineInterval, controllerTime, createHomeDirectory, domainController, domainOfflineAlerts, findableGroups, findableUsers, homeDirectoryTemplate, ignoreAllTrusts, ignoredTrustedDomains, includeTrustedDomains, instance, ldapSignAndSeal, loginShell, lookupDomains, lookupGroups, lookupNormalizeGroups, lookupNormalizeUsers, lookupUsers, machineName, machinePasswordChanges, machinePasswordLifespan, nodeDcAffinity, nodeDcAffinityTimeout, nssEnumeration, password, resetSchannel, restrictFindable, sfuSupport, spns, storeSfuMappings, unfindableGroups, unfindableUsers, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersAdsIdParams {\n");
    
    sb.append("    allocateGids: ").append(toIndentedString(allocateGids)).append("\n");
    sb.append("    allocateUids: ").append(toIndentedString(allocateUids)).append("\n");
    sb.append("    assumeDefaultDomain: ").append(toIndentedString(assumeDefaultDomain)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    checkOnlineInterval: ").append(toIndentedString(checkOnlineInterval)).append("\n");
    sb.append("    controllerTime: ").append(toIndentedString(controllerTime)).append("\n");
    sb.append("    createHomeDirectory: ").append(toIndentedString(createHomeDirectory)).append("\n");
    sb.append("    domainController: ").append(toIndentedString(domainController)).append("\n");
    sb.append("    domainOfflineAlerts: ").append(toIndentedString(domainOfflineAlerts)).append("\n");
    sb.append("    findableGroups: ").append(toIndentedString(findableGroups)).append("\n");
    sb.append("    findableUsers: ").append(toIndentedString(findableUsers)).append("\n");
    sb.append("    homeDirectoryTemplate: ").append(toIndentedString(homeDirectoryTemplate)).append("\n");
    sb.append("    ignoreAllTrusts: ").append(toIndentedString(ignoreAllTrusts)).append("\n");
    sb.append("    ignoredTrustedDomains: ").append(toIndentedString(ignoredTrustedDomains)).append("\n");
    sb.append("    includeTrustedDomains: ").append(toIndentedString(includeTrustedDomains)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    ldapSignAndSeal: ").append(toIndentedString(ldapSignAndSeal)).append("\n");
    sb.append("    loginShell: ").append(toIndentedString(loginShell)).append("\n");
    sb.append("    lookupDomains: ").append(toIndentedString(lookupDomains)).append("\n");
    sb.append("    lookupGroups: ").append(toIndentedString(lookupGroups)).append("\n");
    sb.append("    lookupNormalizeGroups: ").append(toIndentedString(lookupNormalizeGroups)).append("\n");
    sb.append("    lookupNormalizeUsers: ").append(toIndentedString(lookupNormalizeUsers)).append("\n");
    sb.append("    lookupUsers: ").append(toIndentedString(lookupUsers)).append("\n");
    sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
    sb.append("    machinePasswordChanges: ").append(toIndentedString(machinePasswordChanges)).append("\n");
    sb.append("    machinePasswordLifespan: ").append(toIndentedString(machinePasswordLifespan)).append("\n");
    sb.append("    nodeDcAffinity: ").append(toIndentedString(nodeDcAffinity)).append("\n");
    sb.append("    nodeDcAffinityTimeout: ").append(toIndentedString(nodeDcAffinityTimeout)).append("\n");
    sb.append("    nssEnumeration: ").append(toIndentedString(nssEnumeration)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resetSchannel: ").append(toIndentedString(resetSchannel)).append("\n");
    sb.append("    restrictFindable: ").append(toIndentedString(restrictFindable)).append("\n");
    sb.append("    sfuSupport: ").append(toIndentedString(sfuSupport)).append("\n");
    sb.append("    spns: ").append(toIndentedString(spns)).append("\n");
    sb.append("    storeSfuMappings: ").append(toIndentedString(storeSfuMappings)).append("\n");
    sb.append("    unfindableGroups: ").append(toIndentedString(unfindableGroups)).append("\n");
    sb.append("    unfindableUsers: ").append(toIndentedString(unfindableUsers)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
