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
public class BatchClearEdgeInstanceDeviceConfigRequest extends RpcAcsRequest<BatchClearEdgeInstanceDeviceConfigResponse> {
	   

	private List<String> iotIds;

	private String iotInstanceId;

	private String instanceId;
	public BatchClearEdgeInstanceDeviceConfigRequest() {
		super("Iot", "2018-01-20", "BatchClearEdgeInstanceDeviceConfig", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getIotIds() {
		return this.iotIds;
	}

	public void setIotIds(List<String> iotIds) {
		this.iotIds = iotIds;	
		if (iotIds != null) {
			for (int i = 0; i < iotIds.size(); i++) {
				putQueryParameter("IotIds." + (i + 1) , iotIds.get(i));
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<BatchClearEdgeInstanceDeviceConfigResponse> getResponseClass() {
		return BatchClearEdgeInstanceDeviceConfigResponse.class;
	}

}
