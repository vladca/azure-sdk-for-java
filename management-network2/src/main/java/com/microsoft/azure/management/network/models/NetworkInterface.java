/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* A NetworkInterface in a resource group
*/
public class NetworkInterface extends TopLevelResource {
    private DnsSettings dnsSettings;
    
    /**
    * Optional. Gets or sets DNsSettings in  NetworkInterface
    * @return The DnsSettings value.
    */
    public DnsSettings getDnsSettings() {
        return this.dnsSettings;
    }
    
    /**
    * Optional. Gets or sets DNsSettings in  NetworkInterface
    * @param dnsSettingsValue The DnsSettings value.
    */
    public void setDnsSettings(final DnsSettings dnsSettingsValue) {
        this.dnsSettings = dnsSettingsValue;
    }
    
    private ArrayList<NetworkInterfaceIpConfiguration> ipConfigurations;
    
    /**
    * Optional. Gets or sets list of IPConfigurations of the NetworkInterface
    * @return The IpConfigurations value.
    */
    public ArrayList<NetworkInterfaceIpConfiguration> getIpConfigurations() {
        return this.ipConfigurations;
    }
    
    /**
    * Optional. Gets or sets list of IPConfigurations of the NetworkInterface
    * @param ipConfigurationsValue The IpConfigurations value.
    */
    public void setIpConfigurations(final ArrayList<NetworkInterfaceIpConfiguration> ipConfigurationsValue) {
        this.ipConfigurations = ipConfigurationsValue;
    }
    
    private String macAddress;
    
    /**
    * Optional. Gets the MAC Address of the network interface
    * @return The MacAddress value.
    */
    public String getMacAddress() {
        return this.macAddress;
    }
    
    /**
    * Optional. Gets the MAC Address of the network interface
    * @param macAddressValue The MacAddress value.
    */
    public void setMacAddress(final String macAddressValue) {
        this.macAddress = macAddressValue;
    }
    
    private ResourceId networkSecurityGroup;
    
    /**
    * Optional. Gets or sets the reference of the NetworkSecurityGroup resource
    * @return The NetworkSecurityGroup value.
    */
    public ResourceId getNetworkSecurityGroup() {
        return this.networkSecurityGroup;
    }
    
    /**
    * Optional. Gets or sets the reference of the NetworkSecurityGroup resource
    * @param networkSecurityGroupValue The NetworkSecurityGroup value.
    */
    public void setNetworkSecurityGroup(final ResourceId networkSecurityGroupValue) {
        this.networkSecurityGroup = networkSecurityGroupValue;
    }
    
    private Boolean primary;
    
    /**
    * Optional. Gets whether this is a primary NIC on a virtual machine
    * @return The Primary value.
    */
    public Boolean isPrimary() {
        return this.primary;
    }
    
    /**
    * Optional. Gets whether this is a primary NIC on a virtual machine
    * @param primaryValue The Primary value.
    */
    public void setPrimary(final Boolean primaryValue) {
        this.primary = primaryValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private ResourceId virtualMachine;
    
    /**
    * Optional. Gets or sets the reference of a VirtualMachine
    * @return The VirtualMachine value.
    */
    public ResourceId getVirtualMachine() {
        return this.virtualMachine;
    }
    
    /**
    * Optional. Gets or sets the reference of a VirtualMachine
    * @param virtualMachineValue The VirtualMachine value.
    */
    public void setVirtualMachine(final ResourceId virtualMachineValue) {
        this.virtualMachine = virtualMachineValue;
    }
    
    /**
    * Initializes a new instance of the NetworkInterface class.
    *
    */
    public NetworkInterface() {
        super();
        this.setIpConfigurations(new LazyArrayList<NetworkInterfaceIpConfiguration>());
    }
    
    /**
    * Initializes a new instance of the NetworkInterface class with required
    * arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public NetworkInterface(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
