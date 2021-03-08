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

package com.aliyuncs.v5.domain.model.v20180129;

import com.aliyuncs.v5.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.v5.http.MethodType;
import com.aliyuncs.v5.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForReserveDropListDomainRequest extends RpcAcsRequest<SaveBatchTaskForReserveDropListDomainResponse> {
	   

	private List<Domains> domains;

	private String contactTemplateId;
	public SaveBatchTaskForReserveDropListDomainRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForReserveDropListDomain", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Domains> getDomains() {
		return this.domains;
	}

	public void setDomains(List<Domains> domains) {
		this.domains = domains;	
		if (domains != null) {
			for (int depth1 = 0; depth1 < domains.size(); depth1++) {
				putQueryParameter("Domains." + (depth1 + 1) + ".DomainName" , domains.get(depth1).getDomainName());
			}
		}	
	}

	public String getContactTemplateId() {
		return this.contactTemplateId;
	}

	public void setContactTemplateId(String contactTemplateId) {
		this.contactTemplateId = contactTemplateId;
		if(contactTemplateId != null){
			putQueryParameter("ContactTemplateId", contactTemplateId);
		}
	}

	public static class Domains {

		private String domainName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForReserveDropListDomainResponse> getResponseClass() {
		return SaveBatchTaskForReserveDropListDomainResponse.class;
	}

}
