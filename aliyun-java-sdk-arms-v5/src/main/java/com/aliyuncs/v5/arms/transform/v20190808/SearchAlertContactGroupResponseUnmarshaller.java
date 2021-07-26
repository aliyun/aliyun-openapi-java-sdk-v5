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

package com.aliyuncs.v5.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.arms.model.v20190808.SearchAlertContactGroupResponse;
import com.aliyuncs.v5.arms.model.v20190808.SearchAlertContactGroupResponse.ContactGroup;
import com.aliyuncs.v5.arms.model.v20190808.SearchAlertContactGroupResponse.ContactGroup.Contact;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SearchAlertContactGroupResponseUnmarshaller {

	public static SearchAlertContactGroupResponse unmarshall(SearchAlertContactGroupResponse searchAlertContactGroupResponse, UnmarshallerContext _ctx) {
		
		searchAlertContactGroupResponse.setRequestId(_ctx.stringValue("SearchAlertContactGroupResponse.RequestId"));

		List<ContactGroup> contactGroupsList = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("SearchAlertContactGroupResponse.ContactGroups.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setContactGroupId(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].ContactGroupId"));
			contactGroup.setContactGroupName(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].ContactGroupName"));
			contactGroup.setUserId(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].UserId"));
			contactGroup.setCreateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].CreateTime"));
			contactGroup.setUpdateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].UpdateTime"));

			List<Contact> contactsList = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setContactId(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].ContactId"));
				contact.setContactName(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].ContactName"));
				contact.setPhone(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].Phone"));
				contact.setEmail(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].Email"));
				contact.setUserId(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].UserId"));
				contact.setDingRobot(_ctx.stringValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].DingRobot"));
				contact.setCreateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].CreateTime"));
				contact.setUpdateTime(_ctx.longValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].UpdateTime"));
				contact.setSystemNoc(_ctx.booleanValue("SearchAlertContactGroupResponse.ContactGroups["+ i +"].Contacts["+ j +"].SystemNoc"));

				contactsList.add(contact);
			}
			contactGroup.setContacts(contactsList);

			contactGroupsList.add(contactGroup);
		}
		searchAlertContactGroupResponse.setContactGroups(contactGroupsList);
	 
	 	return searchAlertContactGroupResponse;
	}
}