/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.GatewayApiContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ProvisioningState;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiType;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiVersionSetContractDetails;
import com.microsoft.azure.management.apimanagement.v2019_12_01.AuthenticationSettingsContract;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_12_01.Protocol;
import com.microsoft.azure.management.apimanagement.v2019_12_01.SubscriptionKeyParameterNamesContract;

class GatewayApiContractImpl extends CreatableUpdatableImpl<GatewayApiContract, ApiContractInner, GatewayApiContractImpl> implements GatewayApiContract, GatewayApiContract.Definition, GatewayApiContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String gatewayId;
    private String apiId;
    private ProvisioningState cprovisioningState;
    private ProvisioningState uprovisioningState;

    GatewayApiContractImpl(String name, ApiManagementManager manager) {
        super(name, new ApiContractInner());
        this.manager = manager;
        // Set resource name
        this.apiId = name;
        //
    }

    GatewayApiContractImpl(ApiContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.apiId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.gatewayId = IdParsingUtils.getValueFromIdByName(inner.id(), "gateways");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GatewayApiContract> createResourceAsync() {
        GatewayApisInner client = this.manager().inner().gatewayApis();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.gatewayId, this.apiId, this.cprovisioningState)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GatewayApiContract> updateResourceAsync() {
        GatewayApisInner client = this.manager().inner().gatewayApis();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.gatewayId, this.apiId, this.uprovisioningState)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApiContractInner> getInnerAsync() {
        GatewayApisInner client = this.manager().inner().gatewayApis();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String apiRevision() {
        return this.inner().apiRevision();
    }

    @Override
    public String apiRevisionDescription() {
        return this.inner().apiRevisionDescription();
    }

    @Override
    public ApiType apiType() {
        return this.inner().apiType();
    }

    @Override
    public String apiVersion() {
        return this.inner().apiVersion();
    }

    @Override
    public String apiVersionDescription() {
        return this.inner().apiVersionDescription();
    }

    @Override
    public ApiVersionSetContractDetails apiVersionSet() {
        return this.inner().apiVersionSet();
    }

    @Override
    public String apiVersionSetId() {
        return this.inner().apiVersionSetId();
    }

    @Override
    public AuthenticationSettingsContract authenticationSettings() {
        return this.inner().authenticationSettings();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isCurrent() {
        return this.inner().isCurrent();
    }

    @Override
    public Boolean isOnline() {
        return this.inner().isOnline();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String path() {
        return this.inner().path();
    }

    @Override
    public List<Protocol> protocols() {
        return this.inner().protocols();
    }

    @Override
    public String serviceUrl() {
        return this.inner().serviceUrl();
    }

    @Override
    public String sourceApiId() {
        return this.inner().sourceApiId();
    }

    @Override
    public SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames() {
        return this.inner().subscriptionKeyParameterNames();
    }

    @Override
    public Boolean subscriptionRequired() {
        return this.inner().subscriptionRequired();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GatewayApiContractImpl withExistingGateway(String resourceGroupName, String serviceName, String gatewayId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.gatewayId = gatewayId;
        return this;
    }

    @Override
    public GatewayApiContractImpl withProvisioningState(ProvisioningState provisioningState) {
        if (isInCreateMode()) {
            this.cprovisioningState = provisioningState;
        } else {
            this.uprovisioningState = provisioningState;
        }
        return this;
    }

}
