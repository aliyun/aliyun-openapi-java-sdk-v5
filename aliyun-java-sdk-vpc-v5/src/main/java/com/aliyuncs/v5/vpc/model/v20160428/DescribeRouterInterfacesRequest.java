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
public class DescribeRouterInterfacesRequest extends RpcAcsRequest<DescribeRouterInterfacesResponse> {
	   

	private Long resourceOwnerId;

	private Boolean includeReservationData;

	private Integer pageNumber;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private Long ownerId;

	private List<Filter> filter;
	public DescribeRouterInterfacesRequest() {
		super("Vpc", "2016-04-28", "DescribeRouterInterfaces", "vpc");
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

	public Boolean getIncludeReservationData() {
		return this.includeReservationData;
	}

	public void setIncludeReservationData(Boolean includeReservationData) {
		this.includeReservationData = includeReservationData;
		if(includeReservationData != null){
			putQueryParameter("IncludeReservationData", includeReservationData.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<Filter> getFilter() {
		return this.filter;
	}

	public void setFilter(List<Filter> filter) {
		this.filter = filter;	
		if (filter != null) {
			for (int depth1 = 0; depth1 < filter.size(); depth1++) {
				if (filter.get(depth1).getValue() != null) {
					for (int i = 0; i < filter.get(depth1).getValue().size(); i++) {
						putQueryParameter("Filter." + (depth1 + 1) + ".Value." + (i + 1) , filter.get(depth1).getValue().get(i));
					}
				}
				putQueryParameter("Filter." + (depth1 + 1) + ".Key" , filter.get(depth1).getKey());
			}
		}	
	}

	public static class Filter {

		private List<String> value;

		private String key;

		public List<String> getValue() {
			return this.value;
		}

		public void setValue(List<String> value) {
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
	public Class<DescribeRouterInterfacesResponse> getResponseClass() {
		return DescribeRouterInterfacesResponse.class;
	}

}
