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

package com.aliyuncs.v5.drds.transform.v20190123;

import com.aliyuncs.v5.drds.model.v20190123.DescribeDataImportTaskReportResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDataImportTaskReportResponseUnmarshaller {

	public static DescribeDataImportTaskReportResponse unmarshall(DescribeDataImportTaskReportResponse describeDataImportTaskReportResponse, UnmarshallerContext _ctx) {
		
		describeDataImportTaskReportResponse.setRequestId(_ctx.stringValue("DescribeDataImportTaskReportResponse.RequestId"));
		describeDataImportTaskReportResponse.setSuccess(_ctx.booleanValue("DescribeDataImportTaskReportResponse.Success"));
		describeDataImportTaskReportResponse.setData(_ctx.stringValue("DescribeDataImportTaskReportResponse.Data"));
	 
	 	return describeDataImportTaskReportResponse;
	}
}