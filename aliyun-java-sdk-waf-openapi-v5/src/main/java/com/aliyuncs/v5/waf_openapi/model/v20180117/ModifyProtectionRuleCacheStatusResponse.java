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

package com.aliyuncs.v5.waf_openapi.model.v20180117;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.waf_openapi.transform.v20180117.ModifyProtectionRuleCacheStatusResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyProtectionRuleCacheStatusResponse extends AcsResponse {

	private String requestId;

	private Integer taskStatus;

	private Integer wafTaskId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getWafTaskId() {
		return this.wafTaskId;
	}

	public void setWafTaskId(Integer wafTaskId) {
		this.wafTaskId = wafTaskId;
	}

	@Override
	public ModifyProtectionRuleCacheStatusResponse getInstance(UnmarshallerContext context) {
		return	ModifyProtectionRuleCacheStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
