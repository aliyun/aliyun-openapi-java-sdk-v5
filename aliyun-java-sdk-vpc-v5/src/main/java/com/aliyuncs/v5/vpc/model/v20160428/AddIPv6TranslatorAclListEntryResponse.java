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

package com.aliyuncs.v5.vpc.model.v20160428;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.vpc.transform.v20160428.AddIPv6TranslatorAclListEntryResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddIPv6TranslatorAclListEntryResponse extends AcsResponse {

	private String requestId;

	private String aclEntryId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAclEntryId() {
		return this.aclEntryId;
	}

	public void setAclEntryId(String aclEntryId) {
		this.aclEntryId = aclEntryId;
	}

	@Override
	public AddIPv6TranslatorAclListEntryResponse getInstance(UnmarshallerContext context) {
		return	AddIPv6TranslatorAclListEntryResponseUnmarshaller.unmarshall(this, context);
	}
}
