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

package com.aliyuncs.v5.cs.model.v20151215;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.cs.transform.v20151215.GetUpgradeStatusResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUpgradeStatusResponse extends AcsResponse {

	private String error_message;

	private String precheck_report_id;

	private String upgrade_step;

	private String status;

	public String getError_message() {
		return this.error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	public String getPrecheck_report_id() {
		return this.precheck_report_id;
	}

	public void setPrecheck_report_id(String precheck_report_id) {
		this.precheck_report_id = precheck_report_id;
	}

	public String getUpgrade_step() {
		return this.upgrade_step;
	}

	public void setUpgrade_step(String upgrade_step) {
		this.upgrade_step = upgrade_step;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public GetUpgradeStatusResponse getInstance(UnmarshallerContext context) {
		return	GetUpgradeStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
