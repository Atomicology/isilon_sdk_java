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
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.Empty;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyncPoliciesApi
 */
@Ignore
public class SyncPoliciesApiTest {

    private final SyncPoliciesApi api = new SyncPoliciesApi();

    
    /**
     * 
     *
     * Reset a SyncIQ policy incremental state and force a full sync/copy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPolicyResetItemTest() throws ApiException {
        Empty policyResetItem = null;
        String policy = null;
        CreateResponse response = api.createPolicyResetItem(policyResetItem, policy);

        // TODO: test validations
    }
    
}
