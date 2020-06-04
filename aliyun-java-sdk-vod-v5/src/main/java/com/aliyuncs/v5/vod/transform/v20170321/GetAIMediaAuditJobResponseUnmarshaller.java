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

import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResultItem.ResultItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResultItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterListItem7;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopListItem8;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterListItem11;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopListItem12;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterListItem15;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopListItem16;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterListItem3;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopListItem4;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterListItem;
import com.aliyuncs.v5.vod.model.v20170321.GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopListItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetAIMediaAuditJobResponseUnmarshaller {

	public static GetAIMediaAuditJobResponse unmarshall(GetAIMediaAuditJobResponse getAIMediaAuditJobResponse, UnmarshallerContext _ctx) {
		
		getAIMediaAuditJobResponse.setRequestId(_ctx.stringValue("GetAIMediaAuditJobResponse.RequestId"));

		MediaAuditJob mediaAuditJob = new MediaAuditJob();
		mediaAuditJob.setJobId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.JobId"));
		mediaAuditJob.setMediaId(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.MediaId"));
		mediaAuditJob.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Type"));
		mediaAuditJob.setStatus(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Status"));
		mediaAuditJob.setCode(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Code"));
		mediaAuditJob.setMessage(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Message"));
		mediaAuditJob.setCreationTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CreationTime"));
		mediaAuditJob.setCompleteTime(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.CompleteTime"));

		Data data = new Data();
		data.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Suggestion"));
		data.setAbnormalModules(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.AbnormalModules"));
		data.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.Label"));

		VideoResult videoResult = new VideoResult();
		videoResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Suggestion"));
		videoResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.Label"));

		TerrorismResult terrorismResult = new TerrorismResult();
		terrorismResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Suggestion"));
		terrorismResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.Label"));
		terrorismResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.MaxScore"));
		terrorismResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.AverageScore"));

		List<CounterListItem> counterListList = new ArrayList<CounterListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList.Length"); i++) {
			CounterListItem counterListItem = new CounterListItem();
			counterListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Label"));
			counterListItem.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.CounterList["+ i +"].Count"));

			counterListList.add(counterListItem);
		}
		terrorismResult.setCounterList(counterListList);

		List<TopListItem> topListList = new ArrayList<TopListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList.Length"); i++) {
			TopListItem topListItem = new TopListItem();
			topListItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Label"));
			topListItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Score"));
			topListItem.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Timestamp"));
			topListItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.TerrorismResult.TopList["+ i +"].Url"));

			topListList.add(topListItem);
		}
		terrorismResult.setTopList(topListList);
		videoResult.setTerrorismResult(terrorismResult);

		PornResult pornResult = new PornResult();
		pornResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Suggestion"));
		pornResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.Label"));
		pornResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.MaxScore"));
		pornResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.AverageScore"));

		List<CounterListItem3> counterList1List = new ArrayList<CounterListItem3>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList.Length"); i++) {
			CounterListItem3 counterListItem3 = new CounterListItem3();
			counterListItem3.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Label"));
			counterListItem3.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.CounterList["+ i +"].Count"));

			counterList1List.add(counterListItem3);
		}
		pornResult.setCounterList1(counterList1List);

		List<TopListItem4> topList2List = new ArrayList<TopListItem4>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList.Length"); i++) {
			TopListItem4 topListItem4 = new TopListItem4();
			topListItem4.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Label"));
			topListItem4.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Score"));
			topListItem4.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Timestamp"));
			topListItem4.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.PornResult.TopList["+ i +"].Url"));

			topList2List.add(topListItem4);
		}
		pornResult.setTopList2(topList2List);
		videoResult.setPornResult(pornResult);

		AdResult adResult = new AdResult();
		adResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.Suggestion"));
		adResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.Label"));
		adResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.MaxScore"));
		adResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.AverageScore"));

		List<CounterListItem7> counterList5List = new ArrayList<CounterListItem7>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList.Length"); i++) {
			CounterListItem7 counterListItem7 = new CounterListItem7();
			counterListItem7.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList["+ i +"].Label"));
			counterListItem7.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.CounterList["+ i +"].Count"));

			counterList5List.add(counterListItem7);
		}
		adResult.setCounterList5(counterList5List);

		List<TopListItem8> topList6List = new ArrayList<TopListItem8>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList.Length"); i++) {
			TopListItem8 topListItem8 = new TopListItem8();
			topListItem8.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Label"));
			topListItem8.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Score"));
			topListItem8.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Timestamp"));
			topListItem8.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.AdResult.TopList["+ i +"].Url"));

			topList6List.add(topListItem8);
		}
		adResult.setTopList6(topList6List);
		videoResult.setAdResult(adResult);

		LiveResult liveResult = new LiveResult();
		liveResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.Suggestion"));
		liveResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.Label"));
		liveResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.MaxScore"));
		liveResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.AverageScore"));

		List<CounterListItem11> counterList9List = new ArrayList<CounterListItem11>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList.Length"); i++) {
			CounterListItem11 counterListItem11 = new CounterListItem11();
			counterListItem11.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList["+ i +"].Label"));
			counterListItem11.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.CounterList["+ i +"].Count"));

			counterList9List.add(counterListItem11);
		}
		liveResult.setCounterList9(counterList9List);

		List<TopListItem12> topList10List = new ArrayList<TopListItem12>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList.Length"); i++) {
			TopListItem12 topListItem12 = new TopListItem12();
			topListItem12.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Label"));
			topListItem12.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Score"));
			topListItem12.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Timestamp"));
			topListItem12.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LiveResult.TopList["+ i +"].Url"));

			topList10List.add(topListItem12);
		}
		liveResult.setTopList10(topList10List);
		videoResult.setLiveResult(liveResult);

		LogoResult logoResult = new LogoResult();
		logoResult.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.Suggestion"));
		logoResult.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.Label"));
		logoResult.setMaxScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.MaxScore"));
		logoResult.setAverageScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.AverageScore"));

		List<CounterListItem15> counterList13List = new ArrayList<CounterListItem15>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList.Length"); i++) {
			CounterListItem15 counterListItem15 = new CounterListItem15();
			counterListItem15.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList["+ i +"].Label"));
			counterListItem15.setCount(_ctx.integerValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.CounterList["+ i +"].Count"));

			counterList13List.add(counterListItem15);
		}
		logoResult.setCounterList13(counterList13List);

		List<TopListItem16> topList14List = new ArrayList<TopListItem16>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList.Length"); i++) {
			TopListItem16 topListItem16 = new TopListItem16();
			topListItem16.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Label"));
			topListItem16.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Score"));
			topListItem16.setTimestamp(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Timestamp"));
			topListItem16.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.VideoResult.LogoResult.TopList["+ i +"].Url"));

			topList14List.add(topListItem16);
		}
		logoResult.setTopList14(topList14List);
		videoResult.setLogoResult(logoResult);
		data.setVideoResult(videoResult);

		List<ImageResultItem> imageResultList = new ArrayList<ImageResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult.Length"); i++) {
			ImageResultItem imageResultItem = new ImageResultItem();
			imageResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Suggestion"));
			imageResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Label"));
			imageResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Type"));
			imageResultItem.setUrl(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Url"));

			List<ResultItem> resultList = new ArrayList<ResultItem>();
			for (int j = 0; j < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result.Length"); j++) {
				ResultItem resultItem = new ResultItem();
				resultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Suggestion"));
				resultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Label"));
				resultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Score"));
				resultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.ImageResult["+ i +"].Result["+ j +"].Scene"));

				resultList.add(resultItem);
			}
			imageResultItem.setResult(resultList);

			imageResultList.add(imageResultItem);
		}
		data.setImageResult(imageResultList);

		List<TextResultItem> textResultList = new ArrayList<TextResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult.Length"); i++) {
			TextResultItem textResultItem = new TextResultItem();
			textResultItem.setSuggestion(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Suggestion"));
			textResultItem.setLabel(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Label"));
			textResultItem.setScore(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Score"));
			textResultItem.setScene(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Scene"));
			textResultItem.setType(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Type"));
			textResultItem.setContent(_ctx.stringValue("GetAIMediaAuditJobResponse.MediaAuditJob.Data.TextResult["+ i +"].Content"));

			textResultList.add(textResultItem);
		}
		data.setTextResult(textResultList);
		mediaAuditJob.setData(data);
		getAIMediaAuditJobResponse.setMediaAuditJob(mediaAuditJob);
	 
	 	return getAIMediaAuditJobResponse;
	}
}