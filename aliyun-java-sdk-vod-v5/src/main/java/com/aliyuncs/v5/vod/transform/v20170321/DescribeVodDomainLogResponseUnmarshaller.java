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

import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainLogResponse;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeVodDomainLogResponseUnmarshaller {

	public static DescribeVodDomainLogResponse unmarshall(DescribeVodDomainLogResponse describeVodDomainLogResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainLogResponse.setRequestId(_ctx.stringValue("DescribeVodDomainLogResponse.RequestId"));

		List<DomainLogDetail> domainLogDetailsList = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setDomainName(_ctx.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].DomainName"));
			domainLogDetail.setLogCount(_ctx.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageNumber(_ctx.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageNumber"));
			pageInfos.setPageSize(_ctx.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfosList = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(_ctx.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfosList.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfosList);

			domainLogDetailsList.add(domainLogDetail);
		}
		describeVodDomainLogResponse.setDomainLogDetails(domainLogDetailsList);
	 
	 	return describeVodDomainLogResponse;
	}
}