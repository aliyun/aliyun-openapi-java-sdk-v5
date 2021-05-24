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

package com.aliyuncs.v5.dts.transform.v20200101;

import com.aliyuncs.v5.dts.model.v20200101.ConfigureSubscriptionInstanceAlertResponse;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class ConfigureSubscriptionInstanceAlertResponseUnmarshaller {

	public static ConfigureSubscriptionInstanceAlertResponse unmarshall(ConfigureSubscriptionInstanceAlertResponse configureSubscriptionInstanceAlertResponse, UnmarshallerContext _ctx) {
		
		configureSubscriptionInstanceAlertResponse.setRequestId(_ctx.stringValue("ConfigureSubscriptionInstanceAlertResponse.RequestId"));
		configureSubscriptionInstanceAlertResponse.setErrCode(_ctx.stringValue("ConfigureSubscriptionInstanceAlertResponse.ErrCode"));
		configureSubscriptionInstanceAlertResponse.setErrMessage(_ctx.stringValue("ConfigureSubscriptionInstanceAlertResponse.ErrMessage"));
		configureSubscriptionInstanceAlertResponse.setSuccess(_ctx.stringValue("ConfigureSubscriptionInstanceAlertResponse.Success"));
	 
	 	return configureSubscriptionInstanceAlertResponse;
	}
}