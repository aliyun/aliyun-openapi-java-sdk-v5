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

package com.aliyuncs.v5.domain.model.v20180208;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReserveDomainRequest extends RpcAcsRequest<ReserveDomainResponse> {
	   

	private List<String> channels;

	private String domainName;
	public ReserveDomainRequest() {
		super("Domain", "2018-02-08", "ReserveDomain", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getChannels() {
		return this.channels;
	}

	public void setChannels(List<String> channels) {
		this.channels = channels;	
		if (channels != null) {
			for (int i = 0; i < channels.size(); i++) {
				putBodyParameter("Channels." + (i + 1) , channels.get(i));
			}
		}	
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	@Override
	public Class<ReserveDomainResponse> getResponseClass() {
		return ReserveDomainResponse.class;
	}

}
