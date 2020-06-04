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

import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.AdItem;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.LiveItem;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.LogoItem;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.PornItem;
import com.aliyuncs.v5.vod.model.v20170321.GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.TerrorismItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetMediaAuditResultTimelineResponseUnmarshaller {

	public static GetMediaAuditResultTimelineResponse unmarshall(GetMediaAuditResultTimelineResponse getMediaAuditResultTimelineResponse, UnmarshallerContext _ctx) {
		
		getMediaAuditResultTimelineResponse.setRequestId(_ctx.stringValue("GetMediaAuditResultTimelineResponse.RequestId"));

		MediaAuditResultTimeline mediaAuditResultTimeline = new MediaAuditResultTimeline();

		List<PornItem> pornList = new ArrayList<PornItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Porn.Length"); i++) {
			PornItem pornItem = new PornItem();
			pornItem.setLabel(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Porn["+ i +"].Label"));
			pornItem.setScore(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Porn["+ i +"].Score"));
			pornItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Porn["+ i +"].Timestamp"));

			pornList.add(pornItem);
		}
		mediaAuditResultTimeline.setPorn(pornList);

		List<TerrorismItem> terrorismList = new ArrayList<TerrorismItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Terrorism.Length"); i++) {
			TerrorismItem terrorismItem = new TerrorismItem();
			terrorismItem.setLabel(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Terrorism["+ i +"].Label"));
			terrorismItem.setScore(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Terrorism["+ i +"].Score"));
			terrorismItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Terrorism["+ i +"].Timestamp"));

			terrorismList.add(terrorismItem);
		}
		mediaAuditResultTimeline.setTerrorism(terrorismList);

		List<LogoItem> logoList = new ArrayList<LogoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Logo.Length"); i++) {
			LogoItem logoItem = new LogoItem();
			logoItem.setLabel(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Logo["+ i +"].Label"));
			logoItem.setScore(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Logo["+ i +"].Score"));
			logoItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Logo["+ i +"].Timestamp"));

			logoList.add(logoItem);
		}
		mediaAuditResultTimeline.setLogo(logoList);

		List<LiveItem> liveList = new ArrayList<LiveItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Live.Length"); i++) {
			LiveItem liveItem = new LiveItem();
			liveItem.setLabel(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Live["+ i +"].Label"));
			liveItem.setScore(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Live["+ i +"].Score"));
			liveItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Live["+ i +"].Timestamp"));

			liveList.add(liveItem);
		}
		mediaAuditResultTimeline.setLive(liveList);

		List<AdItem> adList = new ArrayList<AdItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Ad.Length"); i++) {
			AdItem adItem = new AdItem();
			adItem.setLabel(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Ad["+ i +"].Label"));
			adItem.setScore(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Ad["+ i +"].Score"));
			adItem.setTimestamp(_ctx.stringValue("GetMediaAuditResultTimelineResponse.MediaAuditResultTimeline.Ad["+ i +"].Timestamp"));

			adList.add(adItem);
		}
		mediaAuditResultTimeline.setAd(adList);
		getMediaAuditResultTimelineResponse.setMediaAuditResultTimeline(mediaAuditResultTimeline);
	 
	 	return getMediaAuditResultTimelineResponse;
	}
}