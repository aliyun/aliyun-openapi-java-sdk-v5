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

import com.aliyuncs.v5.dataworks_public.model.v20200518.CreateQualityRelativeNodeResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateQualityRelativeNodeResponseUnmarshaller {

	public static CreateQualityRelativeNodeResponse unmarshall(CreateQualityRelativeNodeResponse createQualityRelativeNodeResponse, UnmarshallerContext _ctx) {
		
		createQualityRelativeNodeResponse.setRequestId(_ctx.stringValue("CreateQualityRelativeNodeResponse.RequestId"));
		createQualityRelativeNodeResponse.setSuccess(_ctx.booleanValue("CreateQualityRelativeNodeResponse.Success"));
		createQualityRelativeNodeResponse.setErrorCode(_ctx.stringValue("CreateQualityRelativeNodeResponse.ErrorCode"));
		createQualityRelativeNodeResponse.setErrorMessage(_ctx.stringValue("CreateQualityRelativeNodeResponse.ErrorMessage"));
		createQualityRelativeNodeResponse.setHttpStatusCode(_ctx.integerValue("CreateQualityRelativeNodeResponse.HttpStatusCode"));
		createQualityRelativeNodeResponse.setData(_ctx.booleanValue("CreateQualityRelativeNodeResponse.Data"));
	 
	 	return createQualityRelativeNodeResponse;
	}
}