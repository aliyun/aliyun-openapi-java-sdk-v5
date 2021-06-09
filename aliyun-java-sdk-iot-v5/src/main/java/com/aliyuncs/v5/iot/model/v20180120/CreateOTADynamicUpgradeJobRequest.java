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
public class CreateOTADynamicUpgradeJobRequest extends RpcAcsRequest<CreateOTADynamicUpgradeJobResponse> {
	   

	private Integer dynamicMode;

	private Integer retryCount;

	private Integer timeoutInMinutes;

	private Boolean needConfirm;

	private Boolean needPush;

	private String iotInstanceId;

	private List<Tag> tag;

	private String firmwareId;

	private String productKey;

	private Integer retryInterval;

	private List<String> srcVersion;

	private Integer overwriteMode;

	private Integer maximumPerMinute;
	public CreateOTADynamicUpgradeJobRequest() {
		super("Iot", "2018-01-20", "CreateOTADynamicUpgradeJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDynamicMode() {
		return this.dynamicMode;
	}

	public void setDynamicMode(Integer dynamicMode) {
		this.dynamicMode = dynamicMode;
		if(dynamicMode != null){
			putQueryParameter("DynamicMode", dynamicMode.toString());
		}
	}

	public Integer getRetryCount() {
		return this.retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
		if(retryCount != null){
			putQueryParameter("RetryCount", retryCount.toString());
		}
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
		if(timeoutInMinutes != null){
			putQueryParameter("TimeoutInMinutes", timeoutInMinutes.toString());
		}
	}

	public Boolean getNeedConfirm() {
		return this.needConfirm;
	}

	public void setNeedConfirm(Boolean needConfirm) {
		this.needConfirm = needConfirm;
		if(needConfirm != null){
			putQueryParameter("NeedConfirm", needConfirm.toString());
		}
	}

	public Boolean getNeedPush() {
		return this.needPush;
	}

	public void setNeedPush(Boolean needPush) {
		this.needPush = needPush;
		if(needPush != null){
			putQueryParameter("NeedPush", needPush.toString());
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

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
			}
		}	
	}

	public String getFirmwareId() {
		return this.firmwareId;
	}

	public void setFirmwareId(String firmwareId) {
		this.firmwareId = firmwareId;
		if(firmwareId != null){
			putQueryParameter("FirmwareId", firmwareId);
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

	public Integer getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Integer retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
		}
	}

	public List<String> getSrcVersion() {
		return this.srcVersion;
	}

	public void setSrcVersion(List<String> srcVersion) {
		this.srcVersion = srcVersion;	
		if (srcVersion != null) {
			for (int i = 0; i < srcVersion.size(); i++) {
				putQueryParameter("SrcVersion." + (i + 1) , srcVersion.get(i));
			}
		}	
	}

	public Integer getOverwriteMode() {
		return this.overwriteMode;
	}

	public void setOverwriteMode(Integer overwriteMode) {
		this.overwriteMode = overwriteMode;
		if(overwriteMode != null){
			putQueryParameter("OverwriteMode", overwriteMode.toString());
		}
	}

	public Integer getMaximumPerMinute() {
		return this.maximumPerMinute;
	}

	public void setMaximumPerMinute(Integer maximumPerMinute) {
		this.maximumPerMinute = maximumPerMinute;
		if(maximumPerMinute != null){
			putQueryParameter("MaximumPerMinute", maximumPerMinute.toString());
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateOTADynamicUpgradeJobResponse> getResponseClass() {
		return CreateOTADynamicUpgradeJobResponse.class;
	}

}
