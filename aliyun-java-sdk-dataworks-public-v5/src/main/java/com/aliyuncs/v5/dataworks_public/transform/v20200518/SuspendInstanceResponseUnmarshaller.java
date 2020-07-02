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

import com.aliyuncs.v5.dataworks_public.model.v20200518.SuspendInstanceResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SuspendInstanceResponseUnmarshaller {

	public static SuspendInstanceResponse unmarshall(SuspendInstanceResponse suspendInstanceResponse, UnmarshallerContext _ctx) {
		
		suspendInstanceResponse.setRequestId(_ctx.stringValue("SuspendInstanceResponse.RequestId"));
		suspendInstanceResponse.setErrorCode(_ctx.stringValue("SuspendInstanceResponse.ErrorCode"));
		suspendInstanceResponse.setErrorMessage(_ctx.stringValue("SuspendInstanceResponse.ErrorMessage"));
		suspendInstanceResponse.setHttpStatusCode(_ctx.integerValue("SuspendInstanceResponse.HttpStatusCode"));
		suspendInstanceResponse.setSuccess(_ctx.booleanValue("SuspendInstanceResponse.Success"));
		suspendInstanceResponse.setData(_ctx.booleanValue("SuspendInstanceResponse.Data"));
	 
	 	return suspendInstanceResponse;
	}
}