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
public class GetJobDetailRequest extends RpcAcsRequest<GetJobDetailResponse> {
	   

	private String jobId;

	private String vcName;
	public GetJobDetailRequest() {
		super("openanalytics-open", "2018-06-19", "GetJobDetail", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	public String getVcName() {
		return this.vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
		if(vcName != null){
			putBodyParameter("VcName", vcName);
		}
	}

	@Override
	public Class<GetJobDetailResponse> getResponseClass() {
		return GetJobDetailResponse.class;
	}

}
