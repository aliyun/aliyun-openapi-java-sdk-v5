/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.v5.iot.model.v20180120;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEdgeDriverVersionRequest extends RpcAcsRequest<UpdateEdgeDriverVersionResponse> {
	   

	private String configCheckRule;

	private String argument;

	private String edgeVersion;

	private String description;

	private String driverId;

	private String iotInstanceId;

	private String containerConfig;

	private String driverVersion;

	private String driverConfig;

	private String sourceConfig;
	public UpdateEdgeDriverVersionRequest() {
		super("Iot", "2018-01-20", "UpdateEdgeDriverVersion", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigCheckRule() {
		return this.configCheckRule;
	}

	public void setConfigCheckRule(String configCheckRule) {
		this.configCheckRule = configCheckRule;
		if(configCheckRule != null){
			putQueryParameter("ConfigCheckRule", configCheckRule);
		}
	}

	public String getArgument() {
		return this.argument;
	}

	public void setArgument(String argument) {
		this.argument = argument;
		if(argument != null){
			putQueryParameter("Argument", argument);
		}
	}

	public String getEdgeVersion() {
		return this.edgeVersion;
	}

	public void setEdgeVersion(String edgeVersion) {
		this.edgeVersion = edgeVersion;
		if(edgeVersion != null){
			putQueryParameter("EdgeVersion", edgeVersion);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDriverId() {
		return this.driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
		if(driverId != null){
			putQueryParameter("DriverId", driverId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getContainerConfig() {
		return this.containerConfig;
	}

	public void setContainerConfig(String containerConfig) {
		this.containerConfig = containerConfig;
		if(containerConfig != null){
			putQueryParameter("ContainerConfig", containerConfig);
		}
	}

	public String getDriverVersion() {
		return this.driverVersion;
	}

	public void setDriverVersion(String driverVersion) {
		this.driverVersion = driverVersion;
		if(driverVersion != null){
			putQueryParameter("DriverVersion", driverVersion);
		}
	}

	public String getDriverConfig() {
		return this.driverConfig;
	}

	public void setDriverConfig(String driverConfig) {
		this.driverConfig = driverConfig;
		if(driverConfig != null){
			putQueryParameter("DriverConfig", driverConfig);
		}
	}

	public String getSourceConfig() {
		return this.sourceConfig;
	}

	public void setSourceConfig(String sourceConfig) {
		this.sourceConfig = sourceConfig;
		if(sourceConfig != null){
			putQueryParameter("SourceConfig", sourceConfig);
		}
	}

	@Override
	public Class<UpdateEdgeDriverVersionResponse> getResponseClass() {
		return UpdateEdgeDriverVersionResponse.class;
	}

}
