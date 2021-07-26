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
public class QueryDatasetRequest extends RpcAcsRequest<QueryDatasetResponse> {
	   

	private String dateStr;

	private Long minTime;

	private String proxyUserId;

	private Boolean reduceTail;

	private Long maxTime;

	private List<OptionalDims> optionalDims;

	private List<String> measures;

	private Integer intervalInSec;

	private Boolean isDrillDown;

	private Boolean hungryMode;

	private String orderByKey;

	private Integer limit;

	private Long datasetId;

	private List<RequiredDims> requiredDims;

	private List<Dimensions> dimensions;
	public QueryDatasetRequest() {
		super("ARMS", "2019-08-08", "QueryDataset", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDateStr() {
		return this.dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
		if(dateStr != null){
			putQueryParameter("DateStr", dateStr);
		}
	}

	public Long getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Long minTime) {
		this.minTime = minTime;
		if(minTime != null){
			putQueryParameter("MinTime", minTime.toString());
		}
	}

	public String getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(String proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId);
		}
	}

	public Boolean getReduceTail() {
		return this.reduceTail;
	}

	public void setReduceTail(Boolean reduceTail) {
		this.reduceTail = reduceTail;
		if(reduceTail != null){
			putQueryParameter("ReduceTail", reduceTail.toString());
		}
	}

	public Long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
		if(maxTime != null){
			putQueryParameter("MaxTime", maxTime.toString());
		}
	}

	public List<OptionalDims> getOptionalDims() {
		return this.optionalDims;
	}

	public void setOptionalDims(List<OptionalDims> optionalDims) {
		this.optionalDims = optionalDims;	
		if (optionalDims != null) {
			for (int depth1 = 0; depth1 < optionalDims.size(); depth1++) {
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Type" , optionalDims.get(depth1).getType());
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Value" , optionalDims.get(depth1).getValue());
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Key" , optionalDims.get(depth1).getKey());
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

	public Boolean getIsDrillDown() {
		return this.isDrillDown;
	}

	public void setIsDrillDown(Boolean isDrillDown) {
		this.isDrillDown = isDrillDown;
		if(isDrillDown != null){
			putQueryParameter("IsDrillDown", isDrillDown.toString());
		}
	}

	public Boolean getHungryMode() {
		return this.hungryMode;
	}

	public void setHungryMode(Boolean hungryMode) {
		this.hungryMode = hungryMode;
		if(hungryMode != null){
			putQueryParameter("HungryMode", hungryMode.toString());
		}
	}

	public String getOrderByKey() {
		return this.orderByKey;
	}

	public void setOrderByKey(String orderByKey) {
		this.orderByKey = orderByKey;
		if(orderByKey != null){
			putQueryParameter("OrderByKey", orderByKey);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Long getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putQueryParameter("DatasetId", datasetId.toString());
		}
	}

	public List<RequiredDims> getRequiredDims() {
		return this.requiredDims;
	}

	public void setRequiredDims(List<RequiredDims> requiredDims) {
		this.requiredDims = requiredDims;	
		if (requiredDims != null) {
			for (int depth1 = 0; depth1 < requiredDims.size(); depth1++) {
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Type" , requiredDims.get(depth1).getType());
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Value" , requiredDims.get(depth1).getValue());
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Key" , requiredDims.get(depth1).getKey());
			}
		}	
	}

	public List<Dimensions> getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(List<Dimensions> dimensions) {
		this.dimensions = dimensions;	
		if (dimensions != null) {
			for (int depth1 = 0; depth1 < dimensions.size(); depth1++) {
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Type" , dimensions.get(depth1).getType());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensions.get(depth1).getValue());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensions.get(depth1).getKey());
			}
		}	
	}

	public static class OptionalDims {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

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

	public static class RequiredDims {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

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

	public static class Dimensions {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

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
	public Class<QueryDatasetResponse> getResponseClass() {
		return QueryDatasetResponse.class;
	}

}
