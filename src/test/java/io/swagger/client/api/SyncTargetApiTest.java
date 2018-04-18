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
import io.swagger.client.model.ReportsReportSubreports;
import io.swagger.client.model.ReportsReportSubreportsExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SyncTargetApi
 */
@Ignore
public class SyncTargetApiTest {

    private final SyncTargetApi api = new SyncTargetApi();

    
    /**
     * 
     *
     * Cancel the most recent SyncIQ job for this policy from the target side.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPoliciesPolicyCancelItemTest() throws ApiException {
        Empty policiesPolicyCancelItem = null;
        String policy = null;
        CreateResponse response = api.createPoliciesPolicyCancelItem(policiesPolicyCancelItem, policy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View a single SyncIQ target subreport.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportsReportSubreportTest() throws ApiException {
        String reportsReportSubreportId = null;
        String rid = null;
        ReportsReportSubreports response = api.getReportsReportSubreport(reportsReportSubreportId, rid);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of SyncIQ target subreports for a report.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportsReportSubreportsTest() throws ApiException {
        String rid = null;
        String sort = null;
        String resume = null;
        Integer newerThan = null;
        String state = null;
        Integer limit = null;
        String dir = null;
        ReportsReportSubreportsExtended response = api.getReportsReportSubreports(rid, sort, resume, newerThan, state, limit, dir);

        // TODO: test validations
    }
    
}