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
import io.swagger.client.model.Zone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ZoneCreateParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T09:38:03.973-07:00")
public class ZoneCreateParams {
  @SerializedName("alternate_system_provider")
  private String alternateSystemProvider = null;

  @SerializedName("auth_providers")
  private List<String> authProviders = null;

  @SerializedName("cache_entry_expiry")
  private Integer cacheEntryExpiry = null;

  @SerializedName("create_path")
  private Boolean createPath = null;

  @SerializedName("force_overlap")
  private Boolean forceOverlap = null;

  @SerializedName("home_directory_umask")
  private Integer homeDirectoryUmask = null;

  @SerializedName("ifs_restricted")
  private List<AuthAccessAccessItemFileGroup> ifsRestricted = null;

  @SerializedName("map_untrusted")
  private String mapUntrusted = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("negative_cache_entry_expiry")
  private Integer negativeCacheEntryExpiry = null;

  @SerializedName("netbios_name")
  private String netbiosName = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("skeleton_directory")
  private String skeletonDirectory = null;

  @SerializedName("system_provider")
  private String systemProvider = null;

  @SerializedName("user_mapping_rules")
  private List<String> userMappingRules = null;

  @SerializedName("groupnet")
  private String groupnet = null;

  public ZoneCreateParams alternateSystemProvider(String alternateSystemProvider) {
    this.alternateSystemProvider = alternateSystemProvider;
    return this;
  }

   /**
   * Specifies an alternate system provider.
   * @return alternateSystemProvider
  **/
  @ApiModelProperty(value = "Specifies an alternate system provider.")
  public String getAlternateSystemProvider() {
    return alternateSystemProvider;
  }

  public void setAlternateSystemProvider(String alternateSystemProvider) {
    this.alternateSystemProvider = alternateSystemProvider;
  }

  public ZoneCreateParams authProviders(List<String> authProviders) {
    this.authProviders = authProviders;
    return this;
  }

  public ZoneCreateParams addAuthProvidersItem(String authProvidersItem) {
    if (this.authProviders == null) {
      this.authProviders = new ArrayList<String>();
    }
    this.authProviders.add(authProvidersItem);
    return this;
  }

   /**
   * Specifies the list of authentication providers available on this access zone.
   * @return authProviders
  **/
  @ApiModelProperty(value = "Specifies the list of authentication providers available on this access zone.")
  public List<String> getAuthProviders() {
    return authProviders;
  }

  public void setAuthProviders(List<String> authProviders) {
    this.authProviders = authProviders;
  }

  public ZoneCreateParams cacheEntryExpiry(Integer cacheEntryExpiry) {
    this.cacheEntryExpiry = cacheEntryExpiry;
    return this;
  }

   /**
   * Specifies amount of time in seconds to cache a user/group.
   * @return cacheEntryExpiry
  **/
  @ApiModelProperty(value = "Specifies amount of time in seconds to cache a user/group.")
  public Integer getCacheEntryExpiry() {
    return cacheEntryExpiry;
  }

  public void setCacheEntryExpiry(Integer cacheEntryExpiry) {
    this.cacheEntryExpiry = cacheEntryExpiry;
  }

  public ZoneCreateParams createPath(Boolean createPath) {
    this.createPath = createPath;
    return this;
  }

   /**
   * Determines if a path is created when a path does not exist.
   * @return createPath
  **/
  @ApiModelProperty(value = "Determines if a path is created when a path does not exist.")
  public Boolean isCreatePath() {
    return createPath;
  }

  public void setCreatePath(Boolean createPath) {
    this.createPath = createPath;
  }

  public ZoneCreateParams forceOverlap(Boolean forceOverlap) {
    this.forceOverlap = forceOverlap;
    return this;
  }

   /**
   * Allow for overlapping base path.
   * @return forceOverlap
  **/
  @ApiModelProperty(value = "Allow for overlapping base path.")
  public Boolean isForceOverlap() {
    return forceOverlap;
  }

  public void setForceOverlap(Boolean forceOverlap) {
    this.forceOverlap = forceOverlap;
  }

  public ZoneCreateParams homeDirectoryUmask(Integer homeDirectoryUmask) {
    this.homeDirectoryUmask = homeDirectoryUmask;
    return this;
  }

