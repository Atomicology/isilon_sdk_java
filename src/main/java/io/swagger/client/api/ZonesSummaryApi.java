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
import io.swagger.client.model.ZonesSummary;
import io.swagger.client.model.ZonesSummaryExtended;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZonesSummaryApi {
    private ApiClient apiClient;

    public ZonesSummaryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZonesSummaryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getZonesSummary
     * @param groupnet Name of groupnet in which to list zones. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZonesSummaryCall(String groupnet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/zones-summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (groupnet != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("groupnet", groupnet));

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
    private com.squareup.okhttp.Call getZonesSummaryValidateBeforeCall(String groupnet, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZonesSummaryCall(groupnet, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieve access zone summary information.
     * @param groupnet Name of groupnet in which to list zones. (optional)
     * @return ZonesSummaryExtended
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ZonesSummaryExtended getZonesSummary(String groupnet) throws ApiException {
        ApiResponse<ZonesSummaryExtended> resp = getZonesSummaryWithHttpInfo(groupnet);
        return resp.getData();
    }

    /**
     * 
     * Retrieve access zone summary information.
     * @param groupnet Name of groupnet in which to list zones. (optional)
     * @return ApiResponse&lt;ZonesSummaryExtended&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ZonesSummaryExtended> getZonesSummaryWithHttpInfo(String groupnet) throws ApiException {
        com.squareup.okhttp.Call call = getZonesSummaryValidateBeforeCall(groupnet, null, null);
        Type localVarReturnType = new TypeToken<ZonesSummaryExtended>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve access zone summary information.
     * @param groupnet Name of groupnet in which to list zones. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZonesSummaryAsync(String groupnet, final ApiCallback<ZonesSummaryExtended> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZonesSummaryValidateBeforeCall(groupnet, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ZonesSummaryExtended>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZonesSummaryZone
     * @param zonesSummaryZone Retrieve non-privileged access zone information. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZonesSummaryZoneCall(Integer zonesSummaryZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/zones-summary/{ZonesSummaryZone}"
            .replaceAll("\\{" + "ZonesSummaryZone" + "\\}", apiClient.escapeString(zonesSummaryZone.toString()));

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
    private com.squareup.okhttp.Call getZonesSummaryZoneValidateBeforeCall(Integer zonesSummaryZone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'zonesSummaryZone' is set
        if (zonesSummaryZone == null) {
            throw new ApiException("Missing the required parameter 'zonesSummaryZone' when calling getZonesSummaryZone(Async)");
        }
        

        com.squareup.okhttp.Call call = getZonesSummaryZoneCall(zonesSummaryZone, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieve non-privileged access zone information.
     * @param zonesSummaryZone Retrieve non-privileged access zone information. (required)
     * @return ZonesSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ZonesSummary getZonesSummaryZone(Integer zonesSummaryZone) throws ApiException {
        ApiResponse<ZonesSummary> resp = getZonesSummaryZoneWithHttpInfo(zonesSummaryZone);
        return resp.getData();
    }

    /**
     * 
     * Retrieve non-privileged access zone information.
     * @param zonesSummaryZone Retrieve non-privileged access zone information. (required)
     * @return ApiResponse&lt;ZonesSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ZonesSummary> getZonesSummaryZoneWithHttpInfo(Integer zonesSummaryZone) throws ApiException {
        com.squareup.okhttp.Call call = getZonesSummaryZoneValidateBeforeCall(zonesSummaryZone, null, null);
        Type localVarReturnType = new TypeToken<ZonesSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve non-privileged access zone information.
     * @param zonesSummaryZone Retrieve non-privileged access zone information. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZonesSummaryZoneAsync(Integer zonesSummaryZone, final ApiCallback<ZonesSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZonesSummaryZoneValidateBeforeCall(zonesSummaryZone, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ZonesSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
