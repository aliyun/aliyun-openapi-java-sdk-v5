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

import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.CategoryItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.KeywordItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.LocationItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.PersonItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIVideoTagResultResponse.VideoTagResult.TimeItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetAIVideoTagResultResponseUnmarshaller {

	public static GetAIVideoTagResultResponse unmarshall(GetAIVideoTagResultResponse getAIVideoTagResultResponse, UnmarshallerContext _ctx) {
		
		getAIVideoTagResultResponse.setRequestId(_ctx.stringValue("GetAIVideoTagResultResponse.RequestId"));

		VideoTagResult videoTagResult = new VideoTagResult();

		List<CategoryItem> categoryList = new ArrayList<CategoryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Category.Length"); i++) {
			CategoryItem categoryItem = new CategoryItem();
			categoryItem.setTag(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Category["+ i +"].Tag"));

			categoryList.add(categoryItem);
		}
		videoTagResult.setCategory(categoryList);

		List<PersonItem> personList = new ArrayList<PersonItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Person.Length"); i++) {
			PersonItem personItem = new PersonItem();
			personItem.setFaceUrl(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].FaceUrl"));
			personItem.setTag(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Tag"));

			List<String> times = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Times.Length"); j++) {
				times.add(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Person["+ i +"].Times["+ j +"]"));
			}
			personItem.setTimes(times);

			personList.add(personItem);
		}
		videoTagResult.setPerson(personList);

		List<TimeItem> timeList = new ArrayList<TimeItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Time.Length"); i++) {
			TimeItem timeItem = new TimeItem();
			timeItem.setTag(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Tag"));

			List<String> times1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Times.Length"); j++) {
				times1.add(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Time["+ i +"].Times["+ j +"]"));
			}
			timeItem.setTimes1(times1);

			timeList.add(timeItem);
		}
		videoTagResult.setTime(timeList);

		List<LocationItem> locationList = new ArrayList<LocationItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Location.Length"); i++) {
			LocationItem locationItem = new LocationItem();
			locationItem.setTag(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Tag"));

			List<String> times2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Times.Length"); j++) {
				times2.add(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Location["+ i +"].Times["+ j +"]"));
			}
			locationItem.setTimes2(times2);

			locationList.add(locationItem);
		}
		videoTagResult.setLocation(locationList);

		List<KeywordItem> keywordList = new ArrayList<KeywordItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword.Length"); i++) {
			KeywordItem keywordItem = new KeywordItem();
			keywordItem.setTag(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Tag"));

			List<String> times3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Times.Length"); j++) {
				times3.add(_ctx.stringValue("GetAIVideoTagResultResponse.VideoTagResult.Keyword["+ i +"].Times["+ j +"]"));
			}
			keywordItem.setTimes3(times3);

			keywordList.add(keywordItem);
		}
		videoTagResult.setKeyword(keywordList);
		getAIVideoTagResultResponse.setVideoTagResult(videoTagResult);
	 
	 	return getAIVideoTagResultResponse;
	}
}