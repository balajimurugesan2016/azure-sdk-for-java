// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageAccountMicrosoftEndpoints model.
 */
@Immutable
public final class StorageAccountMicrosoftEndpoints {
    /*
     * Gets the blob endpoint.
     */
    @JsonProperty(value = "blob", access = JsonProperty.Access.WRITE_ONLY)
    private String blob;

    /*
     * Gets the queue endpoint.
     */
    @JsonProperty(value = "queue", access = JsonProperty.Access.WRITE_ONLY)
    private String queue;

    /*
     * Gets the table endpoint.
     */
    @JsonProperty(value = "table", access = JsonProperty.Access.WRITE_ONLY)
    private String table;

    /*
     * Gets the file endpoint.
     */
    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)
    private String file;

    /*
     * Gets the web endpoint.
     */
    @JsonProperty(value = "web", access = JsonProperty.Access.WRITE_ONLY)
    private String web;

    /*
     * Gets the dfs endpoint.
     */
    @JsonProperty(value = "dfs", access = JsonProperty.Access.WRITE_ONLY)
    private String dfs;

    /**
     * Get the blob property: Gets the blob endpoint.
     * 
     * @return the blob value.
     */
    public String blob() {
        return this.blob;
    }

    /**
     * Get the queue property: Gets the queue endpoint.
     * 
     * @return the queue value.
     */
    public String queue() {
        return this.queue;
    }

    /**
     * Get the table property: Gets the table endpoint.
     * 
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Get the file property: Gets the file endpoint.
     * 
     * @return the file value.
     */
    public String file() {
        return this.file;
    }

    /**
     * Get the web property: Gets the web endpoint.
     * 
     * @return the web value.
     */
    public String web() {
        return this.web;
    }

    /**
     * Get the dfs property: Gets the dfs endpoint.
     * 
     * @return the dfs value.
     */
    public String dfs() {
        return this.dfs;
    }
}
