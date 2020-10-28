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

package com.aliyuncs.v5.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.polardbx.transform.v20200202.DescribeSecurityIpsResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityIpsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dBInstanceName;

		private List<GroupItem> groupItems;

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public List<GroupItem> getGroupItems() {
			return this.groupItems;
		}

		public void setGroupItems(List<GroupItem> groupItems) {
			this.groupItems = groupItems;
		}

		public static class GroupItem {

			private String groupName;

			private String securityIPList;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getSecurityIPList() {
				return this.securityIPList;
			}

			public void setSecurityIPList(String securityIPList) {
				this.securityIPList = securityIPList;
			}
		}
	}

	@Override
	public DescribeSecurityIpsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
