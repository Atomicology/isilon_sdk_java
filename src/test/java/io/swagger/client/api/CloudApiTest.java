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

import io.swagger.client.ApiException;
import io.swagger.client.model.CloudAccess;
import io.swagger.client.model.CloudAccessExtended;
import io.swagger.client.model.CloudAccessItem;
import io.swagger.client.model.CloudAccount;
import io.swagger.client.model.CloudAccountCreateParams;
import io.swagger.client.model.CloudAccounts;
import io.swagger.client.model.CloudAccountsExtended;
import io.swagger.client.model.CloudJob;
import io.swagger.client.model.CloudJobCreateParams;
import io.swagger.client.model.CloudJobs;
import io.swagger.client.model.CloudJobsExtended;
import io.swagger.client.model.CloudJobsFiles;
import io.swagger.client.model.CloudPool;
import io.swagger.client.model.CloudPoolCreateParams;
import io.swagger.client.model.CloudPools;
import io.swagger.client.model.CloudPoolsExtended;
import io.swagger.client.model.CloudProxies;
import io.swagger.client.model.CloudProxiesExtended;
import io.swagger.client.model.CloudProxy;
import io.swagger.client.model.CloudProxyCreateParams;
import io.swagger.client.model.CloudSettings;
import io.swagger.client.model.CloudSettingsSettings;
import io.swagger.client.model.CreateCloudAccountResponse;
import io.swagger.client.model.CreateCloudJobResponse;
import io.swagger.client.model.CreateCloudPoolResponse;
import io.swagger.client.model.CreateCloudProxyResponse;
import io.swagger.client.model.Empty;
import io.swagger.client.model.Error;
import io.swagger.client.model.SettingsReportingEulaItem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CloudApi
 */
@Ignore
public class CloudApiTest {

    private final CloudApi api = new CloudApi();

    
    /**
     * 
     *
     * Add a cluster identifier to access list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudAccessItemTest() throws ApiException {
        CloudAccessItem cloudAccessItem = null;
        Empty response = api.createCloudAccessItem(cloudAccessItem);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudAccountTest() throws ApiException {
        CloudAccountCreateParams cloudAccount = null;
        CreateCloudAccountResponse response = api.createCloudAccount(cloudAccount);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudJobTest() throws ApiException {
        CloudJobCreateParams cloudJob = null;
        CreateCloudJobResponse response = api.createCloudJob(cloudJob);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudPoolTest() throws ApiException {
        CloudPoolCreateParams cloudPool = null;
        CreateCloudPoolResponse response = api.createCloudPool(cloudPool);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new proxy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCloudProxyTest() throws ApiException {
        CloudProxyCreateParams cloudProxy = null;
        CreateCloudProxyResponse response = api.createCloudProxy(cloudProxy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Regenerate master encryption key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSettingsEncryptionKeyItemTest() throws ApiException {
        Empty settingsEncryptionKeyItem = null;
        Empty response = api.createSettingsEncryptionKeyItem(settingsEncryptionKeyItem);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Accept telemetry collection EULA.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSettingsReportingEulaItemTest() throws ApiException {
        SettingsReportingEulaItem settingsReportingEulaItem = null;
        SettingsReportingEulaItem response = api.createSettingsReportingEulaItem(settingsReportingEulaItem);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete cloud access.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudAccessGuidTest() throws ApiException {
        String cloudAccessGuid = null;
        api.deleteCloudAccessGuid(cloudAccessGuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete cloud account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudAccountTest() throws ApiException {
        String cloudAccountId = null;
        String acknowledgeForceDelete = null;
        api.deleteCloudAccount(cloudAccountId, acknowledgeForceDelete);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a cloud pool.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        String acknowledgeForceDelete = null;
        api.deleteCloudPool(cloudPoolId, acknowledgeForceDelete);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete cloud account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCloudProxyTest() throws ApiException {
        String cloudProxyId = null;
        api.deleteCloudProxy(cloudProxyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Revoke acceptance of telemetry collection EULA.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSettingsReportingEulaTest() throws ApiException {
        api.deleteSettingsReportingEula();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve cloud access information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudAccessGuidTest() throws ApiException {
        String cloudAccessGuid = null;
        CloudAccess response = api.getCloudAccessGuid(cloudAccessGuid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve cloud account information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudAccountTest() throws ApiException {
        String cloudAccountId = null;
        CloudAccounts response = api.getCloudAccount(cloudAccountId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve cloudpool job information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudJobTest() throws ApiException {
        String cloudJobId = null;
        CloudJobs response = api.getCloudJob(cloudJobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve files associated with a cloudpool job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudJobsFileTest() throws ApiException {
        String cloudJobsFileId = null;
        String sort = null;
        String resume = null;
        Boolean batch = null;
        Integer limit = null;
        Integer page = null;
        String dir = null;
        CloudJobsFiles response = api.getCloudJobsFile(cloudJobsFileId, sort, resume, batch, limit, page, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve cloud pool information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        CloudPools response = api.getCloudPool(cloudPoolId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve cloud account information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudProxyTest() throws ApiException {
        String cloudProxyId = null;
        CloudProxies response = api.getCloudProxy(cloudProxyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all cloud settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloudSettingsTest() throws ApiException {
        CloudSettings response = api.getCloudSettings();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all accessible cluster identifiers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudAccessTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        CloudAccessExtended response = api.listCloudAccess(sort, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudAccountsTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        CloudAccountsExtended response = api.listCloudAccounts(sort, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all cloudpools jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudJobsTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        CloudJobsExtended response = api.listCloudJobs(sort, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all pools.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudPoolsTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        CloudPoolsExtended response = api.listCloudPools(sort, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all proxies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCloudProxiesTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        CloudProxiesExtended response = api.listCloudProxies(sort, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View telemetry collection EULA acceptance and content URI.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSettingsReportingEulaTest() throws ApiException {
        SettingsReportingEulaItem response = api.listSettingsReportingEula();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify cloud account.  All fields are optional, but one or more must be supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudAccountTest() throws ApiException {
        CloudAccount cloudAccount = null;
        String cloudAccountId = null;
        api.updateCloudAccount(cloudAccount, cloudAccountId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify a cloud job or operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudJobTest() throws ApiException {
        CloudJob cloudJob = null;
        String cloudJobId = null;
        api.updateCloudJob(cloudJob, cloudJobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify a cloud pool.  All fields are optional, but one or more must be supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudPoolTest() throws ApiException {
        CloudPool cloudPool = null;
        String cloudPoolId = null;
        api.updateCloudPool(cloudPool, cloudPoolId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify cloud account.  All fields are optional, but one or more must be supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudProxyTest() throws ApiException {
        CloudProxy cloudProxy = null;
        String cloudProxyId = null;
        api.updateCloudProxy(cloudProxy, cloudProxyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify one or more settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCloudSettingsTest() throws ApiException {
        CloudSettingsSettings cloudSettings = null;
        api.updateCloudSettings(cloudSettings);

        // TODO: test validations
    }
    
}
