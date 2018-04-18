
# NetworkDnscacheSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacheEntryLimit** | **Integer** | DNS cache entry limit | 
**clusterTimeout** | **Integer** | Timeout value for calls made to other nodes in the cluster | 
**dnsTimeout** | **Integer** | Timeout value for calls made to the dns resolvers | 
**eagerRefresh** | **Integer** | Lead time to refresh cache entries nearing expiration | 
**testpingDelta** | **Integer** | Deltas for checking cbind cluster health | 
**ttlMaxNoerror** | **Integer** | Upper bound on ttl for cache hits | 
**ttlMaxNxdomain** | **Integer** | Upper bound on ttl for nxdomain | 
**ttlMaxOther** | **Integer** | Upper bound on ttl for non-nxdomain failures | 
**ttlMaxServfail** | **Integer** | Upper bound on ttl for server failures | 
**ttlMinNoerror** | **Integer** | Lower bound on ttl for cache hits | 
**ttlMinNxdomain** | **Integer** | Lower bound on ttl for nxdomain | 
**ttlMinOther** | **Integer** | Lower bound on ttl for non-nxdomain failures | 
**ttlMinServfail** | **Integer** | Lower bound on ttl for server failures | 



