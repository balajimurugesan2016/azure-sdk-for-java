/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CommunicationDirection.
 */
public final class CommunicationDirection extends ExpandableStringEnum<CommunicationDirection> {
    /** Static value inbound for CommunicationDirection. */
    public static final CommunicationDirection INBOUND = fromString("inbound");

    /** Static value outbound for CommunicationDirection. */
    public static final CommunicationDirection OUTBOUND = fromString("outbound");

    /**
     * Creates or finds a CommunicationDirection from its string representation.
     * @param name a name to look for
     * @return the corresponding CommunicationDirection
     */
    @JsonCreator
    public static CommunicationDirection fromString(String name) {
        return fromString(name, CommunicationDirection.class);
    }

    /**
     * @return known CommunicationDirection values
     */
    public static Collection<CommunicationDirection> values() {
        return values(CommunicationDirection.class);
    }
}
