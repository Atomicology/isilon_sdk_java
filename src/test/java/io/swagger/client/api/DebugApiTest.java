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
import io.swagger.client.model.DebugStats;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DebugApi
 */
@Ignore
public class DebugApiTest {

    private final DebugApi api = new DebugApi();

    
    /**
     * 
     *
     * Clear per-resource statistics counters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDebugStatsTest() throws ApiException {
        api.deleteDebugStats();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List cumulative call statistics for each resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDebugStatsTest() throws ApiException {
        DebugStats response = api.getDebugStats();

        // TODO: test validations
    }
    
}
