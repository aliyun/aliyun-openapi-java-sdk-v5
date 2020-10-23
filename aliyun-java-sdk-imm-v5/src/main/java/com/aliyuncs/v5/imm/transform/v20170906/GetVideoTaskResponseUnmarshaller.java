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

package com.aliyuncs.v5.imm.transform.v20170906;

import com.aliyuncs.v5.imm.model.v20170906.GetVideoTaskResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetVideoTaskResponseUnmarshaller {

	public static GetVideoTaskResponse unmarshall(GetVideoTaskResponse getVideoTaskResponse, UnmarshallerContext _ctx) {
		
		getVideoTaskResponse.setRequestId(_ctx.stringValue("GetVideoTaskResponse.RequestId"));
		getVideoTaskResponse.setTaskId(_ctx.stringValue("GetVideoTaskResponse.TaskId"));
		getVideoTaskResponse.setTaskType(_ctx.stringValue("GetVideoTaskResponse.TaskType"));
		getVideoTaskResponse.setParameters(_ctx.stringValue("GetVideoTaskResponse.Parameters"));
		getVideoTaskResponse.setResult(_ctx.stringValue("GetVideoTaskResponse.Result"));
		getVideoTaskResponse.setStatus(_ctx.stringValue("GetVideoTaskResponse.Status"));
		getVideoTaskResponse.setStartTime(_ctx.stringValue("GetVideoTaskResponse.StartTime"));
		getVideoTaskResponse.setEndTime(_ctx.stringValue("GetVideoTaskResponse.EndTime"));
		getVideoTaskResponse.setErrorMessage(_ctx.stringValue("GetVideoTaskResponse.ErrorMessage"));
		getVideoTaskResponse.setNotifyEndpoint(_ctx.stringValue("GetVideoTaskResponse.NotifyEndpoint"));
		getVideoTaskResponse.setNotifyTopicName(_ctx.stringValue("GetVideoTaskResponse.NotifyTopicName"));
		getVideoTaskResponse.setProgress(_ctx.integerValue("GetVideoTaskResponse.Progress"));
	 
	 	return getVideoTaskResponse;
	}
}