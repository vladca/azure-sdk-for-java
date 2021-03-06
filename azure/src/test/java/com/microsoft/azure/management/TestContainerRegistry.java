/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management;

import com.microsoft.azure.management.compute.ContainerService;
import com.microsoft.azure.management.compute.ContainerServiceMasterProfileCount;
import com.microsoft.azure.management.compute.ContainerServiceVMSizeTypes;
import com.microsoft.azure.management.compute.ContainerServices;
import com.microsoft.azure.management.containerregistry.Registries;
import com.microsoft.azure.management.containerregistry.Registry;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import org.apache.commons.codec.binary.Base64;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;

public class TestContainerRegistry extends TestTemplate<Registry, Registries> {

    @Override
    public Registry createResource(Registries registries) throws Exception {
        final String newName = "registry" + this.testId;
        final String accessKey = "Zq9p44F3HHfqmn6sy8vuaD2YcSvWQLd12AtSUTRl25JB9KcZkVueZU7ixmCo2Ebk8VDYDIFRN5Qi+D63iYNrAw==";
        return registries.define(newName)
                .withRegion(Region.US_WEST)
                .withNewResourceGroup()
                .withExistingStorageAccount("registrytest1", accessKey)
                .create();
    }

    @Override
    public Registry updateResource(Registry resource) throws Exception {
        // Modify existing container service
        final String newName = "as" + this.testId;
        resource =  resource.update()
                .withTag("tag2", "value2")
                .withTag("tag3", "value3")
                .withoutTag("tag1")
                .apply();
        Assert.assertTrue(resource.tags().containsKey("tag2"));
        Assert.assertTrue(!resource.tags().containsKey("tag1"));
        return resource;
    }

    @Override
    public void print(Registry resource) {
        System.out.println(new StringBuilder().append("Regsitry: ").append(resource.id())
                .append("Name: ").append(resource.name())
                .append("\n\tResource group: ").append(resource.resourceGroupName())
                .append("\n\tRegion: ").append(resource.region())
                .append("\n\tTags: ").append(resource.tags())
                .toString());
    }
}