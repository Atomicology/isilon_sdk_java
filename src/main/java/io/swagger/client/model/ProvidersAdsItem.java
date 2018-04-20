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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T15:41:52.549-07:00")
public class ProvidersAdsItem {
  @SerializedName("account")
  private String account = null;

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

  @SerializedName("dns_domain")
  private String dnsDomain = null;

  @SerializedName("domain_offline_alerts")
  private Boolean domainOfflineAlerts = null;

  @SerializedName("findable_groups")
  private List<String> findableGroups = null;

  @SerializedName("findable_users")
  private List<String> findableUsers = null;

  @SerializedName("groupnet")
  private String groupnet = null;

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

  @SerializedName("kerberos_hdfs_spn")
  private Boolean kerberosHdfsSpn = null;

  @SerializedName("kerberos_nfs_spn")
  private Boolean kerberosNfsSpn = null;

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

  @SerializedName("name")
  private String name = null;

  @SerializedName("node_dc_affinity")
  private String nodeDcAffinity = null;

  @SerializedName("node_dc_affinity_timeout")
  private Integer nodeDcAffinityTimeout = null;

  @SerializedName("nss_enumeration")
  private Boolean nssEnumeration = null;

  @SerializedName("organizational_unit")
  private String organizationalUnit = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("restrict_findable")
  private Boolean restrictFindable = null;

  /**
   * Specifies whether to support RFC 2307 attributes on ADS domain controllers.
   */
  @JsonAdapter(SfuSupportEnum.Adapter.class)
  public enum SfuSupportEnum {
    NONE("none"),
    
    RFC2307("rfc2307");

    private String value;

    SfuSupportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SfuSupportEnum fromValue(String text) {
      for (SfuSupportEnum b : SfuSupportEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SfuSupportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SfuSupportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SfuSupportEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SfuSupportEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sfu_support")
  private SfuSupportEnum sfuSupport = null;

  @SerializedName("store_sfu_mappings")
  private Boolean storeSfuMappings = null;

  @SerializedName("unfindable_groups")
  private List<String> unfindableGroups = null;

  @SerializedName("unfindable_users")
  private List<String> unfindableUsers = null;

  @SerializedName("user")
  private String user = null;

  public ProvidersAdsItem account(String account) {
    this.account = account;
    return this;
  }

   /**
   * Specifies the machine account name when creating a SAM account with Active Directory. The default cluster name is called &#39;default&#39;.
   * @return account
  **/
  @ApiModelProperty(value = "Specifies the machine account name when creating a SAM account with Active Directory. The default cluster name is called 'default'.")
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ProvidersAdsItem allocateGids(Boolean allocateGids) {
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

  public ProvidersAdsItem allocateUids(Boolean allocateUids) {
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

  public ProvidersAdsItem assumeDefaultDomain(Boolean assumeDefaultDomain) {
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

  public ProvidersAdsItem authentication(Boolean authentication) {
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

  public ProvidersAdsItem checkOnlineInterval(Integer checkOnlineInterval) {
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

  public ProvidersAdsItem controllerTime(Integer controllerTime) {
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

  public ProvidersAdsItem createHomeDirectory(Boolean createHomeDirectory) {
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

  public ProvidersAdsItem dnsDomain(String dnsDomain) {
    this.dnsDomain = dnsDomain;
    return this;
  }

   /**
   * Specifies the DNS search domain. Set this parameter if the DNS search domain has a unique name or address.
   * @return dnsDomain
  **/
  @ApiModelProperty(value = "Specifies the DNS search domain. Set this parameter if the DNS search domain has a unique name or address.")
  public String getDnsDomain() {
    return dnsDomain;
  }

  public void setDnsDomain(String dnsDomain) {
    this.dnsDomain = dnsDomain;
  }

  public ProvidersAdsItem domainOfflineAlerts(Boolean domainOfflineAlerts) {
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

  public ProvidersAdsItem findableGroups(List<String> findableGroups) {
    this.findableGroups = findableGroups;
    return this;
  }

  public ProvidersAdsItem addFindableGroupsItem(String findableGroupsItem) {
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

  public ProvidersAdsItem findableUsers(List<String> findableUsers) {
    this.findableUsers = findableUsers;
    return this;
  }

  public ProvidersAdsItem addFindableUsersItem(String findableUsersItem) {
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

  public ProvidersAdsItem groupnet(String groupnet) {
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

  public ProvidersAdsItem homeDirectoryTemplate(String homeDirectoryTemplate) {
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

  public ProvidersAdsItem ignoreAllTrusts(Boolean ignoreAllTrusts) {
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

  public ProvidersAdsItem ignoredTrustedDomains(List<String> ignoredTrustedDomains) {
    this.ignoredTrustedDomains = ignoredTrustedDomains;
    return this;
  }

  public ProvidersAdsItem addIgnoredTrustedDomainsItem(String ignoredTrustedDomainsItem) {
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

  public ProvidersAdsItem includeTrustedDomains(List<String> includeTrustedDomains) {
    this.includeTrustedDomains = includeTrustedDomains;
    return this;
  }

  public ProvidersAdsItem addIncludeTrustedDomainsItem(String includeTrustedDomainsItem) {
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

  public ProvidersAdsItem instance(String instance) {
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

  public ProvidersAdsItem kerberosHdfsSpn(Boolean kerberosHdfsSpn) {
    this.kerberosHdfsSpn = kerberosHdfsSpn;
    return this;
  }

   /**
   * Determines if connecting through HDFS with Kerberos.
   * @return kerberosHdfsSpn
  **/
  @ApiModelProperty(value = "Determines if connecting through HDFS with Kerberos.")
  public Boolean isKerberosHdfsSpn() {
    return kerberosHdfsSpn;
  }

  public void setKerberosHdfsSpn(Boolean kerberosHdfsSpn) {
    this.kerberosHdfsSpn = kerberosHdfsSpn;
  }

  public ProvidersAdsItem kerberosNfsSpn(Boolean kerberosNfsSpn) {
    this.kerberosNfsSpn = kerberosNfsSpn;
    return this;
  }

   /**
   * Determines if connecting through NFS with Kerberos.
   * @return kerberosNfsSpn
  **/
  @ApiModelProperty(value = "Determines if connecting through NFS with Kerberos.")
  public Boolean isKerberosNfsSpn() {
    return kerberosNfsSpn;
  }

  public void setKerberosNfsSpn(Boolean kerberosNfsSpn) {
    this.kerberosNfsSpn = kerberosNfsSpn;
  }

  public ProvidersAdsItem ldapSignAndSeal(Boolean ldapSignAndSeal) {
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

  public ProvidersAdsItem loginShell(String loginShell) {
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

  public ProvidersAdsItem lookupDomains(List<String> lookupDomains) {
    this.lookupDomains = lookupDomains;
    return this;
  }

  public ProvidersAdsItem addLookupDomainsItem(String lookupDomainsItem) {
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

  public ProvidersAdsItem lookupGroups(Boolean lookupGroups) {
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

  public ProvidersAdsItem lookupNormalizeGroups(Boolean lookupNormalizeGroups) {
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

  public ProvidersAdsItem lookupNormalizeUsers(Boolean lookupNormalizeUsers) {
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

  public ProvidersAdsItem lookupUsers(Boolean lookupUsers) {
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

  public ProvidersAdsItem machineName(String machineName) {
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

  public ProvidersAdsItem machinePasswordChanges(Boolean machinePasswordChanges) {
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

  public ProvidersAdsItem machinePasswordLifespan(Integer machinePasswordLifespan) {
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

  public ProvidersAdsItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the Active Directory provider name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies the Active Directory provider name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProvidersAdsItem nodeDcAffinity(String nodeDcAffinity) {
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

  public ProvidersAdsItem nodeDcAffinityTimeout(Integer nodeDcAffinityTimeout) {
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

  public ProvidersAdsItem nssEnumeration(Boolean nssEnumeration) {
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

  public ProvidersAdsItem organizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
    return this;
  }

   /**
   * Specifies the organizational unit.
   * @return organizationalUnit
  **/
  @ApiModelProperty(value = "Specifies the organizational unit.")
  public String getOrganizationalUnit() {
    return organizationalUnit;
  }

  public void setOrganizationalUnit(String organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
  }

  public ProvidersAdsItem password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Specifies the password used during domain join.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Specifies the password used during domain join.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ProvidersAdsItem restrictFindable(Boolean restrictFindable) {
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

  public ProvidersAdsItem sfuSupport(SfuSupportEnum sfuSupport) {
    this.sfuSupport = sfuSupport;
    return this;
  }

   /**
   * Specifies whether to support RFC 2307 attributes on ADS domain controllers.
   * @return sfuSupport
  **/
  @ApiModelProperty(value = "Specifies whether to support RFC 2307 attributes on ADS domain controllers.")
  public SfuSupportEnum getSfuSupport() {
    return sfuSupport;
  }

  public void setSfuSupport(SfuSupportEnum sfuSupport) {
    this.sfuSupport = sfuSupport;
  }

  public ProvidersAdsItem storeSfuMappings(Boolean storeSfuMappings) {
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

  public ProvidersAdsItem unfindableGroups(List<String> unfindableGroups) {
    this.unfindableGroups = unfindableGroups;
    return this;
  }

  public ProvidersAdsItem addUnfindableGroupsItem(String unfindableGroupsItem) {
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

  public ProvidersAdsItem unfindableUsers(List<String> unfindableUsers) {
    this.unfindableUsers = unfindableUsers;
    return this;
  }

  public ProvidersAdsItem addUnfindableUsersItem(String unfindableUsersItem) {
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

  public ProvidersAdsItem user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Specifies the user name that has permission to join a machine to the given domain.
   * @return user
  **/
  @ApiModelProperty(required = true, value = "Specifies the user name that has permission to join a machine to the given domain.")
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
    ProvidersAdsItem providersAdsItem = (ProvidersAdsItem) o;
    return Objects.equals(this.account, providersAdsItem.account) &&
        Objects.equals(this.allocateGids, providersAdsItem.allocateGids) &&
        Objects.equals(this.allocateUids, providersAdsItem.allocateUids) &&
        Objects.equals(this.assumeDefaultDomain, providersAdsItem.assumeDefaultDomain) &&
        Objects.equals(this.authentication, providersAdsItem.authentication) &&
        Objects.equals(this.checkOnlineInterval, providersAdsItem.checkOnlineInterval) &&
        Objects.equals(this.controllerTime, providersAdsItem.controllerTime) &&
        Objects.equals(this.createHomeDirectory, providersAdsItem.createHomeDirectory) &&
        Objects.equals(this.dnsDomain, providersAdsItem.dnsDomain) &&
        Objects.equals(this.domainOfflineAlerts, providersAdsItem.domainOfflineAlerts) &&
        Objects.equals(this.findableGroups, providersAdsItem.findableGroups) &&
        Objects.equals(this.findableUsers, providersAdsItem.findableUsers) &&
        Objects.equals(this.groupnet, providersAdsItem.groupnet) &&
        Objects.equals(this.homeDirectoryTemplate, providersAdsItem.homeDirectoryTemplate) &&
        Objects.equals(this.ignoreAllTrusts, providersAdsItem.ignoreAllTrusts) &&
        Objects.equals(this.ignoredTrustedDomains, providersAdsItem.ignoredTrustedDomains) &&
        Objects.equals(this.includeTrustedDomains, providersAdsItem.includeTrustedDomains) &&
        Objects.equals(this.instance, providersAdsItem.instance) &&
        Objects.equals(this.kerberosHdfsSpn, providersAdsItem.kerberosHdfsSpn) &&
        Objects.equals(this.kerberosNfsSpn, providersAdsItem.kerberosNfsSpn) &&
        Objects.equals(this.ldapSignAndSeal, providersAdsItem.ldapSignAndSeal) &&
        Objects.equals(this.loginShell, providersAdsItem.loginShell) &&
        Objects.equals(this.lookupDomains, providersAdsItem.lookupDomains) &&
        Objects.equals(this.lookupGroups, providersAdsItem.lookupGroups) &&
        Objects.equals(this.lookupNormalizeGroups, providersAdsItem.lookupNormalizeGroups) &&
        Objects.equals(this.lookupNormalizeUsers, providersAdsItem.lookupNormalizeUsers) &&
        Objects.equals(this.lookupUsers, providersAdsItem.lookupUsers) &&
        Objects.equals(this.machineName, providersAdsItem.machineName) &&
        Objects.equals(this.machinePasswordChanges, providersAdsItem.machinePasswordChanges) &&
        Objects.equals(this.machinePasswordLifespan, providersAdsItem.machinePasswordLifespan) &&
        Objects.equals(this.name, providersAdsItem.name) &&
        Objects.equals(this.nodeDcAffinity, providersAdsItem.nodeDcAffinity) &&
        Objects.equals(this.nodeDcAffinityTimeout, providersAdsItem.nodeDcAffinityTimeout) &&
        Objects.equals(this.nssEnumeration, providersAdsItem.nssEnumeration) &&
        Objects.equals(this.organizationalUnit, providersAdsItem.organizationalUnit) &&
        Objects.equals(this.password, providersAdsItem.password) &&
        Objects.equals(this.restrictFindable, providersAdsItem.restrictFindable) &&
        Objects.equals(this.sfuSupport, providersAdsItem.sfuSupport) &&
        Objects.equals(this.storeSfuMappings, providersAdsItem.storeSfuMappings) &&
        Objects.equals(this.unfindableGroups, providersAdsItem.unfindableGroups) &&
        Objects.equals(this.unfindableUsers, providersAdsItem.unfindableUsers) &&
        Objects.equals(this.user, providersAdsItem.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, allocateGids, allocateUids, assumeDefaultDomain, authentication, checkOnlineInterval, controllerTime, createHomeDirectory, dnsDomain, domainOfflineAlerts, findableGroups, findableUsers, groupnet, homeDirectoryTemplate, ignoreAllTrusts, ignoredTrustedDomains, includeTrustedDomains, instance, kerberosHdfsSpn, kerberosNfsSpn, ldapSignAndSeal, loginShell, lookupDomains, lookupGroups, lookupNormalizeGroups, lookupNormalizeUsers, lookupUsers, machineName, machinePasswordChanges, machinePasswordLifespan, name, nodeDcAffinity, nodeDcAffinityTimeout, nssEnumeration, organizationalUnit, password, restrictFindable, sfuSupport, storeSfuMappings, unfindableGroups, unfindableUsers, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvidersAdsItem {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    allocateGids: ").append(toIndentedString(allocateGids)).append("\n");
    sb.append("    allocateUids: ").append(toIndentedString(allocateUids)).append("\n");
    sb.append("    assumeDefaultDomain: ").append(toIndentedString(assumeDefaultDomain)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    checkOnlineInterval: ").append(toIndentedString(checkOnlineInterval)).append("\n");
    sb.append("    controllerTime: ").append(toIndentedString(controllerTime)).append("\n");
    sb.append("    createHomeDirectory: ").append(toIndentedString(createHomeDirectory)).append("\n");
    sb.append("    dnsDomain: ").append(toIndentedString(dnsDomain)).append("\n");
    sb.append("    domainOfflineAlerts: ").append(toIndentedString(domainOfflineAlerts)).append("\n");
    sb.append("    findableGroups: ").append(toIndentedString(findableGroups)).append("\n");
    sb.append("    findableUsers: ").append(toIndentedString(findableUsers)).append("\n");
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
    sb.append("    homeDirectoryTemplate: ").append(toIndentedString(homeDirectoryTemplate)).append("\n");
    sb.append("    ignoreAllTrusts: ").append(toIndentedString(ignoreAllTrusts)).append("\n");
    sb.append("    ignoredTrustedDomains: ").append(toIndentedString(ignoredTrustedDomains)).append("\n");
    sb.append("    includeTrustedDomains: ").append(toIndentedString(includeTrustedDomains)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    kerberosHdfsSpn: ").append(toIndentedString(kerberosHdfsSpn)).append("\n");
    sb.append("    kerberosNfsSpn: ").append(toIndentedString(kerberosNfsSpn)).append("\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeDcAffinity: ").append(toIndentedString(nodeDcAffinity)).append("\n");
    sb.append("    nodeDcAffinityTimeout: ").append(toIndentedString(nodeDcAffinityTimeout)).append("\n");
    sb.append("    nssEnumeration: ").append(toIndentedString(nssEnumeration)).append("\n");
    sb.append("    organizationalUnit: ").append(toIndentedString(organizationalUnit)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    restrictFindable: ").append(toIndentedString(restrictFindable)).append("\n");
    sb.append("    sfuSupport: ").append(toIndentedString(sfuSupport)).append("\n");
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

