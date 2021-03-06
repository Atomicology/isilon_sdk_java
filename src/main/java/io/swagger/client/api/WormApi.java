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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Error;
import io.swagger.client.model.WormDomain;
import io.swagger.client.model.WormDomainCreateParams;
import io.swagger.client.model.WormDomainExtended;
import io.swagger.client.model.WormDomains;
import io.swagger.client.model.WormDomainsExtended;
import io.swagger.client.model.WormSettings;
import io.swagger.client.model.WormSettingsExtended;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WormApi {
    private ApiClient apiClient;

    public WormApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WormApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createWormDomain
     * @param wormDomain  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createWormDomainCall(WormDomainCreateParams wormDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = wormDomain;

        // create path and map variables
        String localVarPath = "/platform/1/worm/domains";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createWormDomainValidateBeforeCall(WormDomainCreateParams wormDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'wormDomain' is set
        if (wormDomain == null) {
            throw new ApiException("Missing the required parameter 'wormDomain' when calling createWormDomain(Async)");
        }
        

        com.squareup.okhttp.Call call = createWormDomainCall(wormDomain, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Create a WORM domain.
     * @param wormDomain  (required)
     * @return WormDomainExtended
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WormDomainExtended createWormDomain(WormDomainCreateParams wormDomain) throws ApiException {
        ApiResponse<WormDomainExtended> resp = createWormDomainWithHttpInfo(wormDomain);
        return resp.getData();
    }

    /**
     * 
     * Create a WORM domain.
     * @param wormDomain  (required)
     * @return ApiResponse&lt;WormDomainExtended&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WormDomainExtended> createWormDomainWithHttpInfo(WormDomainCreateParams wormDomain) throws ApiException {
        com.squareup.okhttp.Call call = createWormDomainValidateBeforeCall(wormDomain, null, null);
        Type localVarReturnType = new TypeToken<WormDomainExtended>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a WORM domain.
     * @param wormDomain  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createWormDomainAsync(WormDomainCreateParams wormDomain, final ApiCallback<WormDomainExtended> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createWormDomainValidateBeforeCall(wormDomain, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WormDomainExtended>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWormDomain
     * @param wormDomainId View a single WORM domain. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWormDomainCall(String wormDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/worm/domains/{WormDomainId}"
            .replaceAll("\\{" + "WormDomainId" + "\\}", apiClient.escapeString(wormDomainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWormDomainValidateBeforeCall(String wormDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'wormDomainId' is set
        if (wormDomainId == null) {
            throw new ApiException("Missing the required parameter 'wormDomainId' when calling getWormDomain(Async)");
        }
        

        com.squareup.okhttp.Call call = getWormDomainCall(wormDomainId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * View a single WORM domain.
     * @param wormDomainId View a single WORM domain. (required)
     * @return WormDomains
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WormDomains getWormDomain(String wormDomainId) throws ApiException {
        ApiResponse<WormDomains> resp = getWormDomainWithHttpInfo(wormDomainId);
        return resp.getData();
    }

    /**
     * 
     * View a single WORM domain.
     * @param wormDomainId View a single WORM domain. (required)
     * @return ApiResponse&lt;WormDomains&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WormDomains> getWormDomainWithHttpInfo(String wormDomainId) throws ApiException {
        com.squareup.okhttp.Call call = getWormDomainValidateBeforeCall(wormDomainId, null, null);
        Type localVarReturnType = new TypeToken<WormDomains>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * View a single WORM domain.
     * @param wormDomainId View a single WORM domain. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWormDomainAsync(String wormDomainId, final ApiCallback<WormDomains> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWormDomainValidateBeforeCall(wormDomainId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WormDomains>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWormSettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWormSettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/worm/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWormSettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getWormSettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Get the global WORM settings.
     * @return WormSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WormSettings getWormSettings() throws ApiException {
        ApiResponse<WormSettings> resp = getWormSettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Get the global WORM settings.
     * @return ApiResponse&lt;WormSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WormSettings> getWormSettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getWormSettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<WormSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the global WORM settings.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWormSettingsAsync(final ApiCallback<WormSettings> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWormSettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WormSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listWormDomains
     * @param sort The field that will be used for sorting. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listWormDomainsCall(String sort, Integer limit, String dir, String resume, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/worm/domains";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (dir != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dir", dir));
        if (resume != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resume", resume));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listWormDomainsValidateBeforeCall(String sort, Integer limit, String dir, String resume, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listWormDomainsCall(sort, limit, dir, resume, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * List all WORM domains.
     * @param sort The field that will be used for sorting. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @return WormDomainsExtended
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WormDomainsExtended listWormDomains(String sort, Integer limit, String dir, String resume) throws ApiException {
        ApiResponse<WormDomainsExtended> resp = listWormDomainsWithHttpInfo(sort, limit, dir, resume);
        return resp.getData();
    }

    /**
     * 
     * List all WORM domains.
     * @param sort The field that will be used for sorting. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @return ApiResponse&lt;WormDomainsExtended&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WormDomainsExtended> listWormDomainsWithHttpInfo(String sort, Integer limit, String dir, String resume) throws ApiException {
        com.squareup.okhttp.Call call = listWormDomainsValidateBeforeCall(sort, limit, dir, resume, null, null);
        Type localVarReturnType = new TypeToken<WormDomainsExtended>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all WORM domains.
     * @param sort The field that will be used for sorting. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listWormDomainsAsync(String sort, Integer limit, String dir, String resume, final ApiCallback<WormDomainsExtended> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listWormDomainsValidateBeforeCall(sort, limit, dir, resume, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WormDomainsExtended>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateWormDomain
     * @param wormDomain  (required)
     * @param wormDomainId Modify a single WORM domain. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateWormDomainCall(WormDomain wormDomain, String wormDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = wormDomain;

        // create path and map variables
        String localVarPath = "/platform/1/worm/domains/{WormDomainId}"
            .replaceAll("\\{" + "WormDomainId" + "\\}", apiClient.escapeString(wormDomainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateWormDomainValidateBeforeCall(WormDomain wormDomain, String wormDomainId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'wormDomain' is set
        if (wormDomain == null) {
            throw new ApiException("Missing the required parameter 'wormDomain' when calling updateWormDomain(Async)");
        }
        
        // verify the required parameter 'wormDomainId' is set
        if (wormDomainId == null) {
            throw new ApiException("Missing the required parameter 'wormDomainId' when calling updateWormDomain(Async)");
        }
        

        com.squareup.okhttp.Call call = updateWormDomainCall(wormDomain, wormDomainId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Modify a single WORM domain.
     * @param wormDomain  (required)
     * @param wormDomainId Modify a single WORM domain. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateWormDomain(WormDomain wormDomain, String wormDomainId) throws ApiException {
        updateWormDomainWithHttpInfo(wormDomain, wormDomainId);
    }

    /**
     * 
     * Modify a single WORM domain.
     * @param wormDomain  (required)
     * @param wormDomainId Modify a single WORM domain. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWormDomainWithHttpInfo(WormDomain wormDomain, String wormDomainId) throws ApiException {
        com.squareup.okhttp.Call call = updateWormDomainValidateBeforeCall(wormDomain, wormDomainId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Modify a single WORM domain.
     * @param wormDomain  (required)
     * @param wormDomainId Modify a single WORM domain. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateWormDomainAsync(WormDomain wormDomain, String wormDomainId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateWormDomainValidateBeforeCall(wormDomain, wormDomainId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for updateWormSettings
     * @param wormSettings  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateWormSettingsCall(WormSettingsExtended wormSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = wormSettings;

        // create path and map variables
        String localVarPath = "/platform/1/worm/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateWormSettingsValidateBeforeCall(WormSettingsExtended wormSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'wormSettings' is set
        if (wormSettings == null) {
            throw new ApiException("Missing the required parameter 'wormSettings' when calling updateWormSettings(Async)");
        }
        

        com.squareup.okhttp.Call call = updateWormSettingsCall(wormSettings, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Modify the global WORM settings.  All input fields are optional, but one or more must be supplied.
     * @param wormSettings  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateWormSettings(WormSettingsExtended wormSettings) throws ApiException {
        updateWormSettingsWithHttpInfo(wormSettings);
    }

    /**
     * 
     * Modify the global WORM settings.  All input fields are optional, but one or more must be supplied.
     * @param wormSettings  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWormSettingsWithHttpInfo(WormSettingsExtended wormSettings) throws ApiException {
        com.squareup.okhttp.Call call = updateWormSettingsValidateBeforeCall(wormSettings, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Modify the global WORM settings.  All input fields are optional, but one or more must be supplied.
     * @param wormSettings  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateWormSettingsAsync(WormSettingsExtended wormSettings, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateWormSettingsValidateBeforeCall(wormSettings, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
