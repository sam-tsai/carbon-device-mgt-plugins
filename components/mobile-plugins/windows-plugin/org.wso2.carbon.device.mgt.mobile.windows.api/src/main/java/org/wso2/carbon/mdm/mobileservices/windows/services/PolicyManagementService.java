/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * you may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.mdm.mobileservices.windows.services;

import org.wso2.carbon.mdm.mobileservices.windows.common.exceptions.WindowsConfigurationException;
import org.wso2.carbon.mdm.mobileservices.windows.common.util.Message;

import javax.jws.WebService;
import javax.ws.rs.*;

/**
 * Endpoint for Enforce Effective Policy.
 */
@WebService
@Produces({ "application/json", "application/xml"})
@Consumes({"application/json", "application/xml"})
public interface PolicyManagementService {

    /**
     * Get the applicable effective policy for an enrolled windows device.
     *
     * @param deviceId Device Id
     * @return Returns retrieved devices.
     * @throws WindowsConfigurationException occurred while retrieving all the devices from DB.
     */
    @GET
    @Path("{deviceId}")
    Message getEffectivePolicy(@HeaderParam("Accept") String acceptHeader,
                                      @PathParam("deviceId") String deviceId) throws WindowsConfigurationException;
}
