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
import io.swagger.client.model.Error;
import io.swagger.client.model.StatisticsCurrent;
import io.swagger.client.model.StatisticsHistory;
import io.swagger.client.model.StatisticsKeys;
import io.swagger.client.model.StatisticsKeysExtended;
import io.swagger.client.model.StatisticsOperations;
import io.swagger.client.model.StatisticsProtocols;
import io.swagger.client.model.SummaryClient;
import io.swagger.client.model.SummaryDrive;
import io.swagger.client.model.SummaryHeat;
import io.swagger.client.model.SummaryProtocol;
import io.swagger.client.model.SummaryProtocolStats;
import io.swagger.client.model.SummarySystem;
import io.swagger.client.model.SummaryWorkload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatisticsApi
 */
@Ignore
public class StatisticsApiTest {

    private final StatisticsApi api = new StatisticsApi();

    
    /**
     * 
     *
     * Retrieve stats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsCurrentTest() throws ApiException {
        Integer timeout = null;
        Boolean showNodes = null;
        List<String> keys = null;
        List<String> devid = null;
        Boolean substr = null;
        Boolean stale = null;
        Boolean typeInfo = null;
        Boolean raw = null;
        List<String> key = null;
        Boolean degraded = null;
        List<String> nodes = null;
        StatisticsCurrent response = api.getStatisticsCurrent(timeout, showNodes, keys, devid, substr, stale, typeInfo, raw, key, degraded, nodes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve stats.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsHistoryTest() throws ApiException {
        Integer begin = null;
        Integer interval = null;
        Integer end = null;
        Integer timeout = null;
        Boolean raw = null;
        List<String> keys = null;
        List<String> devid = null;
        Boolean substr = null;
        Boolean stale = null;
        Boolean typeInfo = null;
        Boolean memoryOnly = null;
        List<String> key = null;
        Boolean degraded = null;
        Boolean showNodes = null;
        Integer resolution = null;
        List<String> nodes = null;
        StatisticsHistory response = api.getStatisticsHistory(begin, interval, end, timeout, raw, keys, devid, substr, stale, typeInfo, memoryOnly, key, degraded, showNodes, resolution, nodes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List key meta-data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsKeyTest() throws ApiException {
        String statisticsKeyId = null;
        StatisticsKeys response = api.getStatisticsKey(statisticsKeyId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List meta-data for matching keys.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsKeysTest() throws ApiException {
        Boolean count = null;
        Integer limit = null;
        Boolean queryable = null;
        String resume = null;
        StatisticsKeysExtended response = api.getStatisticsKeys(count, limit, queryable, resume);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve operations list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsOperationsTest() throws ApiException {
        List<String> protocols = null;
        StatisticsOperations response = api.getStatisticsOperations(protocols);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve protocol list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatisticsProtocolsTest() throws ApiException {
        String type = null;
        StatisticsProtocols response = api.getStatisticsProtocols(type);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryClientTest() throws ApiException {
        String sort = null;
        String totalby = null;
        String userNames = null;
        String remoteAddresses = null;
        Boolean numeric = null;
        String localNames = null;
        String userIds = null;
        String classes = null;
        Integer timeout = null;
        String localAddresses = null;
        Boolean degraded = null;
        String remoteNames = null;
        String nodes = null;
        String protocols = null;
        SummaryClient response = api.getSummaryClient(sort, totalby, userNames, remoteAddresses, numeric, localNames, userIds, classes, timeout, localAddresses, degraded, remoteNames, nodes, protocols);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryDriveTest() throws ApiException {
        String sort = null;
        Boolean degraded = null;
        String type = null;
        String nodes = null;
        Integer timeout = null;
        SummaryDrive response = api.getSummaryDrive(sort, degraded, type, nodes, timeout);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * File heat map, i.e. rate of file operations, and the type of operation listed by path/lin(s).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryHeatTest() throws ApiException {
        String sort = null;
        Boolean convertlin = null;
        String totalby = null;
        Integer pathdepth = null;
        Boolean numeric = null;
        String events = null;
        Integer maxpath = null;
        String classes = null;
        Integer timeout = null;
        String nodes = null;
        Boolean degraded = null;
        SummaryHeat response = api.getSummaryHeat(sort, convertlin, totalby, pathdepth, numeric, events, maxpath, classes, timeout, nodes, degraded);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryProtocolTest() throws ApiException {
        String operations = null;
        String sort = null;
        String totalby = null;
        Boolean zero = null;
        String classes = null;
        Integer timeout = null;
        Boolean degraded = null;
        String nodes = null;
        String protocols = null;
        SummaryProtocol response = api.getSummaryProtocol(operations, sort, totalby, zero, classes, timeout, degraded, nodes, protocols);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryProtocolStatsTest() throws ApiException {
        Boolean degraded = null;
        String protocol = null;
        String nodes = null;
        Integer timeout = null;
        SummaryProtocolStats response = api.getSummaryProtocolStats(degraded, protocol, nodes, timeout);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummarySystemTest() throws ApiException {
        String sort = null;
        Boolean oprates = null;
        Boolean degraded = null;
        String nodes = null;
        Integer timeout = null;
        SummarySystem response = api.getSummarySystem(sort, oprates, degraded, nodes, timeout);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSummaryWorkloadTest() throws ApiException {
        String sort = null;
        List<String> jobTypes = null;
        String totalby = null;
        Integer timeout = null;
        Boolean degraded = null;
        String nodes = null;
        String systemNames = null;
        SummaryWorkload response = api.getSummaryWorkload(sort, jobTypes, totalby, timeout, degraded, nodes, systemNames);

        // TODO: test validations
    }
    
}