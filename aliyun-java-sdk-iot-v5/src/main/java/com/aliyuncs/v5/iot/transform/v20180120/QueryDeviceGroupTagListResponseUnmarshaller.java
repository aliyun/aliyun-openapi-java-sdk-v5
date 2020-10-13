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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.iot.model.v20180120.QueryDeviceGroupTagListResponse;
import com.aliyuncs.v5.iot.model.v20180120.QueryDeviceGroupTagListResponse.GroupTagInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryDeviceGroupTagListResponseUnmarshaller {

	public static QueryDeviceGroupTagListResponse unmarshall(QueryDeviceGroupTagListResponse queryDeviceGroupTagListResponse, UnmarshallerContext _ctx) {
		
		queryDeviceGroupTagListResponse.setRequestId(_ctx.stringValue("QueryDeviceGroupTagListResponse.RequestId"));
		queryDeviceGroupTagListResponse.setSuccess(_ctx.booleanValue("QueryDeviceGroupTagListResponse.Success"));
		queryDeviceGroupTagListResponse.setCode(_ctx.stringValue("QueryDeviceGroupTagListResponse.Code"));
		queryDeviceGroupTagListResponse.setErrorMessage(_ctx.stringValue("QueryDeviceGroupTagListResponse.ErrorMessage"));

		List<GroupTagInfo> dataList = new ArrayList<GroupTagInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceGroupTagListResponse.Data.Length"); i++) {
			GroupTagInfo groupTagInfo = new GroupTagInfo();
			groupTagInfo.setTagKey(_ctx.stringValue("QueryDeviceGroupTagListResponse.Data["+ i +"].TagKey"));
			groupTagInfo.setTagValue(_ctx.stringValue("QueryDeviceGroupTagListResponse.Data["+ i +"].TagValue"));

			dataList.add(groupTagInfo);
		}
		queryDeviceGroupTagListResponse.setData(dataList);
	 
	 	return queryDeviceGroupTagListResponse;
	}
}