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

package com.aliyuncs.v5.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.dataworks_public.model.v20200518.GetNodeOnBaselineResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetNodeOnBaselineResponse.DataItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetNodeOnBaselineResponseUnmarshaller {

	public static GetNodeOnBaselineResponse unmarshall(GetNodeOnBaselineResponse getNodeOnBaselineResponse, UnmarshallerContext _ctx) {
		
		getNodeOnBaselineResponse.setRequestId(_ctx.stringValue("GetNodeOnBaselineResponse.RequestId"));
		getNodeOnBaselineResponse.setSuccess(_ctx.stringValue("GetNodeOnBaselineResponse.Success"));
		getNodeOnBaselineResponse.setErrorCode(_ctx.stringValue("GetNodeOnBaselineResponse.ErrorCode"));
		getNodeOnBaselineResponse.setErrorMessage(_ctx.stringValue("GetNodeOnBaselineResponse.ErrorMessage"));
		getNodeOnBaselineResponse.setHttpStatusCode(_ctx.integerValue("GetNodeOnBaselineResponse.HttpStatusCode"));

		List<DataItem> dataList = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNodeOnBaselineResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNodeId(_ctx.longValue("GetNodeOnBaselineResponse.Data["+ i +"].NodeId"));
			dataItem.setNodeName(_ctx.stringValue("GetNodeOnBaselineResponse.Data["+ i +"].NodeName"));
			dataItem.setOwner(_ctx.stringValue("GetNodeOnBaselineResponse.Data["+ i +"].Owner"));
			dataItem.setProjectId(_ctx.longValue("GetNodeOnBaselineResponse.Data["+ i +"].ProjectId"));

			dataList.add(dataItem);
		}
		getNodeOnBaselineResponse.setData(dataList);
	 
	 	return getNodeOnBaselineResponse;
	}
}