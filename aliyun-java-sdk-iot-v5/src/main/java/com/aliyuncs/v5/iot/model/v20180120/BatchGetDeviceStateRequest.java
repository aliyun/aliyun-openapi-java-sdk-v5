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
public class BatchGetDeviceStateRequest extends RpcAcsRequest<BatchGetDeviceStateResponse> {
	   

	private List<String> iotId;

	private String iotInstanceId;

	private String productKey;

	private List<String> deviceName;
	public BatchGetDeviceStateRequest() {
		super("Iot", "2018-01-20", "BatchGetDeviceState");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getIotId() {
		return this.iotId;
	}

	public void setIotId(List<String> iotId) {
		this.iotId = iotId;	
		if (iotId != null) {
			for (int i = 0; i < iotId.size(); i++) {
				putQueryParameter("IotId." + (i + 1) , iotId.get(i));
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

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public List<String> getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(List<String> deviceName) {
		this.deviceName = deviceName;	
		if (deviceName != null) {
			for (int i = 0; i < deviceName.size(); i++) {
				putQueryParameter("DeviceName." + (i + 1) , deviceName.get(i));
			}
		}	
	}

	@Override
	public Class<BatchGetDeviceStateResponse> getResponseClass() {
		return BatchGetDeviceStateResponse.class;
	}

}
