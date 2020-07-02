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

import com.aliyuncs.v5.dataworks_public.model.v20200518.SubmitFileResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SubmitFileResponseUnmarshaller {

	public static SubmitFileResponse unmarshall(SubmitFileResponse submitFileResponse, UnmarshallerContext _ctx) {
		
		submitFileResponse.setRequestId(_ctx.stringValue("SubmitFileResponse.RequestId"));
		submitFileResponse.setSuccess(_ctx.booleanValue("SubmitFileResponse.Success"));
		submitFileResponse.setErrorCode(_ctx.stringValue("SubmitFileResponse.ErrorCode"));
		submitFileResponse.setErrorMessage(_ctx.stringValue("SubmitFileResponse.ErrorMessage"));
		submitFileResponse.setData(_ctx.longValue("SubmitFileResponse.Data"));
		submitFileResponse.setHttpStatusCode(_ctx.integerValue("SubmitFileResponse.HttpStatusCode"));
	 
	 	return submitFileResponse;
	}
}