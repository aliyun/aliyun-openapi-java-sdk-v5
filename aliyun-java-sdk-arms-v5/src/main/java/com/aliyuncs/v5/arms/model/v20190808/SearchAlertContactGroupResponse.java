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

package com.aliyuncs.v5.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.v5.AcsResponse;
import com.aliyuncs.v5.arms.transform.v20190808.SearchAlertContactGroupResponseUnmarshaller;
import com.aliyuncs.v5.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAlertContactGroupResponse extends AcsResponse {

	private String requestId;

	private List<ContactGroup> contactGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContactGroup> getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(List<ContactGroup> contactGroups) {
		this.contactGroups = contactGroups;
	}

	public static class ContactGroup {

		private Long contactGroupId;

		private String contactGroupName;

		private String userId;

		private Long createTime;

		private Long updateTime;

		private List<Contact> contacts;

		public Long getContactGroupId() {
			return this.contactGroupId;
		}

		public void setContactGroupId(Long contactGroupId) {
			this.contactGroupId = contactGroupId;
		}

		public String getContactGroupName() {
			return this.contactGroupName;
		}

		public void setContactGroupName(String contactGroupName) {
			this.contactGroupName = contactGroupName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public static class Contact {

			private Long contactId;

			private String contactName;

			private String phone;

			private String email;

			private String userId;

			private String dingRobot;

			private Long createTime;

			private Long updateTime;

			private Boolean systemNoc;

			public Long getContactId() {
				return this.contactId;
			}

			public void setContactId(Long contactId) {
				this.contactId = contactId;
			}

			public String getContactName() {
				return this.contactName;
			}

			public void setContactName(String contactName) {
				this.contactName = contactName;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDingRobot() {
				return this.dingRobot;
			}

			public void setDingRobot(String dingRobot) {
				this.dingRobot = dingRobot;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}

			public Boolean getSystemNoc() {
				return this.systemNoc;
			}

			public void setSystemNoc(Boolean systemNoc) {
				this.systemNoc = systemNoc;
			}
		}
	}

	@Override
	public SearchAlertContactGroupResponse getInstance(UnmarshallerContext context) {
		return	SearchAlertContactGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
