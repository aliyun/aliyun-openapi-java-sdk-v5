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
public class CreateTopicRouteTableRequest extends RpcAcsRequest<CreateTopicRouteTableResponse> {
	   

	private String iotInstanceId;

	private List<String> dstTopic;

	private String srcTopic;
	public CreateTopicRouteTableRequest() {
		super("Iot", "2018-01-20", "CreateTopicRouteTable", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<String> getDstTopic() {
		return this.dstTopic;
	}

	public void setDstTopic(List<String> dstTopic) {
		this.dstTopic = dstTopic;	
		if (dstTopic != null) {
			for (int i = 0; i < dstTopic.size(); i++) {
				putQueryParameter("DstTopic." + (i + 1) , dstTopic.get(i));
			}
		}	
	}

	public String getSrcTopic() {
		return this.srcTopic;
	}

	public void setSrcTopic(String srcTopic) {
		this.srcTopic = srcTopic;
		if(srcTopic != null){
			putQueryParameter("SrcTopic", srcTopic);
		}
	}

	@Override
	public Class<CreateTopicRouteTableResponse> getResponseClass() {
		return CreateTopicRouteTableResponse.class;
	}

}
