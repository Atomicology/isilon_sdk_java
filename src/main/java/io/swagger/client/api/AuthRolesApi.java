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


import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import io.swagger.client.model.AuthIdNtokenPrivilegeItem;
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.GroupMembers;
import io.swagger.client.model.RolePrivileges;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthRolesApi {
    private ApiClient apiClient;

    public AuthRolesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthRolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createRoleMember
     * @param roleMember  (required)
     * @param role  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRoleMemberCall(AuthAccessAccessItemFileGroup roleMember, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = roleMember;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/members"
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

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
    private com.squareup.okhttp.Call createRoleMemberValidateBeforeCall(AuthAccessAccessItemFileGroup roleMember, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'roleMember' is set
        if (roleMember == null) {
            throw new ApiException("Missing the required parameter 'roleMember' when calling createRoleMember(Async)");
        }
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling createRoleMember(Async)");
        }
        

        com.squareup.okhttp.Call call = createRoleMemberCall(roleMember, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Add a member to the role.
     * @param roleMember  (required)
     * @param role  (required)
     * @return CreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateResponse createRoleMember(AuthAccessAccessItemFileGroup roleMember, String role) throws ApiException {
        ApiResponse<CreateResponse> resp = createRoleMemberWithHttpInfo(roleMember, role);
        return resp.getData();
    }

    /**
     * 
     * Add a member to the role.
     * @param roleMember  (required)
     * @param role  (required)
     * @return ApiResponse&lt;CreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateResponse> createRoleMemberWithHttpInfo(AuthAccessAccessItemFileGroup roleMember, String role) throws ApiException {
        com.squareup.okhttp.Call call = createRoleMemberValidateBeforeCall(roleMember, role, null, null);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a member to the role.
     * @param roleMember  (required)
     * @param role  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRoleMemberAsync(AuthAccessAccessItemFileGroup roleMember, String role, final ApiCallback<CreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createRoleMemberValidateBeforeCall(roleMember, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createRolePrivilege
     * @param rolePrivilege  (required)
     * @param role  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createRolePrivilegeCall(AuthIdNtokenPrivilegeItem rolePrivilege, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = rolePrivilege;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/privileges"
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

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
    private com.squareup.okhttp.Call createRolePrivilegeValidateBeforeCall(AuthIdNtokenPrivilegeItem rolePrivilege, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'rolePrivilege' is set
        if (rolePrivilege == null) {
            throw new ApiException("Missing the required parameter 'rolePrivilege' when calling createRolePrivilege(Async)");
        }
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling createRolePrivilege(Async)");
        }
        

        com.squareup.okhttp.Call call = createRolePrivilegeCall(rolePrivilege, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Add a privilege to the role.
     * @param rolePrivilege  (required)
     * @param role  (required)
     * @return CreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateResponse createRolePrivilege(AuthIdNtokenPrivilegeItem rolePrivilege, String role) throws ApiException {
        ApiResponse<CreateResponse> resp = createRolePrivilegeWithHttpInfo(rolePrivilege, role);
        return resp.getData();
    }

    /**
     * 
     * Add a privilege to the role.
     * @param rolePrivilege  (required)
     * @param role  (required)
     * @return ApiResponse&lt;CreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateResponse> createRolePrivilegeWithHttpInfo(AuthIdNtokenPrivilegeItem rolePrivilege, String role) throws ApiException {
        com.squareup.okhttp.Call call = createRolePrivilegeValidateBeforeCall(rolePrivilege, role, null, null);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a privilege to the role.
     * @param rolePrivilege  (required)
     * @param role  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createRolePrivilegeAsync(AuthIdNtokenPrivilegeItem rolePrivilege, String role, final ApiCallback<CreateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createRolePrivilegeValidateBeforeCall(rolePrivilege, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRoleMember
     * @param roleMemberId Remove a member from the role. (required)
     * @param role  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRoleMemberCall(String roleMemberId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/members/{RoleMemberId}"
            .replaceAll("\\{" + "RoleMemberId" + "\\}", apiClient.escapeString(roleMemberId.toString()))
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRoleMemberValidateBeforeCall(String roleMemberId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'roleMemberId' is set
        if (roleMemberId == null) {
            throw new ApiException("Missing the required parameter 'roleMemberId' when calling deleteRoleMember(Async)");
        }
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling deleteRoleMember(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRoleMemberCall(roleMemberId, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Remove a member from the role.
     * @param roleMemberId Remove a member from the role. (required)
     * @param role  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRoleMember(String roleMemberId, String role) throws ApiException {
        deleteRoleMemberWithHttpInfo(roleMemberId, role);
    }

    /**
     * 
     * Remove a member from the role.
     * @param roleMemberId Remove a member from the role. (required)
     * @param role  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRoleMemberWithHttpInfo(String roleMemberId, String role) throws ApiException {
        com.squareup.okhttp.Call call = deleteRoleMemberValidateBeforeCall(roleMemberId, role, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove a member from the role.
     * @param roleMemberId Remove a member from the role. (required)
     * @param role  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRoleMemberAsync(String roleMemberId, String role, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRoleMemberValidateBeforeCall(roleMemberId, role, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteRolePrivilege
     * @param rolePrivilegeId Remove a privilege from a role. (required)
     * @param role  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRolePrivilegeCall(String rolePrivilegeId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/privileges/{RolePrivilegeId}"
            .replaceAll("\\{" + "RolePrivilegeId" + "\\}", apiClient.escapeString(rolePrivilegeId.toString()))
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRolePrivilegeValidateBeforeCall(String rolePrivilegeId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'rolePrivilegeId' is set
        if (rolePrivilegeId == null) {
            throw new ApiException("Missing the required parameter 'rolePrivilegeId' when calling deleteRolePrivilege(Async)");
        }
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling deleteRolePrivilege(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteRolePrivilegeCall(rolePrivilegeId, role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Remove a privilege from a role.
     * @param rolePrivilegeId Remove a privilege from a role. (required)
     * @param role  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRolePrivilege(String rolePrivilegeId, String role) throws ApiException {
        deleteRolePrivilegeWithHttpInfo(rolePrivilegeId, role);
    }

    /**
     * 
     * Remove a privilege from a role.
     * @param rolePrivilegeId Remove a privilege from a role. (required)
     * @param role  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRolePrivilegeWithHttpInfo(String rolePrivilegeId, String role) throws ApiException {
        com.squareup.okhttp.Call call = deleteRolePrivilegeValidateBeforeCall(rolePrivilegeId, role, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove a privilege from a role.
     * @param rolePrivilegeId Remove a privilege from a role. (required)
     * @param role  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRolePrivilegeAsync(String rolePrivilegeId, String role, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteRolePrivilegeValidateBeforeCall(rolePrivilegeId, role, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listRoleMembers
     * @param role  (required)
     * @param resolveNames Resolve names of personas. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRoleMembersCall(String role, Boolean resolveNames, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/members"
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (resolveNames != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resolve_names", resolveNames));

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
    private com.squareup.okhttp.Call listRoleMembersValidateBeforeCall(String role, Boolean resolveNames, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling listRoleMembers(Async)");
        }
        

        com.squareup.okhttp.Call call = listRoleMembersCall(role, resolveNames, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * List all the members of the role.
     * @param role  (required)
     * @param resolveNames Resolve names of personas. (optional)
     * @return GroupMembers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupMembers listRoleMembers(String role, Boolean resolveNames) throws ApiException {
        ApiResponse<GroupMembers> resp = listRoleMembersWithHttpInfo(role, resolveNames);
        return resp.getData();
    }

    /**
     * 
     * List all the members of the role.
     * @param role  (required)
     * @param resolveNames Resolve names of personas. (optional)
     * @return ApiResponse&lt;GroupMembers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupMembers> listRoleMembersWithHttpInfo(String role, Boolean resolveNames) throws ApiException {
        com.squareup.okhttp.Call call = listRoleMembersValidateBeforeCall(role, resolveNames, null, null);
        Type localVarReturnType = new TypeToken<GroupMembers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all the members of the role.
     * @param role  (required)
     * @param resolveNames Resolve names of personas. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRoleMembersAsync(String role, Boolean resolveNames, final ApiCallback<GroupMembers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listRoleMembersValidateBeforeCall(role, resolveNames, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupMembers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listRolePrivileges
     * @param role  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRolePrivilegesCall(String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/platform/1/auth/roles/{Role}/privileges"
            .replaceAll("\\{" + "Role" + "\\}", apiClient.escapeString(role.toString()));

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
    private com.squareup.okhttp.Call listRolePrivilegesValidateBeforeCall(String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'role' is set
        if (role == null) {
            throw new ApiException("Missing the required parameter 'role' when calling listRolePrivileges(Async)");
        }
        

        com.squareup.okhttp.Call call = listRolePrivilegesCall(role, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * List all privileges in the role.
     * @param role  (required)
     * @return RolePrivileges
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RolePrivileges listRolePrivileges(String role) throws ApiException {
        ApiResponse<RolePrivileges> resp = listRolePrivilegesWithHttpInfo(role);
        return resp.getData();
    }

    /**
     * 
     * List all privileges in the role.
     * @param role  (required)
     * @return ApiResponse&lt;RolePrivileges&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RolePrivileges> listRolePrivilegesWithHttpInfo(String role) throws ApiException {
        com.squareup.okhttp.Call call = listRolePrivilegesValidateBeforeCall(role, null, null);
        Type localVarReturnType = new TypeToken<RolePrivileges>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all privileges in the role.
     * @param role  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRolePrivilegesAsync(String role, final ApiCallback<RolePrivileges> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listRolePrivilegesValidateBeforeCall(role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RolePrivileges>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
