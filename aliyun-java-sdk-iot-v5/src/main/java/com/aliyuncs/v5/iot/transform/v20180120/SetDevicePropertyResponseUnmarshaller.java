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

import com.aliyuncs.v5.iot.model.v20180120.SetDevicePropertyResponse;
import com.aliyuncs.v5.iot.model.v20180120.SetDevicePropertyResponse.Data;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class SetDevicePropertyResponseUnmarshaller {

	public static SetDevicePropertyResponse unmarshall(SetDevicePropertyResponse setDevicePropertyResponse, UnmarshallerContext _ctx) {
		
		setDevicePropertyResponse.setRequestId(_ctx.stringValue("SetDevicePropertyResponse.RequestId"));
		setDevicePropertyResponse.setSuccess(_ctx.booleanValue("SetDevicePropertyResponse.Success"));
		setDevicePropertyResponse.setErrorMessage(_ctx.stringValue("SetDevicePropertyResponse.ErrorMessage"));
		setDevicePropertyResponse.setCode(_ctx.stringValue("SetDevicePropertyResponse.Code"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("SetDevicePropertyResponse.Data.MessageId"));
		setDevicePropertyResponse.setData(data);
	 
	 	return setDevicePropertyResponse;
	}
}