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

package com.aliyuncs.v5.iot.model.v20180120;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechModelPushJobRequest extends RpcAcsRequest<QuerySpeechModelPushJobResponse> {
	   

	private List<String> statusList;

	private String projectCode;

	private Integer pageId;

	private Integer pageSize;

	private String pushMode;
	public QuerySpeechModelPushJobRequest() {
		super("Iot", "2018-01-20", "QuerySpeechModelPushJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getStatusList() {
		return this.statusList;
	}

	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;	
		if (statusList != null) {
			for (int i = 0; i < statusList.size(); i++) {
				putBodyParameter("StatusList." + (i + 1) , statusList.get(i));
			}
		}	
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putBodyParameter("ProjectCode", projectCode);
		}
	}

	public Integer getPageId() {
		return this.pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
		if(pageId != null){
			putBodyParameter("PageId", pageId.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getPushMode() {
		return this.pushMode;
	}

	public void setPushMode(String pushMode) {
		this.pushMode = pushMode;
		if(pushMode != null){
			putBodyParameter("PushMode", pushMode);
		}
	}

	@Override
	public Class<QuerySpeechModelPushJobResponse> getResponseClass() {
		return QuerySpeechModelPushJobResponse.class;
	}

}
