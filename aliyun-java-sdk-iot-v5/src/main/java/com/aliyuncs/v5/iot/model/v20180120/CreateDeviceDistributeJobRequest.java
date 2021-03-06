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
public class CreateDeviceDistributeJobRequest extends RpcAcsRequest<CreateDeviceDistributeJobResponse> {
	   

	private String sourceInstanceId;

	private String targetAliyunId;

	private List<TargetInstanceConfig> targetInstanceConfig;

	private String productKey;

	private List<String> deviceName;

	private String targetUid;

	private Integer strategy;
	public CreateDeviceDistributeJobRequest() {
		super("Iot", "2018-01-20", "CreateDeviceDistributeJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
		if(sourceInstanceId != null){
			putBodyParameter("SourceInstanceId", sourceInstanceId);
		}
	}

	public String getTargetAliyunId() {
		return this.targetAliyunId;
	}

	public void setTargetAliyunId(String targetAliyunId) {
		this.targetAliyunId = targetAliyunId;
		if(targetAliyunId != null){
			putBodyParameter("TargetAliyunId", targetAliyunId);
		}
	}

	public List<TargetInstanceConfig> getTargetInstanceConfig() {
		return this.targetInstanceConfig;
	}

	public void setTargetInstanceConfig(List<TargetInstanceConfig> targetInstanceConfig) {
		this.targetInstanceConfig = targetInstanceConfig;	
		if (targetInstanceConfig != null) {
			for (int depth1 = 0; depth1 < targetInstanceConfig.size(); depth1++) {
				putBodyParameter("TargetInstanceConfig." + (depth1 + 1) + ".TargetInstanceId" , targetInstanceConfig.get(depth1).getTargetInstanceId());
			}
		}	
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public List<String> getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(List<String> deviceName) {
		this.deviceName = deviceName;	
		if (deviceName != null) {
			for (int i = 0; i < deviceName.size(); i++) {
				putBodyParameter("DeviceName." + (i + 1) , deviceName.get(i));
			}
		}	
	}

	public String getTargetUid() {
		return this.targetUid;
	}

	public void setTargetUid(String targetUid) {
		this.targetUid = targetUid;
		if(targetUid != null){
			putBodyParameter("TargetUid", targetUid);
		}
	}

	public Integer getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Integer strategy) {
		this.strategy = strategy;
		if(strategy != null){
			putBodyParameter("Strategy", strategy.toString());
		}
	}

	public static class TargetInstanceConfig {

		private String targetInstanceId;

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}
	}

	@Override
	public Class<CreateDeviceDistributeJobResponse> getResponseClass() {
		return CreateDeviceDistributeJobResponse.class;
	}

}
