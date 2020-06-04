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

import com.aliyuncs.v5.vod.model.v20170321.DescribeVodAIDataResponse;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodAIDataResponse.AIDataItem;
import com.aliyuncs.v5.vod.model.v20170321.DescribeVodAIDataResponse.AIDataItem.DataItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeVodAIDataResponseUnmarshaller {

	public static DescribeVodAIDataResponse unmarshall(DescribeVodAIDataResponse describeVodAIDataResponse, UnmarshallerContext _ctx) {
		
		describeVodAIDataResponse.setRequestId(_ctx.stringValue("DescribeVodAIDataResponse.RequestId"));
		describeVodAIDataResponse.setDataInterval(_ctx.stringValue("DescribeVodAIDataResponse.DataInterval"));

		List<AIDataItem> aIDataList = new ArrayList<AIDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodAIDataResponse.AIData.Length"); i++) {
			AIDataItem aIDataItem = new AIDataItem();
			aIDataItem.setTimeStamp(_ctx.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].TimeStamp"));

			List<DataItem> dataList = new ArrayList<DataItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodAIDataResponse.AIData["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setName(_ctx.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].Data["+ j +"].Name"));
				dataItem.setValue(_ctx.stringValue("DescribeVodAIDataResponse.AIData["+ i +"].Data["+ j +"].Value"));

				dataList.add(dataItem);
			}
			aIDataItem.setData(dataList);

			aIDataList.add(aIDataItem);
		}
		describeVodAIDataResponse.setAIData(aIDataList);
	 
	 	return describeVodAIDataResponse;
	}
}