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

package com.aliyuncs.v5.cloudauth.model.v20190307;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.cloudauth.transform.v20190307.InitFaceVerifyResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InitFaceVerifyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private ResultObject resultObject;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultObject getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(ResultObject resultObject) {
		this.resultObject = resultObject;
	}

	public static class ResultObject {

		private String certifyId;

		private String certifyUrl;

		public String getCertifyId() {
			return this.certifyId;
		}

		public void setCertifyId(String certifyId) {
			this.certifyId = certifyId;
		}

		public String getCertifyUrl() {
			return this.certifyUrl;
		}

		public void setCertifyUrl(String certifyUrl) {
			this.certifyUrl = certifyUrl;
		}
	}

	@Override
	public InitFaceVerifyResponse getInstance(UnmarshallerContext context) {
		return	InitFaceVerifyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}