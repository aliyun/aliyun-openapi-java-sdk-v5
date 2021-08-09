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
public class ModifySubscriptionRequest extends RpcAcsRequest<ModifySubscriptionResponse> {
	   

	private String dbList;

	private Boolean subscriptionDataTypeDDL;

	private Boolean subscriptionDataTypeDML;

	private String dtsJobId;

	private String dtsInstanceId;
	public ModifySubscriptionRequest() {
		super("Dts", "2020-01-01", "ModifySubscription", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDbList() {
		return this.dbList;
	}

	public void setDbList(String dbList) {
		this.dbList = dbList;
		if(dbList != null){
			putQueryParameter("DbList", dbList);
		}
	}

	public Boolean getSubscriptionDataTypeDDL() {
		return this.subscriptionDataTypeDDL;
	}

	public void setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
		this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
		if(subscriptionDataTypeDDL != null){
			putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL.toString());
		}
	}

	public Boolean getSubscriptionDataTypeDML() {
		return this.subscriptionDataTypeDML;
	}

	public void setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
		this.subscriptionDataTypeDML = subscriptionDataTypeDML;
		if(subscriptionDataTypeDML != null){
			putQueryParameter("SubscriptionDataTypeDML", subscriptionDataTypeDML.toString());
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

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	@Override
	public Class<ModifySubscriptionResponse> getResponseClass() {
		return ModifySubscriptionResponse.class;
	}

}
