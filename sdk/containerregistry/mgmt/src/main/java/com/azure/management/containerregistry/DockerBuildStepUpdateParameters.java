// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The DockerBuildStepUpdateParameters model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Docker")
@Fluent
public final class DockerBuildStepUpdateParameters extends TaskStepUpdateParameters {
    /*
     * The fully qualified image names including the repository and tag.
     */
    @JsonProperty(value = "imageNames")
    private List<String> imageNames;

    /*
     * The value of this property indicates whether the image built should be
     * pushed to the registry or not.
     */
    @JsonProperty(value = "isPushEnabled")
    private Boolean isPushEnabled;

    /*
     * The value of this property indicates whether the image cache is enabled
     * or not.
     */
    @JsonProperty(value = "noCache")
    private Boolean noCache;

    /*
     * The Docker file path relative to the source context.
     */
    @JsonProperty(value = "dockerFilePath")
    private String dockerFilePath;

    /*
     * The collection of override arguments to be used when executing this
     * build step.
     */
    @JsonProperty(value = "arguments")
    private List<Argument> arguments;

    /*
     * The name of the target build stage for the docker build.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Get the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @return the imageNames value.
     */
    public List<String> imageNames() {
        return this.imageNames;
    }

    /**
     * Set the imageNames property: The fully qualified image names including the repository and tag.
     *
     * @param imageNames the imageNames value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withImageNames(List<String> imageNames) {
        this.imageNames = imageNames;
        return this;
    }

    /**
     * Get the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @return the isPushEnabled value.
     */
    public Boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set the isPushEnabled property: The value of this property indicates whether the image built should be pushed to
     * the registry or not.
     *
     * @param isPushEnabled the isPushEnabled value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withIsPushEnabled(Boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @return the noCache value.
     */
    public Boolean noCache() {
        return this.noCache;
    }

    /**
     * Set the noCache property: The value of this property indicates whether the image cache is enabled or not.
     *
     * @param noCache the noCache value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withNoCache(Boolean noCache) {
        this.noCache = noCache;
        return this;
    }

    /**
     * Get the dockerFilePath property: The Docker file path relative to the source context.
     *
     * @return the dockerFilePath value.
     */
    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * Set the dockerFilePath property: The Docker file path relative to the source context.
     *
     * @param dockerFilePath the dockerFilePath value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withDockerFilePath(String dockerFilePath) {
        this.dockerFilePath = dockerFilePath;
        return this;
    }

    /**
     * Get the arguments property: The collection of override arguments to be used when executing this build step.
     *
     * @return the arguments value.
     */
    public List<Argument> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: The collection of override arguments to be used when executing this build step.
     *
     * @param arguments the arguments value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the target property: The name of the target build stage for the docker build.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The name of the target build stage for the docker build.
     *
     * @param target the target value to set.
     * @return the DockerBuildStepUpdateParameters object itself.
     */
    public DockerBuildStepUpdateParameters withTarget(String target) {
        this.target = target;
        return this;
    }
}
