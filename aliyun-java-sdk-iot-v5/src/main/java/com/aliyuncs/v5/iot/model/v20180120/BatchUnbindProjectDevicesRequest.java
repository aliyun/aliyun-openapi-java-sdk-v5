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
public class BatchUnbindProjectDevicesRequest extends RpcAcsRequest<BatchUnbindProjectDevicesResponse> {
	   

	private String iotInstanceId;

	private String projectId;

	private List<Devices> devices;
	public BatchUnbindProjectDevicesRequest() {
		super("Iot", "2018-01-20", "BatchUnbindProjectDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public List<Devices> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Devices> devices) {
		this.devices = devices;	
		if (devices != null) {
			for (int depth1 = 0; depth1 < devices.size(); depth1++) {
				putBodyParameter("Devices." + (depth1 + 1) + ".DeviceName" , devices.get(depth1).getDeviceName());
				putBodyParameter("Devices." + (depth1 + 1) + ".ProductKey" , devices.get(depth1).getProductKey());
			}
		}	
	}

	public static class Devices {

		private String deviceName;

		private String productKey;

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}
	}

	@Override
	public Class<BatchUnbindProjectDevicesResponse> getResponseClass() {
		return BatchUnbindProjectDevicesResponse.class;
	}

}
