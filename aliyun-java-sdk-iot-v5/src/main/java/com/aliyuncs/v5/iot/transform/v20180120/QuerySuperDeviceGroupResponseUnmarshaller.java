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

import com.aliyuncs.v5.iot.model.v20180120.QuerySuperDeviceGroupResponse;
import com.aliyuncs.v5.iot.model.v20180120.QuerySuperDeviceGroupResponse.GroupInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QuerySuperDeviceGroupResponseUnmarshaller {

	public static QuerySuperDeviceGroupResponse unmarshall(QuerySuperDeviceGroupResponse querySuperDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		querySuperDeviceGroupResponse.setRequestId(_ctx.stringValue("QuerySuperDeviceGroupResponse.RequestId"));
		querySuperDeviceGroupResponse.setSuccess(_ctx.booleanValue("QuerySuperDeviceGroupResponse.Success"));
		querySuperDeviceGroupResponse.setCode(_ctx.stringValue("QuerySuperDeviceGroupResponse.Code"));
		querySuperDeviceGroupResponse.setErrorMessage(_ctx.stringValue("QuerySuperDeviceGroupResponse.ErrorMessage"));

		List<GroupInfo> dataList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("QuerySuperDeviceGroupResponse.Data.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupId(_ctx.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupName"));
			groupInfo.setGroupDesc(_ctx.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupDesc"));

			dataList.add(groupInfo);
		}
		querySuperDeviceGroupResponse.setData(dataList);
	 
	 	return querySuperDeviceGroupResponse;
	}
}