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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.drds.model.v20190123.DescribeRdsDrdsDBResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribeRdsDrdsDBResponse.RdsDrdsDb;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRdsDrdsDBResponseUnmarshaller {

	public static DescribeRdsDrdsDBResponse unmarshall(DescribeRdsDrdsDBResponse describeRdsDrdsDBResponse, UnmarshallerContext _ctx) {
		
		describeRdsDrdsDBResponse.setRequestId(_ctx.stringValue("DescribeRdsDrdsDBResponse.RequestId"));
		describeRdsDrdsDBResponse.setSuccess(_ctx.booleanValue("DescribeRdsDrdsDBResponse.Success"));

		List<RdsDrdsDb> rdsDrdsDbsList = new ArrayList<RdsDrdsDb>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsDrdsDBResponse.RdsDrdsDbs.Length"); i++) {
			RdsDrdsDb rdsDrdsDb = new RdsDrdsDb();
			rdsDrdsDb.setRdsId(_ctx.stringValue("DescribeRdsDrdsDBResponse.RdsDrdsDbs["+ i +"].RdsId"));

			List<String> dBList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRdsDrdsDBResponse.RdsDrdsDbs["+ i +"].DBList.Length"); j++) {
				dBList.add(_ctx.stringValue("DescribeRdsDrdsDBResponse.RdsDrdsDbs["+ i +"].DBList["+ j +"]"));
			}
			rdsDrdsDb.setDBList(dBList);

			rdsDrdsDbsList.add(rdsDrdsDb);
		}
		describeRdsDrdsDBResponse.setRdsDrdsDbs(rdsDrdsDbsList);
	 
	 	return describeRdsDrdsDBResponse;
	}
}