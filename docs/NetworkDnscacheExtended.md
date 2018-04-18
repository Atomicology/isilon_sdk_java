
# NetworkDnscacheExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacheEntryLimit** | **Integer** | DNS cache entry limit |  [optional]
**clusterTimeout** | **Integer** | Timeout value for calls made to other nodes in the cluster |  [optional]
**dnsTimeout** | **Integer** | Timeout value for calls made to the dns resolvers |  [optional]
**eagerRefresh** | **Integer** | Lead time to refresh cache entries nearing expiration |  [optional]
**testpingDelta** | **Integer** | Deltas for checking cbind cluster health |  [optional]
**ttlMaxNoerror** | **Integer** | Upper bound on ttl for cache hits |  [optional]
**ttlMaxNxdomain** | **Integer** | Upper bound on ttl for nxdomain |  [optional]
**ttlMaxOther** | **Integer** | Upper bound on ttl for non-nxdomain failures |  [optional]
**ttlMaxServfail** | **Integer** | Upper bound on ttl for server failures |  [optional]
**ttlMinNoerror** | **Integer** | Lower bound on ttl for cache hits |  [optional]
**ttlMinNxdomain** | **Integer** | Lower bound on ttl for nxdomain |  [optional]
**ttlMinOther** | **Integer** | Lower bound on ttl for non-nxdomain failures |  [optional]
**ttlMinServfail** | **Integer** | Lower bound on ttl for server failures |  [optional]



