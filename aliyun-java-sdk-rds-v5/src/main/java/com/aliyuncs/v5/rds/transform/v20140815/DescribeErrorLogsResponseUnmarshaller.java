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

import com.aliyuncs.v5.rds.model.v20140815.DescribeErrorLogsResponse;
import com.aliyuncs.v5.rds.model.v20140815.DescribeErrorLogsResponse.ErrorLog;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeErrorLogsResponseUnmarshaller {

	public static DescribeErrorLogsResponse unmarshall(DescribeErrorLogsResponse describeErrorLogsResponse, UnmarshallerContext _ctx) {
		
		describeErrorLogsResponse.setRequestId(_ctx.stringValue("DescribeErrorLogsResponse.RequestId"));
		describeErrorLogsResponse.setTotalRecordCount(_ctx.integerValue("DescribeErrorLogsResponse.TotalRecordCount"));
		describeErrorLogsResponse.setPageNumber(_ctx.integerValue("DescribeErrorLogsResponse.PageNumber"));
		describeErrorLogsResponse.setPageRecordCount(_ctx.integerValue("DescribeErrorLogsResponse.PageRecordCount"));

		List<ErrorLog> itemsList = new ArrayList<ErrorLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeErrorLogsResponse.Items.Length"); i++) {
			ErrorLog errorLog = new ErrorLog();
			errorLog.setErrorInfo(_ctx.stringValue("DescribeErrorLogsResponse.Items["+ i +"].ErrorInfo"));
			errorLog.setCreateTime(_ctx.stringValue("DescribeErrorLogsResponse.Items["+ i +"].CreateTime"));

			itemsList.add(errorLog);
		}
		describeErrorLogsResponse.setItems(itemsList);
	 
	 	return describeErrorLogsResponse;
	}
}