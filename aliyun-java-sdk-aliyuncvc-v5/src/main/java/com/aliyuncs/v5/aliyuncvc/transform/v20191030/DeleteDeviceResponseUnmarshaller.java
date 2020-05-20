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

package com.aliyuncs.v5.aliyuncvc.transform.v20191030;

import com.aliyuncs.v5.aliyuncvc.model.v20191030.DeleteDeviceResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class DeleteDeviceResponseUnmarshaller {

	public static DeleteDeviceResponse unmarshall(DeleteDeviceResponse deleteDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteDeviceResponse.setRequestId(_ctx.stringValue("DeleteDeviceResponse.RequestId"));
		deleteDeviceResponse.setErrorCode(_ctx.integerValue("DeleteDeviceResponse.ErrorCode"));
		deleteDeviceResponse.setMessage(_ctx.stringValue("DeleteDeviceResponse.Message"));
		deleteDeviceResponse.setSuccess(_ctx.booleanValue("DeleteDeviceResponse.Success"));
	 
	 	return deleteDeviceResponse;
	}
}