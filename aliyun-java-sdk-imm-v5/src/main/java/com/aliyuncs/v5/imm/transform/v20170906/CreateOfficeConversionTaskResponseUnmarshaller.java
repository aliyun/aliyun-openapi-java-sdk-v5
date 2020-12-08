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

import com.aliyuncs.v5.imm.model.v20170906.CreateOfficeConversionTaskResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateOfficeConversionTaskResponseUnmarshaller {

	public static CreateOfficeConversionTaskResponse unmarshall(CreateOfficeConversionTaskResponse createOfficeConversionTaskResponse, UnmarshallerContext _ctx) {
		
		createOfficeConversionTaskResponse.setRequestId(_ctx.stringValue("CreateOfficeConversionTaskResponse.RequestId"));
		createOfficeConversionTaskResponse.setTaskId(_ctx.stringValue("CreateOfficeConversionTaskResponse.TaskId"));
		createOfficeConversionTaskResponse.setTgtLoc(_ctx.stringValue("CreateOfficeConversionTaskResponse.TgtLoc"));
		createOfficeConversionTaskResponse.setStatus(_ctx.stringValue("CreateOfficeConversionTaskResponse.Status"));
		createOfficeConversionTaskResponse.setCreateTime(_ctx.stringValue("CreateOfficeConversionTaskResponse.CreateTime"));
		createOfficeConversionTaskResponse.setPercent(_ctx.integerValue("CreateOfficeConversionTaskResponse.Percent"));
	 
	 	return createOfficeConversionTaskResponse;
	}
}