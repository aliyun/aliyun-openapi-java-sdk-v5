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
import com.aliyuncs.v5.vpc.transform.v20160428.CreateGlobalAccelerationInstanceResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateGlobalAccelerationInstanceResponse extends AcsResponse {

	private String requestId;

	private String globalAccelerationInstanceId;

	private String ipAddress;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGlobalAccelerationInstanceId() {
		return this.globalAccelerationInstanceId;
	}

	public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
		this.globalAccelerationInstanceId = globalAccelerationInstanceId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Override
	public CreateGlobalAccelerationInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateGlobalAccelerationInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
