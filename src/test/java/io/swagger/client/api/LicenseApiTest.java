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
import io.swagger.client.model.Empty;
import io.swagger.client.model.Error;
import io.swagger.client.model.LicenseGenerate;
import io.swagger.client.model.LicenseLicenseCreateParams;
import io.swagger.client.model.LicenseLicenses;
import io.swagger.client.model.LicenseLicensesExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LicenseApi
 */
@Ignore
public class LicenseApiTest {

    private final LicenseApi api = new LicenseApi();

    
    /**
     * 
     *
     * Install a new license file and/or activate evaluation licenses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLicenseLicenseTest() throws ApiException {
        LicenseLicenseCreateParams licenseLicense = null;
        Empty response = api.createLicenseLicense(licenseLicense);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Generate license activation file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLicenseGenerateTest() throws ApiException {
        String action = null;
        String licensesToInclude = null;
        String licensesToExclude = null;
        String onlyTheseLicenses = null;
        LicenseGenerate response = api.getLicenseGenerate(action, licensesToInclude, licensesToExclude, onlyTheseLicenses);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve license information for the feature.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLicenseLicenseTest() throws ApiException {
        String licenseLicenseId = null;
        LicenseLicenses response = api.getLicenseLicense(licenseLicenseId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve license information for all licensable products.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLicenseLicensesTest() throws ApiException {
        LicenseLicensesExtended response = api.listLicenseLicenses();

        // TODO: test validations
    }
    
}
