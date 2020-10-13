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

package com.aliyuncs.v5.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.iot.model.v20180120.ListProductTagsResponse;
import com.aliyuncs.v5.iot.model.v20180120.ListProductTagsResponse.ProductTag;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListProductTagsResponseUnmarshaller {

	public static ListProductTagsResponse unmarshall(ListProductTagsResponse listProductTagsResponse, UnmarshallerContext _ctx) {
		
		listProductTagsResponse.setRequestId(_ctx.stringValue("ListProductTagsResponse.RequestId"));
		listProductTagsResponse.setSuccess(_ctx.booleanValue("ListProductTagsResponse.Success"));
		listProductTagsResponse.setErrorMessage(_ctx.stringValue("ListProductTagsResponse.ErrorMessage"));
		listProductTagsResponse.setCode(_ctx.stringValue("ListProductTagsResponse.Code"));

		List<ProductTag> dataList = new ArrayList<ProductTag>();
		for (int i = 0; i < _ctx.lengthValue("ListProductTagsResponse.Data.Length"); i++) {
			ProductTag productTag = new ProductTag();
			productTag.setTagKey(_ctx.stringValue("ListProductTagsResponse.Data["+ i +"].TagKey"));
			productTag.setTagValue(_ctx.stringValue("ListProductTagsResponse.Data["+ i +"].TagValue"));

			dataList.add(productTag);
		}
		listProductTagsResponse.setData(dataList);
	 
	 	return listProductTagsResponse;
	}
}