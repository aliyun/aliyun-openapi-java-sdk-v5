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

import java.util.List;
import java.util.Map;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.iot.transform.v20180120.CreateTopicRouteTableResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTopicRouteTableResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private Boolean isAllSucceed;

	private String errorMessage;

	private List<Map<Object,Object>> failureTopics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getIsAllSucceed() {
		return this.isAllSucceed;
	}

	public void setIsAllSucceed(Boolean isAllSucceed) {
		this.isAllSucceed = isAllSucceed;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Map<Object,Object>> getFailureTopics() {
		return this.failureTopics;
	}

	public void setFailureTopics(List<Map<Object,Object>> failureTopics) {
		this.failureTopics = failureTopics;
	}

	@Override
	public CreateTopicRouteTableResponse getInstance(UnmarshallerContext context) {
		return	CreateTopicRouteTableResponseUnmarshaller.unmarshall(this, context);
	}
}
