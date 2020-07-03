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

import com.aliyuncs.v5.dds.model.v20151201.DescribeSlowLogRecordsResponse;
import com.aliyuncs.v5.dds.model.v20151201.DescribeSlowLogRecordsResponse.LogRecords;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeSlowLogRecordsResponseUnmarshaller {

	public static DescribeSlowLogRecordsResponse unmarshall(DescribeSlowLogRecordsResponse describeSlowLogRecordsResponse, UnmarshallerContext _ctx) {
		
		describeSlowLogRecordsResponse.setRequestId(_ctx.stringValue("DescribeSlowLogRecordsResponse.RequestId"));
		describeSlowLogRecordsResponse.setEngine(_ctx.stringValue("DescribeSlowLogRecordsResponse.Engine"));
		describeSlowLogRecordsResponse.setTotalRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.TotalRecordCount"));
		describeSlowLogRecordsResponse.setPageNumber(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageNumber"));
		describeSlowLogRecordsResponse.setPageRecordCount(_ctx.integerValue("DescribeSlowLogRecordsResponse.PageRecordCount"));

		List<LogRecords> itemsList = new ArrayList<LogRecords>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlowLogRecordsResponse.Items.Length"); i++) {
			LogRecords logRecords = new LogRecords();
			logRecords.setHostAddress(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].HostAddress"));
			logRecords.setDBName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DBName"));
			logRecords.setSQLText(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].SQLText"));
			logRecords.setQueryTimes(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].QueryTimes"));
			logRecords.setDocsExamined(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].DocsExamined"));
			logRecords.setKeysExamined(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].KeysExamined"));
			logRecords.setReturnRowCounts(_ctx.longValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ReturnRowCounts"));
			logRecords.setExecutionStartTime(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].ExecutionStartTime"));
			logRecords.setAccountName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].AccountName"));
			logRecords.setTableName(_ctx.stringValue("DescribeSlowLogRecordsResponse.Items["+ i +"].TableName"));

			itemsList.add(logRecords);
		}
		describeSlowLogRecordsResponse.setItems(itemsList);
	 
	 	return describeSlowLogRecordsResponse;
	}
}