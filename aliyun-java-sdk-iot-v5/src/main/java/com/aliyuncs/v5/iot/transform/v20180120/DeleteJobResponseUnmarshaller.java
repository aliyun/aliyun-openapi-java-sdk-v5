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

package com.aliyuncs.v5.iot.transform.v20180120;

import com.aliyuncs.v5.iot.model.v20180120.DeleteJobResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteJobResponseUnmarshaller {

	public static DeleteJobResponse unmarshall(DeleteJobResponse deleteJobResponse, UnmarshallerContext _ctx) {
		
		deleteJobResponse.setRequestId(_ctx.stringValue("DeleteJobResponse.RequestId"));
		deleteJobResponse.setSuccess(_ctx.booleanValue("DeleteJobResponse.Success"));
		deleteJobResponse.setCode(_ctx.stringValue("DeleteJobResponse.Code"));
		deleteJobResponse.setErrorMessage(_ctx.stringValue("DeleteJobResponse.ErrorMessage"));
	 
	 	return deleteJobResponse;
	}
}