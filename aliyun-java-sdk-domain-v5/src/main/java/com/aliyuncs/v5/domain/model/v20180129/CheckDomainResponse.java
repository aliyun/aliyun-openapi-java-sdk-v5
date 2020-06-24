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

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.domain.transform.v20180129.CheckDomainResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckDomainResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String avail;

	private String premium;

	private String reason;

	private Long price;

	private Boolean dynamicCheck;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getAvail() {
		return this.avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public String getPremium() {
		return this.premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Boolean getDynamicCheck() {
		return this.dynamicCheck;
	}

	public void setDynamicCheck(Boolean dynamicCheck) {
		this.dynamicCheck = dynamicCheck;
	}

	@Override
	public CheckDomainResponse getInstance(UnmarshallerContext context) {
		return	CheckDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
