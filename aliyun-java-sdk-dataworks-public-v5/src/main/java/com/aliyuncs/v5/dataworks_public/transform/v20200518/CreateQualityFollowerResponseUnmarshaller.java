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

import com.aliyuncs.v5.dataworks_public.model.v20200518.CreateQualityFollowerResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateQualityFollowerResponseUnmarshaller {

	public static CreateQualityFollowerResponse unmarshall(CreateQualityFollowerResponse createQualityFollowerResponse, UnmarshallerContext _ctx) {
		
		createQualityFollowerResponse.setRequestId(_ctx.stringValue("CreateQualityFollowerResponse.RequestId"));
		createQualityFollowerResponse.setErrorCode(_ctx.stringValue("CreateQualityFollowerResponse.ErrorCode"));
		createQualityFollowerResponse.setData(_ctx.integerValue("CreateQualityFollowerResponse.Data"));
		createQualityFollowerResponse.setSuccess(_ctx.booleanValue("CreateQualityFollowerResponse.Success"));
		createQualityFollowerResponse.setErrorMessage(_ctx.stringValue("CreateQualityFollowerResponse.ErrorMessage"));
		createQualityFollowerResponse.setHttpStatusCode(_ctx.integerValue("CreateQualityFollowerResponse.HttpStatusCode"));
	 
	 	return createQualityFollowerResponse;
	}
}