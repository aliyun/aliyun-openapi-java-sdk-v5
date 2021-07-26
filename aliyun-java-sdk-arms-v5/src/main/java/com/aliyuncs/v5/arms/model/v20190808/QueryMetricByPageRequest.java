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

package com.aliyuncs.v5.arms.model.v20190808;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMetricByPageRequest extends RpcAcsRequest<QueryMetricByPageResponse> {
	   

	private Long endTime;

	private String orderBy;

	private Integer currentPage;

	private Long startTime;

	private List<Filters> filters;

	private List<String> measures;

	private Integer intervalInSec;

	private String metric;

	private List<String> customFilters;

	private Integer pageSize;

	private List<String> dimensions;

	private String order;
	public QueryMetricByPageRequest() {
		super("ARMS", "2019-08-08", "QueryMetricByPage", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public List<Filters> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filters> filters) {
		this.filters = filters;	
		if (filters != null) {
			for (int depth1 = 0; depth1 < filters.size(); depth1++) {
				putQueryParameter("Filters." + (depth1 + 1) + ".Value" , filters.get(depth1).getValue());
				putQueryParameter("Filters." + (depth1 + 1) + ".Key" , filters.get(depth1).getKey());
			}
		}	
	}

	public List<String> getMeasures() {
		return this.measures;
	}

	public void setMeasures(List<String> measures) {
		this.measures = measures;	
		if (measures != null) {
			for (int i = 0; i < measures.size(); i++) {
				putQueryParameter("Measures." + (i + 1) , measures.get(i));
			}
		}	
	}

	public Integer getIntervalInSec() {
		return this.intervalInSec;
	}

	public void setIntervalInSec(Integer intervalInSec) {
		this.intervalInSec = intervalInSec;
		if(intervalInSec != null){
			putQueryParameter("IntervalInSec", intervalInSec.toString());
		}
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putQueryParameter("Metric", metric);
		}
	}

	public List<String> getCustomFilters() {
		return this.customFilters;
	}

	public void setCustomFilters(List<String> customFilters) {
		this.customFilters = customFilters;	
		if (customFilters != null) {
			for (int i = 0; i < customFilters.size(); i++) {
				putQueryParameter("CustomFilters." + (i + 1) , customFilters.get(i));
			}
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

	public List<String> getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(List<String> dimensions) {
		this.dimensions = dimensions;	
		if (dimensions != null) {
			for (int i = 0; i < dimensions.size(); i++) {
				putQueryParameter("Dimensions." + (i + 1) , dimensions.get(i));
			}
		}	
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public static class Filters {

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
	public Class<QueryMetricByPageResponse> getResponseClass() {
		return QueryMetricByPageResponse.class;
	}

}
