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
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddCommonBandwidthPackageIpsRequest extends RpcAcsRequest<AddCommonBandwidthPackageIpsResponse> {
	   

	private Long resourceOwnerId;

	private List<String> ipInstanceIds;

	private String bandwidthPackageId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String ipType;
	public AddCommonBandwidthPackageIpsRequest() {
		super("Vpc", "2016-04-28", "AddCommonBandwidthPackageIps", "vpc");
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

	public List<String> getIpInstanceIds() {
		return this.ipInstanceIds;
	}

	public void setIpInstanceIds(List<String> ipInstanceIds) {
		this.ipInstanceIds = ipInstanceIds;	
		if (ipInstanceIds != null) {
			for (int i = 0; i < ipInstanceIds.size(); i++) {
				putQueryParameter("IpInstanceIds." + (i + 1) , ipInstanceIds.get(i));
			}
		}	
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
		if(bandwidthPackageId != null){
			putQueryParameter("BandwidthPackageId", bandwidthPackageId);
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

	public String getIpType() {
		return this.ipType;
	}

	public void setIpType(String ipType) {
		this.ipType = ipType;
		if(ipType != null){
			putQueryParameter("IpType", ipType);
		}
	}

	@Override
	public Class<AddCommonBandwidthPackageIpsResponse> getResponseClass() {
		return AddCommonBandwidthPackageIpsResponse.class;
	}

}
