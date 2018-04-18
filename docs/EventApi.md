# EventApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventAlertCondition**](EventApi.md#createEventAlertCondition) | **POST** /platform/4/event/alert-conditions | 
[**createEventChannel**](EventApi.md#createEventChannel) | **POST** /platform/3/event/channels | 
[**createEventEvent**](EventApi.md#createEventEvent) | **POST** /platform/3/event/events | 
[**deleteEventAlertCondition**](EventApi.md#deleteEventAlertCondition) | **DELETE** /platform/4/event/alert-conditions/{EventAlertConditionId} | 
[**deleteEventAlertConditions**](EventApi.md#deleteEventAlertConditions) | **DELETE** /platform/4/event/alert-conditions | 
[**deleteEventChannel**](EventApi.md#deleteEventChannel) | **DELETE** /platform/3/event/channels/{EventChannelId} | 
[**getEventAlertCondition**](EventApi.md#getEventAlertCondition) | **GET** /platform/4/event/alert-conditions/{EventAlertConditionId} | 
[**getEventCategories**](EventApi.md#getEventCategories) | **GET** /platform/3/event/categories | 
[**getEventCategory**](EventApi.md#getEventCategory) | **GET** /platform/3/event/categories/{EventCategoryId} | 
[**getEventChannel**](EventApi.md#getEventChannel) | **GET** /platform/3/event/channels/{EventChannelId} | 
[**getEventEventgroupDefinition**](EventApi.md#getEventEventgroupDefinition) | **GET** /platform/4/event/eventgroup-definitions/{EventEventgroupDefinitionId} | 
[**getEventEventgroupDefinitions**](EventApi.md#getEventEventgroupDefinitions) | **GET** /platform/4/event/eventgroup-definitions | 
[**getEventEventgroupOccurrence**](EventApi.md#getEventEventgroupOccurrence) | **GET** /platform/3/event/eventgroup-occurrences/{EventEventgroupOccurrenceId} | 
[**getEventEventgroupOccurrences**](EventApi.md#getEventEventgroupOccurrences) | **GET** /platform/3/event/eventgroup-occurrences | 
[**getEventEventlist**](EventApi.md#getEventEventlist) | **GET** /platform/3/event/eventlists/{EventEventlistId} | 
[**getEventEventlists**](EventApi.md#getEventEventlists) | **GET** /platform/3/event/eventlists | 
[**getEventSettings**](EventApi.md#getEventSettings) | **GET** /platform/3/event/settings | 
[**listEventAlertConditions**](EventApi.md#listEventAlertConditions) | **GET** /platform/4/event/alert-conditions | 
[**listEventChannels**](EventApi.md#listEventChannels) | **GET** /platform/3/event/channels | 
[**updateEventAlertCondition**](EventApi.md#updateEventAlertCondition) | **PUT** /platform/4/event/alert-conditions/{EventAlertConditionId} | 
[**updateEventChannel**](EventApi.md#updateEventChannel) | **PUT** /platform/3/event/channels/{EventChannelId} | 
[**updateEventEventgroupOccurrence**](EventApi.md#updateEventEventgroupOccurrence) | **PUT** /platform/3/event/eventgroup-occurrences/{EventEventgroupOccurrenceId} | 
[**updateEventEventgroupOccurrences**](EventApi.md#updateEventEventgroupOccurrences) | **PUT** /platform/3/event/eventgroup-occurrences | 
[**updateEventSettings**](EventApi.md#updateEventSettings) | **PUT** /platform/3/event/settings | 


<a name="createEventAlertCondition"></a>
# **createEventAlertCondition**
> CreateResponse createEventAlertCondition(eventAlertCondition)



Create a new alert condition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventAlertConditionCreateParams eventAlertCondition = new EventAlertConditionCreateParams(); // EventAlertConditionCreateParams | 
try {
    CreateResponse result = apiInstance.createEventAlertCondition(eventAlertCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#createEventAlertCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlertCondition** | [**EventAlertConditionCreateParams**](EventAlertConditionCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEventChannel"></a>
# **createEventChannel**
> CreateResponse createEventChannel(eventChannel)



Create a new channel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventChannelCreateParams eventChannel = new EventChannelCreateParams(); // EventChannelCreateParams | 
try {
    CreateResponse result = apiInstance.createEventChannel(eventChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#createEventChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventChannel** | [**EventChannelCreateParams**](EventChannelCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEventEvent"></a>
# **createEventEvent**
> CreateQuotaReportResponse createEventEvent(eventEvent)



Create a test event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventEvent eventEvent = new EventEvent(); // EventEvent | 
try {
    CreateQuotaReportResponse result = apiInstance.createEventEvent(eventEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#createEventEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEvent** | [**EventEvent**](EventEvent.md)|  |

### Return type

[**CreateQuotaReportResponse**](CreateQuotaReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEventAlertCondition"></a>
# **deleteEventAlertCondition**
> deleteEventAlertCondition(eventAlertConditionId)



Delete the alert-condition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventAlertConditionId = "eventAlertConditionId_example"; // String | Delete the alert-condition.
try {
    apiInstance.deleteEventAlertCondition(eventAlertConditionId);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#deleteEventAlertCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlertConditionId** | **String**| Delete the alert-condition. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEventAlertConditions"></a>
# **deleteEventAlertConditions**
> deleteEventAlertConditions(channel)



Bulk delete of alert conditions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String channel = "channel_example"; // String | Delete only conditions for this channel
try {
    apiInstance.deleteEventAlertConditions(channel);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#deleteEventAlertConditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| Delete only conditions for this channel | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEventChannel"></a>
# **deleteEventChannel**
> deleteEventChannel(eventChannelId)



Delete the channel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventChannelId = "eventChannelId_example"; // String | Delete the channel.
try {
    apiInstance.deleteEventChannel(eventChannelId);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#deleteEventChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventChannelId** | **String**| Delete the channel. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventAlertCondition"></a>
# **getEventAlertCondition**
> EventAlertConditions getEventAlertCondition(eventAlertConditionId)



Retrieve the alert-condition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventAlertConditionId = "eventAlertConditionId_example"; // String | Retrieve the alert-condition.
try {
    EventAlertConditions result = apiInstance.getEventAlertCondition(eventAlertConditionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventAlertCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlertConditionId** | **String**| Retrieve the alert-condition. |

### Return type

[**EventAlertConditions**](EventAlertConditions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventCategories"></a>
# **getEventCategories**
> EventCategoriesExtended getEventCategories(limit, resume)



List all eventgroup categories.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    EventCategoriesExtended result = apiInstance.getEventCategories(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**EventCategoriesExtended**](EventCategoriesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventCategory"></a>
# **getEventCategory**
> EventCategories getEventCategory(eventCategoryId)



Retrieve the eventgroup category.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventCategoryId = "eventCategoryId_example"; // String | Retrieve the eventgroup category.
try {
    EventCategories result = apiInstance.getEventCategory(eventCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventCategoryId** | **String**| Retrieve the eventgroup category. |

### Return type

[**EventCategories**](EventCategories.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventChannel"></a>
# **getEventChannel**
> EventChannels getEventChannel(eventChannelId)



Retrieve the channel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventChannelId = "eventChannelId_example"; // String | Retrieve the channel.
try {
    EventChannels result = apiInstance.getEventChannel(eventChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventChannelId** | **String**| Retrieve the channel. |

### Return type

[**EventChannels**](EventChannels.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventgroupDefinition"></a>
# **getEventEventgroupDefinition**
> EventEventgroupDefinitions getEventEventgroupDefinition(eventEventgroupDefinitionId)



Retrieve the eventgroup definition.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventEventgroupDefinitionId = "eventEventgroupDefinitionId_example"; // String | Retrieve the eventgroup definition.
try {
    EventEventgroupDefinitions result = apiInstance.getEventEventgroupDefinition(eventEventgroupDefinitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventgroupDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEventgroupDefinitionId** | **String**| Retrieve the eventgroup definition. |

### Return type

[**EventEventgroupDefinitions**](EventEventgroupDefinitions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventgroupDefinitions"></a>
# **getEventEventgroupDefinitions**
> EventEventgroupDefinitionsExtended getEventEventgroupDefinitions(category, limit, resume)



List all eventgroup definitions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
Integer category = 56; // Integer | Return eventgroups in the specified category
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    EventEventgroupDefinitionsExtended result = apiInstance.getEventEventgroupDefinitions(category, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventgroupDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **Integer**| Return eventgroups in the specified category | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**EventEventgroupDefinitionsExtended**](EventEventgroupDefinitionsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventgroupOccurrence"></a>
# **getEventEventgroupOccurrence**
> EventEventgroupOccurrences getEventEventgroupOccurrence(eventEventgroupOccurrenceId)



Retrieve individual eventgroup occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventEventgroupOccurrenceId = "eventEventgroupOccurrenceId_example"; // String | Retrieve individual eventgroup occurrence.
try {
    EventEventgroupOccurrences result = apiInstance.getEventEventgroupOccurrence(eventEventgroupOccurrenceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventgroupOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEventgroupOccurrenceId** | **String**| Retrieve individual eventgroup occurrence. |

### Return type

[**EventEventgroupOccurrences**](EventEventgroupOccurrences.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventgroupOccurrences"></a>
# **getEventEventgroupOccurrences**
> EventEventgroupOccurrencesExtended getEventEventgroupOccurrences(resolved, sort, begin, end, eventCount, resume, ignore, limit, resolver, cause, dir)



List all eventgroup occurrences.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
Boolean resolved = true; // Boolean | Filter for resolved eventgroups
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer begin = 56; // Integer | events that are in progress after this time
Integer end = 56; // Integer | events that were in progress before this time
Integer eventCount = 56; // Integer | events for which event_count > this
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean ignore = true; // Boolean | Filter for ignored eventgroups
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resolver = "resolver_example"; // String | Filter for eventgroup resolver
String cause = "cause_example"; // String | Filter for cause
String dir = "dir_example"; // String | The direction of the sort.
try {
    EventEventgroupOccurrencesExtended result = apiInstance.getEventEventgroupOccurrences(resolved, sort, begin, end, eventCount, resume, ignore, limit, resolver, cause, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventgroupOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resolved** | **Boolean**| Filter for resolved eventgroups | [optional]
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **begin** | **Integer**| events that are in progress after this time | [optional]
 **end** | **Integer**| events that were in progress before this time | [optional]
 **eventCount** | **Integer**| events for which event_count &gt; this | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **ignore** | **Boolean**| Filter for ignored eventgroups | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resolver** | **String**| Filter for eventgroup resolver | [optional]
 **cause** | **String**| Filter for cause | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**EventEventgroupOccurrencesExtended**](EventEventgroupOccurrencesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventlist"></a>
# **getEventEventlist**
> EventEventlists getEventEventlist(eventEventlistId)



Retrieve the list of events for a eventgroup occureence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventEventlistId = "eventEventlistId_example"; // String | Retrieve the list of events for a eventgroup occureence.
try {
    EventEventlists result = apiInstance.getEventEventlist(eventEventlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventlist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEventlistId** | **String**| Retrieve the list of events for a eventgroup occureence. |

### Return type

[**EventEventlists**](EventEventlists.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventEventlists"></a>
# **getEventEventlists**
> EventEventlistsExtended getEventEventlists(eventInstance, limit, resume)



List all event occurrences grouped by eventgroup occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String eventInstance = "eventInstance_example"; // String | Return only this event occurrence
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    EventEventlistsExtended result = apiInstance.getEventEventlists(eventInstance, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventEventlists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventInstance** | **String**| Return only this event occurrence | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**EventEventlistsExtended**](EventEventlistsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEventSettings"></a>
# **getEventSettings**
> EventSettings getEventSettings()



Retrieve the settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
try {
    EventSettings result = apiInstance.getEventSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#getEventSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EventSettings**](EventSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listEventAlertConditions"></a>
# **listEventAlertConditions**
> EventAlertConditionsExtended listEventAlertConditions(channels, sort, limit, dir, resume)



List all alert conditions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String channels = "channels_example"; // String | Return only conditions for the specified channel:
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    EventAlertConditionsExtended result = apiInstance.listEventAlertConditions(channels, sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#listEventAlertConditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channels** | **String**| Return only conditions for the specified channel: | [optional]
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**EventAlertConditionsExtended**](EventAlertConditionsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listEventChannels"></a>
# **listEventChannels**
> EventChannelsExtended listEventChannels(sort, limit, dir, resume)



List all channels.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    EventChannelsExtended result = apiInstance.listEventChannels(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#listEventChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**EventChannelsExtended**](EventChannelsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventAlertCondition"></a>
# **updateEventAlertCondition**
> updateEventAlertCondition(eventAlertCondition, eventAlertConditionId)



Modify the alert-condition

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventAlertCondition eventAlertCondition = new EventAlertCondition(); // EventAlertCondition | 
String eventAlertConditionId = "eventAlertConditionId_example"; // String | Modify the alert-condition
try {
    apiInstance.updateEventAlertCondition(eventAlertCondition, eventAlertConditionId);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#updateEventAlertCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlertCondition** | [**EventAlertCondition**](EventAlertCondition.md)|  |
 **eventAlertConditionId** | **String**| Modify the alert-condition |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventChannel"></a>
# **updateEventChannel**
> updateEventChannel(eventChannel, eventChannelId)



Modify the channel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventChannel eventChannel = new EventChannel(); // EventChannel | 
String eventChannelId = "eventChannelId_example"; // String | Modify the channel.
try {
    apiInstance.updateEventChannel(eventChannel, eventChannelId);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#updateEventChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventChannel** | [**EventChannel**](EventChannel.md)|  |
 **eventChannelId** | **String**| Modify the channel. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventEventgroupOccurrence"></a>
# **updateEventEventgroupOccurrence**
> updateEventEventgroupOccurrence(eventEventgroupOccurrence, eventEventgroupOccurrenceId)



modify eventgroup occurrence.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventEventgroupOccurrence eventEventgroupOccurrence = new EventEventgroupOccurrence(); // EventEventgroupOccurrence | 
String eventEventgroupOccurrenceId = "eventEventgroupOccurrenceId_example"; // String | modify eventgroup occurrence.
try {
    apiInstance.updateEventEventgroupOccurrence(eventEventgroupOccurrence, eventEventgroupOccurrenceId);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#updateEventEventgroupOccurrence");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEventgroupOccurrence** | [**EventEventgroupOccurrence**](EventEventgroupOccurrence.md)|  |
 **eventEventgroupOccurrenceId** | **String**| modify eventgroup occurrence. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventEventgroupOccurrences"></a>
# **updateEventEventgroupOccurrences**
> updateEventEventgroupOccurrences(eventEventgroupOccurrences)



Modify all eventgroup occurrences, resolve or ignore all

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventEventgroupOccurrence eventEventgroupOccurrences = new EventEventgroupOccurrence(); // EventEventgroupOccurrence | 
try {
    apiInstance.updateEventEventgroupOccurrences(eventEventgroupOccurrences);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#updateEventEventgroupOccurrences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventEventgroupOccurrences** | [**EventEventgroupOccurrence**](EventEventgroupOccurrence.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEventSettings"></a>
# **updateEventSettings**
> updateEventSettings(eventSettings)



Update settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventApi apiInstance = new EventApi();
EventSettings eventSettings = new EventSettings(); // EventSettings | 
try {
    apiInstance.updateEventSettings(eventSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#updateEventSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventSettings** | [**EventSettings**](EventSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

