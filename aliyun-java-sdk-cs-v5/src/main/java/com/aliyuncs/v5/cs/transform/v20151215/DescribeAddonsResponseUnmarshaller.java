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

package com.aliyuncs.v5.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.cs.model.v20151215.DescribeAddonsResponse;
import com.aliyuncs.v5.cs.model.v20151215.DescribeAddonsResponse.ComponentGroupsItem;
import com.aliyuncs.v5.cs.model.v20151215.DescribeAddonsResponse.ComponentGroupsItem.ItemsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeAddonsResponseUnmarshaller {

	public static DescribeAddonsResponse unmarshall(DescribeAddonsResponse describeAddonsResponse, UnmarshallerContext _ctx) {
		
		describeAddonsResponse.setStandardComponents(_ctx.stringValue("DescribeAddonsResponse.StandardComponents"));

		List<ComponentGroupsItem> componentGroupsList = new ArrayList<ComponentGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAddonsResponse.ComponentGroups.Length"); i++) {
			ComponentGroupsItem componentGroupsItem = new ComponentGroupsItem();
			componentGroupsItem.setGroup_name(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].group_name"));

			List<String> _default = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAddonsResponse.ComponentGroups["+ i +"].default.Length"); j++) {
				_default.add(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].default["+ j +"]"));
			}
			componentGroupsItem.set_Default(_default);

			List<ItemsItem> itemsList = new ArrayList<ItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items.Length"); j++) {
				ItemsItem itemsItem = new ItemsItem();
				itemsItem.setName(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].name"));
				itemsItem.setDescription(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].description"));
				itemsItem.setDisabled(_ctx.booleanValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].disabled"));
				itemsItem.setVersion(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].version"));
				itemsItem.setRequired(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].required"));

				itemsList.add(itemsItem);
			}
			componentGroupsItem.setItems(itemsList);

			componentGroupsList.add(componentGroupsItem);
		}
		describeAddonsResponse.setComponentGroups(componentGroupsList);
	 
	 	return describeAddonsResponse;
	}
}