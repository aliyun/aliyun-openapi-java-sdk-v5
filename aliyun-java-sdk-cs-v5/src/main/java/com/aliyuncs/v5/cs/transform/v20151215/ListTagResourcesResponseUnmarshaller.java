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

import com.aliyuncs.v5.cs.model.v20151215.ListTagResourcesResponse;
import com.aliyuncs.v5.cs.model.v20151215.ListTagResourcesResponse.Tag_resources;
import com.aliyuncs.v5.cs.model.v20151215.ListTagResourcesResponse.Tag_resources.Tag_resource;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setNext_token(_ctx.stringValue("ListTagResourcesResponse.next_token"));
		listTagResourcesResponse.setRequest_id(_ctx.stringValue("ListTagResourcesResponse.request_id"));

		Tag_resources tag_resources = new Tag_resources();

		Tag_resource tag_resource = new Tag_resource();
		tag_resource.setTag_value(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource.tag_value"));
		tag_resource.setResource_type(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource.resource_type"));
		tag_resource.setResource_id(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource.resource_id"));
		tag_resource.setTag_key(_ctx.stringValue("ListTagResourcesResponse.tag_resources.tag_resource.tag_key"));
		tag_resources.setTag_resource(tag_resource);
		listTagResourcesResponse.setTag_resources(tag_resources);
	 
	 	return listTagResourcesResponse;
	}
}