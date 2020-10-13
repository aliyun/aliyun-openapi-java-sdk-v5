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

package com.aliyuncs.v5.market.model.v20151101;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.market.transform.v20151101.CreateApplicationResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String appCode;

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}
	}

	@Override
	public CreateApplicationResponse getInstance(UnmarshallerContext context) {
		return	CreateApplicationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
