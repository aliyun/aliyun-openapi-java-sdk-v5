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

package com.aliyuncs.v5.vpc.model.v20160428;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGlobalAccelerationInstanceIpRequest extends RpcAcsRequest<AddGlobalAccelerationInstanceIpResponse> {
	   

	private Long resourceOwnerId;

	private String globalAccelerationInstanceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String ipInstanceId;
	public AddGlobalAccelerationInstanceIpRequest() {
		super("Vpc", "2016-04-28", "AddGlobalAccelerationInstanceIp", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getGlobalAccelerationInstanceId() {
		return this.globalAccelerationInstanceId;
	}

	public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
		this.globalAccelerationInstanceId = globalAccelerationInstanceId;
		if(globalAccelerationInstanceId != null){
			putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getIpInstanceId() {
		return this.ipInstanceId;
	}

	public void setIpInstanceId(String ipInstanceId) {
		this.ipInstanceId = ipInstanceId;
		if(ipInstanceId != null){
			putQueryParameter("IpInstanceId", ipInstanceId);
		}
	}

	@Override
	public Class<AddGlobalAccelerationInstanceIpResponse> getResponseClass() {
		return AddGlobalAccelerationInstanceIpResponse.class;
	}

}
