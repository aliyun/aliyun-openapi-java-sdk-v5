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

import com.aliyuncs.v5.dataworks_public.model.v20200518.CreateUdfFileResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateUdfFileResponseUnmarshaller {

	public static CreateUdfFileResponse unmarshall(CreateUdfFileResponse createUdfFileResponse, UnmarshallerContext _ctx) {
		
		createUdfFileResponse.setRequestId(_ctx.stringValue("CreateUdfFileResponse.RequestId"));
		createUdfFileResponse.setSuccess(_ctx.booleanValue("CreateUdfFileResponse.Success"));
		createUdfFileResponse.setErrorCode(_ctx.stringValue("CreateUdfFileResponse.ErrorCode"));
		createUdfFileResponse.setErrorMessage(_ctx.stringValue("CreateUdfFileResponse.ErrorMessage"));
		createUdfFileResponse.setData(_ctx.longValue("CreateUdfFileResponse.Data"));
		createUdfFileResponse.setHttpStatusCode(_ctx.integerValue("CreateUdfFileResponse.HttpStatusCode"));
	 
	 	return createUdfFileResponse;
	}
}