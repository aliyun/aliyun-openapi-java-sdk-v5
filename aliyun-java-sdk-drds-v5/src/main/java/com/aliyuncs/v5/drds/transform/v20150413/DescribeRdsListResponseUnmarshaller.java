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

package com.aliyuncs.v5.drds.transform.v20150413;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20150413.DescribeRdsListResponse;
import com.aliyuncs.v5.drds.model.v20150413.DescribeRdsListResponse.RdsInstance;
import com.aliyuncs.v5.drds.model.v20150413.DescribeRdsListResponse.RdsInstance.Child;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRdsListResponseUnmarshaller {

	public static DescribeRdsListResponse unmarshall(DescribeRdsListResponse describeRdsListResponse, UnmarshallerContext _ctx) {
		
		describeRdsListResponse.setRequestId(_ctx.stringValue("DescribeRdsListResponse.RequestId"));
		describeRdsListResponse.setSuccess(_ctx.booleanValue("DescribeRdsListResponse.Success"));

		List<RdsInstance> dataList = new ArrayList<RdsInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsListResponse.Data.Length"); i++) {
			RdsInstance rdsInstance = new RdsInstance();
			rdsInstance.setInstanceId(_ctx.integerValue("DescribeRdsListResponse.Data["+ i +"].InstanceId"));
			rdsInstance.setInstanceName(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceName"));
			rdsInstance.setConnectUrl(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ConnectUrl"));
			rdsInstance.setPort(_ctx.integerValue("DescribeRdsListResponse.Data["+ i +"].Port"));
			rdsInstance.setInstanceStatus(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].InstanceStatus"));
			rdsInstance.setDbType(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].DbType"));
			rdsInstance.setReadWeight(_ctx.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadWeight"));

			List<Child> readOnlyChildrenList = new ArrayList<Child>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren.Length"); j++) {
				Child child = new Child();
				child.setInstanceId(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceId"));
				child.setInstanceName(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceName"));
				child.setConnectUrl(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].ConnectUrl"));
				child.setPort(_ctx.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].port"));
				child.setInstanceStatus(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].InstanceStatus"));
				child.setDbType(_ctx.stringValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].DbType"));
				child.setReadWeight(_ctx.integerValue("DescribeRdsListResponse.Data["+ i +"].ReadOnlyChildren["+ j +"].ReadWeight"));

				readOnlyChildrenList.add(child);
			}
			rdsInstance.setReadOnlyChildren(readOnlyChildrenList);

			dataList.add(rdsInstance);
		}
		describeRdsListResponse.setData(dataList);
	 
	 	return describeRdsListResponse;
	}
}