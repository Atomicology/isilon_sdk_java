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
import io.swagger.client.model.FileFilterSettings;
import io.swagger.client.model.FileFilterSettingsExtended;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileFilterApi
 */
@Ignore
public class FileFilterApiTest {

    private final FileFilterApi api = new FileFilterApi();

    
    /**
     * 
     *
     * View File Filtering settings of an access zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileFilterSettingsTest() throws ApiException {
        String zone = null;
        FileFilterSettings response = api.getFileFilterSettings(zone);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Modify one or more File Filtering settings for an access zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileFilterSettingsTest() throws ApiException {
        FileFilterSettingsExtended fileFilterSettings = null;
        String zone = null;
        api.updateFileFilterSettings(fileFilterSettings, zone);

        // TODO: test validations
    }
    
}
