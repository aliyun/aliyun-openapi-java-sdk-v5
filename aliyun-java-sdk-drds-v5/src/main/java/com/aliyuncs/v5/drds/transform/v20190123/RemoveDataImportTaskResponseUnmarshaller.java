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

import com.aliyuncs.v5.drds.model.v20190123.RemoveDataImportTaskResponse;
import com.aliyuncs.v5.drds.model.v20190123.RemoveDataImportTaskResponse.TaskManageResult;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class RemoveDataImportTaskResponseUnmarshaller {

	public static RemoveDataImportTaskResponse unmarshall(RemoveDataImportTaskResponse removeDataImportTaskResponse, UnmarshallerContext _ctx) {
		
		removeDataImportTaskResponse.setRequestId(_ctx.stringValue("RemoveDataImportTaskResponse.RequestId"));
		removeDataImportTaskResponse.setSuccess(_ctx.booleanValue("RemoveDataImportTaskResponse.Success"));

		TaskManageResult taskManageResult = new TaskManageResult();
		taskManageResult.setSuccess(_ctx.booleanValue("RemoveDataImportTaskResponse.TaskManageResult.Success"));
		taskManageResult.setMessage(_ctx.stringValue("RemoveDataImportTaskResponse.TaskManageResult.Message"));
		removeDataImportTaskResponse.setTaskManageResult(taskManageResult);
	 
	 	return removeDataImportTaskResponse;
	}
}