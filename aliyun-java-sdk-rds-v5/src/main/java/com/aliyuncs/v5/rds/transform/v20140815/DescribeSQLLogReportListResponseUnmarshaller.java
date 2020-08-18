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

package com.aliyuncs.v5.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.rds.model.v20140815.DescribeSQLLogReportListResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeSQLLogReportListResponse.Item;
import com.aliyuncs.v5.rds.model.v20140815.DescribeSQLLogReportListResponse.Item.LatencyTopNItem;
import com.aliyuncs.v5.rds.model.v20140815.DescribeSQLLogReportListResponse.Item.QPSTopNItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeSQLLogReportListResponseUnmarshaller {

	public static DescribeSQLLogReportListResponse unmarshall(DescribeSQLLogReportListResponse describeSQLLogReportListResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogReportListResponse.setRequestId(_ctx.stringValue("DescribeSQLLogReportListResponse.RequestId"));
		describeSQLLogReportListResponse.setTotalRecordCount(_ctx.integerValue("DescribeSQLLogReportListResponse.TotalRecordCount"));
		describeSQLLogReportListResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogReportListResponse.PageNumber"));
		describeSQLLogReportListResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogReportListResponse.PageRecordCount"));

		List<Item> itemsList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogReportListResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setReportTime(_ctx.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].ReportTime"));

			List<LatencyTopNItem> latencyTopNItemsList = new ArrayList<LatencyTopNItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems.Length"); j++) {
				LatencyTopNItem latencyTopNItem = new LatencyTopNItem();
				latencyTopNItem.setSQLText(_ctx.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLText"));
				latencyTopNItem.setAvgLatency(_ctx.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].AvgLatency"));
				latencyTopNItem.setSQLExecuteTimes(_ctx.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].LatencyTopNItems["+ j +"].SQLExecuteTimes"));

				latencyTopNItemsList.add(latencyTopNItem);
			}
			item.setLatencyTopNItems(latencyTopNItemsList);

			List<QPSTopNItem> qPSTopNItemsList = new ArrayList<QPSTopNItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems.Length"); j++) {
				QPSTopNItem qPSTopNItem = new QPSTopNItem();
				qPSTopNItem.setSQLText(_ctx.stringValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLText"));
				qPSTopNItem.setSQLExecuteTimes(_ctx.longValue("DescribeSQLLogReportListResponse.Items["+ i +"].QPSTopNItems["+ j +"].SQLExecuteTimes"));

				qPSTopNItemsList.add(qPSTopNItem);
			}
			item.setQPSTopNItems(qPSTopNItemsList);

			itemsList.add(item);
		}
		describeSQLLogReportListResponse.setItems(itemsList);
	 
	 	return describeSQLLogReportListResponse;
	}
}