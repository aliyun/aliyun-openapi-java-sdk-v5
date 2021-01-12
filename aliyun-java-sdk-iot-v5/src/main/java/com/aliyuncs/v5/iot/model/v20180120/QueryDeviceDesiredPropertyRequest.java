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
public class QueryDeviceDesiredPropertyRequest extends RpcAcsRequest<QueryDeviceDesiredPropertyResponse> {
	   

	private String iotId;

	private String iotInstanceId;

	private List<String> identifier;

	private String productKey;

	private String deviceName;

	private String functionBlockId;
	public QueryDeviceDesiredPropertyRequest() {
		super("Iot", "2018-01-20", "QueryDeviceDesiredProperty", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
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

	public List<String> getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(List<String> identifier) {
		this.identifier = identifier;	
		if (identifier != null) {
			for (int i = 0; i < identifier.size(); i++) {
				putQueryParameter("Identifier." + (i + 1) , identifier.get(i));
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

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
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
	public Class<QueryDeviceDesiredPropertyResponse> getResponseClass() {
		return QueryDeviceDesiredPropertyResponse.class;
	}

}
