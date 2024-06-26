/*
 * Trieve API
 * Trieve OpenAPI Specification. This document describes all of the operations available through the Trieve API.
 *
 * The version of the OpenAPI document: 0.5.0
 * Contact: developers@trieve.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ErrorResponseBody;
import org.openapitools.client.model.FileDTO;
import org.openapitools.client.model.ModelFile;
import java.util.UUID;
import org.openapitools.client.model.UploadFileData;
import org.openapitools.client.model.UploadFileResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Disabled
public class FileApiTest {

    private final FileApi api = new FileApi();

    /**
     * Delete File
     *
     * Delete File  Delete a file from S3 attached to the server based on its id. This will disassociate chunks from the file, but will not delete the chunks. We plan to add support for deleting chunks in a release soon. Auth&#39;ed user must be an admin or owner of the dataset&#39;s organization to upload a file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFileHandlerTest() throws ApiException {
        String trDataset = null;
        UUID fileId = null;
        Boolean deleteChunks = null;
        api.deleteFileHandler(trDataset, fileId, deleteChunks);
        // TODO: test validations
    }

    /**
     * Get Files for Dataset
     *
     * Get Files for Dataset  Get all files which belong to a given dataset specified by the dataset_id parameter. 10 files are returned per page.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDatasetFilesHandlerTest() throws ApiException {
        String trDataset = null;
        UUID datasetId = null;
        Long page = null;
        List<ModelFile> response = api.getDatasetFilesHandler(trDataset, datasetId, page);
        // TODO: test validations
    }

    /**
     * Get File
     *
     * Get File  Download a file from S3 attached to the server based on its id. We plan to add support for getting signed S3 URLs to download from S3 directly in a release soon.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileHandlerTest() throws ApiException {
        String trDataset = null;
        UUID fileId = null;
        FileDTO response = api.getFileHandler(trDataset, fileId);
        // TODO: test validations
    }

    /**
     * Upload File
     *
     * Upload File  Upload a file to S3 attached to the server. The file will be converted to HTML with tika and chunked algorithmically, images will be OCR&#39;ed with tesseract. The resulting chunks will be indexed and searchable. Optionally, you can only upload the file and manually create chunks associated to the file after. See docs.trieve.ai and/or contact us for more details and tips. Auth&#39;ed user must be an admin or owner of the dataset&#39;s organization to upload a file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileHandlerTest() throws ApiException {
        String trDataset = null;
        UploadFileData uploadFileData = null;
        UploadFileResult response = api.uploadFileHandler(trDataset, uploadFileData);
        // TODO: test validations
    }

}
