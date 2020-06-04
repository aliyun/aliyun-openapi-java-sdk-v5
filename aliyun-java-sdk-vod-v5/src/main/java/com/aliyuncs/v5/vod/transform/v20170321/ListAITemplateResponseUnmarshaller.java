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

package com.aliyuncs.v5.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.vod.model.v20170321.ListAITemplateResponse;
import com.aliyuncs.v5.vod.model.v20170321.ListAITemplateResponse.TemplateInfoListItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListAITemplateResponseUnmarshaller {

	public static ListAITemplateResponse unmarshall(ListAITemplateResponse listAITemplateResponse, UnmarshallerContext _ctx) {
		
		listAITemplateResponse.setRequestId(_ctx.stringValue("ListAITemplateResponse.RequestId"));

		List<TemplateInfoListItem> templateInfoListList = new ArrayList<TemplateInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAITemplateResponse.TemplateInfoList.Length"); i++) {
			TemplateInfoListItem templateInfoListItem = new TemplateInfoListItem();
			templateInfoListItem.setTemplateId(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateId"));
			templateInfoListItem.setTemplateType(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateType"));
			templateInfoListItem.setTemplateName(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateName"));
			templateInfoListItem.setTemplateConfig(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].TemplateConfig"));
			templateInfoListItem.setSource(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].Source"));
			templateInfoListItem.setIsDefault(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].IsDefault"));
			templateInfoListItem.setCreationTime(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].CreationTime"));
			templateInfoListItem.setModifyTime(_ctx.stringValue("ListAITemplateResponse.TemplateInfoList["+ i +"].ModifyTime"));

			templateInfoListList.add(templateInfoListItem);
		}
		listAITemplateResponse.setTemplateInfoList(templateInfoListList);
	 
	 	return listAITemplateResponse;
	}
}