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

package com.aliyuncs.v5.aliyuncvc.model.v20191030;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EndLiveRequest extends RpcAcsRequest<EndLiveResponse> {
	   

	private String liveUUID;

	private String userId;
	public EndLiveRequest() {
		super("aliyuncvc", "2019-10-30", "EndLive", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLiveUUID() {
		return this.liveUUID;
	}

	public void setLiveUUID(String liveUUID) {
		this.liveUUID = liveUUID;
		if(liveUUID != null){
			putBodyParameter("LiveUUID", liveUUID);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	@Override
	public Class<EndLiveResponse> getResponseClass() {
		return EndLiveResponse.class;
	}

}
