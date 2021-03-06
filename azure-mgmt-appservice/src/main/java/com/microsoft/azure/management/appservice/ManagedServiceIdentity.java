/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Managed service identity.
 */
public class ManagedServiceIdentity {
    /**
     * Type of managed service identity. Possible values include:
     * 'SystemAssigned', 'UserAssigned'.
     */
    @JsonProperty(value = "type")
    private ManagedServiceIdentityType type;

    /**
     * Tenant of managed service identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Principal Id of managed service identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * Array of UserAssigned managed service identities.
     */
    @JsonProperty(value = "identityIds")
    private List<String> identityIds;

    /**
     * Get type of managed service identity. Possible values include: 'SystemAssigned', 'UserAssigned'.
     *
     * @return the type value
     */
    public ManagedServiceIdentityType type() {
        return this.type;
    }

    /**
     * Set type of managed service identity. Possible values include: 'SystemAssigned', 'UserAssigned'.
     *
     * @param type the type value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withType(ManagedServiceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get tenant of managed service identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get principal Id of managed service identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get array of UserAssigned managed service identities.
     *
     * @return the identityIds value
     */
    public List<String> identityIds() {
        return this.identityIds;
    }

    /**
     * Set array of UserAssigned managed service identities.
     *
     * @param identityIds the identityIds value to set
     * @return the ManagedServiceIdentity object itself.
     */
    public ManagedServiceIdentity withIdentityIds(List<String> identityIds) {
        this.identityIds = identityIds;
        return this;
    }

}
