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
import io.swagger.client.model.AuthAccessAccessItemFileGroup;
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.GroupMembers;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthGroupsApi
 */
@Ignore
public class AuthGroupsApiTest {

    private final AuthGroupsApi api = new AuthGroupsApi();

    
    /**
     * 
     *
     * Add a member to the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupMemberTest() throws ApiException {
        AuthAccessAccessItemFileGroup groupMember = null;
        String group = null;
        String zone = null;
        String provider = null;
        CreateResponse response = api.createGroupMember(groupMember, group, zone, provider);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove the member from the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupMemberTest() throws ApiException {
        String groupMemberId = null;
        String group = null;
        String zone = null;
        String provider = null;
        api.deleteGroupMember(groupMemberId, group, zone, provider);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all the members of the group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupMembersTest() throws ApiException {
        String group = null;
        Boolean resolveNames = null;
        String resume = null;
        Integer limit = null;
        String zone = null;
        String provider = null;
        GroupMembers response = api.listGroupMembers(group, resolveNames, resume, limit, zone, provider);

        // TODO: test validations
    }
    
}