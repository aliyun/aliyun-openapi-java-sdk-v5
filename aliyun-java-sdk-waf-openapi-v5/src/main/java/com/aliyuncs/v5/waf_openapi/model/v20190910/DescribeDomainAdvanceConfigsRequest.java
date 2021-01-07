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

package com.aliyuncs.v5.waf_openapi.model.v20190910;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainAdvanceConfigsRequest extends RpcAcsRequest<DescribeDomainAdvanceConfigsResponse> {
	   

	private String domainList;

	private String resourceGroupId;

	private String instanceId;
	public DescribeDomainAdvanceConfigsRequest() {
		super("waf-openapi", "2019-09-10", "DescribeDomainAdvanceConfigs", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDomainList() {
		return this.domainList;
	}

	public void setDomainList(String domainList) {
		this.domainList = domainList;
		if(domainList != null){
			putQueryParameter("DomainList", domainList);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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
	public Class<DescribeDomainAdvanceConfigsResponse> getResponseClass() {
		return DescribeDomainAdvanceConfigsResponse.class;
	}

}
