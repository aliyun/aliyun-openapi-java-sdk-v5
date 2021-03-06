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
public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest extends RpcAcsRequest<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> {
	   

	private String contactType;

	private Long registrantProfileId;

	private List<String> domainName;

	private Boolean transferOutProhibited;

	private String userClientIp;

	private String lang;
	public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForUpdatingContactInfoByRegistrantProfileId", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.v5.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
		if(contactType != null){
			putQueryParameter("ContactType", contactType);
		}
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
		}
	}

	public List<String> getDomainName() {
		return this.domainName;
	}

	public void setDomainName(List<String> domainName) {
		this.domainName = domainName;	
		if (domainName != null) {
			for (int i = 0; i < domainName.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainName.get(i));
			}
		}	
	}

	public Boolean getTransferOutProhibited() {
		return this.transferOutProhibited;
	}

	public void setTransferOutProhibited(Boolean transferOutProhibited) {
		this.transferOutProhibited = transferOutProhibited;
		if(transferOutProhibited != null){
			putQueryParameter("TransferOutProhibited", transferOutProhibited.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse> getResponseClass() {
		return SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse.class;
	}

}
