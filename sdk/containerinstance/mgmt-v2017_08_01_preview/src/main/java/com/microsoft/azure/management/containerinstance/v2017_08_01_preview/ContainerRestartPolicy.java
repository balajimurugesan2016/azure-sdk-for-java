/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerRestartPolicy.
 */
public final class ContainerRestartPolicy extends ExpandableStringEnum<ContainerRestartPolicy> {
    /** Static value always for ContainerRestartPolicy. */
    public static final ContainerRestartPolicy ALWAYS = fromString("always");

    /**
     * Creates or finds a ContainerRestartPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerRestartPolicy
     */
    @JsonCreator
    public static ContainerRestartPolicy fromString(String name) {
        return fromString(name, ContainerRestartPolicy.class);
    }

    /**
     * @return known ContainerRestartPolicy values
     */
    public static Collection<ContainerRestartPolicy> values() {
        return values(ContainerRestartPolicy.class);
    }
}
