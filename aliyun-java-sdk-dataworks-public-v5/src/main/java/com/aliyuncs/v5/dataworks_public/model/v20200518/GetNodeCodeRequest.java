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
public class GetNodeCodeRequest extends RpcAcsRequest<GetNodeCodeResponse> {
	   

	private String projectEnv;

	private Long nodeId;
	public GetNodeCodeRequest() {
		super("dataworks-public", "2020-05-18", "GetNodeCode", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectEnv() {
		return this.projectEnv;
	}

	public void setProjectEnv(String projectEnv) {
		this.projectEnv = projectEnv;
		if(projectEnv != null){
			putBodyParameter("ProjectEnv", projectEnv);
		}
	}

	public Long getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putBodyParameter("NodeId", nodeId.toString());
		}
	}

	@Override
	public Class<GetNodeCodeResponse> getResponseClass() {
		return GetNodeCodeResponse.class;
	}

}
