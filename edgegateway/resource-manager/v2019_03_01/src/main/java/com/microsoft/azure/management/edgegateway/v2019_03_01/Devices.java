/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import rx.Observable;
import com.microsoft.azure.management.edgegateway.v2019_03_01.DataBoxEdgeDevice;
import rx.Completable;

/**
 * Type representing Devices.
 */
public interface Devices {
    /**
     * Begins definition for a new DataBoxEdgeDevice resource.
     * @param name resource name.
     * @return the first stage of the new DataBoxEdgeDevice definition.
     */
    DataBoxEdgeDevice.DefinitionStages.Blank defineDataBoxEdgeDevice(String name);

    /**
     * Gets the properties of the data box edge/gateway device.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDevice> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Gets all the data box edge/gateway devices in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDevice> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Gets all the data box edge/gateway devices in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDevice> listAsync();

    /**
     * Deletes the data box edge/gateway device.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Downloads the updates on a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable downloadUpdatesAsync(String deviceName, String resourceGroupName);

    /**
     * Gets additional information for the specified data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataBoxEdgeDeviceExtendedInfo> getExtendedInformationAsync(String deviceName, String resourceGroupName);

    /**
     * Installs the updates on the data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable installUpdatesAsync(String deviceName, String resourceGroupName);

    /**
     * Scans for updates on a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable scanForUpdatesAsync(String deviceName, String resourceGroupName);

    /**
     * Gets information about the availability of updates based on the last scan of the device. It also gets information about any ongoing download or install jobs on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpdateSummary> getUpdateSummaryAsync(String deviceName, String resourceGroupName);

    /**
     * Uploads registration certificate for the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The upload certificate request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UploadCertificateResponse> uploadCertificateAsync(String deviceName, String resourceGroupName, UploadCertificateRequest parameters);

    /**
     * Gets the network settings of the specified data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkSettings> getNetworkSettingsAsync(String deviceName, String resourceGroupName);

    /**
     * Updates the security settings on a data box edge/gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param deviceAdminPassword Device administrator password as an encrypted string (encrypted using RSA PKCS #1) is used to sign into the  local web UI of the device. The Actual password should have at least 8 characters that are a combination of  uppercase, lowercase, numeric, and special characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable createOrUpdateSecuritySettingsAsync(String deviceName, String resourceGroupName, AsymmetricEncryptedSecret deviceAdminPassword);

}