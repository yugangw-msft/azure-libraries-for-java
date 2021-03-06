/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The publishing profile of a gallery image version.
 */
public final class GalleryImageVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    /**
     * This is the number of source blob copies in a region.
     */
    @JsonProperty(value = "replicaCount")
    private Integer replicaCount;

    /**
     * The flag means that if it is set to true, people deploying VMs with
     * 'latest' as version will not use this version.
     */
    @JsonProperty(value = "excludeFromLatest")
    private Boolean excludeFromLatest;

    /**
     * The time when the gallery image version is published.
     */
    @JsonProperty(value = "publishedDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime publishedDate;

    /**
     * The end of life date of the gallery image version.
     */
    @JsonProperty(value = "endOfLifeDate")
    private DateTime endOfLifeDate;

    /**
     * Get the replicaCount value.
     *
     * @return the replicaCount value.
     */
    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Set the replicaCount value.
     *
     * @param replicaCount the replicaCount value to set.
     * @return the GalleryImageVersionPublishingProfile object itself.
     */
    public GalleryImageVersionPublishingProfile withReplicaCount(Integer replicaCount) {
        this.replicaCount = replicaCount;
        return this;
    }

    /**
     * Get the excludeFromLatest value.
     *
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }

    /**
     * Set the excludeFromLatest value.
     *
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the GalleryImageVersionPublishingProfile object itself.
     */
    public GalleryImageVersionPublishingProfile withExcludeFromLatest(Boolean excludeFromLatest) {
        this.excludeFromLatest = excludeFromLatest;
        return this;
    }

    /**
     * Get the publishedDate value.
     *
     * @return the publishedDate value.
     */
    public DateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Get the endOfLifeDate value.
     *
     * @return the endOfLifeDate value.
     */
    public DateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate value.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryImageVersionPublishingProfile object itself.
     */
    public GalleryImageVersionPublishingProfile withEndOfLifeDate(DateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }
}