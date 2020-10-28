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

package com.aliyuncs.v5.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDistributeTableListResponse;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDistributeTableListResponse.Data;
import com.aliyuncs.v5.polardbx.model.v20200202.DescribeDistributeTableListResponse.Data.Table;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDistributeTableListResponseUnmarshaller {

	public static DescribeDistributeTableListResponse unmarshall(DescribeDistributeTableListResponse describeDistributeTableListResponse, UnmarshallerContext _ctx) {
		
		describeDistributeTableListResponse.setRequestId(_ctx.stringValue("DescribeDistributeTableListResponse.RequestId"));
		describeDistributeTableListResponse.setSuccess(_ctx.booleanValue("DescribeDistributeTableListResponse.Success"));
		describeDistributeTableListResponse.setMessage(_ctx.stringValue("DescribeDistributeTableListResponse.Message"));

		Data data = new Data();

		List<Table> tablesList = new ArrayList<Table>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDistributeTableListResponse.Data.Tables.Length"); i++) {
			Table table = new Table();
			table.setTableName(_ctx.stringValue("DescribeDistributeTableListResponse.Data.Tables["+ i +"].TableName"));
			table.setTableType(_ctx.stringValue("DescribeDistributeTableListResponse.Data.Tables["+ i +"].TableType"));
			table.setDbKey(_ctx.stringValue("DescribeDistributeTableListResponse.Data.Tables["+ i +"].DbKey"));
			table.setTbKey(_ctx.stringValue("DescribeDistributeTableListResponse.Data.Tables["+ i +"].TbKey"));

			tablesList.add(table);
		}
		data.setTables(tablesList);
		describeDistributeTableListResponse.setData(data);
	 
	 	return describeDistributeTableListResponse;
	}
}