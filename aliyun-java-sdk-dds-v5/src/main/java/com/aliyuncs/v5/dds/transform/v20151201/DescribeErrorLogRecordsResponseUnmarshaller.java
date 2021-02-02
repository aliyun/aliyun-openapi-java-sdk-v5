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

import com.aliyuncs.v5.dds.model.v20151201.DescribeErrorLogRecordsResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeErrorLogRecordsResponse.LogRecords;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeErrorLogRecordsResponseUnmarshaller {

	public static DescribeErrorLogRecordsResponse unmarshall(DescribeErrorLogRecordsResponse describeErrorLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeErrorLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeErrorLogRecordsResponse.RequestId"));
		describeErrorLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeErrorLogRecordsResponse.TotalRecordCount"));
		describeErrorLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeErrorLogRecordsResponse.PageRecordCount"));
		describeErrorLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeErrorLogRecordsResponse.PageNumber"));
		describeErrorLogRecordsResponse.setEngine(_ctx.stringValue("DescribeErrorLogRecordsResponse.Engine"));

		List<LogRecords> itemsList = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeErrorLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setConnInfo(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].ConnInfo"));
			logRecords.setCategory(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Category"));
			logRecords.setContent(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Content"));
			logRecords.setCreateTime(_ctx.stringValue("DescribeErrorLogRecordsResponse.Items["+ i +"].CreateTime"));
			logRecords.setId(_ctx.integerValue("DescribeErrorLogRecordsResponse.Items["+ i +"].Id"));

			itemsList.add(logRecords);
		}
		describeErrorLogRecordsResponse.setItems(itemsList);
	 
	 	return describeErrorLogRecordsResponse;
	}
}