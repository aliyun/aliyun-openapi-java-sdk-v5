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

package com.aliyuncs.v5.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dts.model.v20200101.ListTagResourcesResponse;
import com.aliyuncs.v5.dts.model.v20200101.ListTagResourcesResponse.TagResource;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setNextToken(_ctx.stringValue("ListTagResourcesResponse.NextToken"));
		listTagResourcesResponse.setSuccess(_ctx.booleanValue("ListTagResourcesResponse.Success"));
		listTagResourcesResponse.setErrMessage(_ctx.stringValue("ListTagResourcesResponse.ErrMessage"));
		listTagResourcesResponse.setErrCode(_ctx.stringValue("ListTagResourcesResponse.ErrCode"));

		List<TagResource> tagResourcesList = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setResourceType(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setTagKey(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagValue"));

			tagResourcesList.add(tagResource);
		}
		listTagResourcesResponse.setTagResources(tagResourcesList);
	 
	 	return listTagResourcesResponse;
	}
}