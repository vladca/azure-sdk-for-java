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

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.ComputeLongRunningOperationResponse;
import com.microsoft.azure.management.compute.models.ComputeOperationResponse;
import com.microsoft.azure.management.compute.models.ListParameters;
import com.microsoft.azure.management.compute.models.VirtualMachine;
import com.microsoft.azure.management.compute.models.VirtualMachineCaptureParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineCreateOrUpdateResponse;
import com.microsoft.azure.management.compute.models.VirtualMachineGetResponse;
import com.microsoft.azure.management.compute.models.VirtualMachineListResponse;
import com.microsoft.azure.management.compute.models.VirtualMachineSizeListResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* Operations for managing the virtual machines in compute management.
*/
public interface VirtualMachineOperations {
    /**
    * Captures the VM by copying VirtualHardDisks of the VM and outputs a
    * template that can be used to create similar VMs.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @param parameters Required. Parameters supplied to the Capture Virtual
    * Machine operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginCapturing(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters) throws IOException, ServiceException;
    
    /**
    * Captures the VM by copying VirtualHardDisks of the VM and outputs a
    * template that can be used to create similar VMs.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @param parameters Required. Parameters supplied to the Capture Virtual
    * Machine operation.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginCapturingAsync(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters);
    
    /**
    * The operation to create or update a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Create Virtual Machine operation response.
    */
    VirtualMachineCreateOrUpdateResponse beginCreatingOrUpdating(String resourceGroupName, VirtualMachine parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to create or update a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine operation.
    * @return The Create Virtual Machine operation response.
    */
    Future<VirtualMachineCreateOrUpdateResponse> beginCreatingOrUpdatingAsync(String resourceGroupName, VirtualMachine parameters);
    
    /**
    * Shuts down the Virtual Machine and releases the compute resources. You
    * are not billed for the compute resources that this Virtual Machine uses.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginDeallocating(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * Shuts down the Virtual Machine and releases the compute resources. You
    * are not billed for the compute resources that this Virtual Machine uses.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginDeallocatingAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to delete a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginDeleting(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * The operation to delete a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginDeletingAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to power off (stop) a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginPoweringOff(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * The operation to power off (stop) a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginPoweringOffAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to restart a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginRestarting(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * The operation to restart a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginRestartingAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to start a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The compute long running operation response.
    */
    ComputeOperationResponse beginStarting(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * The operation to start a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The compute long running operation response.
    */
    Future<ComputeOperationResponse> beginStartingAsync(String resourceGroupName, String vmName);
    
    /**
    * Captures the VM by copying VirtualHardDisks of the VM and outputs a
    * template that can be used to create similar VMs.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @param parameters Required. Parameters supplied to the Capture Virtual
    * Machine operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse capture(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * Captures the VM by copying VirtualHardDisks of the VM and outputs a
    * template that can be used to create similar VMs.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @param parameters Required. Parameters supplied to the Capture Virtual
    * Machine operation.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> captureAsync(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters);
    
    /**
    * The operation to create or update a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse createOrUpdate(String resourceGroupName, VirtualMachine parameters) throws IOException, ServiceException, InterruptedException, ExecutionException;
    
    /**
    * The operation to create or update a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine operation.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> createOrUpdateAsync(String resourceGroupName, VirtualMachine parameters);
    
    /**
    * Shuts down the Virtual Machine and releases the compute resources. You
    * are not billed for the compute resources that this Virtual Machine uses.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse deallocate(String resourceGroupName, String vmName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * Shuts down the Virtual Machine and releases the compute resources. You
    * are not billed for the compute resources that this Virtual Machine uses.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> deallocateAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to delete a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse delete(String resourceGroupName, String vmName) throws IOException, ServiceException, InterruptedException, ExecutionException;
    
    /**
    * The operation to delete a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> deleteAsync(String resourceGroupName, String vmName);
    
    /**
    * Sets the state of the VM as Generalized.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse generalize(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * Sets the state of the VM as Generalized.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> generalizeAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to get a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The GetVM operation response.
    */
    VirtualMachineGetResponse get(String resourceGroupName, String vmName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to get a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The GetVM operation response.
    */
    Future<VirtualMachineGetResponse> getAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to get a virtual machine along with its instance view.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The GetVM operation response.
    */
    VirtualMachineGetResponse getWithInstanceView(String resourceGroupName, String vmName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to get a virtual machine along with its instance view.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The GetVM operation response.
    */
    Future<VirtualMachineGetResponse> getWithInstanceViewAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to list virtual machines under a resource group.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Virtual Machine operation response.
    */
    VirtualMachineListResponse list(String resourceGroupName) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * The operation to list virtual machines under a resource group.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @return The List Virtual Machine operation response.
    */
    Future<VirtualMachineListResponse> listAsync(String resourceGroupName);
    
    /**
    * Gets the list of Virtual Machines in the subscription. Use nextLink
    * property in the response to get the next page of Virtual Machines. Do
    * this till nextLink is not null to fetch all the Virtual Machines.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Virtual Machine operation response.
    */
    VirtualMachineListResponse listAll(ListParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets the list of Virtual Machines in the subscription. Use nextLink
    * property in the response to get the next page of Virtual Machines. Do
    * this till nextLink is not null to fetch all the Virtual Machines.
    *
    * @param parameters Optional.
    * @return The List Virtual Machine operation response.
    */
    Future<VirtualMachineListResponse> listAllAsync(ListParameters parameters);
    
    /**
    * Lists virtual-machine-sizes available to be used for a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The List Virtual Machine operation response.
    */
    VirtualMachineSizeListResponse listAvailableSizes(String resourceGroupName, String vmName) throws IOException, ServiceException;
    
    /**
    * Lists virtual-machine-sizes available to be used for a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The List Virtual Machine operation response.
    */
    Future<VirtualMachineSizeListResponse> listAvailableSizesAsync(String resourceGroupName, String vmName);
    
    /**
    * Gets the next page of Virtual Machines. NextLink is obtained by making a
    * ListAll() callwhich fetches the first page of Virtual Machines and a
    * link to fetch the next page.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * ListVirtualMachines operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Virtual Machine operation response.
    */
    VirtualMachineListResponse listNext(String nextLink) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets the next page of Virtual Machines. NextLink is obtained by making a
    * ListAll() callwhich fetches the first page of Virtual Machines and a
    * link to fetch the next page.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * ListVirtualMachines operation.
    * @return The List Virtual Machine operation response.
    */
    Future<VirtualMachineListResponse> listNextAsync(String nextLink);
    
    /**
    * The operation to power off (stop) a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse powerOff(String resourceGroupName, String vmName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The operation to power off (stop) a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> powerOffAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to restart a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse restart(String resourceGroupName, String vmName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The operation to restart a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> restartAsync(String resourceGroupName, String vmName);
    
    /**
    * The operation to start a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The Compute service response for long-running operations.
    */
    ComputeLongRunningOperationResponse start(String resourceGroupName, String vmName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The operation to start a virtual machine.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param vmName Required. The name of the virtual machine.
    * @return The Compute service response for long-running operations.
    */
    Future<ComputeLongRunningOperationResponse> startAsync(String resourceGroupName, String vmName);
}