   /**
   * Specifies the permissions set on automatically created user home directories.
   * @return homeDirectoryUmask
  **/
  @ApiModelProperty(value = "Specifies the permissions set on automatically created user home directories.")
  public Integer getHomeDirectoryUmask() {
    return homeDirectoryUmask;
  }

  public void setHomeDirectoryUmask(Integer homeDirectoryUmask) {
    this.homeDirectoryUmask = homeDirectoryUmask;
  }

  public ZoneCreateParams ifsRestricted(List<AuthAccessAccessItemFileGroup> ifsRestricted) {
    this.ifsRestricted = ifsRestricted;
    return this;
  }

  public ZoneCreateParams addIfsRestrictedItem(AuthAccessAccessItemFileGroup ifsRestrictedItem) {
    if (this.ifsRestricted == null) {
      this.ifsRestricted = new ArrayList<AuthAccessAccessItemFileGroup>();
    }
    this.ifsRestricted.add(ifsRestrictedItem);
    return this;
  }

   /**
   * Specifies a list of users and groups that have read and write access to /ifs.
   * @return ifsRestricted
  **/
  @ApiModelProperty(value = "Specifies a list of users and groups that have read and write access to /ifs.")
  public List<AuthAccessAccessItemFileGroup> getIfsRestricted() {
    return ifsRestricted;
  }

  public void setIfsRestricted(List<AuthAccessAccessItemFileGroup> ifsRestricted) {
    this.ifsRestricted = ifsRestricted;
  }

  public ZoneCreateParams mapUntrusted(String mapUntrusted) {
    this.mapUntrusted = mapUntrusted;
    return this;
  }

   /**
   * Maps untrusted domains to this NetBIOS domain during authentication.
   * @return mapUntrusted
  **/
  @ApiModelProperty(value = "Maps untrusted domains to this NetBIOS domain during authentication.")
  public String getMapUntrusted() {
    return mapUntrusted;
  }

  public void setMapUntrusted(String mapUntrusted) {
    this.mapUntrusted = mapUntrusted;
  }

  public ZoneCreateParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Specifies the access zone name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Specifies the access zone name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZoneCreateParams negativeCacheEntryExpiry(Integer negativeCacheEntryExpiry) {
    this.negativeCacheEntryExpiry = negativeCacheEntryExpiry;
    return this;
  }

   /**
   * Specifies number of seconds the negative cache entry is valid.
   * @return negativeCacheEntryExpiry
  **/
  @ApiModelProperty(value = "Specifies number of seconds the negative cache entry is valid.")
  public Integer getNegativeCacheEntryExpiry() {
    return negativeCacheEntryExpiry;
  }

  public void setNegativeCacheEntryExpiry(Integer negativeCacheEntryExpiry) {
    this.negativeCacheEntryExpiry = negativeCacheEntryExpiry;
  }

