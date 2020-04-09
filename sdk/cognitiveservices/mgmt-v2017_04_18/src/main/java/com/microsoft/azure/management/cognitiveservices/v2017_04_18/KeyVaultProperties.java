/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to configure keyVault Properties.
 */
public class KeyVaultProperties {
    /**
     * Name of the Key from KeyVault.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /**
     * Version of the Key from KeyVault.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Uri of KeyVault.
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /**
     * Get name of the Key from KeyVault.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set name of the Key from KeyVault.
     *
     * @param keyName the keyName value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get version of the Key from KeyVault.
     *
     * @return the keyVersion value
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set version of the Key from KeyVault.
     *
     * @param keyVersion the keyVersion value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get uri of KeyVault.
     *
     * @return the keyVaultUri value
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set uri of KeyVault.
     *
     * @param keyVaultUri the keyVaultUri value to set
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

}
