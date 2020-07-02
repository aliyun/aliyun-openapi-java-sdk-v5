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

import com.aliyuncs.v5.dataworks_public.model.v20200518.ListCalcEnginesResponse;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListCalcEnginesResponse.Data;
import com.aliyuncs.v5.dataworks_public.model.v20200518.ListCalcEnginesResponse.Data.CalcEnginesItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ListCalcEnginesResponseUnmarshaller {

	public static ListCalcEnginesResponse unmarshall(ListCalcEnginesResponse listCalcEnginesResponse, UnmarshallerContext _ctx) {
		
		listCalcEnginesResponse.setRequestId(_ctx.stringValue("ListCalcEnginesResponse.RequestId"));
		listCalcEnginesResponse.setHttpStatusCode(_ctx.integerValue("ListCalcEnginesResponse.HttpStatusCode"));
		listCalcEnginesResponse.setSuccess(_ctx.booleanValue("ListCalcEnginesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCalcEnginesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCalcEnginesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCalcEnginesResponse.Data.TotalCount"));

		List<CalcEnginesItem> calcEnginesList = new ArrayList<CalcEnginesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCalcEnginesResponse.Data.CalcEngines.Length"); i++) {
			CalcEnginesItem calcEnginesItem = new CalcEnginesItem();
			calcEnginesItem.setCalcEngineType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].CalcEngineType"));
			calcEnginesItem.setGmtCreate(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].GmtCreate"));
			calcEnginesItem.setDwRegion(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].DwRegion"));
			calcEnginesItem.setIsDefault(_ctx.booleanValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].IsDefault"));
			calcEnginesItem.setBindingProjectId(_ctx.integerValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].BindingProjectId"));
			calcEnginesItem.setEnvType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EnvType"));
			calcEnginesItem.setTenantId(_ctx.longValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].TenantId"));
			calcEnginesItem.setName(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].Name"));
			calcEnginesItem.setBindingProjectName(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].BindingProjectName"));
			calcEnginesItem.setRegion(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].Region"));
			calcEnginesItem.setEngineId(_ctx.integerValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EngineId"));
			calcEnginesItem.setEngineInfo(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].EngineInfo"));
			calcEnginesItem.setTaskAuthType(_ctx.stringValue("ListCalcEnginesResponse.Data.CalcEngines["+ i +"].TaskAuthType"));

			calcEnginesList.add(calcEnginesItem);
		}
		data.setCalcEngines(calcEnginesList);
		listCalcEnginesResponse.setData(data);
	 
	 	return listCalcEnginesResponse;
	}
}