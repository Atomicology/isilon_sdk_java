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
import io.swagger.client.model.GroupnetSubnetsExtended;
import io.swagger.client.model.NetworkDnscache;
import io.swagger.client.model.NetworkDnscacheExtended;
import io.swagger.client.model.NetworkExternal;
import io.swagger.client.model.NetworkExternalExtended;
import io.swagger.client.model.NetworkGroupnet;
import io.swagger.client.model.NetworkGroupnetCreateParams;
import io.swagger.client.model.NetworkGroupnets;
import io.swagger.client.model.NetworkGroupnetsExtended;
import io.swagger.client.model.NetworkPools;
import io.swagger.client.model.PoolsPoolInterfaces;
import io.swagger.client.model.PoolsPoolRulesExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkApi
 */
@Ignore
public class NetworkApiTest {

    private final NetworkApi api = new NetworkApi();

    
    /**
     * 
     *
     * Flush the DNSCache.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDnscacheFlushItemTest() throws ApiException {
        Empty dnscacheFlushItem = null;
        Empty response = api.createDnscacheFlushItem(dnscacheFlushItem);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a new groupnet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNetworkGroupnetTest() throws ApiException {
        NetworkGroupnetCreateParams networkGroupnet = null;
        CreateResponse response = api.createNetworkGroupnet(networkGroupnet);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Rebalance IP addresses in all pools.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNetworkScRebalanceAllItemTest() throws ApiException {
        Empty networkScRebalanceAllItem = null;
        Empty response = api.createNetworkScRebalanceAllItem(networkScRebalanceAllItem);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a network groupnet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNetworkGroupnetTest() throws ApiException {
        String networkGroupnetId = null;
        api.deleteNetworkGroupnet(networkGroupnetId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View network dns cache settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkDnscacheTest() throws ApiException {
        NetworkDnscache response = api.getNetworkDnscache();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View external network settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkExternalTest() throws ApiException {
        NetworkExternal response = api.getNetworkExternal();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * View a network groupnet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkGroupnetTest() throws ApiException {
        String networkGroupnetId = null;
        NetworkGroupnets response = api.getNetworkGroupnet(networkGroupnetId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of interfaces.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkInterfacesTest() throws ApiException {
        String sort = null;
        String network = null;
        String resume = null;
        String lnns = null;
        String allocMethod = null;
        Integer limit = null;
        String dir = null;
        PoolsPoolInterfaces response = api.getNetworkInterfaces(sort, network, resume, lnns, allocMethod, limit, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of flexnet pools.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkPoolsTest() throws ApiException {
        String sort = null;
        String subnet = null;
        String resume = null;
        String accessZone = null;
        String allocMethod = null;
        Integer limit = null;
        String groupnet = null;
        String dir = null;
        NetworkPools response = api.getNetworkPools(sort, subnet, resume, accessZone, allocMethod, limit, groupnet, dir);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of network rules.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkRulesTest() throws ApiException {
        String sort = null;
        String subnet = null;
        String resume = null;
        Integer limit = null;
        String dir = null;
        String groupnet = null;
        String pool = null;
        PoolsPoolRulesExtended response = api.getNetworkRules(sort, subnet, resume, limit, dir, groupnet, pool);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of subnets.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNetworkSubnetsTest() throws ApiException {
        String sort = null;
        String groupnet = null;
        Integer limit = null;
        String dir = null;
        String resume = null;
        GroupnetSubnetsExtended response = api.getNetworkSubnets(sort, groupnet, limit, dir, resume);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of groupnets.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNetworkGroupnetsTest() throws ApiException {
        String sort = null;
        Integer limit = null;
        String dir = null;
        String resume = null;
        NetworkGroupnetsExtended response = api.listNetworkGroupnets(sort, limit, dir, resume);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify network dns cache settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNetworkDnscacheTest() throws ApiException {
        NetworkDnscacheExtended networkDnscache = null;
        api.updateNetworkDnscache(networkDnscache);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify external network settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNetworkExternalTest() throws ApiException {
        NetworkExternalExtended networkExternal = null;
        api.updateNetworkExternal(networkExternal);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify a network groupnet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNetworkGroupnetTest() throws ApiException {
        NetworkGroupnet networkGroupnet = null;
        String networkGroupnetId = null;
        api.updateNetworkGroupnet(networkGroupnet, networkGroupnetId);

        // TODO: test validations
    }
    
}
