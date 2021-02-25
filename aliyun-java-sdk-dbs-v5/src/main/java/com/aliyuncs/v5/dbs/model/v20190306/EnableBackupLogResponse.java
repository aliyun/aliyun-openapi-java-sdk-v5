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

package com.aliyuncs.v5.dbs.model.v20190306;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.dbs.transform.v20190306.EnableBackupLogResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EnableBackupLogResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private String backupPlanId;

	private Boolean needPrecheck;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
	}

	public Boolean getNeedPrecheck() {
		return this.needPrecheck;
	}

	public void setNeedPrecheck(Boolean needPrecheck) {
		this.needPrecheck = needPrecheck;
	}

	@Override
	public EnableBackupLogResponse getInstance(UnmarshallerContext context) {
		return	EnableBackupLogResponseUnmarshaller.unmarshall(this, context);
	}
}
