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

package com.aliyuncs.v5.openanalytics_open.model.v20180619;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskSumRequest extends RpcAcsRequest<QueryTaskSumResponse> {
	   

	private String twoDaysAgoBeginTs;

	private String yesterdayBeginTs;

	private String todayBeginTs;
	public QueryTaskSumRequest() {
		super("openanalytics-open", "2018-06-19", "QueryTaskSum", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTwoDaysAgoBeginTs() {
		return this.twoDaysAgoBeginTs;
	}

	public void setTwoDaysAgoBeginTs(String twoDaysAgoBeginTs) {
		this.twoDaysAgoBeginTs = twoDaysAgoBeginTs;
		if(twoDaysAgoBeginTs != null){
			putBodyParameter("TwoDaysAgoBeginTs", twoDaysAgoBeginTs);
		}
	}

	public String getYesterdayBeginTs() {
		return this.yesterdayBeginTs;
	}

	public void setYesterdayBeginTs(String yesterdayBeginTs) {
		this.yesterdayBeginTs = yesterdayBeginTs;
		if(yesterdayBeginTs != null){
			putBodyParameter("YesterdayBeginTs", yesterdayBeginTs);
		}
	}

	public String getTodayBeginTs() {
		return this.todayBeginTs;
	}

	public void setTodayBeginTs(String todayBeginTs) {
		this.todayBeginTs = todayBeginTs;
		if(todayBeginTs != null){
			putBodyParameter("TodayBeginTs", todayBeginTs);
		}
	}

	@Override
	public Class<QueryTaskSumResponse> getResponseClass() {
		return QueryTaskSumResponse.class;
	}

}
