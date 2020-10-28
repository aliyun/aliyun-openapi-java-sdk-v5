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

import com.aliyuncs.v5.drds.model.v20190123.DescribeRdsPerformanceSummaryResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeRdsPerformanceSummaryResponseUnmarshaller {

	public static DescribeRdsPerformanceSummaryResponse unmarshall(DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRdsPerformanceSummaryResponse.setRequestId(_ctx.stringValue("DescribeRdsPerformanceSummaryResponse.RequestId"));
		describeRdsPerformanceSummaryResponse.setSuccess(_ctx.booleanValue("DescribeRdsPerformanceSummaryResponse.Success"));

		List<RdsPerformanceInfo> rdsPerformanceInfosList = new ArrayList<RdsPerformanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos.Length"); i++) {
			RdsPerformanceInfo rdsPerformanceInfo = new RdsPerformanceInfo();
			rdsPerformanceInfo.setRdsId(_ctx.stringValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].RdsId"));
			rdsPerformanceInfo.setCpu(_ctx.floatValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].Cpu"));
			rdsPerformanceInfo.setIops(_ctx.floatValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].Iops"));
			rdsPerformanceInfo.setActiveSessions(_ctx.integerValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].ActiveSessions"));
			rdsPerformanceInfo.setTotalSessions(_ctx.integerValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].TotalSessions"));
			rdsPerformanceInfo.setSpaceUsage(_ctx.longValue("DescribeRdsPerformanceSummaryResponse.RdsPerformanceInfos["+ i +"].SpaceUsage"));

			rdsPerformanceInfosList.add(rdsPerformanceInfo);
		}
		describeRdsPerformanceSummaryResponse.setRdsPerformanceInfos(rdsPerformanceInfosList);
	 
	 	return describeRdsPerformanceSummaryResponse;
	}
}