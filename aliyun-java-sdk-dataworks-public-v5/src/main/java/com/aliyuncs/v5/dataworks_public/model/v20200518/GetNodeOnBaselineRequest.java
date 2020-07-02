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

package com.aliyuncs.v5.dataworks_public.model.v20200518;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetNodeOnBaselineRequest extends RpcAcsRequest<GetNodeOnBaselineResponse> {
	   

	private Long baselineId;
	public GetNodeOnBaselineRequest() {
		super("dataworks-public", "2020-05-18", "GetNodeOnBaseline", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(Long baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putBodyParameter("BaselineId", baselineId.toString());
		}
	}

	@Override
	public Class<GetNodeOnBaselineResponse> getResponseClass() {
		return GetNodeOnBaselineResponse.class;
	}

}
