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
import io.swagger.client.model.CreateJobJobResponse;
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.JobEvents;
import io.swagger.client.model.JobJob;
import io.swagger.client.model.JobJobCreateParams;
import io.swagger.client.model.JobJobSummary;
import io.swagger.client.model.JobJobs;
import io.swagger.client.model.JobJobsExtended;
import io.swagger.client.model.JobPolicies;
import io.swagger.client.model.JobPoliciesExtended;
import io.swagger.client.model.JobPolicy;
import io.swagger.client.model.JobPolicyCreateParams;
import io.swagger.client.model.JobRecent;
import io.swagger.client.model.JobReports;
import io.swagger.client.model.JobStatistics;
import io.swagger.client.model.JobType;
import io.swagger.client.model.JobTypes;
import io.swagger.client.model.JobTypesExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * 
     *
     * Queue a new instance of a job type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobJobTest() throws ApiException {
        JobJobCreateParams jobJob = null;
        CreateJobJobResponse response = api.createJobJob(jobJob);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new job impact policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createJobPolicyTest() throws ApiException {
        JobPolicyCreateParams jobPolicy = null;
        CreateResponse response = api.createJobPolicy(jobPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a job impact policy.  System policies may not be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobPolicyTest() throws ApiException {
        String jobPolicyId = null;
        api.deleteJobPolicy(jobPolicyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List job events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobEventsTest() throws ApiException {
        Integer begin = null;
        Integer end = null;
        Integer jobId = null;
        String resume = null;
        String jobType = null;
        Integer timeoutMs = null;
        String state = null;
        Integer limit = null;
        String key = null;
        JobEvents response = api.getJobEvents(begin, end, jobId, resume, jobType, timeoutMs, state, limit, key);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View a single job instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobJobTest() throws ApiException {
        String jobJobId = null;
        JobJobs response = api.getJobJob(jobJobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View job engine status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobJobSummaryTest() throws ApiException {
        JobJobSummary response = api.getJobJobSummary();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View a single job impact policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobPolicyTest() throws ApiException {
        String jobPolicyId = null;
        JobPolicies response = api.getJobPolicy(jobPolicyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List recently completed jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobRecentTest() throws ApiException {
        Integer timeoutMs = null;
        Integer limit = null;
        JobRecent response = api.getJobRecent(timeoutMs, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List job reports.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobReportsTest() throws ApiException {
        Integer begin = null;
        Integer end = null;
        Integer jobId = null;
        String resume = null;
        String jobType = null;
        Integer timeoutMs = null;
        Integer limit = null;
        String key = null;
        Boolean verbose = null;
        JobReports response = api.getJobReports(begin, end, jobId, resume, jobType, timeoutMs, limit, key, verbose);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View job engine statistics.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobStatisticsTest() throws ApiException {
        Integer devid = null;
        Integer jobId = null;
        JobStatistics response = api.getJobStatistics(devid, jobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve job type information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTypeTest() throws ApiException {
        String jobTypeId = null;
        JobTypes response = api.getJobType(jobTypeId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List job types.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobTypesTest() throws ApiException {
        String sort = null;
        Boolean showAll = null;
        String dir = null;
        JobTypesExtended response = api.getJobTypes(sort, showAll, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List running and paused jobs.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobJobsTest() throws ApiException {
        String sort = null;
        String resume = null;
        Boolean batch = null;
        String state = null;
        Integer limit = null;
        String dir = null;
        JobJobsExtended response = api.listJobJobs(sort, resume, batch, state, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List job impact policies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobPoliciesTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        String resume = null;
        JobPoliciesExtended response = api.listJobPolicies(sort, limit, dir, resume);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify a running or paused job instance.  All input fields are optional, but one or more must be supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobJobTest() throws ApiException {
        JobJob jobJob = null;
        String jobJobId = null;
        api.updateJobJob(jobJob, jobJobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify a job impact policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobPolicyTest() throws ApiException {
        JobPolicy jobPolicy = null;
        String jobPolicyId = null;
        api.updateJobPolicy(jobPolicy, jobPolicyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify the job type.  All input fields are optional, but one or more must be supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobTypeTest() throws ApiException {
        JobType jobType = null;
        String jobTypeId = null;
        api.updateJobType(jobType, jobTypeId);

        // TODO: test validations
    }
    
}
