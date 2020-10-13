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

import com.aliyuncs.v5.iot.model.v20180120.QueryDetailSceneRuleLogResponse;
import com.aliyuncs.v5.iot.model.v20180120.QueryDetailSceneRuleLogResponse.Data;
import com.aliyuncs.v5.iot.model.v20180120.QueryDetailSceneRuleLogResponse.Data.LogInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class QueryDetailSceneRuleLogResponseUnmarshaller {

	public static QueryDetailSceneRuleLogResponse unmarshall(QueryDetailSceneRuleLogResponse queryDetailSceneRuleLogResponse, UnmarshallerContext _ctx) {
		
		queryDetailSceneRuleLogResponse.setRequestId(_ctx.stringValue("QueryDetailSceneRuleLogResponse.RequestId"));
		queryDetailSceneRuleLogResponse.setSuccess(_ctx.booleanValue("QueryDetailSceneRuleLogResponse.Success"));
		queryDetailSceneRuleLogResponse.setErrorMessage(_ctx.stringValue("QueryDetailSceneRuleLogResponse.ErrorMessage"));
		queryDetailSceneRuleLogResponse.setCode(_ctx.stringValue("QueryDetailSceneRuleLogResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDetailSceneRuleLogResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryDetailSceneRuleLogResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryDetailSceneRuleLogResponse.Data.CurrentPage"));

		List<LogInfo> logListList = new ArrayList<LogInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDetailSceneRuleLogResponse.Data.LogList.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setCode(_ctx.stringValue("QueryDetailSceneRuleLogResponse.Data.LogList["+ i +"].Code"));
			logInfo.setMessage(_ctx.stringValue("QueryDetailSceneRuleLogResponse.Data.LogList["+ i +"].Message"));
			logInfo.setPkDn(_ctx.stringValue("QueryDetailSceneRuleLogResponse.Data.LogList["+ i +"].PkDn"));

			logListList.add(logInfo);
		}
		data.setLogList(logListList);
		queryDetailSceneRuleLogResponse.setData(data);
	 
	 	return queryDetailSceneRuleLogResponse;
	}
}