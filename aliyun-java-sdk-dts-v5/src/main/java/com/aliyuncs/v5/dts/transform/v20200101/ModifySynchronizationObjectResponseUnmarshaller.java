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

package com.aliyuncs.v5.dts.transform.v20200101;

import com.aliyuncs.v5.dts.model.v20200101.ModifySynchronizationObjectResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ModifySynchronizationObjectResponseUnmarshaller {

	public static ModifySynchronizationObjectResponse unmarshall(ModifySynchronizationObjectResponse modifySynchronizationObjectResponse, UnmarshallerContext _ctx) {
		
		modifySynchronizationObjectResponse.setRequestId(_ctx.stringValue("ModifySynchronizationObjectResponse.RequestId"));
		modifySynchronizationObjectResponse.setErrCode(_ctx.stringValue("ModifySynchronizationObjectResponse.ErrCode"));
		modifySynchronizationObjectResponse.setErrMessage(_ctx.stringValue("ModifySynchronizationObjectResponse.ErrMessage"));
		modifySynchronizationObjectResponse.setSuccess(_ctx.stringValue("ModifySynchronizationObjectResponse.Success"));
		modifySynchronizationObjectResponse.setTaskId(_ctx.stringValue("ModifySynchronizationObjectResponse.TaskId"));
	 
	 	return modifySynchronizationObjectResponse;
	}
}