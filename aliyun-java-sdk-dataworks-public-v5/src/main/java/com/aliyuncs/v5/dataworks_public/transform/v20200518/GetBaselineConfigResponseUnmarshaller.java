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

import com.aliyuncs.v5.dataworks_public.model.v20200518.GetBaselineConfigResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.GetBaselineConfigResponse.Data;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetBaselineConfigResponseUnmarshaller {

	public static GetBaselineConfigResponse unmarshall(GetBaselineConfigResponse getBaselineConfigResponse, UnmarshallerContext _ctx) {
		
		getBaselineConfigResponse.setRequestId(_ctx.stringValue("GetBaselineConfigResponse.RequestId"));
		getBaselineConfigResponse.setSuccess(_ctx.booleanValue("GetBaselineConfigResponse.Success"));
		getBaselineConfigResponse.setErrorCode(_ctx.stringValue("GetBaselineConfigResponse.ErrorCode"));
		getBaselineConfigResponse.setErrorMessage(_ctx.stringValue("GetBaselineConfigResponse.ErrorMessage"));
		getBaselineConfigResponse.setHttpStatusCode(_ctx.integerValue("GetBaselineConfigResponse.HttpStatusCode"));

		Data data = new Data();
		data.setBaselineId(_ctx.longValue("GetBaselineConfigResponse.Data.BaselineId"));
		data.setPriority(_ctx.integerValue("GetBaselineConfigResponse.Data.Priority"));
		data.setBaselineName(_ctx.stringValue("GetBaselineConfigResponse.Data.BaselineName"));
		data.setOwner(_ctx.stringValue("GetBaselineConfigResponse.Data.Owner"));
		data.setProjectId(_ctx.longValue("GetBaselineConfigResponse.Data.ProjectId"));
		data.setUseFlag(_ctx.booleanValue("GetBaselineConfigResponse.Data.UseFlag"));
		data.setBaselineType(_ctx.stringValue("GetBaselineConfigResponse.Data.BaselineType"));
		data.setExpHour(_ctx.integerValue("GetBaselineConfigResponse.Data.ExpHour"));
		data.setExpMinu(_ctx.integerValue("GetBaselineConfigResponse.Data.ExpMinu"));
		data.setSlaHour(_ctx.integerValue("GetBaselineConfigResponse.Data.SlaHour"));
		data.setSlaMinu(_ctx.integerValue("GetBaselineConfigResponse.Data.SlaMinu"));
		data.setHourExpDetail(_ctx.stringValue("GetBaselineConfigResponse.Data.HourExpDetail"));
		data.setHourSlaDetail(_ctx.stringValue("GetBaselineConfigResponse.Data.HourSlaDetail"));
		data.setIsDefault(_ctx.booleanValue("GetBaselineConfigResponse.Data.IsDefault"));
		getBaselineConfigResponse.setData(data);
	 
	 	return getBaselineConfigResponse;
	}
}