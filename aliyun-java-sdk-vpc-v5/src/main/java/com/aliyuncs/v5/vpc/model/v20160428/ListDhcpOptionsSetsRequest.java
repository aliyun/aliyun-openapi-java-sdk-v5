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
public class ListDhcpOptionsSetsRequest extends RpcAcsRequest<ListDhcpOptionsSetsResponse> {
	   

	private Long resourceOwnerId;

	private String nextToken;

	private List<String> dhcpOptionsSetId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String domainName;

	private Long ownerId;

	private String dhcpOptionsSetName;

	private Integer maxResults;
	public ListDhcpOptionsSetsRequest() {
		super("Vpc", "2016-04-28", "ListDhcpOptionsSets", "vpc");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getDhcpOptionsSetId() {
		return this.dhcpOptionsSetId;
	}

	public void setDhcpOptionsSetId(List<String> dhcpOptionsSetId) {
		this.dhcpOptionsSetId = dhcpOptionsSetId;	
		if (dhcpOptionsSetId != null) {
			for (int i = 0; i < dhcpOptionsSetId.size(); i++) {
				putQueryParameter("DhcpOptionsSetId." + (i + 1) , dhcpOptionsSetId.get(i));
			}
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getDhcpOptionsSetName() {
		return this.dhcpOptionsSetName;
	}

	public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
		this.dhcpOptionsSetName = dhcpOptionsSetName;
		if(dhcpOptionsSetName != null){
			putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListDhcpOptionsSetsResponse> getResponseClass() {
		return ListDhcpOptionsSetsResponse.class;
	}

}
