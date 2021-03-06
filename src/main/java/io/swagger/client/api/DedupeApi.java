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


import io.swagger.client.model.DedupeDedupeSummary;
import io.swagger.client.model.DedupeReports;
import io.swagger.client.model.DedupeReportsExtended;
import io.swagger.client.model.DedupeSettings;
import io.swagger.client.model.DedupeSettingsExtended;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DedupeApi {
    private ApiClient apiClient;

    public DedupeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DedupeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDedupeDedupeSummary
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDedupeDedupeSummaryCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/dedupe/dedupe-summary";

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
    private com.squareup.okhttp.Call getDedupeDedupeSummaryValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDedupeDedupeSummaryCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Return summary information about dedupe.
     * @return DedupeDedupeSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DedupeDedupeSummary getDedupeDedupeSummary() throws ApiException {
        ApiResponse<DedupeDedupeSummary> resp = getDedupeDedupeSummaryWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Return summary information about dedupe.
     * @return ApiResponse&lt;DedupeDedupeSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DedupeDedupeSummary> getDedupeDedupeSummaryWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getDedupeDedupeSummaryValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DedupeDedupeSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Return summary information about dedupe.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDedupeDedupeSummaryAsync(final ApiCallback<DedupeDedupeSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDedupeDedupeSummaryValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DedupeDedupeSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDedupeReport
     * @param dedupeReportId Retrieve a report for a single dedupe job. (required)
     * @param scope If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDedupeReportCall(String dedupeReportId, String scope, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/dedupe/reports/{DedupeReportId}"
            .replaceAll("\\{" + "DedupeReportId" + "\\}", apiClient.escapeString(dedupeReportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (scope != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scope", scope));

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
    private com.squareup.okhttp.Call getDedupeReportValidateBeforeCall(String dedupeReportId, String scope, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dedupeReportId' is set
        if (dedupeReportId == null) {
            throw new ApiException("Missing the required parameter 'dedupeReportId' when calling getDedupeReport(Async)");
        }
        

        com.squareup.okhttp.Call call = getDedupeReportCall(dedupeReportId, scope, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieve a report for a single dedupe job.
     * @param dedupeReportId Retrieve a report for a single dedupe job. (required)
     * @param scope If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. (optional)
     * @return DedupeReports
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DedupeReports getDedupeReport(String dedupeReportId, String scope) throws ApiException {
        ApiResponse<DedupeReports> resp = getDedupeReportWithHttpInfo(dedupeReportId, scope);
        return resp.getData();
    }

    /**
     * 
     * Retrieve a report for a single dedupe job.
     * @param dedupeReportId Retrieve a report for a single dedupe job. (required)
     * @param scope If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. (optional)
     * @return ApiResponse&lt;DedupeReports&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DedupeReports> getDedupeReportWithHttpInfo(String dedupeReportId, String scope) throws ApiException {
        com.squareup.okhttp.Call call = getDedupeReportValidateBeforeCall(dedupeReportId, scope, null, null);
        Type localVarReturnType = new TypeToken<DedupeReports>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve a report for a single dedupe job.
     * @param dedupeReportId Retrieve a report for a single dedupe job. (required)
     * @param scope If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDedupeReportAsync(String dedupeReportId, String scope, final ApiCallback<DedupeReports> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDedupeReportValidateBeforeCall(dedupeReportId, scope, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DedupeReports>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDedupeReports
     * @param sort The field that will be used for sorting. (optional)
     * @param begin Restrict the query to reports at or after the given time, in seconds since the Epoch. (optional)
     * @param end Restrict the query to reports at or before the given time, in seconds since the Epoch. (optional)
     * @param jobId Restrict the query to the given job ID. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param jobType Restrict the query to the given job type. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDedupeReportsCall(String sort, Integer begin, Integer end, Integer jobId, String resume, String jobType, Integer limit, String dir, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/dedupe/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (begin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("begin", begin));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end", end));
        if (jobId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("job_id", jobId));
        if (resume != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resume", resume));
        if (jobType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("job_type", jobType));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (dir != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dir", dir));

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
    private com.squareup.okhttp.Call getDedupeReportsValidateBeforeCall(String sort, Integer begin, Integer end, Integer jobId, String resume, String jobType, Integer limit, String dir, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDedupeReportsCall(sort, begin, end, jobId, resume, jobType, limit, dir, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * List dedupe reports.
     * @param sort The field that will be used for sorting. (optional)
     * @param begin Restrict the query to reports at or after the given time, in seconds since the Epoch. (optional)
     * @param end Restrict the query to reports at or before the given time, in seconds since the Epoch. (optional)
     * @param jobId Restrict the query to the given job ID. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param jobType Restrict the query to the given job type. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @return DedupeReportsExtended
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DedupeReportsExtended getDedupeReports(String sort, Integer begin, Integer end, Integer jobId, String resume, String jobType, Integer limit, String dir) throws ApiException {
        ApiResponse<DedupeReportsExtended> resp = getDedupeReportsWithHttpInfo(sort, begin, end, jobId, resume, jobType, limit, dir);
        return resp.getData();
    }

    /**
     * 
     * List dedupe reports.
     * @param sort The field that will be used for sorting. (optional)
     * @param begin Restrict the query to reports at or after the given time, in seconds since the Epoch. (optional)
     * @param end Restrict the query to reports at or before the given time, in seconds since the Epoch. (optional)
     * @param jobId Restrict the query to the given job ID. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param jobType Restrict the query to the given job type. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @return ApiResponse&lt;DedupeReportsExtended&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DedupeReportsExtended> getDedupeReportsWithHttpInfo(String sort, Integer begin, Integer end, Integer jobId, String resume, String jobType, Integer limit, String dir) throws ApiException {
        com.squareup.okhttp.Call call = getDedupeReportsValidateBeforeCall(sort, begin, end, jobId, resume, jobType, limit, dir, null, null);
        Type localVarReturnType = new TypeToken<DedupeReportsExtended>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dedupe reports.
     * @param sort The field that will be used for sorting. (optional)
     * @param begin Restrict the query to reports at or after the given time, in seconds since the Epoch. (optional)
     * @param end Restrict the query to reports at or before the given time, in seconds since the Epoch. (optional)
     * @param jobId Restrict the query to the given job ID. (optional)
     * @param resume Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). (optional)
     * @param jobType Restrict the query to the given job type. (optional)
     * @param limit Return no more than this many results at once (see resume). (optional)
     * @param dir The direction of the sort. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDedupeReportsAsync(String sort, Integer begin, Integer end, Integer jobId, String resume, String jobType, Integer limit, String dir, final ApiCallback<DedupeReportsExtended> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDedupeReportsValidateBeforeCall(sort, begin, end, jobId, resume, jobType, limit, dir, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DedupeReportsExtended>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDedupeSettings
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDedupeSettingsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/dedupe/settings";

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
    private com.squareup.okhttp.Call getDedupeSettingsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getDedupeSettingsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieve the dedupe settings.
     * @return DedupeSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DedupeSettings getDedupeSettings() throws ApiException {
        ApiResponse<DedupeSettings> resp = getDedupeSettingsWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Retrieve the dedupe settings.
     * @return ApiResponse&lt;DedupeSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DedupeSettings> getDedupeSettingsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getDedupeSettingsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<DedupeSettings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve the dedupe settings.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDedupeSettingsAsync(final ApiCallback<DedupeSettings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDedupeSettingsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DedupeSettings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDedupeSettings
     * @param dedupeSettings  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDedupeSettingsCall(DedupeSettingsExtended dedupeSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = dedupeSettings;

        // create path and map variables
        String localVarPath = "/platform/1/dedupe/settings";

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
    private com.squareup.okhttp.Call updateDedupeSettingsValidateBeforeCall(DedupeSettingsExtended dedupeSettings, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dedupeSettings' is set
        if (dedupeSettings == null) {
            throw new ApiException("Missing the required parameter 'dedupeSettings' when calling updateDedupeSettings(Async)");
        }
        

        com.squareup.okhttp.Call call = updateDedupeSettingsCall(dedupeSettings, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Modify the dedupe settings. All input fields are optional, but one or more must be supplied.
     * @param dedupeSettings  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateDedupeSettings(DedupeSettingsExtended dedupeSettings) throws ApiException {
        updateDedupeSettingsWithHttpInfo(dedupeSettings);
    }

    /**
     * 
     * Modify the dedupe settings. All input fields are optional, but one or more must be supplied.
     * @param dedupeSettings  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateDedupeSettingsWithHttpInfo(DedupeSettingsExtended dedupeSettings) throws ApiException {
        com.squareup.okhttp.Call call = updateDedupeSettingsValidateBeforeCall(dedupeSettings, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Modify the dedupe settings. All input fields are optional, but one or more must be supplied.
     * @param dedupeSettings  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDedupeSettingsAsync(DedupeSettingsExtended dedupeSettings, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDedupeSettingsValidateBeforeCall(dedupeSettings, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
