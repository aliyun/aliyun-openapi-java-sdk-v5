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

package com.aliyuncs.v5.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dds.model.v20151201.DescribeRunningLogRecordsResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeRunningLogRecordsResponse.LogRecords;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRunningLogRecordsResponseUnmarshaller {

	public static DescribeRunningLogRecordsResponse unmarshall(DescribeRunningLogRecordsResponse describeRunningLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeRunningLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeRunningLogRecordsResponse.RequestId"));
		describeRunningLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeRunningLogRecordsResponse.TotalRecordCount"));
		describeRunningLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeRunningLogRecordsResponse.PageRecordCount"));
		describeRunningLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeRunningLogRecordsResponse.PageNumber"));
		describeRunningLogRecordsResponse.setEngine(_ctx.stringValue("DescribeRunningLogRecordsResponse.Engine"));

		List<LogRecords> itemsList = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRunningLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setConnInfo(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setCategory(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setContent(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Content"));
			logRecords.setCreateTime(_ctx.stringValue("DescribeRunningLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setId(_ctx.integerValue("DescribeRunningLogRecordsResponse.Items["+ i +"].Id"));

			itemsList.add(logRecords);
		}
		describeRunningLogRecordsResponse.setItems(itemsList);
	 
	 	return describeRunningLogRecordsResponse;
	}
}