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

package com.aliyuncs.v5.drds.model.v20190123;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SqlCompatibilityStartRequest extends RpcAcsRequest<SqlCompatibilityStartResponse> {
	   

	private String targetVersion;

	private String drdsInstanceId;

	private Boolean performanceTest;
	public SqlCompatibilityStartRequest() {
		super("Drds", "2019-01-23", "SqlCompatibilityStart", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetVersion() {
		return this.targetVersion;
	}

	public void setTargetVersion(String targetVersion) {
		this.targetVersion = targetVersion;
		if(targetVersion != null){
			putQueryParameter("TargetVersion", targetVersion);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public Boolean getPerformanceTest() {
		return this.performanceTest;
	}

	public void setPerformanceTest(Boolean performanceTest) {
		this.performanceTest = performanceTest;
		if(performanceTest != null){
			putQueryParameter("PerformanceTest", performanceTest.toString());
		}
	}

	@Override
	public Class<SqlCompatibilityStartResponse> getResponseClass() {
		return SqlCompatibilityStartResponse.class;
	}

}
