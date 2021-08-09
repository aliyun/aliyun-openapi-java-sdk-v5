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

package com.aliyuncs.v5.dts.model.v20200101;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePreCheckStatusRequest extends RpcAcsRequest<DescribePreCheckStatusResponse> {
	   

	private String structType;

	private String pageNo;

	private String pageSize;

	private String jobCode;

	private String dtsJobId;

	private String structPhase;
	public DescribePreCheckStatusRequest() {
		super("Dts", "2020-01-01", "DescribePreCheckStatus", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStructType() {
		return this.structType;
	}

	public void setStructType(String structType) {
		this.structType = structType;
		if(structType != null){
			putQueryParameter("StructType", structType);
		}
	}

	public String getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getJobCode() {
		return this.jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
		if(jobCode != null){
			putQueryParameter("JobCode", jobCode);
		}
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	public String getStructPhase() {
		return this.structPhase;
	}

	public void setStructPhase(String structPhase) {
		this.structPhase = structPhase;
		if(structPhase != null){
			putQueryParameter("StructPhase", structPhase);
		}
	}

	@Override
	public Class<DescribePreCheckStatusResponse> getResponseClass() {
		return DescribePreCheckStatusResponse.class;
	}

}
