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
public class GetThingModelTslPublishedRequest extends RpcAcsRequest<GetThingModelTslPublishedResponse> {
	   

	private Boolean simple;

	private String resourceGroupId;

	private String iotInstanceId;

	private String productKey;

	private String modelVersion;

	private String functionBlockId;
	public GetThingModelTslPublishedRequest() {
		super("Iot", "2018-01-20", "GetThingModelTslPublished", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSimple() {
		return this.simple;
	}

	public void setSimple(Boolean simple) {
		this.simple = simple;
		if(simple != null){
			putQueryParameter("Simple", simple.toString());
		}
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putQueryParameter("ModelVersion", modelVersion);
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
	public Class<GetThingModelTslPublishedResponse> getResponseClass() {
		return GetThingModelTslPublishedResponse.class;
	}

}
