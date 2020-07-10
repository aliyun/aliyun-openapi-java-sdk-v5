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

package com.aliyuncs.v5.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.imagerecog.model.v20190930.TaggingImageResponse;
import com.aliyuncs.v5.imagerecog.model.v20190930.TaggingImageResponse.Data;
import com.aliyuncs.v5.imagerecog.model.v20190930.TaggingImageResponse.Data.Tag;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class TaggingImageResponseUnmarshaller {

	public static TaggingImageResponse unmarshall(TaggingImageResponse taggingImageResponse, UnmarshallerContext _ctx) {
		
		taggingImageResponse.setRequestId(_ctx.stringValue("TaggingImageResponse.RequestId"));

		Data data = new Data();

		List<Tag> tagsList = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("TaggingImageResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setConfidence(_ctx.floatValue("TaggingImageResponse.Data.Tags["+ i +"].Confidence"));
			tag.setValue(_ctx.stringValue("TaggingImageResponse.Data.Tags["+ i +"].Value"));

			tagsList.add(tag);
		}
		data.setTags(tagsList);
		taggingImageResponse.setData(data);
	 
	 	return taggingImageResponse;
	}
}