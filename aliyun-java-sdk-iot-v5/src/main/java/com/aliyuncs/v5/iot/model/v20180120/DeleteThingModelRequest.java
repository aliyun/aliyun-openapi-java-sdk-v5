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
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteThingModelRequest extends RpcAcsRequest<DeleteThingModelResponse> {
	   

	private String resourceGroupId;

	private List<String> propertyIdentifier;

	private String iotInstanceId;

	private List<String> serviceIdentifier;

	private String productKey;

	private List<String> eventIdentifier;

	private String functionBlockId;
	public DeleteThingModelRequest() {
		super("Iot", "2018-01-20", "DeleteThingModel", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<String> getPropertyIdentifier() {
		return this.propertyIdentifier;
	}

	public void setPropertyIdentifier(List<String> propertyIdentifier) {
		this.propertyIdentifier = propertyIdentifier;	
		if (propertyIdentifier != null) {
			for (int i = 0; i < propertyIdentifier.size(); i++) {
				putQueryParameter("PropertyIdentifier." + (i + 1) , propertyIdentifier.get(i));
			}
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

	public List<String> getServiceIdentifier() {
		return this.serviceIdentifier;
	}

	public void setServiceIdentifier(List<String> serviceIdentifier) {
		this.serviceIdentifier = serviceIdentifier;	
		if (serviceIdentifier != null) {
			for (int i = 0; i < serviceIdentifier.size(); i++) {
				putQueryParameter("ServiceIdentifier." + (i + 1) , serviceIdentifier.get(i));
			}
		}	
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public List<String> getEventIdentifier() {
		return this.eventIdentifier;
	}

	public void setEventIdentifier(List<String> eventIdentifier) {
		this.eventIdentifier = eventIdentifier;	
		if (eventIdentifier != null) {
			for (int i = 0; i < eventIdentifier.size(); i++) {
				putQueryParameter("EventIdentifier." + (i + 1) , eventIdentifier.get(i));
			}
		}	
	}

	public String getFunctionBlockId() {
		return this.functionBlockId;
	}

	public void setFunctionBlockId(String functionBlockId) {
		this.functionBlockId = functionBlockId;
		if(functionBlockId != null){
			putQueryParameter("FunctionBlockId", functionBlockId);
		}
	}

	@Override
	public Class<DeleteThingModelResponse> getResponseClass() {
		return DeleteThingModelResponse.class;
	}

}
