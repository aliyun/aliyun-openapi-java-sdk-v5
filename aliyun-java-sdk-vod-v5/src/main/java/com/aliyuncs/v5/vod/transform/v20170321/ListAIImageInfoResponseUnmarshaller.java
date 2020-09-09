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

import com.aliyuncs.v5.vod.model.v20170321.ListAIImageInfoResponse;
import com.aliyuncs.v5.vod.model.v20170321.ListAIImageInfoResponse.AIImageInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListAIImageInfoResponseUnmarshaller {

	public static ListAIImageInfoResponse unmarshall(ListAIImageInfoResponse listAIImageInfoResponse, UnmarshallerContext _ctx) {
		
		listAIImageInfoResponse.setRequestId(_ctx.stringValue("ListAIImageInfoResponse.RequestId"));

		List<AIImageInfo> aIImageInfoListList = new ArrayList<AIImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAIImageInfoResponse.AIImageInfoList.Length"); i++) {
			AIImageInfo aIImageInfo = new AIImageInfo();
			aIImageInfo.setVideoId(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].VideoId"));
			aIImageInfo.setAIImageInfoId(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].AIImageInfoId"));
			aIImageInfo.setJobId(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].JobId"));
			aIImageInfo.setFileURL(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].FileURL"));
			aIImageInfo.setScore(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].Score"));
			aIImageInfo.setTime(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].Time"));
			aIImageInfo.setFormat(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].Format"));
			aIImageInfo.setCreationTime(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].CreationTime"));
			aIImageInfo.setVersion(_ctx.stringValue("ListAIImageInfoResponse.AIImageInfoList["+ i +"].Version"));

			aIImageInfoListList.add(aIImageInfo);
		}
		listAIImageInfoResponse.setAIImageInfoList(aIImageInfoListList);
	 
	 	return listAIImageInfoResponse;
	}
}