  public ZoneCreateParams netbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
    return this;
  }

   /**
   * Specifies the NetBIOS name.
   * @return netbiosName
  **/
  @ApiModelProperty(value = "Specifies the NetBIOS name.")
  public String getNetbiosName() {
    return netbiosName;
  }

  public void setNetbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
  }

  public ZoneCreateParams path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Specifies the access zone base directory path.
   * @return path
  **/
  @ApiModelProperty(value = "Specifies the access zone base directory path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ZoneCreateParams skeletonDirectory(String skeletonDirectory) {
    this.skeletonDirectory = skeletonDirectory;
    return this;
  }

   /**
   * Specifies the skeleton directory that is used for user home directories.
   * @return skeletonDirectory
  **/
  @ApiModelProperty(value = "Specifies the skeleton directory that is used for user home directories.")
  public String getSkeletonDirectory() {
    return skeletonDirectory;
  }

  public void setSkeletonDirectory(String skeletonDirectory) {
    this.skeletonDirectory = skeletonDirectory;
  }

  public ZoneCreateParams systemProvider(String systemProvider) {
    this.systemProvider = systemProvider;
    return this;
  }

   /**
   * Specifies the system provider for the access zone.
   * @return systemProvider
  **/
  @ApiModelProperty(value = "Specifies the system provider for the access zone.")
  public String getSystemProvider() {
    return systemProvider;
  }

  public void setSystemProvider(String systemProvider) {
    this.systemProvider = systemProvider;
  }

  public ZoneCreateParams userMappingRules(List<String> userMappingRules) {
    this.userMappingRules = userMappingRules;
    return this;
  }

  public ZoneCreateParams addUserMappingRulesItem(String userMappingRulesItem) {
    if (this.userMappingRules == null) {
      this.userMappingRules = new ArrayList<String>();
    }
    this.userMappingRules.add(userMappingRulesItem);
    return this;
  }

   /**
   * Specifies the current ID mapping rules.
   * @return userMappingRules
  **/
  @ApiModelProperty(value = "Specifies the current ID mapping rules.")
  public List<String> getUserMappingRules() {
    return userMappingRules;
  }

  public void setUserMappingRules(List<String> userMappingRules) {
    this.userMappingRules = userMappingRules;
  }

  public ZoneCreateParams groupnet(String groupnet) {
    this.groupnet = groupnet;
    return this;
  }

   /**
   * Groupnet identitier
   * @return groupnet
  **/
  @ApiModelProperty(value = "Groupnet identitier")
  public String getGroupnet() {
    return groupnet;
  }

  public void setGroupnet(String groupnet) {
    this.groupnet = groupnet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZoneCreateParams zoneCreateParams = (ZoneCreateParams) o;
    return Objects.equals(this.alternateSystemProvider, zoneCreateParams.alternateSystemProvider) &&
        Objects.equals(this.authProviders, zoneCreateParams.authProviders) &&
        Objects.equals(this.cacheEntryExpiry, zoneCreateParams.cacheEntryExpiry) &&
        Objects.equals(this.createPath, zoneCreateParams.createPath) &&
        Objects.equals(this.forceOverlap, zoneCreateParams.forceOverlap) &&
        Objects.equals(this.homeDirectoryUmask, zoneCreateParams.homeDirectoryUmask) &&
        Objects.equals(this.ifsRestricted, zoneCreateParams.ifsRestricted) &&
        Objects.equals(this.mapUntrusted, zoneCreateParams.mapUntrusted) &&
        Objects.equals(this.name, zoneCreateParams.name) &&
        Objects.equals(this.negativeCacheEntryExpiry, zoneCreateParams.negativeCacheEntryExpiry) &&
        Objects.equals(this.netbiosName, zoneCreateParams.netbiosName) &&
        Objects.equals(this.path, zoneCreateParams.path) &&
        Objects.equals(this.skeletonDirectory, zoneCreateParams.skeletonDirectory) &&
        Objects.equals(this.systemProvider, zoneCreateParams.systemProvider) &&
        Objects.equals(this.userMappingRules, zoneCreateParams.userMappingRules) &&
        Objects.equals(this.groupnet, zoneCreateParams.groupnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateSystemProvider, authProviders, cacheEntryExpiry, createPath, forceOverlap, homeDirectoryUmask, ifsRestricted, mapUntrusted, name, negativeCacheEntryExpiry, netbiosName, path, skeletonDirectory, systemProvider, userMappingRules, groupnet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZoneCreateParams {\n");
    
    sb.append("    alternateSystemProvider: ").append(toIndentedString(alternateSystemProvider)).append("\n");
    sb.append("    authProviders: ").append(toIndentedString(authProviders)).append("\n");
    sb.append("    cacheEntryExpiry: ").append(toIndentedString(cacheEntryExpiry)).append("\n");
    sb.append("    createPath: ").append(toIndentedString(createPath)).append("\n");
    sb.append("    forceOverlap: ").append(toIndentedString(forceOverlap)).append("\n");
    sb.append("    homeDirectoryUmask: ").append(toIndentedString(homeDirectoryUmask)).append("\n");
    sb.append("    ifsRestricted: ").append(toIndentedString(ifsRestricted)).append("\n");
    sb.append("    mapUntrusted: ").append(toIndentedString(mapUntrusted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negativeCacheEntryExpiry: ").append(toIndentedString(negativeCacheEntryExpiry)).append("\n");
    sb.append("    netbiosName: ").append(toIndentedString(netbiosName)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    skeletonDirectory: ").append(toIndentedString(skeletonDirectory)).append("\n");
    sb.append("    systemProvider: ").append(toIndentedString(systemProvider)).append("\n");
    sb.append("    userMappingRules: ").append(toIndentedString(userMappingRules)).append("\n");
    sb.append("    groupnet: ").append(toIndentedString(groupnet)).append("\n");
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

