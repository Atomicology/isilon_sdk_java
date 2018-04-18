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
import io.swagger.client.model.SettingsAccessTime;
import io.swagger.client.model.SettingsAccessTimeExtended;
import io.swagger.client.model.SettingsCharacterEncodings;
import io.swagger.client.model.SettingsCharacterEncodingsExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesystemApi
 */
@Ignore
public class FilesystemApiTest {

    private final FilesystemApi api = new FilesystemApi();

    
    /**
     * 
     *
     * Retrieve settings for access time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSettingsAccessTimeTest() throws ApiException {
        SettingsAccessTime response = api.getSettingsAccessTime();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve current cluster character encoding settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSettingsCharacterEncodingsTest() throws ApiException {
        SettingsCharacterEncodings response = api.getSettingsCharacterEncodings();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Set settings for access time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSettingsAccessTimeTest() throws ApiException {
        SettingsAccessTimeExtended settingsAccessTime = null;
        api.updateSettingsAccessTime(settingsAccessTime);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Set current character encoding.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSettingsCharacterEncodingsTest() throws ApiException {
        SettingsCharacterEncodingsExtended settingsCharacterEncodings = null;
        api.updateSettingsCharacterEncodings(settingsCharacterEncodings);

        // TODO: test validations
    }
    
}
