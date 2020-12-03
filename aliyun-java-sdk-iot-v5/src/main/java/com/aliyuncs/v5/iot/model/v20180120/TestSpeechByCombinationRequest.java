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
public class TestSpeechByCombinationRequest extends RpcAcsRequest<TestSpeechByCombinationResponse> {
	   

	private String projectCode;

	private List<String> combinationList;
	public TestSpeechByCombinationRequest() {
		super("Iot", "2018-01-20", "TestSpeechByCombination", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getCombinationList() {
		return this.combinationList;
	}

	public void setCombinationList(List<String> combinationList) {
		this.combinationList = combinationList;	
		if (combinationList != null) {
			for (int i = 0; i < combinationList.size(); i++) {
				putBodyParameter("CombinationList." + (i + 1) , combinationList.get(i));
			}
		}	
	}

	@Override
	public Class<TestSpeechByCombinationResponse> getResponseClass() {
		return TestSpeechByCombinationResponse.class;
	}

}
