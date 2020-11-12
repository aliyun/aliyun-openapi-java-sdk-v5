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

package com.aliyuncs.v5.openanalytics_open.model.v20180619;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetCapacityLimitPolicyRequest extends RpcAcsRequest<SetCapacityLimitPolicyResponse> {
	   

	private String policy;

	private String externalBizAliyunUid;
	public SetCapacityLimitPolicyRequest() {
		super("openanalytics-open", "2018-06-19", "SetCapacityLimitPolicy", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putBodyParameter("Policy", policy);
		}
	}

	public String getExternalBizAliyunUid() {
		return this.externalBizAliyunUid;
	}

	public void setExternalBizAliyunUid(String externalBizAliyunUid) {
		this.externalBizAliyunUid = externalBizAliyunUid;
		if(externalBizAliyunUid != null){
			putBodyParameter("ExternalBizAliyunUid", externalBizAliyunUid);
		}
	}

	@Override
	public Class<SetCapacityLimitPolicyResponse> getResponseClass() {
		return SetCapacityLimitPolicyResponse.class;
	}

}
