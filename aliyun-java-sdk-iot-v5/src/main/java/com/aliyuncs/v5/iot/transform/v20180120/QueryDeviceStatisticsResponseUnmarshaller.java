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

package com.aliyuncs.v5.iot.transform.v20180120;

import com.aliyuncs.v5.iot.model.v20180120.QueryDeviceStatisticsResponse;
import com.aliyuncs.v5.iot.model.v20180120.QueryDeviceStatisticsResponse.Data;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryDeviceStatisticsResponseUnmarshaller {

	public static QueryDeviceStatisticsResponse unmarshall(QueryDeviceStatisticsResponse queryDeviceStatisticsResponse, UnmarshallerContext _ctx) {
		
		queryDeviceStatisticsResponse.setRequestId(_ctx.stringValue("QueryDeviceStatisticsResponse.RequestId"));
		queryDeviceStatisticsResponse.setSuccess(_ctx.booleanValue("QueryDeviceStatisticsResponse.Success"));
		queryDeviceStatisticsResponse.setCode(_ctx.stringValue("QueryDeviceStatisticsResponse.Code"));
		queryDeviceStatisticsResponse.setErrorMessage(_ctx.stringValue("QueryDeviceStatisticsResponse.ErrorMessage"));

		Data data = new Data();
		data.setDeviceCount(_ctx.longValue("QueryDeviceStatisticsResponse.Data.deviceCount"));
		data.setOnlineCount(_ctx.longValue("QueryDeviceStatisticsResponse.Data.onlineCount"));
		data.setActiveCount(_ctx.longValue("QueryDeviceStatisticsResponse.Data.activeCount"));
		queryDeviceStatisticsResponse.setData(data);
	 
	 	return queryDeviceStatisticsResponse;
	}
}