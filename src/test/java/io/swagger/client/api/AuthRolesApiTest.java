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
import io.swagger.client.model.AuthIdNtokenPrivilegeItem;
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.GroupMembers;
import io.swagger.client.model.RolePrivileges;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthRolesApi
 */
@Ignore
public class AuthRolesApiTest {

    private final AuthRolesApi api = new AuthRolesApi();

    
    /**
     * 
     *
     * Add a member to the role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleMemberTest() throws ApiException {
        AuthAccessAccessItemFileGroup roleMember = null;
        String role = null;
        CreateResponse response = api.createRoleMember(roleMember, role);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a privilege to the role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRolePrivilegeTest() throws ApiException {
        AuthIdNtokenPrivilegeItem rolePrivilege = null;
        String role = null;
        CreateResponse response = api.createRolePrivilege(rolePrivilege, role);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove a member from the role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleMemberTest() throws ApiException {
        String roleMemberId = null;
        String role = null;
        api.deleteRoleMember(roleMemberId, role);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove a privilege from a role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRolePrivilegeTest() throws ApiException {
        String rolePrivilegeId = null;
        String role = null;
        api.deleteRolePrivilege(rolePrivilegeId, role);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all the members of the role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoleMembersTest() throws ApiException {
        String role = null;
        Boolean resolveNames = null;
        GroupMembers response = api.listRoleMembers(role, resolveNames);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all privileges in the role.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRolePrivilegesTest() throws ApiException {
        String role = null;
        RolePrivileges response = api.listRolePrivileges(role);

        // TODO: test validations
    }
    
}
