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

package com.aliyuncs.v5.market.model.v20151101;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeProductsRequest extends RpcAcsRequest<DescribeProductsResponse> {
	   

	private List<Filter> filter;

	private String searchTerm;

	private Integer pageSize;

	private Integer pageNumber;
	public DescribeProductsRequest() {
		super("Market", "2015-11-01", "DescribeProducts", "market");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Filter> getFilter() {
		return this.filter;
	}

	public void setFilter(List<Filter> filter) {
		this.filter = filter;	
		if (filter != null) {
			for (int depth1 = 0; depth1 < filter.size(); depth1++) {
				putQueryParameter("Filter." + (depth1 + 1) + ".Value" , filter.get(depth1).getValue());
				putQueryParameter("Filter." + (depth1 + 1) + ".Key" , filter.get(depth1).getKey());
			}
		}	
	}

	public String getSearchTerm() {
		return this.searchTerm;
	}

	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
		if(searchTerm != null){
			putQueryParameter("SearchTerm", searchTerm);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public static class Filter {

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
	public Class<DescribeProductsResponse> getResponseClass() {
		return DescribeProductsResponse.class;
	}

}
