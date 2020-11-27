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

package com.aliyuncs.v5.polardbx.model.v20200202;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceStoragePerformanceRequest extends RpcAcsRequest<DescribeInstanceStoragePerformanceResponse> {
	   

	private String dbInstanceName;

	private String storageInstanceId;

	private String keys;

	private String endTime;

	private String startTime;
	public DescribeInstanceStoragePerformanceRequest() {
		super("polardbx", "2020-02-02", "DescribeInstanceStoragePerformance", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDbInstanceName() {
		return this.dbInstanceName;
	}

	public void setDbInstanceName(String dbInstanceName) {
		this.dbInstanceName = dbInstanceName;
		if(dbInstanceName != null){
			putQueryParameter("DbInstanceName", dbInstanceName);
		}
	}

	public String getStorageInstanceId() {
		return this.storageInstanceId;
	}

	public void setStorageInstanceId(String storageInstanceId) {
		this.storageInstanceId = storageInstanceId;
		if(storageInstanceId != null){
			putQueryParameter("StorageInstanceId", storageInstanceId);
		}
	}

	public String getKeys() {
		return this.keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
		if(keys != null){
			putQueryParameter("Keys", keys);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	@Override
	public Class<DescribeInstanceStoragePerformanceResponse> getResponseClass() {
		return DescribeInstanceStoragePerformanceResponse.class;
	}

}
