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

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.rds.transform.v20140815.DescribeAvailableDedicatedHostClassesResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableDedicatedHostClassesResponse extends AcsResponse {

	private String requestId;

	private List<HostClassesItem> hostClasses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HostClassesItem> getHostClasses() {
		return this.hostClasses;
	}

	public void setHostClasses(List<HostClassesItem> hostClasses) {
		this.hostClasses = hostClasses;
	}

	public static class HostClassesItem {

		private String hostClassName;

		private String description;

		public String getHostClassName() {
			return this.hostClassName;
		}

		public void setHostClassName(String hostClassName) {
			this.hostClassName = hostClassName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeAvailableDedicatedHostClassesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableDedicatedHostClassesResponseUnmarshaller.unmarshall(this, context);
	}
}
