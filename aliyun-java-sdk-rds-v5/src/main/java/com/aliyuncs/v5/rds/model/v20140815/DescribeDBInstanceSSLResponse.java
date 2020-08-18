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

package com.aliyuncs.v5.rds.model.v20140815;

import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.rds.transform.v20140815.DescribeDBInstanceSSLResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSSLResponse extends AcsResponse {

	private String requestId;

	private String connectionString;

	private String sSLExpireTime;

	private String requireUpdate;

	private String requireUpdateReason;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getSSLExpireTime() {
		return this.sSLExpireTime;
	}

	public void setSSLExpireTime(String sSLExpireTime) {
		this.sSLExpireTime = sSLExpireTime;
	}

	public String getRequireUpdate() {
		return this.requireUpdate;
	}

	public void setRequireUpdate(String requireUpdate) {
		this.requireUpdate = requireUpdate;
	}

	public String getRequireUpdateReason() {
		return this.requireUpdateReason;
	}

	public void setRequireUpdateReason(String requireUpdateReason) {
		this.requireUpdateReason = requireUpdateReason;
	}

	@Override
	public DescribeDBInstanceSSLResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSSLResponseUnmarshaller.unmarshall(this, context);
	}
}
