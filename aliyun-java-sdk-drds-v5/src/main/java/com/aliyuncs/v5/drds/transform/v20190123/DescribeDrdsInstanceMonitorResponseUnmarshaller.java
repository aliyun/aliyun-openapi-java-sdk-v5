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

import com.aliyuncs.v5.drds.model.v20190123.DescribeDrdsInstanceMonitorResponse;
import com.aliyuncs.v5.drds.model.v20190123.DescribeDrdsInstanceMonitorResponse.PartialPerformanceData;
import com.aliyuncs.v5.drds.model.v20190123.DescribeDrdsInstanceMonitorResponse.PartialPerformanceData.PerformanceValue;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DescribeDrdsInstanceMonitorResponseUnmarshaller {

	public static DescribeDrdsInstanceMonitorResponse unmarshall(DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitorResponse, UnmarshallerContext _ctx) {
		
		describeDrdsInstanceMonitorResponse.setRequestId(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.RequestId"));

		List<PartialPerformanceData> dataList = new ArrayList<PartialPerformanceData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsInstanceMonitorResponse.Data.Length"); i++) {
			PartialPerformanceData partialPerformanceData = new PartialPerformanceData();
			partialPerformanceData.setKey(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Key"));
			partialPerformanceData.setUnit(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Unit"));
			partialPerformanceData.setNodeNum(_ctx.integerValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].NodeNum"));

			List<PerformanceValue> valuesList = new ArrayList<PerformanceValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setDate(_ctx.longValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values["+ j +"].Date"));
				performanceValue.setValue(_ctx.stringValue("DescribeDrdsInstanceMonitorResponse.Data["+ i +"].Values["+ j +"].Value"));

				valuesList.add(performanceValue);
			}
			partialPerformanceData.setValues(valuesList);

			dataList.add(partialPerformanceData);
		}
		describeDrdsInstanceMonitorResponse.setData(dataList);
	 
	 	return describeDrdsInstanceMonitorResponse;
	}
}