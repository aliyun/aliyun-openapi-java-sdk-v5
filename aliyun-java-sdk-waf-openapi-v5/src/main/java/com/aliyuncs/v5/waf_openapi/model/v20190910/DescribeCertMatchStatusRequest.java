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

package com.aliyuncs.v5.waf_openapi.model.v20190910;

import com.aliyuncs.v5.RpcAcsRequest;
import com.aliyuncs.v5.http.ProtocolType;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertMatchStatusRequest extends RpcAcsRequest<DescribeCertMatchStatusResponse> {
	   

	private String certificate;

	private String privateKey;

	private String instanceId;

	private String domain;
	public DescribeCertMatchStatusRequest() {
		super("waf-openapi", "2019-09-10", "DescribeCertMatchStatus", "waf");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCertificate() {
		return this.certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
		if(certificate != null){
			putQueryParameter("Certificate", certificate);
		}
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<DescribeCertMatchStatusResponse> getResponseClass() {
		return DescribeCertMatchStatusResponse.class;
	}

}
