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
public class GetSpeechModelAudioRequest extends RpcAcsRequest<GetSpeechModelAudioResponse> {
	   

	private List<String> speechModelCodeList;
	public GetSpeechModelAudioRequest() {
		super("Iot", "2018-01-20", "GetSpeechModelAudio", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSpeechModelCodeList() {
		return this.speechModelCodeList;
	}

	public void setSpeechModelCodeList(List<String> speechModelCodeList) {
		this.speechModelCodeList = speechModelCodeList;	
		if (speechModelCodeList != null) {
			for (int i = 0; i < speechModelCodeList.size(); i++) {
				putBodyParameter("SpeechModelCodeList." + (i + 1) , speechModelCodeList.get(i));
			}
		}	
	}

	@Override
	public Class<GetSpeechModelAudioResponse> getResponseClass() {
		return GetSpeechModelAudioResponse.class;
	}

}
