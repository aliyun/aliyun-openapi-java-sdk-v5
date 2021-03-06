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

import com.aliyuncs.v5.aliyuncvc.model.v20191030.UpdateDeviceHeartBeatResponse;
import com.aliyuncs.v5.aliyuncvc.model.v20191030.UpdateDeviceHeartBeatResponse.DeviceInfo;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class UpdateDeviceHeartBeatResponseUnmarshaller {

	public static UpdateDeviceHeartBeatResponse unmarshall(UpdateDeviceHeartBeatResponse updateDeviceHeartBeatResponse, UnmarshallerContext _ctx) {
		
		updateDeviceHeartBeatResponse.setRequestId(_ctx.stringValue("UpdateDeviceHeartBeatResponse.RequestId"));
		updateDeviceHeartBeatResponse.setErrorCode(_ctx.integerValue("UpdateDeviceHeartBeatResponse.ErrorCode"));
		updateDeviceHeartBeatResponse.setMessage(_ctx.stringValue("UpdateDeviceHeartBeatResponse.Message"));
		updateDeviceHeartBeatResponse.setSuccess(_ctx.booleanValue("UpdateDeviceHeartBeatResponse.Success"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setChannelType(_ctx.stringValue("UpdateDeviceHeartBeatResponse.DeviceInfo.ChannelType"));
		updateDeviceHeartBeatResponse.setDeviceInfo(deviceInfo);
	 
	 	return updateDeviceHeartBeatResponse;
	}
}