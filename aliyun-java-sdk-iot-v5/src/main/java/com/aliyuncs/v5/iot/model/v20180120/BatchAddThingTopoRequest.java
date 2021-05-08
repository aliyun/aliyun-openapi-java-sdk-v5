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
public class BatchAddThingTopoRequest extends RpcAcsRequest<BatchAddThingTopoResponse> {
	   

	private String gwProductKey;

	private String iotInstanceId;

	private List<TopoAddItem> topoAddItem;

	private String gwDeviceName;
	public BatchAddThingTopoRequest() {
		super("Iot", "2018-01-20", "BatchAddThingTopo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGwProductKey() {
		return this.gwProductKey;
	}

	public void setGwProductKey(String gwProductKey) {
		this.gwProductKey = gwProductKey;
		if(gwProductKey != null){
			putQueryParameter("GwProductKey", gwProductKey);
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

	public List<TopoAddItem> getTopoAddItem() {
		return this.topoAddItem;
	}

	public void setTopoAddItem(List<TopoAddItem> topoAddItem) {
		this.topoAddItem = topoAddItem;	
		if (topoAddItem != null) {
			for (int depth1 = 0; depth1 < topoAddItem.size(); depth1++) {
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".ClientId" , topoAddItem.get(depth1).getClientId());
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".SignMethod" , topoAddItem.get(depth1).getSignMethod());
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".Sign" , topoAddItem.get(depth1).getSign());
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".DeviceName" , topoAddItem.get(depth1).getDeviceName());
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".ProductKey" , topoAddItem.get(depth1).getProductKey());
				putQueryParameter("TopoAddItem." + (depth1 + 1) + ".Timestamp" , topoAddItem.get(depth1).getTimestamp());
			}
		}	
	}

	public String getGwDeviceName() {
		return this.gwDeviceName;
	}

	public void setGwDeviceName(String gwDeviceName) {
		this.gwDeviceName = gwDeviceName;
		if(gwDeviceName != null){
			putQueryParameter("GwDeviceName", gwDeviceName);
		}
	}

	public static class TopoAddItem {

		private String clientId;

		private String signMethod;

		private String sign;

		private String deviceName;

		private String productKey;

		private String timestamp;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSignMethod() {
			return this.signMethod;
		}

		public void setSignMethod(String signMethod) {
			this.signMethod = signMethod;
		}

		public String getSign() {
			return this.sign;
		}

		public void setSign(String sign) {
			this.sign = sign;
		}

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

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public Class<BatchAddThingTopoResponse> getResponseClass() {
		return BatchAddThingTopoResponse.class;
	}

}
