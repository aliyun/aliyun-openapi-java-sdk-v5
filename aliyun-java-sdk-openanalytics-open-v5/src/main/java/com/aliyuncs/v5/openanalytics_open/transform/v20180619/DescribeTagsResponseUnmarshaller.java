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

package com.aliyuncs.v5.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.openanalytics_open.model.v20180619.DescribeTagsResponse;
import com.aliyuncs.v5.openanalytics_open.model.v20180619.DescribeTagsResponse.Tag;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));

		List<Tag> tagsList = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].TagValue"));

			tagsList.add(tag);
		}
		describeTagsResponse.setTags(tagsList);
	 
	 	return describeTagsResponse;
	}
}