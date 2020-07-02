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

import com.aliyuncs.v5.dataworks_public.model.v20200518.CreateQualityEntityResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateQualityEntityResponseUnmarshaller {

	public static CreateQualityEntityResponse unmarshall(CreateQualityEntityResponse createQualityEntityResponse, UnmarshallerContext _ctx) {
		
		createQualityEntityResponse.setRequestId(_ctx.stringValue("CreateQualityEntityResponse.RequestId"));
		createQualityEntityResponse.setSuccess(_ctx.booleanValue("CreateQualityEntityResponse.Success"));
		createQualityEntityResponse.setData(_ctx.integerValue("CreateQualityEntityResponse.Data"));
		createQualityEntityResponse.setErrorCode(_ctx.stringValue("CreateQualityEntityResponse.ErrorCode"));
		createQualityEntityResponse.setErrorMessage(_ctx.stringValue("CreateQualityEntityResponse.ErrorMessage"));
		createQualityEntityResponse.setHttpStatusCode(_ctx.integerValue("CreateQualityEntityResponse.HttpStatusCode"));
	 
	 	return createQualityEntityResponse;
	}
}