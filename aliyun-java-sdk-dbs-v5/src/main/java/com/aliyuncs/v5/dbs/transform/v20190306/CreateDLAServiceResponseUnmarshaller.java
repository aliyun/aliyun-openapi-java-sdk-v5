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

package com.aliyuncs.v5.dbs.transform.v20190306;

import com.aliyuncs.v5.dbs.model.v20190306.CreateDLAServiceResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class CreateDLAServiceResponseUnmarshaller {

	public static CreateDLAServiceResponse unmarshall(CreateDLAServiceResponse createDLAServiceResponse, UnmarshallerContext _ctx) {
		
		createDLAServiceResponse.setRequestId(_ctx.stringValue("CreateDLAServiceResponse.RequestId"));
		createDLAServiceResponse.setSuccess(_ctx.booleanValue("CreateDLAServiceResponse.Success"));
		createDLAServiceResponse.setErrCode(_ctx.stringValue("CreateDLAServiceResponse.ErrCode"));
		createDLAServiceResponse.setErrMessage(_ctx.stringValue("CreateDLAServiceResponse.ErrMessage"));
		createDLAServiceResponse.setHttpStatusCode(_ctx.integerValue("CreateDLAServiceResponse.HttpStatusCode"));
	 
	 	return createDLAServiceResponse;
	}
}