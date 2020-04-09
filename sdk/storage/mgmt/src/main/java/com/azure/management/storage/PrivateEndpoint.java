// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PrivateEndpoint model.
 */
@Immutable
public final class PrivateEndpoint {
    /*
     * The ARM identifier for Private Endpoint
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: The ARM identifier for Private Endpoint.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }
}
